package com.alibaba.fastjson2;

import androidx.collection.C0276;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2936 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9310;

    public C2936(int i, int i2) {
        this.f9310 = i;
        this.f9309 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        JSONArray jSONArray = new JSONArray();
        boolean z = obj instanceof List;
        int i = this.f9310;
        int i2 = 0;
        int i3 = this.f9309;
        if (z) {
            List list = (List) obj;
            int size = list.size();
            while (i2 < size) {
                int i4 = i >= 0 ? i2 : i2 - size;
                if (i4 >= i && i4 < i3) {
                    jSONArray.add(list.get(i2));
                }
                i2++;
            }
            c2926.f9269 = jSONArray;
            c2926.f9275 = true;
            return;
        }
        if (!(obj instanceof Object[])) {
            C0276.m850("TODO");
            return;
        }
        Object[] objArr = (Object[]) obj;
        while (i2 < objArr.length) {
            if ((i2 >= i && i2 <= i3) || (i2 - objArr.length > i && i2 - objArr.length <= i3)) {
                jSONArray.add(objArr[i2]);
            }
            i2++;
        }
        c2926.f9269 = jSONArray;
        c2926.f9275 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r7, com.alibaba.fastjson2.C2926 r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2936.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}
