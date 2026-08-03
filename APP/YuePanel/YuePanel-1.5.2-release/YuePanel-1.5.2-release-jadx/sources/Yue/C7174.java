package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۡۧ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7174 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f2711;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2712;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21589;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21590;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21591;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21592;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21593;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21594;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21595;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21596;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21597;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21598;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21599;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21600;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21601;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21602;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21603;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21604;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21605;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21606;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21607;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21608;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21609;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21610;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21611;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21612;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21613;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21614;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21615;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21616;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21617;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21618;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21619;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۦ$ۥ */
    public class C1196 extends XC_MethodHook {
        public C1196() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                C7174.m22434(C7174.this, (Set) methodHookParam.args[0]);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۦ$ۥ۟ */
    public class C1197 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f21621;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f21622;

        public C1197(Class cls) {
            this.f21622 = cls;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f21621;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(4497105875493390510L);
            f21621 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object obj = methodHookParam.args[0];
                if (obj == null) {
                    return;
                }
                C7174.m22434(C7174.this, (Set) XposedHelpers.getObjectField(obj, C4806.m1710(this.f21622, Set.class, 17).get(0).getName()));
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(0) + th, 1);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۦ$ۥ۟۟, reason: contains not printable characters */
    public class C7175 extends XC_MethodHook {
        public C7175() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C7174.this.m22444((View) methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۦ$ۥ۟۟۟, reason: contains not printable characters */
    public class C7176 {

        /* JADX INFO: renamed from: ۥ */
        public String f2713;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f2714;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public String f21625;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f21626;

        static {
            NativeUtil.classesInit0(724);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C7176() {
        }

        /* JADX INFO: renamed from: ۥ */
        public native String m3457();

        /* JADX INFO: renamed from: ۥ۟ */
        public native String m3458();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native String m22446();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native int m22447();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public native void m22448(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native void m22449(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public native void m22450(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public native void m22451(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C7176(String str, String str2, String str3, int i) {
            this.f2713 = str;
            this.f2714 = str2;
            this.f21625 = str3;
            this.f21626 = i;
        }
    }

    static {
        NativeUtil.classesInit0(423);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3455(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ String[] m3456(int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String[] m22429(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m22430(C7176 c7176);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m22431(C7176 c7176);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m22432(String str, String str2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m22433(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m22434(C7174 c7174, Set set);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m22435(String str, String str2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m22436(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ String m22437(C7176 c7176);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ String[] m22438(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ String m22439(C7176 c7176);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ String[] m22440(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m22441(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            String[] strArr = {yue_xin_awa(4), yue_xin_awa(5), yue_xin_awa(6), yue_xin_awa(7)};
            for (int i = 0; i < 4; i++) {
                C5309.m16286(classLoader.loadClass(strArr[i]), new C1196());
            }
            try {
                Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(5));
                C5309.m16280(c3828.m879(), classLoader, c3828.m878(), clsLoadClass, classLoader.loadClass(yue_xin_awa(8)), new C1197(clsLoadClass));
            } catch (Throwable th) {
                C4383.m12707(yue_xin_awa(9), th.getMessage());
            }
            C5309.m16286(classLoader.loadClass(yue_xin_awa(10)), new C7175());
        } catch (Throwable th2) {
            C4383.m12707(yue_xin_awa(11), th2.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native C7176 m22442(List<C7176> list, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native List<C7176> m22443(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native void m22444(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final native void m22445(Set set);
}
