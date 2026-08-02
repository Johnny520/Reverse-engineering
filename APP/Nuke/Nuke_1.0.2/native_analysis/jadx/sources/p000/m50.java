package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public z62 f6475l;

    /* JADX INFO: renamed from: m */
    public C0310id f6476m;

    /* JADX INFO: renamed from: n */
    public int f6477n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ float f6478o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ n50 f6479p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ em2 f6480q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(float f, n50 n50Var, em2 em2Var, t00 t00Var) {
        super(2, t00Var);
        this.f6478o = f;
        this.f6479p = n50Var;
        this.f6480q = em2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((m50) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new m50(this.f6478o, this.f6479p, this.f6480q, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        float f;
        C0310id c0310id;
        z62 z62Var;
        C0310id c0310id2;
        r40 r40Var;
        C0575pc c0575pc;
        Object objM5222m;
        Object obj2;
        int i = this.f6477n;
        if (i == 0) {
            fg1.m1627T(obj);
            f = this.f6478o;
            if (Math.abs(f) > 1.0f) {
                z62 z62Var2 = new z62();
                z62Var2.f13745h = f;
                z62 z62Var3 = new z62();
                C0310id c0310idM4682a = s11.m4682a(f, 28);
                try {
                    n50 n50Var = this.f6479p;
                    r40Var = n50Var.f7007a;
                    c0575pc = new C0575pc(z62Var3, this.f6480q, z62Var2, n50Var, 3);
                    this.f6475l = z62Var2;
                    this.f6476m = c0310idM4682a;
                    this.f6477n = 1;
                    c0310id = c0310idM4682a;
                } catch (CancellationException unused) {
                    c0310id = c0310idM4682a;
                }
                try {
                    objM5222m = AbstractC0731te.m5222m(c0310id, new q40(r40Var, rg3.f9572n, c0310idM4682a.f4561i.getValue(), c0310idM4682a.f4562j), Long.MIN_VALUE, c0575pc, this);
                    obj2 = k20.f5323h;
                    if (objM5222m != obj2) {
                        objM5222m = a83.f116a;
                    }
                } catch (CancellationException unused2) {
                    z62Var = z62Var2;
                    c0310id2 = c0310id;
                    z62Var.f13745h = ((Number) c0310id2.f4560h.f7005b.mo5j(c0310id2.f4562j)).floatValue();
                }
                if (objM5222m == obj2) {
                    return obj2;
                }
                z62Var = z62Var2;
                f = z62Var.f13745h;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0310id2 = this.f6476m;
            z62Var = this.f6475l;
            try {
                fg1.m1627T(obj);
            } catch (CancellationException unused3) {
                z62Var.f13745h = ((Number) c0310id2.f4560h.f7005b.mo5j(c0310id2.f4562j)).floatValue();
            }
            f = z62Var.f13745h;
        }
        return new Float(f);
    }
}
