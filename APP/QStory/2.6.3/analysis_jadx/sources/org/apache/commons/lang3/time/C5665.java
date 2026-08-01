package org.apache.commons.lang3.time;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5665 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f15575;

    public C5665(Object... objArr) {
        this.f15575 = objArr;
        this.f15574 = Objects.hash(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5665.class == obj.getClass()) {
            return Arrays.deepEquals(this.f15575, ((C5665) obj).f15575);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15574;
    }
}
