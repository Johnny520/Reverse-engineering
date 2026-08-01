package p285;

import androidx.collection.C1123;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9098 extends AbstractC8568 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Method f23230;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Method f23233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f23232 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f23231 = Class.class.getMethod("getRecordComponents", null);

    public C9098() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f23230 = cls.getMethod("getName", null);
        this.f23233 = cls.getMethod("getType", null);
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final String[] mo13647(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f23231.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f23230.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            C1123.m1408("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final boolean mo13648(Class cls) {
        try {
            return ((Boolean) this.f23232.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            C1123.m1408("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Constructor mo13649(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f23231.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f23233.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            C1123.m1408("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Method mo13650(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            C1123.m1408("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
