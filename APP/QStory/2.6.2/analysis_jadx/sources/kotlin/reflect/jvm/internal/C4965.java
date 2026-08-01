package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.KParameter$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4965 extends AbstractC5059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4981 f14351;

    public C4965(AbstractC4981 abstractC4981) {
        abstractC4981.getClass();
        this.f14351 = abstractC4981;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final int getIndex() {
        return 0;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final KParameter$Kind getKind() {
        return KParameter$Kind.VALUE;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5086 getType() {
        return this.f14351.getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9957() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5063 mo9958() {
        return this.f14351;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo9959() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9961() {
        return false;
    }
}
