package p293;

import androidx.collection.C0276;
import java.lang.reflect.Method;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8569 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f23912;

    public C8569(Method method) {
        this.f23912 = method;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        try {
            return ((Integer) this.f23912.invoke(obj, null)).intValue();
        } catch (Exception e) {
            C0276.m842("applyAsInt error", e);
            return 0;
        }
    }
}
