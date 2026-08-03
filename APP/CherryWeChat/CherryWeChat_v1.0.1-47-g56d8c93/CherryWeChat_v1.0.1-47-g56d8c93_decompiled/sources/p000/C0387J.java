package p000;

/* JADX INFO: renamed from: J */
/* JADX INFO: loaded from: classes.dex */
public final class C0387J extends AbstractC0628Oj {
    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: O */
    public final void mo730O(C0430K c0430k, C0430K c0430k2) {
        c0430k.f1417b = c0430k2;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: P */
    public final void mo731P(C0430K c0430k, Thread thread) {
        c0430k.f1416a = thread;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: f */
    public final boolean mo732f(AbstractFutureC0473L abstractFutureC0473L, C0301H c0301h) {
        C0301H c0301h2 = C0301H.f1014b;
        synchronized (abstractFutureC0473L) {
            try {
                if (abstractFutureC0473L.f1568b != c0301h) {
                    return false;
                }
                abstractFutureC0473L.f1568b = c0301h2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: g */
    public final boolean mo733g(AbstractFutureC0473L abstractFutureC0473L, Object obj, Object obj2) {
        synchronized (abstractFutureC0473L) {
            try {
                if (abstractFutureC0473L.f1567a != obj) {
                    return false;
                }
                abstractFutureC0473L.f1567a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: h */
    public final boolean mo734h(AbstractFutureC0473L abstractFutureC0473L, C0430K c0430k, C0430K c0430k2) {
        synchronized (abstractFutureC0473L) {
            try {
                if (abstractFutureC0473L.f1569c != c0430k) {
                    return false;
                }
                abstractFutureC0473L.f1569c = c0430k2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
