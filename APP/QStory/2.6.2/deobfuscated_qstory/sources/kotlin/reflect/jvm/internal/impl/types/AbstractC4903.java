package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4903 extends AbstractC4906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f14223;

    public AbstractC4903(AbstractC4877 abstractC4877) {
        this.f14223 = abstractC4877;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return c4873 != mo9733() ? new C4887(this, c4873) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        return z == mo9735() ? this : this.f14223.mo9741(z).mo9776(mo9733());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4877 mo9787() {
        return this.f14223;
    }
}
