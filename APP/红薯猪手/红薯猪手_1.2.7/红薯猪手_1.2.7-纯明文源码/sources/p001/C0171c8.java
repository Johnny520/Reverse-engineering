package p001;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۟.c8 */
/* JADX INFO: loaded from: classes.dex */
public class C0171c8 {

    /* JADX INFO: renamed from: ۟.c8$a */
    public static final class a {

        /* JADX INFO: renamed from: ۥ */
        public static final Method f740;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            C0237h4.m865(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (C0237h4.m864(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C0237h4.m1089("getParameterTypes(...)", parameterTypes);
                    boolean z = C0237h4.m864(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class);
                    if (z) {
                        method = method2;
                        break;
                    }
                    i++;
                }
            }
            f740 = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !C0237h4.m864(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo837(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C0237h4.m1090("cause", th);
        Method method = a.f740;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
