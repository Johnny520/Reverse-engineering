package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5664 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1604;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1605;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13942;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13943;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13944;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13945;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13946;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13947;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13948;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13949;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13950;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13951;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۡ$ۥ */
    public class C0831 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13952;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13953;

        public C0831() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13952;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-302636402479131576L);
                f13952 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f13953;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-5782757229032091205L);
            f13953 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult(Boolean.TRUE);
                C6334.m19810(yue_xin_awa(1));
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۡ$ۥ۟ */
    public class C0832 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13955;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13956;

        public C0832() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13955;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-302636402479131576L);
                f13955 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f13956;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-5782757229032091205L);
            f13956 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult(Boolean.TRUE);
                C6334.m19810(yue_xin_awa(1));
            }
        }
    }

    static {
        NativeUtil.classesInit0(606);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            if (C4563.m1512() != 2) {
                C3828 c3828 = c3829.m880().get(yue_xin_awa(7));
                C5309.m16280(c3828.m879(), classLoader, c3828.m878(), classLoader.loadClass(c3828.m10569().get(0)), new C0832());
            } else if (C3270.m343().startsWith(yue_xin_awa(4))) {
                C5309.m16287(classLoader.loadClass(yue_xin_awa(5)), yue_xin_awa(6), new C0831());
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(8), th.getMessage());
        }
    }
}
