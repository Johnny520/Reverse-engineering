package io.ktor.server.application;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.PluginBuilder$onCallReceive$3", m556f = "PluginBuilder.kt", m557l = {165}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m151d2 = {"", "PluginConfig", "Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class PluginBuilder$onCallReceive$3 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC7380 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onCallReceive$3(InterfaceC7380 interfaceC7380, InterfaceC5189<? super PluginBuilder$onCallReceive$3> interfaceC5189) {
        super(4, interfaceC5189);
        this.$block = interfaceC7380;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(C4894 c4894, InterfaceC4897 interfaceC4897, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        PluginBuilder$onCallReceive$3 pluginBuilder$onCallReceive$3 = new PluginBuilder$onCallReceive$3(this.$block, interfaceC5189);
        pluginBuilder$onCallReceive$3.L$0 = c4894;
        pluginBuilder$onCallReceive$3.L$1 = interfaceC4897;
        return pluginBuilder$onCallReceive$3.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4894 c4894 = (C4894) this.L$0;
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) this.L$1;
            InterfaceC7380 interfaceC7380 = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC7380.invoke(c4894, interfaceC4897, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
