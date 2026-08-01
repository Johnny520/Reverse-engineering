package p000;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public final class C0652r extends AbstractC0259gf {
    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: O */
    public final void mo1267O(C0689s c0689s, C0689s c0689s2) {
        c0689s.f4178b = c0689s2;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: P */
    public final void mo1268P(C0689s c0689s, Thread thread) {
        c0689s.f4177a = thread;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: m */
    public final boolean mo1270m(AbstractFutureC0726t abstractFutureC0726t, C0578p c0578p) {
        C0578p c0578p2 = C0578p.f3557b;
        synchronized (abstractFutureC0726t) {
            try {
                if (abstractFutureC0726t.f4382b != c0578p) {
                    return false;
                }
                abstractFutureC0726t.f4382b = c0578p2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: n */
    public final boolean mo1271n(AbstractFutureC0726t abstractFutureC0726t, Object obj, Object obj2) {
        synchronized (abstractFutureC0726t) {
            try {
                if (abstractFutureC0726t.f4381a != obj) {
                    return false;
                }
                abstractFutureC0726t.f4381a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: o */
    public final boolean mo1272o(AbstractFutureC0726t abstractFutureC0726t, C0689s c0689s, C0689s c0689s2) {
        synchronized (abstractFutureC0726t) {
            try {
                if (abstractFutureC0726t.f4383c != c0689s) {
                    return false;
                }
                abstractFutureC0726t.f4383c = c0689s2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
