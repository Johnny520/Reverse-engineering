package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: Pt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681Pt {

    /* JADX INFO: renamed from: a */
    public static final Method f2179a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0585Nj.m1134a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (AbstractC0585Nj.m1134a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f2179a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0585Nj.m1134a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
