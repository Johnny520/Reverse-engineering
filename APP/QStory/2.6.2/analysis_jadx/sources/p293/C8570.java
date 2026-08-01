package p293;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8570 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f23913;

    public C8570(Method method) {
        this.f23913 = method;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        try {
            return this.f23913.invoke(null, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m842("invoke error", e);
            return null;
        }
    }
}
