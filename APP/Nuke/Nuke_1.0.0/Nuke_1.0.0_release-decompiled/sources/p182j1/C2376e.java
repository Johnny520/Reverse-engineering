package p182j1;

import com.bumptech.glide.AbstractC1924f;

/* JADX INFO: renamed from: j1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2376e extends AbstractC1924f {
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: e */
    public final boolean mo3513e(AbstractFutureC2378g abstractFutureC2378g, C2374c c2374c) {
        C2374c c2374c2 = C2374c.f7706b;
        synchronized (abstractFutureC2378g) {
            try {
                if (abstractFutureC2378g.f7721e != c2374c) {
                    return false;
                }
                abstractFutureC2378g.f7721e = c2374c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: f */
    public final boolean mo3514f(AbstractFutureC2378g abstractFutureC2378g, Object obj, Object obj2) {
        synchronized (abstractFutureC2378g) {
            try {
                if (abstractFutureC2378g.f7720d != obj) {
                    return false;
                }
                abstractFutureC2378g.f7720d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: g */
    public final boolean mo3515g(AbstractFutureC2378g abstractFutureC2378g, C2377f c2377f, C2377f c2377f2) {
        synchronized (abstractFutureC2378g) {
            try {
                if (abstractFutureC2378g.f7722f != c2377f) {
                    return false;
                }
                abstractFutureC2378g.f7722f = c2377f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: r */
    public final void mo3516r(C2377f c2377f, C2377f c2377f2) {
        c2377f.f7715b = c2377f2;
    }

    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: s */
    public final void mo3517s(C2377f c2377f, Thread thread) {
        c2377f.f7714a = thread;
    }
}
