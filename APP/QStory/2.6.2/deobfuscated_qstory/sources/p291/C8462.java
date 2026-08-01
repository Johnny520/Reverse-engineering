package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8462 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f23416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DecimalFormat f23417;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8462 f23415 = new C8462((DecimalFormat) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23414 = InterfaceC2911.m6297("[D");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23413 = AbstractC2859.m5729("[D");

    public C8462(DecimalFormat decimalFormat) {
        this.f23417 = decimalFormat;
        this.f23416 = null;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23413, f23414);
        }
        Function function = this.f23416;
        abstractC2896.mo5939((function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23416;
        double[] dArr = (function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj);
        DecimalFormat decimalFormat = this.f23417;
        if (decimalFormat == null) {
            abstractC2896.mo5939(dArr);
            return;
        }
        if (abstractC2896.f9169) {
            abstractC2896.mo5939(dArr);
            return;
        }
        if (dArr == null) {
            abstractC2896.mo5922();
            return;
        }
        abstractC2896.mo5954();
        for (int i = 0; i < dArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5964(decimalFormat.format(dArr[i]));
        }
        abstractC2896.mo5950();
    }

    public C8462(Function function) {
        this.f23416 = function;
        this.f23417 = null;
    }
}
