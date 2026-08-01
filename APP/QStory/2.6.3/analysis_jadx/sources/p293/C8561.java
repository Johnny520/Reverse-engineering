package p293;

import androidx.collection.C0276;
import java.lang.reflect.Method;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8561 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f23903;

    public C8561(Method method) {
        this.f23903 = method;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        try {
            return ((Integer) this.f23903.invoke(obj, null)).intValue();
        } catch (Exception e) {
            C0276.m843("applyAsInt error", e);
            return 0;
        }
    }
}
