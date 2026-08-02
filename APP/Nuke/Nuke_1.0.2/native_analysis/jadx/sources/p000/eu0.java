package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 {

    /* JADX INFO: renamed from: a */
    public int f2641a;

    /* JADX INFO: renamed from: b */
    public float f2642b;

    /* JADX INFO: renamed from: c */
    public final Object f2643c;

    public eu0(w03 w03Var) {
        this.f2643c = w03Var;
        this.f2641a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m1477a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        w03 w03Var = (w03) this.f2643c;
        int i2 = 1;
        if (z) {
            int iM5556v = up0.m5556v(w03Var.f12246f, i, z);
            z4 = i == w03Var.f12246f.getLineStart(iM5556v) || i == w03Var.m5819f(iM5556v);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f2641a == i4) {
            return this.f2642b;
        }
        float fM5822i = z3 ? w03Var.m5822i(i, z) : w03Var.m5823j(i, z);
        if (z2) {
            this.f2641a = i4;
            this.f2642b = fM5822i;
        }
        return fM5822i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1478b(float f, u00 u00Var) {
        y72 y72Var;
        if (u00Var instanceof y72) {
            y72Var = (y72) u00Var;
            int i = y72Var.f13338m;
            if ((i & Integer.MIN_VALUE) != 0) {
                y72Var.f13338m = i - Integer.MIN_VALUE;
            } else {
                y72Var = new y72(this, u00Var);
            }
        }
        Object objMo12g = y72Var.f13336k;
        int i2 = y72Var.f13338m;
        if (i2 == 0) {
            fg1.m1627T(objMo12g);
            C0071bx c0071bx = (C0071bx) this.f2643c;
            Float f2 = new Float(f);
            y72Var.f13338m = 1;
            objMo12g = c0071bx.mo12g(f2, y72Var);
            k20 k20Var = k20.f5323h;
            if (objMo12g == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objMo12g);
        }
        this.f2642b += ((Number) objMo12g).floatValue();
        return a83.f116a;
    }

    public eu0(int i, C0071bx c0071bx) {
        this.f2641a = i;
        this.f2643c = c0071bx;
    }
}
