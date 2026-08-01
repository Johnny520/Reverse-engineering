package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8205 = AbstractC2860.m5774("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8204 = AbstractC2860.m5774("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8203 = AbstractC2860.m5774("parameterTypes");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Method m5504(AbstractC2899 abstractC2899, long j) {
        boolean zMo6148 = abstractC2899.mo6148();
        C2943 c2943 = abstractC2899.f9201;
        boolean z = abstractC2899.f9199;
        String strMo6184 = null;
        if (zMo6148) {
            String strMo61842 = null;
            List listMo6122 = null;
            while (!abstractC2899.mo6152()) {
                long jMo6129 = abstractC2899.mo6129();
                if (jMo6129 == f8205) {
                    strMo61842 = abstractC2899.mo6184();
                } else if (jMo6129 == f8204) {
                    strMo6184 = abstractC2899.mo6184();
                } else if (jMo6129 == f8203) {
                    listMo6122 = abstractC2899.mo6122(String.class);
                } else {
                    abstractC2899.mo6233();
                }
            }
            if (!z) {
                abstractC2899.mo6145();
            }
            return m5506(c2943.f9320 | j, strMo6184, strMo61842, listMo6122);
        }
        if (!abstractC2899.m6172(j)) {
            C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
            return null;
        }
        if (z) {
            return m5505(abstractC2899, j);
        }
        if (!abstractC2899.mo6141()) {
            C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
            return null;
        }
        String strMo61843 = abstractC2899.mo6184();
        String strMo61844 = abstractC2899.mo6184();
        List listMo61222 = abstractC2899.mo6122(String.class);
        if (abstractC2899.mo6142()) {
            abstractC2899.mo6145();
            return m5506(c2943.f9320 | j, strMo61844, strMo61843, listMo61222);
        }
        C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method m5505(AbstractC2899 abstractC2899, long j) {
        if (abstractC2899.mo6232() != 3) {
            C0276.m850("not support input ".concat(abstractC2899.mo6170(null)));
            return null;
        }
        String strMo6184 = abstractC2899.mo6184();
        return m5506(abstractC2899.f9201.f9320 | j, abstractC2899.mo6184(), strMo6184, abstractC2899.mo6122(String.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method m5506(long j, String str, String str2, List list) {
        Class<?>[] clsArr;
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m850("ClassForName not support");
            return null;
        }
        Class clsM5929 = AbstractC2867.m5929(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i = 0; i < list.size(); i++) {
                clsArr2[i] = AbstractC2867.m5929((String) list.get(i));
            }
            clsArr = clsArr2;
        }
        try {
            return clsM5929.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C0276.m843("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final /* bridge */ /* synthetic */ Object mo5462(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return m5505(abstractC2899, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ /* synthetic */ Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return m5504(abstractC2899, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return m5504(abstractC2899, j);
    }
}
