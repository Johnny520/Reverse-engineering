package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ long n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(vy2 vy2Var, long j, zy2 zy2Var, uy2 uy2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.o = vy2Var;
        this.n = j;
        this.p = zy2Var;
        this.q = uy2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((f2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((f2) p((t00) obj2, (TextClassifier) obj)).r(a83Var);
            case 2:
                return ((f2) p((t00) obj2, (gm2) obj)).r(a83Var);
            default:
                return ((f2) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                return new f2((k21) obj3, this.n, (bk1) obj2, t00Var, 0);
            case 1:
                f2 f2Var = new f2(this.n, t00Var, (p02) obj3, (CharSequence) obj2);
                f2Var.o = obj;
                return f2Var;
            case 2:
                f2 f2Var2 = new f2((im2) obj3, this.n, (z62) obj2, t00Var, 2);
                f2Var2.o = obj;
                return f2Var2;
            default:
                return new f2((vy2) this.o, this.n, (zy2) obj3, (uy2) obj2, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        a32 a32Var;
        int i = this.l;
        int i2 = 3;
        long j = this.n;
        Object obj2 = this.q;
        Object obj3 = this.p;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                bk1 bk1Var = (bk1) obj2;
                int i3 = this.m;
                if (i3 != 0) {
                    if (i3 == 1) {
                        fg1.T(obj);
                    } else if (i3 == 2) {
                        a32Var = (a32) this.o;
                        fg1.T(obj);
                        this.o = null;
                        this.m = 3;
                        if (bk1Var.a(a32Var, this) == k20Var) {
                        }
                    } else if (i3 != 3) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    this.m = 1;
                    if (((k21) obj3).A(this) == k20Var) {
                    }
                }
                z22 z22Var = new z22(j);
                a32 a32Var2 = new a32(z22Var);
                this.o = a32Var2;
                this.m = 2;
                if (bk1Var.a(z22Var, this) != k20Var) {
                    a32Var = a32Var2;
                    this.o = null;
                    this.m = 3;
                    if (bk1Var.a(a32Var, this) == k20Var) {
                    }
                    break;
                }
                break;
            case 1:
                int i4 = this.m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    TextClassifier textClassifier = (TextClassifier) this.o;
                    this.m = 1;
                    if (p02.a((p02) obj3, (CharSequence) obj2, this.n, textClassifier, this) == k20Var) {
                    }
                }
                break;
            case 2:
                im2 im2Var = (im2) obj3;
                int i5 = this.m;
                if (i5 != 0) {
                    if (i5 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    gm2 gm2Var = (gm2) this.o;
                    float fG = im2Var.g(j);
                    tt0 tt0Var = new tt0((z62) obj2, im2Var, gm2Var, 10);
                    this.m = 1;
                    qt2 qt2VarG = up0.G(0.0f, 0.0f, null, 7);
                    n43 n43Var = rg3.n;
                    Float f = new Float(0.0f);
                    Float f2 = new Float(fG);
                    Float f3 = new Float(0.0f);
                    in0 in0Var = n43Var.a;
                    nd ndVarC = (nd) in0Var.j(f3);
                    if (ndVarC == null) {
                        ndVarC = ((nd) in0Var.j(f)).c();
                    }
                    nd ndVar = ndVarC;
                    Object objM = te.m(new id(n43Var, f, ndVar, 56), new cy2(qt2VarG, n43Var, f, f2, ndVar), Long.MIN_VALUE, new xq2(i2, tt0Var), this);
                    if (objM != k20Var) {
                        objM = a83Var;
                    }
                    if (objM != k20Var) {
                        objM = a83Var;
                    }
                    if (objM == k20Var) {
                    }
                }
                break;
            default:
                int i6 = this.m;
                if (i6 != 0) {
                    if (i6 == 1) {
                        fg1.T(obj);
                    } else if (i6 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    uz2 uz2Var = ((vy2) this.o).x;
                    if (uz2Var != null) {
                        this.m = 1;
                        if (new uz2(uz2Var.n, this, 0).r(a83Var) == k20Var) {
                        }
                    }
                }
                this.m = 2;
                if (((zy2) obj3).a((uy2) obj2, this) == k20Var) {
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j, t00 t00Var, p02 p02Var, CharSequence charSequence) {
        super(2, t00Var);
        this.l = 1;
        this.p = p02Var;
        this.q = charSequence;
        this.n = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(Object obj, long j, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.p = obj;
        this.n = j;
        this.q = obj2;
    }
}
