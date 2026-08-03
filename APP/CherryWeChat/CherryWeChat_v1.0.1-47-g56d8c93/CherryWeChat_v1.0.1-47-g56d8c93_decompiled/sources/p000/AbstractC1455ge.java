package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ge */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1455ge extends AbstractRunnableC1532iA {

    /* JADX INFO: renamed from: c */
    public int f5157c;

    public AbstractC1455ge(int i) {
        super(0L, false);
        this.f5157c = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo1010a(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0190Eb mo1011b();

    /* JADX INFO: renamed from: d */
    public Throwable mo1013d(Object obj) {
        C0189Ea c0189Ea = obj instanceof C0189Ea ? (C0189Ea) obj : null;
        if (c0189Ea != null) {
            return c0189Ea.f575a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Object mo1014g(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m2782h(Throwable th) {
        AbstractC0628Oj.m1222B(mo1011b().mo263e(), new C1541ic("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo1015i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1367ee c1367ee = (C1367ee) mo1011b();
            AbstractC0233Fb abstractC0233Fb = c1367ee.f4895e;
            InterfaceC1137ac interfaceC1137ac = abstractC0233Fb.f731b;
            Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, c1367ee.f4897g);
            InterfaceC1332dm interfaceC1332dm = null;
            C2664wC c2664wCM289w = objM604E != AbstractC0295Gu.f1005j ? AbstractC0148Dc.m289w(abstractC0233Fb, interfaceC1137ac, objM604E) : null;
            try {
                Object objMo1015i = mo1015i();
                Throwable thMo1013d = mo1013d(objMo1015i);
                if (thMo1013d == null) {
                    int i = this.f5157c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC1332dm = (InterfaceC1332dm) interfaceC1137ac.mo24m(C1456gf.f5162f);
                    }
                }
                if (interfaceC1332dm != null && !interfaceC1332dm.mo1745d()) {
                    CancellationException cancellationExceptionMo1748p = interfaceC1332dm.mo1748p();
                    mo1010a(cancellationExceptionMo1748p);
                    abstractC0233Fb.mo264f(new C0297Gw(cancellationExceptionMo1748p));
                } else if (thMo1013d != null) {
                    abstractC0233Fb.mo264f(new C0297Gw(thMo1013d));
                } else {
                    abstractC0233Fb.mo264f(mo1014g(objMo1015i));
                }
                if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                    AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
                }
            } catch (Throwable th) {
                if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                    AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
                }
                throw th;
            }
        } catch (C1324de e) {
            AbstractC0628Oj.m1222B(mo1011b().mo263e(), e.f4800a);
        } catch (Throwable th2) {
            m2782h(th2);
        }
    }
}
