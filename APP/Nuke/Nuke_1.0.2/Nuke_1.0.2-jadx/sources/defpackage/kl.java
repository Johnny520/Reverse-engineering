package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends e32 {
    public static final kl c = new kl(ll.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        jl jlVar = (jl) obj;
        jlVar.getClass();
        boolean zQ = vxVar.q(this.b, i);
        jlVar.b(jlVar.d() + 1);
        boolean[] zArr = jlVar.a;
        int i2 = jlVar.b;
        jlVar.b = i2 + 1;
        zArr[i2] = zQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        jl jlVar = new jl();
        jlVar.a = zArr;
        jlVar.b = zArr.length;
        jlVar.b(10);
        return jlVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new boolean[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        wxVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).r(this.b, i2, zArr[i2]);
        }
    }
}
