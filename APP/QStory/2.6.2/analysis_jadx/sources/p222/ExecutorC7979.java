package p222;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7979 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22057;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22057) {
            case 0:
                AbstractC7988.m13450().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
