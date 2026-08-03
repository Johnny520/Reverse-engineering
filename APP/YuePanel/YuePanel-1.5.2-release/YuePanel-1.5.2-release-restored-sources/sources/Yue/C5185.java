package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5185 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static List<View> f1326;

    /* JADX INFO: renamed from: ۥ۟ */
    public static List<View> f1327;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String[] f12240;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12241;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12242;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12243;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12244;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12245;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12247;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12248;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12249;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12250;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12251;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12252;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12253;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦۥ$ۥ */
    public class C0661 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12254;

        public C0661() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f12254;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-7268684648916658815L);
            f12254 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0))) {
                C5185.m15879().add((View) methodHookParam.thisObject);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦۥ$ۥ۟ */
    public class C0662 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12256;

        public C0662() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f12256;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(5060933567897879125L);
            f12256 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0))) {
                C5185.m15880().add((View) methodHookParam.thisObject);
            }
        }
    }

    static {
        NativeUtil.classesInit0(901);
        f1326 = new ArrayList();
        f1327 = new ArrayList();
        f12240 = new String[]{yue_xin_awa(11), yue_xin_awa(12)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1963(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m1964(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m15878(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ List m15879();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ List m15880();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private static native /* synthetic */ boolean m15881(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m15882(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m15883(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m15884();

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        if (C4093.m11556(yue_xin_awa(2))) {
            try {
                C5309.m16286(classLoader.loadClass(yue_xin_awa(4)), new C0661());
                C5309.m16286(classLoader.loadClass(yue_xin_awa(5)), new C0662());
            } catch (Throwable th) {
                C4383.m12707(yue_xin_awa(6), th.getMessage());
            }
        }
    }

    @Override // Yue.AbstractC5391
    public native void onClick();
}
