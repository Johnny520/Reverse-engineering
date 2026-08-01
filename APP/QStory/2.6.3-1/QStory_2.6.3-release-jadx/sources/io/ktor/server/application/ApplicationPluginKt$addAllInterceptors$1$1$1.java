package io.ktor.server.application;

import io.ktor.server.routing.C4988;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.ApplicationPluginKt$addAllInterceptors$1$1$1", m556f = "ApplicationPlugin.kt", m557l = {172}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, m151d2 = {"TSubject", "TContext", "Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "subject", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 0, 0})
final class ApplicationPluginKt$addAllInterceptors$1$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $interceptor;
    final /* synthetic */ InterfaceC4900 $plugin;
    final /* synthetic */ Object $pluginInstance;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationPluginKt$addAllInterceptors$1$1$1(InterfaceC4900 interfaceC4900, Object obj, InterfaceC7380 interfaceC7380, InterfaceC5189<? super ApplicationPluginKt$addAllInterceptors$1$1$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$plugin = interfaceC4900;
        this.$pluginInstance = obj;
        this.$interceptor = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        ApplicationPluginKt$addAllInterceptors$1$1$1 applicationPluginKt$addAllInterceptors$1$1$1 = new ApplicationPluginKt$addAllInterceptors$1$1$1(this.$plugin, this.$pluginInstance, this.$interceptor, interfaceC5189);
        applicationPluginKt$addAllInterceptors$1$1$1.L$0 = abstractC5026;
        applicationPluginKt$addAllInterceptors$1$1$1.L$1 = obj;
        return applicationPluginKt$addAllInterceptors$1$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC5026.f13009;
            if ((obj3 instanceof C4988) && AbstractC5227.m9466(AbstractC4892.m9025(((C4988) obj3).f12933, this.$plugin), this.$pluginInstance)) {
                InterfaceC7380 interfaceC7380 = this.$interceptor;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC7380.invoke(abstractC5026, obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
