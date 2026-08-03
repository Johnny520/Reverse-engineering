package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8200 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3310;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3311;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24453;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24454;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24455;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨۡ$ۥ */
    public class C1461 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f24456;

        public C1461(C3828 c3828) {
            this.f24456 = c3828;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8191.m27150(methodHookParam, this.f24456.m10570());
        }
    }

    static {
        NativeUtil.classesInit0(106);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(1));
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C1461(c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(2), th.getMessage());
        }
    }
}
