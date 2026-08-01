package p222;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7980 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22054;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22054) {
            case 0:
                AbstractC7989.m13478().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
