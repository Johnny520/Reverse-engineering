package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8457 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f23419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DecimalFormat f23420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8457 f23418 = new C8457((Function) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23417 = InterfaceC2912.m6355("[F");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23416 = AbstractC2860.m5774("[F");

    public C8457(DecimalFormat decimalFormat) {
        this.f23420 = decimalFormat;
        this.f23419 = null;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23416, f23417);
        }
        Function function = this.f23419;
        abstractC2897.mo5986((function == null || obj == null) ? (float[]) obj : (float[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23419;
        float[] fArr = (function == null || obj == null) ? (float[]) obj : (float[]) function.apply(obj);
        DecimalFormat decimalFormat = this.f23420;
        if (decimalFormat == null) {
            abstractC2897.mo5986(fArr);
            return;
        }
        if (abstractC2897.f9171) {
            abstractC2897.mo5986(fArr);
            return;
        }
        if (fArr == null) {
            abstractC2897.mo5967();
            return;
        }
        abstractC2897.mo5999();
        for (int i = 0; i < fArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            abstractC2897.mo6009(decimalFormat.format(fArr[i]));
        }
        abstractC2897.mo5995();
    }

    public C8457(Function function) {
        this.f23419 = function;
        this.f23420 = null;
    }
}
