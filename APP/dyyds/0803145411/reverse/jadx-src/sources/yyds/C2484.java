package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛷᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2484 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f12277;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f12278;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f12279;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f12280;

    public C2484(int i, String str, String str2, String str3) {
        AbstractC2328.m4341(-1233119043289966L);
        this.f12277 = str;
        this.f12278 = str2;
        this.f12279 = str3;
        this.f12280 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2484)) {
            return false;
        }
        C2484 c2484 = (C2484) obj;
        return AbstractC1544.m3188(this.f12277, c2484.f12277) && AbstractC1544.m3188(this.f12278, c2484.f12278) && AbstractC1544.m3188(this.f12279, c2484.f12279) && this.f12280 == c2484.f12280;
    }

    public final int hashCode() {
        int iHashCode = this.f12277.hashCode() * 31;
        String str = this.f12278;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12279;
        return Integer.hashCode(this.f12280) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1233204942635886L));
        AbstractC0897.m2002(sb, this.f12277, -1233295136949102L);
        AbstractC0897.m2002(sb, this.f12278, -1233355266491246L);
        AbstractC0897.m2002(sb, this.f12279, -1233423985967982L);
        return AbstractC0897.m1999(sb, this.f12280, ')');
    }
}
