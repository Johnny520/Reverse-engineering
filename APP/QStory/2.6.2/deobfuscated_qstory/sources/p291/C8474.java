package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8474 extends C8532 {
    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        abstractC2896.getClass();
        abstractC2896.mo5998(this.f23736, this.f23737);
        List list = this.f23722;
        int size = list.size();
        abstractC2896.mo5952();
        for (int i = 0; i < size; i++) {
            ((AbstractC8502) list.get(i)).mo13980(abstractC2896, obj);
        }
        abstractC2896.mo5949();
    }

    @Override // p291.C8532, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.f9169) {
            mo5633(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (mo14078(abstractC2896)) {
            m14080(abstractC2896, obj, null, null, 0L);
            return;
        }
        abstractC2896.mo5952();
        if ((abstractC2896.m6032(j) & (JSONWriter$Feature.WriteClassName.mask | JSONWriter$Feature.WriteThrowableClassName.mask)) != 0) {
            m14081(abstractC2896);
        }
        Iterator it = this.f23722.iterator();
        while (it.hasNext()) {
            ((AbstractC8502) it.next()).mo13980(abstractC2896, obj);
        }
        abstractC2896.mo5949();
    }
}
