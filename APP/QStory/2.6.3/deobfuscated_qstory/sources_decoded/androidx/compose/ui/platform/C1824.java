package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.InterfaceC1304;
import androidx.window.area.AbstractC2567;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1824 implements InterfaceC1304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1822 f5314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Choreographer f5315;

    public C1824(Choreographer choreographer, C1822 c1822) {
        this.f5315 = choreographer;
        this.f5314 = c1822;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    @Override // androidx.compose.runtime.InterfaceC1304
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final Object mo2305(InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) {
        final C1822 c1822 = this.f5314;
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        final ChoreographerFrameCallbackC1825 choreographerFrameCallbackC1825 = new ChoreographerFrameCallbackC1825(c5444, this, interfaceC6558);
        if (AbstractC4395.m8907(c1822.f5311, this.f5315)) {
            synchronized (c1822.f5306) {
                c1822.f5309.add(choreographerFrameCallbackC1825);
                if (!c1822.f5308) {
                    c1822.f5308 = true;
                    c1822.f5311.postFrameCallback(c1822.f5304);
                }
            }
            c5444.m10541(new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C1822 c18222 = c1822;
                    Choreographer.FrameCallback frameCallback = choreographerFrameCallbackC1825;
                    synchronized (c18222.f5306) {
                        c18222.f5309.remove(frameCallback);
                    }
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5176.f14739;
                }
            });
        } else {
            this.f5315.postFrameCallback(choreographerFrameCallbackC1825);
            c5444.m10541(new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    this.this$0.f5315.removeFrameCallback(choreographerFrameCallbackC1825);
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5176.f14739;
                }
            });
        }
        Object objM10540 = c5444.m10540();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10540;
    }
}
