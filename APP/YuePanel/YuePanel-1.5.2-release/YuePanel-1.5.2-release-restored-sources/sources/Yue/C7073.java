package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۡۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7073 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static Object f2664;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f2665;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f21357;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21358;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21359;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21360;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21361;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21362;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21363;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21364;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣ۠$ۥ */
    public class C1155 extends XC_MethodHook {
        public C1155() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C7073.m3356(methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣ۠$ۥ۟ */
    public class C1156 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f21366;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f21367;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f21368;

        public C1156(ClassLoader classLoader, C3828 c3828) {
            this.f21367 = classLoader;
            this.f21368 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f21366;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-6728739784281742067L);
            f21366 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C7073.m3357() == null) {
                    C7073.m22043(C5896.m2565(this.f21367.loadClass(methodHookParam.args[1].getClass().getName()), this.f21367.loadClass(this.f21368.m10569().get(1))).getName());
                }
            } catch (Throwable th) {
                C5863.m2535(yue_xin_awa(0) + th.getMessage());
            }
        }
    }

    static {
        NativeUtil.classesInit0(1105);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m3356(Object obj);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ String m3357();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m22043(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m22044() {
        try {
            return ((Boolean) XposedHelpers.callMethod(f2664, f2665, new Object[]{2, C7070.m21993(C3270.m6707().loadClass(f21357), 1)})).booleanValue();
        } catch (Throwable th) {
            C6334.m19809(yue_xin_awa(6) + th);
            return false;
        }
    }

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            f2665 = c3828.m878();
            C5309.m16286(classLoader.loadClass(c3828.m879()), new C1155());
            C5309.m16280(c3828.m879(), classLoader, c3828.m878(), Integer.TYPE, classLoader.loadClass(c3828.m10569().get(1)), new C1156(classLoader, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(2), th.getMessage());
        }
    }
}
