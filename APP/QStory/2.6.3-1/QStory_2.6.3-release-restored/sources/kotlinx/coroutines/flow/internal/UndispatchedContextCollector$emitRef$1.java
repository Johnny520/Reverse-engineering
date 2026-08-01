package kotlinx.coroutines.flow.internal;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m556f = "ChannelFlow.kt", m557l = {Opcodes.ADD_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, m151d2 = {"T", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 2, 0})
final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6150 $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(InterfaceC6150 interfaceC6150, InterfaceC5189<? super UndispatchedContextCollector$emitRef$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$downstream = interfaceC6150;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, interfaceC5189);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6150 interfaceC6150 = this.$downstream;
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
        return C6008.f15084;
    }
}
