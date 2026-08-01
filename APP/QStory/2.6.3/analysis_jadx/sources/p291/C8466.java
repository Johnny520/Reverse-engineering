package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8466 extends C8524 {
    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        abstractC2897.getClass();
        abstractC2897.mo6043(this.f23727, this.f23728);
        List list = this.f23713;
        int size = list.size();
        abstractC2897.mo5997();
        for (int i = 0; i < size; i++) {
            ((AbstractC8494) list.get(i)).mo13999(abstractC2897, obj);
        }
        abstractC2897.mo5994();
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.f9171) {
            mo5678(abstractC2897, obj, obj2, type, j);
            return;
        }
        if (mo14097(abstractC2897)) {
            m14099(abstractC2897, obj, null, null, 0L);
            return;
        }
        abstractC2897.mo5997();
        if ((abstractC2897.m6078(j) & (JSONWriter$Feature.WriteClassName.mask | JSONWriter$Feature.WriteThrowableClassName.mask)) != 0) {
            m14100(abstractC2897);
        }
        Iterator it = this.f23713.iterator();
        while (it.hasNext()) {
            ((AbstractC8494) it.next()).mo13999(abstractC2897, obj);
        }
        abstractC2897.mo5994();
    }
}
