package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2718 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2718 f8281 = new C2718(Class.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8280 = AbstractC2859.m5729("java.lang.Class");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        abstractC2898.mo6199();
        C2942 c2942 = abstractC2898.f9199;
        c2942.getClass();
        String strMo6055 = abstractC2898.mo6055();
        if (((c2942.f9318 | j) & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m849(abstractC2898.mo6124("not support ClassForName : " + strMo6055 + ", you can config 'JSONReader.Feature.SupportClassForName'"));
            return null;
        }
        Class cls = (Class) AbstractC2866.f9031.get(strMo6055);
        if (cls != null) {
            return cls;
        }
        Class clsM5579 = ((C2801) c2942.f9316).m5579(strMo6055, null, JSONReader$Feature.SupportAutoType.mask);
        if (clsM5579 != null) {
            return clsM5579;
        }
        C0276.m849(abstractC2898.mo6124("class not found " + strMo6055));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6097((byte) -110) || abstractC2898.mo6194() == f8280) {
            return mo5418(abstractC2898, type, obj, j);
        }
        C0276.m849(abstractC2898.mo6124("not support autoType : " + abstractC2898.mo6055()));
        return null;
    }
}
