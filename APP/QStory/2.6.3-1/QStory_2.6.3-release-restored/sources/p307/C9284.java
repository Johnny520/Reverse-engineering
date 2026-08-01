package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9284 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9284 f23756 = new C9284(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23755 = InterfaceC3745.m6915("[S");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23754 = AbstractC3693.m6334("[S");

    public C9284(Function function) {
        this.f23757 = function;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(f23754, f23755);
        }
        Function function = this.f23757;
        short[] sArr = (function == null || obj == null) ? (short[]) obj : (short[]) function.apply(obj);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC3730.mo6606(sArr);
        } else {
            abstractC3730.mo6590(sArr);
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Function function = this.f23757;
        short[] sArr = function != null ? (short[]) function.apply(obj) : (short[]) obj;
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0) {
            abstractC3730.mo6606(sArr);
        } else {
            abstractC3730.mo6590(sArr);
        }
    }
}
