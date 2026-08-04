package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛵᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f6224;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f6225;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f6226;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f6227;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC2266 f6228;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f6229;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Integer f6230;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f6231;

    public C1343(String str, String str2, String str3, String str4, String str5, Integer num, InterfaceC2266 interfaceC2266, boolean z) {
        AbstractC2328.m4341(-178915025519470L);
        AbstractC2328.m4341(-178940795323246L);
        AbstractC2328.m4341(-178975155061614L);
        AbstractC2328.m4341(-179030989636462L);
        AbstractC2328.m4341(-179082529244014L);
        this.f6226 = str;
        this.f6227 = str2;
        this.f6229 = str3;
        this.f6231 = str4;
        this.f6225 = str5;
        this.f6230 = num;
        this.f6228 = interfaceC2266;
        this.f6224 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343)) {
            return false;
        }
        C1343 c1343 = (C1343) obj;
        return this.f6226.equals(c1343.f6226) && this.f6227.equals(c1343.f6227) && this.f6229.equals(c1343.f6229) && this.f6231.equals(c1343.f6231) && this.f6225.equals(c1343.f6225) && AbstractC1544.m3188(this.f6230, c1343.f6230) && AbstractC1544.m3188(this.f6228, c1343.f6228) && this.f6224 == c1343.f6224;
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f6225, AbstractC0897.m1997(this.f6231, AbstractC0897.m1997(this.f6229, AbstractC0897.m1997(this.f6227, this.f6226.hashCode() * 31, 961), 31), 31), 29791);
        Integer num = this.f6230;
        int iHashCode = (iM1997 + (num == null ? 0 : num.hashCode())) * 29791;
        InterfaceC2266 interfaceC2266 = this.f6228;
        return Boolean.hashCode(this.f6224) + ((iHashCode + (interfaceC2266 != null ? interfaceC2266.hashCode() : 0)) * 29791);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-179383176954734L));
        AbstractC0897.m2002(sb, this.f6226, -179443306496878L);
        sb.append(this.f6227);
        sb.append(AbstractC2328.m4341(-179490551137134L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-179550680679278L));
        AbstractC0897.m2002(sb, this.f6229, -179619400156014L);
        AbstractC0897.m2002(sb, this.f6231, -179683824665454L);
        sb.append(this.f6225);
        sb.append(AbstractC2328.m4341(-179752544142190L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-179829853553518L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-179915752899438L));
        sb.append(this.f6230);
        sb.append(AbstractC2328.m4341(-180005947212654L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-180091846558574L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-180182040871790L));
        sb.append(this.f6228);
        sb.append(AbstractC2328.m4341(-180242170413934L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-180298004988782L));
        sb.append((Object) null);
        sb.append(AbstractC2328.m4341(-180358134530926L));
        return AbstractC0897.m1986(sb, this.f6224, ')');
    }
}
