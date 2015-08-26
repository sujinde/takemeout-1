package org.sujinde.takemeout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import bean.SpotListBean;
import bean.ViewSpotDetailBean;

public class DiscoverActivity extends ActionBarActivity {

    final static String GetSpotListTask = "GetSpotListTask";
    final static String GetViewSpotDetailTask = "GetViewSpotDetailTask";

    String httpUrlQueryDatail = "http://apis.baidu.com/apistore/qunaerticket/querydetail";
    String httpUrlQueryList = "http://apis.baidu.com/apistore/qunaerticket/querylist";
    String httpArgList = "pageno=1&pagesize=10";

    //    StringBuilder ticketListStringBuilder =new StringBuilder();

    ArrayList<String> spotTicketList = new ArrayList<String>();
    ArrayList<String> spotThumbnailUrl = new ArrayList<String>();
    ArrayList<Bitmap> spotThumbnail = new ArrayList<Bitmap>();

    ImageView ivSerch;
    EditText edtSearch;
    ImageButton imgSearch;
    ListView lvDiscover;
    ImageView iv_discover_item;

    ArrayList<HashMap<String, Object>> dataList = null;
    ArrayList<String> spotTitleList = new ArrayList<String>();

    Bitmap bitmap = BitmapFactory.decodeResource(null, R.drawable.fail);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        //初始化控件
        initViews();

        //要先启动获得景点Id的任务
        new GetSpotListTask().execute(httpArgList);

        //填充列表
        //initListView();
    }

    void initViews() {
        ivSerch = (ImageView) findViewById(R.id.ivSearch);
        edtSearch = (EditText) findViewById(R.id.edtSearch);
        imgSearch = (ImageButton) findViewById(R.id.imgSearch);
        lvDiscover = (ListView) findViewById(R.id.lvDiscover);

        ImageView iv_discover_item = (ImageView) findViewById(R.id.iv_discover_item);


    }


    void initListView() {
        Log.d("initListView", "initListView--" + "spotTitleList.size   " + spotTitleList.size() + "\nspotThumbnail:  " + spotThumbnail.size());
        dataList = new ArrayList<HashMap<String, Object>>();
        if (spotTitleList.size() > 0 && spotThumbnail.size() > 0) {
            for (int i = 0; i < spotThumbnail.size(); i++) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("viewPhoto", spotThumbnail.get(i));
//                hashMap.put("viewPhoto", spotThumbnail.get(i));
                hashMap.put("title", spotTitleList.get(i));
                dataList.add(hashMap);
            }
            SimpleAdapter simpleAdapter = new SimpleAdapter(DiscoverActivity.this,
                    dataList,
                    R.layout.discover_item,
                    new String[]{"viewPhoto", "title"},
                    new int[]{R.id.iv_discover_item, R.id.tvTitle});

            simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() {
                @Override
                public boolean setViewValue(View view, Object data, String textRepresentation) {
                    if (view instanceof ImageView && data instanceof Bitmap) {
                        ImageView imageView = (ImageView) view;
                        imageView.setImageBitmap((Bitmap) data);
                        return true;
                    }
                    return false;
                }
            });

            lvDiscover.setAdapter(simpleAdapter);
        } else {
            Log.d("initListView", "initListView--End    " + "spotTitleList.size   " + spotTitleList.size() + "\nspotThumbnail.size :  " + spotThumbnail.size());
        }

    }

    class GetViewSpotDetailTask extends AsyncTask<ArrayList<String>, Void, ArrayList<String>> {
        //一个景点信息

        //包含了查询到的所有景点的信息的数组列表


        @Override
        protected ArrayList<String> doInBackground(ArrayList<String>... params) {
            ArrayList<String> results = new ArrayList<String>();
            for (int i = 0; i < params[0].size(); i++) {
                //以每一个门票的产品Id来查询
                String result = request(httpUrlQueryDatail, "id=" + params[0].get(i));
                Log.d("Fuck", i + "    " + result);
                results.add(result);

            }
            for (int i = 0; i < results.size(); i++) {
                Log.d("BigFcuk", i + "---BigFuck" + results.get(i));
            }
            return results;
        }

        //把字符串处理成Bean
        @Override
        protected void onPostExecute(ArrayList<String> strings) {

            //用于临时储存一个viewSpotDetailBeans
            ArrayList<ViewSpotDetailBean> viewSpotDetailBeans = new ArrayList<ViewSpotDetailBean>();
            ViewSpotDetailBean viewSpotDetailBean = new ViewSpotDetailBean();
            Gson gson = new Gson();
            for (int i = 0; i < strings.size(); i++) {
                Log.d("GreatFuck", i + "   " + strings.get(i));
                try {
                    viewSpotDetailBean = gson.fromJson(strings.get(i), ViewSpotDetailBean.class);
                    viewSpotDetailBeans.add(viewSpotDetailBean);
                    Log.d("BeanFuck", i + "   " + viewSpotDetailBean.toString());
                } catch (Exception e) {
                    Log.d("HolyFuck", i + "   is a sb");
                }
            }
            showFace(viewSpotDetailBeans);
        }
    }

    void showFace(ArrayList<ViewSpotDetailBean> viewSpotDetailBeans) {

        for (int i = 0; i < viewSpotDetailBeans.size(); i++) {
            ViewSpotDetailBean.RetDataEntity.TicketDetailEntity.DataEntity.DisplayEntity.TicketEntity ticketEntity =
                    viewSpotDetailBeans.get(i).getRetData().getTicketDetail().getData().getDisplay().getTicket();
            //已经把数据扔进去l
            spotTitleList.add(ticketEntity.getSpotName());
            spotThumbnailUrl.add(ticketEntity.getImageUrl());
        }
        for (int i = 0; i < viewSpotDetailBeans.size(); i++) {
            Log.d("SpotName", i + "   " + spotTitleList.get(i) + "          ");
            Log.d("ImageUrl", i + "    " + spotThumbnailUrl.get(i) + "          ");
        }

        new GetImageTask().execute(spotThumbnailUrl);

    }

    class GetImageTask extends AsyncTask<ArrayList<String>, Void, ArrayList<Bitmap>> {

        @Override
        protected ArrayList<Bitmap> doInBackground(ArrayList<String>... params) {
            int size = params[0].size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    Bitmap bitmap = loadBitmap(params[0].get(i));
                    if (null != bitmap) {
                        spotThumbnail.add(bitmap);
                        Log.d("fuck", "spotThumbnail.size  " + spotThumbnail.size());
                    }
                }
            }
            return spotThumbnail;
        }

        @Override
        protected void onPostExecute(ArrayList<Bitmap> drawables) {
            super.onPostExecute(drawables);
            initListView();
        }

    }

    Bitmap loadBitmap(String imageUrl) {
        Bitmap bitmap = null;
        HttpURLConnection connection = null;
        URL url=null;
        try {
            url = new URL(imageUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(10000);
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != connection) {
                connection.disconnect();
            }
        }
        return bitmap;
    }

    public void getImage(ArrayList<String> spotThumbnailUrl) {
        RequestQueue requestQueue = Volley.newRequestQueue(DiscoverActivity.this);
        Log.d("getImage", "  spotThumbnailUrl.size " + Integer.toString(spotThumbnailUrl.size()));
        for (int i = 0; i < spotThumbnailUrl.size(); i++) {
            ImageRequest imageRequest = new ImageRequest(spotThumbnailUrl.get(i),
                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            ivSerch.setImageBitmap(bitmap);

                        }
                    },
                    200,
                    160,
                    Bitmap.Config.ARGB_8888,
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError volleyError) {
                            ivSerch.setImageDrawable(getResources().getDrawable(R.drawable.fail));
                        }
                    });
            requestQueue.add(imageRequest);
            Log.d("getImage", "After :: " + spotThumbnail.size());
        }


    }

    class BitmapCache implements ImageLoader.ImageCache {
        private LruCache<String, Bitmap> lruCache;

        public BitmapCache() {
            int maxSize = 10 * 1024 * 1024;
            lruCache = new LruCache<String, Bitmap>(maxSize) {
                @Override
                protected int sizeOf(String key, Bitmap value) {
                    return value.getRowBytes() * value.getHeight();
                }
            };
        }

        @Override
        public Bitmap getBitmap(String s) {
            return lruCache.get(s);
        }

        @Override
        public void putBitmap(String s, Bitmap bitmap) {
            lruCache.put(s, bitmap);
        }
    }

    class GetSpotListTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String result = request(httpUrlQueryList, params[0]);
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //如果返回的景点列表字符串不为空
            if (!TextUtils.isEmpty(s)) {
                Gson gson = new Gson();
                SpotListBean spotListBean = gson.fromJson(s, SpotListBean.class);

//                if (!TextUtils.isEmpty(spotListBean.toString())) {
//                    Log.d(GetSpotListTask, "spotListBean: \n" + spotListBean.toString());
//                } else {
//                    Log.d(GetSpotListTask, "spotListBean is null");
//                }

                List<SpotListBean.RetDataEntity.TicketListEntity> ticketListEntities = spotListBean.getRetData().getTicketList();

                for (int i = 0; i < spotListBean.getRetData().getPageSize(); i++) {
                    spotTicketList.add(ticketListEntities.get(i).getProductId());
                }

//                if (!TextUtils.isEmpty(spotTicketList.toString())) {
//                    Log.d(GetSpotListTask, "ticketListStringBuilder :" + spotTicketList.toString());
//                } else {
//                    Log.d(GetSpotListTask, "ticketListStringBuilder is null");
//                }
                //获得一堆Id放在全局变量里面再启动获得景点详情的任务
                new GetViewSpotDetailTask().execute(spotTicketList);
            }
        }
    }

    /**
     * //     * @param urlAll
     * :请求接口
     *
     * @param httpArg :参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;
        Log.d("In request", httpUrl);
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            // 填入apikey到HTTP header
            connection.setRequestProperty("apikey", "516091aa2cc0e62c0303a1723b0f1912");
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_discover, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        
        return super.onOptionsItemSelected(item);
    }
}
