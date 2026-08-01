package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4878 extends AbstractC4903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f14180;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4878(AbstractC4877 abstractC4877, int i) {
        super(abstractC4877);
        this.f14180 = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        switch (this.f14180) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        switch (this.f14180) {
            case 0:
                return new C4878(abstractC4877, 0);
            default:
                return new C4878(abstractC4877, 1);
        }
    }
}
