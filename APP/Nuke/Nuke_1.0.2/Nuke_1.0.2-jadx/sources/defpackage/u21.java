package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u21 {
    public static final t21 d = new t21(new f31(false, false, true, "    ", "type", true, zs.j, true), rg3.m);
    public final f31 a;
    public final i51 b;
    public final n4 c = new n4(12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u21(f31 f31Var, i51 i51Var) {
        this.a = f31Var;
        this.b = i51Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(w41 w41Var, String str) {
        qb2 qb2VarB = xe1.b(this, str);
        Object objC = new cv2(this, fg3.j, qb2VarB, w41Var.e()).c(w41Var);
        if (qb2VarB.f() == 10) {
            return objC;
        }
        qb2.m(qb2VarB, "Expected EOF after parsing, but had " + ((String) qb2VarB.g).charAt(qb2VarB.b - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(w41 w41Var, Object obj) {
        char[] cArr;
        w41Var.getClass();
        dk dkVar = new dk((byte) 0, 6);
        rq rqVar = rq.c;
        synchronized (rqVar) {
            ag agVar = rqVar.a;
            cArr = null;
            char[] cArr2 = (char[]) (agVar.isEmpty() ? null : agVar.removeLast());
            if (cArr2 != null) {
                rqVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        dkVar.j = cArr;
        try {
            new dv2(this.a.b ? new ux(dkVar, this) : new ox(dkVar), this, fg3.j, new dv2[fg3.o.a()]).e(w41Var, obj);
            return dkVar.toString();
        } finally {
            dkVar.p();
        }
    }
}
