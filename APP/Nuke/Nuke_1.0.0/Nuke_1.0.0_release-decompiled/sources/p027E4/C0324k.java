package p027E4;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: E4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0324k extends CompletableFuture {

    /* JADX INFO: renamed from: d */
    public final C0289C f1046d;

    public C0324k(C0289C c0289c) {
        this.f1046d = c0289c;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        if (z5) {
            this.f1046d.cancel();
        }
        return super.cancel(z5);
    }
}
