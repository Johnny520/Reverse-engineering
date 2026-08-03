package p205o3;

import androidx.lifecycle.InterfaceC0112q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p117i0.AbstractC1869p1;
import p117i0.C1858m2;
import p144k.C2209s1;
import p276sf.C3959f;
import p276sf.InterfaceC3954a;

/* JADX INFO: renamed from: o3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3043a {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1869p1 f9864a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof p117i0.AbstractC1869p1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (p117i0.AbstractC1869p1) r1;
     */
    static {
        Object c3959f;
        try {
            ClassLoader classLoader = InterfaceC0112q.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if (annotations[i9] instanceof InterfaceC3954a) {
                    break;
                } else {
                    i9++;
                }
            }
            c3959f = null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        AbstractC1869p1 c1858m2 = (AbstractC1869p1) (c3959f instanceof C3959f ? null : c3959f);
        if (c1858m2 == null) {
            c1858m2 = new C1858m2(new C2209s1(3));
        }
        f9864a = c1858m2;
    }
}
