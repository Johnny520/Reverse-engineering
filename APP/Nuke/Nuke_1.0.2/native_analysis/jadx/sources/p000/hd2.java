package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hd2 extends AbstractC0565p2 implements l20 {

    /* JADX INFO: renamed from: k */
    public final t00 f3961k;

    public hd2(t00 t00Var, a20 a20Var) {
        super(a20Var, true);
        this.f3961k = t00Var;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: S */
    public final boolean mo2143S() {
        return true;
    }

    @Override // p000.l20
    /* JADX INFO: renamed from: d */
    public final l20 mo2144d() {
        t00 t00Var = this.f3961k;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: x */
    public void mo1937x(Object obj) throws j90 {
        p40.m3706Q(gf1.m1908z(this.f3961k), fg1.m1619L(obj));
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: y */
    public void mo2146y(Object obj) {
        this.f3961k.mo2509h(fg1.m1619L(obj));
    }

    /* JADX INFO: renamed from: j0 */
    public void mo2145j0() {
    }
}
