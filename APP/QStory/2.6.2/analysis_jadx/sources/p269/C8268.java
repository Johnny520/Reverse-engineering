package p269;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8268 extends AbstractC7738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f22886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f22887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f22889 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method f22888 = Class.class.getMethod("getRecordComponents", null);

    public C8268() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f22887 = cls.getMethod("getName", null);
        this.f22886 = cls.getMethod("getType", null);
    }

    @Override // p175.AbstractC7738
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final boolean mo13060(Class cls) {
        try {
            return ((Boolean) this.f22889.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            C0276.m847("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // p175.AbstractC7738
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final String[] mo13061(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22888.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f22887.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            C0276.m847("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p175.AbstractC7738
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Method mo13062(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            C0276.m847("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p175.AbstractC7738
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Constructor mo13063(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22888.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f22886.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            C0276.m847("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
