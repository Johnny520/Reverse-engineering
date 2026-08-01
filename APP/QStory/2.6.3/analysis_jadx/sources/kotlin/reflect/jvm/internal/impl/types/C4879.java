package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4879 extends AbstractC4904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f14184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4879(AbstractC4878 abstractC4878, int i) {
        super(abstractC4878);
        this.f14184 = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        switch (this.f14184) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        switch (this.f14184) {
            case 0:
                return new C4879(abstractC4878, 0);
            default:
                return new C4879(abstractC4878, 1);
        }
    }
}
