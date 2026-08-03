package tg;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4190h extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public int f13748h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC4187e f13749i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f13750j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC6044i f13751k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4190h(InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13751k = (AbstractC6044i) interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [fg.p, yf.i] */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C4190h c4190h = new C4190h(this.f13751k, (InterfaceC5557c) obj3);
        c4190h.f13749i = (InterfaceC4187e) obj;
        c4190h.f13750j = obj2;
        return c4190h.invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0.mo1602e(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [fg.p, yf.i] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4187e interfaceC4187e;
        int i9 = this.f13748h;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            interfaceC4187e = this.f13749i;
            Object obj2 = this.f13750j;
            this.f13749i = interfaceC4187e;
            this.f13748h = 1;
            obj = this.f13751k.invoke(obj2, this);
            if (obj != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC4187e = this.f13749i;
        AbstractC1089i.m2732I0(obj);
        this.f13749i = null;
        this.f13748h = 2;
    }
}
