package p205;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7904 f21877 = new C7904(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21881;

    public C7904(int i, int i2, int i3, int i4) {
        this.f21881 = i;
        this.f21880 = i2;
        this.f21879 = i3;
        this.f21878 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7904)) {
            return false;
        }
        C7904 c7904 = (C7904) obj;
        return this.f21881 == c7904.f21881 && this.f21880 == c7904.f21880 && this.f21879 == c7904.f21879 && this.f21878 == c7904.f21878;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21878) + AbstractC0053.m143(this.f21879, AbstractC0053.m143(this.f21880, Integer.hashCode(this.f21881) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f21881);
        sb.append(", ");
        sb.append(this.f21880);
        sb.append(", ");
        sb.append(this.f21879);
        sb.append(", ");
        return AbstractC0053.m154(sb, this.f21878, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m13327() {
        return (((long) this.f21881) << 32) | (((long) this.f21880) & 4294967295L);
    }
}
