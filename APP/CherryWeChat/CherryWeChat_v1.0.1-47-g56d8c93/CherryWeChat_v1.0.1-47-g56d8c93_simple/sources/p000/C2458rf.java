package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: rf */
/* JADX INFO: loaded from: classes.dex */
public final class C2458rf extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1293cr f8664f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ThreadPoolExecutor f8665g;

    public C2458rf(AbstractC1293cr r1, ThreadPoolExecutor r2) {
        this.f8664f = r1;
        this.f8665g = r2;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: H */
    public final void mo2561H(Throwable r3) {
        ThreadPoolExecutor r0 = this.f8665g;
        this.f8664f.mo2561H(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: I */
    public final void mo2562I(C2428qs r3) {
        ThreadPoolExecutor r0 = this.f8665g;
        this.f8664f.mo2562I(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }
}
