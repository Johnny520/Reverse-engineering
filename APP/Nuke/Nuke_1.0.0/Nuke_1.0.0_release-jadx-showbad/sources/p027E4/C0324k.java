package p027E4;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: E4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0324k extends CompletableFuture {

    /* JADX INFO: renamed from: d */
    public final C0289C f1046d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0324k(C0289C c0289c) {
        this.f1046d = c0289c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        if (z5) {
            this.f1046d.cancel();
        }
        return super.cancel(z5);
    }
}
