package p354xh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p116i.C1768l1;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p332wb.C5130n3;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import sh.AbstractC4066z;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xh.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5831p extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f23702h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f23703i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23704j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f23705k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1739c f23706l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1739c f23707m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1739c f23708n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f23709o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5831p(boolean z9, InterfaceC1809a1 interfaceC1809a1, C1739c c1739c, C1739c c1739c2, C1739c c1739c3, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f23704j = z9;
        this.f23705k = interfaceC1809a1;
        this.f23706l = c1739c;
        this.f23707m = c1739c2;
        this.f23708n = c1739c3;
        this.f23709o = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C5831p c5831p = new C5831p(this.f23704j, this.f23705k, this.f23706l, this.f23707m, this.f23708n, this.f23709o, interfaceC5557c);
        c5831p.f23703i = obj;
        return c5831p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5831p) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r10.m4362f(r14) != r13) goto L28;
     */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f23703i;
        int i9 = this.f23702h;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f23705k;
        C1739c c1739c = this.f23708n;
        C1739c c1739c2 = this.f23707m;
        InterfaceC5557c interfaceC5557c = null;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (this.f23704j) {
                interfaceC1809a1.setValue(Boolean.TRUE);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c2, interfaceC5557c, 2), 3);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(this.f23706l, interfaceC5557c, 3), 3);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c, interfaceC5557c, 4), 3);
                return c3967n;
            }
            if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c2, interfaceC5557c, 5), 3);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c, interfaceC5557c, 6), 3);
                Float f3 = new Float(0.0f);
                C1768l1 c1768l1 = AbstractC4066z.f13474c;
                this.f23703i = null;
                this.f23702h = 1;
                if (C1739c.m4359c(this.f23706l, f3, c1768l1, null, this, 12) != enumC5799a) {
                }
                return enumC5799a;
            }
            return c3967n;
        }
        if (i9 == 1) {
            AbstractC1089i.m2732I0(obj);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                interfaceC1809a1.setValue(Boolean.FALSE);
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f23709o.getValue();
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                return c3967n;
            }
            AbstractC1089i.m2732I0(obj);
            this.f23703i = null;
            this.f23702h = 3;
        }
        this.f23703i = null;
        this.f23702h = 2;
        if (c1739c2.m4362f(this) != enumC5799a) {
            this.f23703i = null;
            this.f23702h = 3;
        }
        return enumC5799a;
    }
}
