package p293;

import androidx.collection.C0276;
import java.lang.reflect.Method;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8568 implements ToLongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f23913;

    public C8568(Method method) {
        this.f23913 = method;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        try {
            return ((Long) this.f23913.invoke(obj, null)).longValue();
        } catch (Exception e) {
            C0276.m843("applyAsLong error", e);
            return 0L;
        }
    }
}
