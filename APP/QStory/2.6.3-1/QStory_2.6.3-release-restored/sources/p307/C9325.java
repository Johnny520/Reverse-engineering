package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9325 extends C9332 {
    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        try {
            return this.f23948.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C3775.m6961("invoke getter method error, ", this.f23963, e);
            return null;
        }
    }

    @Override // p307.C9332, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        Enum r7 = (Enum) mo14554(obj);
        if (r7 != null) {
            m14644(abstractC3730, r7);
            return true;
        }
        if (((abstractC3730.f9523.f9498 | this.f23956) & JSONWriter$Feature.WriteNulls.mask) == 0) {
            return false;
        }
        m14637(abstractC3730);
        abstractC3730.mo6527();
        return true;
    }
}
