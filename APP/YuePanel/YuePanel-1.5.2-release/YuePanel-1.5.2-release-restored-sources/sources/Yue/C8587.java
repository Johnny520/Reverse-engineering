package Yue;

import android.content.Context;
import android.os.Bundle;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;
import com.yuexin.panel.hook.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8587 {

    /* JADX INFO: renamed from: ۥ */
    public static AtomicBoolean f3566;

    /* JADX INFO: renamed from: ۥ۟ */
    public static AtomicBoolean f3567;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final List<C8595> f25481;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25482;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25483;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25484;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25485;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25486;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25487;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25488;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25489;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ */
    public class C1556 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (methodHookParam.args.length == 1) {
                C4116.m11753(methodHookParam.thisObject);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟ */
    public class C1557 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25490;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25491;

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f25490;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-2013069114494367754L);
                f25490 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f25491;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(8330119989323276104L);
            f25491 = strM22672;
            return strM22672;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m28590() {
            for (int i = 0; i < 5; i++) {
                C7477.m3677(1000L);
                C8229.m27214();
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C8587.f3567.get()) {
                return;
            }
            C5863.m2535(C3270.m6702() + yue_xin_awa(0));
            new Thread(new Runnable() { // from class: Yue.ۥۢۦۥ
                static {
                    NativeUtil.classesInit0(1007);
                }

                @Override // java.lang.Runnable
                public final native void run();
            }).start();
            C8587.f3567.set(true);
            C5863.m2535(C3270.m6702() + yue_xin_awa(1));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟۟, reason: contains not printable characters */
    public class C8588 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Context context = (Context) methodHookParam.getResult();
            if (context != null) {
                C7139.m3427(context);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟۟۟, reason: contains not printable characters */
    public class C8589 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25492;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25493;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25494;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25495;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25496;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25497;

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f25492;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(5414116339064640063L);
                f25492 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f25493;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(3895494887513716590L);
                f25493 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f25494;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-4931624373010769661L);
                f25494 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f25495;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-4719103213421073595L);
                f25495 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f25496;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(5490439965782235432L);
                f25496 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f25497;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(-4981209216552905739L);
            f25497 = strM22676;
            return strM22676;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C8587.f3566.get()) {
                    return;
                }
                Object obj = methodHookParam.args[0];
                String str = (String) XposedHelpers.callMethod(obj, yue_xin_awa(0), new Object[0]);
                String str2 = (String) XposedHelpers.callMethod(obj, yue_xin_awa(1), new Object[0]);
                Object objM18284 = C5898.m18284(obj, yue_xin_awa(2), MainHook.f30776.loadClass(yue_xin_awa(3)));
                if (str != null && str2 != null && objM18284 != null) {
                    C6263.m19278((String) ((List) XposedHelpers.callMethod(objM18284, yue_xin_awa(4), new Object[0])).get(0));
                    C6263.m19283(str);
                    C6263.m19282(str2);
                    C2604.m31089(true);
                    C3808.m10507();
                    C8587.f3566.set(true);
                }
            } catch (Throwable th) {
                C5863.m2535(yue_xin_awa(5) + th);
            }
        }
    }

    static {
        NativeUtil.classesInit0(294);
        f3566 = new AtomicBoolean();
        f3567 = new AtomicBoolean();
        f25481 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m4558();

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4559() {
        ClassLoader classLoaderM6707 = C3270.m6707();
        try {
            C5309.m16286(classLoaderM6707.loadClass(yue_xin_awa(0)), new C1556());
        } catch (Throwable unused) {
        }
        try {
            C5309.m16279(XposedHelpers.findClass(yue_xin_awa(1), classLoaderM6707), yue_xin_awa(2), Bundle.class, new C1557());
            C5309.m16279(XposedHelpers.findClass(yue_xin_awa(3), classLoaderM6707), yue_xin_awa(4), new C8588());
        } catch (Exception e) {
            C5863.m2535(C3270.m6702() + yue_xin_awa(5) + e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m28589();
}
