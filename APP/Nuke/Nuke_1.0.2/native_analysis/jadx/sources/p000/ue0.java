package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends te0 implements Comparable {

    /* JADX INFO: renamed from: i */
    public final n30 f11254i;

    /* JADX INFO: renamed from: j */
    public final C0935yt f11255j;

    public ue0(n30 n30Var, int i, kj1 kj1Var, d63 d63Var) {
        super(i);
        if (n30Var == null) {
            um2.m5516f("method == null");
            throw null;
        }
        this.f11254i = n30Var;
        if (kj1Var == null) {
            this.f11255j = null;
        } else {
            this.f11255j = new C0935yt(n30Var, kj1Var, (i & 8) != 0, d63Var);
        }
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f11254i.mo23b();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11254i.compareTo(((ue0) obj).f11254i);
    }

    @Override // p000.te0
    /* JADX INFO: renamed from: d */
    public final int mo4856d(z70 z70Var, C0929yn c0929yn, int i, int i2) {
        xg1 xg1Var = (xg1) z70Var.f13761l;
        n30 n30Var = this.f11254i;
        int iM6150l = xg1Var.m6150l(n30Var);
        int i3 = iM6150l - i;
        C0935yt c0935yt = this.f11255j;
        int iM6177f = c0935yt == null ? 0 : c0935yt.m6177f();
        boolean z = iM6177f != 0;
        int i4 = this.f10698h;
        if (z != ((i4 & 1280) == 0)) {
            c80.m676t("code vs. access_flags mismatch");
            return 0;
        }
        if (c0929yn.m6293d()) {
            c0929yn.m6292c(String.format("  [%x] %s", Integer.valueOf(i2), n30Var.mo23b()), 0);
            c0929yn.m6292c("    method_idx:   ".concat(pp0.m3899K(iM6150l)), pp0.m3901M(i3));
            c0929yn.m6292c("    access_flags: " + up0.m5558x(i4, 204287, 3), pp0.m3901M(i4));
            c0929yn.m6292c("    code_off:     ".concat(pp0.m3899K(iM6177f)), pp0.m3901M(iM6177f));
        }
        c0929yn.m6301m(i3);
        c0929yn.m6301m(i4);
        c0929yn.m6301m(iM6177f);
        return iM6150l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ue0) && this.f11254i.compareTo(((ue0) obj).f11254i) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(ue0.class.getName());
        sb.append('{');
        sb.append(pp0.m3898J(this.f10698h));
        sb.append(' ');
        sb.append(this.f11254i);
        C0935yt c0935yt = this.f11255j;
        if (c0935yt != null) {
            sb.append(' ');
            sb.append(c0935yt);
        }
        sb.append('}');
        return sb.toString();
    }
}
