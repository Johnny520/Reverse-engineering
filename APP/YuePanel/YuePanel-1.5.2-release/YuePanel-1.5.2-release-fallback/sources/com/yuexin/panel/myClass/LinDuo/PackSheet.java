package com.yuexin.panel.myClass.LinDuo;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
@org.simpleframework.xml.Root(name = "sheet", strict = false)
public class PackSheet {

    @org.simpleframework.xml.Element(name = "page")
    @org.simpleframework.xml.Attribute(required = false)
    private com.yuexin.panel.myClass.LinDuo.Page page;

    static {
            r0 = 191(0xbf, float:2.68E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public PackSheet() {
            r0 = this;
            r0.<init>()
            return
    }

    public native com.yuexin.panel.myClass.LinDuo.Page getPage();

    public native void setPage(com.yuexin.panel.myClass.LinDuo.Page r1);
}
