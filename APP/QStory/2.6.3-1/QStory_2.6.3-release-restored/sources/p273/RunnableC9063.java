package p273;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9063 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9056 f23073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23074;

    public /* synthetic */ RunnableC9063(C9056 c9056, int i) {
        this.f23074 = i;
        this.f23073 = c9056;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23074;
        C9056 c9056 = this.f23073;
        switch (i) {
            case 0:
                C9052 c9052 = c9056.f23053;
                if (c9052 != null) {
                    c9052.m14303();
                }
                break;
            default:
                C9052 c90522 = c9056.f23053;
                if (c90522 != null) {
                    c90522.m14308(null);
                    break;
                }
                break;
        }
    }
}
