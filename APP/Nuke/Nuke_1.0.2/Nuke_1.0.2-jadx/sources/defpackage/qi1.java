package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qi1 extends tw2 implements mn0 {
    public y62 l;
    public y62 m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z62 q;
    public final /* synthetic */ o72 r;
    public final /* synthetic */ o72 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ si1 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ im2 w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(z62 z62Var, o72 o72Var, o72 o72Var2, float f, si1 si1Var, float f2, im2 im2Var, t00 t00Var) {
        super(2, t00Var);
        this.q = z62Var;
        this.r = o72Var;
        this.s = o72Var2;
        this.t = f;
        this.u = si1Var;
        this.v = f2;
        this.w = im2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((qi1) p((t00) obj2, (gm2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        qi1 qi1Var = new qi1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, t00Var);
        qi1Var.p = obj;
        return qi1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:44:0x01a9) to fix multi-entry loop: BACK_EDGE: B:44:0x01a9 -> B:37:0x017e */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0175 -> B:36:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0188 -> B:38:0x0184). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        gm2 gm2Var;
        y62 y62Var;
        z62 z62Var;
        o72 o72Var;
        gm2 gm2Var2;
        k20 k20Var;
        int i;
        char c;
        k20 k20Var2;
        int i2;
        int i3;
        o72 o72Var2;
        y62 y62Var2;
        boolean z;
        qi1 qi1Var = this;
        int i4 = qi1Var.o;
        o72 o72Var3 = qi1Var.s;
        z62 z62Var2 = qi1Var.q;
        char c2 = 3;
        int i5 = 2;
        int i6 = 1;
        o72 o72Var4 = qi1Var.r;
        k20 k20Var3 = k20.h;
        if (i4 == 0) {
            fg1.T(obj);
            gm2Var = (gm2) qi1Var.p;
            y62 y62Var3 = new y62();
            y62Var3.h = true;
            y62Var = y62Var3;
            z = y62Var.h;
            a83 a83Var = a83.a;
            if (!z) {
            }
        } else if (i4 == 1) {
            y62 y62Var4 = qi1Var.m;
            y62Var2 = qi1Var.l;
            gm2 gm2Var3 = (gm2) qi1Var.p;
            fg1.T(obj);
            c = 3;
            i2 = 1;
            k20Var2 = k20Var3;
            gm2Var2 = gm2Var3;
            i3 = 2;
            o72Var2 = o72Var4;
            y62Var4.h = ((Boolean) obj).booleanValue();
            qi1Var = this;
            o72Var4 = o72Var2;
            gm2Var = gm2Var2;
            y62Var = y62Var2;
            i5 = i3;
            i6 = i2;
            k20Var3 = k20Var2;
            c2 = c;
            z = y62Var.h;
            a83 a83Var2 = a83.a;
            if (!z) {
            }
        } else if (i4 == 2) {
            i = qi1Var.n;
            y62 y62Var5 = qi1Var.l;
            gm2 gm2Var4 = (gm2) qi1Var.p;
            fg1.T(obj);
            z62Var = z62Var2;
            k20Var = k20Var3;
            y62Var = y62Var5;
            gm2Var2 = gm2Var4;
            o72Var = o72Var3;
            if (y62Var.h) {
            }
        } else {
            if (i4 != 3) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y62 y62Var6 = qi1Var.m;
            y62Var2 = qi1Var.l;
            gm2 gm2Var5 = (gm2) qi1Var.p;
            fg1.T(obj);
            y62Var = y62Var6;
            c = 3;
            i2 = 1;
            k20Var2 = k20Var3;
            gm2Var2 = gm2Var5;
            Object objD = obj;
            i3 = 2;
            o72Var2 = o72Var4;
            y62Var.h = ((Boolean) objD).booleanValue();
            o72Var4 = o72Var2;
            gm2Var = gm2Var2;
            y62Var = y62Var2;
            i5 = i3;
            i6 = i2;
            k20Var3 = k20Var2;
            c2 = c;
            z = y62Var.h;
            a83 a83Var22 = a83.a;
            if (!z) {
                y62Var.h = false;
                float fFloatValue = z62Var2.h - ((Number) ((id) o72Var4.i).i.getValue()).floatValue();
                boolean z2 = ((oi1) o72Var3.i).c;
                si1 si1Var = qi1Var.u;
                if (!z2) {
                    float fAbs = Math.abs(fFloatValue);
                    float f = qi1Var.t;
                    if (fAbs >= f) {
                        float fSignum = Math.signum(fFloatValue) * f;
                        si1Var.e(gm2Var, fSignum);
                        id idVar = (id) o72Var4.i;
                        id idVarD = s11.D(idVar, ((Number) idVar.i.getValue()).floatValue() + fSignum);
                        o72Var4.i = idVarD;
                        int iQ = gf1.Q(Math.abs(z62Var2.h - ((Number) idVarD.i.getValue()).floatValue()) / qi1Var.v);
                        if (iQ > 100) {
                            iQ = 100;
                        }
                        id idVar2 = (id) o72Var4.i;
                        float f2 = z62Var2.h;
                        int i7 = iQ;
                        si1 si1Var2 = qi1Var.u;
                        k20Var = k20Var3;
                        z62Var = z62Var2;
                        o72Var = o72Var3;
                        h9 h9Var = new h9(si1Var2, o72Var, z62Var, qi1Var.w, y62Var, 2);
                        qi1Var.p = gm2Var;
                        qi1Var.l = y62Var;
                        qi1Var.m = null;
                        qi1Var.n = i7;
                        qi1Var.o = i5;
                        si1Var2.getClass();
                        z62 z62Var3 = new z62();
                        z62Var3.h = ((Number) idVar2.i.getValue()).floatValue();
                        Float f3 = new Float(f2);
                        m43 m43VarJ = up0.J(i7, hd0.b, i5);
                        gm2 gm2Var6 = gm2Var;
                        pc pcVar = new pc(z62Var3, si1Var2, gm2Var6, h9Var, 7);
                        gm2Var2 = gm2Var6;
                        Object objN = te.n(idVar2, f3, m43VarJ, pcVar, qi1Var);
                        if (objN != k20Var) {
                            objN = a83Var22;
                        }
                        if (objN == k20Var) {
                            return k20Var;
                        }
                        i = i7;
                        if (y62Var.h) {
                            qi1Var.p = gm2Var2;
                            qi1Var.l = y62Var;
                            qi1Var.m = y62Var;
                            qi1Var.o = 3;
                            c = 3;
                            k20Var2 = k20Var;
                            i2 = 1;
                            o72 o72Var5 = o72Var;
                            i3 = i5;
                            o72Var2 = o72Var4;
                            o72Var3 = o72Var5;
                            z62Var2 = z62Var;
                            objD = si1.d(qi1Var.u, o72Var3, z62Var2, qi1Var.w, o72Var2, 50 - ((long) i), qi1Var);
                            if (objD == k20Var2) {
                                return k20Var2;
                            }
                            y62Var2 = y62Var;
                            y62Var.h = ((Boolean) objD).booleanValue();
                            o72Var4 = o72Var2;
                            gm2Var = gm2Var2;
                            y62Var = y62Var2;
                            i5 = i3;
                            i6 = i2;
                            k20Var3 = k20Var2;
                            c2 = c;
                            z = y62Var.h;
                            a83 a83Var222 = a83.a;
                            if (!z) {
                                return a83Var222;
                            }
                        } else {
                            o72Var3 = o72Var;
                            c = 3;
                            gm2Var = gm2Var2;
                            z62Var2 = z62Var;
                            i6 = 1;
                            k20Var3 = k20Var;
                            c2 = c;
                            z = y62Var.h;
                            a83 a83Var2222 = a83.a;
                            if (!z) {
                            }
                        }
                    }
                }
                c = c2;
                i3 = i5;
                i2 = i6;
                o72Var2 = o72Var4;
                k20Var2 = k20Var3;
                gm2Var2 = gm2Var;
                si1Var.e(gm2Var2, fFloatValue);
                qi1Var.p = gm2Var2;
                qi1Var.l = y62Var;
                qi1Var.m = y62Var;
                qi1Var.o = i2;
                Object objD2 = si1.d(qi1Var.u, o72Var3, z62Var2, qi1Var.w, o72Var2, 50L, qi1Var);
                if (objD2 == k20Var2) {
                    return k20Var2;
                }
                y62Var2 = y62Var;
                y62Var.h = ((Boolean) objD2).booleanValue();
                qi1Var = this;
                o72Var4 = o72Var2;
                gm2Var = gm2Var2;
                y62Var = y62Var2;
                i5 = i3;
                i6 = i2;
                k20Var3 = k20Var2;
                c2 = c;
                z = y62Var.h;
                a83 a83Var22222 = a83.a;
                if (!z) {
                }
            }
        }
    }
}
