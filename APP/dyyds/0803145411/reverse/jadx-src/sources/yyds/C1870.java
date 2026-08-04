package yyds;

import android.graphics.Insets;

/* JADX INFO: renamed from: yyds.ᛸᲀᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1870 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1870 f9412 = new C1870(0, 0, 0, 0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f9413;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f9414;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f9415;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f9416;

    public C1870(int i, int i2, int i3, int i4) {
        this.f9413 = i;
        this.f9414 = i2;
        this.f9415 = i3;
        this.f9416 = i4;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1870 m3654(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f9412 : new C1870(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1870 m3655(Insets insets) {
        return m3654(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1870.class != obj.getClass()) {
            return false;
        }
        C1870 c1870 = (C1870) obj;
        return this.f9416 == c1870.f9416 && this.f9413 == c1870.f9413 && this.f9415 == c1870.f9415 && this.f9414 == c1870.f9414;
    }

    public final int hashCode() {
        return (((((this.f9413 * 31) + this.f9414) * 31) + this.f9415) * 31) + this.f9416;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f9413);
        sb.append(", top=");
        sb.append(this.f9414);
        sb.append(", right=");
        sb.append(this.f9415);
        sb.append(", bottom=");
        return AbstractC0897.m1999(sb, this.f9416, '}');
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Insets m3656() {
        return Insets.of(this.f9413, this.f9414, this.f9415, this.f9416);
    }
}
