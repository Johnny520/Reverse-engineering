package sh;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1236q;
import p117i0.C1829f1;
import p117i0.InterfaceC1809a1;
import p187n.C2848b;
import p187n.C2857k;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4035o1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2857k f13299h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f13300i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f13301j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f13302k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1829f1 f13303l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4035o1(C2857k c2857k, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, C1829f1 c1829f1, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13299h = c2857k;
        this.f13300i = interfaceC1809a1;
        this.f13301j = interfaceC1809a12;
        this.f13302k = interfaceC1809a13;
        this.f13303l = c1829f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0807b) obj2).f2414a;
        InterfaceC1809a1 interfaceC1809a1 = this.f13302k;
        C1829f1 c1829f1 = this.f13303l;
        C4035o1 c4035o1 = new C4035o1(this.f13299h, this.f13300i, this.f13301j, interfaceC1809a1, c1829f1, (InterfaceC5557c) obj3);
        C3967n c3967n = C3967n.f12976a;
        c4035o1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        C2848b c2848b = new C2848b();
        this.f13299h.m6282b(c2848b);
        this.f13300i.setValue(c2848b);
        this.f13301j.setValue(Boolean.TRUE);
        this.f13302k.setValue(Boolean.FALSE);
        this.f13303l.m4489h(0.0f);
        return C3967n.f12976a;
    }
}
