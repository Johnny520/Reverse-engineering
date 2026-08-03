package Yue;

import android.content.Intent;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7542 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2939;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2940;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22820;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22821;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22822;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22823;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22824;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ */
    public class C1292 extends XC_MethodHook {
        public C1292() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ۟ */
    public class C1293 extends XC_MethodHook {
        public C1293() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr = methodHookParam.args;
            C5740.m17796((Intent) objArr[2], ((Integer) objArr[0]).intValue(), ((Integer) methodHookParam.args[1]).intValue());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public class C7543 extends XC_MethodHook {
        public C7543() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr = methodHookParam.args;
            C5740.m17796((Intent) objArr[2], ((Integer) objArr[0]).intValue(), ((Integer) methodHookParam.args[1]).intValue());
        }
    }

    static {
        NativeUtil.classesInit0(803);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ */
    public final void m3725(XC_MethodHook.MethodHookParam methodHookParam) {
        C5740.m17797(methodHookParam);
    }
}
