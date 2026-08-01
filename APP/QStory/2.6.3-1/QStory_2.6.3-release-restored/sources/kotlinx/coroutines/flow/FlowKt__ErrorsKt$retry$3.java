package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m556f = "Errors.kt", m557l = {91}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m151d2 = {"T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "cause", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;J)Z"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC7383 $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$retry$3(long j, InterfaceC7383 interfaceC7383, InterfaceC5189<? super FlowKt__ErrorsKt$retry$3> interfaceC5189) {
        super(4, interfaceC5189);
        this.$retries = j;
        this.$predicate = interfaceC7383;
    }

    @Override // p068.InterfaceC7381
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((InterfaceC6150) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC5189<? super Boolean>) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (j < this.$retries) {
                InterfaceC7383 interfaceC7383 = this.$predicate;
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                obj = interfaceC7383.invoke(th, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }

    public final Object invoke(InterfaceC6150 interfaceC6150, Throwable th, long j, InterfaceC5189<? super Boolean> interfaceC5189) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, interfaceC5189);
        flowKt__ErrorsKt$retry$3.L$0 = th;
        flowKt__ErrorsKt$retry$3.J$0 = j;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(C6008.f15084);
    }
}
