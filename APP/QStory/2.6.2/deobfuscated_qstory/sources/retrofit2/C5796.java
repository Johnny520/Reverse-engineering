package retrofit2;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5796 extends CompletableFuture {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5767 f15893;

    public C5796(C5767 c5767) {
        this.f15893 = c5767;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f15893.cancel();
        }
        return super.cancel(z);
    }
}
