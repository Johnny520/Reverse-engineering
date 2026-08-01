package androidx.core.view;

import androidx.activity.AbstractC0053;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6567;

    public C2258(String str, int i, int i2) {
        this.f6567 = str;
        this.f6566 = i;
        this.f6565 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2258)) {
            return false;
        }
        C2258 c2258 = (C2258) obj;
        return this.f6567.equals(c2258.f6567) && this.f6566 == c2258.f6566 && this.f6565 == c2258.f6565;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f6566);
        Integer numValueOf2 = Integer.valueOf(this.f6565);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f6567, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f6567.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f6566);
        sb.append(" displayHeight=");
        return AbstractC0053.m147(sb, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", this.f6565);
    }
}
