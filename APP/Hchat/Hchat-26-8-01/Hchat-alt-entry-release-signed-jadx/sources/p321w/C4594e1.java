package p321w;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1236q;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p174m.C2594e2;
import p174m.InterfaceC2644q1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4594e1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public int f15140h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2644q1 f15141i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f15142j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3599t f15143k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f15144l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4594e1(InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f15143k = interfaceC3599t;
        this.f15144l = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0807b) obj2).f2414a;
        C4594e1 c4594e1 = new C4594e1(this.f15143k, this.f15144l, (InterfaceC5557c) obj3);
        c4594e1.f15141i = (InterfaceC2644q1) obj;
        c4594e1.f15142j = j3;
        return c4594e1.invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f15140h;
        InterfaceC1809a1 interfaceC1809a1 = this.f15144l;
        InterfaceC3599t interfaceC3599t = this.f15143k;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            InterfaceC2644q1 interfaceC2644q1 = this.f15141i;
            AbstractC3603v.m7563q(interfaceC3599t, null, new C2594e2(interfaceC1809a1, this.f15142j, null), 3);
            this.f15140h = 1;
            obj = interfaceC2644q1.mo1596T(this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (obj == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        AbstractC3603v.m7563q(interfaceC3599t, null, new C4591d1(interfaceC1809a1, null, ((Boolean) obj).booleanValue()), 3);
        return C3967n.f12976a;
    }
}
