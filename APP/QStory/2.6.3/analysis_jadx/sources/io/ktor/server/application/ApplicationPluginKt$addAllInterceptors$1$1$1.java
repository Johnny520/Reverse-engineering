package io.ktor.server.application;

import io.ktor.server.routing.C4156;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.ApplicationPluginKt$addAllInterceptors$1$1$1", f = "ApplicationPlugin.kt", l = {172}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"TSubject", "TContext", "Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "subject", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class ApplicationPluginKt$addAllInterceptors$1$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $interceptor;
    final /* synthetic */ InterfaceC4068 $plugin;
    final /* synthetic */ Object $pluginInstance;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationPluginKt$addAllInterceptors$1$1$1(InterfaceC4068 interfaceC4068, Object obj, InterfaceC6551 interfaceC6551, InterfaceC4357<? super ApplicationPluginKt$addAllInterceptors$1$1$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$plugin = interfaceC4068;
        this.$pluginInstance = obj;
        this.$interceptor = interfaceC6551;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        ApplicationPluginKt$addAllInterceptors$1$1$1 applicationPluginKt$addAllInterceptors$1$1$1 = new ApplicationPluginKt$addAllInterceptors$1$1$1(this.$plugin, this.$pluginInstance, this.$interceptor, interfaceC4357);
        applicationPluginKt$addAllInterceptors$1$1$1.L$0 = abstractC4194;
        applicationPluginKt$addAllInterceptors$1$1$1.L$1 = obj;
        return applicationPluginKt$addAllInterceptors$1$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC4194.f12664;
            if ((obj3 instanceof C4156) && AbstractC4395.m8907(AbstractC4060.m8466(((C4156) obj3).f12588, this.$plugin), this.$pluginInstance)) {
                InterfaceC6551 interfaceC6551 = this.$interceptor;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC6551.invoke(abstractC4194, obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
