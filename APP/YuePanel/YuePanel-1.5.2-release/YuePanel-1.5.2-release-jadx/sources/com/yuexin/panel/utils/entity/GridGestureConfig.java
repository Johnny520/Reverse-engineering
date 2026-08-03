package com.yuexin.panel.utils.entity;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class GridGestureConfig implements Serializable {
    private static final long serialVersionUID = 20250101;
    private static volatile /* synthetic */ String yue_xin_qwq0;
    public int rows = 2;
    public int cols = 2;
    public Map<String, C2603> cells = new HashMap();

    /* JADX INFO: renamed from: com.yuexin.panel.utils.entity.GridGestureConfig$ۥ */
    public static class C2603 implements Serializable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final long f30828 = 20250101;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @SerializedName("single_tap")
        public String f30829;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @SerializedName("double_tab")
        public String f30830;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @SerializedName("long_press")
        public String f30831;
    }

    static {
        NativeUtil.classesInit0(411);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    public native GridGestureConfig deepCopy();

    public native C2603 getCell(int i, int i2);

    public native C2603 getOrCreateCell(int i, int i2);

    public native boolean hasConfig(int i, int i2);

    public native void removeCell(int i, int i2);

    public native void setCell(int i, int i2, C2603 c2603);
}
