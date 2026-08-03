package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5665 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1606;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1607;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13958;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13959;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13960;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13961;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13962;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۢ$ۥ */
    public class C0833 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13963;

        public C0833() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f13963;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(8826573671144175597L);
            f13963 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult(1000);
            }
        }
    }

    static {
        NativeUtil.classesInit0(537);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C0833());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(4), th.getMessage());
        }
    }
}
