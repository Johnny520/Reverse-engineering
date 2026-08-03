package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3495 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f332;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f333;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5783;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5784;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5785;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۦ$ۥ */
    public class C0153 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5786;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Method f5787;

        public C0153(Method method) {
            this.f5787 = method;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f5786;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(2496816107060660610L);
            f5786 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            XposedHelpers.callMethod(XposedHelpers.callMethod(methodHookParam.thisObject, this.f5787.getName(), new Object[0]), yue_xin_awa(0), new Object[]{Boolean.TRUE});
        }
    }

    static {
        NativeUtil.classesInit0(760);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
