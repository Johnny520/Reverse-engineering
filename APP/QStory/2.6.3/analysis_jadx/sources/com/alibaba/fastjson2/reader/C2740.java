package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2740 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8377 = AbstractC2860.m5774("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8376 = AbstractC2860.m5774("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Field m5536(String str, String str2, long j) {
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m850("ClassForName not support");
            return null;
        }
        try {
            return AbstractC2867.m5929(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            C0276.m843("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo5462(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6232() == 2) {
            return m5536(abstractC2899.mo6184(), abstractC2899.mo6184(), abstractC2899.f9201.f9320 | j);
        }
        C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6148 = abstractC2899.mo6148();
        boolean z = abstractC2899.f9199;
        String strMo6184 = null;
        if (!zMo6148) {
            if (abstractC2899.m6172(j)) {
                return z ? mo5462(abstractC2899, type, obj, j) : mo5537(abstractC2899, type, obj, j);
            }
            C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
            return null;
        }
        String strMo61842 = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == f8377) {
                strMo61842 = abstractC2899.mo6184();
            } else if (jMo6129 == f8376) {
                strMo6184 = abstractC2899.mo6184();
            } else {
                abstractC2899.mo6233();
            }
        }
        if (!z) {
            abstractC2899.mo6145();
        }
        return m5536(strMo6184, strMo61842, abstractC2899.f9201.f9320 | j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo5537(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6141()) {
            C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
            return null;
        }
        String strMo6184 = abstractC2899.mo6184();
        String strMo61842 = abstractC2899.mo6184();
        if (abstractC2899.mo6142()) {
            abstractC2899.mo6145();
            return m5536(strMo61842, strMo6184, abstractC2899.f9201.f9320 | j);
        }
        C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }
}
