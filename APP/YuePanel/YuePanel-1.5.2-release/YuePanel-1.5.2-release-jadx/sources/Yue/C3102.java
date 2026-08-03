package Yue;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.kongzue.dialogx.DialogX;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3102 {

    /* JADX INFO: renamed from: ۥ */
    public static List<C8595> f71;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f72;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AtomicBoolean f4614;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4615;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4616;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4617;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4618;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4619;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۥ$ۥ */
    public class C0049 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C3270.m6702().equals(EnumC3367.f5340.m6900())) {
                Activity activity = (Activity) methodHookParam.thisObject;
                if (!C3102.f72.equals(C3270.m343()) || C3102.f72.isEmpty()) {
                    C3270.m6713(activity);
                    Context baseContext = activity.getBaseContext();
                    ClassLoader classLoader = activity.getClassLoader();
                    if (baseContext != null) {
                        C3270.m6717(baseContext);
                        C3270.m6718(baseContext.getClassLoader());
                    } else {
                        C3270.m6717(activity);
                        C3270.m6718(classLoader);
                    }
                    C3102.f72 = C3270.m343();
                    C3270.m6721(C3369.m456(C3270.m6705()));
                    C3270.m6722(C3369.m455(C3270.m6705()));
                    C7139.m3427(C3270.m6705());
                    DialogX.init(activity);
                    C4383.m12697(C3102.m197());
                    C3102.m198();
                    if (C3102.m6325().get()) {
                        return;
                    }
                    C3356.m436();
                    C3102.m6325().set(true);
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(699);
        f72 = yue_xin_awa(4);
        f4614 = new AtomicBoolean();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ List m197();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m198();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ AtomicBoolean m6325();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m6326(ClassLoader classLoader) {
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(0), classLoader), yue_xin_awa(1), Bundle.class, new C0049());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m6327();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m6328(List<C8595> list);
}
