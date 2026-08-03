package p174m;

import gg.C1424t;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p293u2.C4247q;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.l2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2625l2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C2637o2 f8540h;

    /* JADX INFO: renamed from: i */
    public C1424t f8541i;

    /* JADX INFO: renamed from: j */
    public long f8542j;

    /* JADX INFO: renamed from: k */
    public int f8543k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f8544l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2637o2 f8545m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1424t f8546n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f8547o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2625l2(C2637o2 c2637o2, C1424t c1424t, long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8545m = c2637o2;
        this.f8546n = c1424t;
        this.f8547o = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2625l2 c2625l2 = new C2625l2(this.f8545m, this.f8546n, this.f8547o, interfaceC5557c);
        c2625l2.f8544l = obj;
        return c2625l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2625l2) create((C2629m2) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2637o2 c2637o2;
        C1424t c1424t;
        long j3;
        C2637o2 c2637o22;
        int i9 = this.f8543k;
        EnumC2640p1 enumC2640p1 = EnumC2640p1.f8623h;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2629m2 c2629m2 = (C2629m2) this.f8544l;
            c2637o2 = this.f8545m;
            C2621k2 c2621k2 = new C2621k2(c2637o2, 0, c2629m2);
            C2638p c2638p = c2637o2.f8590c;
            C1424t c1424t2 = this.f8546n;
            long j4 = c1424t2.f4737g;
            EnumC2640p1 enumC2640p12 = c2637o2.f8591d;
            long j5 = this.f8547o;
            float fM6091d = c2637o2.m6091d(enumC2640p12 == enumC2640p1 ? C4247q.m8544b(j5) : C4247q.m8545c(j5));
            this.f8544l = c2637o2;
            this.f8540h = c2637o2;
            this.f8541i = c1424t2;
            this.f8542j = j4;
            this.f8543k = 1;
            c2638p.getClass();
            obj = AbstractC3603v.m7570x(c2638p.f8602b, new C2634o(fM6091d, c2638p, c2621k2, null), this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (obj == enumC5799a) {
                return enumC5799a;
            }
            c1424t = c1424t2;
            j3 = j4;
            c2637o22 = c2637o2;
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = this.f8542j;
            c1424t = this.f8541i;
            c2637o2 = this.f8540h;
            c2637o22 = (C2637o2) this.f8544l;
            AbstractC1089i.m2732I0(obj);
        }
        float fM6091d2 = c2637o22.m6091d(((Number) obj).floatValue());
        c1424t.f4737g = c2637o2.f8591d == enumC2640p1 ? C4247q.m8543a(fM6091d2, 0.0f, 2, j3) : C4247q.m8543a(0.0f, fM6091d2, 1, j3);
        return C3967n.f12976a;
    }
}
