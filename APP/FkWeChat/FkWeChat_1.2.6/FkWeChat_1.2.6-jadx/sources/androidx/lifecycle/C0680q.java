package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1043k;
import p100h.AbstractC2799b;
import p100h.C2798a;
import p113hc.AbstractC2983h0;
import p113hc.InterfaceC2995s;
import p154k5.C3972g;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0680q extends AbstractC0668k {

    /* JADX INFO: renamed from: k */
    public static final a f1991k = new a(null);

    /* JADX INFO: renamed from: b */
    public final boolean f1992b;

    /* JADX INFO: renamed from: c */
    public C2798a f1993c;

    /* JADX INFO: renamed from: d */
    public AbstractC0668k.b f1994d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f1995e;

    /* JADX INFO: renamed from: f */
    public int f1996f;

    /* JADX INFO: renamed from: g */
    public boolean f1997g;

    /* JADX INFO: renamed from: h */
    public boolean f1998h;

    /* JADX INFO: renamed from: i */
    public ArrayList f1999i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2995s f2000j;

    /* JADX INFO: renamed from: androidx.lifecycle.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public AbstractC0668k.b f2001a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0672m f2002b;

        public b(InterfaceC0674n interfaceC0674n, AbstractC0668k.b bVar) {
            bVar.getClass();
            interfaceC0674n.getClass();
            this.f2002b = C0684t.m2683f(interfaceC0674n);
            this.f2001a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m2676a(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            aVar.getClass();
            AbstractC0668k.b bVarM2632c = aVar.m2632c();
            this.f2001a = C0680q.f1991k.m2675b(this.f2001a, bVarM2632c);
            InterfaceC0672m interfaceC0672m = this.f2002b;
            interfaceC0676o.getClass();
            interfaceC0672m.mo2593j(interfaceC0676o, aVar);
            this.f2001a = bVarM2632c;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC0668k.b m2677b() {
            return this.f2001a;
        }
    }

    public C0680q(InterfaceC0676o interfaceC0676o, boolean z10) {
        this.f1992b = z10;
        this.f1993c = new C2798a();
        AbstractC0668k.b bVar = AbstractC0668k.b.f1969r;
        this.f1994d = bVar;
        this.f1999i = new ArrayList();
        this.f1995e = new WeakReference(interfaceC0676o);
        this.f2000j = AbstractC2983h0.m11014a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC0668k
    /* JADX INFO: renamed from: a */
    public void mo2628a(InterfaceC0674n interfaceC0674n) {
        InterfaceC0676o interfaceC0676o;
        interfaceC0674n.getClass();
        m2665f("addObserver");
        AbstractC0668k.b bVar = this.f1994d;
        AbstractC0668k.b bVar2 = AbstractC0668k.b.f1968q;
        if (bVar != bVar2) {
            bVar2 = AbstractC0668k.b.f1969r;
        }
        b bVar3 = new b(interfaceC0674n, bVar2);
        if (((b) this.f1993c.m9975p(interfaceC0674n, bVar3)) == null && (interfaceC0676o = (InterfaceC0676o) this.f1995e.get()) != null) {
            boolean z10 = this.f1996f != 0 || this.f1997g;
            AbstractC0668k.b bVarM2664e = m2664e(interfaceC0674n);
            this.f1996f++;
            while (bVar3.m2677b().compareTo(bVarM2664e) < 0 && this.f1993c.contains(interfaceC0674n)) {
                m2671l(bVar3.m2677b());
                AbstractC0668k.a aVarM2634b = AbstractC0668k.a.Companion.m2634b(bVar3.m2677b());
                if (aVarM2634b == null) {
                    C3972g.m15749a("no event up from ", bVar3.m2677b());
                    return;
                } else {
                    bVar3.m2676a(interfaceC0676o, aVarM2634b);
                    m2670k();
                    bVarM2664e = m2664e(interfaceC0674n);
                }
            }
            if (!z10) {
                m2673n();
            }
            this.f1996f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0668k
    /* JADX INFO: renamed from: b */
    public AbstractC0668k.b mo2629b() {
        return this.f1994d;
    }

    @Override // androidx.lifecycle.AbstractC0668k
    /* JADX INFO: renamed from: c */
    public void mo2630c(InterfaceC0674n interfaceC0674n) {
        interfaceC0674n.getClass();
        m2665f("removeObserver");
        this.f1993c.mo9973l(interfaceC0674n);
    }

    /* JADX INFO: renamed from: d */
    public final void m2663d(InterfaceC0676o interfaceC0676o) {
        Iterator itDescendingIterator = this.f1993c.descendingIterator();
        itDescendingIterator.getClass();
        while (itDescendingIterator.hasNext() && !this.f1998h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            entry.getClass();
            InterfaceC0674n interfaceC0674n = (InterfaceC0674n) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m2677b().compareTo(this.f1994d) > 0 && !this.f1998h && this.f1993c.contains(interfaceC0674n)) {
                AbstractC0668k.a aVarM2633a = AbstractC0668k.a.Companion.m2633a(bVar.m2677b());
                if (aVarM2633a == null) {
                    C3972g.m15749a("no event down from ", bVar.m2677b());
                    return;
                } else {
                    m2671l(aVarM2633a.m2632c());
                    bVar.m2676a(interfaceC0676o, aVarM2633a);
                    m2670k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0668k.b m2664e(InterfaceC0674n interfaceC0674n) {
        b bVar;
        Map.Entry entryM9974o = this.f1993c.m9974o(interfaceC0674n);
        AbstractC0668k.b bVar2 = null;
        AbstractC0668k.b bVarM2677b = (entryM9974o == null || (bVar = (b) entryM9974o.getValue()) == null) ? null : bVar.m2677b();
        if (!this.f1999i.isEmpty()) {
            bVar2 = (AbstractC0668k.b) this.f1999i.get(r0.size() - 1);
        }
        a aVar = f1991k;
        return aVar.m2675b(aVar.m2675b(this.f1994d, bVarM2677b), bVar2);
    }

    /* JADX INFO: renamed from: f */
    public final void m2665f(String str) {
        if (!this.f1992b || AbstractC0683s.m2681a()) {
            return;
        }
        C0678p.m2660a("Method ", str, " must be called on the main thread");
    }

    /* JADX INFO: renamed from: g */
    public final void m2666g(InterfaceC0676o interfaceC0676o) {
        AbstractC2799b.d dVarM9977d = this.f1993c.m9977d();
        dVarM9977d.getClass();
        while (dVarM9977d.hasNext() && !this.f1998h) {
            Map.Entry entry = (Map.Entry) dVarM9977d.next();
            InterfaceC0674n interfaceC0674n = (InterfaceC0674n) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m2677b().compareTo(this.f1994d) < 0 && !this.f1998h && this.f1993c.contains(interfaceC0674n)) {
                m2671l(bVar.m2677b());
                AbstractC0668k.a aVarM2634b = AbstractC0668k.a.Companion.m2634b(bVar.m2677b());
                if (aVarM2634b == null) {
                    C3972g.m15749a("no event up from ", bVar.m2677b());
                    return;
                } else {
                    bVar.m2676a(interfaceC0676o, aVarM2634b);
                    m2670k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2667h(AbstractC0668k.a aVar) {
        aVar.getClass();
        m2665f("handleLifecycleEvent");
        m2669j(aVar.m2632c());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2668i() {
        if (this.f1993c.size() == 0) {
            return true;
        }
        Map.Entry entryM9976a = this.f1993c.m9976a();
        entryM9976a.getClass();
        AbstractC0668k.b bVarM2677b = ((b) entryM9976a.getValue()).m2677b();
        Map.Entry entryM9978e = this.f1993c.m9978e();
        entryM9978e.getClass();
        AbstractC0668k.b bVarM2677b2 = ((b) entryM9978e.getValue()).m2677b();
        return bVarM2677b == bVarM2677b2 && this.f1994d == bVarM2677b2;
    }

    /* JADX INFO: renamed from: j */
    public final void m2669j(AbstractC0668k.b bVar) {
        if (this.f1994d == bVar) {
            return;
        }
        AbstractC0682r.m2680a((InterfaceC0676o) this.f1995e.get(), this.f1994d, bVar);
        this.f1994d = bVar;
        if (this.f1997g || this.f1996f != 0) {
            this.f1998h = true;
            return;
        }
        this.f1997g = true;
        m2673n();
        this.f1997g = false;
        if (this.f1994d == AbstractC0668k.b.f1968q) {
            this.f1993c = new C2798a();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2670k() {
        this.f1999i.remove(r0.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    public final void m2671l(AbstractC0668k.b bVar) {
        this.f1999i.add(bVar);
    }

    /* JADX INFO: renamed from: m */
    public void m2672m(AbstractC0668k.b bVar) {
        bVar.getClass();
        m2665f("setCurrentState");
        m2669j(bVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m2673n() {
        InterfaceC0676o interfaceC0676o = (InterfaceC0676o) this.f1995e.get();
        if (interfaceC0676o == null) {
            C10010p0.m38820a("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (!m2668i()) {
            this.f1998h = false;
            AbstractC0668k.b bVar = this.f1994d;
            Map.Entry entryM9976a = this.f1993c.m9976a();
            entryM9976a.getClass();
            if (bVar.compareTo(((b) entryM9976a.getValue()).m2677b()) < 0) {
                m2663d(interfaceC0676o);
            }
            Map.Entry entryM9978e = this.f1993c.m9978e();
            if (!this.f1998h && entryM9978e != null && this.f1994d.compareTo(((b) entryM9978e.getValue()).m2677b()) > 0) {
                m2666g(interfaceC0676o);
            }
        }
        this.f1998h = false;
        this.f2000j.setValue(mo2629b());
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0680q m2674a(InterfaceC0676o interfaceC0676o) {
            interfaceC0676o.getClass();
            return new C0680q(interfaceC0676o, false, null);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC0668k.b m2675b(AbstractC0668k.b bVar, AbstractC0668k.b bVar2) {
            bVar.getClass();
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public /* synthetic */ C0680q(InterfaceC0676o interfaceC0676o, boolean z10, AbstractC1043k abstractC1043k) {
        this(interfaceC0676o, z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0680q(InterfaceC0676o interfaceC0676o) {
        this(interfaceC0676o, true);
        interfaceC0676o.getClass();
    }
}
