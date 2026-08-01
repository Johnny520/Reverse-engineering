package androidx.compose.ui.semantics;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5702;

    public C1939(int i, int i2) {
        this.f5702 = i;
        this.f5701 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1939)) {
            return false;
        }
        C1939 c1939 = (C1939) obj;
        return this.f5702 == c1939.f5702 && this.f5701 == c1939.f5701;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5701) + (Integer.hashCode(this.f5702) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f5702);
        sb.append(", columnCount=");
        return AbstractC0053.m154(sb, this.f5701, ')');
    }
}
