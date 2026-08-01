package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1850;
import androidx.compose.p001ui.semantics.C2769;
import androidx.compose.runtime.C2138;
import com.bumptech.glide.AbstractC3897;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p113.InterfaceC8060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5715 implements InterfaceC5705, InterfaceC8060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f14537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC5714 f14539;

    public C5715(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f14537 = linkedHashSet;
        this.f14538 = linkedHashSet.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5715)) {
            return false;
        }
        return AbstractC5227.m9466(this.f14537, ((C5715) obj).f14537);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f14538;
    }

    public final String toString() {
        return m10333(C5731.f14567);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        AbstractC7359 abstractC7359Mo10052 = ((AbstractC5714) this.f14537.iterator().next()).mo10281().mo10052();
        abstractC7359Mo10052.getClass();
        return abstractC7359Mo10052;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m10333(InterfaceC7387 interfaceC7387) {
        interfaceC7387.getClass();
        return AbstractC5176.m9369(AbstractC5176.m9337(this.f14537, new C2769(interfaceC7387, 1)), " & ", "{", "}", new C2138(interfaceC7387, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5710 m10334() {
        C5706.f14520.getClass();
        return AbstractC5725.m10375(C5706.f14521, this, EmptyList.INSTANCE, false, AbstractC3897.m7398("member scope for intersection type", this.f14537), new C1850(this, 17));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5309 mo9770() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo10053() {
        return this.f14537;
    }
}
