package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401ko {

    /* JADX INFO: renamed from: a */
    public final String f3222a;

    /* JADX INFO: renamed from: b */
    public final int f3223b;

    /* JADX INFO: renamed from: c */
    public final int f3224c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0401ko(int i, int i2, String str) {
        this.f3222a = str;
        this.f3223b = i;
        this.f3224c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0401ko)) {
            return false;
        }
        C0401ko c0401ko = (C0401ko) obj;
        return this.f3222a.equals(c0401ko.f3222a) && this.f3223b == c0401ko.f3223b && this.f3224c == c0401ko.f3224c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f3223b);
        Integer numValueOf2 = Integer.valueOf(this.f3224c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f3222a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f3222a.hashCode()) + " displayWidth=" + this.f3223b + " displayHeight=" + this.f3224c + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
