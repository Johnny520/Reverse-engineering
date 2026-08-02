package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d90 implements Callable {
    public final /* synthetic */ h90 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d90(h90 h90Var) {
        this.a = h90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                h90 h90Var = this.a;
                if (h90Var.q == null) {
                    return null;
                }
                h90Var.v();
                if (this.a.o()) {
                    this.a.t();
                    this.a.s = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
