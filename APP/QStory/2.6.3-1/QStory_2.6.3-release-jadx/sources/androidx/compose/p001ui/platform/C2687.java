package androidx.compose.p001ui.platform;

import androidx.compose.runtime.AbstractC2207;
import kotlin.InterfaceC6000;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC5216;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2687 implements InterfaceC2704, InterfaceC5216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2207 f5706;

    public C2687(AbstractC2207 abstractC2207) {
        this.f5706 = abstractC2207;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2704) && (obj instanceof InterfaceC5216)) {
            return mo4040().equals(((InterfaceC5216) obj).mo4040());
        }
        return false;
    }

    public final int hashCode() {
        return mo4040().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6000 mo4040() {
        return new FunctionReferenceImpl(1, this.f5706, AbstractC2207.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }
}
