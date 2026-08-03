package Yue;

import android.view.MenuItem;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6199 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1889;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1890;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15229;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15230;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15231;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15232;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15233;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15234;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15235;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۟ۧ$ۥ */
    public class C0932 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15236;

        public C0932() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f15236;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(1640170722644797087L);
            f15236 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            int itemId = ((MenuItem) methodHookParam.args[0]).getItemId();
            ((Integer) methodHookParam.args[1]).intValue();
            if (itemId == 520) {
                C6334.m19807(yue_xin_awa(0), 3);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۟ۧ$ۥ۟ */
    public class C0933 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15238;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15239;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15240;

        public C0933() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f15238;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7700156274928203156L);
                f15238 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f15239;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-664608180635831153L);
                f15239 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f15240;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(513899995430996995L);
            f15240 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            XposedBridge.log(yue_xin_awa(0) + methodHookParam.args[0]);
        }
    }

    static {
        NativeUtil.classesInit0(354);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
