package Yue;

import android.content.Intent;
import android.view.KeyEvent;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5676 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1611;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1612;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13977;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13978;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13979;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13980;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۢ$ۥ */
    public class C0836 extends XC_MethodHook {
        public C0836() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            C5676.this.m2365((KeyEvent) methodHookParam.args[0], methodHookParam);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۢ$ۥ۟ */
    public class C0837 extends XC_MethodHook {
        public C0837() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            C5676.this.m2365((KeyEvent) methodHookParam.args[0], methodHookParam);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۢ$ۥ۟۟, reason: contains not printable characters */
    public class C5677 extends XC_MethodHook {
        public C5677() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            Object[] objArr = methodHookParam.args;
            C5740.m17796((Intent) objArr[2], ((Integer) objArr[0]).intValue(), ((Integer) methodHookParam.args[1]).intValue());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C5678 extends XC_MethodHook {
        public C5678() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            Object[] objArr = methodHookParam.args;
            C5740.m17796((Intent) objArr[2], ((Integer) objArr[0]).intValue(), ((Integer) methodHookParam.args[1]).intValue());
        }
    }

    static {
        NativeUtil.classesInit0(575);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2365(KeyEvent keyEvent, XC_MethodHook.MethodHookParam methodHookParam) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            C5740.m17797(methodHookParam);
        }
    }
}
