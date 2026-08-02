package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ij0 extends a40 {
    @Override // p000.a40
    /* JADX INFO: renamed from: b */
    public final int mo58b() {
        return this.f46b.f7601d.mo3319v();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: g */
    public final String mo63g() {
        oa0 oa0Var = this.f46b;
        sp0 sp0Var = oa0Var.f7601d;
        sp0Var.getClass();
        String strM3543a = oa0Var.m3543a();
        String strMo3314H = sp0Var.mo3314H(this);
        String strMo3315I = sp0Var.mo3315I(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM3543a);
        if (strMo3314H.length() != 0) {
            sb.append(' ');
            sb.append(strMo3314H);
        }
        if (strMo3315I.length() != 0) {
            sb.append(" // ");
            sb.append(strMo3315I);
        }
        return sb.toString();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: j */
    public final a40 mo65j(int i) {
        return mo66k(this.f48d.m4749k(i));
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: l */
    public final void mo67l(C0929yn c0929yn) {
        this.f46b.f7601d.mo3317q0(c0929yn, this);
    }
}
