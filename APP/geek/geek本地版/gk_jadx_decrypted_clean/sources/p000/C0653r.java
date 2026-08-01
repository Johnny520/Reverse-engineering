package p000;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public final class C0653r extends AbstractC0222ff {
    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: F */
    public final void mo1206F(C0690s c0690s, C0690s c0690s2) {
        c0690s.f4364b = c0690s2;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: G */
    public final void mo1207G(C0690s c0690s, Thread thread) {
        c0690s.f4363a = thread;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: e */
    public final boolean mo1208e(AbstractFutureC0727t abstractFutureC0727t, C0578p c0578p) {
        C0578p c0578p2 = C0578p.f3625b;
        synchronized (abstractFutureC0727t) {
            try {
                if (abstractFutureC0727t.f4479b != c0578p) {
                    return false;
                }
                abstractFutureC0727t.f4479b = c0578p2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: f */
    public final boolean mo1209f(AbstractFutureC0727t abstractFutureC0727t, Object obj, Object obj2) {
        synchronized (abstractFutureC0727t) {
            try {
                if (abstractFutureC0727t.f4478a != obj) {
                    return false;
                }
                abstractFutureC0727t.f4478a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: g */
    public final boolean mo1210g(AbstractFutureC0727t abstractFutureC0727t, C0690s c0690s, C0690s c0690s2) {
        synchronized (abstractFutureC0727t) {
            try {
                if (abstractFutureC0727t.f4480c != c0690s) {
                    return false;
                }
                abstractFutureC0727t.f4480c = c0690s2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
