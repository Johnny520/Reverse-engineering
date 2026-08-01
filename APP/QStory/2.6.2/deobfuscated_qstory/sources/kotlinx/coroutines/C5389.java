package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5389 extends AbstractRunnableC5391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5386 f15019;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5443 f15020;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5389(AbstractC5386 abstractC5386, long j, C5443 c5443) {
        super(j);
        this.f15019 = abstractC5386;
        this.f15020 = c5443;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15020.m10533(this.f15019);
    }

    @Override // kotlinx.coroutines.AbstractRunnableC5391
    public final String toString() {
        return super.toString() + this.f15020;
    }
}
