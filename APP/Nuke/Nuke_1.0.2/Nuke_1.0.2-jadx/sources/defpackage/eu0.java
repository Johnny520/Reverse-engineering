package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 {
    public int a;
    public float b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eu0(w03 w03Var) {
        this.c = w03Var;
        this.a = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        w03 w03Var = (w03) this.c;
        int i2 = 1;
        if (z) {
            int iV = up0.v(w03Var.f, i, z);
            z4 = i == w03Var.f.getLineStart(iV) || i == w03Var.f(iV);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fI = z3 ? w03Var.i(i, z) : w03Var.j(i, z);
        if (z2) {
            this.a = i4;
            this.b = fI;
        }
        return fI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, u00 u00Var) {
        y72 y72Var;
        if (u00Var instanceof y72) {
            y72Var = (y72) u00Var;
            int i = y72Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                y72Var.m = i - Integer.MIN_VALUE;
            } else {
                y72Var = new y72(this, u00Var);
            }
        }
        Object objG = y72Var.k;
        int i2 = y72Var.m;
        if (i2 == 0) {
            fg1.T(objG);
            bx bxVar = (bx) this.c;
            Float f2 = new Float(f);
            y72Var.m = 1;
            objG = bxVar.g(f2, y72Var);
            k20 k20Var = k20.h;
            if (objG == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objG);
        }
        this.b += ((Number) objG).floatValue();
        return a83.a;
    }

    public eu0(int i, bx bxVar) {
        this.a = i;
        this.c = bxVar;
    }
}
