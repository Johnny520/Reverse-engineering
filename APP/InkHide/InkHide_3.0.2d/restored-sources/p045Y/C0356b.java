package p045Y;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0356b extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final Method f830d = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: e */
    public final Method f831e;

    /* JADX INFO: renamed from: f */
    public final Method f832f;

    /* JADX INFO: renamed from: g */
    public final Method f833g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0356b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f831e = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f832f = componentType.getMethod("getName", null);
        this.f833g = componentType.getMethod("getType", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: C */
    public final boolean mo199C(Class cls) {
        try {
            return ((Boolean) this.f830d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: q */
    public final Method mo207q(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: r */
    public final Constructor mo208r(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f831e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f833g.invoke(objArr[i2], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: v */
    public final String[] mo210v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f831e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f832f.invoke(objArr[i2], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
