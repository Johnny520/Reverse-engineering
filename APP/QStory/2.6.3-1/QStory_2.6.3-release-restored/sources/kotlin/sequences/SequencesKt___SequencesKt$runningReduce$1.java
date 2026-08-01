package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m556f = "_Sequences.kt", m557l = {2501, 2504}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"S", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $operation;
    final /* synthetic */ InterfaceC5959 $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(InterfaceC5959 interfaceC5959, InterfaceC7383 interfaceC7383, InterfaceC5189<? super SequencesKt___SequencesKt$runningReduce$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_runningReduce = interfaceC5959;
        this.$operation = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, interfaceC5189);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator it;
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            Iterator it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.L$0 = abstractC5957;
                this.L$1 = it2;
                this.L$2 = next;
                this.label = 1;
                if (abstractC5957.mo10680(next, this) != coroutineSingletons) {
                    it = it2;
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        if (i != 1 && i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        next = this.L$2;
        it = (Iterator) this.L$1;
        AbstractC6017.m10769(obj);
        while (it.hasNext()) {
            next = this.$operation.invoke(next, it.next());
            this.L$0 = abstractC5957;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 2;
            if (abstractC5957.mo10680(next, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }
}
