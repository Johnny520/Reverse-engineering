package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2681 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2681 f8150 = new C2681(Object[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8149 = AbstractC2860.m5774("[O");

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2681.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        AbstractC2899 abstractC28992;
        long j2;
        Object objValueOf;
        if (abstractC2899.mo6183() == -110) {
            abstractC28992 = abstractC2899;
            j2 = j;
            InterfaceC2788 interfaceC2788Mo6164 = abstractC28992.mo6164(f8149, j2, Object[].class);
            if (interfaceC2788Mo6164 != this) {
                return interfaceC2788Mo6164.mo5467(abstractC28992, type, obj, j2);
            }
        } else {
            abstractC28992 = abstractC2899;
            j2 = j;
        }
        int iMo6232 = abstractC28992.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Object[] objArr = new Object[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            byte bMo6183 = abstractC28992.mo6183();
            if (bMo6183 >= 73 && bMo6183 <= 125) {
                objValueOf = abstractC28992.mo6184();
            } else if (bMo6183 == -110) {
                InterfaceC2788 interfaceC2788Mo61642 = abstractC28992.mo6164(0L, j2, Object.class);
                if (interfaceC2788Mo61642 != null) {
                    long j3 = j2;
                    AbstractC2899 abstractC28993 = abstractC28992;
                    objValueOf = interfaceC2788Mo61642.mo5467(abstractC28993, null, null, j3);
                    abstractC28992 = abstractC28993;
                    j2 = j3;
                } else {
                    objValueOf = abstractC28992.mo6124();
                }
            } else if (bMo6183 == -81) {
                abstractC28992.mo6173();
                objValueOf = null;
            } else if (bMo6183 == -79) {
                abstractC28992.mo6173();
                objValueOf = Boolean.TRUE;
            } else if (bMo6183 == -80) {
                abstractC28992.mo6173();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = bMo6183 == -66 ? Long.valueOf(abstractC28992.mo6209()) : abstractC28992.mo6124();
            }
            objArr[i] = objValueOf;
        }
        return objArr;
    }
}
