package top.suzhelan.qstory.entity;

import java.util.List;
import p279.InterfaceC8367;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QZoneFriend {

    @InterfaceC8367(name = "gpnames")
    private List<GpnamesDTO> gpnames;

    @InterfaceC8367(name = "list")
    private List<Friend> list;

    @InterfaceC8367(name = "mayknow")
    private MayknowDTO mayknow;

    @InterfaceC8367(name = "speciallist")
    private Object speciallist;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class Friend {

        @InterfaceC8367(name = "groupid")
        private Integer groupid;

        @InterfaceC8367(name = "isvip")
        private Integer isvip;

        @InterfaceC8367(name = "nick")
        private String nick;

        @InterfaceC8367(name = "remark")
        private String remark;

        @InterfaceC8367(name = "searchField")
        private String searchField;

        @InterfaceC8367(name = "uin")
        private Long uin;

        @InterfaceC8367(name = "viplevel")
        private Integer viplevel;

        public Friend() {
        }

        public Integer getGroupid() {
            return this.groupid;
        }

        public Integer getIsvip() {
            return this.isvip;
        }

        public String getNick() {
            return this.nick;
        }

        public String getRemark() {
            return this.remark;
        }

        public String getSearchField() {
            return this.searchField;
        }

        public Long getUin() {
            return this.uin;
        }

        public Integer getViplevel() {
            return this.viplevel;
        }

        public void setGroupid(Integer num) {
            this.groupid = num;
        }

        public void setIsvip(Integer num) {
            this.isvip = num;
        }

        public void setNick(String str) {
            this.nick = str;
        }

        public void setRemark(String str) {
            this.remark = str;
        }

        public void setSearchField(String str) {
            this.searchField = str;
        }

        public void setUin(Long l) {
            this.uin = l;
        }

        public void setViplevel(Integer num) {
            this.viplevel = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class GpnamesDTO {

        @InterfaceC8367(name = "gpid")
        private Integer gpid;

        @InterfaceC8367(name = "gpname")
        private String gpname;

        public GpnamesDTO() {
        }

        public Integer getGpid() {
            return this.gpid;
        }

        public String getGpname() {
            return this.gpname;
        }

        public void setGpid(Integer num) {
            this.gpid = num;
        }

        public void setGpname(String str) {
            this.gpname = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class MayknowDTO {

        @InterfaceC8367(name = "allnum")
        private Integer allnum;

        @InterfaceC8367(name = "list")
        private Object list;

        @InterfaceC8367(name = "page")
        private Integer page;

        public MayknowDTO() {
        }

        public Integer getAllnum() {
            return this.allnum;
        }

        public Object getList() {
            return this.list;
        }

        public Integer getPage() {
            return this.page;
        }

        public void setAllnum(Integer num) {
            this.allnum = num;
        }

        public void setList(Object obj) {
            this.list = obj;
        }

        public void setPage(Integer num) {
            this.page = num;
        }
    }

    public List<GpnamesDTO> getGpnames() {
        return this.gpnames;
    }

    public List<Friend> getList() {
        return this.list;
    }

    public MayknowDTO getMayknow() {
        return this.mayknow;
    }

    public Object getSpeciallist() {
        return this.speciallist;
    }

    public void setGpnames(List<GpnamesDTO> list) {
        this.gpnames = list;
    }

    public void setList(List<Friend> list) {
        this.list = list;
    }

    public void setMayknow(MayknowDTO mayknowDTO) {
        this.mayknow = mayknowDTO;
    }

    public void setSpeciallist(Object obj) {
        this.speciallist = obj;
    }
}
