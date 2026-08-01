package io.ktor.server.application;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.PluginBuilder$onCallReceive$3", f = "PluginBuilder.kt", l = {165}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "PluginConfig", "Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onCallReceive$3 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6550 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onCallReceive$3(InterfaceC6550 interfaceC6550, InterfaceC4356<? super PluginBuilder$onCallReceive$3> interfaceC4356) {
        super(4, interfaceC4356);
        this.$block = interfaceC6550;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C4061 c4061, InterfaceC4064 interfaceC4064, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        PluginBuilder$onCallReceive$3 pluginBuilder$onCallReceive$3 = new PluginBuilder$onCallReceive$3(this.$block, interfaceC4356);
        pluginBuilder$onCallReceive$3.L$0 = c4061;
        pluginBuilder$onCallReceive$3.L$1 = interfaceC4064;
        return pluginBuilder$onCallReceive$3.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4061 c4061 = (C4061) this.L$0;
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) this.L$1;
            InterfaceC6550 interfaceC6550 = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC6550.invoke(c4061, interfaceC4064, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
