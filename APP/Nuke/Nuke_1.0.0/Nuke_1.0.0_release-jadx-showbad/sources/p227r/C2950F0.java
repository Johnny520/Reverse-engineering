package p227r;

import p007B0.C0185S;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p034G.C0466k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;

/* JADX INFO: renamed from: r.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2950F0 extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public C2136g0 f9319f;

    /* JADX INFO: renamed from: g */
    public int f9320g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f9321h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2160t f9322i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC1184i f9323j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1601c f9324k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2989g0 f9325l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: W2.f */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2950F0(InterfaceC2160t interfaceC2160t, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, C2989g0 c2989g0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9322i = interfaceC2160t;
        this.f9323j = (AbstractC1184i) interfaceC1604f;
        this.f9324k = interfaceC1601c;
        this.f9325l = c2989g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2950F0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2950F0 c2950f0 = new C2950F0(this.f9322i, this.f9323j, this.f9324k, this.f9325l, interfaceC1046d);
        c2950f0.f9321h = obj;
        return c2950f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r13 == r7) goto L19;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C0185S c0185s;
        InterfaceC2115S interfaceC2115S;
        int i5 = this.f9320g;
        InterfaceC2160t interfaceC2160t = this.f9322i;
        C2989g0 c2989g0 = this.f9325l;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            c0185s = (C0185S) this.f9321h;
            C2942B0 c2942b0 = AbstractC2958J0.f9362a;
            C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(interfaceC2160t, null, new C2948E0(c2989g0, null, 0), 1);
            this.f9321h = c0185s;
            this.f9319f = c2136g0M3994p;
            this.f9320g = 1;
            Object objM5157a = AbstractC2958J0.m5157a(c0185s, (2 & 1) != 0, EnumC0201o.f703e, this);
            if (objM5157a != enumC1152a) {
                interfaceC2115S = c2136g0M3994p;
                obj = objM5157a;
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2115S = (InterfaceC2115S) this.f9321h;
            AbstractC1784a.m3205S(obj);
            C0209w c0209w = (C0209w) obj;
            if (c0209w == null) {
                AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S, new C2946D0(c2989g0, null, 0));
            } else {
                c0209w.m320a();
                AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S, new C2946D0(c2989g0, null, 1));
                this.f9324k.mo1h(new C2683b(c0209w.f713c));
            }
            return C0891q.f2780a;
        }
        interfaceC2115S = this.f9319f;
        c0185s = (C0185S) this.f9321h;
        AbstractC1784a.m3205S(obj);
        C0209w c0209w2 = (C0209w) obj;
        c0209w2.m320a();
        C2942B0 c2942b02 = AbstractC2958J0.f9362a;
        ?? r10 = this.f9323j;
        if (r10 != c2942b02) {
            AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S, new C0466k((InterfaceC1604f) r10, c2989g0, c0209w2, (InterfaceC1046d) null));
        }
        this.f9321h = interfaceC2115S;
        this.f9319f = null;
        this.f9320g = 2;
        obj = AbstractC2958J0.m5162f(c0185s, EnumC0201o.f703e, this);
    }
}
