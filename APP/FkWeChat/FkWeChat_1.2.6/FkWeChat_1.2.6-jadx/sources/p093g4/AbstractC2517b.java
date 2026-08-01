package p093g4;

import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.lifecycle.InterfaceC0676o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p172l8.InterfaceC4691e;

/* JADX INFO: renamed from: g4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2517b {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f6789a;

    static {
        Object objM18798b;
        AbstractC0506h3 abstractC0506h3;
        try {
            C4712s.a aVar = C4712s.f13928r;
            ClassLoader classLoader = InterfaceC0676o.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC0506h3) {
                        abstractC0506h3 = (AbstractC0506h3) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC4691e) {
                    break;
                } else {
                    i10++;
                }
            }
            abstractC0506h3 = null;
            objM18798b = C4712s.m18798b(abstractC0506h3);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        AbstractC0506h3 abstractC0506h3M1980h = (AbstractC0506h3) (C4712s.m18803g(objM18798b) ? null : objM18798b);
        if (abstractC0506h3M1980h == null) {
            abstractC0506h3M1980h = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: g4.a
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC2517b.m9024a();
                }
            });
        }
        f6789a = abstractC0506h3M1980h;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0676o m9024a() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 m9025b() {
        return f6789a;
    }
}
