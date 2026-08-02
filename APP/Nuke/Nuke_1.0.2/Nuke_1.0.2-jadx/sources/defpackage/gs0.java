package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 {
    public static final no d;
    public static final no e;
    public static final no f;
    public static final no g;
    public static final no h;
    public static final no i;
    public final no a;
    public final no b;
    public final int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        no noVar = no.k;
        d = eb.z(":");
        e = eb.z(":status");
        f = eb.z(":method");
        g = eb.z(":path");
        h = eb.z(":scheme");
        i = eb.z(":authority");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gs0(no noVar, no noVar2) {
        noVar.getClass();
        noVar2.getClass();
        this.a = noVar;
        this.b = noVar2;
        this.c = noVar2.a() + noVar.a() + 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return t11.l(this.a, gs0Var.a) && t11.l(this.b, gs0Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.a.j() + ": " + this.b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gs0(String str, String str2) {
        this(eb.z(str), eb.z(str2));
        no noVar = no.k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gs0(no noVar, String str) {
        this(noVar, eb.z(str));
        noVar.getClass();
        str.getClass();
        no noVar2 = no.k;
    }
}
