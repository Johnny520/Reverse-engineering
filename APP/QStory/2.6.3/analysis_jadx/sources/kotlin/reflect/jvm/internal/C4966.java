package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KParameter$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4966 extends AbstractC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4982 f14353;

    public C4966(AbstractC4982 abstractC4982) {
        abstractC4982.getClass();
        this.f14353 = abstractC4982;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final int getIndex() {
        return 0;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final KParameter$Kind getKind() {
        return KParameter$Kind.VALUE;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final InterfaceC5087 getType() {
        return this.f14353.getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9954() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5064 mo9955() {
        return this.f14353;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo9956() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9958() {
        return false;
    }
}
