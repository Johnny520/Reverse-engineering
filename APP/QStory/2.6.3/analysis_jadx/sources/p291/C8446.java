package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8446 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8446 f23380 = new C8446(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23379 = InterfaceC2912.m6355("[J");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23378 = AbstractC2860.m5774("[J");

    public C8446(Function function) {
        this.f23381 = function;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23378, f23379);
        }
        Function function = this.f23381;
        long[] jArr = function != null ? (long[]) function.apply(obj) : (long[]) obj;
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC2897.mo6050(jArr);
        } else {
            abstractC2897.mo5965(jArr);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        abstractC2897.f9178.f9154.getClass();
        Function function = this.f23381;
        abstractC2897.mo5965(function != null ? (long[]) function.apply(obj) : (long[]) obj);
    }
}
