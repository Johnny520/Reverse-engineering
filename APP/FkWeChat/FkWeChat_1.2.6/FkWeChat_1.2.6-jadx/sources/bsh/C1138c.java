package bsh;

/* JADX INFO: renamed from: bsh.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1138c extends AbstractC1195i4 {

    /* JADX INFO: renamed from: y */
    public String f3466y;

    public C1138c(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public C1130a3 m4111k(C1182g3 c1182g3) {
        return c1182g3.m4345G(this.f3466y);
    }

    /* JADX INFO: renamed from: l */
    public Class m4112l(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        try {
            return m4111k(c1174f1.m4319h()).m4085o();
        } catch (C1279w4 e10) {
            throw e10.mo5167a(this, c1174f1);
        } catch (ClassNotFoundException e11) {
            throw new C1169e2(e11.getMessage(), this, c1174f1, e11);
        }
    }

    /* JADX INFO: renamed from: o */
    public C1265u2 m4113o(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        try {
            return m4111k(c1174f1.m4319h()).m4086p(c1174f1, runnableC1205k2);
        } catch (C1279w4 e10) {
            throw e10.mo5167a(this, c1174f1);
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        throw new C1211l2("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3466y;
    }

    /* JADX INFO: renamed from: v */
    public Object m4114v(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return m4115x(c1174f1, runnableC1205k2, false);
    }

    /* JADX INFO: renamed from: x */
    public Object m4115x(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, boolean z10) throws C1163d2 {
        try {
            return m4111k(c1174f1.m4319h()).m4088r(c1174f1, runnableC1205k2, z10);
        } catch (C1279w4 e10) {
            throw e10.mo5167a(this, c1174f1);
        }
    }
}
