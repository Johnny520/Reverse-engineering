package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", l = {2530, 2534}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6550 $operation;
    final /* synthetic */ InterfaceC5126 $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(InterfaceC5126 interfaceC5126, InterfaceC6550 interfaceC6550, InterfaceC4356<? super SequencesKt___SequencesKt$runningReduceIndexed$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_runningReduceIndexed = interfaceC5126;
        this.$operation = interfaceC6550;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, interfaceC4356);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object next;
        AbstractC5124 abstractC5124 = (AbstractC5124) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            it = this.$this_runningReduceIndexed.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.L$0 = abstractC5124;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 1;
                if (abstractC5124.mo10117(next, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return C5175.f14739;
        }
        if (i == 1) {
            next = this.L$2;
            it = (Iterator) this.L$1;
            AbstractC5184.m10206(obj);
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            AbstractC5184.m10206(obj);
            i2 = i3;
            next = obj2;
        }
        while (it.hasNext()) {
            InterfaceC6550 interfaceC6550 = this.$operation;
            int i4 = i2 + 1;
            if (i2 < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            Object objInvoke = interfaceC6550.invoke(new Integer(i2), next, it.next());
            this.L$0 = abstractC5124;
            this.L$1 = it;
            this.L$2 = objInvoke;
            this.I$0 = i4;
            this.label = 2;
            if (abstractC5124.mo10117(objInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = objInvoke;
            i2 = i4;
        }
        return C5175.f14739;
    }
}
