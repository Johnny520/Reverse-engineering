package ag;

import gg.AbstractC1416l;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ag.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085a {

    /* JADX INFO: renamed from: a */
    public static final Method f250a;

    /* JADX INFO: renamed from: b */
    public static final Method f251b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i10];
            if (AbstractC1416l.m3825a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (AbstractC1416l.m3825a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i10++;
        }
        f250a = method2;
        int length2 = methods.length;
        while (true) {
            if (i9 >= length2) {
                break;
            }
            Method method3 = methods[i9];
            if (AbstractC1416l.m3825a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i9++;
        }
        f251b = method;
    }
}
