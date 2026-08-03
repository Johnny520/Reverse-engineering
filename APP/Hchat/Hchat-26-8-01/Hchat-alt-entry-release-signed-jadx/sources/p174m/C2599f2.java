package p174m;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p144k.EnumC2164d1;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2599f2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8418h;

    /* JADX INFO: renamed from: i */
    public int f8419i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2609h2 f8420j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ long f8421k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2599f2(C2609h2 c2609h2, long j3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f8418h = i9;
        this.f8420j = c2609h2;
        this.f8421k = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8418h) {
            case 0:
                return new C2599f2(this.f8420j, this.f8421k, interfaceC5557c, 0);
            case 1:
                return new C2599f2(this.f8420j, this.f8421k, interfaceC5557c, 1);
            case 2:
                return new C2599f2(this.f8420j, this.f8421k, interfaceC5557c, 2);
            default:
                C2599f2 c2599f2 = new C2599f2(this.f8420j, interfaceC5557c);
                c2599f2.f8421k = ((C0807b) obj).f2414a;
                return c2599f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8418h) {
            case 0:
                return ((C2599f2) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C2599f2) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 2:
                return ((C2599f2) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                long j3 = ((C0807b) obj).f2414a;
                C2599f2 c2599f2 = new C2599f2(this.f8420j, (InterfaceC5557c) obj2);
                c2599f2.f8421k = j3;
                return c2599f2.invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8418h) {
            case 0:
                int i9 = this.f8419i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2637o2 c2637o2 = this.f8420j.f8459T;
                    C2594e2 c2594e2 = new C2594e2(this.f8421k, null);
                    this.f8419i = 1;
                    Object objM6093f = c2637o2.m6093f(EnumC2164d1.f7174h, c2594e2, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6093f == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i9 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 1:
                int i10 = this.f8419i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2637o2 c2637o22 = this.f8420j.f8459T;
                    long j3 = this.f8421k;
                    this.f8419i = 1;
                    Object objM6089b = c2637o22.m6089b(j3, false, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM6089b == enumC5799a2) {
                        return enumC5799a2;
                    }
                } else {
                    if (i10 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 2:
                int i11 = this.f8419i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2637o2 c2637o23 = this.f8420j.f8459T;
                    long j4 = this.f8421k;
                    this.f8419i = 1;
                    Object objM6089b2 = c2637o23.m6089b(j4, true, this);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM6089b2 == enumC5799a3) {
                        return enumC5799a3;
                    }
                } else {
                    if (i11 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            default:
                int i12 = this.f8419i;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return obj;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                long j5 = this.f8421k;
                C2637o2 c2637o24 = this.f8420j.f8459T;
                this.f8419i = 1;
                Object objM6040a = AbstractC2574a2.m6040a(c2637o24, j5, this);
                EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                return objM6040a == enumC5799a4 ? enumC5799a4 : objM6040a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2599f2(C2609h2 c2609h2, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8418h = 3;
        this.f8420j = c2609h2;
    }
}
