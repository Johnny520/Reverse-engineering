package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 {

    /* JADX INFO: renamed from: a */
    public final String f12911a;

    /* JADX INFO: renamed from: b */
    public final int f12912b;

    /* JADX INFO: renamed from: c */
    public final int f12913c;

    public x90(String str, int i, int i2) {
        this.f12911a = str;
        this.f12912b = i;
        this.f12913c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return this.f12911a.equals(x90Var.f12911a) && this.f12912b == x90Var.f12912b && this.f12913c == x90Var.f12913c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f12912b);
        Integer numValueOf2 = Integer.valueOf(this.f12913c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f12911a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f12911a.hashCode()) + " displayWidth=" + this.f12912b + " displayHeight=" + this.f12913c + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
