package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛱᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1014 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4604;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f4605;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f4606;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f4607;

    public C1014(boolean z, String str, String str2, int i) {
        boolean z2 = (i & 2) == 0;
        str2 = (i & 8) != 0 ? null : str2;
        AbstractC2328.m4341(-621103383479150L);
        this.f4604 = z;
        this.f4605 = z2;
        this.f4606 = str;
        this.f4607 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014)) {
            return false;
        }
        C1014 c1014 = (C1014) obj;
        return this.f4604 == c1014.f4604 && this.f4605 == c1014.f4605 && this.f4606.equals(c1014.f4606) && AbstractC1544.m3188(this.f4607, c1014.f4607);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f4606, AbstractC2104.m4021(Boolean.hashCode(this.f4604) * 31, 31, this.f4605), 31);
        String str = this.f4607;
        return iM1997 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-621172102955886L));
        AbstractC2104.m4017(sb, this.f4604, -621275182170990L);
        AbstractC2104.m4017(sb, this.f4605, -621331016745838L);
        AbstractC0897.m2002(sb, this.f4606, -621378261386094L);
        return AbstractC0897.m2000(sb, this.f4607, ')');
    }
}
