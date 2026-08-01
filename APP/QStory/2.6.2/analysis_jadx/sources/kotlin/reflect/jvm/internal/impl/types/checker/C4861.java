package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.compose.runtime.C1322;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p049.AbstractC6529;
import p052.InterfaceC6542;
import p069.InterfaceC6895;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4861 implements InterfaceC6895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f14140;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4462 f14141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC6542 f14142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4861 f14143;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4869 f14144;

    public C4861(AbstractC4869 abstractC4869, InterfaceC6542 interfaceC6542, C4861 c4861, InterfaceC4462 interfaceC4462) {
        abstractC4869.getClass();
        this.f14144 = abstractC4869;
        this.f14142 = interfaceC6542;
        this.f14143 = c4861;
        this.f14141 = interfaceC4462;
        this.f14140 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4861.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4861 c4861 = (C4861) obj;
        C4861 c48612 = this.f14143;
        if (c48612 != null) {
            this = c48612;
        }
        C4861 c48613 = c4861.f14143;
        if (c48613 != null) {
            obj = c48613;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        C4861 c4861 = this.f14143;
        return c4861 != null ? c4861.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f14144 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        AbstractC4881 abstractC4881Mo9751 = this.f14144.mo9751();
        abstractC4881Mo9751.getClass();
        return AbstractC7738.m13053(abstractC4881Mo9751);
    }

    @Override // p069.InterfaceC6895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC4869 mo9730() {
        return this.f14144;
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
        List list = (List) this.f14140.getValue();
        return list == null ? EmptyList.INSTANCE : list;
    }

    public /* synthetic */ C4861(AbstractC4869 abstractC4869, C4864 c4864, InterfaceC4462 interfaceC4462, int i) {
        this(abstractC4869, (i & 2) != 0 ? null : c4864, (C4861) null, (i & 8) != 0 ? null : interfaceC4462);
    }
}
