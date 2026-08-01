package kotlin.reflect.jvm.internal.types;

import com.bumptech.glide.AbstractC3889;
import java.util.List;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5759 extends AbstractC5758 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5925 f14609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f14610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f14612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f14613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5919 f14614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5924 f14616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14617;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5759(InterfaceC5924 interfaceC5924, List list, boolean z, List list2, InterfaceC5919 interfaceC5919, boolean z2, boolean z3, boolean z4, InterfaceC5925 interfaceC5925, InterfaceC7372 interfaceC7372) {
        super(interfaceC7372);
        interfaceC5924.getClass();
        list.getClass();
        list2.getClass();
        this.f14616 = interfaceC5924;
        this.f14617 = list;
        this.f14611 = z;
        this.f14610 = list2;
        this.f14614 = interfaceC5919;
        this.f14615 = z2;
        this.f14612 = z3;
        this.f14613 = z4;
        this.f14609 = interfaceC5925;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return this.f14610;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC5758 mo10472() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5758 mo10473(boolean z) {
        InterfaceC5924 interfaceC5924 = this.f14616;
        boolean z2 = interfaceC5924 instanceof InterfaceC5925;
        InterfaceC5924 interfaceC5924Mo9476 = interfaceC5924;
        if (z2) {
            InterfaceC5925 interfaceC5925 = (InterfaceC5925) interfaceC5924;
            if (z) {
                interfaceC5924Mo9476 = AbstractC5228.f13320.mo9476(AbstractC3889.m7317(interfaceC5925));
            } else {
                Class clsM7310 = AbstractC3889.m7310(interfaceC5925);
                interfaceC5924Mo9476 = interfaceC5925;
                if (clsM7310 != null) {
                    interfaceC5924Mo9476 = AbstractC5228.f13320.mo9476(clsM7310);
                }
            }
        }
        return new C5759(interfaceC5924Mo9476, this.f14617, z, this.f14610, this.f14614, false, this.f14612, this.f14613, this.f14609, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC5758 mo10474(boolean z) {
        return new C5759(this.f14616, this.f14617, this.f14611 && !z, this.f14610, this.f14614, z, this.f14612, this.f14613, this.f14609, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC5758 mo10475() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo10476() {
        return this.f14613;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9455() {
        return this.f14611;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5919 mo10477() {
        return this.f14614;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo9457() {
        return this.f14617;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo10478() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5924 mo9458() {
        return this.f14616;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo10479() {
        return this.f14612;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5925 mo10480() {
        return this.f14609;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo10481() {
        return this.f14615;
    }
}
