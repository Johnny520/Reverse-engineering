package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6821 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final List<View> f2339;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2340;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17716;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17717;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17718;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17719;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17720;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17721;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17722;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17723;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17724;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17725;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17726;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17727;

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ */
    public class C1092 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17728;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17729;

        public C1092() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17728;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2591087789027366920L);
                f17728 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f17729;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(6160932153671587088L);
            f17729 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11558(yue_xin_awa(1)) == 0) {
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ۟ */
    public class C1093 extends XC_MethodHook {
        public C1093() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C6821.m21570().add((View) methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ۟۟, reason: contains not printable characters */
    public class C6822 extends XC_MethodHook {
        public C6822() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C6821.m21570().add((View) methodHookParam.thisObject);
        }
    }

    static {
        NativeUtil.classesInit0(551);
        f2339 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3277();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3278(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ List m21570();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m21571();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m21572(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m21573();

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C1092());
            C4093.m11566(yue_xin_awa(4), 0);
        } catch (Throwable unused) {
            C4093.m11566(yue_xin_awa(4), 1);
            m21575(classLoader);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native String m21574();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m21575(ClassLoader classLoader) {
        try {
            if (C4093.m11556(yue_xin_awa(2))) {
                try {
                    C5309.m16286(classLoader.loadClass(yue_xin_awa(7)), new C1093());
                } catch (Throwable unused) {
                }
                C5309.m16286(classLoader.loadClass(yue_xin_awa(8)), new C6822());
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(1), th.getMessage());
        }
    }
}
