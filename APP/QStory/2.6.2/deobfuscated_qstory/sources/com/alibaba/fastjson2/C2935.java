package com.alibaba.fastjson2;

import androidx.collection.C0276;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2935 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9308;

    public C2935(int i, int i2) {
        this.f9308 = i;
        this.f9307 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        JSONArray jSONArray = new JSONArray();
        boolean z = obj instanceof List;
        int i = this.f9308;
        int i2 = 0;
        int i3 = this.f9307;
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
            c2925.f9267 = jSONArray;
            c2925.f9273 = true;
            return;
        }
        if (!(obj instanceof Object[])) {
            C0276.m849("TODO");
            return;
        }
        Object[] objArr = (Object[]) obj;
        while (i2 < objArr.length) {
            if ((i2 >= i && i2 <= i3) || (i2 - objArr.length > i && i2 - objArr.length <= i3)) {
                jSONArray.add(objArr[i2]);
            }
            i2++;
        }
        c2925.f9267 = jSONArray;
        c2925.f9273 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5909(com.alibaba.fastjson2.AbstractC2898 r7, com.alibaba.fastjson2.C2925 r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2935.mo5909(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}
