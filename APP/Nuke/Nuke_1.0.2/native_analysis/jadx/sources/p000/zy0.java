package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 implements InterfaceC0273hd {

    /* JADX INFO: renamed from: a */
    public final bd0 f14148a;

    public zy0(bd0 bd0Var) {
        this.f14148a = bd0Var;
        if (bd0Var instanceof m43) {
            if (((m43) bd0Var).f6472a != 0) {
                return;
            }
        } else if (!(bd0Var instanceof q51) || ((q51) bd0Var).f8742a.f7980a != 0) {
            return;
        }
        C0676s.m4651j("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    public final x93 mo512a(n43 n43Var) {
        return new wd1(this.f14148a.mo512a(n43Var));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zy0) && ((zy0) obj).f14148a.equals(this.f14148a);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((g82.f3352h.hashCode() + (this.f14148a.hashCode() * 31)) * 31);
    }
}
