package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9272 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9272 f23715 = new C9272();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23714 = InterfaceC3745.m6915("[Long");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23713 = AbstractC3693.m6334("[Long");

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(f23713, f23714);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Long[] lArr = (Long[]) obj;
        abstractC3730.mo6600(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                abstractC3730.mo6527();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC3730.mo6582(jLongValue);
                } else {
                    abstractC3730.mo6523(jLongValue);
                }
            }
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
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Long[] lArr = (Long[]) obj;
        abstractC3730.mo6559();
        for (int i = 0; i < lArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            Long l = lArr[i];
            if (l == null) {
                abstractC3730.mo6527();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC3730.mo6582(jLongValue);
                } else {
                    abstractC3730.mo6523(jLongValue);
                }
            }
        }
        abstractC3730.mo6555();
    }
}
