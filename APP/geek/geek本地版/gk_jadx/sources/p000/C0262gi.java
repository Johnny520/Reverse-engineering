package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: gi */
/* JADX INFO: loaded from: classes.dex */
public final class C0262gi extends AbstractC0346ip {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ AbstractC0346ip f2131C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ ThreadPoolExecutor f2132D;

    public C0262gi(AbstractC0346ip abstractC0346ip, ThreadPoolExecutor threadPoolExecutor) {
        this.f2131C = abstractC0346ip;
        this.f2132D = threadPoolExecutor;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: F */
    public final void mo1276F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2132D;
        try {
            this.f2131C.mo1276F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: I */
    public final void mo1277I(C0009a8 c0009a8) {
        ThreadPoolExecutor threadPoolExecutor = this.f2132D;
        try {
            this.f2131C.mo1277I(c0009a8);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
