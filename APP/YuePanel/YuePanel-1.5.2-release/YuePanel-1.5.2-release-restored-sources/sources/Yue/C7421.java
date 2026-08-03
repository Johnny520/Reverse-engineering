package Yue;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۨۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7421 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2866;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2867;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22388;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22389;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22390;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22391;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22392;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22393;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22394;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22395;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22396;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22397;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22398;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22399;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22400;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22401;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22402;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22403;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22404;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22405;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22406;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22407;

    /* JADX INFO: renamed from: Yue.ۥۡۨۧۢ$ۥ */
    public class C1254 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22408;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22409;

        public C1254() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f22408;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(1547402047118803343L);
                f22408 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f22409;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-4852871607621971796L);
            f22409 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                final Dialog dialog = (Dialog) methodHookParam.thisObject;
                C4116.m11755(dialog);
                new Thread(new Runnable() { // from class: Yue.ۥۡۨۧۡ
                    static {
                        NativeUtil.classesInit0(1102);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                }).start();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m23250(ViewGroup viewGroup) {
            C7421.m23236(C7421.this, viewGroup);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m23251(ViewGroup viewGroup) {
            C7421.m23236(C7421.this, viewGroup);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m23252(Dialog dialog) {
            final ViewGroup viewGroup = null;
            int i = 0;
            for (int i2 = 0; i2 < 20; i2++) {
                C7477.m3677(100L);
                if (dialog.getWindow() != null) {
                    for (View view : C8369.m27916((ViewGroup) dialog.getWindow().getDecorView())) {
                        if (view.getClass().getName().equals(yue_xin_awa(1))) {
                            final ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                            i++;
                            if (i == 1) {
                                viewGroup = viewGroup2;
                            }
                            if (i == 2) {
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۡۨۧ۟
                                    static {
                                        NativeUtil.classesInit0(1036);
                                    }

                                    @Override // java.lang.Runnable
                                    public final native void run();
                                });
                                return;
                            }
                        }
                    }
                }
            }
            if (viewGroup != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۡۨۧ۠
                    static {
                        NativeUtil.classesInit0(1037);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                });
            }
        }
    }

    static {
        NativeUtil.classesInit0(1106);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3615(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3616(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23228(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23229(C6320 c6320, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23230(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m23231(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23232(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m23233(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23234(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m23235(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m23236(C7421 c7421, ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    private static native /* synthetic */ void m23237(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    private static native /* synthetic */ void m23238(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m23239(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23240(C6320 c6320, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ void m23241(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private static native /* synthetic */ void m23242(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23243(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23244(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23245(C6320 c6320, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m23246(C6320 c6320, View view);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            C5309.m16286(classLoader.loadClass(c3829.m880().get(yue_xin_awa(2)).m879()), new C1254());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native void m23247(ViewGroup viewGroup);
}
