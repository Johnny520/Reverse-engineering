package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: androidx.emoji2.text.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0397l extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0079h f1183d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ThreadPoolExecutor f1184e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0397l(AbstractC0079h abstractC0079h, ThreadPoolExecutor threadPoolExecutor) {
        this.f1183d = abstractC0079h;
        this.f1184e = threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: F */
    public final void mo200F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1184e;
        try {
            this.f1183d.mo200F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: I */
    public final void mo203I(C0404s c0404s) {
        ThreadPoolExecutor threadPoolExecutor = this.f1184e;
        try {
            this.f1183d.mo203I(c0404s);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
