package yyds;

/* JADX INFO: renamed from: yyds.ᛸᲇᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long f9609;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f9610;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f9611;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f9612;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f9613;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f9614;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f9615;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f9616;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f9617;

    public C1899(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, long j, int i6) {
        this.f9612 = i;
        this.f9613 = i2;
        this.f9615 = i3;
        this.f9617 = i4;
        this.f9611 = i5;
        this.f9616 = z;
        this.f9614 = z2;
        this.f9609 = j;
        this.f9610 = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899)) {
            return false;
        }
        C1899 c1899 = (C1899) obj;
        return this.f9612 == c1899.f9612 && this.f9613 == c1899.f9613 && this.f9615 == c1899.f9615 && this.f9617 == c1899.f9617 && this.f9611 == c1899.f9611 && this.f9616 == c1899.f9616 && this.f9614 == c1899.f9614 && this.f9609 == c1899.f9609 && this.f9610 == c1899.f9610;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9610) + ((Long.hashCode(this.f9609) + AbstractC2104.m4021(AbstractC2104.m4021(AbstractC2104.m4018(this.f9611, AbstractC2104.m4018(this.f9617, AbstractC2104.m4018(this.f9615, AbstractC2104.m4018(this.f9613, Integer.hashCode(this.f9612) * 31, 31), 31), 31), 31), 31, this.f9616), 31, this.f9614)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1722423192486766L));
        AbstractC2104.m4007(sb, this.f9612, -1722504796865390L);
        AbstractC2104.m4007(sb, this.f9613, -1722552041505646L);
        AbstractC2104.m4007(sb, this.f9615, -1722590696211310L);
        AbstractC2104.m4007(sb, this.f9617, -1722633645884270L);
        AbstractC2104.m4007(sb, this.f9611, -1722693775426414L);
        AbstractC2104.m4017(sb, this.f9616, -1722753904968558L);
        AbstractC2104.m4017(sb, this.f9614, -1722852689216366L);
        AbstractC0897.m1994(sb, this.f9609, -1722912818758510L);
        return AbstractC0897.m1999(sb, this.f9610, ')');
    }
}
