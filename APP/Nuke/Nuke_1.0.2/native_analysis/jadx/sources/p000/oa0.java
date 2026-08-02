package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 {

    /* JADX INFO: renamed from: a */
    public final int f7598a;

    /* JADX INFO: renamed from: b */
    public final int f7599b;

    /* JADX INFO: renamed from: c */
    public final int f7600c;

    /* JADX INFO: renamed from: d */
    public final sp0 f7601d;

    /* JADX INFO: renamed from: e */
    public final boolean f7602e;

    public oa0(int i, int i2, int i3, sp0 sp0Var, boolean z) {
        if (!gf1.m1855C(i)) {
            C0676s.m4651j("bogus opcode");
            throw null;
        }
        if (!gf1.m1855C(i2)) {
            C0676s.m4651j("bogus family");
            throw null;
        }
        if (!gf1.m1855C(i3)) {
            C0676s.m4651j("bogus nextOpcode");
            throw null;
        }
        if (sp0Var == null) {
            um2.m5516f("format == null");
            throw null;
        }
        this.f7598a = i;
        this.f7599b = i2;
        this.f7600c = i3;
        this.f7601d = sp0Var;
        this.f7602e = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m3543a() {
        int i = this.f7598a;
        try {
            C0133dk c0133dk = zt1.f14094a[i + 1];
            if (c0133dk != null) {
                return (String) c0133dk.f2082j;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i == ((char) i) ? pp0.m3898J(i) : pp0.m3899K(i)));
    }

    public final String toString() {
        return m3543a();
    }
}
