package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛵᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0343 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f1794;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f1795;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f1796;

    public C0343(int i, int i2, boolean z) {
        this.f1794 = i;
        this.f1795 = i2;
        this.f1796 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0343)) {
            return false;
        }
        C0343 c0343 = (C0343) obj;
        return this.f1794 == c0343.f1794 && this.f1795 == c0343.f1795 && this.f1796 == c0343.f1796;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1796) + AbstractC2104.m4018(this.f1795, Integer.hashCode(this.f1794) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1728118319121262L));
        AbstractC2104.m4007(sb, this.f1794, -1728264348009326L);
        AbstractC2104.m4007(sb, this.f1795, -1728328772518766L);
        return AbstractC0897.m1986(sb, this.f1796, ')');
    }
}
