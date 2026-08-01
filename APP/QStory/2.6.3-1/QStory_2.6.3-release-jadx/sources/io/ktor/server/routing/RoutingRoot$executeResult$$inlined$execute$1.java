package io.ktor.server.routing;

import io.ktor.util.pipeline.AbstractC5027;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.pipeline.PipelineKt$execute$2", m556f = "Pipeline.kt", m557l = {488}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V", "io/ktor/util/pipeline/PipelineKt$execute$2"}, m152k = 3, m153mv = {2, 0, 0})
public final class RoutingRoot$executeResult$$inlined$execute$1 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ Object $context;
    final /* synthetic */ AbstractC5027 $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingRoot$executeResult$$inlined$execute$1(AbstractC5027 abstractC5027, Object obj, InterfaceC5189 interfaceC5189) {
        super(1, interfaceC5189);
        this.$this_execute = abstractC5027;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new RoutingRoot$executeResult$$inlined$execute$1(this.$this_execute, this.$context, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RoutingRoot$executeResult$$inlined$execute$1) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5027 abstractC5027 = this.$this_execute;
            Object obj2 = this.$context;
            this.label = 1;
            if (abstractC5027.m9133(obj2, c6008, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return c6008;
    }
}
