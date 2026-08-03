package Yue;

import android.view.View;
import android.widget.FrameLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3798 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f506;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7004;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7005;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7006;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7007;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7008;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7009;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7010;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7011;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7012;

    /* JADX INFO: renamed from: ۥ */
    public long f507 = System.currentTimeMillis();

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۤ$ۥ */
    public class C0254 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7013;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7014;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7015;

        public C0254(ClassLoader classLoader) {
            this.f7015 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7013;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7139754222167825334L);
                f7013 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f7014;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(2285824452577172922L);
            f7014 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (1000 >= System.currentTimeMillis() - C3798.m10495(C3798.this)) {
                return;
            }
            C3798.m10496(C3798.this, System.currentTimeMillis());
            C6263.m19285(methodHookParam.args[0] + yue_xin_awa(0));
            C6263.m19286(yue_xin_awa(1));
            View view = (View) methodHookParam.thisObject;
            C5740.m17794(C6263.m19271());
            C3798.this.m10502(methodHookParam);
            C3798.m10498(C3798.this, this.f7015, view);
        }
    }

    static {
        NativeUtil.classesInit0(1066);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m843(FrameLayout frameLayout);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m844(int i, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ long m10495(C3798 c3798);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ long m10496(C3798 c3798, long j);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m10498(C3798 c3798, ClassLoader classLoader, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m10499(int i, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m10500(FrameLayout frameLayout);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(2), classLoader), yue_xin_awa(3), String.class, new C0254(classLoader));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m10501(ClassLoader classLoader, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m10502(XC_MethodHook.MethodHookParam methodHookParam) {
        final FrameLayout frameLayout = (FrameLayout) methodHookParam.thisObject;
        new Thread(new Runnable() { // from class: Yue.ۥ۟ۤۤۢ
            static {
                NativeUtil.classesInit0(1070);
            }

            @Override // java.lang.Runnable
            public final native void run();
        }).start();
    }
}
