package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8496 extends C8503 {
    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        try {
            return this.f23603.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C2942.m6401("invoke getter method error, ", this.f23618, e);
            return null;
        }
    }

    @Override // p291.C8503, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        Enum r7 = (Enum) mo13995(obj);
        if (r7 != null) {
            m14085(abstractC2897, r7);
            return true;
        }
        if (((abstractC2897.f9178.f9153 | this.f23611) & JSONWriter$Feature.WriteNulls.mask) == 0) {
            return false;
        }
        m14078(abstractC2897);
        abstractC2897.mo5967();
        return true;
    }
}
