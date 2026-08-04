package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲀᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0446 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f2272;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f2273;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f2274;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2275;

    public C0446(int i, String str, String str2, String str3) {
        AbstractC2328.m4341(-1415131167359854L);
        this.f2272 = str;
        this.f2273 = str2;
        this.f2274 = str3;
        this.f2275 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0446)) {
            return false;
        }
        C0446 c0446 = (C0446) obj;
        return AbstractC1544.m3188(this.f2272, c0446.f2272) && AbstractC1544.m3188(this.f2273, c0446.f2273) && AbstractC1544.m3188(this.f2274, c0446.f2274) && this.f2275 == c0446.f2275;
    }

    public final int hashCode() {
        int iHashCode = this.f2272.hashCode() * 31;
        String str = this.f2273;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2274;
        return Integer.hashCode(this.f2275) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1415217066705774L));
        AbstractC0897.m2002(sb, this.f2272, -1415333030822766L);
        AbstractC0897.m2002(sb, this.f2273, -1415393160364910L);
        AbstractC0897.m2002(sb, this.f2274, -1415461879841646L);
        return AbstractC0897.m1999(sb, this.f2275, ')');
    }
}
