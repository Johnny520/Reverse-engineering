package p249qg;

import ac.AbstractC0063p;
import af.C0081d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p162l3.C2463q;
import p230p8.C3364p;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import vg.C4559h;
import vg.C4560i;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3610y0 implements InterfaceC3596r0 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11641g = AtomicReferenceFieldUpdater.newUpdater(C3610y0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11642h = AtomicReferenceFieldUpdater.newUpdater(C3610y0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3610y0(boolean z9) {
        this._state$volatile = z9 ? AbstractC3603v.f11628j : AbstractC3603v.f11627i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0014 */
    /* JADX INFO: renamed from: Q */
    public static C3576k m7577Q(C4560i c4560i) {
        while (c4560i.mo7478i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4560i.f15038h;
            C4560i c4560iM9000f = c4560i.m9000f();
            if (c4560iM9000f == null) {
                Object obj = atomicReferenceFieldUpdater.get(c4560i);
                while (true) {
                    c4560i = (C4560i) obj;
                    if (!c4560i.mo7478i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c4560i);
                }
            } else {
                c4560i = c4560iM9000f;
            }
        }
        while (true) {
            c4560i = c4560i.m9002h();
            if (!c4560i.mo7478i()) {
                if (c4560i instanceof C3576k) {
                    return (C3576k) c4560i;
                }
                if (c4560i instanceof C3548a1) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static String m7578X(Object obj) {
        if (!(obj instanceof C3608x0)) {
            return obj instanceof InterfaceC3589o0 ? ((InterfaceC3589o0) obj).mo7476b() ? "Active" : "New" : obj instanceof C3585n ? "Cancelled" : "Completed";
        }
        C3608x0 c3608x0 = (C3608x0) obj;
        return c3608x0.m7575e() ? "Cancelling" : C3608x0.f11637h.get(c3608x0) != 0 ? "Completing" : "Active";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public boolean mo7501B(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m7595v(th2) && mo7544G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m7579C(InterfaceC3589o0 interfaceC3589o0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11642h;
        InterfaceC3573j interfaceC3573j = (InterfaceC3573j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3573j != null) {
            interfaceC3573j.mo7492a();
            atomicReferenceFieldUpdater.set(this, C3554c1.f11556g);
        }
        C0081d c0081d = null;
        C3585n c3585n = obj instanceof C3585n ? (C3585n) obj : null;
        Throwable th2 = c3585n != null ? c3585n.f11599a : null;
        if (interfaceC3589o0 instanceof AbstractC3602u0) {
            try {
                ((AbstractC3602u0) interfaceC3589o0).mo7496l(th2);
                return;
            } catch (Throwable th3) {
                mo7468K(new C0081d("Exception in completion handler " + interfaceC3589o0 + " for " + this, th3));
                return;
            }
        }
        C3548a1 c3548a1Mo7477d = interfaceC3589o0.mo7477d();
        if (c3548a1Mo7477d != null) {
            c3548a1Mo7477d.m8999e(new C4559h(1), 1);
            Object obj2 = C4560i.f15037g.get(c3548a1Mo7477d);
            obj2.getClass();
            for (C4560i c4560iM9002h = (C4560i) obj2; !c4560iM9002h.equals(c3548a1Mo7477d); c4560iM9002h = c4560iM9002h.m9002h()) {
                if (c4560iM9002h instanceof AbstractC3602u0) {
                    try {
                        ((AbstractC3602u0) c4560iM9002h).mo7496l(th2);
                    } catch (Throwable th4) {
                        if (c0081d != null) {
                            AbstractC0063p.m412e(c0081d, th4);
                        } else {
                            c0081d = new C0081d("Exception in completion handler " + c4560iM9002h + " for " + this, th4);
                        }
                    }
                }
            }
            if (c0081d != null) {
                mo7468K(c0081d);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Throwable m7580D(Object obj) {
        Throwable thM7574c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C3610y0 c3610y0 = (C3610y0) obj;
        Object obj2 = f11641g.get(c3610y0);
        if (obj2 instanceof C3608x0) {
            thM7574c = ((C3608x0) obj2).m7574c();
        } else if (obj2 instanceof C3585n) {
            thM7574c = ((C3585n) obj2).f11599a;
        } else {
            if (obj2 instanceof InterfaceC3589o0) {
                C3193a.m6826p(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM7574c = null;
        }
        CancellationException cancellationException = thM7574c instanceof CancellationException ? (CancellationException) thM7574c : null;
        return cancellationException == null ? new C3598s0("Parent job is ".concat(m7578X(obj2)), thM7574c, c3610y0) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final Object m7581E(C3608x0 c3608x0, Object obj) {
        Throwable thM7582F;
        C3585n c3585n = obj instanceof C3585n ? (C3585n) obj : null;
        Throwable th2 = c3585n != null ? c3585n.f11599a : null;
        synchronized (c3608x0) {
            c3608x0.m7575e();
            ArrayList<Throwable> arrayListM7576f = c3608x0.m7576f(th2);
            thM7582F = m7582F(c3608x0, arrayListM7576f);
            if (thM7582F != null && arrayListM7576f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM7576f.size()));
                for (Throwable th3 : arrayListM7576f) {
                    if (th3 != thM7582F && th3 != thM7582F && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        AbstractC0063p.m412e(thM7582F, th3);
                    }
                }
            }
        }
        if (thM7582F != null && thM7582F != th2) {
            obj = new C3585n(thM7582F, false);
        }
        if (thM7582F != null && (m7597y(thM7582F) || mo7497J(thM7582F))) {
            obj.getClass();
            C3585n.f11598b.compareAndSet((C3585n) obj, 0, 1);
        }
        mo7469S(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11641g;
        Object c3592p0 = obj instanceof InterfaceC3589o0 ? new C3592p0((InterfaceC3589o0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c3608x0, c3592p0) && atomicReferenceFieldUpdater.get(this) == c3608x0) {
        }
        m7579C(c3608x0, obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Throwable m7582F(C3608x0 c3608x0, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c3608x0.m7575e()) {
                return new C3598s0(mo7473z(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof C3572i1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof C3572i1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public boolean mo7544G() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public boolean mo7545H() {
        return this instanceof C3579l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final C3548a1 m7583I(InterfaceC3589o0 interfaceC3589o0) {
        C3548a1 c3548a1Mo7477d = interfaceC3589o0.mo7477d();
        if (c3548a1Mo7477d != null) {
            return c3548a1Mo7477d;
        }
        if (interfaceC3589o0 instanceof C3562f0) {
            return new C3548a1();
        }
        if (interfaceC3589o0 instanceof AbstractC3602u0) {
            m7591V((AbstractC3602u0) interfaceC3589o0);
            return null;
        }
        C3193a.m6826p(interfaceC3589o0, "State should have list: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public boolean mo7497J(Throwable th2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m7584L(InterfaceC3596r0 interfaceC3596r0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11642h;
        C3554c1 c3554c1 = C3554c1.f11556g;
        if (interfaceC3596r0 == null) {
            atomicReferenceFieldUpdater.set(this, c3554c1);
            return;
        }
        interfaceC3596r0.start();
        InterfaceC3573j interfaceC3573jMo7490l = interfaceC3596r0.mo7490l(this);
        atomicReferenceFieldUpdater.set(this, interfaceC3573jMo7490l);
        if (f11641g.get(this) instanceof InterfaceC3589o0) {
            return;
        }
        interfaceC3573jMo7490l.mo7492a();
        atomicReferenceFieldUpdater.set(this, c3554c1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final InterfaceC3556d0 m7585M(boolean z9, AbstractC3602u0 abstractC3602u0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3554c1 c3554c1;
        boolean z10;
        boolean zM8999e;
        abstractC3602u0.f11618j = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f11641g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof C3562f0;
            c3554c1 = C3554c1.f11556g;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof InterfaceC3589o0)) {
                    z10 = false;
                    break;
                }
                InterfaceC3589o0 interfaceC3589o0 = (InterfaceC3589o0) obj;
                C3548a1 c3548a1Mo7477d = interfaceC3589o0.mo7477d();
                if (c3548a1Mo7477d == null) {
                    m7591V((AbstractC3602u0) obj);
                } else {
                    if (abstractC3602u0.mo7495k()) {
                        C3608x0 c3608x0 = interfaceC3589o0 instanceof C3608x0 ? (C3608x0) interfaceC3589o0 : null;
                        Throwable thM7574c = c3608x0 != null ? c3608x0.m7574c() : null;
                        if (thM7574c == null) {
                            zM8999e = c3548a1Mo7477d.m8999e(abstractC3602u0, 5);
                        } else if (z9) {
                            abstractC3602u0.mo7496l(thM7574c);
                            return c3554c1;
                        }
                    } else {
                        zM8999e = c3548a1Mo7477d.m8999e(abstractC3602u0, 1);
                    }
                    if (zM8999e) {
                        break;
                    }
                }
            } else {
                C3562f0 c3562f0 = (C3562f0) obj;
                if (c3562f0.f11562g) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC3602u0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m7590U(c3562f0);
            }
        }
        if (z10) {
            return abstractC3602u0;
        }
        if (z9) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C3585n c3585n = obj2 instanceof C3585n ? (C3585n) obj2 : null;
            abstractC3602u0.mo7496l(c3585n != null ? c3585n.f11599a : null);
        }
        return c3554c1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public boolean mo7586N() {
        return this instanceof C3552c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final Object m7587O(Object obj) {
        Object objM7593Y;
        do {
            objM7593Y = m7593Y(f11641g.get(this), obj);
            if (objM7593Y == AbstractC3603v.f11622d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C3585n c3585n = obj instanceof C3585n ? (C3585n) obj : null;
                throw new IllegalStateException(str, c3585n != null ? c3585n.f11599a : null);
            }
        } while (objM7593Y == AbstractC3603v.f11624f);
        return objM7593Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public String mo7530P() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m7588R(C3548a1 c3548a1, Throwable th2) {
        c3548a1.m8999e(new C4559h(4), 4);
        Object obj = C4560i.f15037g.get(c3548a1);
        obj.getClass();
        C0081d c0081d = null;
        for (C4560i c4560iM9002h = (C4560i) obj; !c4560iM9002h.equals(c3548a1); c4560iM9002h = c4560iM9002h.m9002h()) {
            if ((c4560iM9002h instanceof AbstractC3602u0) && ((AbstractC3602u0) c4560iM9002h).mo7495k()) {
                try {
                    ((AbstractC3602u0) c4560iM9002h).mo7496l(th2);
                } catch (Throwable th3) {
                    if (c0081d != null) {
                        AbstractC0063p.m412e(c0081d, th3);
                    } else {
                        c0081d = new C0081d("Exception in completion handler " + c4560iM9002h + " for " + this, th3);
                    }
                }
            }
        }
        if (c0081d != null) {
            mo7468K(c0081d);
        }
        m7597y(th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m7590U(C3562f0 c3562f0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3548a1 c3548a1 = new C3548a1();
        Object c3586n0 = c3548a1;
        if (!c3562f0.f11562g) {
            c3586n0 = new C3586n0(c3548a1);
        }
        do {
            atomicReferenceFieldUpdater = f11641g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c3562f0, c3586n0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c3562f0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m7591V(AbstractC3602u0 abstractC3602u0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3548a1 c3548a1 = new C3548a1();
        abstractC3602u0.getClass();
        C4560i.f15038h.set(c3548a1, abstractC3602u0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C4560i.f15037g;
        atomicReferenceFieldUpdater2.set(c3548a1, abstractC3602u0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC3602u0) == abstractC3602u0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC3602u0, abstractC3602u0, c3548a1)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC3602u0) != abstractC3602u0) {
                        break;
                    }
                }
                c3548a1.m9001g(abstractC3602u0);
                break loop0;
            }
            break;
        }
        C4560i c4560iM9002h = abstractC3602u0.m9002h();
        do {
            atomicReferenceFieldUpdater = f11641g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3602u0, c4560iM9002h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC3602u0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final int m7592W(Object obj) {
        boolean z9 = obj instanceof C3562f0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11641g;
        if (z9) {
            if (((C3562f0) obj).f11562g) {
                return 0;
            }
            C3562f0 c3562f0 = AbstractC3603v.f11628j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3562f0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo7589T();
            return 1;
        }
        if (!(obj instanceof C3586n0)) {
            return 0;
        }
        C3548a1 c3548a1 = ((C3586n0) obj).f11600g;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3548a1)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo7589T();
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final Object m7593Y(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC3589o0)) {
            return AbstractC3603v.f11622d;
        }
        if (((obj instanceof C3562f0) || (obj instanceof AbstractC3602u0)) && !(obj instanceof C3576k) && !(obj2 instanceof C3585n)) {
            InterfaceC3589o0 interfaceC3589o0 = (InterfaceC3589o0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11641g;
            Object c3592p0 = obj2 instanceof InterfaceC3589o0 ? new C3592p0((InterfaceC3589o0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3589o0, c3592p0)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC3589o0) {
                    return AbstractC3603v.f11624f;
                }
            }
            mo7469S(obj2);
            m7579C(interfaceC3589o0, obj2);
            return obj2;
        }
        InterfaceC3589o0 interfaceC3589o02 = (InterfaceC3589o0) obj;
        C3548a1 c3548a1M7583I = m7583I(interfaceC3589o02);
        if (c3548a1M7583I == null) {
            return AbstractC3603v.f11624f;
        }
        C3608x0 c3608x0 = interfaceC3589o02 instanceof C3608x0 ? (C3608x0) interfaceC3589o02 : null;
        if (c3608x0 == null) {
            c3608x0 = new C3608x0(c3548a1M7583I, null);
        }
        synchronized (c3608x0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3608x0.f11637h;
            if (atomicIntegerFieldUpdater.get(c3608x0) != 0) {
                return AbstractC3603v.f11622d;
            }
            atomicIntegerFieldUpdater.set(c3608x0, 1);
            if (c3608x0 != interfaceC3589o02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11641g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC3589o02, c3608x0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC3589o02) {
                        return AbstractC3603v.f11624f;
                    }
                }
            }
            boolean zM7575e = c3608x0.m7575e();
            C3585n c3585n = obj2 instanceof C3585n ? (C3585n) obj2 : null;
            if (c3585n != null) {
                c3608x0.m7573a(c3585n.f11599a);
            }
            Throwable thM7574c = zM7575e ? null : c3608x0.m7574c();
            if (thM7574c != null) {
                m7588R(c3548a1M7583I, thM7574c);
            }
            C3576k c3576kM7577Q = m7577Q(c3548a1M7583I);
            if (c3576kM7577Q != null && m7594Z(c3608x0, c3576kM7577Q, obj2)) {
                return AbstractC3603v.f11623e;
            }
            c3548a1M7583I.m8999e(new C4559h(2), 2);
            C3576k c3576kM7577Q2 = m7577Q(c3548a1M7583I);
            return (c3576kM7577Q2 == null || !m7594Z(c3608x0, c3576kM7577Q2, obj2)) ? m7581E(c3608x0, obj2) : AbstractC3603v.f11623e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final boolean m7594Z(C3608x0 c3608x0, C3576k c3576k, Object obj) {
        while (AbstractC3603v.m7560n(c3576k.f11583k, false, new C3606w0(this, c3608x0, c3576k, obj)) == C3554c1.f11556g) {
            c3576k = m7577Q(c3576k);
            if (c3576k == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: a */
    public void mo7485a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C3598s0(mo7473z(), null, this);
        }
        mo7596x(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: b */
    public boolean mo7486b() {
        Object obj = f11641g.get(this);
        return (obj instanceof InterfaceC3589o0) && ((InterfaceC3589o0) obj).mo7476b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: c */
    public final InterfaceC3556d0 mo7487c(boolean z9, boolean z10, C3364p c3364p) {
        return m7585M(z10, z9 ? new C3594q0(c3364p) : new C3559e0(c3364p, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: g */
    public final Object mo7488g(AbstractC6038c abstractC6038c) {
        Object obj;
        C3967n c3967n;
        do {
            obj = f11641g.get(this);
            boolean z9 = obj instanceof InterfaceC3589o0;
            c3967n = C3967n.f12976a;
            if (!z9) {
                AbstractC3603v.m7553g(abstractC6038c.getContext());
                return c3967n;
            }
        } while (m7592W(obj) < 0);
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(abstractC6038c));
        c3564g.m7513p();
        int i9 = 1;
        c3564g.m7516s(new C3558e(AbstractC3603v.m7560n(this, true, new C3570i(c3564g, i9)), i9));
        Object objM7512o = c3564g.m7512o();
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (objM7512o != enumC5799a) {
            objM7512o = c3967n;
        }
        return objM7512o == enumC5799a ? objM7512o : c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5559e
    public final InterfaceC5560f getKey() {
        return C3593q.f11607h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: h */
    public final CancellationException mo7489h() {
        CancellationException cancellationException;
        Object obj = f11641g.get(this);
        if (obj instanceof C3608x0) {
            Throwable thM7574c = ((C3608x0) obj).m7574c();
            if (thM7574c == null) {
                C3193a.m6826p(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM7574c instanceof CancellationException ? (CancellationException) thM7574c : null;
            return cancellationException == null ? new C3598s0(strConcat, thM7574c, this) : cancellationException;
        }
        if (obj instanceof InterfaceC3589o0) {
            C3193a.m6826p(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof C3585n)) {
            return new C3598s0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th2 = ((C3585n) obj).f11599a;
        cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new C3598s0(mo7473z(), th2, this) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: l */
    public final InterfaceC3573j mo7490l(C3610y0 c3610y0) {
        C3576k c3576k = new C3576k(c3610y0);
        c3576k.f11618j = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11641g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3562f0) {
                C3562f0 c3562f0 = (C3562f0) obj;
                if (c3562f0.f11562g) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3576k)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m7590U(c3562f0);
            } else {
                boolean z9 = obj instanceof InterfaceC3589o0;
                C3554c1 c3554c1 = C3554c1.f11556g;
                if (!z9) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C3585n c3585n = obj2 instanceof C3585n ? (C3585n) obj2 : null;
                    c3576k.mo7496l(c3585n != null ? c3585n.f11599a : null);
                    return c3554c1;
                }
                C3548a1 c3548a1Mo7477d = ((InterfaceC3589o0) obj).mo7477d();
                if (c3548a1Mo7477d == null) {
                    m7591V((AbstractC3602u0) obj);
                } else if (!c3548a1Mo7477d.m8999e(c3576k, 7)) {
                    boolean zM8999e = c3548a1Mo7477d.m8999e(c3576k, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C3608x0) {
                        thM7574c = ((C3608x0) obj3).m7574c();
                    } else {
                        C3585n c3585n2 = obj3 instanceof C3585n ? (C3585n) obj3 : null;
                        if (c3585n2 != null) {
                            thM7574c = c3585n2.f11599a;
                        }
                    }
                    c3576k.mo7496l(thM7574c);
                    if (zM8999e) {
                        break loop0;
                    }
                    return c3554c1;
                }
            }
        }
        return c3576k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: o */
    public final InterfaceC3556d0 mo7491o(InterfaceC1231l interfaceC1231l) {
        return m7585M(true, new C3559e0(interfaceC1231l, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3596r0
    public final boolean start() {
        int iM7592W;
        do {
            iM7592W = m7592W(f11641g.get(this));
            if (iM7592W == 0) {
                return false;
            }
        } while (iM7592W != 1);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo7530P() + '{' + m7578X(f11641g.get(this)) + '}');
        sb2.append('@');
        sb2.append(AbstractC3603v.m7556j(this));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void mo7475u(Object obj) {
        mo7474r(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7595v(Object obj) {
        C2463q c2463q;
        Object objM7593Y = AbstractC3603v.f11622d;
        if (mo7545H()) {
            do {
                Object obj2 = f11641g.get(this);
                if (obj2 instanceof InterfaceC3589o0) {
                    if (obj2 instanceof C3608x0) {
                        if (C3608x0.f11637h.get((C3608x0) obj2) != 0) {
                        }
                    }
                    objM7593Y = m7593Y(obj2, new C3585n(m7580D(obj), false));
                }
                objM7593Y = AbstractC3603v.f11622d;
                break;
            } while (objM7593Y == AbstractC3603v.f11624f);
            if (objM7593Y != AbstractC3603v.f11623e) {
                if (objM7593Y == AbstractC3603v.f11622d) {
                    Throwable thM7580D = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11641g;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof C3608x0)) {
                            if (!(obj3 instanceof InterfaceC3589o0)) {
                                c2463q = AbstractC3603v.f11625g;
                                break;
                            }
                            if (thM7580D == null) {
                                thM7580D = m7580D(obj);
                            }
                            InterfaceC3589o0 interfaceC3589o0 = (InterfaceC3589o0) obj3;
                            if (interfaceC3589o0.mo7476b()) {
                                C3548a1 c3548a1M7583I = m7583I(interfaceC3589o0);
                                if (c3548a1M7583I != null) {
                                    C3608x0 c3608x0 = new C3608x0(c3548a1M7583I, thM7580D);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3589o0, c3608x0)) {
                                        if (atomicReferenceFieldUpdater.get(this) != interfaceC3589o0) {
                                            break;
                                        }
                                    }
                                    m7588R(c3548a1M7583I, thM7580D);
                                    c2463q = AbstractC3603v.f11622d;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objM7593Y2 = m7593Y(obj3, new C3585n(thM7580D, false));
                                if (objM7593Y2 == AbstractC3603v.f11622d) {
                                    C3193a.m6826p(obj3, "Cannot happen in ");
                                    return false;
                                }
                                if (objM7593Y2 != AbstractC3603v.f11624f) {
                                    objM7593Y = objM7593Y2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (C3608x0.f11639j.get((C3608x0) obj3) == AbstractC3603v.f11626h) {
                                    c2463q = AbstractC3603v.f11625g;
                                } else {
                                    boolean zM7575e = ((C3608x0) obj3).m7575e();
                                    if (thM7580D == null) {
                                        thM7580D = m7580D(obj);
                                    }
                                    ((C3608x0) obj3).m7573a(thM7580D);
                                    Throwable thM7574c = zM7575e ? null : ((C3608x0) obj3).m7574c();
                                    if (thM7574c != null) {
                                        m7588R(((C3608x0) obj3).f11640g, thM7574c);
                                    }
                                    c2463q = AbstractC3603v.f11622d;
                                }
                            }
                        }
                    }
                }
                if (objM7593Y != AbstractC3603v.f11622d && objM7593Y != AbstractC3603v.f11623e) {
                    if (objM7593Y == AbstractC3603v.f11625g) {
                        return false;
                    }
                    mo7474r(objM7593Y);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void mo7596x(CancellationException cancellationException) {
        m7595v(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m7597y(Throwable th2) {
        if (mo7586N()) {
            return true;
        }
        boolean z9 = th2 instanceof CancellationException;
        InterfaceC3573j interfaceC3573j = (InterfaceC3573j) f11642h.get(this);
        return (interfaceC3573j == null || interfaceC3573j == C3554c1.f11556g) ? z9 : interfaceC3573j.mo7493c(th2) || z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public String mo7473z() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: T */
    public void mo7589T() {
    }

    /* JADX INFO: renamed from: K */
    public void mo7468K(C0081d c0081d) {
        throw c0081d;
    }

    /* JADX INFO: renamed from: S */
    public void mo7469S(Object obj) {
    }

    /* JADX INFO: renamed from: r */
    public void mo7474r(Object obj) {
    }
}
