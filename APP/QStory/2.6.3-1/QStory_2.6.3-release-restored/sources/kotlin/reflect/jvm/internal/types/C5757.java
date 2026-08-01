package kotlin.reflect.jvm.internal.types;

import io.ktor.util.C5043;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import p113.InterfaceC8052;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5757 extends AbstractC5758 implements InterfaceC8052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5919 f14606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5756 f14607;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757(InterfaceC5919 interfaceC5919, C5756 c5756, boolean z) {
        super(CapturedKType$1.INSTANCE);
        c5756.getClass();
        this.f14606 = interfaceC5919;
        this.f14607 = c5756;
        this.f14605 = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5757)) {
            return false;
        }
        C5757 c5757 = (C5757) obj;
        return AbstractC5227.m9466(this.f14606, c5757.f14606) && AbstractC5227.m9466(this.f14607, c5757.f14607) && this.f14605 == c5757.f14605;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    public final int hashCode() {
        InterfaceC5919 interfaceC5919 = this.f14606;
        int iHashCode = interfaceC5919 != null ? interfaceC5919.hashCode() : 0;
        return Boolean.hashCode(this.f14605) + ((this.f14607.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    public final String toString() {
        return this.f14607.toString();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC5758 mo10472() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC5758 mo10473(boolean z) {
        return z == this.f14605 ? this : new C5757(this.f14606, this.f14607, z);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC5758 mo10474(boolean z) {
        if (!z) {
            return this;
        }
        C5043.m9154(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC5758 mo10475() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean mo10476() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9455() {
        return this.f14605;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5919 mo10477() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo9457() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean mo10478() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5924 mo9458() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo10479() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5925 mo10480() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo10481() {
        return false;
    }
}
