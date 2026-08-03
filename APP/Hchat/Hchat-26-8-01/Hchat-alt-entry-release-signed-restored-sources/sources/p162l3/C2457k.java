package p162l3;

import java.util.concurrent.ThreadPoolExecutor;
import p007a7.AbstractC0018a;
import p109hb.C1671c;

/* JADX INFO: renamed from: l3.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2457k extends AbstractC0018a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0018a f8072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ThreadPoolExecutor f8073c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2457k(AbstractC0018a abstractC0018a, ThreadPoolExecutor threadPoolExecutor) {
        this.f8072b = abstractC0018a;
        this.f8073c = threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.AbstractC0018a
    /* JADX INFO: renamed from: D */
    public final void mo263D(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f8073c;
        try {
            this.f8072b.mo263D(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.AbstractC0018a
    /* JADX INFO: renamed from: E */
    public final void mo264E(C1671c c1671c) {
        ThreadPoolExecutor threadPoolExecutor = this.f8073c;
        try {
            this.f8072b.mo264E(c1671c);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
