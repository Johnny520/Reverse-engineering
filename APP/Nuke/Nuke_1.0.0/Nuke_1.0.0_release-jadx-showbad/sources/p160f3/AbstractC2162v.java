package p160f3;

import com.bumptech.glide.AbstractC1923e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A.C0009E0;
import p007B0.C0168A;
import p027E4.C0330q;
import p056K2.AbstractC0885k;
import p056K2.C0891q;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p084Q2.AbstractC1178c;
import p084Q2.AbstractC1184i;
import p084Q2.InterfaceC1179d;
import p092S0.C1287y;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p117X2.C1675t;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p179i4.AbstractC2352g;
import p190k3.AbstractC2453a;
import p190k3.C2455c;
import p190k3.C2458f;
import p190k3.C2469q;
import p201m3.C2608e;

/* JADX INFO: renamed from: f3.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2162v {

    /* JADX INFO: renamed from: a */
    public static final C1753n f7110a;

    /* JADX INFO: renamed from: b */
    public static final C1753n f7111b;

    /* JADX INFO: renamed from: c */
    public static final C1753n f7112c;

    /* JADX INFO: renamed from: d */
    public static final C1753n f7113d;

    /* JADX INFO: renamed from: e */
    public static final C1753n f7114e;

    /* JADX INFO: renamed from: f */
    public static final C1753n f7115f;

    /* JADX INFO: renamed from: g */
    public static final C1753n f7116g;

    /* JADX INFO: renamed from: h */
    public static final C1753n f7117h;

    /* JADX INFO: renamed from: i */
    public static final C2103F f7118i = new C2103F(false);

    /* JADX INFO: renamed from: j */
    public static final C2103F f7119j = new C2103F(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 10;
        f7110a = new C1753n(i5, "RESUME_TOKEN");
        f7111b = new C1753n(i5, "REMOVED_TASK");
        f7112c = new C1753n(i5, "CLOSED_EMPTY");
        f7113d = new C1753n(i5, "COMPLETING_ALREADY");
        f7114e = new C1753n(i5, "COMPLETING_WAITING_CHILDREN");
        f7115f = new C1753n(i5, "COMPLETING_RETRY");
        f7116g = new C1753n(i5, "TOO_LATE_TO_CANCEL");
        f7117h = new C1753n(i5, "SEALED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C2455c m3979a(InterfaceC1051i interfaceC1051i) {
        if (interfaceC1051i.mo1166C(C2155q.f7102e) == null) {
            interfaceC1051i = interfaceC1051i.mo1168m(new C2117U(null));
        }
        return new C2455c(interfaceC1051i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3980b(AbstractC1178c abstractC1178c) {
        C2166z c2166z;
        if (abstractC1178c instanceof C2166z) {
            c2166z = (C2166z) abstractC1178c;
            int i5 = c2166z.f7124h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2166z.f7124h = i5 - Integer.MIN_VALUE;
            } else {
                c2166z = new C2166z(abstractC1178c);
            }
        }
        Object obj = c2166z.f7123g;
        int i6 = c2166z.f7124h;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c2166z.f7124h = 1;
            C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(c2166z));
            c2135g.m3968t();
            if (c2135g.m3967r() == EnumC1152a.f3788d) {
                return;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        throw new C0330q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3981c(InterfaceC2160t interfaceC2160t, C0168A c0168a) {
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC2160t.mo1202f().mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null) {
            interfaceC2115S.mo3905c(c0168a);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC2160t).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object m3982d(InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        C2469q c2469q = new C2469q(interfaceC1046d, interfaceC1046d.mo275e());
        return AbstractC2352g.m4183F(c2469q, c2469q, interfaceC1603e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Object m3983e(long j5, AbstractC1178c abstractC1178c) {
        if (j5 > 0) {
            C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(abstractC1178c));
            c2135g.m3968t();
            if (j5 < Long.MAX_VALUE) {
                m3986h(c2135g.f7078h).mo3896d(j5, c2135g);
            }
            Object objM3967r = c2135g.m3967r();
            if (objM3967r == EnumC1152a.f3788d) {
                return objM3967r;
            }
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m3984f(InterfaceC1051i interfaceC1051i) {
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null && !interfaceC2115S.mo3904b()) {
            throw interfaceC2115S.mo3907n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC1051i m3985g(InterfaceC1051i interfaceC1051i, InterfaceC1051i interfaceC1051i2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC1051i.mo1165A(new C1287y((byte) 0, 18), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC1051i2.mo1165A(new C1287y((byte) 0, 18), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC1051i.mo1168m(interfaceC1051i2);
        }
        C1287y c1287y = new C1287y((byte) 0, 16);
        C1052j c1052j = C1052j.f3286d;
        InterfaceC1051i interfaceC1051i3 = (InterfaceC1051i) interfaceC1051i.mo1165A(c1287y, c1052j);
        Object objMo1165A = interfaceC1051i2;
        if (zBooleanValue2) {
            objMo1165A = interfaceC1051i2.mo1165A(new C1287y((byte) 0, 17), c1052j);
        }
        return interfaceC1051i3.mo1168m((InterfaceC1051i) objMo1165A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC2165y m3986h(InterfaceC1051i interfaceC1051i) {
        InterfaceC1049g interfaceC1049gMo1166C = interfaceC1051i.mo1166C(C1047e.f3285d);
        InterfaceC2165y interfaceC2165y = interfaceC1049gMo1166C instanceof InterfaceC2165y ? (InterfaceC2165y) interfaceC1049gMo1166C : null;
        return interfaceC2165y == null ? AbstractC2164x.f7122a : interfaceC2165y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final String m3987i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC2115S m3988j(InterfaceC1051i interfaceC1051i) {
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null) {
            return interfaceC2115S;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC1051i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C2135g m3989k(InterfaceC1046d interfaceC1046d) {
        C2135g c2135g;
        C2135g c2135g2;
        if (!(interfaceC1046d instanceof C2458f)) {
            return new C2135g(1, interfaceC1046d);
        }
        C2458f c2458f = (C2458f) interfaceC1046d;
        C1753n c1753n = AbstractC2453a.f7919c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2458f.f7929k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c2458f);
            c2135g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2458f, c1753n);
                c2135g2 = null;
                break;
            }
            if (obj instanceof C2135g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c2458f, obj, c1753n)) {
                    if (atomicReferenceFieldUpdater.get(c2458f) != obj) {
                        break;
                    }
                }
                c2135g2 = (C2135g) obj;
                break loop0;
            }
            if (obj != c1753n && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c2135g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2135g.f7075j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c2135g2);
            if (!(obj2 instanceof C2147m) || ((C2147m) obj2).f7088d == null) {
                C2135g.f7074i.set(c2135g2, 536870911);
                atomicReferenceFieldUpdater2.set(c2135g2, C2125b.f7066a);
                c2135g = c2135g2;
            } else {
                c2135g2.m3965o();
            }
            if (c2135g != null) {
                return c2135g;
            }
        }
        return new C2135g(2, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final void m3990l(InterfaceC1051i interfaceC1051i, Throwable th) {
        try {
            InterfaceC2157r interfaceC2157r = (InterfaceC2157r) interfaceC1051i.mo1166C(C2155q.f7101d);
            if (interfaceC2157r != null) {
                interfaceC2157r.mo2409h(interfaceC1051i, th);
            } else {
                AbstractC2453a.m4376d(interfaceC1051i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC2352g.m4193f(runtimeException, th);
                th = runtimeException;
            }
            AbstractC2453a.m4376d(interfaceC1051i, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC2101D m3991m(InterfaceC2115S interfaceC2115S, boolean z5, AbstractC2118V abstractC2118V) {
        if (interfaceC2115S instanceof C2122Z) {
            return ((C2122Z) interfaceC2115S).m3933P(z5, abstractC2118V);
        }
        return interfaceC2115S.mo3906l(abstractC2118V.mo3884k(), z5, new C0009E0(1, abstractC2118V, AbstractC2118V.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m3992n(InterfaceC1051i interfaceC1051i) {
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null) {
            return interfaceC2115S.mo3904b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m3993o(InterfaceC2160t interfaceC2160t) {
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC2160t.mo1202f().mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null) {
            return interfaceC2115S.mo3904b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C2136g0 m3994p(InterfaceC2160t interfaceC2160t, InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e, int i5) {
        if ((i5 & 1) != 0) {
            interfaceC1051i = C1052j.f3286d;
        }
        EnumC2161u enumC2161u = (i5 & 2) != 0 ? EnumC2161u.f7105d : EnumC2161u.f7108g;
        InterfaceC1051i interfaceC1051iM3985g = m3985g(interfaceC2160t.mo1202f(), interfaceC1051i, true);
        C2608e c2608e = AbstractC2100C.f7029a;
        if (interfaceC1051iM3985g != c2608e && interfaceC1051iM3985g.mo1166C(C1047e.f3285d) == null) {
            interfaceC1051iM3985g = interfaceC1051iM3985g.mo1168m(c2608e);
        }
        C2136g0 c2124a0 = enumC2161u == EnumC2161u.f7106e ? new C2124a0(interfaceC1051iM3985g, interfaceC1603e) : new C2136g0(interfaceC1051iM3985g, true);
        c2124a0.m3949f0(enumC2161u, c2124a0, interfaceC1603e);
        return c2124a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final Object m3995q(Object obj) {
        return obj instanceof C2149n ? AbstractC1784a.m3229o(((C2149n) obj).f7092a) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m3996r(C2135g c2135g, InterfaceC1046d interfaceC1046d, boolean z5) {
        Object obj = C2135g.f7075j.get(c2135g);
        Throwable thMo3879f = c2135g.mo3879f(obj);
        Object objM3229o = thMo3879f != null ? AbstractC1784a.m3229o(thMo3879f) : c2135g.mo3880g(obj);
        if (!z5) {
            interfaceC1046d.mo278i(objM3229o);
            return;
        }
        AbstractC1665j.m2983c(interfaceC1046d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2458f c2458f = (C2458f) interfaceC1046d;
        AbstractC1178c abstractC1178c = c2458f.f7931h;
        Object obj2 = c2458f.f7933j;
        InterfaceC1051i interfaceC1051iMo275e = abstractC1178c.mo275e();
        Object objM4384l = AbstractC2453a.m4384l(interfaceC1051iMo275e, obj2);
        C2154p0 c2154p0M4000v = objM4384l != AbstractC2453a.f7920d ? m4000v(abstractC1178c, interfaceC1051iMo275e, objM4384l) : null;
        try {
            abstractC1178c.mo278i(objM3229o);
            if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
            }
        } catch (Throwable th) {
            if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final Object m3997s(RunnableC2148m0 runnableC2148m0, InterfaceC1603e interfaceC1603e) throws Throwable {
        Object c2149n;
        Object objM3935R;
        m3991m(runnableC2148m0, true, new C2102E(0, m3986h(runnableC2148m0.f7956g.mo275e()).mo3897f(runnableC2148m0.f7090h, runnableC2148m0, runnableC2148m0.f7064f)));
        try {
            if (interfaceC1603e instanceof AbstractC1176a) {
                AbstractC1678w.m2998b(2, interfaceC1603e);
                c2149n = interfaceC1603e.mo0g(runnableC2148m0, runnableC2148m0);
            } else {
                c2149n = AbstractC1923e.m3462V(interfaceC1603e, runnableC2148m0, runnableC2148m0);
            }
        } catch (Throwable th) {
            c2149n = new C2149n(th, false);
        }
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (c2149n == enumC1152a || (objM3935R = runnableC2148m0.m3935R(c2149n)) == f7114e) {
            return enumC1152a;
        }
        if (objM3935R instanceof C2149n) {
            Throwable th2 = ((C2149n) objM3935R).f7092a;
            if (!(th2 instanceof C2146l0) || ((C2146l0) th2).f7084d != runnableC2148m0) {
                throw th2;
            }
            if (c2149n instanceof C2149n) {
                throw ((C2149n) c2149n).f7092a;
            }
        } else {
            c2149n = m3999u(objM3935R);
        }
        return c2149n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final String m3998t(InterfaceC1046d interfaceC1046d) {
        Object objM3229o;
        if (interfaceC1046d instanceof C2458f) {
            return ((C2458f) interfaceC1046d).toString();
        }
        try {
            objM3229o = interfaceC1046d + '@' + m3987i(interfaceC1046d);
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (AbstractC0885k.m1902a(objM3229o) != null) {
            objM3229o = interfaceC1046d.getClass().getName() + '@' + m3987i(interfaceC1046d);
        }
        return (String) objM3229o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final Object m3999u(Object obj) {
        InterfaceC2112O interfaceC2112O;
        C2113P c2113p = obj instanceof C2113P ? (C2113P) obj : null;
        return (c2113p == null || (interfaceC2112O = c2113p.f7047a) == null) ? obj : interfaceC2112O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final C2154p0 m4000v(InterfaceC1046d interfaceC1046d, InterfaceC1051i interfaceC1051i, Object obj) {
        C2154p0 c2154p0 = null;
        if ((interfaceC1046d instanceof InterfaceC1179d) && interfaceC1051i.mo1166C(C2156q0.f7103d) != null) {
            InterfaceC1179d interfaceC1179dMo2123d = (InterfaceC1179d) interfaceC1046d;
            while (true) {
                if ((interfaceC1179dMo2123d instanceof C2098A) || (interfaceC1179dMo2123d = interfaceC1179dMo2123d.mo2123d()) == null) {
                    break;
                }
                if (interfaceC1179dMo2123d instanceof C2154p0) {
                    c2154p0 = (C2154p0) interfaceC1179dMo2123d;
                    break;
                }
            }
            if (c2154p0 != null) {
                c2154p0.m3978h0(interfaceC1051i, obj);
            }
        }
        return c2154p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final Object m4001w(InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e, AbstractC1184i abstractC1184i) throws Throwable {
        InterfaceC1051i interfaceC1051i2 = abstractC1184i.f3866e;
        AbstractC1665j.m2982b(interfaceC1051i2);
        InterfaceC1051i interfaceC1051iMo1168m = !((Boolean) interfaceC1051i.mo1165A(new C1287y((byte) 0, 18), Boolean.FALSE)).booleanValue() ? interfaceC1051i2.mo1168m(interfaceC1051i) : m3985g(interfaceC1051i2, interfaceC1051i, false);
        m3984f(interfaceC1051iMo1168m);
        if (interfaceC1051iMo1168m == interfaceC1051i2) {
            C2469q c2469q = new C2469q(abstractC1184i, interfaceC1051iMo1168m);
            return AbstractC2352g.m4183F(c2469q, c2469q, interfaceC1603e);
        }
        C1047e c1047e = C1047e.f3285d;
        if (AbstractC1665j.m2981a(interfaceC1051iMo1168m.mo1166C(c1047e), interfaceC1051i2.mo1166C(c1047e))) {
            C2154p0 c2154p0 = new C2154p0(interfaceC1051iMo1168m, abstractC1184i);
            InterfaceC1051i interfaceC1051i3 = c2154p0.f7064f;
            Object objM4384l = AbstractC2453a.m4384l(interfaceC1051i3, null);
            try {
                return AbstractC2352g.m4183F(c2154p0, c2154p0, interfaceC1603e);
            } finally {
                AbstractC2453a.m4379g(interfaceC1051i3, objM4384l);
            }
        }
        C2098A c2098a = new C2098A(abstractC1184i, interfaceC1051iMo1168m);
        try {
            AbstractC2453a.m4380h(AbstractC1923e.m3448G(AbstractC1923e.m3479q(c2098a, c2098a, interfaceC1603e)), C0891q.f2780a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2098A.f7027h;
            do {
                int i5 = atomicIntegerFieldUpdater.get(c2098a);
                if (i5 != 0) {
                    if (i5 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objM3999u = m3999u(C2122Z.f7062d.get(c2098a));
                    if (objM3999u instanceof C2149n) {
                        throw ((C2149n) objM3999u).f7092a;
                    }
                    return objM3999u;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c2098a, 0, 1));
            return EnumC1152a.f3788d;
        } catch (Throwable th) {
            c2098a.mo278i(AbstractC1784a.m3229o(th));
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4002x(long j5, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) throws Throwable {
        C2150n0 c2150n0;
        C1675t c1675t;
        if (abstractC1178c instanceof C2150n0) {
            c2150n0 = (C2150n0) abstractC1178c;
            int i5 = c2150n0.f7095i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2150n0.f7095i = i5 - Integer.MIN_VALUE;
            } else {
                c2150n0 = new C2150n0(abstractC1178c);
            }
        }
        Object obj = c2150n0.f7094h;
        int i6 = c2150n0.f7095i;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            if (j5 <= 0) {
                return null;
            }
            C1675t c1675t2 = new C1675t();
            try {
                c2150n0.f7093g = c1675t2;
                c2150n0.f7095i = 1;
                RunnableC2148m0 runnableC2148m0 = new RunnableC2148m0(j5, c2150n0);
                c1675t2.f5710e = runnableC2148m0;
                Object objM3997s = m3997s(runnableC2148m0, interfaceC1603e);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                return objM3997s == enumC1152a ? enumC1152a : objM3997s;
            } catch (C2146l0 e5) {
                e = e5;
                c1675t = c1675t2;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1675t = c2150n0.f7093g;
            try {
                AbstractC1784a.m3205S(obj);
                return obj;
            } catch (C2146l0 e6) {
                e = e6;
            }
        }
        if (e.f7084d == c1675t.f5710e) {
            return null;
        }
        throw e;
    }
}
