package Yue;

import android.app.Dialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4392 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f858;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f859;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9043;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9044;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ */
    public class C0396 extends XC_MethodHook {
        public C0396() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4116.m11755((Dialog) methodHookParam.args[0]);
        }
    }

    static {
        NativeUtil.classesInit0(931);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
