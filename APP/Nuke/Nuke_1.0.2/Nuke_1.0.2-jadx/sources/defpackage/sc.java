package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc {
    public final n43 a;
    public final Object b;
    public final id c;
    public final nx1 d;
    public final nx1 e;
    public final hl1 f;
    public final nd g;
    public final nd h;
    public final nd i;
    public final nd j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sc(Object obj, n43 n43Var, Object obj2) {
        this.a = n43Var;
        this.b = obj2;
        id idVar = new id(n43Var, obj, null, 60);
        this.c = idVar;
        this.d = op0.u(Boolean.FALSE);
        this.e = op0.u(obj);
        this.f = new hl1();
        new qt2(obj2);
        nd ndVar = idVar.j;
        boolean z = ndVar instanceof jd;
        nd ndVar2 = z ? qp0.e : ndVar instanceof kd ? qp0.f : ndVar instanceof ld ? qp0.g : qp0.h;
        this.g = ndVar2;
        nd ndVar3 = z ? qp0.a : ndVar instanceof kd ? qp0.b : ndVar instanceof ld ? qp0.c : qp0.d;
        this.h = ndVar3;
        this.i = ndVar2;
        this.j = ndVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object a(sc scVar, Object obj) {
        n43 n43Var = scVar.a;
        nd ndVar = scVar.j;
        nd ndVar2 = scVar.i;
        if (!t11.l(ndVar2, scVar.g) || !t11.l(ndVar, scVar.h)) {
            nd ndVar3 = (nd) n43Var.a.j(obj);
            int iB = ndVar3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (ndVar3.a(i) < ndVar2.a(i) || ndVar3.a(i) > ndVar.a(i)) {
                    ndVar3.e(ci0.C(ndVar3.a(i), ndVar2.a(i), ndVar.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return n43Var.b.j(ndVar3);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(sc scVar) {
        id idVar = scVar.c;
        idVar.j.d();
        idVar.k = Long.MIN_VALUE;
        scVar.d.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object c(sc scVar, Object obj, hd hdVar, in0 in0Var, u00 u00Var, int i) {
        Object objJ = scVar.a.b.j(scVar.c.j);
        in0 in0Var2 = (i & 8) != 0 ? null : in0Var;
        Object objD = scVar.d();
        n43 n43Var = scVar.a;
        return hl1.a(scVar.f, new qc(scVar, objJ, new cy2(hdVar, n43Var, objD, obj, (nd) n43Var.a.j(objJ)), scVar.c.k, in0Var2, null), u00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        return this.c.i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(t00 t00Var, Object obj) {
        Object objA = hl1.a(this.f, new rc(this, obj, null, 0), t00Var);
        return objA == k20.h ? objA : a83.a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (r2v0 n43)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.Object, n43, java.lang.Object):void (m)] (LINE:99) call: sc.<init>(java.lang.Object, n43, java.lang.Object):void type: THIS */
    public /* synthetic */ sc(Object obj, n43 n43Var, Object obj2, int i) {
        this(obj, n43Var, (i & 4) != 0 ? null : obj2);
    }
}
