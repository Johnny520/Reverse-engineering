package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8454 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f23407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DecimalFormat f23408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8454 f23406 = new C8454((DecimalFormat) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23405 = InterfaceC2912.m6355("[D");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23404 = AbstractC2860.m5774("[D");

    public C8454(DecimalFormat decimalFormat) {
        this.f23408 = decimalFormat;
        this.f23407 = null;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23404, f23405);
        }
        Function function = this.f23407;
        abstractC2897.mo5984((function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23407;
        double[] dArr = (function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj);
        DecimalFormat decimalFormat = this.f23408;
        if (decimalFormat == null) {
            abstractC2897.mo5984(dArr);
            return;
        }
        if (abstractC2897.f9171) {
            abstractC2897.mo5984(dArr);
            return;
        }
        if (dArr == null) {
            abstractC2897.mo5967();
            return;
        }
        abstractC2897.mo5999();
        for (int i = 0; i < dArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            abstractC2897.mo6009(decimalFormat.format(dArr[i]));
        }
        abstractC2897.mo5995();
    }

    public C8454(Function function) {
        this.f23407 = function;
        this.f23408 = null;
    }
}
