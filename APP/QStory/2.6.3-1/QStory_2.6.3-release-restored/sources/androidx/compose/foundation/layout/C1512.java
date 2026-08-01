package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1512 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f2210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f2211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2213;

    public C1512(int i, int i2, int i3, int i4) {
        this.f2213 = i;
        this.f2212 = i2;
        this.f2211 = i3;
        this.f2210 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512)) {
            return false;
        }
        C1512 c1512 = (C1512) obj;
        return this.f2213 == c1512.f2213 && this.f2212 == c1512.f2212 && this.f2211 == c1512.f2211 && this.f2210 == c1512.f2210;
    }

    public final int hashCode() {
        return (((((this.f2213 * 31) + this.f2212) * 31) + this.f2211) * 31) + this.f2210;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f2213);
        sb.append(", top=");
        sb.append(this.f2212);
        sb.append(", right=");
        sb.append(this.f2211);
        sb.append(", bottom=");
        return AbstractC0900.m716(sb, this.f2210, ')');
    }
}
