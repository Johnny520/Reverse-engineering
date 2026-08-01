package androidx.compose.ui.graphics.colorspace;

import androidx.activity.AbstractC0053;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4237;

    public AbstractC1490(int i, long j, String str) {
        this.f4237 = str;
        this.f4236 = j;
        this.f4235 = i;
        if (str.length() == 0) {
            C5925.m11310("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C5925.m11310("The id must be between -1 and 63");
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
        if (this.f4235 == abstractC1490.f4235 && this.f4237.equals(abstractC1490.f4237)) {
            return AbstractC1501.m2668(this.f4236, abstractC1490.f4236);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0053.m142(this.f4237.hashCode() * 31, 31, this.f4236) + this.f4235;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4237);
        sb.append(" (id=");
        sb.append(this.f4235);
        sb.append(", model=");
        long j = this.f4236;
        sb.append((Object) (AbstractC1501.m2668(j, 12884901888L) ? "Rgb" : AbstractC1501.m2668(j, 12884901889L) ? "Xyz" : AbstractC1501.m2668(j, 12884901890L) ? "Lab" : AbstractC1501.m2668(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract long mo2661(float f, float f2, float f3, float f4, AbstractC1490 abstractC1490);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract float mo2662(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract long mo2663(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean mo2664() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract float mo2665(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract float mo2666(int i);
}
