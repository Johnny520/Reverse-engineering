package io.ktor.server.application;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.PluginBuilder$onDefaultPhase$1", f = "PluginBuilder.kt", l = {Opcodes.RSUB_INT_LIT8}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0002H\n"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏世兰哲;", "ContextT", "", "T", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onDefaultPhase$1 extends SuspendLambda implements InterfaceC6552 {
    final /* synthetic */ InterfaceC6552 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onDefaultPhase$1(InterfaceC6552 interfaceC6552, InterfaceC4357<? super PluginBuilder$onDefaultPhase$1> interfaceC4357) {
        super(4, interfaceC4357);
        this.$block = interfaceC6552;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(AbstractC4067 abstractC4067, InterfaceC4065 interfaceC4065, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        PluginBuilder$onDefaultPhase$1 pluginBuilder$onDefaultPhase$1 = new PluginBuilder$onDefaultPhase$1(this.$block, interfaceC4357);
        pluginBuilder$onDefaultPhase$1.L$0 = abstractC4067;
        pluginBuilder$onDefaultPhase$1.L$1 = interfaceC4065;
        pluginBuilder$onDefaultPhase$1.L$2 = obj;
        return pluginBuilder$onDefaultPhase$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4067 abstractC4067 = (AbstractC4067) this.L$0;
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) this.L$1;
            Object obj2 = this.L$2;
            InterfaceC6552 interfaceC6552 = this.$block;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (interfaceC6552.invoke(abstractC4067, interfaceC4065, obj2, this) == coroutineSingletons) {
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
