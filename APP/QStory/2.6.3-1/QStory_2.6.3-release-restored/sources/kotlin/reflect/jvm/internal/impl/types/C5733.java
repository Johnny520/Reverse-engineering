package kotlin.reflect.jvm.internal.impl.types;

import io.ktor.websocket.C5098;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.renderer.C5575;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5733 extends AbstractC5728 implements InterfaceC5750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC5714 f14569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5728 f14570;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5733(AbstractC5728 abstractC5728, AbstractC5714 abstractC5714) {
        super(abstractC5728.f14561, abstractC5728.f14562);
        abstractC5728.getClass();
        abstractC5714.getClass();
        this.f14570 = abstractC5728;
        this.f14569 = abstractC5714;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14569 + ")] " + this.f14570;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5728 abstractC5728 = this.f14570;
        abstractC5728.getClass();
        AbstractC5714 abstractC5714 = this.f14569;
        abstractC5714.getClass();
        return new C5733(abstractC5728, abstractC5714);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5750
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC5714 mo10336() {
        return this.f14569;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5750
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC5746 mo10337() {
        return this.f14570;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo10394(C5576 c5576, C5576 c55762) {
        C5098 c5098 = c55762.f14237.f14219;
        InterfaceC5920 interfaceC5920 = C5575.f14181[11];
        c5098.getClass();
        interfaceC5920.getClass();
        return ((Boolean) c5098.f13151).booleanValue() ? c5576.m10045(this.f14569) : this.f14570.mo10394(c5576, c55762);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10395() {
        return this.f14570.mo10395();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5728 abstractC5728 = this.f14570;
        abstractC5728.getClass();
        AbstractC5714 abstractC5714 = this.f14569;
        abstractC5714.getClass();
        return new C5733(abstractC5728, abstractC5714);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC5746 mo10290(boolean z) {
        return AbstractC5725.m10364(this.f14570.mo10290(z), this.f14569.mo10331().mo10290(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5746 mo10329(C5706 c5706) {
        c5706.getClass();
        return AbstractC5725.m10364(this.f14570.mo10329(c5706), this.f14569);
    }
}
