package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8463 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8463 f23420 = new C8463(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23419 = InterfaceC2911.m6297("[S");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23418 = AbstractC2859.m5729("[S");

    public C8463(Function function) {
        this.f23421 = function;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23418, f23419);
        }
        Function function = this.f23421;
        short[] sArr = (function == null || obj == null) ? (short[]) obj : (short[]) function.apply(obj);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC2896.mo6001(sArr);
        } else {
            abstractC2896.mo5985(sArr);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Function function = this.f23421;
        short[] sArr = function != null ? (short[]) function.apply(obj) : (short[]) obj;
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC2896.mo6001(sArr);
        } else {
            abstractC2896.mo5985(sArr);
        }
    }
}
