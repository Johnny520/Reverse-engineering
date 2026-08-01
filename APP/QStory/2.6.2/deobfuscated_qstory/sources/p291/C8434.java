package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8434 extends AbstractC8443 {
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        String strM6041;
        List list = (List) mo13976(obj);
        if (list == null) {
            abstractC2896.mo5922();
            return;
        }
        boolean zM6028 = abstractC2896.m6028();
        if (zM6028 && (strM6041 = abstractC2896.m6041(list, this.f23627)) != null) {
            abstractC2896.mo5975(strM6041);
            abstractC2896.m6037(list);
        } else {
            m13992(abstractC2896, list);
            if (zM6028) {
                abstractC2896.m6037(list);
            }
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        List list = (List) mo13976(obj);
        C2894 c2894 = abstractC2896.f9176;
        if (list == null) {
            long j = this.f23620 | c2894.f9151;
            if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j) == 0) {
                return false;
            }
            m14059(abstractC2896);
            abstractC2896.mo5993(j);
            return true;
        }
        String strM6042 = abstractC2896.m6042(this, list);
        if (strM6042 != null) {
            m14059(abstractC2896);
            abstractC2896.mo5975(strM6042);
            abstractC2896.m6037(list);
            return true;
        }
        if (this.f23355 == String.class) {
            m13993(abstractC2896, list);
        } else {
            m13995(abstractC2896, list);
        }
        abstractC2896.m6037(list);
        return true;
    }
}
