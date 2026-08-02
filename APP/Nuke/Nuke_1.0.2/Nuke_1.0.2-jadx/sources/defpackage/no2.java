package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class no2 implements oo2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public no2(int i, String str, String str2, String str3, String str4) {
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no2)) {
            return false;
        }
        no2 no2Var = (no2) obj;
        return this.a.equals(no2Var.a) && this.b.equals(no2Var.b) && this.c.equals(no2Var.c) && t11.l(this.d, no2Var.d) && this.e == no2Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.e) + hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("Voice(talker=", this.a, ", voiceName=", this.b, ", sourcePath=");
        hk1.o(sbO, this.c, ", targetPath=", this.d, ", durationMs=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
