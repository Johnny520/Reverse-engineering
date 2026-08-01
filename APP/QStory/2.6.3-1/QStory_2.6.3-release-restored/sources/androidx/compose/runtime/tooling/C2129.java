package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7173;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f4126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4127;

    public C2129(int i, AbstractC7173 abstractC7173, Integer num) {
        this.f4127 = i;
        this.f4126 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2129)) {
            return false;
        }
        C2129 c2129 = (C2129) obj;
        return this.f4127 == c2129.f4127 && AbstractC5227.m9466(null, null) && AbstractC5227.m9466(this.f4126, c2129.f4126);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f4127) * 31) + 0) * 31;
        Integer num = this.f4126;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f4127 + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f4126 + ')';
    }
}
