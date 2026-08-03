package Yue;

import android.content.Context;
import com.google.gson.Gson;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5215 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f12416;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Gson f12417;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12418;

    /* JADX INFO: renamed from: ۥ */
    public GridGestureConfig f1345;

    /* JADX INFO: renamed from: ۥ۟ */
    public Context f1346;

    static {
        NativeUtil.classesInit0(937);
        f12416 = yue_xin_awa(0);
        f12417 = new Gson();
    }

    public C5215() {
        m15972();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1978(C5215 c5215, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟ */
    public native GridGestureConfig m1979();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native /* synthetic */ void m15971(GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m15972();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native void m15973(GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native void m15974(Context context);
}
