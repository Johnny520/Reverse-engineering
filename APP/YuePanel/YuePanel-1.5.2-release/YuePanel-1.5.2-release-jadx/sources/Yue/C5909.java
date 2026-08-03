package Yue;

import android.content.Intent;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5909 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1773;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1774;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14745;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14746;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۥۢ$ۥ */
    public class C0898 extends XC_MethodHook {
        public C0898() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr = methodHookParam.args;
            Intent intent = (Intent) objArr[2];
            int iIntValue = ((Integer) objArr[1]).intValue();
            int iIntValue2 = ((Integer) methodHookParam.args[0]).intValue();
            C5740.m17796(intent, iIntValue2, iIntValue);
            C7196.m22539(iIntValue2, iIntValue, intent);
        }
    }

    static {
        NativeUtil.classesInit0(400);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
