package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.types.AbstractC4926;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5041 extends AbstractC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4926 f14527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5064 f14528;

    public C5041(AbstractC5007 abstractC5007, InterfaceC5093 interfaceC5093) {
        abstractC5007.getClass();
        interfaceC5093.getClass();
        this.f14528 = abstractC5007;
        this.f14527 = AbstractC4406.m8932(interfaceC5093);
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
        return KParameter$Kind.INSTANCE;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final InterfaceC5087 getType() {
        return this.f14527;
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9954() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5064 mo9955() {
        return this.f14528;
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
