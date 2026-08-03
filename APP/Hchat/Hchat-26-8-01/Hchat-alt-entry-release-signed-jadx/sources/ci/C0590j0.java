package ci;

import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p144k.AbstractC2217v0;
import p144k.InterfaceC2226y0;
import p187n.C2857k;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: ci.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590j0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2226y0 f1841g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1842h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0590j0(InterfaceC2226y0 interfaceC2226y0, boolean z9) {
        this.f1841g = interfaceC2226y0;
        this.f1842h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C1836h0 c1836h0 = (C1836h0) obj2;
        ((Number) obj3).intValue();
        ((InterfaceC5853o) obj).getClass();
        c1836h0.m4525a0(-1908103287);
        Object objM4514P = c1836h0.m4514P();
        if (objM4514P == C1851l.f6155a) {
            objM4514P = new C2857k();
            c1836h0.m4545k0(objM4514P);
        }
        C2857k c2857k = (C2857k) objM4514P;
        InterfaceC5853o interfaceC5853oMo10549d = AbstractC2217v0.m5456a(C5850l.f23787a, c2857k, this.f1841g).mo10549d(new C0588i0(c2857k, null, this.f1842h));
        c1836h0.m4553p(false);
        return interfaceC5853oMo10549d;
    }
}
