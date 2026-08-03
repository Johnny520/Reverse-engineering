package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7708 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3035;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3036;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23209;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23210;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23211;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23212;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23213;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ */
    public class C1331 extends XC_MethodHook {
        public C1331() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            String str = (String) methodHookParam.args[0];
            if (str == null) {
                return;
            }
            C7709 c7709 = new C7709();
            c7709.f3038 = methodHookParam.thisObject;
            c7709.f3037 = System.currentTimeMillis();
            C4116.f8223.put(str, c7709);
            C7708.m3811();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ۟ */
    public class C1332 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23215;

        public C1332() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f23215;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(1205798495015636870L);
            f23215 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.args[0] = Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C7709 {

        /* JADX INFO: renamed from: ۥ */
        public long f3037;

        /* JADX INFO: renamed from: ۥ۟ */
        public Object f3038;
    }

    static {
        NativeUtil.classesInit0(615);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m3811();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
