package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8465 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f23428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DecimalFormat f23429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8465 f23427 = new C8465((Function) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23426 = InterfaceC2911.m6297("[F");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23425 = AbstractC2859.m5729("[F");

    public C8465(DecimalFormat decimalFormat) {
        this.f23429 = decimalFormat;
        this.f23428 = null;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23425, f23426);
        }
        Function function = this.f23428;
        abstractC2896.mo5941((function == null || obj == null) ? (float[]) obj : (float[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23428;
        float[] fArr = (function == null || obj == null) ? (float[]) obj : (float[]) function.apply(obj);
        DecimalFormat decimalFormat = this.f23429;
        if (decimalFormat == null) {
            abstractC2896.mo5941(fArr);
            return;
        }
        if (abstractC2896.f9169) {
            abstractC2896.mo5941(fArr);
            return;
        }
        if (fArr == null) {
            abstractC2896.mo5922();
            return;
        }
        abstractC2896.mo5954();
        for (int i = 0; i < fArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5964(decimalFormat.format(fArr[i]));
        }
        abstractC2896.mo5950();
    }

    public C8465(Function function) {
        this.f23428 = function;
        this.f23429 = null;
    }
}
