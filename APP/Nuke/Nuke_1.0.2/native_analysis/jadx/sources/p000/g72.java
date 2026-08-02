package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 extends tp0 {

    /* JADX INFO: renamed from: r */
    public final Method f3339r = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: s */
    public final Method f3340s = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: t */
    public final Method f3341t;

    /* JADX INFO: renamed from: u */
    public final Method f3342u;

    public g72() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f3341t = cls.getMethod("getName", null);
        this.f3342u = cls.getMethod("getType", null);
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: A */
    public final boolean mo1549A(Class cls) {
        try {
            return ((Boolean) this.f3339r.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: u */
    public final Method mo1550u(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: v */
    public final Constructor mo1551v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3340s.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f3342u.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: x */
    public final String[] mo1552x(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3340s.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f3341t.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
