package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends te0 implements Comparable {

    /* JADX INFO: renamed from: i */
    public final c30 f10075i;

    public se0(c30 c30Var, int i) {
        super(i);
        if (c30Var != null) {
            this.f10075i = c30Var;
        } else {
            um2.m5516f("field == null");
            throw null;
        }
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f10075i.mo23b();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10075i.compareTo(((se0) obj).f10075i);
    }

    @Override // p000.te0
    /* JADX INFO: renamed from: d */
    public final int mo4856d(z70 z70Var, C0929yn c0929yn, int i, int i2) {
        ni0 ni0Var = (ni0) z70Var.f13760k;
        c30 c30Var = this.f10075i;
        int iM3309l = ni0Var.m3309l(c30Var);
        int i3 = iM3309l - i;
        boolean zM6293d = c0929yn.m6293d();
        int i4 = this.f10698h;
        if (zM6293d) {
            c0929yn.m6292c(String.format("  [%x] %s", Integer.valueOf(i2), c30Var.mo23b()), 0);
            c0929yn.m6292c("    field_idx:    ".concat(pp0.m3899K(iM3309l)), pp0.m3901M(i3));
            c0929yn.m6292c("    access_flags: " + up0.m5558x(i4, 20703, 2), pp0.m3901M(i4));
        }
        c0929yn.m6301m(i3);
        c0929yn.m6301m(i4);
        return iM3309l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof se0) && this.f10075i.compareTo(((se0) obj).f10075i) == 0;
    }

    public final int hashCode() {
        return this.f10075i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(se0.class.getName());
        sb.append('{');
        sb.append(pp0.m3898J(this.f10698h));
        sb.append(' ');
        sb.append(this.f10075i);
        sb.append('}');
        return sb.toString();
    }
}
