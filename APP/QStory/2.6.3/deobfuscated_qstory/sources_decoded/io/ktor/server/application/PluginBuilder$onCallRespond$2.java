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
@InterfaceC6862(c = "io.ktor.server.application.PluginBuilder$onCallRespond$2", f = "PluginBuilder.kt", l = {178}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "PluginConfig", "Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onCallRespond$2 extends SuspendLambda implements InterfaceC6552 {
    final /* synthetic */ InterfaceC6551 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onCallRespond$2(InterfaceC6551 interfaceC6551, InterfaceC4357<? super PluginBuilder$onCallRespond$2> interfaceC4357) {
        super(4, interfaceC4357);
        this.$block = interfaceC6551;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(C4061 c4061, InterfaceC4065 interfaceC4065, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        PluginBuilder$onCallRespond$2 pluginBuilder$onCallRespond$2 = new PluginBuilder$onCallRespond$2(this.$block, interfaceC4357);
        pluginBuilder$onCallRespond$2.L$0 = c4061;
        pluginBuilder$onCallRespond$2.L$1 = interfaceC4065;
        return pluginBuilder$onCallRespond$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4061 c4061 = (C4061) this.L$0;
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) this.L$1;
            InterfaceC6551 interfaceC6551 = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC6551.invoke(c4061, interfaceC4065, this) == coroutineSingletons) {
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
