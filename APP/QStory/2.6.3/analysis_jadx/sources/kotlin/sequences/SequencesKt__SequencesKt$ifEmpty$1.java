package kotlin.sequences;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", l = {102, 104}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $defaultValue;
    final /* synthetic */ InterfaceC5127 $this_ifEmpty;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$ifEmpty$1(InterfaceC5127 interfaceC5127, InterfaceC6543 interfaceC6543, InterfaceC4357<? super SequencesKt__SequencesKt$ifEmpty$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_ifEmpty = interfaceC5127;
        this.$defaultValue = interfaceC6543;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, interfaceC4357);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
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
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L22
            if (r2 == r5) goto L1a
            if (r2 != r4) goto L14
            goto L1a
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r6
        L1a:
            java.lang.Object r7 = r7.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L5e
        L22:
            kotlin.AbstractC5185.m10210(r8)
            kotlin.sequences.飘花落叶言子楪苏哲世兰 r8 = r7.$this_ifEmpty
            java.util.Iterator r8 = r8.iterator()
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L3e
            r7.L$0 = r6
            r7.L$1 = r6
            r7.label = r5
            java.lang.Object r7 = r0.mo10120(r8, r7)
            if (r7 != r1) goto L5e
            goto L5d
        L3e:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r8 = r7.$defaultValue
            java.lang.Object r8 = r8.invoke()
            kotlin.sequences.飘花落叶言子楪苏哲世兰 r8 = (kotlin.sequences.InterfaceC5127) r8
            r7.L$0 = r6
            r7.L$1 = r6
            r7.label = r4
            r0.getClass()
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r7 = r0.mo10120(r8, r7)
            if (r7 != r1) goto L5a
            goto L5b
        L5a:
            r7 = r3
        L5b:
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
