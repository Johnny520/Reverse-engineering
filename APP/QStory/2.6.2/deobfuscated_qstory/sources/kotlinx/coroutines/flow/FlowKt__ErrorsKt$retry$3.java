package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "cause", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 2, 0})
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6553 $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$retry$3(long j, InterfaceC6553 interfaceC6553, InterfaceC4356<? super FlowKt__ErrorsKt$retry$3> interfaceC4356) {
        super(4, interfaceC4356);
        this.$retries = j;
        this.$predicate = interfaceC6553;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((InterfaceC5317) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC4356<? super Boolean>) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (j < this.$retries) {
                InterfaceC6553 interfaceC6553 = this.$predicate;
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                obj = interfaceC6553.invoke(th, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }

    public final Object invoke(InterfaceC5317 interfaceC5317, Throwable th, long j, InterfaceC4356<? super Boolean> interfaceC4356) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, interfaceC4356);
        flowKt__ErrorsKt$retry$3.L$0 = th;
        flowKt__ErrorsKt$retry$3.J$0 = j;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(C5175.f14739);
    }
}
