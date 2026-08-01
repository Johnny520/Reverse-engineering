package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", m556f = "Migration.kt", m557l = {423}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, m151d2 = {"T", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayEach$1(long j, InterfaceC5189<? super FlowKt__MigrationKt$delayEach$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$timeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FlowKt__MigrationKt$delayEach$1(this.$timeMillis, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__MigrationKt$delayEach$1) create(obj, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long j = this.$timeMillis;
            this.label = 1;
            if (AbstractC6231.m11058(j, this) == coroutineSingletons) {
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
