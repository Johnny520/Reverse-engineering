package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8525 extends C8532 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC8502 f23678;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC8502 f23679;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC8502 f23680;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC8502 f23681;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC8502 f23682;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC8502 f23683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC8502 f23684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC8502 f23685;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC8502 f23686;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC8502 f23687;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC8502 f23688;

    public C8525(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23684 = (AbstractC8502) list.get(0);
        this.f23687 = (AbstractC8502) list.get(1);
        this.f23688 = (AbstractC8502) list.get(2);
        this.f23685 = (AbstractC8502) list.get(3);
        this.f23686 = (AbstractC8502) list.get(4);
        this.f23683 = (AbstractC8502) list.get(5);
        this.f23682 = (AbstractC8502) list.get(6);
        this.f23681 = (AbstractC8502) list.get(7);
        this.f23680 = (AbstractC8502) list.get(8);
        this.f23679 = (AbstractC8502) list.get(9);
        this.f23678 = (AbstractC8502) list.get(10);
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC8502 mo14072(long j) {
        AbstractC8502 abstractC8502 = this.f23684;
        if (j == abstractC8502.f23609) {
            return abstractC8502;
        }
        AbstractC8502 abstractC85022 = this.f23687;
        if (j == abstractC85022.f23609) {
            return abstractC85022;
        }
        AbstractC8502 abstractC85023 = this.f23688;
        if (j == abstractC85023.f23609) {
            return abstractC85023;
        }
        AbstractC8502 abstractC85024 = this.f23685;
        if (j == abstractC85024.f23609) {
            return abstractC85024;
        }
        AbstractC8502 abstractC85025 = this.f23686;
        if (j == abstractC85025.f23609) {
            return abstractC85025;
        }
        AbstractC8502 abstractC85026 = this.f23683;
        if (j == abstractC85026.f23609) {
            return abstractC85026;
        }
        AbstractC8502 abstractC85027 = this.f23682;
        if (j == abstractC85027.f23609) {
            return abstractC85027;
        }
        AbstractC8502 abstractC85028 = this.f23681;
        if (j == abstractC85028.f23609) {
            return abstractC85028;
        }
        AbstractC8502 abstractC85029 = this.f23680;
        if (j == abstractC85029.f23609) {
            return abstractC85029;
        }
        AbstractC8502 abstractC850210 = this.f23679;
        if (j == abstractC850210.f23609) {
            return abstractC850210;
        }
        AbstractC8502 abstractC850211 = this.f23678;
        if (j == abstractC850211.f23609) {
            return abstractC850211;
        }
        return null;
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        long j2 = j | this.f23727;
        long j3 = j2 | abstractC2896.f9176.f9151;
        boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
        if (abstractC2896.f9169) {
            if (z) {
                mo13999(abstractC2896, obj, type, j);
                return;
            } else {
                mo5633(abstractC2896, obj, obj2, type, j);
                return;
            }
        }
        if (z) {
            mo14000(abstractC2896, obj, obj2, type, j2);
            return;
        }
        if (!this.f23728) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14082();
                throw null;
            }
            if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j3) != 0) {
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
        this.f23684.mo13980(abstractC2896, obj);
        this.f23687.mo13980(abstractC2896, obj);
        this.f23688.mo13980(abstractC2896, obj);
        this.f23685.mo13980(abstractC2896, obj);
        this.f23686.mo13980(abstractC2896, obj);
        this.f23683.mo13980(abstractC2896, obj);
        this.f23682.mo13980(abstractC2896, obj);
        this.f23681.mo13980(abstractC2896, obj);
        this.f23680.mo13980(abstractC2896, obj);
        this.f23679.mo13980(abstractC2896, obj);
        this.f23678.mo13980(abstractC2896, obj);
        abstractC2896.mo5949();
    }
}
