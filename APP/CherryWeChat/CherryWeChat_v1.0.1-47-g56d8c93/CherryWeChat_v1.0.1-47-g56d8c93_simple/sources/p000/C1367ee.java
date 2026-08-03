package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1367ee extends AbstractC1455ge implements InterfaceC1497hc, InterfaceC0190Eb {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4893h = null;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final AbstractC1217bc f4894d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0233Fb f4895e;

    /* JADX INFO: renamed from: f */
    public Object f4896f;

    /* JADX INFO: renamed from: g */
    public final Object f4897g;

    static {
        f4893h = AtomicReferenceFieldUpdater.newUpdater(C1367ee.class, Object.class, "_reusableCancellableContinuation$volatile");
    }

    public C1367ee(AbstractC1217bc r2, AbstractC0233Fb r3) {
        super(-1);
        this.f4894d = r2;
        this.f4895e = r3;
        this.f4896f = AbstractC1406fG.f4983b;
        this.f4897g = r3.f731b.mo25q(0, AbstractC0295Gu.f1006k);
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0190Eb mo1011b() {
        return this;
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        return this.f4895e;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f4895e.f731b;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object r10) {
        Throwable r0 = C0340Hw.m726a(r10);
        if (r0 != null) goto L5;
        Object r2 = r10;
    L6:
        AbstractC1217bc r02 = this.f4894d;
        AbstractC0233Fb r3 = this.f4895e;
        InterfaceC1137ac r4 = r3.f731b;
        if (r02.mo2333u(r4) == false) goto L11;
        this.f4896f = r2;
        this.f5157c = 0;
        AbstractC1406fG.m2713m0(r02, r4, this);
        return;
    L11:
        AbstractC2588ug r03 = AbstractC1129aB.m2050a();
        if (r03.f8957b < 4294967296L) goto L18;
        this.f4896f = r2;
        this.f5157c = 0;
        C0134D4 r102 = r03.f8959d;
        if (r102 != null) goto L16;
        r102 = new C0134D4();
        r03.f8959d = r102;
    L16:
        r102.addLast(this);
        return;
    L18:
        r03.m5096y(true);
        Object r1 = AbstractC0295Gu.m604E(r4, this.f4897g);     // Catch: Throwable -> L25
        r3.mo264f(r10);     // Catch: Throwable -> L27
        AbstractC0295Gu.m601B(r4, r1);     // Catch: Throwable -> L25
    L23:
        if (r03.m5097z() == true) goto L23;
    L24:
        r03.m5095w();
        return;
    L27:
        th = move-exception;
        AbstractC0295Gu.m601B(r4, r1);     // Catch: Throwable -> L25
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        m2782h(th);     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        r03.m5095w();
        throw th;
    L36:
        th = move-exception;
        throw new C1324de(th, r02, r4);
    L5:
        r2 = new C0189Ea(r0, false);
        goto L6
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: i */
    public final Object mo1015i() {
        Object r0 = this.f4896f;
        this.f4896f = AbstractC1406fG.f4983b;
        return r0;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4894d + ", " + AbstractC0148Dc.m287u(this.f4895e) + ']';
    }
}
