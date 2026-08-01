package kotlin.sequences;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.AbstractC4401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", l = {178}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC4401 $random;
    final /* synthetic */ InterfaceC5127 $this_shuffled;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(InterfaceC5127 interfaceC5127, AbstractC4401 abstractC4401, InterfaceC4357<? super SequencesKt__SequencesKt$shuffled$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_shuffled = interfaceC5127;
        this.$random = abstractC4401;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, interfaceC4357);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5125) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L16
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            kotlin.AbstractC5185.m10210(r8)
            goto L3b
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L1c:
            kotlin.AbstractC5185.m10210(r8)
            kotlin.sequences.飘花落叶言子楪苏哲世兰 r8 = r7.$this_shuffled
            r8.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L2d:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r8.next()
            r2.add(r5)
            goto L2d
        L3b:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L6c
            kotlin.random.飘花落叶言子楪世兰苏哲 r8 = r7.$random
            int r5 = r2.size()
            int r8 = r8.nextInt(r5)
            java.lang.Object r5 = kotlin.collections.AbstractC4344.m8792(r2)
            int r6 = r2.size()
            if (r8 >= r6) goto L59
            java.lang.Object r5 = r2.set(r8, r5)
        L59:
            r7.L$0 = r0
            r7.L$1 = r2
            r7.L$2 = r3
            r7.L$3 = r3
            r7.I$0 = r8
            r7.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.mo10121(r5, r7)
            if (r8 != r1) goto L3b
            return r1
        L6c:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
