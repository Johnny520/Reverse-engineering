package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8455 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8455 f23411 = new C8455(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23410 = InterfaceC2912.m6355("[S");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23409 = AbstractC2860.m5774("[S");

    public C8455(Function function) {
        this.f23412 = function;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23409, f23410);
        }
        Function function = this.f23412;
        short[] sArr = (function == null || obj == null) ? (short[]) obj : (short[]) function.apply(obj);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC2897.mo6046(sArr);
        } else {
            abstractC2897.mo6030(sArr);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Function function = this.f23412;
        short[] sArr = function != null ? (short[]) function.apply(obj) : (short[]) obj;
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC2897.mo6046(sArr);
        } else {
            abstractC2897.mo6030(sArr);
        }
    }
}
