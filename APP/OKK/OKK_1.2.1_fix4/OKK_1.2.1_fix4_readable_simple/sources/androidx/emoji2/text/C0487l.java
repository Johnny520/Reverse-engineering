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

    public C0487l(AbstractC0358S r1, ThreadPoolExecutor r2) {
        this.f1369z = r1;
        this.f1368A = r2;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: U */
    public final void mo921U(Throwable r3) {
        ThreadPoolExecutor r02 = this.f1368A;
        this.f1369z.mo921U(r3);     // Catch: Throwable -> L6
        r02.shutdown();
        return;
    L6:
        th = move-exception;
        r02.shutdown();
        throw th;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: V */
    public final void mo922V(C0463v r3) {
        ThreadPoolExecutor r02 = this.f1368A;
        this.f1369z.mo922V(r3);     // Catch: Throwable -> L6
        r02.shutdown();
        return;
    L6:
        th = move-exception;
        r02.shutdown();
        throw th;
    }
}
