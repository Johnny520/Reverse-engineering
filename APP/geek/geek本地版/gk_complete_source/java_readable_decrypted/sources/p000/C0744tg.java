package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: tg */
/* JADX INFO: loaded from: classes.dex */
public final class C0744tg extends AbstractC0818vg implements InterfaceC0631qe, InterfaceC0444ld {

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f4571h = AtomicReferenceFieldUpdater.newUpdater(C0744tg.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d */
    public final AbstractC0408ke f4572d;

    /* JADX INFO: renamed from: e */
    public final m50 f4573e;

    /* JADX INFO: renamed from: f */
    public Object f4574f;

    /* JADX INFO: renamed from: g */
    public final Object f4575g;

    public C0744tg(AbstractC0408ke abstractC0408ke, m50 m50Var) {
        super(-1);
        this.f4572d = abstractC0408ke;
        this.f4573e = m50Var;
        this.f4574f = a80.f71d;
        InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge);
        Object objMo1274h = interfaceC0258ge.mo1274h(0, C0295he.f2275e);
        AbstractC0346ip.m1500l(objMo1274h);
        this.f4575g = objMo1274h;
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: a */
    public final void mo1403a(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0553ob) {
            throw null;
        }
    }

    @Override // p000.InterfaceC0631qe
    /* JADX INFO: renamed from: c */
    public final InterfaceC0631qe mo1405c() {
        m50 m50Var = this.f4573e;
        if (m50Var != null) {
            return m50Var;
        }
        return null;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: d */
    public final InterfaceC0258ge mo1240d() {
        InterfaceC0258ge interfaceC0258ge = this.f4573e.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge);
        return interfaceC0258ge;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public final void mo1241f(Object obj) {
        m50 m50Var = this.f4573e;
        InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge);
        Throwable thM1132a = f10.m1132a(obj);
        Object c0516nb = thM1132a == null ? obj : new C0516nb(thM1132a, false);
        AbstractC0408ke abstractC0408ke = this.f4572d;
        if (abstractC0408ke.mo1605e()) {
            this.f4574f = c0516nb;
            this.f4842c = 0;
            abstractC0408ke.mo1598d(interfaceC0258ge, this);
            return;
        }
        AbstractC0413kj abstractC0413kjM2362a = t60.m2362a();
        if (abstractC0413kjM2362a.f2904c >= 4294967296L) {
            this.f4574f = c0516nb;
            this.f4842c = 0;
            C0400k6 c0400k6 = abstractC0413kjM2362a.f2906e;
            if (c0400k6 == null) {
                c0400k6 = new C0400k6();
                abstractC0413kjM2362a.f2906e = c0400k6;
            }
            c0400k6.addLast(this);
            return;
        }
        abstractC0413kjM2362a.m1702k(true);
        try {
            InterfaceC0258ge interfaceC0258ge2 = m50Var.f3143b;
            AbstractC0346ip.m1500l(interfaceC0258ge2);
            Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge2, this.f4575g);
            try {
                m50Var.mo1241f(obj);
                while (abstractC0413kjM2362a.m1703l()) {
                }
            } finally {
                AbstractC0222ff.m1166L(interfaceC0258ge2, objM1176V);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: i */
    public final Object mo1408i() {
        Object obj = this.f4574f;
        this.f4574f = a80.f71d;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4572d + ", " + AbstractC0222ff.m1174T(this.f4573e) + ']';
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: b */
    public final InterfaceC0444ld mo1404b() {
        return this;
    }
}
