package io.ktor.server.application;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.PluginBuilder$onCall$2", f = "PluginBuilder.kt", l = {90}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "PluginConfig", "Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<unused var>", "<anonymous>", "(Lio/ktor/server/application/OnCallContext;Lio/ktor/server/application/PipelineCall;V)V"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onCall$2 extends SuspendLambda implements InterfaceC6552 {
    final /* synthetic */ InterfaceC6551 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onCall$2(InterfaceC6551 interfaceC6551, InterfaceC4357<? super PluginBuilder$onCall$2> interfaceC4357) {
        super(4, interfaceC4357);
        this.$block = interfaceC6551;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(C4070 c4070, InterfaceC4065 interfaceC4065, C5176 c5176, InterfaceC4357<? super C5176> interfaceC4357) {
        PluginBuilder$onCall$2 pluginBuilder$onCall$2 = new PluginBuilder$onCall$2(this.$block, interfaceC4357);
        pluginBuilder$onCall$2.L$0 = c4070;
        pluginBuilder$onCall$2.L$1 = interfaceC4065;
        return pluginBuilder$onCall$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4070 c4070 = (C4070) this.L$0;
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) this.L$1;
            InterfaceC6551 interfaceC6551 = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC6551.invoke(c4070, interfaceC4065, this) == coroutineSingletons) {
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
