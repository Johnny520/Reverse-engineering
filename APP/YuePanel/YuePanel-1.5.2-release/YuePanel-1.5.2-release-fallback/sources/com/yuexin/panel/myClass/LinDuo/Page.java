package com.yuexin.panel.myClass.LinDuo;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
@org.simpleframework.xml.Root(name = "page", strict = false)
public class Page {

    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String baseurl;

    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String expire;

    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String hasmore;

    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String num;

    @org.simpleframework.xml.ElementList(empty = true, entry = "ring", inline = true, required = false)
    private java.util.List<com.yuexin.panel.myClass.LinDuo.Ring> ringList;

    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String sig;

    static {
            r0 = 619(0x26b, float:8.67E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public Page() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.lang.String getBaseurl();

    public native java.lang.String getExpire();

    public native java.lang.String getHasmore();

    public native java.lang.String getNum();

    public native java.util.List<com.yuexin.panel.myClass.LinDuo.Ring> getRingList();

    public native java.lang.String getSig();

    public native void setBaseurl(java.lang.String r1);

    public native void setExpire(java.lang.String r1);

    public native void setHasmore(java.lang.String r1);

    public native void setNum(java.lang.String r1);

    public native void setRingList(java.util.List<com.yuexin.panel.myClass.LinDuo.Ring> r1);

    public native void setSig(java.lang.String r1);
}
