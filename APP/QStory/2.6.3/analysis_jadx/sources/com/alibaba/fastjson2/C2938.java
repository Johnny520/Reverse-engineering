package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2860;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import p291.AbstractC8494;
import p291.C8539;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2938 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f9313 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f9314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f9315;

    public C2938(String[] strArr) {
        this.f9315 = strArr;
        this.f9314 = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.f9314[i] = AbstractC2860.m5774(strArr[i]);
            this.f9313.add(strArr[i]);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        boolean z = obj instanceof Map;
        int i = 0;
        String[] strArr = this.f9315;
        if (z) {
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(strArr.length);
            int length = strArr.length;
            while (i < length) {
                jSONArray.add(map.get(strArr[i]));
                i++;
            }
            c2926.f9269 = jSONArray;
            return;
        }
        if (obj instanceof Collection) {
            c2926.f9269 = obj;
            return;
        }
        C8539 c8539 = c2926.f9274.m6379().f9154;
        Class<?> cls = obj.getClass();
        InterfaceC8523 interfaceC8523M14106 = c8539.m14106(cls, cls, false);
        JSONArray jSONArray2 = new JSONArray(strArr.length);
        while (i < strArr.length) {
            AbstractC8494 abstractC8494Mo14091 = interfaceC8523M14106.mo14091(this.f9314[i]);
            jSONArray2.add(abstractC8494Mo14091 != null ? abstractC8494Mo14091.mo13995(obj) : null);
            i++;
        }
        c2926.f9269 = jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson2.C2939) == false) goto L12;
     */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r8, com.alibaba.fastjson2.C2926 r9) {
        /*
            r7 = this;
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = r9.f9273
            if (r0 == 0) goto L16
            boolean r1 = r0.f9275
            if (r1 != 0) goto L12
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r0 = r0.f9272
            boolean r1 = r0 instanceof com.alibaba.fastjson2.AbstractC2878
            if (r1 != 0) goto L12
            boolean r0 = r0 instanceof com.alibaba.fastjson2.C2939
            if (r0 == 0) goto L16
        L12:
            r7.mo5953(r9)
            return
        L16:
            java.lang.Object r8 = r8.mo6124()
            boolean r0 = r8 instanceof java.util.Map
            r1 = 0
            java.lang.String[] r7 = r7.f9315
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
            r9.f9269 = r0
            return
        L3b:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L82
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r0 = r9.f9271
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
            r9.f9269 = r0
            return
        L7f:
            r9.f9269 = r8
            return
        L82:
            java.lang.String r7 = "UnsupportedOperation "
            java.lang.Class<com.alibaba.fastjson2.飘花落叶言子苏世哲楪兰> r8 = com.alibaba.fastjson2.C2938.class
            java.lang.String r7 = androidx.activity.AbstractC0053.m154(r8, r7)
            androidx.collection.C0276.m850(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2938.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}
