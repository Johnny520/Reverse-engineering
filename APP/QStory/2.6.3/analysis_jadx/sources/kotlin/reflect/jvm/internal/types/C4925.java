package kotlin.reflect.jvm.internal.types;

import io.ktor.util.C4211;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import p097.InterfaceC7223;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4925 extends AbstractC4926 implements InterfaceC7223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5087 f14261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4924 f14262;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4925(InterfaceC5087 interfaceC5087, C4924 c4924, boolean z) {
        super(CapturedKType$1.INSTANCE);
        c4924.getClass();
        this.f14261 = interfaceC5087;
        this.f14262 = c4924;
        this.f14260 = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4925)) {
            return false;
        }
        C4925 c4925 = (C4925) obj;
        return AbstractC4395.m8907(this.f14261, c4925.f14261) && AbstractC4395.m8907(this.f14262, c4925.f14262) && this.f14260 == c4925.f14260;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    public final int hashCode() {
        InterfaceC5087 interfaceC5087 = this.f14261;
        int iHashCode = interfaceC5087 != null ? interfaceC5087.hashCode() : 0;
        return Boolean.hashCode(this.f14260) + ((this.f14262.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    public final String toString() {
        return this.f14262.toString();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC4926 mo9913() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC4926 mo9914(boolean z) {
        return z == this.f14260 ? this : new C4925(this.f14261, this.f14262, z);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC4926 mo9915(boolean z) {
        if (!z) {
            return this;
        }
        C4211.m8595(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC4926 mo9916() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean mo9917() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8896() {
        return this.f14260;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5087 mo9918() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8898() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean mo9919() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5092 mo8899() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo9920() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5093 mo9921() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo9922() {
        return false;
    }
}
