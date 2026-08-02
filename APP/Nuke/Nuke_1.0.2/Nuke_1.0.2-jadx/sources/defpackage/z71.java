package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 {
    public final cc2 a;
    public final f0 b;
    public final rk1 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z71(cc2 cc2Var, f0 f0Var) {
        this.a = cc2Var;
        this.b = f0Var;
        long[] jArr = ed2.a;
        this.c = new rk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mn0 a(int i, Object obj, Object obj2) {
        rk1 rk1Var = this.c;
        y71 y71Var = (y71) rk1Var.g(obj);
        int i2 = 13;
        if (y71Var != null && y71Var.c == i && t11.l(y71Var.b, obj2)) {
            kw kwVar = y71Var.d;
            if (kwVar != null) {
                return kwVar;
            }
            kw kwVar2 = new kw(818252804, true, new af(i2, y71Var.e, y71Var));
            y71Var.d = kwVar2;
            return kwVar2;
        }
        y71 y71Var2 = new y71(this, i, obj, obj2);
        rk1Var.m(obj, y71Var2);
        kw kwVar3 = y71Var2.d;
        if (kwVar3 != null) {
            return kwVar3;
        }
        kw kwVar4 = new kw(818252804, true, new af(i2, this, y71Var2));
        y71Var2.d = kwVar4;
        return kwVar4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        y71 y71Var = (y71) this.c.g(obj);
        if (y71Var != null) {
            return y71Var.b;
        }
        t81 t81Var = (t81) this.b.a();
        int iG = t81Var.d.g(obj);
        if (iG != -1) {
            return t81Var.b(iG);
        }
        return null;
    }
}
