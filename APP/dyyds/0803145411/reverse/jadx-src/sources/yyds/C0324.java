package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛴᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0324 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String f1702;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f1703;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f1704;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC1841 f1705;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f1706;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f1707;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2565 f1708;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f1709;

    public C0324(String str, EnumC1841 enumC1841, String str2, String str3, String str4, C2565 c2565, boolean z, String str5) {
        AbstractC2328.m4341(-592052224689006L);
        AbstractC2328.m4341(-592069404558190L);
        this.f1704 = str;
        this.f1705 = enumC1841;
        this.f1707 = str2;
        this.f1709 = str3;
        this.f1703 = str4;
        this.f1708 = c2565;
        this.f1706 = z;
        this.f1702 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0324)) {
            return false;
        }
        C0324 c0324 = (C0324) obj;
        return AbstractC1544.m3188(this.f1704, c0324.f1704) && this.f1705 == c0324.f1705 && AbstractC1544.m3188(this.f1707, c0324.f1707) && AbstractC1544.m3188(this.f1709, c0324.f1709) && AbstractC1544.m3188(this.f1703, c0324.f1703) && AbstractC1544.m3188(this.f1708, c0324.f1708) && this.f1706 == c0324.f1706 && AbstractC1544.m3188(this.f1702, c0324.f1702);
    }

    public final int hashCode() {
        int iHashCode = (this.f1705.hashCode() + (this.f1704.hashCode() * 31)) * 31;
        String str = this.f1707;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1709;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1703;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C2565 c2565 = this.f1708;
        int iM4021 = AbstractC2104.m4021((iHashCode4 + (c2565 == null ? 0 : c2565.hashCode())) * 31, 31, this.f1706);
        String str4 = this.f1702;
        return iM4021 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-592129534100334L));
        AbstractC0897.m2002(sb, this.f1704, -592202548544366L);
        sb.append(this.f1705);
        sb.append(AbstractC2328.m4341(-592236908282734L));
        AbstractC0897.m2002(sb, this.f1707, -592309922726766L);
        AbstractC0897.m2002(sb, this.f1709, -592378642203502L);
        AbstractC0897.m2002(sb, this.f1703, -592460246582126L);
        sb.append(this.f1708);
        sb.append(AbstractC2328.m4341(-592528966058862L));
        AbstractC2104.m4017(sb, this.f1706, -592580505666414L);
        return AbstractC0897.m2000(sb, this.f1702, ')');
    }
}
