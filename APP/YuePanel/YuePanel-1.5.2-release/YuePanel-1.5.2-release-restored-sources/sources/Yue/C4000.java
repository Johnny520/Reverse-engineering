package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4000 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f615;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f616;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8003;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8004;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟$ۥ */
    public class C0305 extends XC_MethodHook {
        public C0305() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C4000.m974(C4000.this, (View) methodHookParam.thisObject);
        }
    }

    static {
        NativeUtil.classesInit0(632);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m973();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m974(C4000 c4000, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11317();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16286(classLoader.loadClass(yue_xin_awa(3)), new C0305());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m11318(View view);
}
