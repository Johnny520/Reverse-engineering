package androidx.collection;

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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.collection.OrderedSetWrapper$iterator$1", m556f = "OrderedScatterSet.kt", m557l = {1454}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {1, 9, 0})
final class OrderedSetWrapper$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC1136 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(AbstractC1136 abstractC1136, InterfaceC5189<? super OrderedSetWrapper$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1136;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.this$0, interfaceC5189);
        orderedSetWrapper$iterator$1.L$0 = obj;
        return orderedSetWrapper$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OrderedSetWrapper$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object[] objArr;
        long[] jArr;
        AbstractC5957 abstractC5957;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5957 abstractC59572 = (AbstractC5957) this.L$0;
            AbstractC1138 abstractC1138 = this.this$0.f1351;
            Object[] objArr2 = abstractC1138.f1357;
            long[] jArr2 = abstractC1138.f1356;
            i = abstractC1138.f1354;
            objArr = objArr2;
            jArr = jArr2;
            abstractC5957 = abstractC59572;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            jArr = (long[]) this.L$2;
            objArr = (Object[]) this.L$1;
            abstractC5957 = (AbstractC5957) this.L$0;
            AbstractC6017.m10769(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.L$0 = abstractC5957;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i3;
            this.label = 1;
            if (abstractC5957.mo10680(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return C6008.f15084;
    }
}
