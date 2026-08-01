package p085;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import net.bytebuddy.description.type.TypeDescription;
import p113.InterfaceC8052;
import p114.C8069;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7726 extends AbstractC5710 implements InterfaceC8052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5706 f18696;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f18697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5702 f18698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7724 f18699;

    public C7726(AbstractC5702 abstractC5702, C7724 c7724, boolean z, C5706 c5706) {
        abstractC5702.getClass();
        c5706.getClass();
        this.f18698 = abstractC5702;
        this.f18699 = c7724;
        this.f18697 = z;
        this.f18696 = c5706;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f18698);
        sb.append(')');
        sb.append(this.f18697 ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        return new C7726(this.f18698.mo10298(abstractC5693), this.f18699, this.f18697, this.f18696);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC5705 mo10281() {
        return this.f18699;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C5706 mo10282() {
        return this.f18696;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo10283() {
        return C8069.m13031(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return this.f18697;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo10285() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C7726(this.f18698, this.f18699, this.f18697, c5706);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        if (z == this.f18697) {
            return this;
        }
        return new C7726(this.f18698, this.f18699, z, this.f18696);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        return new C7726(this.f18698.mo10298(abstractC5693), this.f18699, this.f18697, this.f18696);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC5746 mo10290(boolean z) {
        if (z == this.f18697) {
            return this;
        }
        return new C7726(this.f18698, this.f18699, z, this.f18696);
    }
}
