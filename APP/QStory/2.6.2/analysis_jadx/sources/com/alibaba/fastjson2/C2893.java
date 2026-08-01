package com.alibaba.fastjson2;

import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2893 f9142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2893 f9143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f9144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2893 f9147;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2893 f9141 = new C2893((C2893) null, "$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2893 f9140 = new C2893((C2893) null, "#");

    public C2893(C2893 c2893, String str) {
        this.f9147 = c2893;
        this.f9146 = str;
        this.f9145 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2893.class == obj.getClass()) {
            C2893 c2893 = (C2893) obj;
            if (this.f9145 == c2893.f9145 && Objects.equals(this.f9147, c2893.f9147) && Objects.equals(this.f9146, c2893.f9146)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9147, this.f9146, Integer.valueOf(this.f9145));
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2893.toString():java.lang.String");
    }

    public C2893(C2893 c2893, int i) {
        this.f9147 = c2893;
        this.f9146 = null;
        this.f9145 = i;
    }
}
