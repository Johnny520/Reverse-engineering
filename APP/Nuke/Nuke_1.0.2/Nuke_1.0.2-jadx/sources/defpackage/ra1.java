package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements Executor {
    public t7 h;
    public t7 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a() {
        t7 t7Var = this.i;
        this.h = t7Var;
        this.i = null;
        if (t7Var != null) {
            ci0.J().execute(this.h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.h == null) {
                this.h = new t7(5, this, runnable);
                ci0.J().execute(this.h);
            } else if (this.i == null) {
                this.i = new t7(5, this, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
