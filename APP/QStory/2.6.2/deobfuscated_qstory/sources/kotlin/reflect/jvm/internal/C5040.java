package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.internal.types.AbstractC4925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5040 extends AbstractC5059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4925 f14525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5063 f14526;

    public C5040(AbstractC5006 abstractC5006, InterfaceC5092 interfaceC5092) {
        abstractC5006.getClass();
        interfaceC5092.getClass();
        this.f14526 = abstractC5006;
        this.f14525 = AbstractC4405.m8942(interfaceC5092);
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
        return KParameter$Kind.INSTANCE;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5086 getType() {
        return this.f14525;
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9957() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5063 mo9958() {
        return this.f14526;
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
