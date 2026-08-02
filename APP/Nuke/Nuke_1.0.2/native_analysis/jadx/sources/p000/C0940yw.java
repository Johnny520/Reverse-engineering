package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940yw extends AbstractC0796v3 {

    /* JADX INFO: renamed from: j */
    public final j20 f13636j;

    /* JADX INFO: renamed from: k */
    public mn0 f13637k;

    /* JADX INFO: renamed from: l */
    public C0356jn f13638l;

    /* JADX INFO: renamed from: m */
    public zt2 f13639m;

    /* JADX INFO: renamed from: n */
    public boolean f13640n;

    public C0940yw(j20 j20Var, m22 m22Var) {
        super(m22Var);
        this.f13636j = j20Var;
        this.f13637k = new C0688sb(2, null, 4);
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: e */
    public final void mo5615e() {
        C0356jn c0356jn = this.f13638l;
        if (c0356jn != null) {
            c0356jn.m2531g(new CancellationException("onBack cancelled"), true);
        }
        zt2 zt2Var = this.f13639m;
        if (zt2Var != null) {
            zt2Var.mo1704c(null);
        }
        this.f13638l = null;
        this.f13639m = null;
        this.f13640n = false;
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: f */
    public final void mo5005f() {
        if (this.f13638l != null && !this.f13640n) {
            mo5615e();
        }
        t00 t00Var = null;
        if (this.f13638l == null) {
            this.f13640n = false;
            this.f13638l = fg1.m1630a(-2, 4, EnumC0283hn.f4084h);
            this.f13639m = AbstractC0570p7.m3745A(this.f13636j, null, new C0003a2(this, t00Var, 10), 3);
        }
        C0356jn c0356jn = this.f13638l;
        if (c0356jn != null) {
            c0356jn.m2531g(null, false);
        }
        this.f13640n = false;
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: g */
    public final void mo5616g(C0132dj c0132dj) {
        C0356jn c0356jn = this.f13638l;
        if (c0356jn != null) {
            c0356jn.mo2225s(c0132dj);
        }
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: h */
    public final void mo5617h() {
        mo5615e();
        if (super.m5614d()) {
            this.f13640n = true;
            this.f13638l = fg1.m1630a(-2, 4, EnumC0283hn.f4084h);
            this.f13639m = AbstractC0570p7.m3745A(this.f13636j, null, new C0003a2(this, null, 10), 3);
        }
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: j */
    public final void mo5619j(boolean z) {
        zt2 zt2Var;
        if (!z && super.m5614d() && (zt2Var = this.f13639m) != null && !zt2Var.mo1703b()) {
            mo5615e();
        }
        super.mo5619j(z);
    }
}
