package yyds;

import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᛳᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3259;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f3260;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f3261;

    public C0688(String str, int i, int i2) {
        this.f3259 = str;
        this.f3260 = i;
        this.f3261 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0688)) {
            return false;
        }
        C0688 c0688 = (C0688) obj;
        return this.f3259.equals(c0688.f3259) && this.f3260 == c0688.f3260 && this.f3261 == c0688.f3261;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f3260);
        Integer numValueOf2 = Integer.valueOf(this.f3261);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f3259, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f3259.hashCode()) + " displayWidth=" + this.f3260 + " displayHeight=" + this.f3261 + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
