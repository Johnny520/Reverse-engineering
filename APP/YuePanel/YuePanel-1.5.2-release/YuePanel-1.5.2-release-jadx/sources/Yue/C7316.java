package Yue;

import android.view.View;
import android.widget.EditText;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۡۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7316 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2800;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2801;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22083;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22084;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22085;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22086;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22087;

    /* JADX INFO: renamed from: Yue.ۥۡۨۡ۟$ۥ */
    public class C1230 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22088;

        public C1230() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f22088;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(3650488232502961642L);
            f22088 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                C7316.m22851(C7316.this);
                methodHookParam.setResult((Object) null);
            }
        }
    }

    static {
        NativeUtil.classesInit0(963);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3564(EditText editText, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3565(EditText editText);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m22851(C7316 c7316);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m22852(EditText editText);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m22853(EditText editText, View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(yue_xin_awa(3)), yue_xin_awa(4), new C1230());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(5), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native void m22854();
}
