package io.ktor.server.routing;

import io.ktor.util.pipeline.AbstractC4195;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", l = {488}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V", "io/ktor/util/pipeline/PipelineKt$execute$2"}, k = 3, mv = {2, 0, 0})
public final class RoutingRoot$executeResult$$inlined$execute$1 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ Object $context;
    final /* synthetic */ AbstractC4195 $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingRoot$executeResult$$inlined$execute$1(AbstractC4195 abstractC4195, Object obj, InterfaceC4357 interfaceC4357) {
        super(1, interfaceC4357);
        this.$this_execute = abstractC4195;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new RoutingRoot$executeResult$$inlined$execute$1(this.$this_execute, this.$context, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RoutingRoot$executeResult$$inlined$execute$1) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4195 abstractC4195 = this.$this_execute;
            Object obj2 = this.$context;
            this.label = 1;
            if (abstractC4195.m8574(obj2, c5176, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return c5176;
    }
}
