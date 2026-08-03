package p116i;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: i.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1741c1 implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: g */
    public final C1753g1 f5797g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1231l f5798h;

    /* JADX INFO: renamed from: i */
    public AbstractC1417m f5799i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1744d1 f5800j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: fg.l */
    /* JADX WARN: Multi-variable type inference failed */
    public C1741c1(C1744d1 c1744d1, C1753g1 c1753g1, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        this.f5800j = c1744d1;
        this.f5797g = c1753g1;
        this.f5798h = interfaceC1231l;
        this.f5799i = (AbstractC1417m) interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [fg.l, gg.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [fg.l, gg.m] */
    /* JADX INFO: renamed from: a */
    public final void m4364a(InterfaceC1747e1 interfaceC1747e1) {
        Object objInvoke = this.f5799i.invoke(interfaceC1747e1.mo4003c());
        boolean zM4418g = this.f5800j.f5829c.m4418g();
        C1753g1 c1753g1 = this.f5797g;
        if (zM4418g) {
            c1753g1.m4406f(this.f5799i.invoke(interfaceC1747e1.mo4002b()), objInvoke, (InterfaceC1803y) this.f5798h.invoke(interfaceC1747e1));
        } else {
            c1753g1.m4407g(objInvoke, (InterfaceC1803y) this.f5798h.invoke(interfaceC1747e1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        m4364a(this.f5800j.f5829c.m4417f());
        return this.f5797g.f5855n.getValue();
    }
}
