package p001;

/* JADX INFO: renamed from: ۟.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0345p1 {

    /* JADX INFO: renamed from: ۥ */
    public final Boolean f1020;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f1021;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f1743;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final Boolean f1744;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final Boolean f1745;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final Boolean f1746;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final String f1747;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final Integer f1748;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final Integer f1749;

    public C0345p1(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, Boolean bool4, String str3, Integer num, Integer num2) {
        this.f1020 = bool;
        this.f1021 = str;
        this.f1743 = str2;
        this.f1744 = bool2;
        this.f1745 = bool3;
        this.f1746 = bool4;
        this.f1747 = str3;
        this.f1748 = num;
        this.f1749 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0345p1)) {
            return false;
        }
        C0345p1 c0345p1 = (C0345p1) obj;
        return C0237h4.m864(this.f1020, c0345p1.f1020) && C0237h4.m864(this.f1021, c0345p1.f1021) && C0237h4.m864(this.f1743, c0345p1.f1743) && C0237h4.m864(this.f1744, c0345p1.f1744) && C0237h4.m864(this.f1745, c0345p1.f1745) && C0237h4.m864(this.f1746, c0345p1.f1746) && C0237h4.m864(this.f1747, c0345p1.f1747) && C0237h4.m864(this.f1748, c0345p1.f1748) && C0237h4.m864(this.f1749, c0345p1.f1749);
    }

    public final int hashCode() {
        Boolean bool = this.f1020;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f1021;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1743;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.f1744;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f1745;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f1746;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.f1747;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f1748;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1749;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return super.toString();
    }
}
