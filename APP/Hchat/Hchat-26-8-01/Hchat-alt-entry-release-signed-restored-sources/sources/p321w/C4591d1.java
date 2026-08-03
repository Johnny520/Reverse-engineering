package p321w;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p187n.C2859m;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4591d1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f15132h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f15133i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4591d1(InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c, boolean z9) {
        super(2, interfaceC5557c);
        this.f15132h = interfaceC1809a1;
        this.f15133i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4591d1(this.f15132h, interfaceC5557c, this.f15133i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C4591d1 c4591d1 = (C4591d1) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
        C3967n c3967n = C3967n.f12976a;
        c4591d1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        InterfaceC1809a1 interfaceC1809a1 = this.f15132h;
        if (((C2859m) interfaceC1809a1.getValue()) != null) {
            interfaceC1809a1.setValue(null);
        }
        return C3967n.f12976a;
    }
}
