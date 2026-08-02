package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d71 implements fw2 {

    /* JADX INFO: renamed from: a */
    public final ak1 f1898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f71 f1899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1900c;

    public d71(f71 f71Var, Object obj) {
        this.f1899b = f71Var;
        this.f1900c = obj;
        int[] iArr = g11.f3247a;
        this.f1898a = new ak1();
    }

    @Override // p000.fw2
    /* JADX INFO: renamed from: a */
    public final void mo658a() {
        f71.m1535b(this.f1899b, this.f1900c);
    }

    @Override // p000.fw2
    /* JADX INFO: renamed from: b */
    public final int mo964b() {
        r61 r61Var = (r61) this.f1899b.f2835q.m4505g(this.f1900c);
        if (r61Var != null) {
            return ((zk1) ((jk1) r61Var.m4382n()).f5084i).f13936j;
        }
        return 0;
    }

    @Override // p000.fw2
    /* JADX INFO: renamed from: c */
    public final void mo965c(long j, int i) {
        f71 f71Var = this.f1899b;
        r61 r61Var = (r61) f71Var.f2835q.m4505g(this.f1900c);
        if (r61Var == null || !r61Var.m4350H()) {
            return;
        }
        int i2 = ((zk1) ((jk1) r61Var.m4382n()).f5084i).f13936j;
        if (i < 0 || i >= i2) {
            kz0.m2766d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (r61Var.m4351I()) {
            kz0.m2763a("Pre-measure called on node that is not placed");
        }
        r61 r61Var2 = f71Var.f2826h;
        r61Var2.f9400x = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).m479w((r61) ((jk1) r61Var.m4382n()).get(i), j);
        r61Var2.f9400x = false;
        this.f1898a.m182a(i);
    }

    @Override // p000.fw2
    /* JADX INFO: renamed from: d */
    public final void mo966d(C0792v c0792v) {
        vn1 vn1Var;
        r61 r61Var = (r61) this.f1899b.f2835q.m4505g(this.f1900c);
        th1 th1Var = (r61Var == null || (vn1Var = r61Var.f9372M) == null) ? null : (th1) vn1Var.f12036g;
        if (th1Var == null || !th1Var.f10770u) {
            return;
        }
        tb3.m5159e(th1Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0792v);
    }
}
