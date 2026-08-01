package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.compose.runtime.C2157;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p085.InterfaceC7725;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5694 implements InterfaceC7725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f14489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5295 f14490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC7372 f14491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5694 f14492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5702 f14493;

    public C5694(AbstractC5702 abstractC5702, InterfaceC7372 interfaceC7372, C5694 c5694, InterfaceC5295 interfaceC5295) {
        abstractC5702.getClass();
        this.f14493 = abstractC5702;
        this.f14491 = interfaceC7372;
        this.f14492 = c5694;
        this.f14490 = interfaceC5295;
        this.f14489 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C2157(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5694.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C5694 c5694 = (C5694) obj;
        C5694 c56942 = this.f14492;
        if (c56942 != null) {
            this = c56942;
        }
        C5694 c56943 = c5694.f14492;
        if (c56943 != null) {
            obj = c56943;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        C5694 c5694 = this.f14492;
        return c5694 != null ? c5694.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f14493 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        AbstractC5714 abstractC5714Mo10300 = this.f14493.mo10300();
        abstractC5714Mo10300.getClass();
        return AbstractC3738.m6877(abstractC5714Mo10300);
    }

    @Override // p085.InterfaceC7725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5702 mo10279() {
        return this.f14493;
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
        List list = (List) this.f14489.getValue();
        return list == null ? EmptyList.INSTANCE : list;
    }

    public /* synthetic */ C5694(AbstractC5702 abstractC5702, C5697 c5697, InterfaceC5295 interfaceC5295, int i) {
        this(abstractC5702, (i & 2) != 0 ? null : c5697, (C5694) null, (i & 8) != 0 ? null : interfaceC5295);
    }
}
