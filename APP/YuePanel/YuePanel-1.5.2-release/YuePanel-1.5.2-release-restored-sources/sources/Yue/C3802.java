package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3802 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f514;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f515;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7051;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7052;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7053;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7054;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7055;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7056;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7057;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7058;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7059;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7060;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ */
    public class C0258 extends XC_MethodHook {
        public C0258() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(0);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ۟ */
    public class C0259 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7062;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7063;

        public C0259(ClassLoader classLoader) {
            this.f7063 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7062;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(4394822394387967280L);
            f7062 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object obj = methodHookParam.args[0];
                ((List) C5898.m18284(obj, C4806.m1710(this.f7063.loadClass(obj.getClass().getName()), List.class, 17).get(0).getName(), List.class)).clear();
            } catch (Throwable th) {
                C4383.m12707(yue_xin_awa(0), th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ۟۟, reason: contains not printable characters */
    public class C3803 extends XC_MethodHook {
        public C3803() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            ((List) methodHookParam.args[2]).clear();
        }
    }

    static {
        NativeUtil.classesInit0(1060);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
