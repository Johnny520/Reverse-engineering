package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0671 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f1865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f1866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1868;

    public C0671(int i, int i2, int i3, int i4) {
        this.f1868 = i;
        this.f1867 = i2;
        this.f1866 = i3;
        this.f1865 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0671)) {
            return false;
        }
        C0671 c0671 = (C0671) obj;
        return this.f1868 == c0671.f1868 && this.f1867 == c0671.f1867 && this.f1866 == c0671.f1866 && this.f1865 == c0671.f1865;
    }

    public final int hashCode() {
        return (((((this.f1868 * 31) + this.f1867) * 31) + this.f1866) * 31) + this.f1865;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f1868);
        sb.append(", top=");
        sb.append(this.f1867);
        sb.append(", right=");
        sb.append(this.f1866);
        sb.append(", bottom=");
        return AbstractC0053.m156(sb, this.f1865, ')');
    }
}
