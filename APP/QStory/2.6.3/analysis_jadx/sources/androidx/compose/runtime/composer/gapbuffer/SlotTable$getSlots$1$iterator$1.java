package androidx.compose.runtime.composer.gapbuffer;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1$iterator$1", f = "SlotTable.kt", l = {611}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
final class SlotTable$getSlots$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1233 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$getSlots$1$iterator$1(C1233 c1233, InterfaceC4357<? super SlotTable$getSlots$1$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1233;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(this.this$0, interfaceC4357);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SlotTable$getSlots$1$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L15
            int r1 = r5.I$1
            int r3 = r5.I$0
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r4 = (kotlin.sequences.AbstractC5125) r4
            kotlin.AbstractC5185.m10210(r6)
            goto L40
        L15:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L1c:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r6 = (kotlin.sequences.AbstractC5125) r6
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世兰哲 r1 = r5.this$0
            int r1 = r1.f3549
            r3 = 0
            r4 = r6
        L29:
            if (r3 >= r1) goto L42
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世兰哲 r6 = r5.this$0
            java.lang.Object[] r6 = r6.f3548
            r6 = r6[r3]
            r5.L$0 = r4
            r5.I$0 = r3
            r5.I$1 = r1
            r5.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.mo10121(r6, r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            int r3 = r3 + r2
            goto L29
        L42:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
