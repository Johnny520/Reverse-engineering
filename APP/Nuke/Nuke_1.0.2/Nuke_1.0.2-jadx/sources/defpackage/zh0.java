package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh0 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ bi0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zh0(bi0 bi0Var, int i) {
        this.h = i;
        this.i = bi0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                te.t0(this.i);
                return;
            default:
                bi0 bi0Var = this.i;
                synchronized (bi0Var) {
                    try {
                        synchronized (bi0Var.f) {
                            bi0Var.g = true;
                            bi0Var.f.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!te.V(bi0Var) && bi0Var.v == 0) {
                            te.U(bi0Var);
                        }
                        if (bi0Var.h == null) {
                            bi0Var.h = new e9(bi0.z, 3);
                        }
                        if (bi0Var.d == 0) {
                            bi0Var.d = 12;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
