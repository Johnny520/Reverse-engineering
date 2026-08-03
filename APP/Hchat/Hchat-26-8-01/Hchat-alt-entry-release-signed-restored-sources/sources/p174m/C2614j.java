package p174m;

import java.util.concurrent.CancellationException;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1502a1;
import p136j8.C2104o;
import p144k.EnumC2164d1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2614j extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f8491h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f8492i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2618k f8493j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2605g3 f8494k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2596f f8495l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f8496m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2614j(C2618k c2618k, C2605g3 c2605g3, InterfaceC2596f interfaceC2596f, long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8493j = c2618k;
        this.f8494k = c2605g3;
        this.f8495l = interfaceC2596f;
        this.f8496m = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2614j c2614j = new C2614j(this.f8493j, this.f8494k, this.f8495l, this.f8496m, interfaceC5557c);
        c2614j.f8492i = obj;
        return c2614j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2614j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        C2618k c2618k = this.f8493j;
        C2581c c2581c = c2618k.f8520y;
        int i9 = this.f8491h;
        try {
            try {
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3596r0 interfaceC3596r0M7557k = AbstractC3603v.m7557k(((InterfaceC3599t) this.f8492i).mo4457n());
                    c2618k.f8515B = true;
                    C2637o2 c2637o2 = c2618k.f8517v;
                    EnumC2164d1 enumC2164d1 = EnumC2164d1.f7173g;
                    C1502a1 c1502a1 = new C1502a1(this.f8494k, c2618k, this.f8495l, this.f8496m, interfaceC3596r0M7557k, null);
                    this.f8491h = 1;
                    Object objM6093f = c2637o2.m6093f(enumC2164d1, c1502a1, this);
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
                c2581c.m6052b();
                c2618k.f8515B = false;
                c2581c.m6051a(null);
                c2618k.f8521z = false;
                return C3967n.f12976a;
            } catch (CancellationException e6) {
                throw e6;
            }
        } catch (Throwable th2) {
            c2618k.f8515B = false;
            c2581c.m6051a(null);
            c2618k.f8521z = false;
            throw th2;
        }
    }
}
