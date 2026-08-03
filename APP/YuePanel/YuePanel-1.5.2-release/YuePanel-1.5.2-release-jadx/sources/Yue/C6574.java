package Yue;

import android.view.WindowManager;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6574 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2148;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2149;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16879;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16880;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16881;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16882;

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ */
    public class C1016 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16883;

        public C1016() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f16883;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-8392893560746592369L);
            f16883 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5863.m2535(yue_xin_awa(0));
            methodHookParam.setResult((Object) null);
        }
    }

    static {
        NativeUtil.classesInit0(352);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(4), classLoader), yue_xin_awa(5), WindowManager.LayoutParams.class, new C1016());
    }
}
