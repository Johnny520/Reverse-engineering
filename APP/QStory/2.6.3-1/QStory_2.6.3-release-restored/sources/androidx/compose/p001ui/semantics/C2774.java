package androidx.compose.p001ui.semantics;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2774 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6048;

    public C2774(int i, int i2) {
        this.f6048 = i;
        this.f6047 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2774)) {
            return false;
        }
        C2774 c2774 = (C2774) obj;
        return this.f6048 == c2774.f6048 && this.f6047 == c2774.f6047;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6047) + (Integer.hashCode(this.f6048) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f6048);
        sb.append(", columnCount=");
        return AbstractC0900.m716(sb, this.f6047, ')');
    }
}
