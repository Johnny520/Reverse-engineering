package p117i0;

import p129ig.AbstractC2043a;
import p249qg.C3593q;
import p249qg.InterfaceC3595r;
import p332wb.C5475xi;
import p338x0.C5574d;
import wf.AbstractC5555a;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.b2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1814b2 extends AbstractC5555a implements InterfaceC3595r {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5574d f6032h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1818c2 f6033i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1814b2(C5574d c5574d, C1818c2 c1818c2) {
        C3593q c3593q = C3593q.f11606g;
        this.f6032h = c5574d;
        this.f6033i = c1818c2;
        super(c3593q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3595r
    /* JADX INFO: renamed from: m */
    public final void mo4455m(Throwable th2, InterfaceC5561g interfaceC5561g) throws Throwable {
        C5574d c5574d = this.f6032h;
        C1818c2 c1818c2 = this.f6033i;
        AbstractC2043a.m5024b0(th2, new C5475xi(c5574d, 24, c1818c2));
        InterfaceC3595r interfaceC3595r = (InterfaceC3595r) c1818c2.f6038g.mo2062s(C3593q.f11606g);
        if (interfaceC3595r == null) {
            throw th2;
        }
        interfaceC3595r.mo4455m(th2, interfaceC5561g);
    }
}
