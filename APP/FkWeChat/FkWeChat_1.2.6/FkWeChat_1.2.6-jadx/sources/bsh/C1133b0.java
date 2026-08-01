package bsh;

/* JADX INFO: renamed from: bsh.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1133b0 extends AbstractC1195i4 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public boolean f3461A;

    /* JADX INFO: renamed from: y */
    public Object f3462y;

    /* JADX INFO: renamed from: z */
    public boolean f3463z;

    public C1133b0(int i10) {
        super(i10);
        this.f3462y = null;
        this.f3463z = false;
        this.f3461A = false;
    }

    /* JADX INFO: renamed from: k */
    public void m4102k() {
        this.f3462y = null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m4103l(boolean z10, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        Object obj;
        if (this.f3463z && (obj = this.f3462y) != null) {
            return obj;
        }
        Object[] objArrMo4049q = mo4049q();
        Object c1265u2 = objArrMo4049q[0];
        for (int i10 = 1; i10 < objArrMo4049q.length; i10++) {
            C1139c0 c1139c0 = (C1139c0) mo4051s(i10);
            if (c1139c0.f3472y == 5 && i10 != objArrMo4049q.length - 1) {
                throw new C1163d2("Method Reference must be the last suffix!", c1139c0, c1174f1);
            }
            c1265u2 = c1139c0.m4122y(c1265u2, z10, c1174f1, runnableC1205k2);
        }
        if (c1265u2 instanceof InterfaceC1188h3) {
            if (c1265u2 instanceof C1138c) {
                c1265u2 = z10 ? ((C1138c) c1265u2).m4113o(c1174f1, runnableC1205k2) : ((C1138c) c1265u2).m4114v(c1174f1, runnableC1205k2);
            } else {
                if (z10) {
                    throw new C1169e2("Can't assign to prefix.", this, c1174f1);
                }
                c1265u2 = ((InterfaceC1188h3) c1265u2).mo4048p(c1174f1, runnableC1205k2);
            }
        }
        if (this.f3461A) {
            if (c1265u2 == Primitive.VOID) {
                throw new C1169e2("illegal use of undefined variable or 'void' literal", this, c1174f1);
            }
            c1265u2 = new C1265u2(c1265u2);
        }
        if (this.f3463z) {
            this.f3462y = c1265u2;
        }
        return c1265u2;
    }

    /* JADX INFO: renamed from: o */
    public void m4104o(C1172f c1172f) {
        this.f3463z = true;
        InterfaceC1188h3 interfaceC1188h3 = this.f3617t;
        if (!(interfaceC1188h3 instanceof C1178g) || ((C1178g) interfaceC1188h3).f3554y == null) {
            return;
        }
        boolean z10 = ((C1178g) interfaceC1188h3).f3554y.intValue() == 84;
        this.f3461A = z10;
        if (z10 && (c1172f.mo4054w() instanceof C1172f)) {
            c1172f.m4299C(true);
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return m4103l(false, c1174f1, runnableC1205k2);
    }

    /* JADX INFO: renamed from: v */
    public C1265u2 m4105v(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return (C1265u2) m4103l(runnableC1205k2.m4499v() || !this.f3461A, c1174f1, runnableC1205k2);
    }
}
