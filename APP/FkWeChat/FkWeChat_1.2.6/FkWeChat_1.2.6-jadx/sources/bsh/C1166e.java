package bsh;

/* JADX INFO: renamed from: bsh.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1166e extends AbstractC1195i4 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public int f3521A;

    /* JADX INFO: renamed from: B */
    public int[] f3522B;

    /* JADX INFO: renamed from: y */
    public Class f3523y;

    /* JADX INFO: renamed from: z */
    public int f3524z;

    public C1166e(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public void m4277k() {
        this.f3524z++;
    }

    /* JADX INFO: renamed from: l */
    public void m4278l() {
        this.f3521A++;
    }

    /* JADX INFO: renamed from: o */
    public Object m4279o(Class cls, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        RunnableC1205k2.m4462e("array base type = ", cls);
        this.f3523y = cls;
        return mo4048p(c1174f1, runnableC1205k2);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1169e2 {
        InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(0);
        if (!(interfaceC1188h3Mo4051s instanceof C1172f)) {
            this.f3522B = new int[this.f3524z];
            for (int i10 = 0; i10 < this.f3524z; i10++) {
                try {
                    this.f3522B[i10] = ((Integer) Primitive.castWrapper(Integer.TYPE, mo4051s(i10).mo4048p(c1174f1, runnableC1205k2))).intValue();
                } catch (Exception e10) {
                    throw new C1169e2("Array index: " + i10 + " length does not evaluate to an integer", this, c1174f1, e10);
                }
            }
            return Primitive.VOID;
        }
        Object objM4305v = ((C1172f) interfaceC1188h3Mo4051s).m4305v(this.f3523y, this.f3521A, c1174f1, runnableC1205k2);
        if (objM4305v.getClass().isArray()) {
            int[] iArrM5115g = AbstractC1269v0.m5115g(objM4305v);
            this.f3522B = iArrM5115g;
            if (-1 == this.f3521A) {
                this.f3521A = iArrM5115g.length;
            }
            if (iArrM5115g.length != this.f3521A) {
                throw new C1169e2("Incompatible initializer. Allocation calls for a " + this.f3521A + " dimensional array, but initializer is a " + this.f3522B.length + " dimensional array", this, c1174f1);
            }
        }
        return objM4305v;
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3524z + ", " + this.f3521A;
    }
}
