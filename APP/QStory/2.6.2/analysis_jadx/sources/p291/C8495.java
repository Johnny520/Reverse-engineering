package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8495 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8495 f23574 = new C8495();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23573 = InterfaceC2911.m6297("[BigDecimal");

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(-2138534155605614069L, f23573);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC2896.mo5995(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            abstractC2896.mo5945(bigDecimal, 0L, null);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!abstractC2896.m6029(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) {
                abstractC2896.mo5922();
                return;
            } else {
                abstractC2896.mo5954();
                abstractC2896.mo5950();
                return;
            }
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < bigDecimalArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5945(bigDecimalArr[i], 0L, null);
        }
        abstractC2896.mo5950();
    }
}
