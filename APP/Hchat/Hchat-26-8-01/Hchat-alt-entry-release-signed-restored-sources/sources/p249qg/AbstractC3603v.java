package p249qg;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1425u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p119i2.C1954y;
import p136j8.C2104o;
import p162l3.C2463q;
import p230p8.C3364p;
import p267s1.C3917w;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p370yf.AbstractC6036a;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import p370yf.InterfaceC6039d;
import vg.AbstractC4552a;
import vg.C4554c;
import vg.C4557f;
import vg.C4567p;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5559e;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3603v {

    /* JADX INFO: renamed from: a */
    public static final C2463q f11619a = new C2463q("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: b */
    public static final C2463q f11620b = new C2463q("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: c */
    public static final C2463q f11621c = new C2463q("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: d */
    public static final C2463q f11622d = new C2463q("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: e */
    public static final C2463q f11623e = new C2463q("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: f */
    public static final C2463q f11624f = new C2463q("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: g */
    public static final C2463q f11625g = new C2463q("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: h */
    public static final C2463q f11626h = new C2463q("SEALED", 1);

    /* JADX INFO: renamed from: i */
    public static final C3562f0 f11627i = new C3562f0(false);

    /* JADX INFO: renamed from: j */
    public static final C3562f0 f11628j = new C3562f0(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C4554c m7547a(InterfaceC5561g interfaceC5561g) {
        if (interfaceC5561g.mo2062s(C3593q.f11607h) == null) {
            interfaceC5561g = interfaceC5561g.mo2059e(new C3600t0(null));
        }
        return new C4554c(interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7548b(AbstractC6038c abstractC6038c) {
        C3611z c3611z;
        if (abstractC6038c instanceof C3611z) {
            c3611z = (C3611z) abstractC6038c;
            int i9 = c3611z.f11644h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3611z.f11644h = i9 - Integer.MIN_VALUE;
            } else {
                c3611z = new C3611z(abstractC6038c);
            }
        }
        Object obj = c3611z.f11643g;
        int i10 = c3611z.f11644h;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            c3611z.f11644h = 1;
            C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(c3611z));
            c3564g.m7513p();
            if (c3564g.m7512o() == EnumC5799a.f23547g) {
                return;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC1089i.m2732I0(obj);
        }
        C3193a.m6814c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m7549c(InterfaceC3599t interfaceC3599t, C3917w c3917w) {
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC3599t.mo4457n().mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null) {
            interfaceC3596r0.mo7485a(c3917w);
        } else {
            C3193a.m6826p(interfaceC3599t, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object m7550d(InterfaceC3596r0 interfaceC3596r0, AbstractC6044i abstractC6044i) {
        interfaceC3596r0.mo7485a(null);
        Object objMo7488g = interfaceC3596r0.mo7488g(abstractC6044i);
        return objMo7488g == EnumC5799a.f23547g ? objMo7488g : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Object m7551e(InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        C4567p c4567p = new C4567p(interfaceC5557c, interfaceC5557c.getContext());
        return AbstractC1184v0.m3185L(c4567p, c4567p, interfaceC1235p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Object m7552f(long j3, InterfaceC5557c interfaceC5557c) {
        if (j3 > 0) {
            C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
            c3564g.m7513p();
            if (j3 < Long.MAX_VALUE) {
                m7555i(c3564g.f11567k).mo7537u(j3, c3564g);
            }
            Object objM7512o = c3564g.m7512o();
            if (objM7512o == EnumC5799a.f23547g) {
                return objM7512o;
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m7553g(InterfaceC5561g interfaceC5561g) {
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null && !interfaceC3596r0.mo7486b()) {
            throw interfaceC3596r0.mo7489h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC5561g m7554h(InterfaceC5561g interfaceC5561g, InterfaceC5561g interfaceC5561g2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC5561g.mo2061k(new C1954y(13), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC5561g2.mo2061k(new C1954y(13), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC5561g.mo2059e(interfaceC5561g2);
        }
        C1954y c1954y = new C1954y(11);
        C5562h c5562h = C5562h.f22661g;
        InterfaceC5561g interfaceC5561g3 = (InterfaceC5561g) interfaceC5561g.mo2061k(c1954y, c5562h);
        Object objMo2061k = interfaceC5561g2;
        if (zBooleanValue2) {
            objMo2061k = interfaceC5561g2.mo2061k(new C1954y(12), c5562h);
        }
        return interfaceC5561g3.mo2059e((InterfaceC5561g) objMo2061k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC3609y m7555i(InterfaceC5561g interfaceC5561g) {
        InterfaceC5559e interfaceC5559eMo2062s = interfaceC5561g.mo2062s(C5558d.f22660g);
        InterfaceC3609y interfaceC3609y = interfaceC5559eMo2062s instanceof InterfaceC3609y ? (InterfaceC3609y) interfaceC5559eMo2062s : null;
        return interfaceC3609y == null ? AbstractC3607x.f11636a : interfaceC3609y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final String m7556j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC3596r0 m7557k(InterfaceC5561g interfaceC5561g) {
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null) {
            return interfaceC3596r0;
        }
        C3193a.m6826p(interfaceC5561g, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C3564g m7558l(InterfaceC5557c interfaceC5557c) {
        C3564g c3564g;
        C3564g c3564g2;
        if (!(interfaceC5557c instanceof C4557f)) {
            return new C3564g(1, interfaceC5557c);
        }
        C4557f c4557f = (C4557f) interfaceC5557c;
        C2463q c2463q = AbstractC4552a.f15015c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4557f.f15025n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c4557f);
            c3564g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c4557f, c2463q);
                c3564g2 = null;
                break;
            }
            if (obj instanceof C3564g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c4557f, obj, c2463q)) {
                    if (atomicReferenceFieldUpdater.get(c4557f) != obj) {
                        break;
                    }
                }
                c3564g2 = (C3564g) obj;
                break loop0;
            }
            if (obj != c2463q && !(obj instanceof Throwable)) {
                C3193a.m6826p(obj, "Inconsistent state ");
                return null;
            }
        }
        if (c3564g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3564g.f11564m;
            Object obj2 = atomicReferenceFieldUpdater2.get(c3564g2);
            if (!(obj2 instanceof C3582m) || ((C3582m) obj2).f11595d == null) {
                C3564g.f11563l.set(c3564g2, 536870911);
                atomicReferenceFieldUpdater2.set(c3564g2, C3549b.f11550a);
                c3564g = c3564g2;
            } else {
                c3564g2.m7509l();
            }
            if (c3564g != null) {
                return c3564g;
            }
        }
        return new C3564g(2, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m7559m(Throwable th2, InterfaceC5561g interfaceC5561g) {
        try {
            InterfaceC3595r interfaceC3595r = (InterfaceC3595r) interfaceC5561g.mo2062s(C3593q.f11606g);
            if (interfaceC3595r != null) {
                interfaceC3595r.mo4455m(th2, interfaceC5561g);
            } else {
                AbstractC4552a.m8985d(th2, interfaceC5561g);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                AbstractC0063p.m412e(runtimeException, th2);
                th2 = runtimeException;
            }
            AbstractC4552a.m8985d(th2, interfaceC5561g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC3556d0 m7560n(InterfaceC3596r0 interfaceC3596r0, boolean z9, AbstractC3602u0 abstractC3602u0) {
        if (interfaceC3596r0 instanceof C3610y0) {
            return ((C3610y0) interfaceC3596r0).m7585M(z9, abstractC3602u0);
        }
        return interfaceC3596r0.mo7487c(abstractC3602u0.mo7495k(), z9, new C3364p(1, abstractC3602u0, AbstractC3602u0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m7561o(InterfaceC3599t interfaceC3599t) {
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC3599t.mo4457n().mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null) {
            return interfaceC3596r0.mo7486b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m7562p(InterfaceC5561g interfaceC5561g) {
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null) {
            return interfaceC3596r0.mo7486b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C3560e1 m7563q(InterfaceC3599t interfaceC3599t, InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p, int i9) {
        if ((i9 & 1) != 0) {
            interfaceC5561g = C5562h.f22661g;
        }
        EnumC3601u enumC3601u = (i9 & 2) != 0 ? EnumC3601u.f11613g : EnumC3601u.f11616j;
        InterfaceC5561g interfaceC5561gM7554h = m7554h(interfaceC3599t.mo4457n(), interfaceC5561g, true);
        C5808e c5808e = AbstractC3553c0.f11555a;
        if (interfaceC5561gM7554h != c5808e && interfaceC5561gM7554h.mo2062s(C5558d.f22660g) == null) {
            interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e);
        }
        C3560e1 c3612z0 = enumC3601u == EnumC3601u.f11614h ? new C3612z0(interfaceC5561gM7554h, interfaceC1235p) : new C3560e1(interfaceC5561gM7554h, true);
        c3612z0.m7472c0(enumC3601u, c3612z0, interfaceC1235p);
        return c3612z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final Object m7564r(Object obj) {
        return obj instanceof C3585n ? AbstractC1089i.m2785q(((C3585n) obj).f11599a) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m7565s(C3564g c3564g, InterfaceC5557c interfaceC5557c, boolean z9) {
        Object obj = C3564g.f11564m.get(c3564g);
        Throwable thMo7481d = c3564g.mo7481d(obj);
        Object c3959f = thMo7481d != null ? new C3959f(thMo7481d) : c3564g.mo7482e(obj);
        if (!z9) {
            interfaceC5557c.resumeWith(c3959f);
            return;
        }
        interfaceC5557c.getClass();
        C4557f c4557f = (C4557f) interfaceC5557c;
        AbstractC6038c abstractC6038c = c4557f.f15027k;
        Object obj2 = c4557f.f15029m;
        InterfaceC5561g context = abstractC6038c.getContext();
        Object objM8993l = AbstractC4552a.m8993l(context, obj2);
        C3584m1 c3584m1M7569w = objM8993l != AbstractC4552a.f15016d ? m7569w(abstractC6038c, context, objM8993l) : null;
        try {
            abstractC6038c.resumeWith(c3959f);
            if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                AbstractC4552a.m8988g(context, objM8993l);
            }
        } catch (Throwable th2) {
            if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                AbstractC4552a.m8988g(context, objM8993l);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Object m7566t(RunnableC3575j1 runnableC3575j1, InterfaceC1235p interfaceC1235p) throws Throwable {
        Object c3585n;
        Object objM7587O;
        m7560n(runnableC3575j1, true, new C3559e0(m7555i(runnableC3575j1.f15051j.getContext()).mo7536q(runnableC3575j1.f11582k, runnableC3575j1, runnableC3575j1.f11548i), 0));
        try {
            if (interfaceC1235p instanceof AbstractC6036a) {
                AbstractC1428x.m3838c(2, interfaceC1235p);
                c3585n = interfaceC1235p.invoke(runnableC3575j1, runnableC3575j1);
            } else {
                c3585n = AbstractC1184v0.m3190Q(interfaceC1235p, runnableC3575j1, runnableC3575j1);
            }
        } catch (Throwable th2) {
            c3585n = new C3585n(th2, false);
        }
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (c3585n == enumC5799a || (objM7587O = runnableC3575j1.m7587O(c3585n)) == f11623e) {
            return enumC5799a;
        }
        if (objM7587O instanceof C3585n) {
            Throwable th3 = ((C3585n) objM7587O).f11599a;
            if (!(th3 instanceof C3572i1) || ((C3572i1) th3).f11579g != runnableC3575j1) {
                throw th3;
            }
            if (c3585n instanceof C3585n) {
                throw ((C3585n) c3585n).f11599a;
            }
        } else {
            c3585n = m7568v(objM7587O);
        }
        return c3585n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final String m7567u(InterfaceC5557c interfaceC5557c) {
        Object c3959f;
        if (interfaceC5557c instanceof C4557f) {
            return ((C4557f) interfaceC5557c).toString();
        }
        try {
            c3959f = interfaceC5557c + '@' + m7556j(interfaceC5557c);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = interfaceC5557c.getClass().getName() + '@' + m7556j(interfaceC5557c);
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m7568v(Object obj) {
        InterfaceC3589o0 interfaceC3589o0;
        C3592p0 c3592p0 = obj instanceof C3592p0 ? (C3592p0) obj : null;
        return (c3592p0 == null || (interfaceC3589o0 = c3592p0.f11605a) == null) ? obj : interfaceC3589o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final C3584m1 m7569w(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g, Object obj) {
        C3584m1 c3584m1 = null;
        if ((interfaceC5557c instanceof InterfaceC6039d) && interfaceC5561g.mo2062s(C3587n1.f11601g) != null) {
            InterfaceC6039d callerFrame = (InterfaceC6039d) interfaceC5557c;
            while (true) {
                if ((callerFrame instanceof C3547a0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C3584m1) {
                    c3584m1 = (C3584m1) callerFrame;
                    break;
                }
            }
            if (c3584m1 != null) {
                c3584m1.m7541e0(interfaceC5561g, obj);
            }
        }
        return c3584m1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final Object m7570x(InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) throws Throwable {
        InterfaceC5561g context = interfaceC5557c.getContext();
        InterfaceC5561g interfaceC5561gMo2059e = !((Boolean) interfaceC5561g.mo2061k(new C1954y(13), Boolean.FALSE)).booleanValue() ? context.mo2059e(interfaceC5561g) : m7554h(context, interfaceC5561g, false);
        m7553g(interfaceC5561gMo2059e);
        if (interfaceC5561gMo2059e == context) {
            C4567p c4567p = new C4567p(interfaceC5557c, interfaceC5561gMo2059e);
            return AbstractC1184v0.m3185L(c4567p, c4567p, interfaceC1235p);
        }
        C5558d c5558d = C5558d.f22660g;
        if (AbstractC1416l.m3825a(interfaceC5561gMo2059e.mo2062s(c5558d), context.mo2062s(c5558d))) {
            C3584m1 c3584m1 = new C3584m1(interfaceC5557c, interfaceC5561gMo2059e);
            InterfaceC5561g interfaceC5561g2 = c3584m1.f11548i;
            Object objM8993l = AbstractC4552a.m8993l(interfaceC5561g2, null);
            try {
                return AbstractC1184v0.m3185L(c3584m1, c3584m1, interfaceC1235p);
            } finally {
                AbstractC4552a.m8988g(interfaceC5561g2, objM8993l);
            }
        }
        C3547a0 c3547a0 = new C3547a0(interfaceC5557c, interfaceC5561gMo2059e);
        try {
            AbstractC4552a.m8989h(C3967n.f12976a, AbstractC1184v0.m3214x(AbstractC1184v0.m3200j(interfaceC1235p, c3547a0, c3547a0)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3547a0.f11549k;
            do {
                int i9 = atomicIntegerFieldUpdater.get(c3547a0);
                if (i9 != 0) {
                    if (i9 != 2) {
                        C2104o.m5276A("Already suspended");
                        return null;
                    }
                    Object objM7568v = m7568v(C3610y0.f11641g.get(c3547a0));
                    if (objM7568v instanceof C3585n) {
                        throw ((C3585n) objM7568v).f11599a;
                    }
                    return objM7568v;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c3547a0, 0, 1));
            return EnumC5799a.f23547g;
        } catch (Throwable th2) {
            c3547a0.resumeWith(new C3959f(th2));
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7571y(long j3, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) throws Throwable {
        C3578k1 c3578k1;
        C1425u c1425u;
        if (abstractC6038c instanceof C3578k1) {
            c3578k1 = (C3578k1) abstractC6038c;
            int i9 = c3578k1.f11587i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3578k1.f11587i = i9 - Integer.MIN_VALUE;
            } else {
                c3578k1 = new C3578k1(abstractC6038c);
            }
        }
        Object obj = c3578k1.f11586h;
        int i10 = c3578k1.f11587i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (j3 <= 0) {
                return null;
            }
            C1425u c1425u2 = new C1425u();
            try {
                c3578k1.f11585g = c1425u2;
                c3578k1.f11587i = 1;
                RunnableC3575j1 runnableC3575j1 = new RunnableC3575j1(j3, c3578k1);
                c1425u2.f4738g = runnableC3575j1;
                Object objM7566t = m7566t(runnableC3575j1, interfaceC1235p);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                return objM7566t == enumC5799a ? enumC5799a : objM7566t;
            } catch (C3572i1 e6) {
                e = e6;
                c1425u = c1425u2;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1425u = c3578k1.f11585g;
            try {
                AbstractC1089i.m2732I0(obj);
                return obj;
            } catch (C3572i1 e7) {
                e = e7;
            }
        }
        if (e.f11579g == c1425u.f4738g) {
            return null;
        }
        throw e;
    }
}
