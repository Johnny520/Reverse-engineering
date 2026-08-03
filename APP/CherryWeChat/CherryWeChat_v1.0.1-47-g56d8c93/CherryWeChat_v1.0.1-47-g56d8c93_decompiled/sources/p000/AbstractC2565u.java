package p000;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2565u extends C2152km implements InterfaceC0190Eb, InterfaceC1409fc {

    /* JADX INFO: renamed from: c */
    public final InterfaceC1137ac f8910c;

    public AbstractC2565u(InterfaceC1137ac interfaceC1137ac, boolean z) {
        super(z);
        m4344B((InterfaceC1332dm) interfaceC1137ac.mo24m(C1456gf.f5162f));
        this.f8910c = interfaceC1137ac.mo23l(this);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: A */
    public final void mo4343A(C0232Fa c0232Fa) {
        AbstractC0628Oj.m1222B(this.f8910c, c0232Fa);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: H */
    public final void mo4349H(Object obj) {
        if (obj instanceof C0189Ea) {
            C0189Ea.f574b.get((C0189Ea) obj);
        }
    }

    @Override // p000.InterfaceC1409fc
    /* JADX INFO: renamed from: a */
    public final InterfaceC1137ac mo152a() {
        return this.f8910c;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f8910c;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object obj) {
        Throwable thM726a = C0340Hw.m726a(obj);
        if (thM726a != null) {
            obj = new C0189Ea(thM726a, false);
        }
        Object objM4347E = m4347E(obj);
        if (objM4347E == AbstractC0295Gu.f998c) {
            return;
        }
        mo2729g(objM4347E);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: k */
    public final String mo4357k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
