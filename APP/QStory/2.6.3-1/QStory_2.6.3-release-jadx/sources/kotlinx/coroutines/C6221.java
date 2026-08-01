package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6221 extends AbstractRunnableC6224 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f15363;

    public C6221(long j, Runnable runnable) {
        super(j);
        this.f15363 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15363.run();
    }

    @Override // kotlinx.coroutines.AbstractRunnableC6224
    public final String toString() {
        return super.toString() + this.f15363;
    }
}
