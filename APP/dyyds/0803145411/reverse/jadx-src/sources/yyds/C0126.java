package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛵᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0126 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f822;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f823;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f824;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f825;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f826;

    public C0126(int i, int i2, int i3, int i4, int i5) {
        this.f823 = i;
        this.f824 = i2;
        this.f825 = i3;
        this.f826 = i4;
        this.f822 = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0126)) {
            return false;
        }
        C0126 c0126 = (C0126) obj;
        return this.f823 == c0126.f823 && this.f824 == c0126.f824 && this.f825 == c0126.f825 && this.f826 == c0126.f826 && this.f822 == c0126.f822;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f822) + AbstractC2104.m4018(this.f826, AbstractC2104.m4018(this.f825, AbstractC2104.m4018(this.f824, Integer.hashCode(this.f823) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-973282111816558L));
        AbstractC2104.m4007(sb, this.f823, -973445320573806L);
        AbstractC2104.m4007(sb, this.f824, -973544104821614L);
        AbstractC2104.m4007(sb, this.f825, -973617119265646L);
        AbstractC2104.m4007(sb, this.f826, -973677248807790L);
        return AbstractC0897.m1999(sb, this.f822, ')');
    }
}
