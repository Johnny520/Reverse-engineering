package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2859;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import p291.AbstractC8502;
import p291.C8547;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2937 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f9311 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f9312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f9313;

    public C2937(String[] strArr) {
        this.f9313 = strArr;
        this.f9312 = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.f9312[i] = AbstractC2859.m5729(strArr[i]);
            this.f9311.add(strArr[i]);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        boolean z = obj instanceof Map;
        int i = 0;
        String[] strArr = this.f9313;
        if (z) {
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(strArr.length);
            int length = strArr.length;
            while (i < length) {
                jSONArray.add(map.get(strArr[i]));
                i++;
            }
            c2925.f9267 = jSONArray;
            return;
        }
        if (obj instanceof Collection) {
            c2925.f9267 = obj;
            return;
        }
        C8547 c8547 = c2925.f9272.m6321().f9152;
        Class<?> cls = obj.getClass();
        InterfaceC8531 interfaceC8531M14087 = c8547.m14087(cls, cls, false);
        JSONArray jSONArray2 = new JSONArray(strArr.length);
        while (i < strArr.length) {
            AbstractC8502 abstractC8502Mo14072 = interfaceC8531M14087.mo14072(this.f9312[i]);
            jSONArray2.add(abstractC8502Mo14072 != null ? abstractC8502Mo14072.mo13976(obj) : null);
            i++;
        }
        c2925.f9267 = jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson2.C2938) == false) goto L12;
     */
    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5909(com.alibaba.fastjson2.AbstractC2898 r8, com.alibaba.fastjson2.C2925 r9) {
        /*
            r7 = this;
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = r9.f9271
            if (r0 == 0) goto L16
            boolean r1 = r0.f9273
            if (r1 != 0) goto L12
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r0 = r0.f9270
            boolean r1 = r0 instanceof com.alibaba.fastjson2.AbstractC2877
            if (r1 != 0) goto L12
            boolean r0 = r0 instanceof com.alibaba.fastjson2.C2938
            if (r0 == 0) goto L16
        L12:
            r7.mo5908(r9)
            return
        L16:
            java.lang.Object r8 = r8.mo6078()
            boolean r0 = r8 instanceof java.util.Map
            r1 = 0
            java.lang.String[] r7 = r7.f9313
            if (r0 == 0) goto L3b
            java.util.Map r8 = (java.util.Map) r8
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            int r2 = r7.length
            r0.<init>(r2)
            int r2 = r7.length
        L2a:
            if (r1 >= r2) goto L38
            r3 = r7[r1]
            java.lang.Object r3 = r8.get(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L2a
        L38:
            r9.f9267 = r0
            return
        L3b:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L82
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r0 = r9.f9269
            if (r0 != 0) goto L7f
            java.util.Collection r8 = (java.util.Collection) r8
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            int r2 = r8.size()
            r0.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L52:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r8.next()
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto L52
            java.util.Map r2 = (java.util.Map) r2
            com.alibaba.fastjson2.JSONArray r3 = new com.alibaba.fastjson2.JSONArray
            int r4 = r7.length
            r3.<init>(r4)
            int r4 = r7.length
            r5 = r1
        L6a:
            if (r5 >= r4) goto L78
            r6 = r7[r5]
            java.lang.Object r6 = r2.get(r6)
            r3.add(r6)
            int r5 = r5 + 1
            goto L6a
        L78:
            r0.add(r3)
            goto L52
        L7c:
            r9.f9267 = r0
            return
        L7f:
            r9.f9267 = r8
            return
        L82:
            java.lang.String r7 = "UnsupportedOperation "
            java.lang.Class<com.alibaba.fastjson2.飘花落叶言子苏世哲楪兰> r8 = com.alibaba.fastjson2.C2937.class
            java.lang.String r7 = p383.AbstractC9032.m14590(r8, r7)
            androidx.collection.C0276.m849(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2937.mo5909(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}
