package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Intent;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1", f = "Context.kt", l = {247}, m = "invokeSuspend", v = 1)
public final class ContextKt$receiveBroadcastsAsync$2$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ InterfaceC6551 $onReceive;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$receiveBroadcastsAsync$2$1$1(InterfaceC6551 interfaceC6551, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC4357<? super ContextKt$receiveBroadcastsAsync$2$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$onReceive = interfaceC6551;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ContextKt$receiveBroadcastsAsync$2$1$1 contextKt$receiveBroadcastsAsync$2$1$1 = new ContextKt$receiveBroadcastsAsync$2$1$1(this.$onReceive, this.$pendingResult, this.$intent, interfaceC4357);
        contextKt$receiveBroadcastsAsync$2$1$1.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ContextKt$receiveBroadcastsAsync$2$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                AbstractC5399.m10502(((InterfaceC5401) this.L$0).mo2430());
                InterfaceC6551 interfaceC6551 = this.$onReceive;
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                Intent intent = this.$intent;
                this.label = 1;
                if (interfaceC6551.invoke(pendingResult, intent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            this.$pendingResult.finish();
            this = C5176.f14739;
            return this;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
