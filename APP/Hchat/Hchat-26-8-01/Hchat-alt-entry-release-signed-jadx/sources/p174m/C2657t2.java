package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p267s1.C3904k0;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.t2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657t2 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public int f8672g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f8673h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3599t f8674i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2656t1 f8675j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f8676k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1231l f8677l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1236q f8678m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1231l f8679n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2657t2(InterfaceC3599t interfaceC3599t, C2656t1 c2656t1, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1236q interfaceC1236q, InterfaceC1231l interfaceC1231l3, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f8674i = interfaceC3599t;
        this.f8675j = c2656t1;
        this.f8676k = interfaceC1231l;
        this.f8677l = interfaceC1231l2;
        this.f8678m = interfaceC1236q;
        this.f8679n = interfaceC1231l3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2657t2 c2657t2 = new C2657t2(this.f8674i, this.f8675j, this.f8676k, this.f8677l, this.f8678m, this.f8679n, interfaceC5557c);
        c2657t2.f8673h = obj;
        return c2657t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2657t2) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f8672g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C3904k0 c3904k0 = (C3904k0) this.f8673h;
            this.f8672g = 1;
            Object objM6122g = AbstractC2677y2.m6122g(c3904k0, this.f8674i, this.f8675j, this.f8676k, this.f8677l, this.f8678m, this.f8679n, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM6122g == enumC5799a) {
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
