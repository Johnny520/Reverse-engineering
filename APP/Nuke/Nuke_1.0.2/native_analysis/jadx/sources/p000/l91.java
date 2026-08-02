package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class l91 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final C0416l9 f5991a;

    /* JADX INFO: renamed from: b */
    public final t91 f5992b;

    /* JADX INFO: renamed from: c */
    public final b03 f5993c;

    public l91(C0416l9 c0416l9, t91 t91Var, b03 b03Var) {
        this.f5991a = c0416l9;
        this.f5992b = t91Var;
        this.f5993c = b03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l91) {
            l91 l91Var = (l91) obj;
            return t11.m5086l(this.f5991a, l91Var.f5991a) && this.f5992b == l91Var.f5992b && this.f5993c == l91Var.f5993c;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new m91(this.f5991a, this.f5992b, this.f5993c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        m91 m91Var = (m91) th1Var;
        if (m91Var.f10770u) {
            m91Var.f6521v.mo2882g();
            m91Var.f6521v.m2886k(m91Var);
        }
        C0416l9 c0416l9 = this.f5991a;
        m91Var.f6521v = c0416l9;
        if (m91Var.f10770u) {
            if (c0416l9.f5986a != null) {
                nz0.m3458c("Expected textInputModifierNode to be null");
            }
            c0416l9.f5986a = m91Var;
        }
        m91Var.f6522w = this.f5992b;
        m91Var.f6523x = this.f5993c;
    }

    public final int hashCode() {
        return this.f5993c.hashCode() + ((this.f5992b.hashCode() + (this.f5991a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f5991a + ", legacyTextFieldState=" + this.f5992b + ", textFieldSelectionManager=" + this.f5993c + ')';
    }
}
