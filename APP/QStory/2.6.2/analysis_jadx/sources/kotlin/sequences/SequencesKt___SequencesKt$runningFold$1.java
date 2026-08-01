package kotlin.sequences;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2444, 2448}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Object $initial;
    final /* synthetic */ InterfaceC6553 $operation;
    final /* synthetic */ InterfaceC5126 $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, InterfaceC5126 interfaceC5126, InterfaceC6553 interfaceC6553, InterfaceC4356<? super SequencesKt___SequencesKt$runningFold$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$initial = obj;
        this.$this_runningFold = interfaceC5126;
        this.$operation = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, interfaceC4356);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0.mo10117(r8, r7) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r0.mo10117(r5, r7) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5124) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1c
            java.lang.Object r2 = r7.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r7.L$1
            kotlin.AbstractC5184.m10206(r8)
        L1a:
            r8 = r5
            goto L3e
        L1c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L22:
            kotlin.AbstractC5184.m10206(r8)
            goto L36
        L26:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.Object r8 = r7.$initial
            r7.L$0 = r0
            r7.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.mo10117(r8, r7)
            if (r8 != r1) goto L36
            goto L5e
        L36:
            java.lang.Object r8 = r7.$initial
            kotlin.sequences.飘花落叶言子楪苏哲世兰 r2 = r7.$this_runningFold
            java.util.Iterator r2 = r2.iterator()
        L3e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r2.next()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r7.$operation
            java.lang.Object r5 = r6.invoke(r8, r5)
            r7.L$0 = r0
            r7.L$1 = r5
            r7.L$2 = r2
            r7.L$3 = r3
            r7.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.mo10117(r5, r7)
            if (r8 != r1) goto L1a
        L5e:
            return r1
        L5f:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
