package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 {
    public final int a;
    public final int b;
    public final int c;
    public final sp0 d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oa0(int i, int i2, int i3, sp0 sp0Var, boolean z) {
        if (!gf1.C(i)) {
            s.j("bogus opcode");
            throw null;
        }
        if (!gf1.C(i2)) {
            s.j("bogus family");
            throw null;
        }
        if (!gf1.C(i3)) {
            s.j("bogus nextOpcode");
            throw null;
        }
        if (sp0Var == null) {
            um2.f("format == null");
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = sp0Var;
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        int i = this.a;
        try {
            dk dkVar = zt1.a[i + 1];
            if (dkVar != null) {
                return (String) dkVar.j;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i == ((char) i) ? pp0.J(i) : pp0.K(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return a();
    }
}
