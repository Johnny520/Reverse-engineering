package kotlinx.coroutines.debug.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m556f = "DebugCoroutineInfoImpl.kt", m557l = {165}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Ljava/lang/StackTraceElement;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC6045 $bottom;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC6046 this$0;

    public DebugCoroutineInfoImpl$creationStackTrace$1(AbstractC6046 abstractC6046, AbstractC6045 abstractC6045, InterfaceC5189<? super DebugCoroutineInfoImpl$creationStackTrace$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(null, null, interfaceC5189);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
