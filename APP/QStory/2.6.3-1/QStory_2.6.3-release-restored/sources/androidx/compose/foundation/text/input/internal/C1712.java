package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2232;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1712 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f2805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReference f2804 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2232 f2803 = AbstractC2202.m3038(0.0f);

    public C1712(boolean z) {
        this.f2805 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m2287(InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }
}
