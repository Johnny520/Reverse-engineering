package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8230 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3338;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3339;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24518;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24519;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24520;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24521;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24522;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24523;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24524;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24525;

    /* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ$ۥ */
    public class C1465 extends XC_MethodHook {
        public C1465() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr = methodHookParam.args;
            long jLongValue = ((Long) objArr[1]).longValue();
            ((Long) methodHookParam.args[2]).longValue();
            C8202.m27164(jLongValue);
            C3174.m6489(jLongValue);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ$ۥ۟ */
    public class C1466 extends XC_MethodHook {
        public C1466() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr = methodHookParam.args;
            long jLongValue = ((Long) objArr[0]).longValue();
            ((Long) methodHookParam.args[1]).longValue();
            C8202.m27164(jLongValue);
            C3174.m6489(jLongValue);
        }
    }

    static {
        NativeUtil.classesInit0(C7597.f22996);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
