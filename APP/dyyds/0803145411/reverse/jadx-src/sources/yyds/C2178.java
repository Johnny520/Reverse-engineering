package yyds;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: yyds.ᲁᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2178 extends AbstractC0476 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0476 f10665;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f10666;

    public C2178(AbstractC0476 abstractC0476, ThreadPoolExecutor threadPoolExecutor) {
        this.f10665 = abstractC0476;
        this.f10666 = threadPoolExecutor;
    }

    @Override // yyds.AbstractC0476
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo1333(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f10666;
        try {
            this.f10665.mo1333(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // yyds.AbstractC0476
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1334(C0299 c0299) {
        ThreadPoolExecutor threadPoolExecutor = this.f10666;
        try {
            this.f10665.mo1334(c0299);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
