package p099h;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p116i.C1739c;
import p116i.C1757i;
import p116i.C1785r0;
import p116i.EnumC1754h;
import p136j8.C2104o;
import p174m.C2655t0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p293u2.C4242l;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1445b1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4789h = 0;

    /* JADX INFO: renamed from: i */
    public int f4790i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f4791j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f4792k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC5852n f4793l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445b1(C1442a1 c1442a1, long j3, C1451d1 c1451d1, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f4792k = c1442a1;
        this.f4791j = j3;
        this.f4793l = c1451d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f4789h) {
            case 0:
                return new C1445b1((C1442a1) this.f4792k, this.f4791j, (C1451d1) this.f4793l, interfaceC5557c);
            default:
                C1445b1 c1445b1 = new C1445b1((C2655t0) this.f4793l, this.f4791j, interfaceC5557c);
                c1445b1.f4792k = obj;
                return c1445b1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f4789h) {
        }
        return ((C1445b1) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4789h) {
            case 0:
                C1451d1 c1451d1 = (C1451d1) this.f4793l;
                C1442a1 c1442a1 = (C1442a1) this.f4792k;
                int i9 = this.f4790i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c = c1442a1.f4786a;
                    C4242l c4242l = new C4242l(this.f4791j);
                    C1785r0 c1785r0 = c1451d1.f4818v;
                    this.f4790i = 1;
                    obj = C1739c.m4359c(c1739c, c4242l, c1785r0, null, this, 12);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (obj == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                EnumC1754h enumC1754h = ((C1757i) obj).f5869b;
                break;
            default:
                int i10 = this.f4790i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f4792k;
                    InterfaceC1236q interfaceC1236q = ((C2655t0) this.f4793l).f8666R;
                    C0807b c0807b = new C0807b(this.f4791j);
                    this.f4790i = 1;
                    Object objMo734b = interfaceC1236q.mo734b(interfaceC3599t, c0807b, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objMo734b == enumC5799a2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445b1(C2655t0 c2655t0, long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f4793l = c2655t0;
        this.f4791j = j3;
    }
}
