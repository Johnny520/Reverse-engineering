package p251r;

import android.view.Choreographer;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p174m.InterfaceC2660u1;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: r.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3638w extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11787h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3638w(int i9, InterfaceC5557c interfaceC5557c, int i10) {
        super(i9, interfaceC5557c);
        this.f11787h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f11787h) {
            case 0:
                return new C3638w(2, interfaceC5557c, 0);
            default:
                return new C3638w(2, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11787h) {
            case 0:
                C3638w c3638w = (C3638w) create((InterfaceC2660u1) obj, (InterfaceC5557c) obj2);
                C3967n c3967n = C3967n.f12976a;
                c3638w.invokeSuspend(c3967n);
                return c3967n;
            default:
                return ((C3638w) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11787h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            default:
                AbstractC1089i.m2732I0(obj);
                return Choreographer.getInstance();
        }
    }
}
