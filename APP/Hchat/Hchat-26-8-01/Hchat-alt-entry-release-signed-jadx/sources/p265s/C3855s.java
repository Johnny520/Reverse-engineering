package p265s;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p293u2.C4240j;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: s.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3855s extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12623h;

    /* JADX INFO: renamed from: i */
    public int f12624i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3857t f12625j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3855s(C3857t c3857t, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f12623h = i9;
        this.f12625j = c3857t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f12623h) {
            case 0:
                return new C3855s(this.f12625j, interfaceC5557c, 0);
            case 1:
                return new C3855s(this.f12625j, interfaceC5557c, 1);
            case 2:
                return new C3855s(this.f12625j, interfaceC5557c, 2);
            case 3:
                return new C3855s(this.f12625j, interfaceC5557c, 3);
            default:
                return new C3855s(this.f12625j, interfaceC5557c, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f12623h) {
        }
        return ((C3855s) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f12623h;
        C3967n c3967n = C3967n.f12976a;
        C3857t c3857t = this.f12625j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        switch (i9) {
            case 0:
                int i10 = this.f12624i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c = c3857t.f12645n;
                    Float f3 = new Float(1.0f);
                    this.f12624i = 1;
                    if (c1739c.m4361e(f3, this) == enumC5799a) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 1:
                int i11 = this.f12624i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c2 = c3857t.f12644m;
                    C4240j c4240j = new C4240j(0L);
                    this.f12624i = 1;
                    if (c1739c2.m4361e(c4240j, this) == enumC5799a) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                int i12 = C3857t.f12631r;
                c3857t.m8032e(0L);
                c3857t.m8031d(false);
                break;
            case 2:
                int i13 = this.f12624i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c3 = c3857t.f12644m;
                    this.f12624i = 1;
                    if (c1739c3.m4362f(this) == enumC5799a) {
                    }
                } else if (i13 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 3:
                int i14 = this.f12624i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c4 = c3857t.f12645n;
                    this.f12624i = 1;
                    if (c1739c4.m4362f(this) == enumC5799a) {
                    }
                } else if (i14 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i15 = this.f12624i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c5 = c3857t.f12645n;
                    this.f12624i = 1;
                    if (c1739c5.m4362f(this) == enumC5799a) {
                    }
                } else if (i15 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return enumC5799a;
    }
}
