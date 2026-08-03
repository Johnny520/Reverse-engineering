package Yue;

import android.content.Context;
import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5877 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1751;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1752;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14573;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14574;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14575;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14576;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14577;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14578;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۢۥ$ۥ */
    public class C0888 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14579;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14580;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14581;

        public C0888() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f14579;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-3015189725834673034L);
                f14579 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f14580;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(6124391398629070904L);
                f14580 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f14581;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-6248461582893793618L);
            f14581 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                if (C4116.f8219.equals(yue_xin_awa(1)) && C3270.m6701().equals(yue_xin_awa(2))) {
                    return;
                }
                C5877.m18184(C5877.this, (View) methodHookParam.getResult());
            }
        }
    }

    static {
        NativeUtil.classesInit0(50);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2545(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m2546(C5877 c5877, View view, Context context);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18181(C5877 c5877, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18182(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18183(List list, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m18184(C5877 c5877, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    private native void m18185(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18186(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m18187(List list, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m18188(C6320 c6320, View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m18189(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native /* synthetic */ void m18190(View view, Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m18191(View view);
}
