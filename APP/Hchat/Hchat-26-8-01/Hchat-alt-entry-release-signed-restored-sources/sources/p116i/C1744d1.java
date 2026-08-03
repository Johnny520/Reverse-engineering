package p116i;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;

/* JADX INFO: renamed from: i.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1744d1 {

    /* JADX INFO: renamed from: a */
    public final C1771m1 f5827a;

    /* JADX INFO: renamed from: b */
    public final C1845j1 f5828b = AbstractC1874r.m4639u(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1765k1 f5829c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1744d1(C1765k1 c1765k1, C1771m1 c1771m1, String str) {
        this.f5829c = c1765k1;
        this.f5827a = c1771m1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: fg.l */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C1741c1 m4383a(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        C1845j1 c1845j1 = this.f5828b;
        C1741c1 c1741c1 = (C1741c1) c1845j1.getValue();
        C1765k1 c1765k1 = this.f5829c;
        if (c1741c1 == null) {
            Object objInvoke = interfaceC1231l2.invoke(c1765k1.m4414c());
            Object objInvoke2 = interfaceC1231l2.invoke(c1765k1.m4414c());
            C1771m1 c1771m1 = this.f5827a;
            AbstractC1781q abstractC1781q = (AbstractC1781q) c1771m1.f5912a.invoke(objInvoke2);
            abstractC1781q.mo4426d();
            C1753g1 c1753g1 = new C1753g1(c1765k1, objInvoke, abstractC1781q, c1771m1);
            c1741c1 = new C1741c1(this, c1753g1, interfaceC1231l, interfaceC1231l2);
            c1845j1.setValue(c1741c1);
            c1765k1.f5897i.add(c1753g1);
        }
        c1741c1.f5799i = (AbstractC1417m) interfaceC1231l2;
        c1741c1.f5798h = interfaceC1231l;
        c1741c1.m4364a(c1765k1.m4417f());
        return c1741c1;
    }
}
