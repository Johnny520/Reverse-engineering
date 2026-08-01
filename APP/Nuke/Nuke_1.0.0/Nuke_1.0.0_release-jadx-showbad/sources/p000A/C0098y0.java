package p000A;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.AbstractC1923e;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0186T;
import p007B0.C0212z;
import p041H0.C0564I;
import p051J.C0817i;
import p051J.C0818j;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.C1286x;
import p095T.AbstractC1385s;
import p095T.C1360f0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p127Z2.AbstractC1784a;
import p154e2.C2023b;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p172h3.C2243c;
import p178i3.C2338s;
import p203n.AbstractC2649d;
import p203n.C2626I;
import p203n.C2654f0;
import p203n.C2661j;
import p216p.C2811D;
import p216p.C2822O;
import p216p.C2836b0;
import p216p.C2868y;
import p216p.InterfaceC2832Z;
import p227r.C2981c0;
import p227r.InterfaceC2991h0;
import p255w.C3385p;
import p260x.C3436s;

/* JADX INFO: renamed from: A.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098y0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f456h;

    /* JADX INFO: renamed from: i */
    public int f457i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f458j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098y0(int i5, InterfaceC1046d interfaceC1046d) {
        super(i5, interfaceC1046d);
        this.f456h = 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        switch (this.f456h) {
            case 0:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 3:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 4:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 5:
                ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 6:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 7:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 8:
                C0098y0 c0098y0 = (C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2991h0) obj);
                C0891q c0891q = C0891q.f2780a;
                c0098y0.mo8p(c0891q);
                return c0891q;
            default:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v6, types: [Q2.i, W2.c] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f456h) {
            case 0:
                return new C0098y0((C0818j) this.f458j, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0098y0((C0186T) this.f458j, interfaceC1046d, 1);
            case 2:
                return new C0098y0((InterfaceC1601c) this.f458j, interfaceC1046d);
            case 3:
                return new C0098y0((C2868y) this.f458j, interfaceC1046d, 3);
            case 4:
                return new C0098y0((C2811D) this.f458j, interfaceC1046d, 4);
            case 5:
                return new C0098y0((C2822O) this.f458j, interfaceC1046d, 5);
            case 6:
                C0098y0 c0098y0 = new C0098y0(2, interfaceC1046d);
                c0098y0.f458j = obj;
                return c0098y0;
            case 7:
                return new C0098y0((C2981c0) this.f458j, interfaceC1046d, 7);
            case 8:
                return new C0098y0((C3385p) this.f458j, this.f457i, interfaceC1046d);
            default:
                return new C0098y0((C2023b) this.f458j, interfaceC1046d, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        if (p095T.AbstractC1385s.m2626p(r1).m1209a(new p095T.C1342V(r9, 0), r8) == r4) goto L67;
     */
    /* JADX WARN: Path cross not found for [B:60:0x0124, B:63:0x012d], limit reached: 134 */
    /* JADX WARN: Path cross not found for [B:63:0x012d, B:60:0x0124], limit reached: 134 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Type inference failed for: r9v11, types: [Q2.i, W2.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x012f -> B:58:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014d -> B:68:0x0150). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        C2243c c2243c;
        InterfaceC2160t interfaceC2160t;
        switch (this.f456h) {
            case 0:
                int i5 = this.f457i;
                C0891q c0891q = C0891q.f2780a;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                C0818j c0818j = (C0818j) this.f458j;
                this.f457i = 1;
                c0818j.getClass();
                Object objM3982d = AbstractC2162v.m3982d(new C0817i(c0818j, null), this);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM3982d != enumC1152a) {
                    objM3982d = c0891q;
                }
                return objM3982d == enumC1152a ? enumC1152a : c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0186T c0186t = (C0186T) this.f458j;
                int i6 = this.f457i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    PointerInputEventHandler pointerInputEventHandler = c0186t.f651u;
                    this.f457i = 2;
                    Object objInvoke = pointerInputEventHandler.invoke(c0186t, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objInvoke == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case 2:
                int i7 = this.f457i;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    ?? r9 = (AbstractC1184i) this.f458j;
                    this.f457i = 1;
                    Object objMo1h = r9.mo1h(this);
                    EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                    if (objMo1h == enumC1152a3) {
                        return enumC1152a3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case 3:
                int i8 = this.f457i;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return C0891q.f2780a;
                }
                AbstractC1784a.m3205S(obj);
                C1673r c1673r = new C1673r();
                C1673r c1673r2 = new C1673r();
                C1673r c1673r3 = new C1673r();
                C2868y c2868y = (C2868y) this.f458j;
                C2338s c2338s = c2868y.f9056r.f9914a;
                C0022L c0022l = new C0022L(c1673r, c1673r2, c1673r3, c2868y, 2);
                this.f457i = 1;
                c2338s.getClass();
                C2338s.m4151j(c2338s, c0022l, this);
                return EnumC1152a.f3788d;
            case 4:
                int i9 = this.f457i;
                if (i9 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2811D c2811d = (C2811D) this.f458j;
                    this.f457i = 1;
                    Object objM3472j = AbstractC1923e.m3472j(c2811d, null, this);
                    EnumC1152a enumC1152a4 = EnumC1152a.f3788d;
                    if (objM3472j == enumC1152a4) {
                        return enumC1152a4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case 5:
                C2822O c2822o = (C2822O) this.f458j;
                int i10 = this.f457i;
                EnumC1152a enumC1152a5 = EnumC1152a.f3788d;
                if (i10 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c2243c = c2822o.f8879B;
                    if (c2243c != null) {
                    }
                    if (c2822o.f8885w == null) {
                    }
                    return enumC1152a5;
                }
                if (i10 == 1) {
                    AbstractC1784a.m3205S(obj);
                    if (c2822o.f8885w == null) {
                    }
                    return enumC1152a5;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1784a.m3205S(obj);
                InterfaceC2832Z interfaceC2832Z = c2822o.f8885w;
                if (interfaceC2832Z != null) {
                    ((C2836b0) interfaceC2832Z).m5031d();
                }
                c2243c = c2822o.f8879B;
                if (c2243c != null) {
                    this.f457i = 1;
                    if (c2243c.mo4091p(this) != enumC1152a5) {
                    }
                    return enumC1152a5;
                }
                if (c2822o.f8885w == null) {
                    C2654f0 c2654f0 = new C2654f0(17);
                    this.f457i = 2;
                    InterfaceC1051i interfaceC1051i = this.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i);
                    break;
                } else {
                    c2243c = c2822o.f8879B;
                    if (c2243c != null) {
                    }
                    if (c2822o.f8885w == null) {
                    }
                }
                return enumC1152a5;
            case 6:
                int i11 = this.f457i;
                if (i11 == 0) {
                    AbstractC1784a.m3205S(obj);
                    interfaceC2160t = (InterfaceC2160t) this.f458j;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2160t = (InterfaceC2160t) this.f458j;
                    AbstractC1784a.m3205S(obj);
                }
                while (AbstractC2162v.m3992n(interfaceC2160t.mo1202f())) {
                    C2654f0 c2654f02 = new C2654f0(17);
                    this.f458j = interfaceC2160t;
                    this.f457i = 1;
                    InterfaceC1051i interfaceC1051i2 = this.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i2);
                    Object objM1209a = AbstractC1385s.m2626p(interfaceC1051i2).m1209a(c2654f02, this);
                    EnumC1152a enumC1152a6 = EnumC1152a.f3788d;
                    if (objM1209a == enumC1152a6) {
                        return enumC1152a6;
                    }
                }
                return C0891q.f2780a;
            case 7:
                int i12 = this.f457i;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj;
                }
                AbstractC1784a.m3205S(obj);
                C2243c c2243c2 = (C2243c) ((C2981c0) this.f458j).f9443f;
                this.f457i = 1;
                Object objM3982d2 = AbstractC2162v.m3982d(new C0039U(c2243c2, (InterfaceC1046d) null, 18), this);
                EnumC1152a enumC1152a7 = EnumC1152a.f3788d;
                return objM3982d2 == enumC1152a7 ? enumC1152a7 : objM3982d2;
            case 8:
                AbstractC1784a.m3205S(obj);
                C3385p c3385p = (C3385p) this.f458j;
                int i13 = this.f457i;
                C0212z c0212z = c3385p.f10563e;
                if (((C1360f0) c0212z.f741b).m2509g() != i13 || ((C1360f0) c0212z.f742c).m2509g() != 0) {
                    C3436s c3436s = c3385p.f10572n;
                    c3436s.m5701c();
                    c3436s.f10727b = null;
                }
                c0212z.m323b(i13, 0);
                c0212z.f743d = null;
                C0564I c0564i = c3385p.f10569k;
                if (c0564i != null) {
                    c0564i.m829k();
                }
                return C0891q.f2780a;
            default:
                int i14 = this.f457i;
                if (i14 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2661j c2661j = (C2661j) ((C2023b) this.f458j).f6753f;
                    Float f2 = new Float(0.0f);
                    C2626I c2626iM4617j = AbstractC2649d.m4617j(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f457i = 1;
                    Object objM4610c = AbstractC2649d.m4610c(c2661j, f2, c2626iM4617j, new C1286x(26), this);
                    EnumC1152a enumC1152a8 = EnumC1152a.f3788d;
                    if (objM4610c == enumC1152a8) {
                        return enumC1152a8;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: W2.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0098y0(InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f456h = 2;
        this.f458j = (AbstractC1184i) interfaceC1601c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098y0(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f456h = i5;
        this.f458j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098y0(C3385p c3385p, int i5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f456h = 8;
        this.f458j = c3385p;
        this.f457i = i5;
    }
}
