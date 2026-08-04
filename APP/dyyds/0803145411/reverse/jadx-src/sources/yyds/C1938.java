package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛲᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1938 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f9748;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f9749;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC1841 f9750;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f9751;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f9752;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final long f9753;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f9754;

    public C1938(String str, EnumC1841 enumC1841, String str2, String str3, String str4, long j, String str5) {
        AbstractC2328.m4341(-533086618682222L);
        AbstractC2328.m4341(-533103798551406L);
        AbstractC2328.m4341(-533125273387886L);
        AbstractC2328.m4341(-533185402930030L);
        this.f9749 = str;
        this.f9750 = enumC1841;
        this.f9752 = str2;
        this.f9754 = str3;
        this.f9748 = str4;
        this.f9753 = j;
        this.f9751 = str5;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1938 m3739(C1938 c1938, String str, String str2, String str3, int i) {
        String str4 = c1938.f9749;
        EnumC1841 enumC1841 = c1938.f9750;
        if ((i & 4) != 0) {
            str = c1938.f9752;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = c1938.f9754;
        }
        String str6 = c1938.f9748;
        long j = c1938.f9753;
        AbstractC2328.m4341(-533241237504878L);
        AbstractC2328.m4341(-533258417374062L);
        AbstractC2328.m4341(-533279892210542L);
        AbstractC2328.m4341(-533340021752686L);
        return new C1938(str4, enumC1841, str5, str2, str6, j, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1938)) {
            return false;
        }
        C1938 c1938 = (C1938) obj;
        return this.f9749.equals(c1938.f9749) && this.f9750 == c1938.f9750 && AbstractC1544.m3188(this.f9752, c1938.f9752) && AbstractC1544.m3188(this.f9754, c1938.f9754) && AbstractC1544.m3188(this.f9748, c1938.f9748) && this.f9753 == c1938.f9753 && AbstractC1544.m3188(this.f9751, c1938.f9751);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f9754, AbstractC0897.m1997(this.f9752, (this.f9750.hashCode() + (this.f9749.hashCode() * 31)) * 31, 31), 31);
        String str = this.f9748;
        int iHashCode = (Long.hashCode(this.f9753) + ((iM1997 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f9751;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-533395856327534L));
        AbstractC0897.m2002(sb, this.f9749, -533477460706158L);
        sb.append(this.f9750);
        sb.append(AbstractC2328.m4341(-533511820444526L));
        AbstractC0897.m2002(sb, this.f9752, -533584834888558L);
        AbstractC0897.m2002(sb, this.f9754, -533653554365294L);
        AbstractC0897.m2002(sb, this.f9748, -533735158743918L);
        AbstractC0897.m1994(sb, this.f9753, -533795288286062L);
        return AbstractC0897.m2000(sb, this.f9751, ')');
    }
}
