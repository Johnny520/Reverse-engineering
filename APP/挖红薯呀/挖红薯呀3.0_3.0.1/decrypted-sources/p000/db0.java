package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class db0 {

    /* JADX INFO: renamed from: a */
    public static final at0 f1042a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 instanceof p000.at0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = (p000.at0) r1;
     */
    static {
        Object bv0Var;
        try {
            ClassLoader classLoader = nx0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof InterfaceC0061bn) {
                    break;
                } else {
                    i++;
                }
            }
            bv0Var = null;
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        at0 g41Var = (at0) (bv0Var instanceof bv0 ? null : bv0Var);
        if (g41Var == null) {
            g41Var = new g41(new a00(26));
        }
        f1042a = g41Var;
    }
}
