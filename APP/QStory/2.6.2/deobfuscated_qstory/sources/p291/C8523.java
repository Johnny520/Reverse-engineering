package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8523 extends C8532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f23664 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Comparable f23665;

    public C8523(Class cls, String str, String str2, String str3, long j, ArrayList arrayList) {
        super(cls, str, str2, j, arrayList);
        this.f23665 = str3;
    }

    @Override // p291.C8532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject mo14073(Object obj, long j) {
        switch (this.f23664) {
            case 1:
                return JSONObject.of((String) this.f23665, (Object) super.mo14073(obj, j));
            default:
                return super.mo14073(obj, j);
        }
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC8502 mo14072(long j) {
        switch (this.f23664) {
            case 0:
                AbstractC8502 abstractC8502 = (AbstractC8502) this.f23665;
                if (j == abstractC8502.f23609) {
                    return abstractC8502;
                }
                return null;
            default:
                return super.mo14072(j);
        }
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        switch (this.f23664) {
            case 1:
                abstractC2896.mo5952();
                abstractC2896.mo5986((String) this.f23665);
                super.mo5633(abstractC2896, obj, obj2, type, j);
                abstractC2896.mo5949();
                break;
            default:
                super.mo5633(abstractC2896, obj, obj2, type, j);
                break;
        }
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int i = this.f23664;
        Comparable comparable = this.f23665;
        switch (i) {
            case 0:
                long j2 = j | this.f23727;
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
                if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC2896.m6013(obj, j)) {
                    m14081(abstractC2896);
                }
                ((AbstractC8502) comparable).mo13980(abstractC2896, obj);
                abstractC2896.mo5949();
                return;
            default:
                abstractC2896.mo5952();
                abstractC2896.mo5986((String) comparable);
                abstractC2896.mo5934();
                super.mo5634(abstractC2896, obj, obj2, type, j);
                abstractC2896.mo5949();
                return;
        }
    }

    public C8523(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23665 = (AbstractC8502) list.get(0);
    }
}
