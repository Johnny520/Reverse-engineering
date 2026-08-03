package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Xd */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1008Xd implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1219be f3213a;

    public CallableC1008Xd(C1219be c1219be) {
        this.f3213a = c1219be;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f3213a) {
            try {
                C1219be c1219be = this.f3213a;
                if (c1219be.f4165i == null) {
                    return null;
                }
                c1219be.m2347w();
                if (this.f3213a.m2342p()) {
                    this.f3213a.m2346u();
                    this.f3213a.f4167k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
