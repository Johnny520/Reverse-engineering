package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2876 extends AbstractC2878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2952 f9095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2952 f9097;

    public C2876(AbstractC2952 abstractC2952, JSONPathFilter$Operator jSONPathFilter$Operator, AbstractC2952 abstractC29522) {
        this.f9097 = abstractC2952;
        this.f9096 = jSONPathFilter$Operator;
        this.f9095 = abstractC29522;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5955(com.alibaba.fastjson2.C2926 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5 = 0
            if (r6 != 0) goto L4
            goto L52
        L4:
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            r1 = 0
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r2 = r4.f9097
            r0.<init>(r1, r1, r2, r1)
            r0.f9270 = r6
            r2.mo5953(r0)
            java.lang.Object r0 = r0.f9269
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r2 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r3 = r4.f9095
            r2.<init>(r1, r1, r3, r1)
            r2.f9270 = r6
            r3.mo5953(r2)
            java.lang.Object r6 = r2.f9269
            int r6 = com.alibaba.fastjson2.util.AbstractC2867.m5923(r0, r6)
            com.alibaba.fastjson2.JSONPathFilter$Operator r4 = r4.f9096
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
            lin.xposed.hook.javaplugin.C5554.m10882()
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2876.mo5955(com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世, java.lang.Object):boolean");
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (!(obj instanceof List)) {
            C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("UnsupportedOperation ")));
            return;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (mo5955(c2926, obj2)) {
                jSONArray.add(obj2);
            }
        }
        c2926.f9269 = jSONArray;
        c2926.f9275 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        throw new JSONException(AbstractC0053.m154(C2876.class, "UnsupportedOperation "));
    }
}
