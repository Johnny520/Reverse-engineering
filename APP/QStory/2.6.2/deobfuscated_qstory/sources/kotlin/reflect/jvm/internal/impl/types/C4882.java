package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1303;
import androidx.compose.ui.semantics.C1934;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p097.InterfaceC7230;
import p316.C8675;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4882 implements InterfaceC4872, InterfaceC7230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f14188;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14189;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC4881 f14190;

    public C4882(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f14188 = linkedHashSet;
        this.f14189 = linkedHashSet.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4882)) {
            return false;
        }
        return AbstractC4394.m8917(this.f14188, ((C4882) obj).f14188);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f14189;
    }

    public final String toString() {
        return m9780(C4898.f14218);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        AbstractC6529 abstractC6529Mo9503 = ((AbstractC4881) this.f14188.iterator().next()).mo9732().mo9503();
        abstractC6529Mo9503.getClass();
        return abstractC6529Mo9503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9780(InterfaceC6557 interfaceC6557) {
        interfaceC6557.getClass();
        return AbstractC4343.m8813(AbstractC4343.m8817(this.f14188, new C1934(interfaceC6557, 1)), " & ", "{", "}", new C1303(interfaceC6557, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4877 m9781() {
        C4873.f14171.getClass();
        return AbstractC4892.m9822(C4873.f14172, this, EmptyList.INSTANCE, false, C8675.m14364("member scope for intersection type", this.f14188), new C1012(this, 17));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4476 mo9221() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9504() {
        return this.f14188;
    }
}
