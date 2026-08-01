package io.ktor.server.application;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.PluginBuilder$onDefaultPhase$1", f = "PluginBuilder.kt", l = {Opcodes.RSUB_INT_LIT8}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0002H\n"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏世兰哲;", "ContextT", "", "T", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onDefaultPhase$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onDefaultPhase$1(InterfaceC6551 interfaceC6551, InterfaceC4356<? super PluginBuilder$onDefaultPhase$1> interfaceC4356) {
        super(4, interfaceC4356);
        this.$block = interfaceC6551;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4066 abstractC4066, InterfaceC4064 interfaceC4064, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        PluginBuilder$onDefaultPhase$1 pluginBuilder$onDefaultPhase$1 = new PluginBuilder$onDefaultPhase$1(this.$block, interfaceC4356);
        pluginBuilder$onDefaultPhase$1.L$0 = abstractC4066;
        pluginBuilder$onDefaultPhase$1.L$1 = interfaceC4064;
        pluginBuilder$onDefaultPhase$1.L$2 = obj;
        return pluginBuilder$onDefaultPhase$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4066 abstractC4066 = (AbstractC4066) this.L$0;
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) this.L$1;
            Object obj2 = this.L$2;
            InterfaceC6551 interfaceC6551 = this.$block;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (interfaceC6551.invoke(abstractC4066, interfaceC4064, obj2, this) == coroutineSingletons) {
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
