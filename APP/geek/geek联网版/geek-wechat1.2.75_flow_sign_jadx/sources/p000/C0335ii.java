package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: ii */
/* JADX INFO: loaded from: classes.dex */
public final class C0335ii extends AbstractC0259gf {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC0259gf f2543y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ThreadPoolExecutor f2544z;

    public C0335ii(AbstractC0259gf abstractC0259gf, ThreadPoolExecutor threadPoolExecutor) {
        this.f2543y = abstractC0259gf;
        this.f2544z = threadPoolExecutor;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: J */
    public final void mo51J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2544z;
        try {
            this.f2543y.mo51J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: M */
    public final void mo52M(C0402k8 c0402k8) {
        ThreadPoolExecutor threadPoolExecutor = this.f2544z;
        try {
            this.f2543y.mo52M(c0402k8);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
