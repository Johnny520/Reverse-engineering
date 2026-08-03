package p249qg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: qg.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3600t0 extends C3610y0 {

    /* JADX INFO: renamed from: i */
    public final boolean f11612i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3600t0(InterfaceC3596r0 interfaceC3596r0) {
        super(true);
        boolean z9 = true;
        m7584L(interfaceC3596r0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3610y0.f11642h;
        InterfaceC3573j interfaceC3573j = (InterfaceC3573j) atomicReferenceFieldUpdater.get(this);
        C3576k c3576k = interfaceC3573j instanceof C3576k ? (C3576k) interfaceC3573j : null;
        if (c3576k == null) {
            z9 = false;
            break;
        }
        C3610y0 c3610y0M7546j = c3576k.m7546j();
        while (!c3610y0M7546j.mo7544G()) {
            InterfaceC3573j interfaceC3573j2 = (InterfaceC3573j) atomicReferenceFieldUpdater.get(c3610y0M7546j);
            C3576k c3576k2 = interfaceC3573j2 instanceof C3576k ? (C3576k) interfaceC3573j2 : null;
            if (c3576k2 == null) {
                z9 = false;
                break;
            }
            c3610y0M7546j = c3576k2.m7546j();
        }
        this.f11612i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: G */
    public final boolean mo7544G() {
        return this.f11612i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: H */
    public final boolean mo7545H() {
        return true;
    }
}
