package androidx.core.view;

import androidx.activity.AbstractC0900;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3091 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6913;

    public C3091(String str, int i, int i2) {
        this.f6913 = str;
        this.f6912 = i;
        this.f6911 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3091)) {
            return false;
        }
        C3091 c3091 = (C3091) obj;
        return this.f6913.equals(c3091.f6913) && this.f6912 == c3091.f6912 && this.f6911 == c3091.f6911;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f6912);
        Integer numValueOf2 = Integer.valueOf(this.f6911);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f6913, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f6913.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f6912);
        sb.append(" displayHeight=");
        return AbstractC0900.m707(sb, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", this.f6911);
    }
}
