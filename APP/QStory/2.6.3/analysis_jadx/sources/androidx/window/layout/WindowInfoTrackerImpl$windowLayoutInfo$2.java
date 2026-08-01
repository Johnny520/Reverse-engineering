package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.InterfaceC2188;
import androidx.profileinstaller.ExecutorC2441;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {62}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/window/layout/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class WindowInfoTrackerImpl$windowLayoutInfo$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2601 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$2(C2601 c2601, Activity activity, InterfaceC4357<? super WindowInfoTrackerImpl$windowLayoutInfo$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c2601;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5196 interfaceC5196, C2598 c2598) {
        ((AbstractC5211) interfaceC5196).mo8436(c2598);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$1(C2601 c2601, InterfaceC2188 interfaceC2188) {
        c2601.f7786.mo5107(interfaceC2188);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        WindowInfoTrackerImpl$windowLayoutInfo$2 windowInfoTrackerImpl$windowLayoutInfo$2 = new WindowInfoTrackerImpl$windowLayoutInfo$2(this.this$0, this.$activity, interfaceC4357);
        windowInfoTrackerImpl$windowLayoutInfo$2.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$2) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5196 interfaceC5196 = (InterfaceC5196) this.L$0;
            C2596 c2596 = new C2596(interfaceC5196, i2);
            this.this$0.f7786.mo5106(this.$activity, new ExecutorC2441(), c2596);
            C2600 c2600 = new C2600(this.this$0, c2596, i2);
            this.label = 1;
            if (AbstractC5205.m10279(interfaceC5196, c2600, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
