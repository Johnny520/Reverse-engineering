package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        String str = this.d;
        if (pv2.s0(str)) {
            str = this.b;
            if (pv2.s0(str)) {
                return this.a;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj;
        return this.a.equals(mzVar.a) && this.b.equals(mzVar.b) && this.c.equals(mzVar.c) && this.d.equals(mzVar.d) && this.e.equals(mzVar.e) && this.f.equals(mzVar.f) && this.g.equals(mzVar.g) && this.h.equals(mzVar.h) && this.i == mzVar.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.i) + hk1.f(this.h, hk1.f(this.g, hk1.f(this.f, hk1.f(this.e, hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ContactInfoBean(wxId=", this.a, ", nickname=", this.b, ", customWxId=");
        hk1.o(sbO, this.c, ", remarkName=", this.d, ", initialNickname=");
        hk1.o(sbO, this.e, ", nicknamePinyin=", this.f, ", avatarUrl=");
        hk1.o(sbO, this.g, ", encryptedUsername=", this.h, ", type=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }
}
