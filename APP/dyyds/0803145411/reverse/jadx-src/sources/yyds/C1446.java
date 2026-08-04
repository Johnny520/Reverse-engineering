package yyds;

/* JADX INFO: renamed from: yyds.ᛶᲇᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1446 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f6860;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f6861;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f6862;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f6863;

    public C1446(int i, int i2, int i3, int i4) {
        this.f6860 = i;
        this.f6861 = i2;
        this.f6862 = i3;
        this.f6863 = i4;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1446 m2943(C1446 c1446, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = c1446.f6860;
        }
        if ((i5 & 2) != 0) {
            i2 = c1446.f6861;
        }
        if ((i5 & 4) != 0) {
            i3 = c1446.f6862;
        }
        if ((i5 & 8) != 0) {
            i4 = c1446.f6863;
        }
        c1446.getClass();
        return new C1446(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1446)) {
            return false;
        }
        C1446 c1446 = (C1446) obj;
        return this.f6860 == c1446.f6860 && this.f6861 == c1446.f6861 && this.f6862 == c1446.f6862 && this.f6863 == c1446.f6863;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6863) + AbstractC2104.m4018(this.f6862, AbstractC2104.m4018(this.f6861, Integer.hashCode(this.f6860) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-587941940986734L));
        AbstractC2104.m4007(sb, this.f6860, -588075084972910L);
        AbstractC2104.m4007(sb, this.f6861, -588105149743982L);
        AbstractC2104.m4007(sb, this.f6862, -588143804449646L);
        return AbstractC0897.m1999(sb, this.f6863, ')');
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m2944() {
        return this.f6863 - this.f6861;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m2945() {
        return this.f6862 - this.f6860;
    }
}
