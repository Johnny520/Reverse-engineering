package ci;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p174m.InterfaceC2644q1;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0581f extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public int f1804h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2644q1 f1805i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f1806j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0594l0 f1807k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581f(C0594l0 c0594l0, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f1807k = c0594l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0807b) obj2).f2414a;
        C0581f c0581f = new C0581f(this.f1807k, (InterfaceC5557c) obj3);
        c0581f.f1805i = (InterfaceC2644q1) obj;
        c0581f.f1806j = j3;
        return c0581f.invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object objM7551e;
        InterfaceC2644q1 interfaceC2644q1 = this.f1805i;
        long j3 = this.f1806j;
        int i9 = this.f1804h;
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
        C0594l0 c0594l0 = this.f1807k;
        if (c0594l0.f1861y) {
            this.f1805i = null;
            this.f1806j = j3;
            this.f1804h = 1;
            C2857k c2857k = c0594l0.f1859w;
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (c2857k == null || (objM7551e = AbstractC3603v.m7551e(new C0583g(interfaceC2644q1, j3, c2857k, c0594l0, null), this)) != enumC5799a) {
                objM7551e = c3967n;
            }
            if (objM7551e == enumC5799a) {
                return enumC5799a;
            }
        }
        return c3967n;
    }
}
