package androidx.collection;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class OrderedSetWrapper$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC0289 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(AbstractC0289 abstractC0289, InterfaceC4357<? super OrderedSetWrapper$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC0289;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.this$0, interfaceC4357);
        orderedSetWrapper$iterator$1.L$0 = obj;
        return orderedSetWrapper$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((OrderedSetWrapper$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object[] objArr;
        long[] jArr;
        AbstractC5125 abstractC5125;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            AbstractC5125 abstractC51252 = (AbstractC5125) this.L$0;
            AbstractC0291 abstractC0291 = this.this$0.f1006;
            Object[] objArr2 = abstractC0291.f1012;
            long[] jArr2 = abstractC0291.f1011;
            i = abstractC0291.f1009;
            objArr = objArr2;
            jArr = jArr2;
            abstractC5125 = abstractC51252;
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            jArr = (long[]) this.L$2;
            objArr = (Object[]) this.L$1;
            abstractC5125 = (AbstractC5125) this.L$0;
            AbstractC5185.m10210(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.L$0 = abstractC5125;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i3;
            this.label = 1;
            if (abstractC5125.mo10121(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return C5176.f14739;
    }
}
