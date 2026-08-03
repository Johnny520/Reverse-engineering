package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5660 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1602;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1603;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13902;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13903;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13904;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13905;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13906;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13907;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13908;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13909;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13910;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13911;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13912;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13913;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13914;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13915;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13916;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13917;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13918;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13919;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13920;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13921;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13922;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13923;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13924;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13925;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13926;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠$ۥ */
    public class C0829 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13927;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f13928;

        public C0829(ClassLoader classLoader) {
            this.f13928 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f13927;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(5352845180157982910L);
            f13927 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5660.this.m17572(methodHookParam, this.f13928, yue_xin_awa(0));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠$ۥ۟ */
    public class C0830 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13930;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f13931;

        public C0830(ClassLoader classLoader) {
            this.f13931 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f13930;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(2796739627026455525L);
            f13930 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5660.this.m17572(methodHookParam, this.f13931, yue_xin_awa(0));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠$ۥ۟۟, reason: contains not printable characters */
    public class C5661 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Method f13933;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f13934;

        public C5661(Method method, ClassLoader classLoader) {
            this.f13933 = method;
            this.f13934 = classLoader;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5660.this.m17572(methodHookParam, this.f13934, this.f13933.getReturnType().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠$ۥ۟۟۟, reason: contains not printable characters */
    public class C5662 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f13936;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f13937;

        public C5662(ClassLoader classLoader, C3828 c3828) {
            this.f13936 = classLoader;
            this.f13937 = c3828;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5660.this.m17572(methodHookParam, this.f13936, this.f13937.m10570());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C5663 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13940;

        public C5663() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13939;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(4808902032189260810L);
                f13939 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f13940;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-6379887225395018946L);
            f13940 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult((Object) null);
                C6334.m19808(yue_xin_awa(1), 2);
            }
        }
    }

    static {
        NativeUtil.classesInit0(602);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2358(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(11));
            for (Method method : C8573.m4543(classLoader.loadClass(c3828.m879()), Void.TYPE, 2, new Class[]{classLoader.loadClass(c3828.m10569().get(0)), classLoader.loadClass(c3828.m10569().get(1))})) {
                C5309.m16287(classLoader.loadClass(c3828.m879()), method.getName(), new C5661(method, classLoader));
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(12), th.getMessage());
        }
        try {
            C3828 c38282 = c3829.m880().get(yue_xin_awa(13));
            C5309.m16280(c38282.m879(), classLoader, c38282.m878(), classLoader.loadClass(c38282.m10569().get(0)), classLoader.loadClass(c38282.m10569().get(1)), new C5662(classLoader, c38282));
        } catch (Throwable th2) {
            C4383.m12707(yue_xin_awa(14), th2.getMessage());
        }
        try {
            Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(15));
            Class cls = Void.TYPE;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            C5309.m16287(clsLoadClass, C8573.m4543(clsLoadClass, cls, 4, new Class[]{cls2, String.class, cls3, cls3}).get(0).getName(), new C5663());
        } catch (Throwable th3) {
            C4383.m12707(yue_xin_awa(16), th3.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m17571(ClassLoader classLoader) {
        try {
            if (C3270.m343().startsWith(yue_xin_awa(5))) {
                C5309.m16287(classLoader.loadClass(yue_xin_awa(6)), yue_xin_awa(7), new C0829(classLoader));
                C5309.m16287(classLoader.loadClass(yue_xin_awa(8)), yue_xin_awa(9), new C0830(classLoader));
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(10), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m17572(XC_MethodHook.MethodHookParam methodHookParam, ClassLoader classLoader, String str) {
        if (C4093.m11556(yue_xin_awa(1)) && C6263.m2730()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(yue_xin_awa(17), 1);
                Object obj = methodHookParam.args[0];
                Class<?> clsLoadClass = classLoader.loadClass(obj.getClass().getName());
                List<Field> listM1710 = C4806.m1710(clsLoadClass, String.class, 1);
                List<Method> listM4543 = C8573.m4543(clsLoadClass, Void.TYPE, 2, new Class[]{String.class, JSONObject.class});
                Iterator<Field> it = listM1710.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) XposedHelpers.getObjectField(obj, it.next().getName());
                        if (str2 != null && str2.equals(yue_xin_awa(18))) {
                            XposedHelpers.callMethod(obj, listM4543.get(0).getName(), new Object[]{yue_xin_awa(19), jSONObject});
                            C6334.m19808(yue_xin_awa(20), 2);
                            if (str.equals(yue_xin_awa(21))) {
                                methodHookParam.setResult(Boolean.TRUE);
                            } else {
                                methodHookParam.setResult((Object) null);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(22) + th + yue_xin_awa(23) + str);
            }
        }
    }
}
