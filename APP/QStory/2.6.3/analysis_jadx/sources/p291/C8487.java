package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8487 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8487 f23565 = new C8487();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23564 = InterfaceC2912.m6355("[BigDecimal");

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(-2138534155605614069L, f23564);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC2897.mo6040(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            abstractC2897.mo5990(bigDecimal, 0L, null);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!abstractC2897.m6074(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) {
                abstractC2897.mo5967();
                return;
            } else {
                abstractC2897.mo5999();
                abstractC2897.mo5995();
                return;
            }
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < bigDecimalArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            abstractC2897.mo5990(bigDecimalArr[i], 0L, null);
        }
        abstractC2897.mo5995();
    }
}
