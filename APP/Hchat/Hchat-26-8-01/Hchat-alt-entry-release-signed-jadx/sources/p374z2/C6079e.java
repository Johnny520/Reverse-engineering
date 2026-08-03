package p374z2;

import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: z2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6079e extends AbstractC3754e0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: a0 */
    public final void mo7920a0(C6080f c6080f, C6080f c6080f2) {
        c6080f.f24570b = c6080f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: b0 */
    public final void mo7921b0(C6080f c6080f, Thread thread) {
        c6080f.f24569a = thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: k */
    public final boolean mo7922k(AbstractFutureC6081g abstractFutureC6081g, C6077c c6077c) {
        C6077c c6077c2 = C6077c.f24561b;
        synchronized (abstractFutureC6081g) {
            try {
                if (abstractFutureC6081g.f24576h != c6077c) {
                    return false;
                }
                abstractFutureC6081g.f24576h = c6077c2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: l */
    public final boolean mo7923l(AbstractFutureC6081g abstractFutureC6081g, Object obj, Object obj2) {
        synchronized (abstractFutureC6081g) {
            try {
                if (abstractFutureC6081g.f24575g != obj) {
                    return false;
                }
                abstractFutureC6081g.f24575g = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: m */
    public final boolean mo7924m(AbstractFutureC6081g abstractFutureC6081g, C6080f c6080f, C6080f c6080f2) {
        synchronized (abstractFutureC6081g) {
            try {
                if (abstractFutureC6081g.f24577i != c6080f) {
                    return false;
                }
                abstractFutureC6081g.f24577i = c6080f2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
