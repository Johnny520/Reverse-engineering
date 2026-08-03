package Yue;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3581 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f396;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f397;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6137;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6138;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6139;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6140;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6141;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6142;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6143;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6144;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6145;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6146;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6147;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6148;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6149;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6150;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6151;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6152;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ */
    public class C0181 extends XC_MethodHook {
        public C0181() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ۟ */
    public class C0182 extends XC_MethodHook {
        public C0182() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (((Integer) methodHookParam.args[0]).intValue() != 8) {
                ((View) methodHookParam.thisObject).setVisibility(8);
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ۟۟, reason: contains not printable characters */
    public class C3582 extends XC_MethodHook {
        public C3582() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            ((View) methodHookParam.thisObject).setVisibility(8);
        }
    }

    static {
        NativeUtil.classesInit0(497);
        f396 = new String[]{yue_xin_awa(16)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m629(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m630(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        if (C4093.m11556(yue_xin_awa(4))) {
            try {
                C3828 c3828 = c3829.m880().get(yue_xin_awa(5));
                C3828 c38282 = c3829.m880().get(yue_xin_awa(6));
                C5309.m16280(c3828.m879(), classLoader, yue_xin_awa(7), Drawable.class, new C0181());
                C5309.m16280(c38282.m879(), classLoader, c38282.m878(), Integer.TYPE, String.class, new C0182());
                C5309.m16287(classLoader.loadClass(c38282.m879()), yue_xin_awa(8), new C3582());
            } catch (Throwable th) {
                C4383.m12707(yue_xin_awa(0), th.getMessage());
            }
        }
    }

    @Override // Yue.AbstractC5391
    public native void onClick();
}
