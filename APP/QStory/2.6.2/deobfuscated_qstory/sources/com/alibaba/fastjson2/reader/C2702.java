package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2702 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8203 = AbstractC2859.m5729("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8202 = AbstractC2859.m5729("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8201 = AbstractC2859.m5729("parameterTypes");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Method m5459(AbstractC2898 abstractC2898, long j) {
        boolean zMo6102 = abstractC2898.mo6102();
        C2942 c2942 = abstractC2898.f9199;
        boolean z = abstractC2898.f9197;
        String strMo6139 = null;
        if (zMo6102) {
            String strMo61392 = null;
            List listMo6076 = null;
            while (!abstractC2898.mo6106()) {
                long jMo6083 = abstractC2898.mo6083();
                if (jMo6083 == f8203) {
                    strMo61392 = abstractC2898.mo6139();
                } else if (jMo6083 == f8202) {
                    strMo6139 = abstractC2898.mo6139();
                } else if (jMo6083 == f8201) {
                    listMo6076 = abstractC2898.mo6076(String.class);
                } else {
                    abstractC2898.mo6188();
                }
            }
            if (!z) {
                abstractC2898.mo6099();
            }
            return m5461(c2942.f9318 | j, strMo6139, strMo61392, listMo6076);
        }
        if (!abstractC2898.m6126(j)) {
            C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
            return null;
        }
        if (z) {
            return m5460(abstractC2898, j);
        }
        if (!abstractC2898.mo6095()) {
            C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
            return null;
        }
        String strMo61393 = abstractC2898.mo6139();
        String strMo61394 = abstractC2898.mo6139();
        List listMo60762 = abstractC2898.mo6076(String.class);
        if (abstractC2898.mo6096()) {
            abstractC2898.mo6099();
            return m5461(c2942.f9318 | j, strMo61394, strMo61393, listMo60762);
        }
        C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method m5460(AbstractC2898 abstractC2898, long j) {
        if (abstractC2898.mo6187() != 3) {
            C0276.m849("not support input ".concat(abstractC2898.mo6124(null)));
            return null;
        }
        String strMo6139 = abstractC2898.mo6139();
        return m5461(abstractC2898.f9199.f9318 | j, abstractC2898.mo6139(), strMo6139, abstractC2898.mo6076(String.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method m5461(long j, String str, String str2, List list) {
        Class<?>[] clsArr;
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m849("ClassForName not support");
            return null;
        }
        Class clsM5884 = AbstractC2866.m5884(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i = 0; i < list.size(); i++) {
                clsArr2[i] = AbstractC2866.m5884((String) list.get(i));
            }
            clsArr = clsArr2;
        }
        try {
            return clsM5884.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C0276.m842("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final /* bridge */ /* synthetic */ Object mo5417(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return m5460(abstractC2898, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ /* synthetic */ Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return m5459(abstractC2898, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return m5459(abstractC2898, j);
    }
}
