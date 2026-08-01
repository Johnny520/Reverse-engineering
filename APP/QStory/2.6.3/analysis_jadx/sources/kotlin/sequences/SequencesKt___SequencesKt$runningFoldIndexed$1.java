package kotlin.sequences;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", l = {2472, 2477}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Object $initial;
    final /* synthetic */ InterfaceC6551 $operation;
    final /* synthetic */ InterfaceC5127 $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, InterfaceC5127 interfaceC5127, InterfaceC6551 interfaceC6551, InterfaceC4357<? super SequencesKt___SequencesKt$runningFoldIndexed$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$initial = obj;
        this.$this_runningFoldIndexed = interfaceC5127;
        this.$operation = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, interfaceC4357);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0.mo10121(r12, r11) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5125) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r11.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1e
            int r2 = r11.I$0
            java.lang.Object r5 = r11.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$1
            kotlin.AbstractC5185.m10210(r12)
        L1c:
            r12 = r6
            goto L44
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r3
        L24:
            kotlin.AbstractC5185.m10210(r12)
            goto L38
        L28:
            kotlin.AbstractC5185.m10210(r12)
            java.lang.Object r12 = r11.$initial
            r11.L$0 = r0
            r11.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = r0.mo10121(r12, r11)
            if (r12 != r1) goto L38
            goto L6f
        L38:
            java.lang.Object r12 = r11.$initial
            kotlin.sequences.飘花落叶言子楪苏哲世兰 r2 = r11.$this_runningFoldIndexed
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r10 = r5
            r5 = r2
            r2 = r10
        L44:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r7 = r11.$operation
            int r8 = r2 + 1
            if (r2 < 0) goto L72
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r2)
            java.lang.Object r6 = r7.invoke(r9, r12, r6)
            r11.L$0 = r0
            r11.L$1 = r6
            r11.L$2 = r5
            r11.L$3 = r3
            r11.I$0 = r8
            r11.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = r0.mo10121(r6, r11)
            if (r12 != r1) goto L70
        L6f:
            return r1
        L70:
            r2 = r8
            goto L1c
        L72:
            p034.AbstractC6347.m11920()
            throw r3
        L76:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5176.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
