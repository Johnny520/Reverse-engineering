package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.s2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2653s2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8659h;

    /* JADX INFO: renamed from: i */
    public int f8660i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2656t1 f8661j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2653s2(C2656t1 c2656t1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f8659h = i9;
        this.f8661j = c2656t1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8659h) {
            case 0:
                return new C2653s2(this.f8661j, interfaceC5557c, 0);
            default:
                return new C2653s2(this.f8661j, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f8659h) {
        }
        return ((C2653s2) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8659h) {
            case 0:
                int i9 = this.f8660i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f8660i = 1;
                    Object objM6115j = this.f8661j.m6115j(this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6115j == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i10 = this.f8660i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f8660i = 1;
                    Object objM6115j2 = this.f8661j.m6115j(this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM6115j2 == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
