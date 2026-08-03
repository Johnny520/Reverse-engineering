package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1367ee extends AbstractC1455ge implements InterfaceC1497hc, InterfaceC0190Eb {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4893h = AtomicReferenceFieldUpdater.newUpdater(C1367ee.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final AbstractC1217bc f4894d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0233Fb f4895e;

    /* JADX INFO: renamed from: f */
    public Object f4896f;

    /* JADX INFO: renamed from: g */
    public final Object f4897g;

    public C1367ee(AbstractC1217bc abstractC1217bc, AbstractC0233Fb abstractC0233Fb) {
        super(-1);
        this.f4894d = abstractC1217bc;
        this.f4895e = abstractC0233Fb;
        this.f4896f = AbstractC1406fG.f4983b;
        this.f4897g = abstractC0233Fb.f731b.mo25q(0, AbstractC0295Gu.f1006k);
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
    public final void mo264f(Object obj) throws C1324de {
        Throwable thM726a = C0340Hw.m726a(obj);
        Object c0189Ea = thM726a == null ? obj : new C0189Ea(thM726a, false);
        AbstractC1217bc abstractC1217bc = this.f4894d;
        AbstractC0233Fb abstractC0233Fb = this.f4895e;
        InterfaceC1137ac interfaceC1137ac = abstractC0233Fb.f731b;
        try {
            if (abstractC1217bc.mo2333u(interfaceC1137ac)) {
                this.f4896f = c0189Ea;
                this.f5157c = 0;
                AbstractC1406fG.m2713m0(abstractC1217bc, interfaceC1137ac, this);
                return;
            }
            AbstractC2588ug abstractC2588ugM2050a = AbstractC1129aB.m2050a();
            if (abstractC2588ugM2050a.f8957b >= 4294967296L) {
                this.f4896f = c0189Ea;
                this.f5157c = 0;
                C0134D4 c0134d4 = abstractC2588ugM2050a.f8959d;
                if (c0134d4 == null) {
                    c0134d4 = new C0134D4();
                    abstractC2588ugM2050a.f8959d = c0134d4;
                }
                c0134d4.addLast(this);
                return;
            }
            abstractC2588ugM2050a.m5096y(true);
            try {
                Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, this.f4897g);
                try {
                    abstractC0233Fb.mo264f(obj);
                    while (abstractC2588ugM2050a.m5097z()) {
                    }
                } finally {
                    AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
                }
            } finally {
                try {
                } finally {
                }
            }
        } catch (Throwable th) {
            throw new C1324de(th, abstractC1217bc, interfaceC1137ac);
        }
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: i */
    public final Object mo1015i() {
        Object obj = this.f4896f;
        this.f4896f = AbstractC1406fG.f4983b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4894d + ", " + AbstractC0148Dc.m287u(this.f4895e) + ']';
    }
}
