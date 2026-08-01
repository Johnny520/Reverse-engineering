package p309;

import androidx.collection.C1123;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9391 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f24249;

    public C9391(Method method) {
        this.f24249 = method;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        try {
            return this.f24249.invoke(null, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C1123.m1403("invoke error", e);
            return null;
        }
    }
}
