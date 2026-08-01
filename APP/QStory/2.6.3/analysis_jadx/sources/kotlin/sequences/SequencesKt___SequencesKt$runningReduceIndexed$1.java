package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p034.AbstractC6347;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", l = {2530, 2534}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $operation;
    final /* synthetic */ InterfaceC5127 $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(InterfaceC5127 interfaceC5127, InterfaceC6551 interfaceC6551, InterfaceC4357<? super SequencesKt___SequencesKt$runningReduceIndexed$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_runningReduceIndexed = interfaceC5127;
        this.$operation = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, interfaceC4357);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object next;
        AbstractC5125 abstractC5125 = (AbstractC5125) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            it = this.$this_runningReduceIndexed.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.L$0 = abstractC5125;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 1;
                if (abstractC5125.mo10121(next, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return C5176.f14739;
        }
        if (i == 1) {
            next = this.L$2;
            it = (Iterator) this.L$1;
            AbstractC5185.m10210(obj);
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            AbstractC5185.m10210(obj);
            i2 = i3;
            next = obj2;
        }
        while (it.hasNext()) {
            InterfaceC6551 interfaceC6551 = this.$operation;
            int i4 = i2 + 1;
            if (i2 < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            Object objInvoke = interfaceC6551.invoke(new Integer(i2), next, it.next());
            this.L$0 = abstractC5125;
            this.L$1 = it;
            this.L$2 = objInvoke;
            this.I$0 = i4;
            this.label = 2;
            if (abstractC5125.mo10121(objInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = objInvoke;
            i2 = i4;
        }
        return C5176.f14739;
    }
}
