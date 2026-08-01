package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: qx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0650qx {

    /* JADX INFO: renamed from: a */
    public static final Method f4125a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0346ip.m1500l(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0346ip.m1497i(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0346ip.m1502n("getParameterTypes(...)", parameterTypes);
                if (AbstractC0346ip.m1497i(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f4125a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0346ip.m1497i(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
