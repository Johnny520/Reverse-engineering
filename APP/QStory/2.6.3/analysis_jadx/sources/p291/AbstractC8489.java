package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8489 extends AbstractC8511 {
    @Override // p291.AbstractC8511, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        try {
            boolean zBooleanValue = ((Boolean) mo13995(obj)).booleanValue();
            if (!zBooleanValue) {
                long j = abstractC2897.f9178.f9153 | this.f23611;
                if (this.f23593 == null && (j & JSONWriter$Feature.NotWriteDefaultValue.mask) != 0) {
                    return false;
                }
            }
            m14090(abstractC2897, zBooleanValue);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2897.m6075()) {
                return false;
            }
            throw e;
        }
    }
}
