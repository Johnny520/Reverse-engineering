package Yue;

import android.app.Activity;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3370 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f256;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f257;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5367;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5368;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5369;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5370;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5371;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5372;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5373;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟$ۥ */
    public class C0122 extends XC_MethodHook {
        public C0122() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            boolean zBooleanValue = ((Boolean) methodHookParam.args[1]).booleanValue();
            Activity activity = (Activity) methodHookParam.args[0];
            if (zBooleanValue) {
                C3355.m6873(activity);
            }
            C3355.m434(activity);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟$ۥ۟ */
    public class C0123 extends XC_MethodHook {
        public C0123() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            boolean zBooleanValue = ((Boolean) methodHookParam.args[1]).booleanValue();
            Activity activity = (Activity) methodHookParam.args[0];
            if (zBooleanValue) {
                C3355.m6874(activity);
            }
            C3355.m435(activity);
        }
    }

    static {
        NativeUtil.classesInit0(327);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
