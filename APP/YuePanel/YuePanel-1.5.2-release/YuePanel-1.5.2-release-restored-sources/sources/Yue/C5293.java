package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5293 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1406;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1407;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12622;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12623;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12624;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12625;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12626;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12627;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12628;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12629;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12630;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12631;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12632;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12633;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12634;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥ$ۥ */
    public class C0699 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f12635;

        public C0699(C3828 c3828) {
            this.f12635 = c3828;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            String str = (String) methodHookParam.args[C6328.m2795(this.f12635.m10569(), String.class)];
            if (str == null) {
                return;
            }
            C4116.f8219 = str;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥ$ۥ۟ */
    public class C0700 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12637;

        public C0700() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f12637;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(5453498405882732246L);
            f12637 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4116.f8219 = yue_xin_awa(0);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥ$ۥ۟۟, reason: contains not printable characters */
    public class C5294 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12639;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12640;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12641;

        public C5294() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f12639;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-3048300140026581857L);
                f12639 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f12640;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-5285335040564499648L);
                f12640 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f12641;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-2571349599553435828L);
            f12641 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            String strYue_xin_awa = (String) methodHookParam.args[1];
            if (strYue_xin_awa == null || !strYue_xin_awa.startsWith(yue_xin_awa(0))) {
                return;
            }
            if (strYue_xin_awa.equals(yue_xin_awa(1))) {
                strYue_xin_awa = yue_xin_awa(2);
            }
            C4116.f8218 = strYue_xin_awa;
        }
    }

    static {
        NativeUtil.classesInit0(23);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ */
    public final native void m2078(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m2079(C3828 c3828, ClassLoader classLoader);
}
