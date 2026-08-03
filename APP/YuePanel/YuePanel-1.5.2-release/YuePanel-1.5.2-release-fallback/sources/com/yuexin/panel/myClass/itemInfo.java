package com.yuexin.panel.myClass;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class itemInfo {
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq0;
    public boolean activity;
    public boolean add;
    public java.lang.String checkID;
    public boolean click;
    public java.lang.String desc;
    public boolean dexKit;
    public boolean firstHook;
    public java.lang.String id;
    public boolean isCheck;
    public boolean items;
    public boolean load;
    public boolean longClick;
    public java.util.HashMap<java.lang.String, java.lang.String> map;
    public java.lang.String name;
    public java.lang.String[] open;
    public java.lang.String permission;

    static {
            r0 = 17
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public itemInfo() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.firstHook = r0
            r2.items = r0
            r1 = 1
            r2.load = r1
            r2.dexKit = r1
            r2.activity = r0
            r2.add = r0
            java.lang.String r1 = yue_xin_awa(r0)
            r2.desc = r1
            r2.click = r0
            r2.longClick = r0
            r2.isCheck = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.map = r0
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);
}
