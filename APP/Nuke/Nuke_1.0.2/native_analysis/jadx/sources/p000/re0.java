package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class re0 extends xs1 {

    /* JADX INFO: renamed from: l */
    public final x20 f9524l;

    /* JADX INFO: renamed from: m */
    public byte[] f9525m;

    public re0(x20 x20Var) {
        super(1, -1);
        this.f9524l = x20Var;
        this.f9525m = null;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        dq1.m1077q(z70Var, this.f9524l);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: e */
    public final int mo1531e(xs1 xs1Var) {
        return this.f9524l.compareTo(((re0) xs1Var).f9524l);
    }

    public final int hashCode() {
        return this.f9524l.hashCode();
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: i */
    public final void mo4438i(eh1 eh1Var, int i) {
        C0929yn c0929yn = new C0929yn();
        new dq1(eh1Var.f5108b, c0929yn).m1099X(this.f9524l, false);
        int i2 = c0929yn.f13526c;
        byte[] bArr = new byte[i2];
        System.arraycopy(c0929yn.f13525b, 0, bArr, 0, i2);
        this.f9525m = bArr;
        m6180j(i2);
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        if (!c0929yn.m6293d()) {
            c0929yn.m6296h(this.f9525m);
        } else {
            c0929yn.m6292c(m6178g().concat(" encoded array"), 0);
            new dq1(z70Var, c0929yn).m1099X(this.f9524l, true);
        }
    }
}
