package p205;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7905 f21874 = new C7905(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21878;

    public C7905(int i, int i2, int i3, int i4) {
        this.f21878 = i;
        this.f21877 = i2;
        this.f21876 = i3;
        this.f21875 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7905)) {
            return false;
        }
        C7905 c7905 = (C7905) obj;
        return this.f21878 == c7905.f21878 && this.f21877 == c7905.f21877 && this.f21876 == c7905.f21876 && this.f21875 == c7905.f21875;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21875) + AbstractC0053.m144(this.f21876, AbstractC0053.m144(this.f21877, Integer.hashCode(this.f21878) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f21878);
        sb.append(", ");
        sb.append(this.f21877);
        sb.append(", ");
        sb.append(this.f21876);
        sb.append(", ");
        return AbstractC0053.m156(sb, this.f21875, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m13355() {
        return (((long) this.f21878) << 32) | (((long) this.f21877) & 4294967295L);
    }
}
