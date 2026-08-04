package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛱᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1016 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f4608;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f4609;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f4610;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f4611;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f4612;

    public C1016(int i, String str, int i2, String str2, String str3) {
        AbstractC2328.m4341(-1607691731108718L);
        AbstractC2328.m4341(-1607708910977902L);
        AbstractC2328.m4341(-1607730385814382L);
        this.f4609 = str;
        this.f4610 = str2;
        this.f4611 = str3;
        this.f4612 = i;
        this.f4608 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1016)) {
            return false;
        }
        C1016 c1016 = (C1016) obj;
        return this.f4609.equals(c1016.f4609) && this.f4610.equals(c1016.f4610) && this.f4611.equals(c1016.f4611) && this.f4612 == c1016.f4612 && this.f4608 == c1016.f4608;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4608) + AbstractC2104.m4018(this.f4612, AbstractC0897.m1997(this.f4611, AbstractC0897.m1997(this.f4610, this.f4609.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1607811990193006L));
        AbstractC0897.m2002(sb, this.f4609, -1607872119735150L);
        AbstractC0897.m2002(sb, this.f4610, -1607906479473518L);
        AbstractC0897.m2002(sb, this.f4611, -1607940839211886L);
        AbstractC2104.m4007(sb, this.f4612, -1608009558688622L);
        return AbstractC0897.m1999(sb, this.f4608, ')');
    }
}
