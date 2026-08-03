package ci;

import p027c0.C0364i;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p174m.InterfaceC2644q1;
import p187n.C2857k;
import p187n.C2858l;
import p187n.C2859m;
import p187n.C2860n;
import p187n.InterfaceC2856j;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0583g extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C3560e1 f1811h;

    /* JADX INFO: renamed from: i */
    public C2860n f1812i;

    /* JADX INFO: renamed from: j */
    public boolean f1813j;

    /* JADX INFO: renamed from: k */
    public int f1814k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f1815l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC2644q1 f1816m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f1817n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C2857k f1818o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0594l0 f1819p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583g(InterfaceC2644q1 interfaceC2644q1, long j3, C2857k c2857k, C0594l0 c0594l0, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1816m = interfaceC2644q1;
        this.f1817n = j3;
        this.f1818o = c2857k;
        this.f1819p = c0594l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C0583g c0583g = new C0583g(this.f1816m, this.f1817n, this.f1818o, this.f1819p, interfaceC5557c);
        c0583g.f1815l = obj;
        return c0583g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0583g) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0090 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: n.m */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        if (r15.m6281a(r5, r17) != r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r15.m6281a(r5, r17) == r10) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, n.n, qg.e1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qg.e1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, n.n, qg.e1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2859m c2859m;
        EnumC5799a enumC5799a;
        C3560e1 c3560e1M7563q;
        Object objMo1596T;
        boolean z9;
        C2860n c2860n;
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1815l;
        int i9 = this.f1814k;
        C0594l0 c0594l0 = this.f1819p;
        C2857k c2857k = this.f1818o;
        EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            c2859m = 0;
            enumC5799a = enumC5799a2;
            c3560e1M7563q = AbstractC3603v.m7563q(interfaceC3599t, null, new C0364i(c0594l0, this.f1817n, this.f1818o, (InterfaceC5557c) null, 1), 3);
            this.f1815l = null;
            this.f1811h = c3560e1M7563q;
            this.f1814k = 1;
            objMo1596T = this.f1816m.mo1596T(this);
            if (objMo1596T != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i9 == 1) {
            c3560e1M7563q = this.f1811h;
            AbstractC1089i.m2732I0(obj);
            c2859m = 0;
            enumC5799a = enumC5799a2;
            objMo1596T = obj;
        } else {
            if (i9 == 2) {
                z9 = this.f1813j;
                AbstractC1089i.m2732I0(obj);
                c2859m = 0;
                enumC5799a = enumC5799a2;
                if (z9) {
                    C2859m c2859m2 = new C2859m();
                    c2860n = new C2860n(c2859m2);
                    this.f1815l = c2859m;
                    this.f1811h = c2859m;
                    this.f1812i = c2860n;
                    this.f1813j = z9;
                    this.f1814k = 3;
                    c2859m = c2859m;
                    if (c2857k.m6281a(c2859m2, this) != enumC5799a) {
                        this.f1815l = c2859m;
                        this.f1811h = c2859m;
                        this.f1812i = c2859m;
                        this.f1813j = z9;
                        this.f1814k = 4;
                    }
                    return enumC5799a;
                }
                c0594l0.f1855B = c2859m;
                return C3967n.f12976a;
            }
            if (i9 != 3) {
                if (i9 != 4 && i9 != 5) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                c2859m = 0;
                c0594l0.f1855B = c2859m;
                return C3967n.f12976a;
            }
            z9 = this.f1813j;
            C2860n c2860n2 = this.f1812i;
            AbstractC1089i.m2732I0(obj);
            enumC5799a = enumC5799a2;
            c2860n = c2860n2;
            c2859m = 0;
            this.f1815l = c2859m;
            this.f1811h = c2859m;
            this.f1812i = c2859m;
            this.f1813j = z9;
            this.f1814k = 4;
        }
        boolean zBooleanValue = ((Boolean) objMo1596T).booleanValue();
        if (!c3560e1M7563q.mo7486b()) {
            C2859m c2859m3 = c0594l0.f1855B;
            if (c2859m3 != null) {
                InterfaceC2856j c2860n3 = zBooleanValue ? new C2860n(c2859m3) : new C2858l(c2859m3);
                this.f1815l = c2859m;
                this.f1811h = c2859m;
                this.f1812i = c2859m;
                this.f1813j = zBooleanValue;
                this.f1814k = 5;
            }
            c0594l0.f1855B = c2859m;
            return C3967n.f12976a;
        }
        this.f1815l = c2859m;
        this.f1811h = c2859m;
        this.f1813j = zBooleanValue;
        this.f1814k = 2;
        if (AbstractC3603v.m7550d(c3560e1M7563q, this) != enumC5799a) {
            z9 = zBooleanValue;
            c2859m = c2859m;
            if (z9) {
            }
            c0594l0.f1855B = c2859m;
            return C3967n.f12976a;
        }
        return enumC5799a;
    }
}
