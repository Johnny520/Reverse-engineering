package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5388 extends AbstractRunnableC5391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f15018;

    public C5388(long j, Runnable runnable) {
        super(j);
        this.f15018 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15018.run();
    }

    @Override // kotlinx.coroutines.AbstractRunnableC5391
    public final String toString() {
        return super.toString() + this.f15018;
    }
}
