package androidx.collection;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class OrderedSetWrapper$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC0289 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(AbstractC0289 abstractC0289, InterfaceC4356<? super OrderedSetWrapper$iterator$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC0289;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.this$0, interfaceC4356);
        orderedSetWrapper$iterator$1.L$0 = obj;
        return orderedSetWrapper$iterator$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OrderedSetWrapper$iterator$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object[] objArr;
        long[] jArr;
        AbstractC5124 abstractC5124;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            AbstractC5124 abstractC51242 = (AbstractC5124) this.L$0;
            AbstractC0291 abstractC0291 = this.this$0.f1006;
            Object[] objArr2 = abstractC0291.f1012;
            long[] jArr2 = abstractC0291.f1011;
            i = abstractC0291.f1009;
            objArr = objArr2;
            jArr = jArr2;
            abstractC5124 = abstractC51242;
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            jArr = (long[]) this.L$2;
            objArr = (Object[]) this.L$1;
            abstractC5124 = (AbstractC5124) this.L$0;
            AbstractC5184.m10206(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.L$0 = abstractC5124;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i3;
            this.label = 1;
            if (abstractC5124.mo10117(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return C5175.f14739;
    }
}
