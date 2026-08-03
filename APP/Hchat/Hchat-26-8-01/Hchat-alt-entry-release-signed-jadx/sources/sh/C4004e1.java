package sh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p116i.C1785r0;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4004e1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f13112h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f13113i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004e1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13112h = interfaceC1809a1;
        this.f13113i = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        C4004e1 c4004e1 = new C4004e1(this.f13112h, this.f13113i, (InterfaceC5557c) obj3);
        C3967n c3967n = C3967n.f12976a;
        c4004e1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        C1785r0 c1785r0 = AbstractC4008f1.f13123a;
        this.f13112h.setValue(Boolean.FALSE);
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f13113i.getValue();
        if (interfaceC1220a != null) {
            interfaceC1220a.invoke();
        }
        return C3967n.f12976a;
    }
}
