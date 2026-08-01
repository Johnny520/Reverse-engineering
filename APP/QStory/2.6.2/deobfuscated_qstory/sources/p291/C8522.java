package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8522 extends C8532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC8502 f23662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC8502 f23663;

    public C8522(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23662 = (AbstractC8502) list.get(0);
        this.f23663 = (AbstractC8502) list.get(1);
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC8502 mo14072(long j) {
        AbstractC8502 abstractC8502 = this.f23662;
        if (j == abstractC8502.f23609) {
            return abstractC8502;
        }
        AbstractC8502 abstractC85022 = this.f23663;
        if (j == abstractC85022.f23609) {
            return abstractC85022;
        }
        return null;
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        long j2 = this.f23727 | j;
        long j3 = abstractC2896.f9176.f9151 | j2;
        if (abstractC2896.f9169) {
            if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
                mo13999(abstractC2896, obj, type, j);
                return;
            } else {
                mo5633(abstractC2896, obj, obj2, type, j);
                return;
            }
        }
        if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
            mo14000(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (!this.f23728) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14082();
                throw null;
            }
            if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                abstractC2896.mo5922();
                return;
            }
        }
        if (mo14078(abstractC2896)) {
            m14080(abstractC2896, obj, obj2, type, 0L);
            return;
        }
        abstractC2896.mo5952();
        if ((JSONWriter$Feature.WriteClassName.mask & j2) != 0 || abstractC2896.m6013(obj, j)) {
            m14081(abstractC2896);
        }
        this.f23662.mo13980(abstractC2896, obj);
        this.f23663.mo13980(abstractC2896, obj);
        abstractC2896.mo5949();
    }
}
