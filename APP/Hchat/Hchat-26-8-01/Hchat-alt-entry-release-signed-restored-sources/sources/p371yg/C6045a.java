package p371yg;

import p070f0.C0976h;
import p085fg.InterfaceC1236q;
import p162l3.C2463q;
import p249qg.C3564g;
import p249qg.InterfaceC3561f;
import p249qg.InterfaceC3590o1;
import p276sf.C3967n;
import vg.AbstractC4568q;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: yg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6045a implements InterfaceC3561f, InterfaceC3590o1 {

    /* JADX INFO: renamed from: g */
    public final C3564g f24498g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C6046b f24499h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6045a(C6046b c6046b, C3564g c3564g) {
        this.f24499h = c6046b;
        this.f24498g = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: A */
    public final void mo7498A(Object obj) {
        this.f24498g.mo7498A(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3590o1
    /* JADX INFO: renamed from: a */
    public final void mo7505a(AbstractC4568q abstractC4568q, int i9) {
        this.f24498g.mo7505a(abstractC4568q, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f24498g.f11567k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: j */
    public final C2463q mo7499j(Object obj, InterfaceC1236q interfaceC1236q) {
        C6046b c6046b = this.f24499h;
        C0976h c0976h = new C0976h(c6046b, this);
        C2463q c2463qMo7499j = this.f24498g.mo7499j((C3967n) obj, c0976h);
        if (c2463qMo7499j != null) {
            C6046b.f24500g.set(c6046b, null);
        }
        return c2463qMo7499j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        this.f24498g.resumeWith(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: w */
    public final boolean mo7500w(Throwable th2) {
        return this.f24498g.mo7500w(th2);
    }
}
