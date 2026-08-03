package Yue;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5311 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1428;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1429;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12835;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ */
    public class C0707 extends XC_MethodHook {
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Context context = ((View) methodHookParam.thisObject).getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                C3270.m6713(activity);
                Application application = activity.getApplication();
                if (C3270.m6705() == null) {
                    C3270.m6717(application);
                }
                C7139.m3427(application);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ۟ */
    public class C0708 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            MotionEvent motionEvent = (MotionEvent) methodHookParam.args[0];
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                C7825.m24831(motionEvent);
                C7139.m3427(C3270.m6705());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ۟۟, reason: contains not printable characters */
    public class C5312 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            MotionEvent motionEvent = (MotionEvent) methodHookParam.args[0];
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                C7825.m24831(motionEvent);
                C7139.m3427(C3270.m6705());
            }
        }
    }

    static {
        NativeUtil.classesInit0(286);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m2094(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m2095(ClassLoader classLoader);
}
