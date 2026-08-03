package Yue;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3942 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f576;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final List<String> f577;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f7557 = 11122233;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7558;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7559;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7560;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7561;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7562;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7563;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7564;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7565;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7566;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7567;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7568;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7569;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7570;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7571;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7572;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7573;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7574;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7575;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7577;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7578;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7579;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7580;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7581;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7582;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7583;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7584;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7585;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7586;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7587;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7588;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7589;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7590;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7591;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7592;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7593;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7594;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7595;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7596;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7597;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7598;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7599;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7600;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۥۦ$ۥ */
    public class C0294 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7601;

        public C0294(ClassLoader classLoader) {
            this.f7601 = classLoader;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object result = methodHookParam.getResult();
            if (result != null) {
                String name = result.getClass().getName();
                if (C3942.m11209().contains(name)) {
                    return;
                }
                C3942.m11209().add(name);
                C3942.m11210(C3942.this, name, this.f7601);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۥۦ$ۥ۟ */
    public class C0295 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7603;

        public C0295() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7603;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(402057755026383666L);
            f7603 = strM2267;
            return strM2267;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m11230(View view) {
            for (int i = 0; i < 20; i++) {
                C7477.m3677(100L);
                List<View> listM27916 = C8369.m27916(view);
                if (listM27916.size() > 10 && C4093.m11558(yue_xin_awa(0)) != 0) {
                    for (final View view2 : listM27916) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥ۟ۥۥۨ
                            static {
                                NativeUtil.classesInit0(490);
                            }

                            @Override // java.lang.Runnable
                            public final native void run();
                        });
                    }
                }
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            final View view = (View) methodHookParam.getResult();
            new Thread(new Runnable() { // from class: Yue.ۥ۟ۥۥۧ
                static {
                    NativeUtil.classesInit0(492);
                }

                @Override // java.lang.Runnable
                public final native void run();
            }).start();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۥۦ$ۥ۟۟, reason: contains not printable characters */
    public class C3943 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7605;

        public C3943() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7605;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-2115935856809554529L);
            f7605 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            View view = (View) methodHookParam.getResult();
            if (C4093.m11556(yue_xin_awa(0)) && C6263.m2730()) {
                C3942.m11211(C3942.this, view);
            }
        }
    }

    static {
        NativeUtil.classesInit0(494);
        f576 = new String[]{yue_xin_awa(40), yue_xin_awa(41), yue_xin_awa(42)};
        f577 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m945(C3942 c3942, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m946(C3942 c3942, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11202(C3942 c3942, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11203(C3942 c3942, List list, boolean[] zArr);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11204();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11205(boolean z, List list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11206(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11207();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11208(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ List m11209();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m11210(C3942 c3942, String str, ClassLoader classLoader) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m11211(C3942 c3942, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private native void m11212(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11213(boolean z, List list);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11214(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m11215();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m11216();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    private native /* synthetic */ boolean m11217(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11218(BottomMenu bottomMenu, CharSequence charSequence, int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    public native void onActivityResult(Intent intent, List<Uri> list, boolean z);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native void m11219(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native void m11220(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m11221(String str, ClassLoader classLoader) throws Throwable {
        C5309.m16287(classLoader.loadClass(str), yue_xin_awa(6), new C0295());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final native /* synthetic */ void m11222(List list, boolean[] zArr);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m11223(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m11224(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final native void m11225(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final native void m11226(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final native void m11227();
}
