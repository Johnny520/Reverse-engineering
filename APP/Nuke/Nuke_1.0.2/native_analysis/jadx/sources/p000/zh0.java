package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh0 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13905h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ bi0 f13906i;

    public /* synthetic */ zh0(bi0 bi0Var, int i) {
        this.f13905h = i;
        this.f13906i = bi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13905h) {
            case 0:
                AbstractC0731te.m5237t0(this.f13906i);
                return;
            default:
                bi0 bi0Var = this.f13906i;
                synchronized (bi0Var) {
                    try {
                        synchronized (bi0Var.f872f) {
                            bi0Var.f873g = true;
                            bi0Var.f872f.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC0731te.m5193V(bi0Var) && bi0Var.f888v == 0) {
                            AbstractC0731te.m5192U(bi0Var);
                        }
                        if (bi0Var.f874h == null) {
                            bi0Var.f874h = new C0158e9(bi0.f866z, 3);
                        }
                        if (bi0Var.f870d == 0) {
                            bi0Var.f870d = 12;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
