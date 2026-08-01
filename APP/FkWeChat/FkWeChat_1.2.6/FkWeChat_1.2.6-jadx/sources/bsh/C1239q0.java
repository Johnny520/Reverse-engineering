package bsh;

/* JADX INFO: renamed from: bsh.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1239q0 extends AbstractC1195i4 {

    /* JADX INFO: renamed from: y */
    public String f3772y;

    /* JADX INFO: renamed from: z */
    public int f3773z;

    public C1239q0(int i10) {
        super(i10);
        this.f3773z = 0;
    }

    /* JADX INFO: renamed from: k */
    public Object m5047k(C1221n0 c1221n0, C1283x2 c1283x2, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        Object objM4305v = null;
        if (!c1283x2.m5200j("final") && !Primitive.isWrapperType(c1221n0.m4926o())) {
            objM4305v = Primitive.getDefaultValue(c1221n0.m4926o());
        }
        if (mo4050r() > 0) {
            InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(0);
            objM4305v = interfaceC1188h3Mo4051s instanceof C1172f ? ((C1172f) interfaceC1188h3Mo4051s).m4305v(c1221n0.m4926o(), m5048l(c1221n0), c1174f1, runnableC1205k2) : interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
        }
        if (objM4305v != Primitive.VOID) {
            return objM4305v;
        }
        throw new C1169e2("Void initializer.", this, c1174f1);
    }

    /* JADX INFO: renamed from: l */
    public final int m5048l(C1221n0 c1221n0) {
        int i10 = this.f3773z;
        if (i10 > 0) {
            return i10;
        }
        if (c1221n0.m4925l() > 0) {
            return c1221n0.m4925l();
        }
        return -1;
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3772y;
    }
}
