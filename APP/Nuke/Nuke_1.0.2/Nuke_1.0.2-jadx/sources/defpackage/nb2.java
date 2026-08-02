package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb2 {
    public static final ob2 a = new ob2(tp0.a, sn.s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ob2 a(wf wfVar, qk qkVar, px pxVar, int i) {
        if (wfVar.equals(tp0.a) && t11.l(qkVar, sn.s)) {
            go0 go0Var = (go0) pxVar;
            go0Var.W(-1073830487);
            go0Var.p(false);
            return a;
        }
        go0 go0Var2 = (go0) pxVar;
        go0Var2.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go0Var2.f(wfVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go0Var2.f(qkVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objL = go0Var2.L();
        if (z3 || objL == nx.a) {
            objL = new ob2(wfVar, qkVar);
            go0Var2.f0(objL);
        }
        ob2 ob2Var = (ob2) objL;
        go0Var2.p(false);
        return ob2Var;
    }
}
