package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2350p7 extends AbstractC0399JB {

    /* JADX INFO: renamed from: a */
    public boolean f8229a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f8230b;

    public C2350p7(ViewGroup r2) {
        this.f8229a = false;
        this.f8230b = r2;
    }

    @Override // p000.AbstractC0399JB, p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
        AbstractC0828TB.m1630H(this.f8230b, false);
    }

    @Override // p000.AbstractC0399JB, p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
        AbstractC0828TB.m1630H(this.f8230b, true);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB r3) {
        if (this.f8229a == true) goto L5;
        AbstractC0828TB.m1630H(this.f8230b, false);
    L5:
        r3.mo786x(this);
    }

    @Override // p000.AbstractC0399JB, p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB r2) {
        AbstractC0828TB.m1630H(this.f8230b, false);
        this.f8229a = true;
    }
}
