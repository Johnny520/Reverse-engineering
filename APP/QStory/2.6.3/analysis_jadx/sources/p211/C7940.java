package p211;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.vector.C1543;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1543 f21975;

    public C7940(C1543 c1543, int i) {
        this.f21975 = c1543;
        this.f21974 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7940)) {
            return false;
        }
        C7940 c7940 = (C7940) obj;
        return this.f21975.equals(c7940.f21975) && this.f21974 == c7940.f21974;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21974) + (this.f21975.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f21975);
        sb.append(", configFlags=");
        return AbstractC0053.m156(sb, this.f21974, ')');
    }
}
