package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2879 extends AbstractC2878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f9102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2952 f9104;

    public C2879(AbstractC2952 abstractC2952, JSONPathFilter$Operator jSONPathFilter$Operator, Object obj) {
        this.f9104 = abstractC2952;
        this.f9103 = jSONPathFilter$Operator;
        this.f9102 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5955(com.alibaba.fastjson2.C2926 r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4 = 0
            if (r5 != 0) goto L4
            goto L46
        L4:
            com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世 r0 = new com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世
            r1 = 0
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r2 = r3.f9104
            r0.<init>(r1, r1, r2, r1)
            r0.f9270 = r5
            r2.mo5953(r0)
            java.lang.Object r5 = r0.f9269
            java.lang.Object r0 = r3.f9102
            int r5 = com.alibaba.fastjson2.util.AbstractC2867.m5923(r5, r0)
            com.alibaba.fastjson2.JSONPathFilter$Operator r3 = r3.f9103
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
            lin.xposed.hook.javaplugin.C5554.m10882()
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2879.mo5955(com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世, java.lang.Object):boolean");
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
        throw new JSONException(AbstractC0053.m154(C2879.class, "UnsupportedOperation "));
    }
}
