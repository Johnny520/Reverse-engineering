package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1303;
import androidx.compose.ui.semantics.C1934;
import com.bumptech.glide.AbstractC3065;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p097.InterfaceC7231;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4883 implements InterfaceC4873, InterfaceC7231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f14192;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC4882 f14194;

    public C4883(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f14192 = linkedHashSet;
        this.f14193 = linkedHashSet.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4883)) {
            return false;
        }
        return AbstractC4395.m8907(this.f14192, ((C4883) obj).f14192);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f14193;
    }

    public final String toString() {
        return m9774(C4899.f14222);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        AbstractC6530 abstractC6530Mo9493 = ((AbstractC4882) this.f14192.iterator().next()).mo9722().mo9493();
        abstractC6530Mo9493.getClass();
        return abstractC6530Mo9493;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9774(InterfaceC6558 interfaceC6558) {
        interfaceC6558.getClass();
        return AbstractC4344.m8810(AbstractC4344.m8778(this.f14192, new C1934(interfaceC6558, 1)), " & ", "{", "}", new C1303(interfaceC6558, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4878 m9775() {
        C4874.f14175.getClass();
        return AbstractC4893.m9816(C4874.f14176, this, EmptyList.INSTANCE, false, AbstractC3065.m6838("member scope for intersection type", this.f14192), new C1012(this, 17));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9494() {
        return this.f14192;
    }
}
