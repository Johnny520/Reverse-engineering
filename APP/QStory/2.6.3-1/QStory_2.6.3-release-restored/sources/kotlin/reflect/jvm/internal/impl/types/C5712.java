package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import p068.InterfaceC7372;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5712 extends AbstractC5714 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5679 f14530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5677 f14531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7372 f14532;

    public C5712(C5677 c5677, InterfaceC7372 interfaceC7372) {
        c5677.getClass();
        this.f14531 = c5677;
        this.f14532 = interfaceC7372;
        this.f14530 = new C5679(c5677, interfaceC7372);
    }

    public final String toString() {
        return this.f14530.m10134() ? m10332().toString() : "<Not computed yet>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final AbstractC5746 mo10331() {
        AbstractC5714 abstractC5714M10332 = m10332();
        while (abstractC5714M10332 instanceof C5712) {
            abstractC5714M10332 = ((C5712) abstractC5714M10332).m10332();
        }
        abstractC5714M10332.getClass();
        return (AbstractC5746) abstractC5714M10332;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        return new C5712(this.f14531, new C5860(abstractC5693, 11, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC5705 mo10281() {
        return m10332().mo10281();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C5706 mo10282() {
        return m10332().mo10282();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo10283() {
        return m10332().mo10283();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return m10332().mo10284();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo10285() {
        return m10332().mo10285();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC5714 m10332() {
        return (AbstractC5714) this.f14530.invoke();
    }
}
