package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", l = {383}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $iterator;
    final /* synthetic */ InterfaceC5126 $source;
    final /* synthetic */ InterfaceC6553 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$flatMapIndexed$1(InterfaceC5126 interfaceC5126, InterfaceC6553 interfaceC6553, InterfaceC6557 interfaceC6557, InterfaceC4356<? super SequencesKt__SequencesKt$flatMapIndexed$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$source = interfaceC5126;
        this.$transform = interfaceC6553;
        this.$iterator = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, interfaceC4356);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        AbstractC5124 abstractC5124 = (AbstractC5124) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            i = 0;
            it = this.$source.iterator();
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$1;
            AbstractC5184.m10206(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC6553 interfaceC6553 = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            Iterator it2 = (Iterator) this.$iterator.invoke(interfaceC6553.invoke(new Integer(i), next));
            this.L$0 = abstractC5124;
            this.L$1 = it;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i3;
            this.label = 1;
            if (abstractC5124.mo10116(it2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return C5175.f14739;
    }
}
