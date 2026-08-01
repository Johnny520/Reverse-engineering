package org.apache.commons.lang3.time;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6495 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f15920;

    public C6495(Object... objArr) {
        this.f15920 = objArr;
        this.f15919 = Objects.hash(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6495.class == obj.getClass()) {
            return Arrays.deepEquals(this.f15920, ((C6495) obj).f15920);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15919;
    }
}
