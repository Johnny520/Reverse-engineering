package p251r;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p174m.C2621k2;
import p174m.InterfaceC2660u1;
import p265s.AbstractC3854r0;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: r.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3636u extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f11782h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f11783i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3641z f11784j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f11785k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636u(C3641z c3641z, int i9, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f11784j = c3641z;
        this.f11785k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C3636u c3636u = new C3636u(this.f11784j, this.f11785k, interfaceC5557c);
        c3636u.f11783i = obj;
        return c3636u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C3636u) create((InterfaceC2660u1) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f11782h;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            InterfaceC2660u1 interfaceC2660u1 = (InterfaceC2660u1) this.f11783i;
            C3641z c3641z = this.f11784j;
            C2621k2 c2621k2 = new C2621k2(interfaceC2660u1, 1, c3641z);
            InterfaceC4233c interfaceC4233c = ((C3631p) c3641z.f11802f.getValue()).f11744i;
            this.f11782h = 1;
            Object objM8025a = AbstractC3854r0.m8025a(c2621k2, this.f11785k, 100, interfaceC4233c, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM8025a == enumC5799a) {
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
    }
}
