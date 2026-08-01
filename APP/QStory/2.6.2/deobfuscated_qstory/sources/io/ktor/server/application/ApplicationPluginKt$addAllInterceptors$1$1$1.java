package io.ktor.server.application;

import io.ktor.server.routing.C4155;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.ApplicationPluginKt$addAllInterceptors$1$1$1", f = "ApplicationPlugin.kt", l = {172}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"TSubject", "TContext", "Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "subject", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class ApplicationPluginKt$addAllInterceptors$1$1$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $interceptor;
    final /* synthetic */ InterfaceC4067 $plugin;
    final /* synthetic */ Object $pluginInstance;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationPluginKt$addAllInterceptors$1$1$1(InterfaceC4067 interfaceC4067, Object obj, InterfaceC6550 interfaceC6550, InterfaceC4356<? super ApplicationPluginKt$addAllInterceptors$1$1$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$plugin = interfaceC4067;
        this.$pluginInstance = obj;
        this.$interceptor = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        ApplicationPluginKt$addAllInterceptors$1$1$1 applicationPluginKt$addAllInterceptors$1$1$1 = new ApplicationPluginKt$addAllInterceptors$1$1$1(this.$plugin, this.$pluginInstance, this.$interceptor, interfaceC4356);
        applicationPluginKt$addAllInterceptors$1$1$1.L$0 = abstractC4193;
        applicationPluginKt$addAllInterceptors$1$1$1.L$1 = obj;
        return applicationPluginKt$addAllInterceptors$1$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC4193.f12660;
            if ((obj3 instanceof C4155) && AbstractC4394.m8917(AbstractC4059.m8476(((C4155) obj3).f12584, this.$plugin), this.$pluginInstance)) {
                InterfaceC6550 interfaceC6550 = this.$interceptor;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC6550.invoke(abstractC4193, obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
