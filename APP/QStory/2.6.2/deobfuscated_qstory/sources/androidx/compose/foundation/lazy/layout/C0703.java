package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世兰苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲兰苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C0703 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5437 f1977;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C0704 f1978;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo1095(AbstractC2128 abstractC2128) {
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C0704(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m1491(ContinuationImpl continuationImpl) throws Throwable {
        C5437 c5437M10486 = this.f1977;
        if (c5437M10486 == null) {
            c5437M10486 = AbstractC5398.m10486();
            this.f1977 = c5437M10486;
            C0704 c0704 = this.f1978;
            if (c0704 != null && c0704.f6278) {
                c0704.m1492();
            }
        }
        Object objM10570 = c5437M10486.m10570(continuationImpl);
        return objM10570 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10570 : C5175.f14739;
    }
}
