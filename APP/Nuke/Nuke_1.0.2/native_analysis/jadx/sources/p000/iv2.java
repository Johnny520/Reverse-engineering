package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iv2 extends xs1 {

    /* JADX INFO: renamed from: l */
    public final q30 f4806l;

    public iv2(q30 q30Var) {
        super(1, pp0.m3901M(q30Var.f8714h.length()) + q30Var.f8715i.f2081i + 1);
        this.f4806l = q30Var;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_STRING_DATA_ITEM;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: e */
    public final int mo1531e(xs1 xs1Var) {
        return this.f4806l.compareTo(((iv2) xs1Var).f4806l);
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        q30 q30Var = this.f4806l;
        C0133dk c0133dk = q30Var.f8715i;
        int length = q30Var.f8714h.length();
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("utf16_size: ".concat(pp0.m3899K(length)), pp0.m3901M(length));
            c0929yn.m6292c(q30Var.m4048g(), c0133dk.f2081i + 1);
        }
        c0929yn.m6301m(length);
        int i = c0133dk.f2081i;
        int i2 = c0929yn.f13526c;
        int i3 = i + i2;
        if (c0929yn.f13524a) {
            c0929yn.m6295f(i3);
        } else if (i3 > c0929yn.f13525b.length) {
            C0929yn.m6289g();
            throw null;
        }
        byte[] bArr = c0929yn.f13525b;
        int length2 = bArr.length - i2;
        int i4 = c0133dk.f2081i;
        if (length2 < i4) {
            C0676s.m4646d("(out.length - offset) < size()");
            return;
        }
        System.arraycopy((byte[]) c0133dk.f2082j, 0, bArr, i2, i4);
        c0929yn.f13526c = i3;
        c0929yn.m6297i(0);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
    }
}
