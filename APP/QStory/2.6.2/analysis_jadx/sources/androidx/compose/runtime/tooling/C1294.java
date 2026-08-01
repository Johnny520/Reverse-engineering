package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC4394;
import p033.AbstractC6325;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f3780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f3781;

    public C1294(int i, AbstractC6325 abstractC6325, Integer num) {
        this.f3781 = i;
        this.f3780 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294)) {
            return false;
        }
        C1294 c1294 = (C1294) obj;
        return this.f3781 == c1294.f3781 && AbstractC4394.m8917(null, null) && AbstractC4394.m8917(this.f3780, c1294.f3780);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f3781) * 31) + 0) * 31;
        Integer num = this.f3780;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f3781 + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f3780 + ')';
    }
}
