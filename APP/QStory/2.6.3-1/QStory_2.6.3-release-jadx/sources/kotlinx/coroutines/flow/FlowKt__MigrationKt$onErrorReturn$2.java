package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m556f = "Migration.kt", m557l = {302}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "e", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ Object $fallback;
    final /* synthetic */ InterfaceC7387 $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$onErrorReturn$2(InterfaceC7387 interfaceC7387, Object obj, InterfaceC5189<? super FlowKt__MigrationKt$onErrorReturn$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$predicate = interfaceC7387;
        this.$fallback = obj;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6150 interfaceC6150, Throwable th, InterfaceC5189<? super C6008> interfaceC5189) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, interfaceC5189);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = interfaceC6150;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (!((Boolean) this.$predicate.invoke(th)).booleanValue()) {
                throw th;
            }
            Object obj2 = this.$fallback;
            this.L$0 = null;
            this.L$1 = null;
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
        return C6008.f15084;
    }
}
