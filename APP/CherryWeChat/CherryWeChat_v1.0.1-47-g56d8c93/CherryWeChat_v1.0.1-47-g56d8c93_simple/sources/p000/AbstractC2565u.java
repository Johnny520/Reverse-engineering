package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2565u extends C2152km implements InterfaceC0190Eb, InterfaceC1409fc {

    /* JADX INFO: renamed from: c */
    public final InterfaceC1137ac f8910c;

    public AbstractC2565u(InterfaceC1137ac r1, boolean r2) {
        super(r2);
        m4344B((InterfaceC1332dm) r1.mo24m(C1456gf.f5162f));
        this.f8910c = r1.mo23l(this);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: A */
    public final void mo4343A(C0232Fa r2) {
        AbstractC0628Oj.m1222B(this.f8910c, r2);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: H */
    public final void mo4349H(Object r2) {
        if ((r2 instanceof C0189Ea) == false) goto L6;
        AtomicIntegerFieldUpdater r0 = C0189Ea.f574b;
        r0.get((C0189Ea) r2);
        return;
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
    public final void mo264f(Object r3) {
        Throwable r0 = C0340Hw.m726a(r3);
        if (r0 == null) goto L6;
        r3 = new C0189Ea(r0, false);
    L6:
        Object r32 = m4347E(r3);
        if (r32 != AbstractC0295Gu.f998c) goto L9;
        return;
    L9:
        mo2729g(r32);
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: k */
    public final String mo4357k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
