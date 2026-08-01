package p293;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8571 implements LongFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Constructor f23914;

    public C8571(Constructor constructor) {
        this.f23914 = constructor;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        try {
            return this.f23914.newInstance(Long.valueOf(j));
        } catch (Exception e) {
            C0276.m842("createInstance error", e);
            return null;
        }
    }
}
