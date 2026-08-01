package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import p068.InterfaceC7387;
import p114.C8061;
import p114.C8070;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5721 extends AbstractC5710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8083 f14549;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC7387 f14551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5705 f14552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14553;

    public C5721(InterfaceC5705 interfaceC5705, List list, boolean z, InterfaceC8083 interfaceC8083, InterfaceC7387 interfaceC7387) {
        interfaceC5705.getClass();
        list.getClass();
        interfaceC8083.getClass();
        this.f14552 = interfaceC5705;
        this.f14553 = list;
        this.f14550 = z;
        this.f14549 = interfaceC8083;
        this.f14551 = interfaceC7387;
        if (!(interfaceC8083 instanceof C8061) || (interfaceC8083 instanceof C8070)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC8083 + '\n' + interfaceC5705);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = (AbstractC5710) this.f14551.invoke(abstractC5693);
        return abstractC5710 == null ? this : abstractC5710;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC5705 mo10281() {
        return this.f14552;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C5706 mo10282() {
        C5706.f14520.getClass();
        return C5706.f14521;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo10283() {
        return this.f14549;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return this.f14550;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo10285() {
        return this.f14553;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return c5706.isEmpty() ? this : new C5720(this, c5706);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        return z == this.f14550 ? this : z ? new C5711(this, 1) : new C5711(this, 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = (AbstractC5710) this.f14551.invoke(abstractC5693);
        return abstractC5710 == null ? this : abstractC5710;
    }
}
