package p309;

import androidx.collection.C1123;
import java.lang.reflect.Constructor;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9392 implements LongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Constructor f24250;

    public C9392(Constructor constructor) {
        this.f24250 = constructor;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        try {
            return this.f24250.newInstance(Long.valueOf(j));
        } catch (Exception e) {
            C1123.m1403("createInstance error", e);
            return null;
        }
    }
}
