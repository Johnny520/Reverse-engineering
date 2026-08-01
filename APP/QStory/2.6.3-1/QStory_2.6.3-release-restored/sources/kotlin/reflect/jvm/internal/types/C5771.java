package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5771 extends AbstractC5758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5758 f14642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5758 f14643;

    public C5771(AbstractC5758 abstractC5758, AbstractC5758 abstractC57582, boolean z, InterfaceC7372 interfaceC7372) {
        super(interfaceC7372);
        this.f14642 = abstractC5758;
        this.f14643 = abstractC57582;
        this.f14641 = z;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return this.f14642.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC5758 mo10472() {
        return this.f14643;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5758 mo10473(boolean z) {
        AbstractC5758 abstractC5758Mo10473 = this.f14642.mo10473(z);
        AbstractC5758 abstractC5758Mo104732 = this.f14643.mo10473(z);
        return abstractC5758Mo10473.equals(abstractC5758Mo104732) ? abstractC5758Mo10473 : new C5771(abstractC5758Mo10473, abstractC5758Mo104732, this.f14641, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC5758 mo10474(boolean z) {
        AbstractC5758 abstractC5758Mo10474 = this.f14642.mo10474(z);
        AbstractC5758 abstractC5758Mo104742 = this.f14643.mo10474(z);
        return abstractC5758Mo10474.equals(abstractC5758Mo104742) ? abstractC5758Mo10474 : new C5771(abstractC5758Mo10474, abstractC5758Mo104742, this.f14641, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC5758 mo10475() {
        return this.f14642;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo10476() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9455() {
        return this.f14642.mo9455();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5919 mo10477() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo9457() {
        return this.f14642.mo9457();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo10478() {
        return this.f14641;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5924 mo9458() {
        return this.f14642.mo9458();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo10479() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5925 mo10480() {
        return this.f14642.mo10480();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo10481() {
        return false;
    }
}
