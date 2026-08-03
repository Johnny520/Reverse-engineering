package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5394 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1488;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1489;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13283;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13284;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۡ$ۥ */
    public class C0741 extends XC_MethodHook {
        public C0741() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5393.m16877(methodHookParam.thisObject);
            C4116.f8224 = methodHookParam.args[0];
        }
    }

    static {
        NativeUtil.classesInit0(957);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
