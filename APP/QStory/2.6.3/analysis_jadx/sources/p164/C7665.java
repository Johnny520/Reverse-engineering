package p164;

import android.graphics.Insets;
import androidx.activity.AbstractC0053;
import androidx.core.os.AbstractC2175;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7665 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7665 f20806 = new C7665(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20808;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20810;

    public C7665(int i, int i2, int i3, int i4) {
        this.f20810 = i;
        this.f20809 = i2;
        this.f20808 = i3;
        this.f20807 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7665 m12938(Insets insets) {
        return m12939(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7665 m12939(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f20806 : new C7665(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7665 m12940(C7665 c7665, C7665 c76652) {
        return m12939(Math.min(c7665.f20810, c76652.f20810), Math.min(c7665.f20809, c76652.f20809), Math.min(c7665.f20808, c76652.f20808), Math.min(c7665.f20807, c76652.f20807));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7665 m12941(C7665 c7665, C7665 c76652) {
        return m12939(Math.max(c7665.f20810, c76652.f20810), Math.max(c7665.f20809, c76652.f20809), Math.max(c7665.f20808, c76652.f20808), Math.max(c7665.f20807, c76652.f20807));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7665.class != obj.getClass()) {
            return false;
        }
        C7665 c7665 = (C7665) obj;
        return this.f20807 == c7665.f20807 && this.f20810 == c7665.f20810 && this.f20808 == c7665.f20808 && this.f20809 == c7665.f20809;
    }

    public final int hashCode() {
        return (((((this.f20810 * 31) + this.f20809) * 31) + this.f20808) * 31) + this.f20807;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f20810);
        sb.append(", top=");
        sb.append(this.f20809);
        sb.append(", right=");
        sb.append(this.f20808);
        sb.append(", bottom=");
        return AbstractC0053.m156(sb, this.f20807, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Insets m12942() {
        return AbstractC2175.m3971(this.f20810, this.f20809, this.f20808, this.f20807);
    }
}
