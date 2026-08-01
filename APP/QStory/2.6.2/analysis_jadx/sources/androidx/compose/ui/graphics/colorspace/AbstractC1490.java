package androidx.compose.ui.graphics.colorspace;

import androidx.activity.AbstractC0053;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4236;

    public AbstractC1490(int i, long j, String str) {
        this.f4236 = str;
        this.f4235 = j;
        this.f4234 = i;
        if (str.length() == 0) {
            C5919.m11249("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C5919.m11249("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1490 abstractC1490 = (AbstractC1490) obj;
        if (this.f4234 == abstractC1490.f4234 && this.f4236.equals(abstractC1490.f4236)) {
            return AbstractC1501.m2658(this.f4235, abstractC1490.f4235);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0053.m141(this.f4236.hashCode() * 31, 31, this.f4235) + this.f4234;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4236);
        sb.append(" (id=");
        sb.append(this.f4234);
        sb.append(", model=");
        long j = this.f4235;
        sb.append((Object) (AbstractC1501.m2658(j, 12884901888L) ? "Rgb" : AbstractC1501.m2658(j, 12884901889L) ? "Xyz" : AbstractC1501.m2658(j, 12884901890L) ? "Lab" : AbstractC1501.m2658(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract long mo2651(float f, float f2, float f3, float f4, AbstractC1490 abstractC1490);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract float mo2652(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract long mo2653(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean mo2654() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract float mo2655(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract float mo2656(int i);
}
