package p000;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0335j3 extends tp0 {
    @Override // p000.tp0
    /* JADX INFO: renamed from: F */
    public final void mo2254F(C0373k3 c0373k3, C0373k3 c0373k32) {
        c0373k3.f5330b = c0373k32;
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: G */
    public final void mo2255G(C0373k3 c0373k3, Thread thread) {
        c0373k3.f5329a = thread;
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: j */
    public final boolean mo2256j(AbstractFutureC0410l3 abstractFutureC0410l3, C0263h3 c0263h3) {
        C0263h3 c0263h32 = C0263h3.f3808b;
        synchronized (abstractFutureC0410l3) {
            try {
                if (abstractFutureC0410l3.f5902i != c0263h3) {
                    return false;
                }
                abstractFutureC0410l3.f5902i = c0263h32;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: k */
    public final boolean mo2257k(AbstractFutureC0410l3 abstractFutureC0410l3, Object obj, Object obj2) {
        synchronized (abstractFutureC0410l3) {
            try {
                if (abstractFutureC0410l3.f5901h != obj) {
                    return false;
                }
                abstractFutureC0410l3.f5901h = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: l */
    public final boolean mo2258l(AbstractFutureC0410l3 abstractFutureC0410l3, C0373k3 c0373k3, C0373k3 c0373k32) {
        synchronized (abstractFutureC0410l3) {
            try {
                if (abstractFutureC0410l3.f5903j != c0373k3) {
                    return false;
                }
                abstractFutureC0410l3.f5903j = c0373k32;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
