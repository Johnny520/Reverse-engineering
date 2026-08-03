package p340x2;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p253r1.C3647d;
import p276sf.C3967n;
import p293u2.C4247q;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: x2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5670e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f23069h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f23070i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC5673h f23071j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f23072k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5670e(boolean z9, AbstractC5673h abstractC5673h, long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f23070i = z9;
        this.f23071j = abstractC5673h;
        this.f23072k = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5670e(this.f23070i, this.f23071j, this.f23072k, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5670e) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f23069h;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C3647d c3647d = this.f23071j.f23085g;
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (this.f23070i) {
                this.f23069h = 2;
                Object objM7626a = c3647d.m7626a(this.f23072k, 0L, this);
                if (objM7626a != enumC5799a) {
                    obj = objM7626a;
                    ((C4247q) obj).getClass();
                }
            } else {
                this.f23069h = 1;
                Object objM7626a2 = c3647d.m7626a(0L, this.f23072k, this);
                if (objM7626a2 != enumC5799a) {
                    obj = objM7626a2;
                    ((C4247q) obj).getClass();
                }
            }
            return enumC5799a;
        }
        if (i9 == 1) {
            AbstractC1089i.m2732I0(obj);
            ((C4247q) obj).getClass();
        } else {
            if (i9 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
            ((C4247q) obj).getClass();
        }
        return C3967n.f12976a;
    }
}
