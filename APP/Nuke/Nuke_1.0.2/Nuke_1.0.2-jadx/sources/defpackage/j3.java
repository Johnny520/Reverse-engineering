package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends tp0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final void F(k3 k3Var, k3 k3Var2) {
        k3Var.b = k3Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final void G(k3 k3Var, Thread thread) {
        k3Var.a = thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean j(l3 l3Var, h3 h3Var) {
        h3 h3Var2 = h3.b;
        synchronized (l3Var) {
            try {
                if (l3Var.i != h3Var) {
                    return false;
                }
                l3Var.i = h3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean k(l3 l3Var, Object obj, Object obj2) {
        synchronized (l3Var) {
            try {
                if (l3Var.h != obj) {
                    return false;
                }
                l3Var.h = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean l(l3 l3Var, k3 k3Var, k3 k3Var2) {
        synchronized (l3Var) {
            try {
                if (l3Var.j != k3Var) {
                    return false;
                }
                l3Var.j = k3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
