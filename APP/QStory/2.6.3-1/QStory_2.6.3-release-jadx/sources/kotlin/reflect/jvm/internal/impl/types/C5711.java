package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5711 extends AbstractC5736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f14529;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5711(AbstractC5710 abstractC5710, int i) {
        super(abstractC5710);
        this.f14529 = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        switch (this.f14529) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        switch (this.f14529) {
            case 0:
                return new C5711(abstractC5710, 0);
            default:
                return new C5711(abstractC5710, 1);
        }
    }
}
