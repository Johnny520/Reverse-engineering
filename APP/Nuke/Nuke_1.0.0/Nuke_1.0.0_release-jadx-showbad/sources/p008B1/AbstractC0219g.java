package p008B1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p000A.C0065i;
import p002A1.InterfaceC0145r;
import p056K2.C0884j;
import p056K2.InterfaceC0875a;
import p095T.AbstractC1384r0;
import p095T.C1341U0;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: B1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1384r0 f765a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof p095T.AbstractC1384r0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (p095T.AbstractC1384r0) r1;
     */
    static {
        Object objM3229o;
        try {
            ClassLoader classLoader = InterfaceC0145r.class.getClassLoader();
            AbstractC1665j.m2982b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                } else if (annotations[i5] instanceof InterfaceC0875a) {
                    break;
                } else {
                    i5++;
                }
            }
            objM3229o = null;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        AbstractC1384r0 c1341u0 = (AbstractC1384r0) (objM3229o instanceof C0884j ? null : objM3229o);
        if (c1341u0 == null) {
            c1341u0 = new C1341U0(new C0065i(3));
        }
        f765a = c1341u0;
    }
}
