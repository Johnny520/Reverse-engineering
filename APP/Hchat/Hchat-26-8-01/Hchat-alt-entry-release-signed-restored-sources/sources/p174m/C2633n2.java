package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p253r1.C3647d;
import p276sf.C3967n;
import p293u2.C4247q;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.n2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2633n2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public long f8567h;

    /* JADX INFO: renamed from: i */
    public int f8568i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f8569j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2637o2 f8570k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2633n2(C2637o2 c2637o2, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8570k = c2637o2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2633n2 c2633n2 = new C2633n2(this.f8570k, interfaceC5557c);
        c2633n2.f8569j = ((C4247q) obj).f13927a;
        return c2633n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        long j3 = ((C4247q) obj).f13927a;
        C2633n2 c2633n2 = new C2633n2(this.f8570k, (InterfaceC5557c) obj2);
        c2633n2.f8569j = j3;
        return c2633n2.invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j3;
        long j4;
        long j5;
        long j10;
        int i9 = this.f8568i;
        C2637o2 c2637o2 = this.f8570k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            j3 = this.f8569j;
            C3647d c3647d = c2637o2.f8593f;
            this.f8569j = j3;
            this.f8568i = 1;
            obj = c3647d.m7628c(j3, this);
            if (obj != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j10 = this.f8567h;
                j5 = this.f8569j;
                AbstractC1089i.m2732I0(obj);
                return new C4247q(C4247q.m8546d(j5, C4247q.m8546d(j10, ((C4247q) obj).f13927a)));
            }
            j4 = this.f8567h;
            j3 = this.f8569j;
            AbstractC1089i.m2732I0(obj);
            long j11 = ((C4247q) obj).f13927a;
            C3647d c3647d2 = c2637o2.f8593f;
            long jM8546d = C4247q.m8546d(j4, j11);
            this.f8569j = j3;
            this.f8567h = j11;
            this.f8568i = 3;
            obj = c3647d2.m7626a(jM8546d, j11, this);
            if (obj != enumC5799a) {
                j5 = j3;
                j10 = j11;
                return new C4247q(C4247q.m8546d(j5, C4247q.m8546d(j10, ((C4247q) obj).f13927a)));
            }
            return enumC5799a;
        }
        j3 = this.f8569j;
        AbstractC1089i.m2732I0(obj);
        long jM8546d2 = C4247q.m8546d(j3, ((C4247q) obj).f13927a);
        this.f8569j = j3;
        this.f8567h = jM8546d2;
        this.f8568i = 2;
        obj = c2637o2.m6088a(jM8546d2, this);
        if (obj != enumC5799a) {
            j4 = jM8546d2;
            long j112 = ((C4247q) obj).f13927a;
            C3647d c3647d22 = c2637o2.f8593f;
            long jM8546d3 = C4247q.m8546d(j4, j112);
            this.f8569j = j3;
            this.f8567h = j112;
            this.f8568i = 3;
            obj = c3647d22.m7626a(jM8546d3, j112, this);
            if (obj != enumC5799a) {
            }
        }
        return enumC5799a;
    }
}
