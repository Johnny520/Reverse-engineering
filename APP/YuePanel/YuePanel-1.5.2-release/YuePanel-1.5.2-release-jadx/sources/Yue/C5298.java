package Yue;

import Yue.C5298;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.p001dx.p004io.Opcodes;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5298 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12658;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12659;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12660;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12661;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12662;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12664;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12665;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12666;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12667;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12668;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12669;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12670;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12671;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12672;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12673;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12674;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12675;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12676;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12677;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12678;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12679;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12680;

    /* JADX INFO: renamed from: ۥ */
    public final String f1409 = yue_xin_awa(0);

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f1410 = yue_xin_awa(1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f12681 = yue_xin_awa(2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String f12682 = yue_xin_awa(3);

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥۢ$ۥ */
    public class C0701 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12683;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12684;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12685;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12686;

        public C0701() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f12683;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(8411220865108037236L);
                f12683 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f12684;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(5154366422324085873L);
                f12684 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f12685;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-1489396665553672775L);
                f12685 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f12686;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-3904690476286863437L);
            f12686 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            List list = (List) methodHookParam.getResult();
            for (Object obj : new ArrayList(list)) {
                String string = obj.toString();
                if (string.contains(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(0))) {
                    list.remove(obj);
                }
                if (string.contains(yue_xin_awa(1)) && C4093.m11556(yue_xin_awa(1))) {
                    list.remove(obj);
                }
                if (string.contains(yue_xin_awa(2)) && C4093.m11556(yue_xin_awa(2))) {
                    list.remove(obj);
                }
                if (string.contains(yue_xin_awa(3)) && C4093.m11556(yue_xin_awa(3))) {
                    list.remove(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥۢ$ۥ۟ */
    public class C0702 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12688;

        public C0702() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f12688;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-7509722936351465810L);
            f12688 = strM2267;
            return strM2267;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m16264(XC_MethodHook.MethodHookParam methodHookParam) {
            for (int i = 0; i < 50; i++) {
                C7477.m3677(100L);
                final View view = (View) methodHookParam.thisObject;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥ۠ۤۥۤ
                    static {
                        NativeUtil.classesInit0(Opcodes.SUB_DOUBLE_2ADDR);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                });
            }
        }

        public void afterHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                new Thread(new Runnable() { // from class: Yue.ۥ۠ۤۥۣ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5298.C0702.m16264(methodHookParam);
                    }
                }).start();
            }
        }
    }

    static {
        NativeUtil.classesInit0(200);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m2081(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    private static native /* synthetic */ boolean m2082(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            if (C4093.m11556(yue_xin_awa(7))) {
                C5309.m16280(c3828.m879(), classLoader, yue_xin_awa(8), new C0701());
                C5309.m16286(classLoader.loadClass(yue_xin_awa(9)), new C0702());
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(10), th.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public native void onClick();
}
