package p227r;

import me.dartcv.nuke.BuildConfig;
import p000A.C0039U;
import p007B0.C0185S;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p027E4.C0330q;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;

/* JADX INFO: renamed from: r.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2954H0 extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public Object f9340f;

    /* JADX INFO: renamed from: g */
    public Object f9341g;

    /* JADX INFO: renamed from: h */
    public int f9342h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f9343i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC2160t f9344j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1604f f9345k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1601c f9346l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2989g0 f9347m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954H0(InterfaceC2160t interfaceC2160t, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, C2989g0 c2989g0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9344j = interfaceC2160t;
        this.f9345k = interfaceC1604f;
        this.f9346l = interfaceC1601c;
        this.f9347m = c2989g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2954H0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2954H0 c2954h0 = new C2954H0(this.f9344j, this.f9345k, this.f9346l, this.f9347m, interfaceC1046d);
        c2954h0.f9343i = obj;
        return c2954h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
    
        if (r1 != r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        EnumC1152a enumC1152a;
        C0185S c0185s;
        Object objM5157a;
        InterfaceC2115S interfaceC2115SM3994p;
        Object objM5162f;
        InterfaceC2115S interfaceC2115S;
        Object objM5162f2;
        InterfaceC2115S interfaceC2115S2;
        C0209w c0209w;
        int i5 = this.f9342h;
        int i6 = 3;
        int i7 = 2;
        int i8 = 6;
        C0209w c0209w2 = null;
        EnumC0201o enumC0201o = EnumC0201o.f703e;
        InterfaceC2160t interfaceC2160t = this.f9344j;
        C2970U c2970u = C2970U.f9400a;
        InterfaceC1604f interfaceC1604f = this.f9345k;
        InterfaceC1601c interfaceC1601c = this.f9346l;
        C0891q c0891q = C0891q.f2780a;
        int i9 = 1;
        C2989g0 c2989g0 = this.f9347m;
        InterfaceC1046d interfaceC1046d = null;
        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
        switch (i5) {
            case 0:
                enumC1152a = enumC1152a2;
                AbstractC1784a.m3205S(obj);
                c0185s = (C0185S) this.f9343i;
                this.f9343i = c0185s;
                this.f9342h = 1;
                objM5157a = AbstractC2958J0.m5157a(c0185s, (2 & 1) != 0, EnumC0201o.f703e, this);
                if (objM5157a != enumC1152a) {
                    C0209w c0209w3 = (C0209w) objM5157a;
                    c0209w3.m320a();
                    C2942B0 c2942b0 = AbstractC2958J0.f9362a;
                    interfaceC2115SM3994p = AbstractC2162v.m3994p(interfaceC2160t, null, new C2948E0(c2989g0, interfaceC1046d, i9), 1);
                    if (interfaceC1604f != AbstractC2958J0.f9362a) {
                        AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115SM3994p, new C2952G0(interfaceC1604f, c2989g0, c0209w3, interfaceC1046d, 0));
                    }
                    this.f9343i = c0185s;
                    this.f9340f = interfaceC2115SM3994p;
                    this.f9342h = 2;
                    objM5162f = AbstractC2958J0.m5162f(c0185s, enumC0201o, this);
                    break;
                }
                return enumC1152a;
            case BuildConfig.VERSION_CODE /* 1 */:
                enumC1152a = enumC1152a2;
                c0185s = (C0185S) this.f9343i;
                AbstractC1784a.m3205S(obj);
                objM5157a = obj;
                C0209w c0209w32 = (C0209w) objM5157a;
                c0209w32.m320a();
                C2942B0 c2942b02 = AbstractC2958J0.f9362a;
                interfaceC2115SM3994p = AbstractC2162v.m3994p(interfaceC2160t, null, new C2948E0(c2989g0, interfaceC1046d, i9), 1);
                if (interfaceC1604f != AbstractC2958J0.f9362a) {
                }
                this.f9343i = c0185s;
                this.f9340f = interfaceC2115SM3994p;
                this.f9342h = 2;
                objM5162f = AbstractC2958J0.m5162f(c0185s, enumC0201o, this);
                break;
            case 2:
                InterfaceC2115S interfaceC2115S3 = (InterfaceC2115S) this.f9340f;
                AbstractC1784a.m3205S(obj);
                interfaceC2115SM3994p = interfaceC2115S3;
                objM5162f = obj;
                c0209w2 = (C0209w) objM5162f;
                interfaceC2115S = interfaceC2115SM3994p;
                if (c0209w2 != null) {
                    AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S, new C2946D0(c2989g0, interfaceC1046d, i6));
                } else {
                    c0209w2.m320a();
                    AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S, new C2946D0(c2989g0, interfaceC1046d, 4));
                }
                if (c0209w2 != null) {
                    interfaceC1601c.mo1h(new C2683b(c0209w2.f713c));
                }
                return c0891q;
            case 3:
                interfaceC2115S = (InterfaceC2115S) this.f9341g;
                C0209w c0209w4 = (C0209w) this.f9340f;
                AbstractC1784a.m3205S(obj);
                AbstractC2971V abstractC2971V = (AbstractC2971V) obj;
                if (AbstractC1665j.m2981a(abstractC2971V, c2970u)) {
                    long j5 = c0209w4.f713c;
                    throw null;
                }
                if (!(abstractC2971V instanceof AbstractC2969T) && !(abstractC2971V instanceof AbstractC2968S)) {
                    throw new C0330q();
                }
                if (c0209w2 != null) {
                }
                if (c0209w2 != null) {
                }
                return c0891q;
            case 4:
                InterfaceC2115S interfaceC2115S4 = (InterfaceC2115S) this.f9343i;
                AbstractC1784a.m3205S(obj);
                AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S4, new C2946D0(c2989g0, interfaceC1046d, i7));
                return c0891q;
            case 5:
                InterfaceC2115S interfaceC2115S5 = (InterfaceC2115S) this.f9341g;
                C0209w c0209w5 = (C0209w) this.f9340f;
                C0185S c0185s2 = (C0185S) this.f9343i;
                AbstractC1784a.m3205S(obj);
                enumC1152a = enumC1152a2;
                C0209w c0209w6 = (C0209w) obj;
                if (c0209w6 == null) {
                    interfaceC1601c.mo1h(new C2683b(c0209w5.f713c));
                    return c0891q;
                }
                C2942B0 c2942b03 = AbstractC2958J0.f9362a;
                C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(interfaceC2115S5, c2989g0, interfaceC1046d, 22), 1);
                if (interfaceC1604f != AbstractC2958J0.f9362a) {
                    AbstractC2958J0.m5161e(interfaceC2160t, c2136g0M3994p, new C2952G0(interfaceC1604f, c2989g0, c0209w6, interfaceC1046d, 1));
                }
                this.f9343i = c2136g0M3994p;
                this.f9340f = c0209w5;
                this.f9341g = null;
                this.f9342h = 6;
                objM5162f2 = AbstractC2958J0.m5162f(c0185s2, enumC0201o, this);
                if (objM5162f2 != enumC1152a) {
                    interfaceC2115S2 = c2136g0M3994p;
                    c0209w = c0209w5;
                    c0209w2 = (C0209w) objM5162f2;
                    if (c0209w2 == null) {
                        AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S2, new C2946D0(c2989g0, interfaceC1046d, i8));
                        interfaceC1601c.mo1h(new C2683b(c0209w.f713c));
                        return c0891q;
                    }
                    c0209w2.m320a();
                    AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S2, new C2946D0(c2989g0, interfaceC1046d, 5));
                    throw null;
                }
                return enumC1152a;
            case 6:
                c0209w = (C0209w) this.f9340f;
                interfaceC2115S2 = (InterfaceC2115S) this.f9343i;
                AbstractC1784a.m3205S(obj);
                objM5162f2 = obj;
                c0209w2 = (C0209w) objM5162f2;
                if (c0209w2 == null) {
                }
                break;
            case 7:
                c0209w = (C0209w) this.f9341g;
                interfaceC2115S2 = (InterfaceC2115S) this.f9340f;
                AbstractC1784a.m3205S(obj);
                AbstractC2971V abstractC2971V2 = (AbstractC2971V) obj;
                if (AbstractC1665j.m2981a(abstractC2971V2, c2970u)) {
                    throw null;
                }
                if (!(abstractC2971V2 instanceof AbstractC2969T)) {
                    if (!(abstractC2971V2 instanceof AbstractC2968S)) {
                        throw new C0330q();
                    }
                    c0209w2 = null;
                }
                if (c0209w2 == null) {
                }
                break;
            case 8:
                InterfaceC2115S interfaceC2115S6 = (InterfaceC2115S) this.f9343i;
                AbstractC1784a.m3205S(obj);
                AbstractC2958J0.m5161e(interfaceC2160t, interfaceC2115S6, new C2946D0(c2989g0, interfaceC1046d, 7));
                return c0891q;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
