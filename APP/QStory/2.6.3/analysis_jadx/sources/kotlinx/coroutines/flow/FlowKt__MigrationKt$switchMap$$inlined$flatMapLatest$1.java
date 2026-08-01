package kotlinx.coroutines.flow;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", l = {189, 189}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n¨\u0006\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {2, 2, 0})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) {
        super(3, interfaceC4357);
        this.$transform = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5318 interfaceC5318, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, interfaceC4357);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = interfaceC5318;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = obj;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5318 interfaceC5318 = (InterfaceC5318) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC6554 interfaceC6554 = this.$transform;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = interfaceC5318;
            this.label = 1;
            obj = interfaceC6554.invoke(obj2, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5185.m10210(obj);
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC5318 = (InterfaceC5318) this.L$2;
        AbstractC5185.m10210(obj);
        InterfaceC5319 interfaceC5319 = (InterfaceC5319) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (interfaceC5318 instanceof AbstractC5275) {
            throw null;
        }
        Object objMo8453 = interfaceC5319.mo8453(interfaceC5318, this);
        if (objMo8453 != coroutineSingletons) {
            objMo8453 = c5176;
        }
        return objMo8453 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
