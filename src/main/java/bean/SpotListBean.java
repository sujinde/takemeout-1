package bean;

import java.util.List;

/**
 * Created by SuJinde on 2015/8/24.
 * Email: sujinde168@foxmail.com
 */
public class SpotListBean {

    @Override
    public String toString() {
        return "SpotListBean{" +
                "errNum=" + errNum +
                ", errMsg='" + errMsg + '\'' +
                ", retData=" + retData +
                '}';
    }

    /**
     * errNum : 0
     * errMsg : success
     * retData : {"ticketList":[{"spotName":"白云温泉山庄","spotAliasName":["佛冈白云温泉山庄"],"productId":"1361653183"},{"spotName":"翠郊古民居","spotAliasName":["洋里民居","翠郊大厝"],"productId":"1456761443"},{"spotName":"巅峰真人CS（台东榉林山店）","productId":"2999061498"},{"spotName":"钱苑食府（原赖家鱼庄）","productId":"1863633693"},{"spotName":"中国竹艺城","spotAliasName":["眉山中国竹艺城"],"productId":"2658704957"},{"spotName":"绩溪紫园","spotAliasName":["绩溪县紫园景区"],"productId":"3389426041"},{"spotName":"鱼尾狮公园","spotAliasName":["鱼尾狮像"],"productId":"387217385"},{"spotName":"聪明山水景区","productId":"821183158"},{"spotName":"古月美容美体","productId":"1638803175"},{"spotName":"石表山景区","spotAliasName":["广西梧州石表山休闲旅游风景区"],"productId":"963696135"},{"spotName":"蓝水河漂流","spotAliasName":["蓝水河"],"productId":"923010086"},{"spotName":"Mamma烘焙工作室","productId":"3507297852"},{"spotName":"百丈崖","spotAliasName":["百丈崖景区"],"productId":"2482300975"},{"spotName":"目连山","spotAliasName":["目莲山","目连会","安徽目连山森林公园大峡谷景区"],"productId":"83331249"},{"spotName":"道名会跆拳道（珠峰1号校区店）","productId":"2881706835"},{"spotName":"白浪花漂流","spotAliasName":["浪花漂流中心"],"productId":"353935473"},{"spotName":"田园牧歌","spotAliasName":["田园牧歌生态旅游渡假村"],"productId":"563299896"},{"spotName":"南京阅江楼","spotAliasName":["阅江楼景区"],"productId":"65647061"},{"spotName":"苏州海洋馆","spotAliasName":["苏州吴中海洋馆","吴中海洋馆"],"productId":"1097804797"},{"spotName":"绿林寨","spotAliasName":["绿林寨","绿林古兵寨","荆门大洪山绿林寨"],"productId":"3827176217"}],"pageNo":1,"pageSize":20,"totalRecord":12699}
     */
    private int errNum;
    private String errMsg;
    private RetDataEntity retData;

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setRetData(RetDataEntity retData) {
        this.retData = retData;
    }

    public int getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public RetDataEntity getRetData() {
        return retData;
    }

    public static class RetDataEntity {
        /**
         * ticketList : [{"spotName":"白云温泉山庄","spotAliasName":["佛冈白云温泉山庄"],"productId":"1361653183"},{"spotName":"翠郊古民居","spotAliasName":["洋里民居","翠郊大厝"],"productId":"1456761443"},{"spotName":"巅峰真人CS（台东榉林山店）","productId":"2999061498"},{"spotName":"钱苑食府（原赖家鱼庄）","productId":"1863633693"},{"spotName":"中国竹艺城","spotAliasName":["眉山中国竹艺城"],"productId":"2658704957"},{"spotName":"绩溪紫园","spotAliasName":["绩溪县紫园景区"],"productId":"3389426041"},{"spotName":"鱼尾狮公园","spotAliasName":["鱼尾狮像"],"productId":"387217385"},{"spotName":"聪明山水景区","productId":"821183158"},{"spotName":"古月美容美体","productId":"1638803175"},{"spotName":"石表山景区","spotAliasName":["广西梧州石表山休闲旅游风景区"],"productId":"963696135"},{"spotName":"蓝水河漂流","spotAliasName":["蓝水河"],"productId":"923010086"},{"spotName":"Mamma烘焙工作室","productId":"3507297852"},{"spotName":"百丈崖","spotAliasName":["百丈崖景区"],"productId":"2482300975"},{"spotName":"目连山","spotAliasName":["目莲山","目连会","安徽目连山森林公园大峡谷景区"],"productId":"83331249"},{"spotName":"道名会跆拳道（珠峰1号校区店）","productId":"2881706835"},{"spotName":"白浪花漂流","spotAliasName":["浪花漂流中心"],"productId":"353935473"},{"spotName":"田园牧歌","spotAliasName":["田园牧歌生态旅游渡假村"],"productId":"563299896"},{"spotName":"南京阅江楼","spotAliasName":["阅江楼景区"],"productId":"65647061"},{"spotName":"苏州海洋馆","spotAliasName":["苏州吴中海洋馆","吴中海洋馆"],"productId":"1097804797"},{"spotName":"绿林寨","spotAliasName":["绿林寨","绿林古兵寨","荆门大洪山绿林寨"],"productId":"3827176217"}]
         * pageNo : 1
         * pageSize : 20
         * totalRecord : 12699
         */
        private List<TicketListEntity> ticketList;
        private int pageNo;
        private int pageSize;
        private int totalRecord;

        public void setTicketList(List<TicketListEntity> ticketList) {
            this.ticketList = ticketList;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public void setTotalRecord(int totalRecord) {
            this.totalRecord = totalRecord;
        }

        public List<TicketListEntity> getTicketList() {
            return ticketList;
        }

        public int getPageNo() {
            return pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public int getTotalRecord() {
            return totalRecord;
        }

        @Override
        public String toString() {
            return "RetDataEntity{" +
                    "ticketList=" + ticketList +
                    ", pageNo=" + pageNo +
                    ", pageSize=" + pageSize +
                    ", totalRecord=" + totalRecord +
                    '}';
        }

        public static class TicketListEntity {
            /**
             * spotName : 白云温泉山庄
             * spotAliasName : ["佛冈白云温泉山庄"]
             * productId : 1361653183
             */
            private String spotName;
            private List<String> spotAliasName;
            private String productId;

            public void setSpotName(String spotName) {
                this.spotName = spotName;
            }

            public void setSpotAliasName(List<String> spotAliasName) {
                this.spotAliasName = spotAliasName;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public String getSpotName() {
                return spotName;
            }

            public List<String> getSpotAliasName() {
                return spotAliasName;
            }

            public String getProductId() {
                return productId;
            }

            @Override
            public String toString() {
                return "TicketListEntity{" +
                        "spotName='" + spotName + '\'' +
                        ", spotAliasName=" + spotAliasName +
                        ", productId='" + productId + '\'' +
                        '}';
            }
        }
    }
}
