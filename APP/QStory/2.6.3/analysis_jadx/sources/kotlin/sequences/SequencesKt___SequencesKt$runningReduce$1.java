package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", l = {2501, 2504}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $operation;
    final /* synthetic */ InterfaceC5127 $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(InterfaceC5127 interfaceC5127, InterfaceC6554 interfaceC6554, InterfaceC4357<? super SequencesKt___SequencesKt$runningReduce$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_runningReduce = interfaceC5127;
        this.$operation = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, interfaceC4357);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator it;
        AbstractC5125 abstractC5125 = (AbstractC5125) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            Iterator it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.L$0 = abstractC5125;
                this.L$1 = it2;
                this.L$2 = next;
                this.label = 1;
                if (abstractC5125.mo10121(next, this) != coroutineSingletons) {
                    it = it2;
                }
                return coroutineSingletons;
            }
            return C5176.f14739;
        }
        if (i != 1 && i != 2) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        next = this.L$2;
        it = (Iterator) this.L$1;
        AbstractC5185.m10210(obj);
        while (it.hasNext()) {
            next = this.$operation.invoke(next, it.next());
            this.L$0 = abstractC5125;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 2;
            if (abstractC5125.mo10121(next, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5176.f14739;
    }
}
