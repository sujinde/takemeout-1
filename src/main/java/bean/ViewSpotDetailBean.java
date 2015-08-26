package bean;

import java.util.List;

/**
 * Created by SuJinde on 2015/8/24.
 * Email: sujinde168@foxmail.com
 */
public class ViewSpotDetailBean {


    /**
     * errNum : 0
     * errMsg : success
     * retData : {"ticketDetail":{"priority":"1.0","changefreq":"hourly","data":{"display":{"category":"lvyou","source":"去哪儿门票","ticket":{"detailUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","imageUrl":"http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","address":"山东省青岛市市北区榉林山公园内","spotName":"巅峰真人CS（台东榉林山店）","province":"山东","priceList":[{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}],"spotID":"qn_451479","comments":"0","city":"青岛"},"subcate":"ticket"}},"loc":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","lastmod":"2015-08-25"},"id":"2999061498"}
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

    @Override
    public String toString() {
        return "ViewSpotDetailBean{" +
                "errNum=" + errNum +
                ", errMsg='" + errMsg + '\'' +
                ", retData=" + retData +
                '}';
    }

    public static class RetDataEntity {

        /**
         * ticketDetail : {"priority":"1.0","changefreq":"hourly","data":{"display":{"category":"lvyou","source":"去哪儿门票","ticket":{"detailUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","imageUrl":"http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","address":"山东省青岛市市北区榉林山公园内","spotName":"巅峰真人CS（台东榉林山店）","province":"山东","priceList":[{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}],"spotID":"qn_451479","comments":"0","city":"青岛"},"subcate":"ticket"}},"loc":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","lastmod":"2015-08-25"}
         * id : 2999061498
         */
        private TicketDetailEntity ticketDetail;
        private String id;

        public void setTicketDetail(TicketDetailEntity ticketDetail) {
            this.ticketDetail = ticketDetail;
        }

        public void setId(String id) {
            this.id = id;
        }

        public TicketDetailEntity getTicketDetail() {
            return ticketDetail;
        }

        @Override
        public String toString() {
            return "RetDataEntity{" +
                    "ticketDetail=" + ticketDetail +
                    ", id='" + id + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public static class TicketDetailEntity {
            @Override
            public String toString() {
                return "TicketDetailEntity{" +
                        "priority='" + priority + '\'' +
                        ", changefreq='" + changefreq + '\'' +
                        ", data=" + data +
                        ", loc='" + loc + '\'' +
                        ", lastmod='" + lastmod + '\'' +
                        '}';
            }

            /**
             * priority : 1.0
             * changefreq : hourly
             * data : {"display":{"category":"lvyou","source":"去哪儿门票","ticket":{"detailUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","imageUrl":"http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","address":"山东省青岛市市北区榉林山公园内","spotName":"巅峰真人CS（台东榉林山店）","province":"山东","priceList":[{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}],"spotID":"qn_451479","comments":"0","city":"青岛"},"subcate":"ticket"}}
             * loc : http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912
             * lastmod : 2015-08-25
             */
            private String priority;
            private String changefreq;
            private DataEntity data;
            private String loc;
            private String lastmod;

            public void setPriority(String priority) {
                this.priority = priority;
            }

            public void setChangefreq(String changefreq) {
                this.changefreq = changefreq;
            }

            public void setData(DataEntity data) {
                this.data = data;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public void setLastmod(String lastmod) {
                this.lastmod = lastmod;
            }

            public String getPriority() {
                return priority;
            }

            public String getChangefreq() {
                return changefreq;
            }

            public DataEntity getData() {
                return data;
            }

            public String getLoc() {
                return loc;
            }

            public String getLastmod() {
                return lastmod;
            }

            public static class DataEntity {
                @Override
                public String toString() {
                    return "DataEntity{" +
                            "display=" + display +
                            '}';
                }

                /**
                 * display : {"category":"lvyou","source":"去哪儿门票","ticket":{"detailUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","imageUrl":"http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","address":"山东省青岛市市北区榉林山公园内","spotName":"巅峰真人CS（台东榉林山店）","province":"山东","priceList":[{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}],"spotID":"qn_451479","comments":"0","city":"青岛"},"subcate":"ticket"}
                 */
                private DisplayEntity display;

                public void setDisplay(DisplayEntity display) {
                    this.display = display;
                }

                public DisplayEntity getDisplay() {
                    return display;
                }

                public static class DisplayEntity {
                    @Override
                    public String toString() {
                        return "DisplayEntity{" +
                                "category='" + category + '\'' +
                                ", source='" + source + '\'' +
                                ", ticket=" + ticket +
                                ", subcate='" + subcate + '\'' +
                                '}';
                    }

                    /**
                     * category : lvyou
                     * source : 去哪儿门票
                     * ticket : {"detailUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","imageUrl":"http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","address":"山东省青岛市市北区榉林山公园内","spotName":"巅峰真人CS（台东榉林山店）","province":"山东","priceList":[{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}],"spotID":"qn_451479","comments":"0","city":"青岛"}
                     * subcate : ticket
                     */
                    private String category;
                    private String source;
                    private TicketEntity ticket;
                    private String subcate;

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public void setTicket(TicketEntity ticket) {
                        this.ticket = ticket;
                    }

                    public void setSubcate(String subcate) {
                        this.subcate = subcate;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public String getSource() {
                        return source;
                    }

                    public TicketEntity getTicket() {
                        return ticket;
                    }

                    public String getSubcate() {
                        return subcate;
                    }

                    public static class TicketEntity {
                        @Override
                        public String toString() {
                            return "TicketEntity{" +
                                    "detailUrl='" + detailUrl + '\'' +
                                    ", imageUrl='" + imageUrl + '\'' +
                                    ", address='" + address + '\'' +
                                    ", spotName='" + spotName + '\'' +
                                    ", province='" + province + '\'' +
                                    ", priceList=" + priceList +
                                    ", spotID='" + spotID + '\'' +
                                    ", comments='" + comments + '\'' +
                                    ", city='" + city + '\'' +
                                    '}';
                        }

                        /**
                         * detailUrl : http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912
                         * imageUrl : http://img1.qunarzz.com/tuan/team2/1507/6d/ffde8b1de6d2b5.jpg?bd_ref_id=516091aa2cc0e62c0303a1723b0f1912
                         * address : 山东省青岛市市北区榉林山公园内
                         * spotName : 巅峰真人CS（台东榉林山店）
                         * province : 山东
                         * priceList : [{"num":"-1","price":"60","ticketID":"165255","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"129","ticketTitle":"巅峰军用高仿真人CS套餐1人"},{"num":"-1","price":"39","ticketID":"165222","bookUrl":"http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165222&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912","priceType":"0","type":"0","normalPrice":"60","ticketTitle":"巅峰猎豹真人CS套餐1人"}]
                         * spotID : qn_451479
                         * comments : 0
                         * city : 青岛
                         */
                        private String detailUrl;
                        private String imageUrl;
                        private String address;
                        private String spotName;
                        private String province;
                        private List<PriceListEntity> priceList;
                        private String spotID;
                        private String comments;
                        private String city;

                        public void setDetailUrl(String detailUrl) {
                            this.detailUrl = detailUrl;
                        }

                        public void setImageUrl(String imageUrl) {
                            this.imageUrl = imageUrl;
                        }

                        public void setAddress(String address) {
                            this.address = address;
                        }

                        public void setSpotName(String spotName) {
                            this.spotName = spotName;
                        }

                        public void setProvince(String province) {
                            this.province = province;
                        }

                        public void setPriceList(List<PriceListEntity> priceList) {
                            this.priceList = priceList;
                        }

                        public void setSpotID(String spotID) {
                            this.spotID = spotID;
                        }

                        public void setComments(String comments) {
                            this.comments = comments;
                        }

                        public void setCity(String city) {
                            this.city = city;
                        }

                        public String getDetailUrl() {
                            return detailUrl;
                        }

                        public String getImageUrl() {
                            return imageUrl;
                        }

                        public String getAddress() {
                            return address;
                        }

                        public String getSpotName() {
                            return spotName;
                        }

                        public String getProvince() {
                            return province;
                        }

                        public List<PriceListEntity> getPriceList() {
                            return priceList;
                        }

                        public String getSpotID() {
                            return spotID;
                        }

                        public String getComments() {
                            return comments;
                        }

                        public String getCity() {
                            return city;
                        }

                        public static class PriceListEntity {
                            @Override
                            public String toString() {
                                return "PriceListEntity{" +
                                        "num='" + num + '\'' +
                                        ", price='" + price + '\'' +
                                        ", ticketID='" + ticketID + '\'' +
                                        ", bookUrl='" + bookUrl + '\'' +
                                        ", priceType='" + priceType + '\'' +
                                        ", type='" + type + '\'' +
                                        ", normalPrice='" + normalPrice + '\'' +
                                        ", ticketTitle='" + ticketTitle + '\'' +
                                        '}';
                            }

                            /**
                             * num : -1
                             * price : 60
                             * ticketID : 165255
                             * bookUrl : http://touch.piao.qunar.com/touch/detail.htm?id=2999061498&tid=165255&ex_track=bd_apistore_menpiao_detail&bd_ref_id=516091aa2cc0e62c0303a1723b0f1912
                             * priceType : 0
                             * type : 0
                             * normalPrice : 129
                             * ticketTitle : 巅峰军用高仿真人CS套餐1人
                             */
                            private String num;
                            private String price;
                            private String ticketID;
                            private String bookUrl;
                            private String priceType;
                            private String type;
                            private String normalPrice;
                            private String ticketTitle;

                            public void setNum(String num) {
                                this.num = num;
                            }

                            public void setPrice(String price) {
                                this.price = price;
                            }

                            public void setTicketID(String ticketID) {
                                this.ticketID = ticketID;
                            }

                            public void setBookUrl(String bookUrl) {
                                this.bookUrl = bookUrl;
                            }

                            public void setPriceType(String priceType) {
                                this.priceType = priceType;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public void setNormalPrice(String normalPrice) {
                                this.normalPrice = normalPrice;
                            }

                            public void setTicketTitle(String ticketTitle) {
                                this.ticketTitle = ticketTitle;
                            }

                            public String getNum() {
                                return num;
                            }

                            public String getPrice() {
                                return price;
                            }

                            public String getTicketID() {
                                return ticketID;
                            }

                            public String getBookUrl() {
                                return bookUrl;
                            }

                            public String getPriceType() {
                                return priceType;
                            }

                            public String getType() {
                                return type;
                            }

                            public String getNormalPrice() {
                                return normalPrice;
                            }

                            public String getTicketTitle() {
                                return ticketTitle;
                            }
                        }
                    }
                }
            }
        }
    }
}
