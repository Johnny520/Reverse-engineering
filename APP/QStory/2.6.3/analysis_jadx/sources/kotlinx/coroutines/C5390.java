package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5390 extends AbstractRunnableC5392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5387 f15019;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5444 f15020;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5390(AbstractC5387 abstractC5387, long j, C5444 c5444) {
        super(j);
        this.f15019 = abstractC5387;
        this.f15020 = c5444;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15020.m10537(this.f15019);
    }

    @Override // kotlinx.coroutines.AbstractRunnableC5392
    public final String toString() {
        return super.toString() + this.f15020;
    }
}
