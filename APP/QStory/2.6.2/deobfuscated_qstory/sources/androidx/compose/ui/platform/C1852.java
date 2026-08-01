package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1372;
import kotlin.InterfaceC5167;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC4383;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1852 implements InterfaceC1869, InterfaceC4383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1372 f5360;

    public C1852(AbstractC1372 abstractC1372) {
        this.f5360 = abstractC1372;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1869) && (obj instanceof InterfaceC4383)) {
            return mo3470().equals(((InterfaceC4383) obj).mo3470());
        }
        return false;
    }

    public final int hashCode() {
        return mo3470().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC4383
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5167 mo3470() {
        return new FunctionReferenceImpl(1, this.f5360, AbstractC1372.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }
}
