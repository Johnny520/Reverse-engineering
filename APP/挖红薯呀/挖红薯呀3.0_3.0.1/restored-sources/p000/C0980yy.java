package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0980yy {

    /* JADX INFO: renamed from: l */
    public static final String f7726l = "hide_home_follow";

    /* JADX INFO: renamed from: m */
    public static final String f7727m = "hide_home_explore";

    /* JADX INFO: renamed from: n */
    public static final String f7728n = "hide_home_worldcup";

    /* JADX INFO: renamed from: o */
    public static final String f7729o = "hide_home_local";

    /* JADX INFO: renamed from: p */
    public static final boolean f7730p = false;

    /* JADX INFO: renamed from: q */
    public static final boolean f7731q = false;

    /* JADX INFO: renamed from: r */
    public static final boolean f7732r = false;

    /* JADX INFO: renamed from: s */
    public static final boolean f7733s = false;

    /* JADX INFO: renamed from: t */
    private static volatile ViewGroup f7734t;

    /* JADX INFO: renamed from: u */
    private static volatile Field f7735u;

    /* JADX INFO: renamed from: v */
    private static volatile Field f7736v;

    /* JADX INFO: renamed from: w */
    private static volatile int f7737w;

    /* JADX INFO: renamed from: a */
    public static final C0980yy f7715a = new C0980yy();

    /* JADX INFO: renamed from: b */
    private static final u60 f7716b = new x51(new C0658qn(5));

    /* JADX INFO: renamed from: c */
    private static final u60 f7717c = new x51(new C0658qn(6));

    /* JADX INFO: renamed from: d */
    private static final u60 f7718d = new x51(new C0658qn(7));

    /* JADX INFO: renamed from: e */
    private static final u60 f7719e = new x51(new C0658qn(8));

    /* JADX INFO: renamed from: f */
    private static final u60 f7720f = new x51(new C0658qn(9));

    /* JADX INFO: renamed from: g */
    private static final u60 f7721g = new x51(new C0658qn(10));

    /* JADX INFO: renamed from: h */
    private static final u60 f7722h = new x51(new C0658qn(11));

    /* JADX INFO: renamed from: i */
    private static final u60 f7723i = new x51(new C0658qn(2));

    /* JADX INFO: renamed from: j */
    private static final u60 f7724j = new x51(new C0658qn(3));

    /* JADX INFO: renamed from: k */
    private static final u60 f7725k = new x51(new C0658qn(4));

    /* JADX INFO: renamed from: x */
    public static final int f7738x = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0980yy() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final Field m5298A(Class<?> cls, String str) {
        C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredFields());
        while (c0822vM1933s.hasNext()) {
            Field field = (Field) c0822vM1933s.next();
            if (r41.m3380Q(field.getType().getName(), str, false)) {
                field.setAccessible(true);
                return field;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x0011 */
    /* JADX INFO: renamed from: B */
    private final int m5299B(Context context, int i) {
        for (int i2 = i + 1; i2 < 4; i2++) {
            if (!m5319W(context, i2)) {
                return i2;
            }
        }
        do {
            i--;
            if (-1 >= i) {
                return m5300C(context);
            }
        } while (m5319W(context, i));
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final int m5300C(Context context) {
        for (int i = 0; i < 4; i++) {
            if (!m5319W(context, i)) {
                return i;
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private final int m5301D(Context context, int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i2 >= 0 && i2 < 4) {
            if (!m5319W(context, i2)) {
                return i2;
            }
            i2 += i3;
        }
        return m5300C(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private final String m5302E() {
        return (String) f7721g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final String m5303F() {
        return (String) f7720f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final String m5304G() {
        return (String) f7716b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final String m5305H() {
        return (String) f7718d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final String m5306I() {
        return (String) f7725k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final String m5307J() {
        return (String) f7724j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final String m5308K() {
        return (String) f7717c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private final String m5309L() {
        return (String) f7719e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    private final String m5310M() {
        return (String) f7723i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final String m5311N() {
        return (String) f7722h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final void m5312P(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Class<?> clsLoadClass = classLoader.loadClass(m5302E());
            clsLoadClass.getClass();
            f7735u = m5298A(clsLoadClass, m5311N());
            f7736v = m5298A(clsLoadClass, m5310M());
            if (f7735u != null && f7736v != null) {
                Method declaredMethod = clsLoadClass.getDeclaredMethod(m5307J(), Integer.TYPE);
                kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                    return;
                }
                hookBuilderHook.intercept(new C0796ua(13));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final Object m5313Q(XposedInterface.Chain chain) {
        Object obj;
        Field field;
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            int i = 0;
            Object obj2 = chain.getArgs().get(0);
            obj2.getClass();
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue >= 0 && iIntValue < 4) {
                Object thisObject = chain.getThisObject();
                Field field2 = f7735u;
                if (field2 != null && (obj = field2.get(thisObject)) != null) {
                    C0980yy c0980yy = f7715a;
                    Object objM5345z = c0980yy.m5345z(obj, c0980yy.m5306I(), new Object[0]);
                    Context context = objM5345z instanceof Context ? (Context) objM5345z : null;
                    if (context != null) {
                        if (!c0980yy.m5319W(context, iIntValue)) {
                            f7737w = iIntValue;
                            return objProceed;
                        }
                        int iM5301D = c0980yy.m5301D(context, f7737w, iIntValue);
                        if (iM5301D != iIntValue && (field = f7736v) != null) {
                            Object obj3 = field.get(thisObject);
                            ViewGroup viewGroup = obj3 instanceof ViewGroup ? (ViewGroup) obj3 : null;
                            if (viewGroup != null) {
                                viewGroup.post(new RunnableC0943xy(iM5301D, i, viewGroup));
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m5314R(ViewGroup viewGroup, int i) {
        try {
            C0980yy c0980yy = f7715a;
            c0980yy.m5345z(viewGroup, c0980yy.m5308K(), Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    private final void m5315S(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass(m5304G()).getDeclaredMethod(m5308K(), Integer.TYPE);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(12));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final Object m5316T(XposedInterface.Chain chain) {
        chain.getClass();
        try {
            Object obj = chain.getArgs().get(0);
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue < 0 || iIntValue >= 4) {
                return chain.proceed();
            }
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            Context context = ((View) thisObject).getContext();
            C0980yy c0980yy = f7715a;
            context.getClass();
            if (!c0980yy.m5319W(context, iIntValue)) {
                f7737w = iIntValue;
                return chain.proceed();
            }
            int iM5301D = c0980yy.m5301D(context, f7737w, iIntValue);
            if (iM5301D == iIntValue) {
                return chain.proceed();
            }
            List args = chain.getArgs();
            args.getClass();
            Object[] array = args.toArray(new Object[0]);
            array[0] = Integer.valueOf(iM5301D);
            f7737w = iM5301D;
            return chain.proceed(array);
        } catch (Exception unused) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final void m5317U(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Class<?> clsLoadClass = classLoader.loadClass(m5305H());
            String strM5309L = m5309L();
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Boolean.TYPE;
            Method declaredMethod = clsLoadClass.getDeclaredMethod(strM5309L, cls, cls2, cls3, cls3);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(14));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Object m5318V(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            View view = (View) thisObject;
            String name = view.getClass().getName();
            C0980yy c0980yy = f7715a;
            if (name.equals(c0980yy.m5303F())) {
                f7734t = (ViewGroup) view;
                Context context = ((ViewGroup) view).getContext();
                context.getClass();
                c0980yy.m5344y(context);
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final boolean m5319W(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(m00.f3663S.m2362Y(), 0);
        if (i == 0) {
            return sharedPreferences.getBoolean(f7726l, false);
        }
        if (i == 1) {
            return sharedPreferences.getBoolean(f7727m, false);
        }
        if (i == 2) {
            return sharedPreferences.getBoolean(f7728n, false);
        }
        if (i != 3) {
            return false;
        }
        return sharedPreferences.getBoolean(f7729o, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final String m5334o() {
        return "com.xingin.xhs.homepage.topbar.HomeTabBarManagerNew";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m5335p() {
        return "com.xingin.xhs.homepage.tabbar.view.HomeTabLayout";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m5336q() {
        return "com.xingin.xhs.homepage.container.viewpager.HomeViewPager";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m5337r() {
        return "com.xingin.widgets.XYTabLayout";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m5338s() {
        return "getContext";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m5339t() {
        return "onPageSelected";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m5340u() {
        return "setCurrentItem";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final String m5341v() {
        return "s";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m5342w() {
        return "HomeViewPager";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m5343x() {
        return "IndexHomeFragmentNew";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final void m5344y(Context context) {
        int childCount;
        try {
            ViewGroup viewGroup = f7734t;
            if (viewGroup == null) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null && (childCount = viewGroup2.getChildCount()) >= 4) {
                int iMin = Math.min(childCount, 4);
                for (int i = 0; i < iMin; i++) {
                    View childAt2 = viewGroup2.getChildAt(i);
                    if (childAt2 != null) {
                        int i2 = m5319W(context, i) ? 8 : 0;
                        if (childAt2.getVisibility() != i2) {
                            childAt2.setVisibility(i2);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final Object m5345z(Object obj, String str, Object... objArr) {
        Object objInvoke = null;
        if (obj == null) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            methods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    objInvoke = ((Method) it.next()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m5346O(ClassLoader classLoader) {
        classLoader.getClass();
        m5315S(classLoader);
        m5317U(classLoader);
        m5312P(classLoader);
    }
}
