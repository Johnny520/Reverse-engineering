package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8497 extends AbstractC8519 {
    @Override // p291.AbstractC8519, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        try {
            boolean zBooleanValue = ((Boolean) mo13976(obj)).booleanValue();
            if (!zBooleanValue) {
                long j = abstractC2896.f9176.f9151 | this.f23620;
                if (this.f23602 == null && (j & JSONWriter$Feature.NotWriteDefaultValue.mask) != 0) {
                    return false;
                }
            }
            m14071(abstractC2896, zBooleanValue);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2896.m6026()) {
                return false;
            }
            throw e;
        }
    }
}
