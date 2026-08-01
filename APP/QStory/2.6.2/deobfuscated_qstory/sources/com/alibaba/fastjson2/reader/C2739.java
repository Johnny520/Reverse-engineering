package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2739 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8375 = AbstractC2859.m5729("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8374 = AbstractC2859.m5729("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Field m5491(String str, String str2, long j) {
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m849("ClassForName not support");
            return null;
        }
        try {
            return AbstractC2866.m5884(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            C0276.m842("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo5417(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6187() == 2) {
            return m5491(abstractC2898.mo6139(), abstractC2898.mo6139(), abstractC2898.f9199.f9318 | j);
        }
        C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean zMo6102 = abstractC2898.mo6102();
        boolean z = abstractC2898.f9197;
        String strMo6139 = null;
        if (!zMo6102) {
            if (abstractC2898.m6126(j)) {
                return z ? mo5417(abstractC2898, type, obj, j) : mo5492(abstractC2898, type, obj, j);
            }
            C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
            return null;
        }
        String strMo61392 = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == f8375) {
                strMo61392 = abstractC2898.mo6139();
            } else if (jMo6083 == f8374) {
                strMo6139 = abstractC2898.mo6139();
            } else {
                abstractC2898.mo6188();
            }
        }
        if (!z) {
            abstractC2898.mo6099();
        }
        return m5491(strMo6139, strMo61392, abstractC2898.f9199.f9318 | j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo5492(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6095()) {
            C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
            return null;
        }
        String strMo6139 = abstractC2898.mo6139();
        String strMo61392 = abstractC2898.mo6139();
        if (abstractC2898.mo6096()) {
            abstractC2898.mo6099();
            return m5491(strMo61392, strMo6139, abstractC2898.f9199.f9318 | j);
        }
        C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }
}
