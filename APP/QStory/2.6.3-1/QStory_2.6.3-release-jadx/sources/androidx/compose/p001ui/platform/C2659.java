package androidx.compose.p001ui.platform;

import android.view.Choreographer;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.InterfaceC2139;
import androidx.window.area.AbstractC3400;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2659 implements InterfaceC2139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2657 f5659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Choreographer f5660;

    public C2659(Choreographer choreographer, C2657 c2657) {
        this.f5660 = choreographer;
        this.f5659 = c2657;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // androidx.compose.runtime.InterfaceC2139
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final Object mo2865(InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        final C2657 c2657 = this.f5659;
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        final ChoreographerFrameCallbackC2660 choreographerFrameCallbackC2660 = new ChoreographerFrameCallbackC2660(c6276, this, interfaceC7387);
        if (AbstractC5227.m9466(c2657.f5656, this.f5660)) {
            synchronized (c2657.f5651) {
                c2657.f5654.add(choreographerFrameCallbackC2660);
                if (!c2657.f5653) {
                    c2657.f5653 = true;
                    c2657.f5656.postFrameCallback(c2657.f5649);
                }
            }
            c6276.m11100(new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C2657 c26572 = c2657;
                    Choreographer.FrameCallback frameCallback = choreographerFrameCallbackC2660;
                    synchronized (c26572.f5651) {
                        c26572.f5654.remove(frameCallback);
                    }
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C6008.f15084;
                }
            });
        } else {
            this.f5660.postFrameCallback(choreographerFrameCallbackC2660);
            c6276.m11100(new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    this.this$0.f5660.removeFrameCallback(choreographerFrameCallbackC2660);
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C6008.f15084;
                }
            });
        }
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }
}
