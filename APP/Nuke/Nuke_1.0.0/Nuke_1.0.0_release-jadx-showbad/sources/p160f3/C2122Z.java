package p160f3;

import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A.C0009E0;
import p027E4.C0330q;
import p056K2.C0891q;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p128a.AbstractC1785a;
import p179i4.AbstractC2352g;
import p190k3.C2460h;
import p190k3.C2462j;

/* JADX INFO: renamed from: f3.Z */
/* JADX INFO: loaded from: classes.dex */
public class C2122Z implements InterfaceC2115S, InterfaceC2134f0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7062d = AtomicReferenceFieldUpdater.newUpdater(C2122Z.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7063e = AtomicReferenceFieldUpdater.newUpdater(C2122Z.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2122Z(boolean z5) {
        this._state$volatile = z5 ? AbstractC2162v.f7119j : AbstractC2162v.f7118i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0014 */
    /* JADX INFO: renamed from: T */
    public static C2143k m3920T(C2462j c2462j) {
        while (c2462j.mo3950i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2462j.f7943e;
            C2462j c2462jM4391f = c2462j.m4391f();
            if (c2462jM4391f == null) {
                Object obj = atomicReferenceFieldUpdater.get(c2462j);
                while (true) {
                    c2462j = (C2462j) obj;
                    if (!c2462j.mo3950i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2462j);
                }
            } else {
                c2462j = c2462jM4391f;
            }
        }
        while (true) {
            c2462j = c2462j.m4393h();
            if (!c2462j.mo3950i()) {
                if (c2462j instanceof C2143k) {
                    return (C2143k) c2462j;
                }
                if (c2462j instanceof C2126b0) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m3921a0(Object obj) {
        if (!(obj instanceof C2121Y)) {
            return obj instanceof InterfaceC2112O ? ((InterfaceC2112O) obj).mo3886b() ? "Active" : "New" : obj instanceof C2149n ? "Cancelled" : "Completed";
        }
        C2121Y c2121y = (C2121Y) obj;
        return c2121y.m3918e() ? "Cancelling" : C2121Y.f7058e.get(c2121y) != 0 ? "Completing" : "Active";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m3922B(Throwable th) {
        if (mo3934Q()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC2141j interfaceC2141j = (InterfaceC2141j) f7063e.get(this);
        return (interfaceC2141j == null || interfaceC2141j == C2130d0.f7071d) ? z5 : interfaceC2141j.mo3951c(th) || z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public String mo3923D() {
        return "Job was cancelled";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public boolean mo3924E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m3945y(th) && mo3911J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m3925F(InterfaceC2112O interfaceC2112O, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7063e;
        InterfaceC2141j interfaceC2141j = (InterfaceC2141j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2141j != null) {
            interfaceC2141j.mo3883a();
            atomicReferenceFieldUpdater.set(this, C2130d0.f7071d);
        }
        C0330q c0330q = null;
        C2149n c2149n = obj instanceof C2149n ? (C2149n) obj : null;
        Throwable th = c2149n != null ? c2149n.f7092a : null;
        if (interfaceC2112O instanceof AbstractC2118V) {
            try {
                ((AbstractC2118V) interfaceC2112O).mo3885l(th);
                return;
            } catch (Throwable th2) {
                mo3931N(new C0330q("Exception in completion handler " + interfaceC2112O + " for " + this, th2));
                return;
            }
        }
        C2126b0 c2126b0Mo3887d = interfaceC2112O.mo3887d();
        if (c2126b0Mo3887d != null) {
            c2126b0Mo3887d.m4390e(new C2460h(1), 1);
            Object obj2 = C2462j.f7942d.get(c2126b0Mo3887d);
            AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C2462j c2462jM4393h = (C2462j) obj2; !c2462jM4393h.equals(c2126b0Mo3887d); c2462jM4393h = c2462jM4393h.m4393h()) {
                if (c2462jM4393h instanceof AbstractC2118V) {
                    try {
                        ((AbstractC2118V) c2462jM4393h).mo3885l(th);
                    } catch (Throwable th3) {
                        if (c0330q != null) {
                            AbstractC2352g.m4193f(c0330q, th3);
                        } else {
                            c0330q = new C0330q("Exception in completion handler " + c2462jM4393h + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0330q != null) {
                mo3931N(c0330q);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final Throwable m3926G(Object obj) {
        Throwable thM3917c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C2122Z c2122z = (C2122Z) ((InterfaceC2134f0) obj);
        Object obj2 = f7062d.get(c2122z);
        if (obj2 instanceof C2121Y) {
            thM3917c = ((C2121Y) obj2).m3917c();
        } else if (obj2 instanceof C2149n) {
            thM3917c = ((C2149n) obj2).f7092a;
        } else {
            if (obj2 instanceof InterfaceC2112O) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM3917c = null;
        }
        CancellationException cancellationException = thM3917c instanceof CancellationException ? (CancellationException) thM3917c : null;
        return cancellationException == null ? new C2116T("Parent job is ".concat(m3921a0(obj2)), thM3917c, c2122z) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final Object m3927H(C2121Y c2121y, Object obj) {
        Throwable thM3928I;
        C2149n c2149n = obj instanceof C2149n ? (C2149n) obj : null;
        Throwable th = c2149n != null ? c2149n.f7092a : null;
        synchronized (c2121y) {
            c2121y.m3918e();
            ArrayList<Throwable> arrayListM3919f = c2121y.m3919f(th);
            thM3928I = m3928I(c2121y, arrayListM3919f);
            if (thM3928I != null && arrayListM3919f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM3919f.size()));
                for (Throwable th2 : arrayListM3919f) {
                    if (th2 != thM3928I && th2 != thM3928I && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC2352g.m4193f(thM3928I, th2);
                    }
                }
            }
        }
        if (thM3928I != null && thM3928I != th) {
            obj = new C2149n(thM3928I, false);
        }
        if (thM3928I != null && (m3922B(thM3928I) || mo3930M(thM3928I))) {
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C2149n.f7091b.compareAndSet((C2149n) obj, 0, 1);
        }
        mo3938V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7062d;
        Object c2113p = obj instanceof InterfaceC2112O ? new C2113P((InterfaceC2112O) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2121y, c2113p) && atomicReferenceFieldUpdater.get(this) == c2121y) {
        }
        m3925F(c2121y, obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final Throwable m3928I(C2121Y c2121y, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c2121y.m3918e()) {
                return new C2116T(mo3923D(), null, this);
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
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C2146l0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C2146l0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public boolean mo3911J() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public boolean mo3912K() {
        return this instanceof C2145l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final C2126b0 m3929L(InterfaceC2112O interfaceC2112O) {
        C2126b0 c2126b0Mo3887d = interfaceC2112O.mo3887d();
        if (c2126b0Mo3887d != null) {
            return c2126b0Mo3887d;
        }
        if (interfaceC2112O instanceof C2103F) {
            return new C2126b0();
        }
        if (interfaceC2112O instanceof AbstractC2118V) {
            m3941Y((AbstractC2118V) interfaceC2112O);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2112O).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public boolean mo3930M(Throwable th) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m3932O(InterfaceC2115S interfaceC2115S) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7063e;
        C2130d0 c2130d0 = C2130d0.f7071d;
        if (interfaceC2115S == null) {
            atomicReferenceFieldUpdater.set(this, c2130d0);
            return;
        }
        interfaceC2115S.start();
        InterfaceC2141j interfaceC2141jMo3910x = interfaceC2115S.mo3910x(this);
        atomicReferenceFieldUpdater.set(this, interfaceC2141jMo3910x);
        if (f7062d.get(this) instanceof InterfaceC2112O) {
            return;
        }
        interfaceC2141jMo3910x.mo3883a();
        atomicReferenceFieldUpdater.set(this, c2130d0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final InterfaceC2101D m3933P(boolean z5, AbstractC2118V abstractC2118V) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2130d0 c2130d0;
        boolean z6;
        boolean zM4390e;
        abstractC2118V.f7052g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7062d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj instanceof C2103F;
            c2130d0 = C2130d0.f7071d;
            z6 = true;
            if (!z7) {
                if (!(obj instanceof InterfaceC2112O)) {
                    z6 = false;
                    break;
                }
                InterfaceC2112O interfaceC2112O = (InterfaceC2112O) obj;
                C2126b0 c2126b0Mo3887d = interfaceC2112O.mo3887d();
                if (c2126b0Mo3887d == null) {
                    m3941Y((AbstractC2118V) obj);
                } else {
                    if (abstractC2118V.mo3884k()) {
                        C2121Y c2121y = interfaceC2112O instanceof C2121Y ? (C2121Y) interfaceC2112O : null;
                        Throwable thM3917c = c2121y != null ? c2121y.m3917c() : null;
                        if (thM3917c == null) {
                            zM4390e = c2126b0Mo3887d.m4390e(abstractC2118V, 5);
                        } else if (z5) {
                            abstractC2118V.mo3885l(thM3917c);
                            return c2130d0;
                        }
                    } else {
                        zM4390e = c2126b0Mo3887d.m4390e(abstractC2118V, 1);
                    }
                    if (zM4390e) {
                        break;
                    }
                }
            } else {
                C2103F c2103f = (C2103F) obj;
                if (c2103f.f7032d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC2118V)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m3940X(c2103f);
            }
        }
        if (z6) {
            return abstractC2118V;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2149n c2149n = obj2 instanceof C2149n ? (C2149n) obj2 : null;
            abstractC2118V.mo3885l(c2149n != null ? c2149n.f7092a : null);
        }
        return c2130d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public boolean mo3934Q() {
        return this instanceof C2127c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final Object m3935R(Object obj) {
        Object objM3943b0;
        do {
            objM3943b0 = m3943b0(f7062d.get(this), obj);
            if (objM3943b0 == AbstractC2162v.f7113d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C2149n c2149n = obj instanceof C2149n ? (C2149n) obj : null;
                throw new IllegalStateException(str, c2149n != null ? c2149n.f7092a : null);
            }
        } while (objM3943b0 == AbstractC2162v.f7115f);
        return objM3943b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public String mo3936S() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m3937U(C2126b0 c2126b0, Throwable th) {
        c2126b0.m4390e(new C2460h(4), 4);
        Object obj = C2462j.f7942d.get(c2126b0);
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C0330q c0330q = null;
        for (C2462j c2462jM4393h = (C2462j) obj; !c2462jM4393h.equals(c2126b0); c2462jM4393h = c2462jM4393h.m4393h()) {
            if ((c2462jM4393h instanceof AbstractC2118V) && ((AbstractC2118V) c2462jM4393h).mo3884k()) {
                try {
                    ((AbstractC2118V) c2462jM4393h).mo3885l(th);
                } catch (Throwable th2) {
                    if (c0330q != null) {
                        AbstractC2352g.m4193f(c0330q, th2);
                    } else {
                        c0330q = new C0330q("Exception in completion handler " + c2462jM4393h + " for " + this, th2);
                    }
                }
            }
        }
        if (c0330q != null) {
            mo3931N(c0330q);
        }
        m3922B(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final void m3940X(C2103F c2103f) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2126b0 c2126b0 = new C2126b0();
        Object c2111n = c2126b0;
        if (!c2103f.f7032d) {
            c2111n = new C2111N(c2126b0);
        }
        do {
            atomicReferenceFieldUpdater = f7062d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c2103f, c2111n)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c2103f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m3941Y(AbstractC2118V abstractC2118V) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2126b0 c2126b0 = new C2126b0();
        abstractC2118V.getClass();
        C2462j.f7943e.set(c2126b0, abstractC2118V);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2462j.f7942d;
        atomicReferenceFieldUpdater2.set(c2126b0, abstractC2118V);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC2118V) == abstractC2118V) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC2118V, abstractC2118V, c2126b0)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC2118V) != abstractC2118V) {
                        break;
                    }
                }
                c2126b0.m4392g(abstractC2118V);
                break loop0;
            }
            break;
        }
        C2462j c2462jM4393h = abstractC2118V.m4393h();
        do {
            atomicReferenceFieldUpdater = f7062d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2118V, c2462jM4393h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC2118V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final int m3942Z(Object obj) {
        boolean z5 = obj instanceof C2103F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7062d;
        if (z5) {
            if (((C2103F) obj).f7032d) {
                return 0;
            }
            C2103F c2103f = AbstractC2162v.f7119j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2103f)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo3939W();
            return 1;
        }
        if (!(obj instanceof C2111N)) {
            return 0;
        }
        C2126b0 c2126b0 = ((C2111N) obj).f7046d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2126b0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo3939W();
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: b */
    public boolean mo3904b() {
        Object obj = f7062d.get(this);
        return (obj instanceof InterfaceC2112O) && ((InterfaceC2112O) obj).mo3886b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final Object m3943b0(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC2112O)) {
            return AbstractC2162v.f7113d;
        }
        if (((obj instanceof C2103F) || (obj instanceof AbstractC2118V)) && !(obj instanceof C2143k) && !(obj2 instanceof C2149n)) {
            InterfaceC2112O interfaceC2112O = (InterfaceC2112O) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7062d;
            Object c2113p = obj2 instanceof InterfaceC2112O ? new C2113P((InterfaceC2112O) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2112O, c2113p)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC2112O) {
                    return AbstractC2162v.f7115f;
                }
            }
            mo3938V(obj2);
            m3925F(interfaceC2112O, obj2);
            return obj2;
        }
        InterfaceC2112O interfaceC2112O2 = (InterfaceC2112O) obj;
        C2126b0 c2126b0M3929L = m3929L(interfaceC2112O2);
        if (c2126b0M3929L == null) {
            return AbstractC2162v.f7115f;
        }
        C2121Y c2121y = interfaceC2112O2 instanceof C2121Y ? (C2121Y) interfaceC2112O2 : null;
        if (c2121y == null) {
            c2121y = new C2121Y(c2126b0M3929L, null);
        }
        synchronized (c2121y) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2121Y.f7058e;
            if (atomicIntegerFieldUpdater.get(c2121y) != 0) {
                return AbstractC2162v.f7113d;
            }
            atomicIntegerFieldUpdater.set(c2121y, 1);
            if (c2121y != interfaceC2112O2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7062d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC2112O2, c2121y)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC2112O2) {
                        return AbstractC2162v.f7115f;
                    }
                }
            }
            boolean zM3918e = c2121y.m3918e();
            C2149n c2149n = obj2 instanceof C2149n ? (C2149n) obj2 : null;
            if (c2149n != null) {
                c2121y.m3916a(c2149n.f7092a);
            }
            Throwable thM3917c = zM3918e ? null : c2121y.m3917c();
            if (thM3917c != null) {
                m3937U(c2126b0M3929L, thM3917c);
            }
            C2143k c2143kM3920T = m3920T(c2126b0M3929L);
            if (c2143kM3920T != null && m3944c0(c2121y, c2143kM3920T, obj2)) {
                return AbstractC2162v.f7114e;
            }
            c2126b0M3929L.m4390e(new C2460h(2), 2);
            C2143k c2143kM3920T2 = m3920T(c2126b0M3929L);
            return (c2143kM3920T2 == null || !m3944c0(c2121y, c2143kM3920T2, obj2)) ? m3927H(c2121y, obj2) : AbstractC2162v.f7114e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: c */
    public void mo3905c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2116T(mo3923D(), null, this);
        }
        mo3946z(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final boolean m3944c0(C2121Y c2121y, C2143k c2143k, Object obj) {
        while (AbstractC2162v.m3991m(c2143k.f7082h, false, new C2120X(this, c2121y, c2143k, obj)) == C2130d0.f7071d) {
            c2143k = m3920T(c2143k);
            if (c2143k == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1049g
    public final InterfaceC1050h getKey() {
        return C2155q.f7102e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: l */
    public final InterfaceC2101D mo3906l(boolean z5, boolean z6, C0009E0 c0009e0) {
        return m3933P(z6, z5 ? new C2114Q(c0009e0) : new C2102E(1, c0009e0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: n */
    public final CancellationException mo3907n() {
        CancellationException cancellationException;
        Object obj = f7062d.get(this);
        if (!(obj instanceof C2121Y)) {
            if (obj instanceof InterfaceC2112O) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C2149n)) {
                return new C2116T(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C2149n) obj).f7092a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C2116T(mo3923D(), th, this) : cancellationException;
        }
        Throwable thM3917c = ((C2121Y) obj).m3917c();
        if (thM3917c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM3917c instanceof CancellationException ? (CancellationException) thM3917c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo3923D();
        }
        return new C2116T(strConcat, thM3917c, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    public final boolean start() {
        int iM3942Z;
        do {
            iM3942Z = m3942Z(f7062d.get(this));
            if (iM3942Z == 0) {
                return false;
            }
        } while (iM3942Z != 1);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: t */
    public final Object mo3908t(AbstractC1178c abstractC1178c) {
        Object obj;
        C0891q c0891q;
        do {
            obj = f7062d.get(this);
            boolean z5 = obj instanceof InterfaceC2112O;
            c0891q = C0891q.f2780a;
            if (!z5) {
                AbstractC2162v.m3984f(abstractC1178c.mo275e());
                return c0891q;
            }
        } while (m3942Z(obj) < 0);
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(abstractC1178c));
        c2135g.m3968t();
        int i5 = 1;
        c2135g.m3971x(new C2131e(i5, AbstractC2162v.m3991m(this, true, new C2139i(c2135g, i5))));
        Object objM3967r = c2135g.m3967r();
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (objM3967r != enumC1152a) {
            objM3967r = c0891q;
        }
        return objM3967r == enumC1152a ? objM3967r : c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo3936S() + '{' + m3921a0(f7062d.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC2162v.m3987i(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void mo3876u(Object obj) {
        mo3875q(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: w */
    public final InterfaceC2101D mo3909w(InterfaceC1601c interfaceC1601c) {
        return m3933P(true, new C2102E(1, interfaceC1601c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: x */
    public final InterfaceC2141j mo3910x(C2122Z c2122z) {
        C2143k c2143k = new C2143k(c2122z);
        c2143k.f7052g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7062d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C2103F) {
                C2103F c2103f = (C2103F) obj;
                if (c2103f.f7032d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2143k)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m3940X(c2103f);
            } else {
                boolean z5 = obj instanceof InterfaceC2112O;
                C2130d0 c2130d0 = C2130d0.f7071d;
                if (!z5) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C2149n c2149n = obj2 instanceof C2149n ? (C2149n) obj2 : null;
                    c2143k.mo3885l(c2149n != null ? c2149n.f7092a : null);
                    return c2130d0;
                }
                C2126b0 c2126b0Mo3887d = ((InterfaceC2112O) obj).mo3887d();
                if (c2126b0Mo3887d == null) {
                    m3941Y((AbstractC2118V) obj);
                } else if (!c2126b0Mo3887d.m4390e(c2143k, 7)) {
                    boolean zM4390e = c2126b0Mo3887d.m4390e(c2143k, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C2121Y) {
                        thM3917c = ((C2121Y) obj3).m3917c();
                    } else {
                        C2149n c2149n2 = obj3 instanceof C2149n ? (C2149n) obj3 : null;
                        if (c2149n2 != null) {
                            thM3917c = c2149n2.f7092a;
                        }
                    }
                    c2143k.mo3885l(thM3917c);
                    if (zM4390e) {
                        break loop0;
                    }
                    return c2130d0;
                }
            }
        }
        return c2143k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3945y(Object obj) {
        C1753n c1753n;
        Object objM3943b0 = AbstractC2162v.f7113d;
        if (mo3912K()) {
            do {
                Object obj2 = f7062d.get(this);
                if (obj2 instanceof InterfaceC2112O) {
                    if (obj2 instanceof C2121Y) {
                        if (C2121Y.f7058e.get((C2121Y) obj2) != 0) {
                        }
                    }
                    objM3943b0 = m3943b0(obj2, new C2149n(m3926G(obj), false));
                }
                objM3943b0 = AbstractC2162v.f7113d;
                break;
            } while (objM3943b0 == AbstractC2162v.f7115f);
            if (objM3943b0 != AbstractC2162v.f7114e) {
                if (objM3943b0 == AbstractC2162v.f7113d) {
                    Throwable thM3926G = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7062d;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof C2121Y)) {
                            if (!(obj3 instanceof InterfaceC2112O)) {
                                c1753n = AbstractC2162v.f7116g;
                                break;
                            }
                            if (thM3926G == null) {
                                thM3926G = m3926G(obj);
                            }
                            InterfaceC2112O interfaceC2112O = (InterfaceC2112O) obj3;
                            if (interfaceC2112O.mo3886b()) {
                                C2126b0 c2126b0M3929L = m3929L(interfaceC2112O);
                                if (c2126b0M3929L != null) {
                                    C2121Y c2121y = new C2121Y(c2126b0M3929L, thM3926G);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2112O, c2121y)) {
                                        if (atomicReferenceFieldUpdater.get(this) != interfaceC2112O) {
                                            break;
                                        }
                                    }
                                    m3937U(c2126b0M3929L, thM3926G);
                                    c1753n = AbstractC2162v.f7113d;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objM3943b02 = m3943b0(obj3, new C2149n(thM3926G, false));
                                if (objM3943b02 == AbstractC2162v.f7113d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                                }
                                if (objM3943b02 != AbstractC2162v.f7115f) {
                                    objM3943b0 = objM3943b02;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (C2121Y.f7060g.get((C2121Y) obj3) == AbstractC2162v.f7117h) {
                                    c1753n = AbstractC2162v.f7116g;
                                } else {
                                    boolean zM3918e = ((C2121Y) obj3).m3918e();
                                    if (thM3926G == null) {
                                        thM3926G = m3926G(obj);
                                    }
                                    ((C2121Y) obj3).m3916a(thM3926G);
                                    Throwable thM3917c = zM3918e ? null : ((C2121Y) obj3).m3917c();
                                    if (thM3917c != null) {
                                        m3937U(((C2121Y) obj3).f7061d, thM3917c);
                                    }
                                    c1753n = AbstractC2162v.f7113d;
                                }
                            }
                        }
                    }
                }
                if (objM3943b0 != AbstractC2162v.f7113d && objM3943b0 != AbstractC2162v.f7114e) {
                    if (objM3943b0 == AbstractC2162v.f7116g) {
                        return false;
                    }
                    mo3875q(objM3943b0);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void mo3946z(CancellationException cancellationException) {
        m3945y(cancellationException);
    }

    /* JADX INFO: renamed from: W */
    public void mo3939W() {
    }

    /* JADX INFO: renamed from: N */
    public void mo3931N(C0330q c0330q) {
        throw c0330q;
    }

    /* JADX INFO: renamed from: V */
    public void mo3938V(Object obj) {
    }

    /* JADX INFO: renamed from: q */
    public void mo3875q(Object obj) {
    }
}
