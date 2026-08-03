package p117i0;

import java.util.concurrent.CancellationException;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p129ig.AbstractC2043a;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3593q;
import p249qg.InterfaceC3595r;
import p332wb.C5475xi;
import p338x0.C5574d;
import vg.C4554c;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1875r0 implements InterfaceC1810a2, InterfaceC3595r {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5561g f6234g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1235p f6235h;

    /* JADX INFO: renamed from: i */
    public final C4554c f6236i;

    /* JADX INFO: renamed from: j */
    public C3560e1 f6237j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1875r0(InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p) {
        this.f6234g = interfaceC5561g;
        this.f6235h = interfaceC1235p;
        this.f6236i = AbstractC3603v.m7547a(interfaceC5561g.mo2059e(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        C3560e1 c3560e1 = this.f6237j;
        if (c3560e1 != null) {
            c3560e1.mo7596x(new C1816c0(1));
        }
        this.f6237j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: f */
    public final void mo2481f() {
        C3560e1 c3560e1 = this.f6237j;
        if (c3560e1 != null) {
            c3560e1.mo7596x(new C1816c0(1));
        }
        this.f6237j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5559e
    public final InterfaceC5560f getKey() {
        return C3593q.f11606g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: j */
    public final void mo2482j() {
        C3560e1 c3560e1 = this.f6237j;
        if (c3560e1 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c3560e1.mo7485a(cancellationException);
        }
        this.f6237j = AbstractC3603v.m7563q(this.f6236i, null, this.f6235h, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3595r
    /* JADX INFO: renamed from: m */
    public final void mo4455m(Throwable th2, InterfaceC5561g interfaceC5561g) throws Throwable {
        C5574d c5574d = (C5574d) interfaceC5561g.mo2062s(C5574d.f22700h);
        if (c5574d != null) {
            AbstractC2043a.m5024b0(th2, new C5475xi(c5574d, 24, this));
        }
        InterfaceC3595r interfaceC3595r = (InterfaceC3595r) this.f6234g.mo2062s(C3593q.f11606g);
        if (interfaceC3595r == null) {
            throw th2;
        }
        interfaceC3595r.mo4455m(th2, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }
}
