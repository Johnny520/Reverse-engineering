package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 extends m90 implements l20, t00 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(k90.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final c20 k;
    public final u00 l;
    public Object m;
    public final Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k90(c20 c20Var, u00 u00Var) {
        super(-1);
        this.k = c20Var;
        this.l = u00Var;
        this.m = p40.d;
        this.n = fg1.R(u00Var.f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l20
    public final l20 d() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.l.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) throws j90 {
        Throwable thA = y92.a(obj);
        Object ovVar = thA == null ? obj : new ov(thA, false);
        u00 u00Var = this.l;
        a20 a20VarF = u00Var.f();
        c20 c20Var = this.k;
        if (p40.S(c20Var, a20VarF)) {
            this.m = ovVar;
            this.j = 0;
            p40.R(c20Var, u00Var.f(), this);
            return;
        }
        lg0 lg0VarA = a23.a();
        if (lg0VarA.j >= 4294967296L) {
            this.m = ovVar;
            this.j = 0;
            lg0VarA.H(this);
            return;
        }
        lg0VarA.I(true);
        try {
            a20 a20VarF2 = u00Var.f();
            Object objV = fg1.V(a20VarF2, this.n);
            try {
                u00Var.h(obj);
                while (lg0VarA.K()) {
                }
            } finally {
                fg1.M(a20VarF2, objV);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final Object k() {
        Object obj = this.m;
        this.m = p40.d;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DispatchedContinuation[" + this.k + ", " + p40.X(this.l) + ']';
    }

    @Override // defpackage.m90
    public final t00 c() {
        return this;
    }
}
