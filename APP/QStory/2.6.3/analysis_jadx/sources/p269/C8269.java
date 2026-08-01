package p269;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8269 extends AbstractC7739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Method f22885;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Method f22888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f22887 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f22886 = Class.class.getMethod("getRecordComponents", null);

    public C8269() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f22885 = cls.getMethod("getName", null);
        this.f22888 = cls.getMethod("getType", null);
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final String[] mo13088(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22886.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f22885.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            C0276.m848("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final boolean mo13089(Class cls) {
        try {
            return ((Boolean) this.f22887.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            C0276.m848("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Constructor mo13090(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22886.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f22888.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            C0276.m848("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Method mo13091(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            C0276.m848("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
