package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6222 extends AbstractRunnableC6224 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6219 f15364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6276 f15365;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6222(AbstractC6219 abstractC6219, long j, C6276 c6276) {
        super(j);
        this.f15364 = abstractC6219;
        this.f15365 = c6276;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15365.m11096(this.f15364);
    }

    @Override // kotlinx.coroutines.AbstractRunnableC6224
    public final String toString() {
        return super.toString() + this.f15365;
    }
}
