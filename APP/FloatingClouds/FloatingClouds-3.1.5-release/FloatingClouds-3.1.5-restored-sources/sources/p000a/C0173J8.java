package p000a;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.J8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0173J8 {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f608a;

    /* JADX INFO: renamed from: b */
    public final String f609b;

    /* JADX INFO: renamed from: c */
    public final C0830t f610c;

    public C0173J8(ClassLoader classLoader, String str, C0830t c0830t) {
        C0631i9.m1482e(classLoader, "classLoader");
        C0631i9.m1482e(str, "processName");
        this.f608a = classLoader;
        this.f609b = str;
        this.f610c = c0830t;
    }

    /* JADX INFO: renamed from: a */
    public static XposedInterface.HookHandle m463a(C0173J8 c0173j8, String str, String str2, Class[] clsArr, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        c0173j8.getClass();
        C0631i9.m1482e(str, "className");
        C0631i9.m1482e(str2, "methodName");
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        Method methodM16e = C0002A1.m16e(str, c0173j8.f608a, str2, Arrays.copyOf(clsArr, clsArr.length));
        if (methodM16e != null) {
            return c0173j8.m470f(methodM16e).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0119G8(interfaceC0064D7, 0));
        }
        C0908x1.m2197e("findAndHook: method not found: " + str + "." + str2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m464b(C0173J8 c0173j8, String str, InterfaceC0064D7 interfaceC0064D7, InterfaceC0064D7 interfaceC0064D72) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        C0631i9.m1482e(str, "className");
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        WeakHashMap<Object, Map<String, Object>> weakHashMap = C0002A1.f22a;
        ClassLoader classLoader = c0173j8.f608a;
        C0631i9.m1482e(classLoader, "classLoader");
        Class clsM13b = C0002A1.m13b(classLoader, str);
        Method[] methodArrM17f = clsM13b == null ? new Method[0] : C0002A1.m17f(clsM13b, interfaceC0064D7);
        ArrayList arrayList = new ArrayList(methodArrM17f.length);
        for (Method method : methodArrM17f) {
            arrayList.add(c0173j8.m470f(method).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0119G8(interfaceC0064D72, 1)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static XposedInterface.HookHandle m465c(C0173J8 c0173j8, Class[] clsArr, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        Class clsM13b = C0002A1.m13b(c0173j8.f608a, "java.io.FileOutputStream");
        if (clsM13b != null) {
            Class[] clsArr2 = (Class[]) C0238N1.m629c0(clsArr).toArray(new Class[0]);
            try {
                Constructor declaredConstructor = clsM13b.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                declaredConstructor.setAccessible(true);
                return c0173j8.m470f(declaredConstructor).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0119G8(interfaceC0064D7, 4));
            } catch (NoSuchMethodException unused) {
                C0908x1.m2197e(C0944z.m2227g("findAndHookConstructor: ctor not found: java.io.FileOutputStream(", C0238N1.m631e0(clsArr, null, new C0687l8(18), 31), ")"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m466d(C0173J8 c0173j8, String str, String str2, String str3, Class[] clsArr, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        C0742o6 c0742o6M291a = C0106Fd.m291a(str);
        Method methodM16e = C0002A1.m16e(str2, c0173j8.f608a, str3, Arrays.copyOf(clsArr, clsArr.length));
        if (methodM16e != null) {
            c0173j8.m470f(methodM16e).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0137H8(c0742o6M291a, interfaceC0064D7, 0));
            return;
        }
        C0908x1.m2197e("findAndHookGuarded: method not found: " + str2 + "." + str3);
    }

    /* JADX INFO: renamed from: e */
    public static XposedInterface.HookHandle m467e(C0173J8 c0173j8, String str, String str2, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        Method methodM16e = C0002A1.m16e(str, c0173j8.f608a, str2, new Object[0]);
        if (methodM16e != null) {
            return c0173j8.m470f(methodM16e).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0119G8(interfaceC0064D7, 3));
        }
        C0908x1.m2197e("findAndHookNoArgs: method not found: " + str + "." + str2);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m468g(C0173J8 c0173j8, Method method, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        C0631i9.m1481d(c0173j8.m470f(method).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0119G8(interfaceC0064D7, 2)), "intercept(...)");
    }

    /* JADX INFO: renamed from: h */
    public static XposedInterface.HookHandle m469h(C0173J8 c0173j8, String str, Method method, InterfaceC0064D7 interfaceC0064D7) {
        XposedInterface.ExceptionMode exceptionMode = XposedInterface.ExceptionMode.PROTECTIVE;
        c0173j8.getClass();
        C0631i9.m1482e(method, "method");
        C0631i9.m1482e(exceptionMode, "exceptionMode");
        XposedInterface.HookHandle hookHandleIntercept = c0173j8.m470f(method).setPriority(50).setExceptionMode(exceptionMode).intercept(new C0137H8(C0106Fd.m291a(str), interfaceC0064D7, 1));
        C0631i9.m1481d(hookHandleIntercept, "intercept(...)");
        return hookHandleIntercept;
    }

    /* JADX INFO: renamed from: f */
    public final XposedInterface.HookBuilder m470f(Executable executable) {
        C0631i9.m1482e(executable, "executable");
        return (XposedInterface.HookBuilder) this.f610c.mo53f(executable);
    }
}
