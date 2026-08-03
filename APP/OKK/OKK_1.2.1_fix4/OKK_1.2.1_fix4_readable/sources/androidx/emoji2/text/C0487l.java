package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p037U.AbstractC0358S;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0487l extends AbstractC0358S {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ ThreadPoolExecutor f1368A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC0358S f1369z;

    public C0487l(AbstractC0358S abstractC0358S, ThreadPoolExecutor threadPoolExecutor) {
        this.f1369z = abstractC0358S;
        this.f1368A = threadPoolExecutor;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: U */
    public final void mo921U(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1368A;
        try {
            this.f1369z.mo921U(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: V */
    public final void mo922V(C0463v c0463v) {
        ThreadPoolExecutor threadPoolExecutor = this.f1368A;
        try {
            this.f1369z.mo922V(c0463v);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
