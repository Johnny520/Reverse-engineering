package p000a;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.vc */
/* JADX INFO: loaded from: classes.dex */
public class C0881vc {

    /* JADX INFO: renamed from: a.vc$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Method f3457a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            C0631i9.m1479b(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (C0631i9.m1478a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (C0631i9.m1478a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f3457a = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !C0631i9.m1478a(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo1550a(Throwable th, Throwable th2) {
        C0631i9.m1482e(th, "cause");
        C0631i9.m1482e(th2, "exception");
        Method method = a.f3457a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
