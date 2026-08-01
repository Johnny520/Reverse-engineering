package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: ur */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0813ur extends s91 {

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ s91 f6283G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ ThreadPoolExecutor f6284H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0813ur(s91 s91Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f6283G = s91Var;
        this.f6284H = threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s91
    /* JADX INFO: renamed from: H */
    public final void mo2734H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6284H;
        try {
            this.f6283G.mo2734H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s91
    /* JADX INFO: renamed from: I */
    public final void mo2735I(C0948y2 c0948y2) {
        ThreadPoolExecutor threadPoolExecutor = this.f6284H;
        try {
            this.f6283G.mo2735I(c0948y2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
