package p117i0;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p249qg.C3564g;
import p266s0.AbstractC3872b;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1811b extends AbstractC3872b {

    /* JADX INFO: renamed from: a */
    public C3564g f6029a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1231l f6030b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p266s0.AbstractC3872b
    /* JADX INFO: renamed from: a */
    public final void mo4452a() {
        this.f6030b = null;
        this.f6029a = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p266s0.AbstractC3872b
    /* JADX INFO: renamed from: b */
    public final void mo4453b(Throwable th2) {
        C3564g c3564g = this.f6029a;
        if (c3564g != null) {
            c3564g.resumeWith(AbstractC1089i.m2785q(th2));
        }
    }
}
