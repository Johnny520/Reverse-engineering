package ci;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0585h extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1823h;

    /* JADX INFO: renamed from: i */
    public int f1824i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1825j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3596r0 f1826k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC6044i f1827l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0585h(InterfaceC3596r0 interfaceC3596r0, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1823h = i9;
        switch (i9) {
            case 1:
                this.f1826k = interfaceC3596r0;
                this.f1827l = (AbstractC6044i) interfaceC1235p;
                super(2, interfaceC5557c);
                break;
            default:
                this.f1826k = interfaceC3596r0;
                this.f1827l = (AbstractC6044i) interfaceC1235p;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [fg.p, yf.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fg.p, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1823h) {
            case 0:
                C0585h c0585h = new C0585h(this.f1826k, this.f1827l, interfaceC5557c, 0);
                c0585h.f1825j = obj;
                return c0585h;
            default:
                C0585h c0585h2 = new C0585h(this.f1826k, this.f1827l, interfaceC5557c, 1);
                c0585h2.f1825j = obj;
                return c0585h2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1823h) {
        }
        return ((C0585h) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [fg.p, yf.i] */
    /* JADX WARN: Type inference failed for: r6v4, types: [fg.p, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3599t interfaceC3599t;
        switch (this.f1823h) {
            case 0:
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f1825j;
                int i9 = this.f1824i;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1089i.m2732I0(obj);
                    } else if (i9 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f1825j = interfaceC3599t2;
                    this.f1824i = 1;
                    if (this.f1826k.mo7488g(this) == enumC5799a) {
                    }
                }
                this.f1825j = null;
                this.f1824i = 2;
                if (this.f1827l.invoke(interfaceC3599t2, this) == enumC5799a) {
                }
                break;
            default:
                int i10 = this.f1824i;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC3599t = (InterfaceC3599t) this.f1825j;
                        AbstractC1089i.m2732I0(obj);
                    } else if (i10 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    interfaceC3599t = (InterfaceC3599t) this.f1825j;
                    this.f1825j = interfaceC3599t;
                    this.f1824i = 1;
                    if (this.f1826k.mo7488g(this) == enumC5799a2) {
                    }
                }
                this.f1825j = null;
                this.f1824i = 2;
                if (this.f1827l.invoke(interfaceC3599t, this) == enumC5799a2) {
                }
                break;
        }
        return C3967n.f12976a;
    }
}
