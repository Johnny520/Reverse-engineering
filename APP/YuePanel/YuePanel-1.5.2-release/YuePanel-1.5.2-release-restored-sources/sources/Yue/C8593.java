package Yue;

import android.app.Activity;
import com.kongzue.dialogx.DialogX;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8593 {

    /* JADX INFO: renamed from: ۥ */
    public static final List<C8595> f3574;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3575;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25526;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۨ$ۥ */
    public class C1564 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Activity activity = (Activity) methodHookParam.thisObject;
            C3270.m6713(activity);
            C3270.m6717(activity.getApplicationContext());
            C3270.m6718(activity.getClassLoader());
            C3270.m6721(C3369.m456(C3270.m6705()));
            C3270.m6722(C3369.m455(C3270.m6705()));
            C7139.m3427(C3270.m6705());
            DialogX.init(C3270.m342());
            C8593.m4567();
        }
    }

    static {
        NativeUtil.classesInit0(304);
        f3574 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m4567();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m4568();
}
