package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: rf */
/* JADX INFO: loaded from: classes.dex */
public final class C2458rf extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1293cr f8664f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ThreadPoolExecutor f8665g;

    public C2458rf(AbstractC1293cr abstractC1293cr, ThreadPoolExecutor threadPoolExecutor) {
        this.f8664f = abstractC1293cr;
        this.f8665g = threadPoolExecutor;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: H */
    public final void mo2561H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f8665g;
        try {
            this.f8664f.mo2561H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: I */
    public final void mo2562I(C2428qs c2428qs) {
        ThreadPoolExecutor threadPoolExecutor = this.f8665g;
        try {
            this.f8664f.mo2562I(c2428qs);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
