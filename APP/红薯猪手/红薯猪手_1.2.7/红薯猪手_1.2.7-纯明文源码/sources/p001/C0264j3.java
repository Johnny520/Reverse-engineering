package p001;

/* JADX INFO: renamed from: ۟.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0264j3 {

    /* JADX INFO: renamed from: ۥ */
    public boolean f870;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f871;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f1522;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final String f1523;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final String f1524;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final String f1525;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final String f1526;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final String f1527;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final String f1528;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final long f1529;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0264j3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        C0237h4.m1090("uid", str);
        C0237h4.m1090("red_id", str2);
        C0237h4.m1090("nickname", str3);
        C0237h4.m1090("images", str4);
        C0237h4.m1090("desc", str5);
        C0237h4.m1090("location", str6);
        C0237h4.m1090("ipLocation", str7);
        C0237h4.m1090("ext", str8);
        this.f870 = false;
        this.f871 = str;
        this.f1522 = str2;
        this.f1523 = str3;
        this.f1524 = str4;
        this.f1525 = str5;
        this.f1526 = str6;
        this.f1527 = str7;
        this.f1528 = str8;
        this.f1529 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0264j3)) {
            return false;
        }
        C0264j3 c0264j3 = (C0264j3) obj;
        return C0237h4.m864(this.f871, c0264j3.f871) && C0237h4.m864(this.f1522, c0264j3.f1522) && C0237h4.m864(this.f1523, c0264j3.f1523) && C0237h4.m864(this.f1524, c0264j3.f1524) && C0237h4.m864(this.f1525, c0264j3.f1525) && C0237h4.m864(this.f1526, c0264j3.f1526) && C0237h4.m864(this.f1527, c0264j3.f1527) && C0237h4.m864(this.f1528, c0264j3.f1528) && this.f1529 == c0264j3.f1529;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1529) + ((this.f1528.hashCode() + ((this.f1527.hashCode() + ((this.f1526.hashCode() + ((this.f1525.hashCode() + ((this.f1524.hashCode() + ((this.f1523.hashCode() + ((this.f1522.hashCode() + (this.f871.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return super.toString();
    }
}
