package p022L0;

import java.lang.reflect.Method;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246a {

    /* JADX INFO: renamed from: a */
    public static final Method f524a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0307g.m700b(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (AbstractC0307g.m699a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC0307g.m699a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f524a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !AbstractC0307g.m699a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
