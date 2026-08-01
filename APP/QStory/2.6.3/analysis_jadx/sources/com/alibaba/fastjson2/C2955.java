package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2860;
import java.util.Collection;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2955 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9356 = AbstractC2860.m5774(Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9355 = AbstractC2860.m5774("");

    public C2955(String str, long j) {
        this.f9358 = str;
        this.f9357 = j;
    }

    public final String toString() {
        return ".." + this.f9358;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m6421() {
        long j = f9356;
        long j2 = this.f9357;
        return j2 == j || j2 == f9355;
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
    public final void m6422(com.alibaba.fastjson2.AbstractC2899 r10, com.alibaba.fastjson2.JSONArray r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2955.m6422(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.JSONArray):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        JSONArray jSONArray = new JSONArray();
        (m6421() ? new C2958(this, c2926, jSONArray) : new C2957(this, c2926, jSONArray)).accept(obj);
        if (jSONArray.size() == 1 && (jSONArray.get(0) instanceof Collection)) {
            c2926.f9269 = jSONArray.get(0);
        } else {
            c2926.f9269 = jSONArray;
        }
        Object obj2 = c2926.f9269;
        if ((obj2 instanceof List) && (c2926.f9271 instanceof AbstractC2878)) {
            c2926.f9269 = new C2921((List) obj2);
        }
        c2926.f9275 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        JSONArray jSONArray = new JSONArray();
        m6422(abstractC2899, jSONArray);
        c2926.f9269 = jSONArray;
        c2926.f9275 = true;
    }
}
