package p293;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8562 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f23904;

    public C8562(Method method) {
        this.f23904 = method;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        try {
            return this.f23904.invoke(null, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m843("invoke error", e);
            return null;
        }
    }
}
