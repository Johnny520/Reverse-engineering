package p357y1;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: y1.w2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5949w2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f24175h;

    /* JADX INFO: renamed from: i */
    public int f24176i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5953x2 f24177j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5949w2(C5953x2 c5953x2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f24175h = i9;
        this.f24177j = c5953x2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f24175h) {
            case 0:
                return new C5949w2(this.f24177j, interfaceC5557c, 0);
            default:
                return new C5949w2(this.f24177j, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f24175h) {
        }
        return ((C5949w2) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f24175h) {
            case 0:
                int i9 = this.f24176i;
                C3967n c3967n = C3967n.f12976a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return c3967n;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24177j.f24185g;
                this.f24176i = 1;
                Object objM10692e = viewTreeObserverOnGlobalLayoutListenerC5934t.f24072F.m10692e(this);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM10692e != enumC5799a) {
                    objM10692e = c3967n;
                }
                return objM10692e == enumC5799a ? enumC5799a : c3967n;
            default:
                int i10 = this.f24176i;
                C3967n c3967n2 = C3967n.f12976a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return c3967n2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = this.f24177j.f24185g;
                this.f24176i = 1;
                Object objM154e = viewTreeObserverOnGlobalLayoutListenerC5934t2.f24074G.m154e(this);
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (objM154e != enumC5799a2) {
                    objM154e = c3967n2;
                }
                return objM154e == enumC5799a2 ? enumC5799a2 : c3967n2;
        }
    }
}
