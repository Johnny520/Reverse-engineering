package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5736 extends AbstractC5739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f14572;

    public AbstractC5736(AbstractC5710 abstractC5710) {
        this.f14572 = abstractC5710;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return c5706 != mo10282() ? new C5720(this, c5706) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        return z == mo10284() ? this : this.f14572.mo10290(z).mo10329(mo10282());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC5710 mo10340() {
        return this.f14572;
    }
}
