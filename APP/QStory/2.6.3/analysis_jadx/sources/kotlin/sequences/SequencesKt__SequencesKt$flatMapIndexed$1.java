package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", l = {383}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $iterator;
    final /* synthetic */ InterfaceC5127 $source;
    final /* synthetic */ InterfaceC6554 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$flatMapIndexed$1(InterfaceC5127 interfaceC5127, InterfaceC6554 interfaceC6554, InterfaceC6558 interfaceC6558, InterfaceC4357<? super SequencesKt__SequencesKt$flatMapIndexed$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$source = interfaceC5127;
        this.$transform = interfaceC6554;
        this.$iterator = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, interfaceC4357);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        AbstractC5125 abstractC5125 = (AbstractC5125) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            i = 0;
            it = this.$source.iterator();
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$1;
            AbstractC5185.m10210(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC6554 interfaceC6554 = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            Iterator it2 = (Iterator) this.$iterator.invoke(interfaceC6554.invoke(new Integer(i), next));
            this.L$0 = abstractC5125;
            this.L$1 = it;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i3;
            this.label = 1;
            if (abstractC5125.mo10120(it2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return C5176.f14739;
    }
}
