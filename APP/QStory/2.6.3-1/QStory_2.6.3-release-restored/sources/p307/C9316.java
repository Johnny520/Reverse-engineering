package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9316 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9316 f23910 = new C9316();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23909 = InterfaceC3745.m6915("[BigDecimal");

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(-2138534155605614069L, f23909);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC3730.mo6600(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            abstractC3730.mo6550(bigDecimal, 0L, null);
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!abstractC3730.m6634(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) {
                abstractC3730.mo6527();
                return;
            } else {
                abstractC3730.mo6559();
                abstractC3730.mo6555();
                return;
            }
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        abstractC3730.mo6559();
        for (int i = 0; i < bigDecimalArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            abstractC3730.mo6550(bigDecimalArr[i], 0L, null);
        }
        abstractC3730.mo6555();
    }
}
