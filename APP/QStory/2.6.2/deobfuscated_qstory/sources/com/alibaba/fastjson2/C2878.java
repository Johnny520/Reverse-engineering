package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.util.List;
import p383.AbstractC9032;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2878 extends AbstractC2877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f9100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2951 f9102;

    public C2878(AbstractC2951 abstractC2951, JSONPathFilter$Operator jSONPathFilter$Operator, Object obj) {
        this.f9102 = abstractC2951;
        this.f9101 = jSONPathFilter$Operator;
        this.f9100 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5910(com.alibaba.fastjson2.C2925 r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4 = 0
            if (r5 != 0) goto L4
            goto L46
        L4:
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            r1 = 0
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r2 = r3.f9102
            r0.<init>(r1, r1, r2, r1)
            r0.f9268 = r5
            r2.mo5908(r0)
            java.lang.Object r5 = r0.f9267
            java.lang.Object r0 = r3.f9100
            int r5 = com.alibaba.fastjson2.util.AbstractC2866.m5878(r5, r0)
            com.alibaba.fastjson2.JSONPathFilter$Operator r3 = r3.f9101
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 == 0) goto L43
            if (r3 == r0) goto L40
            r1 = 2
            if (r3 == r1) goto L3d
            r1 = 3
            if (r3 == r1) goto L3a
            r1 = 4
            if (r3 == r1) goto L37
            r1 = 5
            if (r3 != r1) goto L33
            if (r5 > 0) goto L46
            goto L45
        L33:
            lin.xposed.hook.javaplugin.C5553.m10825()
            return r4
        L37:
            if (r5 >= 0) goto L46
            goto L45
        L3a:
            if (r5 < 0) goto L46
            goto L45
        L3d:
            if (r5 <= 0) goto L46
            goto L45
        L40:
            if (r5 == 0) goto L46
            goto L45
        L43:
            if (r5 != 0) goto L46
        L45:
            return r0
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2878.mo5910(com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世, java.lang.Object):boolean");
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
        throw new JSONException(AbstractC9032.m14590(C2878.class, "UnsupportedOperation "));
    }
}
