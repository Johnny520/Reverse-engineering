package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲈᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1684 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f8575;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f8576;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f8577;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long f8578;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f8579;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f8580;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f8581;

    public C1684(int i, String str, String str2, String str3, boolean z, boolean z2, long j) {
        this.f8576 = i;
        this.f8577 = str;
        this.f8579 = str2;
        this.f8581 = str3;
        this.f8575 = z;
        this.f8580 = z2;
        this.f8578 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684)) {
            return false;
        }
        C1684 c1684 = (C1684) obj;
        return this.f8576 == c1684.f8576 && AbstractC1544.m3188(this.f8577, c1684.f8577) && AbstractC1544.m3188(this.f8579, c1684.f8579) && AbstractC1544.m3188(this.f8581, c1684.f8581) && this.f8575 == c1684.f8575 && this.f8580 == c1684.f8580 && this.f8578 == c1684.f8578;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8576) * 31;
        String str = this.f8577;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8579;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8581;
        return Long.hashCode(this.f8578) + AbstractC2104.m4021(AbstractC2104.m4021((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f8575), 31, this.f8580);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-953795845194606L));
        AbstractC2104.m4007(sb, this.f8576, -953941874082670L);
        AbstractC0897.m2002(sb, this.f8577, -954006298592110L);
        AbstractC0897.m2002(sb, this.f8579, -954075018068846L);
        AbstractC0897.m2002(sb, this.f8581, -954135147610990L);
        AbstractC2104.m4017(sb, this.f8575, -954182392251246L);
        AbstractC2104.m4017(sb, this.f8580, -954238226826094L);
        sb.append(this.f8578);
        sb.append(')');
        return sb.toString();
    }
}
