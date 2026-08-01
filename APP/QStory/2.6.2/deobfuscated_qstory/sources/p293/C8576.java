package p293;

import androidx.collection.C0276;
import java.lang.reflect.Method;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8576 implements ToLongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f23922;

    public C8576(Method method) {
        this.f23922 = method;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        try {
            return ((Long) this.f23922.invoke(obj, null)).longValue();
        } catch (Exception e) {
            C0276.m842("applyAsLong error", e);
            return 0L;
        }
    }
}
