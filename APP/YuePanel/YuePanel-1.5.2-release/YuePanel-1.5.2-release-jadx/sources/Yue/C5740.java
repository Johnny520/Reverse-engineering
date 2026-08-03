package Yue;

import android.content.Intent;
import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.hook.p005dy.utils.VideoReplace;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5740 {

    /* JADX INFO: renamed from: ۥ */
    public static C3361 f1641;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final HashMap<Integer, Class<?>> f1642;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14219;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14220;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14221;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14222;

    static {
        NativeUtil.classesInit0(952);
        HashMap<Integer, Class<?>> map = new HashMap<>();
        f1642 = map;
        map.put(Integer.valueOf(C8129.f3232), C8129.class);
        map.put(Integer.valueOf(C5779.f14312), C5779.class);
        map.put(Integer.valueOf(VideoReplace.f30784), VideoReplace.class);
        map.put(Integer.valueOf(C3942.f7557), C3942.class);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2416(int i, Intent intent, List list, int i2);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m2417(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m17793(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m17794(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m17795(int i, Intent intent, List list, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m17796(Intent intent, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m17797(XC_MethodHook.MethodHookParam methodHookParam) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native void m17798(String str);
}
