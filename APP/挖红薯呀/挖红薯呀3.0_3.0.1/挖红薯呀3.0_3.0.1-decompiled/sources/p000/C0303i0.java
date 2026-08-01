package p000;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303i0 extends pf1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: L */
    public final void mo1267L(C0338j0 c0338j0, C0338j0 c0338j02) {
        c0338j0.f2650b = c0338j02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: M */
    public final void mo1268M(C0338j0 c0338j0, Thread thread) {
        c0338j0.f2649a = thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: j */
    public final boolean mo1269j(AbstractFutureC0375k0 abstractFutureC0375k0, C0229g0 c0229g0) {
        C0229g0 c0229g02 = C0229g0.f1832b;
        synchronized (abstractFutureC0375k0) {
            try {
                if (abstractFutureC0375k0.f2972e != c0229g0) {
                    return false;
                }
                abstractFutureC0375k0.f2972e = c0229g02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: k */
    public final boolean mo1270k(AbstractFutureC0375k0 abstractFutureC0375k0, Object obj, Object obj2) {
        synchronized (abstractFutureC0375k0) {
            try {
                if (abstractFutureC0375k0.f2971d != obj) {
                    return false;
                }
                abstractFutureC0375k0.f2971d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: l */
    public final boolean mo1271l(AbstractFutureC0375k0 abstractFutureC0375k0, C0338j0 c0338j0, C0338j0 c0338j02) {
        synchronized (abstractFutureC0375k0) {
            try {
                if (abstractFutureC0375k0.f2973f != c0338j0) {
                    return false;
                }
                abstractFutureC0375k0.f2973f = c0338j02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
