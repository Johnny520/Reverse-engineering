package p241t2;

import com.bumptech.glide.AbstractC1923e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3210b extends AbstractC1923e {

    /* JADX INFO: renamed from: d */
    public final Method f9988d = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: e */
    public final Method f9989e = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: f */
    public final Method f9990f;

    /* JADX INFO: renamed from: g */
    public final Method f9991g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3210b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f9990f = cls.getMethod("getName", null);
        this.f9991g = cls.getMethod("getType", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1923e
    /* JADX INFO: renamed from: C */
    public final String[] mo3487C(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f9989e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                strArr[i5] = (String) this.f9990f.invoke(objArr[i5], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1923e
    /* JADX INFO: renamed from: I */
    public final boolean mo3488I(Class cls) {
        try {
            return ((Boolean) this.f9988d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1923e
    /* JADX INFO: renamed from: x */
    public final Method mo3489x(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1923e
    /* JADX INFO: renamed from: z */
    public final Constructor mo3490z(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f9989e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                clsArr[i5] = (Class) this.f9991g.invoke(objArr[i5], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }
}
