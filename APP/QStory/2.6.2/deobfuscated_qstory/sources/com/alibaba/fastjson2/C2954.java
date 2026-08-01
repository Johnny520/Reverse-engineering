package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2859;
import java.util.Collection;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2954 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9354 = AbstractC2859.m5729(Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9353 = AbstractC2859.m5729("");

    public C2954(String str, long j) {
        this.f9356 = str;
        this.f9355 = j;
    }

    public final String toString() {
        return ".." + this.f9356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m6363() {
        long j = f9354;
        long j2 = this.f9355;
        return j2 == j || j2 == f9353;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6364(com.alibaba.fastjson2.AbstractC2898 r10, com.alibaba.fastjson2.JSONArray r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2954.m6364(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.JSONArray):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        JSONArray jSONArray = new JSONArray();
        (m6363() ? new C2957(this, c2925, jSONArray) : new C2956(this, c2925, jSONArray)).accept(obj);
        if (jSONArray.size() == 1 && (jSONArray.get(0) instanceof Collection)) {
            c2925.f9267 = jSONArray.get(0);
        } else {
            c2925.f9267 = jSONArray;
        }
        Object obj2 = c2925.f9267;
        if ((obj2 instanceof List) && (c2925.f9269 instanceof AbstractC2877)) {
            c2925.f9267 = new C2920((List) obj2);
        }
        c2925.f9273 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        JSONArray jSONArray = new JSONArray();
        m6364(abstractC2898, jSONArray);
        c2925.f9267 = jSONArray;
        c2925.f9273 = true;
    }
}
