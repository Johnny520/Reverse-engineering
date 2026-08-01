package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Intent;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1", m556f = "Context.kt", m557l = {247}, m558m = "invokeSuspend", m559v = 1)
public final class ContextKt$receiveBroadcastsAsync$2$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ InterfaceC7380 $onReceive;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$receiveBroadcastsAsync$2$1$1(InterfaceC7380 interfaceC7380, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC5189<? super ContextKt$receiveBroadcastsAsync$2$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onReceive = interfaceC7380;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ContextKt$receiveBroadcastsAsync$2$1$1 contextKt$receiveBroadcastsAsync$2$1$1 = new ContextKt$receiveBroadcastsAsync$2$1$1(this.$onReceive, this.$pendingResult, this.$intent, interfaceC5189);
        contextKt$receiveBroadcastsAsync$2$1$1.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ContextKt$receiveBroadcastsAsync$2$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AbstractC6231.m11061(((InterfaceC6233) this.L$0).mo2990());
                InterfaceC7380 interfaceC7380 = this.$onReceive;
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                Intent intent = this.$intent;
                this.label = 1;
                if (interfaceC7380.invoke(pendingResult, intent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            this.$pendingResult.finish();
            this = C6008.f15084;
            return this;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
