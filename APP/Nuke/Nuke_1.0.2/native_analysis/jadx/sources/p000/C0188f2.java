package p000;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: renamed from: f2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0188f2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2740l;

    /* JADX INFO: renamed from: m */
    public int f2741m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f2742n;

    /* JADX INFO: renamed from: o */
    public Object f2743o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2744p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f2745q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188f2(vy2 vy2Var, long j, zy2 zy2Var, uy2 uy2Var, t00 t00Var) {
        super(2, t00Var);
        this.f2740l = 3;
        this.f2743o = vy2Var;
        this.f2742n = j;
        this.f2744p = zy2Var;
        this.f2745q = uy2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2740l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0188f2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((C0188f2) mo13p((t00) obj2, (TextClassifier) obj)).mo7r(a83Var);
            case 2:
                return ((C0188f2) mo13p((t00) obj2, (gm2) obj)).mo7r(a83Var);
            default:
                return ((C0188f2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f2740l;
        Object obj2 = this.f2745q;
        Object obj3 = this.f2744p;
        switch (i) {
            case 0:
                return new C0188f2((k21) obj3, this.f2742n, (bk1) obj2, t00Var, 0);
            case 1:
                C0188f2 c0188f2 = new C0188f2(this.f2742n, t00Var, (p02) obj3, (CharSequence) obj2);
                c0188f2.f2743o = obj;
                return c0188f2;
            case 2:
                C0188f2 c0188f22 = new C0188f2((im2) obj3, this.f2742n, (z62) obj2, t00Var, 2);
                c0188f22.f2743o = obj;
                return c0188f22;
            default:
                return new C0188f2((vy2) this.f2743o, this.f2742n, (zy2) obj3, (uy2) obj2, t00Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        a32 a32Var;
        int i = this.f2740l;
        int i2 = 3;
        long j = this.f2742n;
        Object obj2 = this.f2745q;
        Object obj3 = this.f2744p;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                bk1 bk1Var = (bk1) obj2;
                int i3 = this.f2741m;
                if (i3 != 0) {
                    if (i3 == 1) {
                        fg1.m1627T(obj);
                    } else if (i3 == 2) {
                        a32Var = (a32) this.f2743o;
                        fg1.m1627T(obj);
                        this.f2743o = null;
                        this.f2741m = 3;
                        if (bk1Var.m554a(a32Var, this) == k20Var) {
                        }
                    } else if (i3 != 3) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    this.f2741m = 1;
                    if (((k21) obj3).mo1701A(this) == k20Var) {
                    }
                }
                z22 z22Var = new z22(j);
                a32 a32Var2 = new a32(z22Var);
                this.f2743o = a32Var2;
                this.f2741m = 2;
                if (bk1Var.m554a(z22Var, this) != k20Var) {
                    a32Var = a32Var2;
                    this.f2743o = null;
                    this.f2741m = 3;
                    if (bk1Var.m554a(a32Var, this) == k20Var) {
                    }
                    break;
                }
                break;
            case 1:
                int i4 = this.f2741m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    TextClassifier textClassifier = (TextClassifier) this.f2743o;
                    this.f2741m = 1;
                    if (p02.m3671a((p02) obj3, (CharSequence) obj2, this.f2742n, textClassifier, this) == k20Var) {
                    }
                }
                break;
            case 2:
                im2 im2Var = (im2) obj3;
                int i5 = this.f2741m;
                if (i5 != 0) {
                    if (i5 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    gm2 gm2Var = (gm2) this.f2743o;
                    float fM2370g = im2Var.m2370g(j);
                    tt0 tt0Var = new tt0((z62) obj2, im2Var, gm2Var, 10);
                    this.f2741m = 1;
                    qt2 qt2VarM5528G = up0.m5528G(0.0f, 0.0f, null, 7);
                    n43 n43Var = rg3.f9572n;
                    Float f = new Float(0.0f);
                    Float f2 = new Float(fM2370g);
                    Float f3 = new Float(0.0f);
                    in0 in0Var = n43Var.f7004a;
                    AbstractC0494nd abstractC0494ndMo2479c = (AbstractC0494nd) in0Var.mo5j(f3);
                    if (abstractC0494ndMo2479c == null) {
                        abstractC0494ndMo2479c = ((AbstractC0494nd) in0Var.mo5j(f)).mo2479c();
                    }
                    AbstractC0494nd abstractC0494nd = abstractC0494ndMo2479c;
                    Object objM5222m = AbstractC0731te.m5222m(new C0310id(n43Var, f, abstractC0494nd, 56), new cy2(qt2VarM5528G, n43Var, f, f2, abstractC0494nd), Long.MIN_VALUE, new xq2(i2, tt0Var), this);
                    if (objM5222m != k20Var) {
                        objM5222m = a83Var;
                    }
                    if (objM5222m != k20Var) {
                        objM5222m = a83Var;
                    }
                    if (objM5222m == k20Var) {
                    }
                }
                break;
            default:
                int i6 = this.f2741m;
                if (i6 != 0) {
                    if (i6 == 1) {
                        fg1.m1627T(obj);
                    } else if (i6 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    uz2 uz2Var = ((vy2) this.f2743o).f12228x;
                    if (uz2Var != null) {
                        this.f2741m = 1;
                        if (new uz2(uz2Var.f11571n, this, 0).mo7r(a83Var) == k20Var) {
                        }
                    }
                }
                this.f2741m = 2;
                if (((zy2) obj3).mo1928a((uy2) obj2, this) == k20Var) {
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188f2(long j, t00 t00Var, p02 p02Var, CharSequence charSequence) {
        super(2, t00Var);
        this.f2740l = 1;
        this.f2744p = p02Var;
        this.f2745q = charSequence;
        this.f2742n = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0188f2(Object obj, long j, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f2740l = i;
        this.f2744p = obj;
        this.f2742n = j;
        this.f2745q = obj2;
    }
}
