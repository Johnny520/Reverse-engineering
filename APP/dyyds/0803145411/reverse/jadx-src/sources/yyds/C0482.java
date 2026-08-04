package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲈᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0482 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f2395;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f2396;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f2397;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f2398;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f2399;

    public C0482(String str, String str2, String str3, String str4, String str5) {
        AbstractC2328.m4341(-767609012913006L);
        AbstractC2328.m4341(-767643372651374L);
        AbstractC2328.m4341(-767660552520558L);
        AbstractC2328.m4341(-767694912258926L);
        this.f2396 = str;
        this.f2397 = str2;
        this.f2398 = str3;
        this.f2399 = str4;
        this.f2395 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0482)) {
            return false;
        }
        C0482 c0482 = (C0482) obj;
        return this.f2396.equals(c0482.f2396) && this.f2397.equals(c0482.f2397) && this.f2398.equals(c0482.f2398) && this.f2399.equals(c0482.f2399) && AbstractC1544.m3188(this.f2395, c0482.f2395);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f2399, AbstractC0897.m1997(this.f2398, AbstractC0897.m1997(this.f2397, this.f2396.hashCode() * 31, 31), 31), 31);
        String str = this.f2395;
        return iM1997 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-767858121016174L));
        AbstractC0897.m2002(sb, this.f2396, -767956905263982L);
        AbstractC0897.m2002(sb, this.f2397, -767986970035054L);
        AbstractC0897.m2002(sb, this.f2398, -768034214675310L);
        AbstractC0897.m2002(sb, this.f2399, -768068574413678L);
        return AbstractC0897.m2000(sb, this.f2395, ')');
    }
}
