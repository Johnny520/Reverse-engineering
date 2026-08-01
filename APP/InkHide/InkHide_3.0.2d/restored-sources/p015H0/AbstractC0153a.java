package p015H0;

import java.lang.reflect.Method;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: H0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153a {

    /* JADX INFO: renamed from: a */
    public static final Method f465a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0223g.m415b(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (AbstractC0223g.m414a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC0223g.m414a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f465a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !AbstractC0223g.m414a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
