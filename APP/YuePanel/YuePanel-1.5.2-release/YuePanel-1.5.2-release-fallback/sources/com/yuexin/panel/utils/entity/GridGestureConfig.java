package com.yuexin.panel.utils.entity;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class GridGestureConfig implements java.io.Serializable {
    private static final long serialVersionUID = 20250101;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq0;
    public java.util.Map<java.lang.String, com.yuexin.panel.utils.entity.GridGestureConfig.C7891> cells;
    public int cols;
    public int rows;

    /* JADX INFO: renamed from: com.yuexin.panel.utils.entity.GridGestureConfig$ۥ, reason: contains not printable characters */
    public static class C7891 implements java.io.Serializable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final long f30656 = 20250101;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @com.google.gson.annotations.SerializedName("single_tap")
        public java.lang.String f30657;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @com.google.gson.annotations.SerializedName("double_tab")
        public java.lang.String f30658;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @com.google.gson.annotations.SerializedName("long_press")
        public java.lang.String f30659;

        public C7891() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 411(0x19b, float:5.76E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public GridGestureConfig() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.rows = r0
            r1.cols = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cells = r0
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    public native com.yuexin.panel.utils.entity.GridGestureConfig deepCopy();

    public native com.yuexin.panel.utils.entity.GridGestureConfig.C7891 getCell(int r1, int r2);

    public native com.yuexin.panel.utils.entity.GridGestureConfig.C7891 getOrCreateCell(int r1, int r2);

    public native boolean hasConfig(int r1, int r2);

    public native void removeCell(int r1, int r2);

    public native void setCell(int r1, int r2, com.yuexin.panel.utils.entity.GridGestureConfig.C7891 r3);
}
