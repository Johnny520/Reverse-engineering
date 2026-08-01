package p309;

import androidx.collection.C1123;
import java.lang.reflect.Method;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9397 implements ToLongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f24258;

    public C9397(Method method) {
        this.f24258 = method;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        try {
            return ((Long) this.f24258.invoke(obj, null)).longValue();
        } catch (Exception e) {
            C1123.m1403("applyAsLong error", e);
            return 0L;
        }
    }
}
