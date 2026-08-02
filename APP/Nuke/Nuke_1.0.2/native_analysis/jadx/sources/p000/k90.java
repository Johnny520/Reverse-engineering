package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 extends m90 implements l20, t00 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5403o = AtomicReferenceFieldUpdater.newUpdater(k90.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: k */
    public final c20 f5404k;

    /* JADX INFO: renamed from: l */
    public final u00 f5405l;

    /* JADX INFO: renamed from: m */
    public Object f5406m;

    /* JADX INFO: renamed from: n */
    public final Object f5407n;

    public k90(c20 c20Var, u00 u00Var) {
        super(-1);
        this.f5404k = c20Var;
        this.f5405l = u00Var;
        this.f5406m = p40.f7968d;
        this.f5407n = fg1.m1625R(u00Var.mo2508f());
    }

    @Override // p000.l20
    /* JADX INFO: renamed from: d */
    public final l20 mo2144d() {
        return this.f5405l;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f5405l.mo2508f();
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) throws j90 {
        Throwable thM6237a = y92.m6237a(obj);
        Object c0557ov = thM6237a == null ? obj : new C0557ov(thM6237a, false);
        u00 u00Var = this.f5405l;
        a20 a20VarMo2508f = u00Var.mo2508f();
        c20 c20Var = this.f5404k;
        if (p40.m3708S(c20Var, a20VarMo2508f)) {
            this.f5406m = c0557ov;
            this.f6520j = 0;
            p40.m3707R(c20Var, u00Var.mo2508f(), this);
            return;
        }
        lg0 lg0VarM20a = a23.m20a();
        if (lg0VarM20a.f6107j >= 4294967296L) {
            this.f5406m = c0557ov;
            this.f6520j = 0;
            lg0VarM20a.m2905H(this);
            return;
        }
        lg0VarM20a.m2906I(true);
        try {
            a20 a20VarMo2508f2 = u00Var.mo2508f();
            Object objM1629V = fg1.m1629V(a20VarMo2508f2, this.f5407n);
            try {
                u00Var.mo2509h(obj);
                while (lg0VarM20a.m2908K()) {
                }
            } finally {
                fg1.m1620M(a20VarMo2508f2, objM1629V);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: k */
    public final Object mo2617k() {
        Object obj = this.f5406m;
        this.f5406m = p40.f7968d;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5404k + ", " + p40.m3713X(this.f5405l) + ']';
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: c */
    public final t00 mo2616c() {
        return this;
    }
}
