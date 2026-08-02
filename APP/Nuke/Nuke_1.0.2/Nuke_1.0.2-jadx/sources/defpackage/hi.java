package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hi(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.a + ":" + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return this.a.equals(hiVar.a) && this.b.equals(hiVar.b) && t11.l(this.c, hiVar.c) && this.d.equals(hiVar.d) && this.e == hiVar.e && this.f.equals(hiVar.f) && this.g.equals(hiVar.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.g.hashCode() + hk1.f(this.f, vi0.d(this.e, hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("TransferInfo(transactionId=", this.a, ", transferId=", this.b, ", payerUsername=");
        hk1.o(sbO, this.c, ", receiverUsername=", this.d, ", invalidTime=");
        sbO.append(this.e);
        sbO.append(", amountDescription=");
        sbO.append(this.f);
        sbO.append(", talker=");
        return hk1.j(sbO, this.g, ")");
    }
}
