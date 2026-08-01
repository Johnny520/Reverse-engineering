package org.apache.commons.lang3.time;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f15575;

    public C5664(Object... objArr) {
        this.f15575 = objArr;
        this.f15574 = Objects.hash(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5664.class == obj.getClass()) {
            return Arrays.deepEquals(this.f15575, ((C5664) obj).f15575);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15574;
    }
}
