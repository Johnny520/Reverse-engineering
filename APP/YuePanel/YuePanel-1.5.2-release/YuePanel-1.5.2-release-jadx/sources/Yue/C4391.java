package Yue;

import android.app.Dialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4391 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f856;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f857;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9040;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9041;

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۢ$ۥ */
    public class C0395 extends XC_MethodHook {
        public C0395() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4117.m1088((Dialog) methodHookParam.getResult());
        }
    }

    static {
        NativeUtil.classesInit0(932);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
