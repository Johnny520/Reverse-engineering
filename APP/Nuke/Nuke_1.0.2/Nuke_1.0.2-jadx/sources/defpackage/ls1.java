package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements w41 {
    public final j71 a = p7.B(i91.h, new hn1(this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2VarE = e();
        vx vxVarB = y40Var.b(yo2VarE);
        int iJ = vxVarB.j(e());
        if (iJ != -1) {
            throw new o01(vi0.g("Unexpected index ", iJ));
        }
        vxVarB.a(yo2VarE);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        obj.getClass();
        ve0Var.b(e()).a(e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return (yo2) this.a.getValue();
    }
}
