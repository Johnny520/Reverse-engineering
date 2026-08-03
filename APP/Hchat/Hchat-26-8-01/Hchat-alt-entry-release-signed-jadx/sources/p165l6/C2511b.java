package p165l6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p012ah.C0086a;
import p077f8.AbstractC1089i;

/* JADX INFO: renamed from: l6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2511b extends AbstractC1089i {

    /* JADX INFO: renamed from: b */
    public final Method f8133b = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: c */
    public final Method f8134c = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: d */
    public final Method f8135d;

    /* JADX INFO: renamed from: e */
    public final Method f8136e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2511b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f8135d = cls.getMethod("getName", null);
        this.f8136e = cls.getMethod("getType", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: A */
    public final Constructor mo2804A(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f8134c.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                clsArr[i9] = (Class) this.f8136e.invoke(objArr[i9], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            C0086a.m457p("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: I */
    public final String[] mo2805I(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f8134c.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                strArr[i9] = (String) this.f8135d.invoke(objArr[i9], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            C0086a.m457p("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: X */
    public final boolean mo2810X(Class cls) {
        try {
            return ((Boolean) this.f8133b.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            C0086a.m457p("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.AbstractC1089i
    /* JADX INFO: renamed from: x */
    public final Method mo2814x(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e6) {
            C0086a.m457p("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }
}
