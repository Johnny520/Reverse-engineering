package p229r1;

import java.util.Objects;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3073e {

    /* JADX INFO: renamed from: a */
    public final String f9785a;

    /* JADX INFO: renamed from: b */
    public final int f9786b;

    /* JADX INFO: renamed from: c */
    public final int f9787c;

    public C3073e(int i5, int i6, String str) {
        this.f9785a = str;
        this.f9786b = i5;
        this.f9787c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3073e)) {
            return false;
        }
        C3073e c3073e = (C3073e) obj;
        return Objects.equals(this.f9785a, c3073e.f9785a) && this.f9786b == c3073e.f9786b && this.f9787c == c3073e.f9787c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f9786b);
        Integer numValueOf2 = Integer.valueOf(this.f9787c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f9785a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f9785a;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f9786b);
        sb.append(" displayHeight=");
        sb.append(this.f9787c);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
