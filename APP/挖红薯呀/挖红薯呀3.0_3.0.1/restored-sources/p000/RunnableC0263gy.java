package p000;

/* JADX INFO: renamed from: gy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0263gy implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2089d = 1;

    /* JADX INFO: renamed from: e */
    public Runnable f2090e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0692rk f2091f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0263gy(C0884wc c0884wc, C0300hy c0300hy) {
        this.f2090e = c0884wc;
        this.f2091f = c0300hy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2089d;
        AbstractC0692rk abstractC0692rk = this.f2091f;
        switch (i) {
            case 0:
                ((C0884wc) this.f2090e).m4982H((C0300hy) abstractC0692rk);
                break;
            default:
                fa0 fa0Var = (fa0) abstractC0692rk;
                AbstractC0692rk abstractC0692rk2 = fa0Var.f1642g;
                int i2 = 0;
                while (true) {
                    try {
                        this.f2090e.run();
                    } catch (Throwable th) {
                        o30.m2780t(C0220fs.f1799d, th);
                    }
                    Runnable runnableM1075j = fa0Var.m1075j();
                    if (runnableM1075j == null) {
                        break;
                    } else {
                        this.f2090e = runnableM1075j;
                        i2++;
                        if (i2 >= 16 && abstractC0692rk2.mo1509f(fa0Var)) {
                            abstractC0692rk2.mo358e(fa0Var, this);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public RunnableC0263gy(fa0 fa0Var, Runnable runnable) {
        this.f2091f = fa0Var;
        this.f2090e = runnable;
    }
}
