package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {2245, 2247, 2254, 2255, 2265}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC0552 $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractC1054 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(InterfaceC0552 interfaceC0552, long j, InterfaceC0580 interfaceC0580, AbstractC1054 abstractC1054, InterfaceC4356<? super AbstractClickableNode$handlePressInteraction$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_handlePressInteraction = interfaceC0552;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
        this.this$0 = abstractC1054;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, interfaceC4356);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r15).m1344(r1, r14) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r3).m1344(r15, r14) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
