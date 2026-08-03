package p100h0;

import ci.C0579e;
import p027c0.C0364i;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p119i2.C1939m0;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p276sf.C3958e;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1555v0 extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public int f5187h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1511d1 f5188i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555v0(C1511d1 c1511d1, InterfaceC5557c interfaceC5557c) {
        super(1, interfaceC5557c);
        this.f5188i = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        return new C1555v0(this.f5188i, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        return ((C1555v0) create((InterfaceC5557c) obj)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r14 == r5) goto L28;
     */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7570x;
        int i9 = this.f5187h;
        C3967n c3967n = C3967n.f12976a;
        C1511d1 c1511d1 = this.f5188i;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            this.f5187h = 1;
            if (c1511d1.m4033s(this) != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
            c1511d1.f5028A = true;
            return c3967n;
        }
        AbstractC1089i.m2732I0(obj);
        C3958e c3958eM4015a = C1511d1.m4015a(c1511d1);
        if (c3958eM4015a != null) {
            String str = (String) c3958eM4015a.f12961g;
            long j3 = ((C1939m0) c3958eM4015a.f12962h).f6575a;
            C1542p c1542p = c1511d1.f5037i;
            if (c1542p != null) {
                this.f5187h = 2;
                if (str.length() == 0 || C1939m0.m4813c(j3)) {
                    objM7570x = c3967n;
                } else {
                    objM7570x = AbstractC3603v.m7570x(c1542p.f5142a, new C0579e(c1542p, new C0364i(c1542p, str, j3, (InterfaceC5557c) null, 2), (InterfaceC5557c) null), this);
                }
                if (objM7570x != enumC5799a) {
                    objM7570x = c3967n;
                }
            }
        }
        c1511d1.f5028A = true;
        return c3967n;
    }
}
