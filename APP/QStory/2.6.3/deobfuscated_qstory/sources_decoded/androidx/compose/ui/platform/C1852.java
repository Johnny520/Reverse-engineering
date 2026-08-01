package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1372;
import kotlin.InterfaceC5168;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC4384;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1852 implements InterfaceC1869, InterfaceC4384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1372 f5361;

    public C1852(AbstractC1372 abstractC1372) {
        this.f5361 = abstractC1372;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1869) && (obj instanceof InterfaceC4384)) {
            return mo3480().equals(((InterfaceC4384) obj).mo3480());
        }
        return false;
    }

    public final int hashCode() {
        return mo3480().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC4384
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5168 mo3480() {
        return new FunctionReferenceImpl(1, this.f5361, AbstractC1372.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }
}
