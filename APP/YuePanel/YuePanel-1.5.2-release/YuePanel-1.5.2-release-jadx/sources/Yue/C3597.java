package Yue;

import android.graphics.drawable.Drawable;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3597 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f403;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f404;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6183;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6184;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6185;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6186;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۥ$ۥ */
    public class C0190 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6187;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Drawable f6188;

        public C0190(Drawable drawable) {
            this.f6188 = drawable;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f6187;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(4756136231419570214L);
            f6187 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.args[0] = this.f6188;
            }
        }
    }

    static {
        NativeUtil.classesInit0(528);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(4), classLoader), yue_xin_awa(5), Drawable.class, new C0190(m646(C2597R.C9029.f30469)));
    }

    /* JADX INFO: renamed from: ۥ */
    public native Drawable m646(int i);
}
