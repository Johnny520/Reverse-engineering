package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛶᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2471 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f12210;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f12211;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f12212;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC2266 f12213;

    public C2471(String str, String str2, String str3, InterfaceC2266 interfaceC2266) {
        AbstractC2328.m4341(-303632285860718L);
        AbstractC2328.m4341(-303658055664494L);
        this.f12210 = str;
        this.f12211 = str2;
        this.f12212 = str3;
        this.f12213 = interfaceC2266;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2471)) {
            return false;
        }
        C2471 c2471 = (C2471) obj;
        return this.f12210.equals(c2471.f12210) && this.f12211.equals(c2471.f12211) && AbstractC1544.m3188(this.f12212, c2471.f12212) && AbstractC1544.m3188(this.f12213, c2471.f12213);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f12211, this.f12210.hashCode() * 31, 31);
        String str = this.f12212;
        int iHashCode = (iM1997 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC2266 interfaceC2266 = this.f12213;
        return iHashCode + (interfaceC2266 != null ? interfaceC2266.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-303752544945006L));
        AbstractC0897.m2002(sb, this.f12210, -303829854356334L);
        AbstractC0897.m2002(sb, this.f12211, -303877098996590L);
        AbstractC0897.m2002(sb, this.f12212, -303937228538734L);
        sb.append(this.f12213);
        sb.append(')');
        return sb.toString();
    }
}
