package androidx.compose.foundation.lazy.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世兰苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲兰苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C1544 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6270 f2323;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1545 f2324;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo1656(AbstractC2961 abstractC2961) {
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1545(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m2061(ContinuationImpl continuationImpl) throws Throwable {
        C6270 c6270M11049 = this.f2323;
        if (c6270M11049 == null) {
            c6270M11049 = AbstractC6231.m11049();
            this.f2323 = c6270M11049;
            C1545 c1545 = this.f2324;
            if (c1545 != null && c1545.f6624) {
                c1545.m2062();
            }
        }
        Object objM11132 = c6270M11049.m11132(continuationImpl);
        return objM11132 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11132 : C6008.f15084;
    }
}
