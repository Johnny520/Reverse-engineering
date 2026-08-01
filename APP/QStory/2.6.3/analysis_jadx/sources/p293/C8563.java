package p293;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8563 implements LongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Constructor f23905;

    public C8563(Constructor constructor) {
        this.f23905 = constructor;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        try {
            return this.f23905.newInstance(Long.valueOf(j));
        } catch (Exception e) {
            C0276.m843("createInstance error", e);
            return null;
        }
    }
}
