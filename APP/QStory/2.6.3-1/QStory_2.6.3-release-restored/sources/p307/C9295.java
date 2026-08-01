package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9295 extends C9353 {
    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        abstractC3730.getClass();
        abstractC3730.mo6603(this.f24072, this.f24073);
        List list = this.f24058;
        int size = list.size();
        abstractC3730.mo6557();
        for (int i = 0; i < size; i++) {
            ((AbstractC9323) list.get(i)).mo14558(abstractC3730, obj);
        }
        abstractC3730.mo6554();
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.f9516) {
            mo6238(abstractC3730, obj, obj2, type, j);
            return;
        }
        if (mo14656(abstractC3730)) {
            m14658(abstractC3730, obj, null, null, 0L);
            return;
        }
        abstractC3730.mo6557();
        if ((abstractC3730.m6638(j) & (JSONWriter$Feature.WriteClassName.mask | JSONWriter$Feature.WriteThrowableClassName.mask)) != 0) {
            m14659(abstractC3730);
        }
        Iterator it = this.f24058.iterator();
        while (it.hasNext()) {
            ((AbstractC9323) it.next()).mo14558(abstractC3730, obj);
        }
        abstractC3730.mo6554();
    }
}
