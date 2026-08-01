package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", l = {189, 189}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n¨\u0006\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {2, 2, 0})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6553 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) {
        super(3, interfaceC4356);
        this.$transform = interfaceC6553;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5317 interfaceC5317, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, interfaceC4356);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = interfaceC5317;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = obj;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5317 interfaceC5317 = (InterfaceC5317) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC6553 interfaceC6553 = this.$transform;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = interfaceC5317;
            this.label = 1;
            obj = interfaceC6553.invoke(obj2, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC5317 = (InterfaceC5317) this.L$2;
        AbstractC5184.m10206(obj);
        InterfaceC5318 interfaceC5318 = (InterfaceC5318) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (interfaceC5317 instanceof AbstractC5274) {
            throw null;
        }
        Object objMo8463 = interfaceC5318.mo8463(interfaceC5317, this);
        if (objMo8463 != coroutineSingletons) {
            objMo8463 = c5175;
        }
        return objMo8463 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
