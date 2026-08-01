package p000A;

import android.view.View;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p007B0.InterfaceC0169B;
import p027E4.C0330q;
import p034G.C0466k;
import p046I.AbstractC0658e;
import p047I0.C0696T;
import p047I0.C0711a0;
import p047I0.C0730g1;
import p051J.AbstractC0828t;
import p051J.C0809a;
import p051J.C0811c;
import p051J.C0822n;
import p051J.C0824p;
import p051J.C0827s;
import p051J.C0829u;
import p056K2.C0891q;
import p058L.C0920W;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.C1257J;
import p092S0.C1259L;
import p095T.C1357e;
import p095T.C1397y;
import p095T.C1398y0;
import p095T.C1400z0;
import p095T.EnumC1392v0;
import p095T.InterfaceC1347Y;
import p109W.InterfaceC1575b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.C1647v;
import p117X2.AbstractC1665j;
import p119Y.C1719c;
import p121Y1.C1753n;
import p124Z.C1777a;
import p124Z.C1778b;
import p127Z2.AbstractC1784a;
import p129a0.C1787b;
import p135b.C1836x;
import p158f0.AbstractC2082n;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p178i3.C2318C;
import p179i4.AbstractC2352g;
import p184j3.AbstractC2384c;
import p204n0.C2684c;
import p227r.C2950F0;
import p227r.C2989g0;
import p266y.C3473c;

/* JADX INFO: renamed from: A.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0024M extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f122h = 0;

    /* JADX INFO: renamed from: i */
    public int f123i;

    /* JADX INFO: renamed from: j */
    public Object f124j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f125k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f126l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f127m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f128n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C0078o0 c0078o0, InterfaceC1347Y interfaceC1347Y, C1647v c1647v, C0920W c0920w, C1636k c1636k, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f124j = c0078o0;
        this.f125k = interfaceC1347Y;
        this.f126l = c1647v;
        this.f127m = c0920w;
        this.f128n = c1636k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f122h) {
            case 2:
                ((C0024M) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
                break;
        }
        return ((C0024M) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v7, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f122h) {
            case 0:
                return new C0024M((C0078o0) this.f124j, (InterfaceC1347Y) this.f125k, (C1647v) this.f126l, (C0920W) this.f127m, (C1636k) this.f128n, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0024M((C3473c) this.f125k, (C1646u) this.f126l, (C0078o0) this.f124j, (C0036S0) this.f127m, (C0042V0) this.f128n, interfaceC1046d);
            case 2:
                C0024M c0024m = new C0024M((C0696T) this.f125k, (InterfaceC1601c) this.f126l, (C0811c) this.f127m, (C0824p) this.f128n, interfaceC1046d);
                c0024m.f124j = obj;
                return c0024m;
            case 3:
                C0024M c0024m2 = new C0024M((C1400z0) this.f126l, (C1398y0) this.f127m, (C0711a0) this.f128n, interfaceC1046d);
                c0024m2.f125k = obj;
                return c0024m2;
            default:
                C0024M c0024m3 = new C0024M((InterfaceC0169B) this.f125k, (InterfaceC1604f) this.f126l, (InterfaceC1601c) this.f127m, (C2989g0) this.f128n, interfaceC1046d);
                c0024m3.f124j = obj;
                return c0024m3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v21, types: [Q2.i, W2.f] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        C2318C c2318c;
        Object obj2;
        C1778b c1778b;
        InterfaceC2115S interfaceC2115S;
        C1836x c1836x;
        C1400z0 c1400z0;
        List listM2680D;
        C1778b c1778b2;
        C1400z0 c1400z02;
        C1400z0 c1400z03;
        int i5 = 3;
        InterfaceC1046d interfaceC1046d = null;
        switch (this.f122h) {
            case 0:
                C0078o0 c0078o0 = (C0078o0) this.f124j;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                int i6 = this.f123i;
                try {
                    if (i6 == 0) {
                        AbstractC1784a.m3205S(obj);
                        C1753n c1753n = new C1753n(new C0730g1(new C0020K((InterfaceC1347Y) this.f125k, 0), null));
                        C0022L c0022l = new C0022L(c0078o0, (C1647v) this.f126l, (C0920W) this.f127m, (C1636k) this.f128n, 0);
                        this.f123i = 1;
                        if (c1753n.mo3119i(c0022l, this) == enumC1152a) {
                            return enumC1152a;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                    }
                    AbstractC0070k0.m84k(c0078o0);
                    return C0891q.f2780a;
                } catch (Throwable th) {
                    AbstractC0070k0.m84k(c0078o0);
                    throw th;
                }
            case BuildConfig.VERSION_CODE /* 1 */:
                C0891q c0891q = C0891q.f2780a;
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                int i7 = this.f123i;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                C3473c c3473c = (C3473c) this.f125k;
                C1646u c1646u = (C1646u) this.f126l;
                C0090u0 c0090u0 = ((C0078o0) this.f124j).f337a;
                C1257J c1257j = ((C0036S0) this.f127m).f161a;
                C0042V0 c0042v0 = (C0042V0) this.f128n;
                this.f123i = 1;
                int iM2337e = C1259L.m2337e(c1646u.f5651b);
                c0042v0.m57a(iM2337e);
                Object objM5709a = c3473c.m5709a(iM2337e < c1257j.f4526a.f4516a.f4563e.length() ? c1257j.m2325b(iM2337e) : iM2337e != 0 ? c1257j.m2325b(iM2337e - 1) : new C2684c(0.0f, 0.0f, 1.0f, (int) (AbstractC0003B0.m2a(c0090u0.f403b, c0090u0.f408g, c0090u0.f409h, AbstractC0003B0.f13a, 1) & 4294967295L)), this);
                if (objM5709a != enumC1152a2) {
                    objM5709a = c0891q;
                }
                return objM5709a == enumC1152a2 ? enumC1152a2 : c0891q;
            case 2:
                C0811c c0811c = (C0811c) this.f127m;
                C0696T c0696t = (C0696T) this.f125k;
                EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                int i8 = this.f123i;
                try {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                        throw new C0330q();
                    }
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f124j;
                    C0827s c0827s = AbstractC0828t.f2667a;
                    View view = c0696t.f2224d;
                    c0827s.getClass();
                    C0822n c0822n = new C0822n(view);
                    C0829u c0829u = new C0829u(c0696t.f2224d, new C0809a((C0824p) this.f128n), c0822n);
                    if (AbstractC0658e.f2084a) {
                        AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(c0811c, c0822n, interfaceC1046d, 4), 3);
                    }
                    InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f126l;
                    if (interfaceC1601c != null) {
                        interfaceC1601c.mo1h(c0829u);
                    }
                    c0811c.f2608c = c0829u;
                    this.f123i = 1;
                    c0696t.m1201a(c0829u, this);
                    return enumC1152a3;
                } catch (Throwable th2) {
                    c0811c.f2608c = null;
                    throw th2;
                }
            case 3:
                EnumC1152a enumC1152a4 = EnumC1152a.f3788d;
                int i9 = this.f123i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1836x = (C1836x) this.f124j;
                    interfaceC2115S = (InterfaceC2115S) this.f125k;
                    try {
                        AbstractC1784a.m3205S(obj);
                        c1836x.m3299a();
                        c1400z03 = (C1400z0) this.f126l;
                        synchronized (c1400z03.f4997c) {
                            try {
                                if (c1400z03.f4998d == interfaceC2115S) {
                                    c1400z03.f4998d = null;
                                }
                                c1400z03.m2689y();
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        C2318C c2318c2 = C1400z0.f4994z;
                        C1357e.m2504b(((C1400z0) this.f126l).f5019y);
                        return C0891q.f2780a;
                    } catch (Throwable th4) {
                        th = th4;
                        c1836x.m3299a();
                        c1400z02 = (C1400z0) this.f126l;
                        synchronized (c1400z02.f4997c) {
                            try {
                                if (c1400z02.f4998d == interfaceC2115S) {
                                    c1400z02.f4998d = null;
                                }
                                c1400z02.m2689y();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        C2318C c2318c3 = C1400z0.f4994z;
                        C1357e.m2504b(((C1400z0) this.f126l).f5019y);
                        throw th;
                    }
                }
                AbstractC1784a.m3205S(obj);
                InterfaceC2115S interfaceC2115SM3988j = AbstractC2162v.m3988j(((InterfaceC2160t) this.f125k).mo1202f());
                C1400z0 c1400z04 = (C1400z0) this.f126l;
                synchronized (c1400z04.f4997c) {
                    Throwable th6 = c1400z04.f4999e;
                    if (th6 != null) {
                        throw th6;
                    }
                    if (((EnumC1392v0) c1400z04.f5015u.getValue()).compareTo(EnumC1392v0.f4935e) <= 0) {
                        throw new IllegalStateException("Recomposer shut down");
                    }
                    if (c1400z04.f4998d != null) {
                        throw new IllegalStateException("Recomposer already running");
                    }
                    c1400z04.f4998d = interfaceC2115SM3988j;
                    c1400z04.m2689y();
                }
                C0002B c0002b = new C0002B(9, (C1400z0) this.f126l);
                AbstractC2082n.m3829e(AbstractC2082n.f6970a);
                synchronized (AbstractC2082n.f6972c) {
                    AbstractC2082n.f6977h = AbstractC0973m.m2020a0(AbstractC2082n.f6977h, c0002b);
                }
                C1836x c1836x2 = new C1836x(2, c0002b);
                C2318C c2318c4 = C1400z0.f4994z;
                C1357e c1357e = ((C1400z0) this.f126l).f5019y;
                try {
                    do {
                        c2318c = C1400z0.f4994z;
                        obj2 = (InterfaceC1575b) c2318c.getValue();
                        c1778b = (C1778b) obj2;
                        C1787b c1787b = C1787b.f6103a;
                        C1719c c1719c = c1778b.f6083f;
                        if (!c1719c.containsKey(c1357e)) {
                            if (c1778b.isEmpty()) {
                                c1778b2 = new C1778b(c1357e, c1357e, c1719c.m3055a(c1357e, new C1777a(c1787b, c1787b)));
                            } else {
                                Object obj3 = c1778b.f6082e;
                                Object obj4 = c1719c.get(obj3);
                                AbstractC1665j.m2982b(obj4);
                                c1778b2 = new C1778b(c1778b.f6081d, c1357e, c1719c.m3055a(obj3, new C1777a(((C1777a) obj4).f6078a, c1357e)).m3055a(c1357e, new C1777a(obj3, c1787b)));
                            }
                            c1778b = c1778b2;
                        }
                        if (obj2 != c1778b) {
                            C1753n c1753n2 = AbstractC2384c.f7730b;
                            if (obj2 == null) {
                                obj2 = c1753n2;
                            }
                        }
                        c1400z0 = (C1400z0) this.f126l;
                        synchronized (c1400z0.f4997c) {
                            listM2680D = c1400z0.m2680D();
                        }
                        int size = listM2680D.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((C1397y) listM2680D.get(i10)).m2666t();
                        }
                        C0466k c0466k = new C0466k((C1398y0) this.f127m, (C0711a0) this.f128n, interfaceC1046d, i5);
                        this.f125k = interfaceC2115SM3988j;
                        this.f124j = c1836x2;
                        this.f123i = 1;
                        if (AbstractC2162v.m3982d(c0466k, this) == enumC1152a4) {
                            return enumC1152a4;
                        }
                        interfaceC2115S = interfaceC2115SM3988j;
                        c1836x = c1836x2;
                        c1836x.m3299a();
                        c1400z03 = (C1400z0) this.f126l;
                        synchronized (c1400z03.f4997c) {
                        }
                    } while (!c2318c.m4147g(obj2, c1778b));
                    c1400z0 = (C1400z0) this.f126l;
                    synchronized (c1400z0.f4997c) {
                    }
                } catch (Throwable th7) {
                    th = th7;
                    interfaceC2115S = interfaceC2115SM3988j;
                    c1836x = c1836x2;
                    c1836x.m3299a();
                    c1400z02 = (C1400z0) this.f126l;
                    synchronized (c1400z02.f4997c) {
                    }
                }
                break;
            default:
                EnumC1152a enumC1152a5 = EnumC1152a.f3788d;
                int i11 = this.f123i;
                if (i11 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2160t interfaceC2160t2 = (InterfaceC2160t) this.f124j;
                    InterfaceC0169B interfaceC0169B = (InterfaceC0169B) this.f125k;
                    C2950F0 c2950f0 = new C2950F0(interfaceC2160t2, (AbstractC1184i) this.f126l, (InterfaceC1601c) this.f127m, (C2989g0) this.f128n, null);
                    this.f123i = 1;
                    if (AbstractC2352g.m4197j(interfaceC0169B, c2950f0, this) == enumC1152a5) {
                        return enumC1152a5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.f */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0024M(InterfaceC0169B interfaceC0169B, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, C2989g0 c2989g0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = interfaceC0169B;
        this.f126l = (AbstractC1184i) interfaceC1604f;
        this.f127m = interfaceC1601c;
        this.f128n = c2989g0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C0696T c0696t, InterfaceC1601c interfaceC1601c, C0811c c0811c, C0824p c0824p, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = c0696t;
        this.f126l = interfaceC1601c;
        this.f127m = c0811c;
        this.f128n = c0824p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C1400z0 c1400z0, C1398y0 c1398y0, C0711a0 c0711a0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f126l = c1400z0;
        this.f127m = c1398y0;
        this.f128n = c0711a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C3473c c3473c, C1646u c1646u, C0078o0 c0078o0, C0036S0 c0036s0, C0042V0 c0042v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = c3473c;
        this.f126l = c1646u;
        this.f124j = c0078o0;
        this.f127m = c0036s0;
        this.f128n = c0042v0;
    }
}
