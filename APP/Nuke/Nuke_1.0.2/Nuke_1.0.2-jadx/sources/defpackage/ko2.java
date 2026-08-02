package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements oo2 {
    public final String a;
    public final String b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ko2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko2)) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        return this.a.equals(ko2Var.a) && this.b.equals(ko2Var.b) && this.c.equals(ko2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + hk1.f(this.b, this.a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.j(vi0.o("Image(talker=", this.a, ", imagePath=", this.b, ", taskClassName="), this.c, ")");
    }
}
