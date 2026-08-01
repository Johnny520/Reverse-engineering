package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0946yx {

    /* JADX INFO: renamed from: a */
    public static final Method f5508a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0493mp.m1854d(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0493mp.m1853c(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0493mp.m1856f("getParameterTypes(...)", parameterTypes);
                if (AbstractC0493mp.m1853c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f5508a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0493mp.m1853c(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
