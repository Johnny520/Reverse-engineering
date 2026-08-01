package p291;

import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.util.AbstractC2853;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8516 extends AbstractC8497 {
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return Boolean.valueOf(m14069(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m14069(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return false;
        }
        try {
            long j = this.f23611;
            return j != -1 ? AbstractC2853.f8919.getBoolean(obj, j) : this.f23622.getBoolean(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("field.get error, ", str, e);
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("field.get error, ", str, e);
            return false;
        }
    }
}
