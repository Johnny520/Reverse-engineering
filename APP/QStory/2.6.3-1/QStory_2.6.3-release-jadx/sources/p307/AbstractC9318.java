package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9318 extends AbstractC9340 {
    @Override // p307.AbstractC9340, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        try {
            boolean zBooleanValue = ((Boolean) mo14554(obj)).booleanValue();
            if (!zBooleanValue) {
                long j = abstractC3730.f9523.f9498 | this.f23956;
                if (this.f23938 == null && (j & JSONWriter$Feature.NotWriteDefaultValue.mask) != 0) {
                    return false;
                }
            }
            m14649(abstractC3730, zBooleanValue);
            return true;
        } catch (RuntimeException e) {
            if (abstractC3730.m6635()) {
                return false;
            }
            throw e;
        }
    }
}
