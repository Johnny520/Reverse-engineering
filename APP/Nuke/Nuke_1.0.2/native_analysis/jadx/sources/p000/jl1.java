package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 implements InterfaceC0432lp, gc3 {

    /* JADX INFO: renamed from: h */
    public final C0469mp f5096h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kl1 f5097i;

    public jl1(kl1 kl1Var, C0469mp c0469mp) {
        this.f5097i = kl1Var;
        this.f5096h = c0469mp;
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: C */
    public final void mo2507C(Object obj) throws j90 {
        this.f5096h.mo2507C(obj);
    }

    @Override // p000.gc3
    /* JADX INFO: renamed from: a */
    public final void mo1829a(lm2 lm2Var, int i) {
        this.f5096h.mo1829a(lm2Var, i);
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f5096h.f6743l;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        this.f5096h.mo2509h(obj);
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: i */
    public final void mo2510i(Object obj, nn0 nn0Var) throws j90 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kl1.f5630h;
        kl1 kl1Var = this.f5097i;
        atomicReferenceFieldUpdater.set(kl1Var, null);
        C0792v c0792v = new C0792v(17, kl1Var, this);
        C0469mp c0469mp = this.f5096h;
        c0469mp.m3141E((a83) obj, c0469mp.f6520j, new wt0(2, c0792v));
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: l */
    public final hh1 mo2511l(Object obj, nn0 nn0Var) {
        kl1 kl1Var = this.f5097i;
        wt0 wt0Var = new wt0(kl1Var, this);
        hh1 hh1VarM3143H = this.f5096h.m3143H((a83) obj, wt0Var);
        if (hh1VarM3143H != null) {
            kl1.f5630h.set(kl1Var, null);
        }
        return hh1VarM3143H;
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: n */
    public final boolean mo2512n(Throwable th) {
        return this.f5096h.mo2512n(th);
    }
}
