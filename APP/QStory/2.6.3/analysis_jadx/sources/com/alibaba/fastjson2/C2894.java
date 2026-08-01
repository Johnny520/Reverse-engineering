package com.alibaba.fastjson2;

import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2894 f9144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2894 f9145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f9146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2894 f9149;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2894 f9143 = new C2894((C2894) null, "$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2894 f9142 = new C2894((C2894) null, "#");

    public C2894(C2894 c2894, String str) {
        this.f9149 = c2894;
        this.f9148 = str;
        this.f9147 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2894.class == obj.getClass()) {
            C2894 c2894 = (C2894) obj;
            if (this.f9147 == c2894.f9147 && Objects.equals(this.f9149, c2894.f9149) && Objects.equals(this.f9148, c2894.f9148)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9149, this.f9148, Integer.valueOf(this.f9147));
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2894.toString():java.lang.String");
    }

    public C2894(C2894 c2894, int i) {
        this.f9149 = c2894;
        this.f9148 = null;
        this.f9147 = i;
    }
}
