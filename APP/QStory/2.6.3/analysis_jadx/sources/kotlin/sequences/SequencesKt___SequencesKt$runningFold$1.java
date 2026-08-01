package kotlin.sequences;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2444, 2448}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Object $initial;
    final /* synthetic */ InterfaceC6554 $operation;
    final /* synthetic */ InterfaceC5127 $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, InterfaceC5127 interfaceC5127, InterfaceC6554 interfaceC6554, InterfaceC4357<? super SequencesKt___SequencesKt$runningFold$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$initial = obj;
        this.$this_runningFold = interfaceC5127;
        this.$operation = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, interfaceC4357);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0.mo10121(r8, r7) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r0.mo10121(r5, r7) == r1) goto L19;
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
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5125) r0
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
            kotlin.AbstractC5185.m10210(r8)
        L1a:
            r8 = r5
            goto L3e
        L1c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L22:
            kotlin.AbstractC5185.m10210(r8)
            goto L36
        L26:
            kotlin.AbstractC5185.m10210(r8)
            java.lang.Object r8 = r7.$initial
            r7.L$0 = r0
            r7.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.mo10121(r8, r7)
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.mo10121(r5, r7)
            if (r8 != r1) goto L1a
        L5e:
            return r1
        L5f:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
