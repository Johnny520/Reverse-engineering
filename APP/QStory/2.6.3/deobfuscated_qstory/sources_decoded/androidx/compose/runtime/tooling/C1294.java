package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6344;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f3781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f3782;

    public C1294(int i, AbstractC6344 abstractC6344, Integer num) {
        this.f3782 = i;
        this.f3781 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294)) {
            return false;
        }
        C1294 c1294 = (C1294) obj;
        return this.f3782 == c1294.f3782 && AbstractC4395.m8907(null, null) && AbstractC4395.m8907(this.f3781, c1294.f3781);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f3782) * 31) + 0) * 31;
        Integer num = this.f3781;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f3782 + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f3781 + ')';
    }
}
