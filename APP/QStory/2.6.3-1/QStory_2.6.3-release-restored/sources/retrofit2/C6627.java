package retrofit2;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6627 extends CompletableFuture {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6598 f16238;

    public C6627(C6598 c6598) {
        this.f16238 = c6598;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f16238.cancel();
        }
        return super.cancel(z);
    }
}
