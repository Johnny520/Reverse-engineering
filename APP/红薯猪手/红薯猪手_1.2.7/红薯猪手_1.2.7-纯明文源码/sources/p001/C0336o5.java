package p001;

/* JADX INFO: renamed from: ۟.o5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0336o5 {

    /* JADX INFO: renamed from: ۥ */
    public final C0345p1 f1007;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0332o1 f1008;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f1728;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final Boolean f1729;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public Integer f1730;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final C0446wb f1731;

    public C0336o5(C0345p1 c0345p1, C0332o1 c0332o1, String str, Boolean bool, Integer num, C0446wb c0446wb) {
        this.f1007 = c0345p1;
        this.f1008 = c0332o1;
        this.f1728 = str;
        this.f1729 = bool;
        this.f1730 = num;
        this.f1731 = c0446wb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0336o5)) {
            return false;
        }
        C0336o5 c0336o5 = (C0336o5) obj;
        return C0237h4.m864(this.f1007, c0336o5.f1007) && C0237h4.m864(this.f1008, c0336o5.f1008) && C0237h4.m864(this.f1728, c0336o5.f1728) && C0237h4.m864(this.f1729, c0336o5.f1729) && C0237h4.m864(this.f1730, c0336o5.f1730) && C0237h4.m864(this.f1731, c0336o5.f1731);
    }

    public final int hashCode() {
        C0345p1 c0345p1 = this.f1007;
        int iHashCode = (c0345p1 == null ? 0 : c0345p1.hashCode()) * 31;
        C0332o1 c0332o1 = this.f1008;
        int iHashCode2 = (iHashCode + (c0332o1 == null ? 0 : c0332o1.hashCode())) * 31;
        String str = this.f1728;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f1729;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f1730;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C0446wb c0446wb = this.f1731;
        return iHashCode5 + (c0446wb != null ? c0446wb.hashCode() : 0);
    }

    public final String toString() {
        return super.toString();
    }
}
