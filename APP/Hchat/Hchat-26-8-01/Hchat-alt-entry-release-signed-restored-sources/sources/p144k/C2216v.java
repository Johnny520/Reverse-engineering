package p144k;

import p072f2.C1046i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p187n.C2857k;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: k.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2216v implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2226y0 f7341g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f7342h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1046i f7343i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f7344j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2216v(InterfaceC2226y0 interfaceC2226y0, boolean z9, C1046i c1046i, InterfaceC1220a interfaceC1220a) {
        this.f7341g = interfaceC2226y0;
        this.f7342h = z9;
        this.f7343i = c1046i;
        this.f7344j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C1836h0 c1836h0 = (C1836h0) obj2;
        ((Number) obj3).intValue();
        c1836h0.m4525a0(-1525724089);
        Object objM4514P = c1836h0.m4514P();
        if (objM4514P == C1851l.f6155a) {
            objM4514P = new C2857k();
            c1836h0.m4545k0(objM4514P);
        }
        C2857k c2857k = (C2857k) objM4514P;
        InterfaceC5853o interfaceC5853oMo10549d = AbstractC2217v0.m5456a(C5850l.f23787a, c2857k, this.f7341g).mo10549d(new C2213u(c2857k, null, false, this.f7342h, null, this.f7343i, this.f7344j));
        c1836h0.m4553p(false);
        return interfaceC5853oMo10549d;
    }
}
