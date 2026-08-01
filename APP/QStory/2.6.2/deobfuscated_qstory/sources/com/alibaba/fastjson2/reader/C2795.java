package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2795 f8647 = new C2795(Long[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8646 = AbstractC2859.m5729("[String");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6140();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        String[] strArr = new String[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            strArr[i] = next == null ? null : next instanceof String ? (String) next : next.toString();
            i++;
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6140();
    }
}
