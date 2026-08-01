package p094S2;

import java.lang.reflect.Method;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1300a {

    /* JADX INFO: renamed from: a */
    public static final Method f4659a;

    /* JADX INFO: renamed from: b */
    public static final Method f4660b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1665j.m2982b(methods);
        int length = methods.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            method = null;
            if (i6 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i6];
            if (AbstractC1665j.m2981a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1665j.m2984d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC1665j.m2981a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i6++;
        }
        f4659a = method2;
        int length2 = methods.length;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            Method method3 = methods[i5];
            if (AbstractC1665j.m2981a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i5++;
        }
        f4660b = method;
    }
}
