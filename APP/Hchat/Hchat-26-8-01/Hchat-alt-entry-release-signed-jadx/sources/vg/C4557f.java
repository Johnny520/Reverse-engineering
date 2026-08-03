package vg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p249qg.AbstractC3550b0;
import p249qg.AbstractC3565g0;
import p249qg.AbstractC3569h1;
import p249qg.AbstractC3591p;
import p249qg.AbstractC3603v;
import p249qg.C3585n;
import p276sf.C3960g;
import p370yf.AbstractC6038c;
import p370yf.InterfaceC6039d;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4557f extends AbstractC3550b0 implements InterfaceC6039d, InterfaceC5557c {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15025n = AtomicReferenceFieldUpdater.newUpdater(C4557f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: j */
    public final AbstractC3591p f15026j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6038c f15027k;

    /* JADX INFO: renamed from: l */
    public Object f15028l;

    /* JADX INFO: renamed from: m */
    public final Object f15029m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4557f(AbstractC3591p abstractC3591p, AbstractC6038c abstractC6038c) {
        super(-1);
        this.f15026j = abstractC3591p;
        this.f15027k = abstractC6038c;
        this.f15028l = AbstractC4552a.f15014b;
        this.f15029m = AbstractC4552a.m8992k(abstractC6038c.getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: g */
    public final Object mo7484g() {
        Object obj = this.f15028l;
        this.f15028l = AbstractC4552a.f15014b;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        return this.f15027k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f15027k.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        Throwable thM8182b = C3960g.m8182b(obj);
        Object c3585n = thM8182b == null ? obj : new C3585n(thM8182b, false);
        AbstractC6038c abstractC6038c = this.f15027k;
        InterfaceC5561g context = abstractC6038c.getContext();
        AbstractC3591p abstractC3591p = this.f15026j;
        if (abstractC3591p.mo7542x(context)) {
            this.f15028l = c3585n;
            this.f11551i = 0;
            abstractC3591p.mo7538w(abstractC6038c.getContext(), this);
            return;
        }
        AbstractC3565g0 abstractC3565g0M7527a = AbstractC3569h1.m7527a();
        if (abstractC3565g0M7527a.f11569i >= 4294967296L) {
            this.f15028l = c3585n;
            this.f11551i = 0;
            abstractC3565g0M7527a.m7522A(this);
            return;
        }
        abstractC3565g0M7527a.m7523B(true);
        try {
            InterfaceC5561g context2 = abstractC6038c.getContext();
            Object objM8993l = AbstractC4552a.m8993l(context2, this.f15029m);
            try {
                abstractC6038c.resumeWith(obj);
                while (abstractC3565g0M7527a.m7525D()) {
                }
            } finally {
                AbstractC4552a.m8988g(context2, objM8993l);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DispatchedContinuation[" + this.f15026j + ", " + AbstractC3603v.m7567u(this.f15027k) + ']';
    }

    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: c */
    public final InterfaceC5557c mo7480c() {
        return this;
    }
}
