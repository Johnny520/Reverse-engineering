package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8504 extends C8511 {
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        try {
            return this.f23612.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C2941.m6343("invoke getter method error, ", this.f23627, e);
            return null;
        }
    }

    @Override // p291.C8511, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        Enum r7 = (Enum) mo13976(obj);
        if (r7 != null) {
            m14066(abstractC2896, r7);
            return true;
        }
        if (((abstractC2896.f9176.f9151 | this.f23620) & JSONWriter$Feature.WriteNulls.mask) == 0) {
            return false;
        }
        m14059(abstractC2896);
        abstractC2896.mo5922();
        return true;
    }
}
