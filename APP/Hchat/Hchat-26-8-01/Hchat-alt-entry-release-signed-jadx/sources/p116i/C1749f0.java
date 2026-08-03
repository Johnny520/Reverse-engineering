package p116i;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1749f0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ float f5841h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C1749f0 c1749f0 = new C1749f0(2, interfaceC5557c);
        c1749f0.f5841h = ((Number) obj).floatValue();
        return c1749f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1749f0) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        return Boolean.valueOf(this.f5841h > 0.0f);
    }
}
