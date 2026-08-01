package androidx.core.view;

import androidx.activity.AbstractC0053;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6568;

    public C2258(String str, int i, int i2) {
        this.f6568 = str;
        this.f6567 = i;
        this.f6566 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2258)) {
            return false;
        }
        C2258 c2258 = (C2258) obj;
        return this.f6568.equals(c2258.f6568) && this.f6567 == c2258.f6567 && this.f6566 == c2258.f6566;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f6567);
        Integer numValueOf2 = Integer.valueOf(this.f6566);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f6568, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f6568.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f6567);
        sb.append(" displayHeight=");
        return AbstractC0053.m147(sb, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", this.f6566);
    }
}
