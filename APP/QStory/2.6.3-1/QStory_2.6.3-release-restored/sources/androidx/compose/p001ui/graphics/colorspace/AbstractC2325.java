package androidx.compose.p001ui.graphics.colorspace;

import androidx.activity.AbstractC0900;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4582;

    public AbstractC2325(int i, long j, String str) {
        this.f4582 = str;
        this.f4581 = j;
        this.f4580 = i;
        if (str.length() == 0) {
            C6755.m11869("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C6755.m11869("The id must be between -1 and 63");
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
        AbstractC2325 abstractC2325 = (AbstractC2325) obj;
        if (this.f4580 == abstractC2325.f4580 && this.f4582.equals(abstractC2325.f4582)) {
            return AbstractC2336.m3228(this.f4581, abstractC2325.f4581);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0900.m702(this.f4582.hashCode() * 31, 31, this.f4581) + this.f4580;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4582);
        sb.append(" (id=");
        sb.append(this.f4580);
        sb.append(", model=");
        long j = this.f4581;
        sb.append((Object) (AbstractC2336.m3228(j, 12884901888L) ? "Rgb" : AbstractC2336.m3228(j, 12884901889L) ? "Xyz" : AbstractC2336.m3228(j, 12884901890L) ? "Lab" : AbstractC2336.m3228(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract long mo3221(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract float mo3222(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract long mo3223(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean mo3224() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract float mo3225(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract float mo3226(int i);
}
