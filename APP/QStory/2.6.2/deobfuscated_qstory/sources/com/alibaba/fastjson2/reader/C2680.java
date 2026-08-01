package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2680 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2680 f8148 = new C2680(Object[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8147 = AbstractC2859.m5729("[O");

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2680.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        AbstractC2898 abstractC28982;
        long j2;
        Object objValueOf;
        if (abstractC2898.mo6138() == -110) {
            abstractC28982 = abstractC2898;
            j2 = j;
            InterfaceC2787 interfaceC2787Mo6118 = abstractC28982.mo6118(f8147, j2, Object[].class);
            if (interfaceC2787Mo6118 != this) {
                return interfaceC2787Mo6118.mo5422(abstractC28982, type, obj, j2);
            }
        } else {
            abstractC28982 = abstractC2898;
            j2 = j;
        }
        int iMo6187 = abstractC28982.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        Object[] objArr = new Object[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            byte bMo6138 = abstractC28982.mo6138();
            if (bMo6138 >= 73 && bMo6138 <= 125) {
                objValueOf = abstractC28982.mo6139();
            } else if (bMo6138 == -110) {
                InterfaceC2787 interfaceC2787Mo61182 = abstractC28982.mo6118(0L, j2, Object.class);
                if (interfaceC2787Mo61182 != null) {
                    long j3 = j2;
                    AbstractC2898 abstractC28983 = abstractC28982;
                    objValueOf = interfaceC2787Mo61182.mo5422(abstractC28983, null, null, j3);
                    abstractC28982 = abstractC28983;
                    j2 = j3;
                } else {
                    objValueOf = abstractC28982.mo6078();
                }
            } else if (bMo6138 == -81) {
                abstractC28982.mo6127();
                objValueOf = null;
            } else if (bMo6138 == -79) {
                abstractC28982.mo6127();
                objValueOf = Boolean.TRUE;
            } else if (bMo6138 == -80) {
                abstractC28982.mo6127();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = bMo6138 == -66 ? Long.valueOf(abstractC28982.mo6164()) : abstractC28982.mo6078();
            }
            objArr[i] = objValueOf;
        }
        return objArr;
    }
}
