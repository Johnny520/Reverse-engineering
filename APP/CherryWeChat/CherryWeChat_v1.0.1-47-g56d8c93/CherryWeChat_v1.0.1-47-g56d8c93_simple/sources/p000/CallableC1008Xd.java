package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Xd */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1008Xd implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1219be f3213a;

    public CallableC1008Xd(C1219be r1) {
        this.f3213a = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1219be r0 = this.f3213a;
        monitor-enter(r0);
        C1219be r1 = this.f3213a;     // Catch: Throwable -> L8
        if (r1.f4165i != null) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    L10:
        r1.m2347w();     // Catch: Throwable -> L8
        if (this.f3213a.m2342p() == false) goto L13;
        this.f3213a.m2346u();     // Catch: Throwable -> L8
        this.f3213a.f4167k = 0;     // Catch: Throwable -> L8
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    L8:
        th = move-exception;
        throw th;
    }
}
