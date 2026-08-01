package bsh;

/* JADX INFO: renamed from: bsh.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1233p0 extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: y */
    public int f3736y;

    /* JADX INFO: renamed from: z */
    public boolean f3737z;

    public C1233p0(int i10) {
        super(i10);
        this.f3737z = false;
    }

    /* JADX INFO: renamed from: k */
    public final Object m4999k(C1265u2 c1265u2, boolean z10) throws C1279w4 {
        RunnableC1205k2.m4462e("lhsUnaryOperation");
        Object objM5101d = c1265u2.m5101d();
        Object objM5000l = m5000l(objM5101d, this.f3736y);
        if (!this.f3737z) {
            objM5101d = objM5000l;
        }
        c1265u2.m5099b(objM5000l, z10);
        return objM5101d;
    }

    /* JADX INFO: renamed from: l */
    public final Object m5000l(Object obj, int i10) throws C1279w4 {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (obj instanceof Primitive) {
            return AbstractC1200j3.m4460t((Primitive) obj, i10);
        }
        throw new C1279w4("Unary operation " + InterfaceC1230o3.f3729d[i10] + " inappropriate for object");
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(0);
        try {
            int i10 = this.f3736y;
            if (i10 != 101 && i10 != 102) {
                return m5000l(interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2), this.f3736y);
            }
            return m4999k(((C1133b0) interfaceC1188h3Mo4051s).m4105v(c1174f1, runnableC1205k2), runnableC1205k2.m4499v());
        } catch (C1279w4 e10) {
            throw e10.mo5167a(this, c1174f1);
        }
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + InterfaceC1230o3.f3729d[this.f3736y];
    }
}
