package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m11 {

    /* JADX INFO: renamed from: a */
    public static final m11 f3778a = new m11();

    /* JADX INFO: renamed from: b */
    private static final String f3779b = "SidebarEntry";

    /* JADX INFO: renamed from: c */
    private static final String f3780c = "xhsdiscover://whs_module_settings";

    /* JADX INFO: renamed from: d */
    private static final String f3781d = "⚙️ WHS模块设置入口";

    /* JADX INFO: renamed from: e */
    private static final String f3782e = "⚙️ WHS模块设置";

    /* JADX INFO: renamed from: f */
    private static final String f3783f = "whs_module_entry";

    /* JADX INFO: renamed from: g */
    private static final String f3784g = "https://fe-platform.xhscdn.com/platform/104101l031je9jh942u06cbo34st00000000001fjaj8jg";

    /* JADX INFO: renamed from: h */
    private static final String f3785h = "https://fe-platform.xhscdn.com/platform/104101l031jea1se53406cbo34st000000000019jbo7jc";

    /* JADX INFO: renamed from: i */
    public static final int f3786i = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private m11() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final String m2409f(String str) {
        return l41.m1976P("\n{\n  \"type\": \"" + str + "\",\n  \"tag\": \"whs_module_entry\",\n  \"fields\": {\n    \"text\": {\n      \"key\": \"whs_module_entry\",\n      \"zh\": \"⚙️ WHS模块设置\",\n      \"en\": \"⚙️ WHS模块设置\",\n      \"zh_tw\": \"⚙️ WHS模块设置\"\n    },\n    \"icon\": {\n      \"light\": \"https://fe-platform.xhscdn.com/platform/104101l031je9jh942u06cbo34st00000000001fjaj8jg\",\n      \"dark\": \"https://fe-platform.xhscdn.com/platform/104101l031jea1se53406cbo34st000000000019jbo7jc\"\n    },\n    \"color\": {\n      \"light\": \"#FE2C55\",\n      \"dark\": \"#FE2C55\"\n    },\n    \"redDot\": {\n      \"text\": {}\n    }\n  },\n  \"trigger\": {\n    \"click\": [\n      {\"type\": \"jump\", \"fields\": {\"url\": \"xhsdiscover://whs_module_settings\"}},\n      {\"type\": \"track\", \"fields\": {\"pointId\": \"99999\"}}\n    ],\n    \"impression\": [\n      {\"type\": \"track\", \"fields\": {\"pointId\": \"99999\"}}\n    ]\n  }\n}\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m2410g(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        try {
            Object objInvoke = cls2.getDeclaredMethod("values", null).invoke(null, null);
            objInvoke.getClass();
            Object obj = ((Object[]) objInvoke)[0];
            Class cls4 = Integer.TYPE;
            Class cls5 = Boolean.TYPE;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls4, cls5, cls5, cls2, cls4, String.class, cls5, cls5, cls4, cls4, cls5, cls3, cls4, cls5, String.class, cls4);
            Boolean bool = Boolean.FALSE;
            return declaredConstructor.newInstance("", "", f3781d, "", 2131624895, bool, bool, obj, 0, "", bool, bool, 0, 0, bool, null, 0, bool, "", 0);
        } catch (Exception e) {
            AbstractC0748t1.m4161s("CreateSettingBean failed: ", e.getMessage(), lb0.f3404a, f3779b);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final boolean m2411h(View view) {
        CharSequence text;
        String string;
        if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null || (string = text.toString()) == null || !k41.m1764V(string, f3781d, false)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.getClass();
                    if (!m2411h(childAt)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final Object m2412i(ClassLoader classLoader, String str, Class<?> cls) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.google.gson.e");
            return classLoader.loadClass("com.google.gson.Gson").getDeclaredMethod("h", String.class, Class.class).invoke(clsLoadClass.getDeclaredMethod("a", null).invoke(clsLoadClass.newInstance(), null), str, cls);
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Gson fromJson failed: ", e.getMessage(), lb0.f3404a, f3779b);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final void m2413k(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.android.xhscomm.router.Routers").getDeclaredMethod("open", Context.class, classLoader.loadClass("com.xingin.android.xhscomm.router.RouterBuilder"), classLoader.loadClass("com.xingin.android.xhscomm.router.RouterCallback"));
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook.intercept(new C0796ua(25));
            }
            lb0.f3404a.m2017e(f3779b, "Routers.open hook installed");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Routers hook failed: ", e.getMessage(), lb0.f3404a, f3779b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Object m2414l(XposedInterface.Chain chain) {
        String string;
        chain.getClass();
        Object obj = chain.getArgs().get(1);
        try {
            Object objInvoke = obj.getClass().getDeclaredMethod("getUri", null).invoke(obj, null);
            if (objInvoke == null || (string = objInvoke.toString()) == null) {
                string = "";
            }
            if (!k41.m1764V(string, f3780c, false)) {
                return chain.proceed();
            }
            Object obj2 = chain.getArgs().get(0);
            obj2.getClass();
            f3778a.m2423u((Context) obj2);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    private final void m2415m(ClassLoader classLoader, final Class<?> cls, final Class<?> cls2, final Class<?> cls3) throws NoSuchMethodException, ClassNotFoundException {
        XposedInterface.HookBuilder hookBuilderHook;
        if (cls == null) {
            lb0.f3404a.m2014a(f3779b, "Settings skip: settingNewBean not found by DexKit");
            return;
        }
        if (cls2 == null) {
            lb0.f3404a.m2014a(f3779b, "Settings skip: settingEnumType not found by DexKit");
            return;
        }
        if (cls3 == null) {
            lb0.f3404a.m2014a(f3779b, "Settings skip: settingTrackData not found by DexKit");
            return;
        }
        final Class<?> clsLoadClass = classLoader.loadClass("com.drakeet.multitype.MultiTypeAdapter");
        Method declaredMethod = clsLoadClass.getDeclaredMethod("setItems", List.class);
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) != null) {
            hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: l11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object intercept(XposedInterface.Chain chain) {
                    return m11.m2416n(clsLoadClass, cls, cls2, cls3, chain);
                }
            });
        }
        m2417o(classLoader);
        m2419q(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final na1 m2416n(Class cls, Class cls2, Class cls3, Class cls4, XposedInterface.Chain chain) {
        String string;
        chain.getClass();
        chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            Object objInvoke = cls.getDeclaredMethod("getItems", null).invoke(thisObject, null);
            objInvoke.getClass();
            if ((objInvoke instanceof p40) && !(objInvoke instanceof r40)) {
                s91.m4030Q(objInvoke, "kotlin.collections.MutableList");
                throw null;
            }
            try {
                List list = (List) objInvoke;
                if (list.size() > 15 && cls2.isInstance(list.get(0))) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next != null && (string = next.toString()) != null && k41.m1764V(string, f3781d, false)) {
                                break;
                            }
                        } else {
                            Object objM2410g = f3778a.m2410g(cls2, cls3, cls4);
                            if (objM2410g != null) {
                                list.add(0, objM2410g);
                                cls.getMethod("notifyDataSetChanged", null).invoke(thisObject, null);
                                lb0.f3404a.m2017e(f3779b, "Settings top item injected, size=" + list.size());
                            }
                        }
                    }
                }
            } catch (ClassCastException e) {
                p30.m2984T(e, s91.class.getName());
                throw e;
            }
        } catch (Exception e2) {
            lb0.f3404a.m2014a(f3779b, "Settings inject error: " + e2);
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final void m2417o(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("performClick", null);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook.intercept(new C0796ua(26));
            }
            lb0.f3404a.m2017e(f3779b, "Settings click hook installed");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Settings click hook failed: ", e.getMessage(), lb0.f3404a, f3779b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Object m2418p(XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        thisObject.getClass();
        View view = (View) thisObject;
        try {
            m11 m11Var = f3778a;
            if (!m11Var.m2411h(view)) {
                return chain.proceed();
            }
            Context context = view.getContext();
            context.getClass();
            m11Var.m2423u(context);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final void m2419q(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = TextView.class.getDeclaredMethod("setText", CharSequence.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook.intercept(new C0796ua(27));
            }
            lb0.f3404a.m2017e(f3779b, "Settings color hook installed");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Settings color hook failed: ", e.getMessage(), lb0.f3404a, f3779b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Object m2420r(XposedInterface.Chain chain) {
        String string;
        chain.getClass();
        Object objProceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        thisObject.getClass();
        TextView textView = (TextView) thisObject;
        CharSequence text = textView.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (k41.m1764V(string, f3781d, false)) {
            textView.setTextColor(-119723);
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final void m2421s(ClassLoader classLoader, Class<?> cls, Class<?> cls2) throws NoSuchMethodException {
        XposedInterface.HookBuilder hookBuilderHook;
        if (cls == null) {
            lb0.f3404a.m2014a(f3779b, "Sidebar skip: homeNavigationView not found by DexKit");
            return;
        }
        if (cls2 == null) {
            lb0.f3404a.m2014a(f3779b, "Sidebar skip: sidebarDynamicData not found by DexKit");
            return;
        }
        Method declaredMethod = cls.getDeclaredMethod("c", String.class, ArrayList.class);
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
            return;
        }
        hookBuilderHook.intercept(new C0706ry(classLoader, cls2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r3 = p000.m11.f3778a;
        r8 = r3.m2412i(r8, r3.m2409f("sidebarBottomItem"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r8 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r9 = r1.size();
        r3 = r1.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r4 >= r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r6 = r1.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r6 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (p000.k41.m1764V(r6, "tag:setting", false) != true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r1.add(r9, r8);
        p000.lb0.f3404a.m2017e(p000.m11.f3779b, "Sidebar bottom item injected at pos=" + r9);
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2422t(ClassLoader classLoader, Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        Object obj = chain.getArgs().get(1);
        obj.getClass();
        ArrayList arrayList = (ArrayList) obj;
        try {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                next.getClass();
                String string = next.toString();
                if (k41.m1764V(string, "tag:whs_module_entry", false) && k41.m1764V(string, "type:sidebarBottomItem", false)) {
                    break;
                }
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Sidebar inject error: ", e.getMessage(), lb0.f3404a, f3779b);
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final void m2423u(Context context) {
        try {
            vf0.f6671a.m4714B1(context);
            lb0.f3404a.m2017e(f3779b, "Module settings panel opened");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Open settings failed: ", e.getMessage(), lb0.f3404a, f3779b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2424j(ClassLoader classLoader, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5) {
        classLoader.getClass();
        try {
            m2421s(classLoader, cls, cls2);
            lb0.f3404a.m2017e(f3779b, "Sidebar entry hook installed");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("Sidebar hook failed: ", e.getMessage(), lb0.f3404a, f3779b);
        }
        try {
            m2415m(classLoader, cls3, cls4, cls5);
            lb0.f3404a.m2017e(f3779b, "Settings entry hook installed");
        } catch (Exception e2) {
            AbstractC0748t1.m4161s("Settings hook failed: ", e2.getMessage(), lb0.f3404a, f3779b);
        }
        try {
            m2413k(classLoader);
            lb0.f3404a.m2017e(f3779b, "Router hook installed");
        } catch (Exception e3) {
            AbstractC0748t1.m4161s("Router hook failed: ", e3.getMessage(), lb0.f3404a, f3779b);
        }
    }
}
