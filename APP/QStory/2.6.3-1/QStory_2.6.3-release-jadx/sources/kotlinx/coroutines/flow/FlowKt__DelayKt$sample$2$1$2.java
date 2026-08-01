package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, m152k = 3, m153mv = {2, 2, 0})
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m556f = "Delay.kt", m557l = {293}, m558m = "invokeSuspend", m559v = 1)
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6150 $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC6150 interfaceC6150, InterfaceC5189<? super FlowKt__DelayKt$sample$2$1$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = interfaceC6150;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(c6008, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == null) {
                return c6008;
            }
            ref$ObjectRef.element = null;
            InterfaceC6150 interfaceC6150 = this.$downstream;
            if (obj2 == AbstractC6051.f15152) {
                obj2 = null;
            }
            this.L$0 = null;
            this.label = 1;
            if (interfaceC6150.emit(obj2, this) == coroutineSingletons) {
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
