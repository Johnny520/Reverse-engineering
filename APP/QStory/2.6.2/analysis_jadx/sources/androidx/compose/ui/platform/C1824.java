package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.InterfaceC1304;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3055;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1824 implements InterfaceC1304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1822 f5313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Choreographer f5314;

    public C1824(Choreographer choreographer, C1822 c1822) {
        this.f5314 = choreographer;
        this.f5313 = c1822;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }

    @Override // androidx.compose.runtime.InterfaceC1304
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final Object mo2295(InterfaceC6557 interfaceC6557, InterfaceC4356 interfaceC4356) {
        final C1822 c1822 = this.f5313;
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        final ChoreographerFrameCallbackC1825 choreographerFrameCallbackC1825 = new ChoreographerFrameCallbackC1825(c5443, this, interfaceC6557);
        if (AbstractC4394.m8917(c1822.f5310, this.f5314)) {
            synchronized (c1822.f5305) {
                c1822.f5308.add(choreographerFrameCallbackC1825);
                if (!c1822.f5307) {
                    c1822.f5307 = true;
                    c1822.f5310.postFrameCallback(c1822.f5303);
                }
            }
            c5443.m10537(new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C1822 c18222 = c1822;
                    Choreographer.FrameCallback frameCallback = choreographerFrameCallbackC1825;
                    synchronized (c18222.f5305) {
                        c18222.f5308.remove(frameCallback);
                    }
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5175.f14739;
                }
            });
        } else {
            this.f5314.postFrameCallback(choreographerFrameCallbackC1825);
            c5443.m10537(new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    this.this$0.f5314.removeFrameCallback(choreographerFrameCallbackC1825);
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5175.f14739;
                }
            });
        }
        Object objM10536 = c5443.m10536();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10536;
    }
}
