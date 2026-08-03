package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6287 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1977;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1978;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15828;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15829;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15830;

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۨ$ۥ */
    public class C0953 extends XC_MethodHook {
        public C0953() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۨ$ۥ۟ */
    public class C0954 extends XC_MethodHook {
        public C0954() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }
    }

    static {
        NativeUtil.classesInit0(718);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
