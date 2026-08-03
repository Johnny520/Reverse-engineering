package p065k;

import com.abc.core.runtime.AbstractC0805P;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0973e extends AbstractC0805P {
    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: O */
    public final void mo2061O(C0974f c0974f, C0974f c0974f2) {
        c0974f.f3452b = c0974f2;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: P */
    public final void mo2062P(C0974f c0974f, Thread thread) {
        c0974f.f3451a = thread;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: c */
    public final boolean mo2067c(AbstractFutureC0975g abstractFutureC0975g, C0971c c0971c) {
        C0971c c0971c2 = C0971c.f3443b;
        synchronized (abstractFutureC0975g) {
            try {
                if (abstractFutureC0975g.f3458b != c0971c) {
                    return false;
                }
                abstractFutureC0975g.f3458b = c0971c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: d */
    public final boolean mo2068d(AbstractFutureC0975g abstractFutureC0975g, Object obj, Object obj2) {
        synchronized (abstractFutureC0975g) {
            try {
                if (abstractFutureC0975g.f3457a != obj) {
                    return false;
                }
                abstractFutureC0975g.f3457a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: e */
    public final boolean mo2069e(AbstractFutureC0975g abstractFutureC0975g, C0974f c0974f, C0974f c0974f2) {
        synchronized (abstractFutureC0975g) {
            try {
                if (abstractFutureC0975g.f3459c != c0974f) {
                    return false;
                }
                abstractFutureC0975g.f3459c = c0974f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
