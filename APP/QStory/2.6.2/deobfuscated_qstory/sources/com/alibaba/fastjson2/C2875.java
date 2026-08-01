package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.util.List;
import p383.AbstractC9032;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2875 extends AbstractC2877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2951 f9093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2951 f9095;

    public C2875(AbstractC2951 abstractC2951, JSONPathFilter$Operator jSONPathFilter$Operator, AbstractC2951 abstractC29512) {
        this.f9095 = abstractC2951;
        this.f9094 = jSONPathFilter$Operator;
        this.f9093 = abstractC29512;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5910(com.alibaba.fastjson2.C2925 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5 = 0
            if (r6 != 0) goto L4
            goto L52
        L4:
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            r1 = 0
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r2 = r4.f9095
            r0.<init>(r1, r1, r2, r1)
            r0.f9268 = r6
            r2.mo5908(r0)
            java.lang.Object r0 = r0.f9267
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r2 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r3 = r4.f9093
            r2.<init>(r1, r1, r3, r1)
            r2.f9268 = r6
            r3.mo5908(r2)
            java.lang.Object r6 = r2.f9267
            int r6 = com.alibaba.fastjson2.util.AbstractC2866.m5878(r0, r6)
            com.alibaba.fastjson2.JSONPathFilter$Operator r4 = r4.f9094
            int r4 = r4.ordinal()
            r0 = 1
            if (r4 == 0) goto L4f
            if (r4 == r0) goto L4c
            r1 = 2
            if (r4 == r1) goto L49
            r1 = 3
            if (r4 == r1) goto L46
            r1 = 4
            if (r4 == r1) goto L43
            r1 = 5
            if (r4 != r1) goto L3f
            if (r6 > 0) goto L52
            goto L51
        L3f:
            lin.xposed.hook.javaplugin.C5553.m10825()
            return r5
        L43:
            if (r6 >= 0) goto L52
            goto L51
        L46:
            if (r6 < 0) goto L52
            goto L51
        L49:
            if (r6 <= 0) goto L52
            goto L51
        L4c:
            if (r6 == 0) goto L52
            goto L51
        L4f:
            if (r6 != 0) goto L52
        L51:
            return r0
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2875.mo5910(com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世, java.lang.Object):boolean");
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        if (!(obj instanceof List)) {
            C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("UnsupportedOperation ")));
            return;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (mo5910(c2925, obj2)) {
                jSONArray.add(obj2);
            }
        }
        c2925.f9267 = jSONArray;
        c2925.f9273 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        throw new JSONException(AbstractC9032.m14590(C2875.class, "UnsupportedOperation "));
    }
}
