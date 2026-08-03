package p174m;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p267s1.C3914t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.v2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2665v2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8708h;

    /* JADX INFO: renamed from: i */
    public int f8709i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1236q f8710j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2656t1 f8711k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3914t f8712l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2665v2(InterfaceC1236q interfaceC1236q, C2656t1 c2656t1, C3914t c3914t, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f8708h = i9;
        this.f8710j = interfaceC1236q;
        this.f8711k = c2656t1;
        this.f8712l = c3914t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8708h) {
            case 0:
                return new C2665v2(this.f8710j, this.f8711k, this.f8712l, interfaceC5557c, 0);
            default:
                return new C2665v2(this.f8710j, this.f8711k, this.f8712l, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f8708h) {
        }
        return ((C2665v2) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8708h) {
            case 0:
                int i9 = this.f8709i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C0807b c0807b = new C0807b(this.f8712l.f12836c);
                    this.f8709i = 1;
                    Object objMo734b = this.f8710j.mo734b(this.f8711k, c0807b, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objMo734b == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i10 = this.f8709i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C0807b c0807b2 = new C0807b(this.f8712l.f12836c);
                    this.f8709i = 1;
                    Object objMo734b2 = this.f8710j.mo734b(this.f8711k, c0807b2, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objMo734b2 == enumC5799a2) {
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
