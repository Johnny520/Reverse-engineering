package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Intent;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1", f = "Context.kt", l = {247}, m = "invokeSuspend", v = 1)
public final class ContextKt$receiveBroadcastsAsync$2$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ InterfaceC6550 $onReceive;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$receiveBroadcastsAsync$2$1$1(InterfaceC6550 interfaceC6550, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC4356<? super ContextKt$receiveBroadcastsAsync$2$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$onReceive = interfaceC6550;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ContextKt$receiveBroadcastsAsync$2$1$1 contextKt$receiveBroadcastsAsync$2$1$1 = new ContextKt$receiveBroadcastsAsync$2$1$1(this.$onReceive, this.$pendingResult, this.$intent, interfaceC4356);
        contextKt$receiveBroadcastsAsync$2$1$1.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ContextKt$receiveBroadcastsAsync$2$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                AbstractC5398.m10498(((InterfaceC5400) this.L$0).mo2420());
                InterfaceC6550 interfaceC6550 = this.$onReceive;
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                Intent intent = this.$intent;
                this.label = 1;
                if (interfaceC6550.invoke(pendingResult, intent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            this.$pendingResult.finish();
            this = C5175.f14739;
            return this;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
