package p309;

import androidx.collection.C1123;
import java.lang.reflect.Method;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9390 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f24248;

    public C9390(Method method) {
        this.f24248 = method;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        try {
            return ((Integer) this.f24248.invoke(obj, null)).intValue();
        } catch (Exception e) {
            C1123.m1403("applyAsInt error", e);
            return 0;
        }
    }
}
