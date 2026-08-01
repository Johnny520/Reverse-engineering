package top.yukonga.miuix.kmp.utils;

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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$handlePressInteraction$2$1", f = "Pressable.kt", l = {401, 403, 410, 411, 420}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class AbstractPressableNode$handlePressInteraction$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC0552 $this_handlePressInteraction;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractC6057 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$handlePressInteraction$2$1(InterfaceC0552 interfaceC0552, long j, InterfaceC0580 interfaceC0580, AbstractC6057 abstractC6057, InterfaceC4356<? super AbstractPressableNode$handlePressInteraction$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_handlePressInteraction = interfaceC0552;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
        this.this$0 = abstractC6057;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AbstractPressableNode$handlePressInteraction$2$1 abstractPressableNode$handlePressInteraction$2$1 = new AbstractPressableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, interfaceC4356);
        abstractPressableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractPressableNode$handlePressInteraction$2$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AbstractPressableNode$handlePressInteraction$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r4).m1344(r3, r16) != r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r5).m1344(r6, r16) == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.AbstractPressableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
