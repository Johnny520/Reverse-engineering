package p076m;

import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0759e extends AbstractC0503h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: K */
    public final void mo994K(C0760f c0760f, C0760f c0760f2) {
        c0760f.f2573b = c0760f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: L */
    public final void mo995L(C0760f c0760f, Thread thread) {
        c0760f.f2572a = thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: d */
    public final boolean mo998d(AbstractFutureC0761g abstractFutureC0761g, C0757c c0757c) {
        C0757c c0757c2 = C0757c.f2564b;
        synchronized (abstractFutureC0761g) {
            try {
                if (abstractFutureC0761g.f2579b != c0757c) {
                    return false;
                }
                abstractFutureC0761g.f2579b = c0757c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: e */
    public final boolean mo999e(AbstractFutureC0761g abstractFutureC0761g, Object obj, Object obj2) {
        synchronized (abstractFutureC0761g) {
            try {
                if (abstractFutureC0761g.f2578a != obj) {
                    return false;
                }
                abstractFutureC0761g.f2578a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: f */
    public final boolean mo1000f(AbstractFutureC0761g abstractFutureC0761g, C0760f c0760f, C0760f c0760f2) {
        synchronized (abstractFutureC0761g) {
            try {
                if (abstractFutureC0761g.f2580c != c0760f) {
                    return false;
                }
                abstractFutureC0761g.f2580c = c0760f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
