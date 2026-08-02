package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class hl0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final gl0 f4070a;

    public hl0(gl0 gl0Var) {
        this.f4070a = gl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl0) && t11.m5086l(this.f4070a, ((hl0) obj).f4070a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        jl0 jl0Var = new jl0();
        jl0Var.f5095v = this.f4070a;
        return jl0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        jl0 jl0Var = (jl0) th1Var;
        jl0Var.f5095v.f3572a.m6431j(jl0Var);
        gl0 gl0Var = this.f4070a;
        jl0Var.f5095v = gl0Var;
        gl0Var.f3572a.m6423b(jl0Var);
    }

    public final int hashCode() {
        return this.f4070a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f4070a + ')';
    }
}
