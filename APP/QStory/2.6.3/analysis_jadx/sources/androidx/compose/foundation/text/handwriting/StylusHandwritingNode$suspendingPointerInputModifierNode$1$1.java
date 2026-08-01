package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C0836 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(C0836 c0836, InterfaceC4357<? super StylusHandwritingNode$suspendingPointerInputModifierNode$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0836;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.this$0, interfaceC4357);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1$1.L$0 = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0249, code lost:
    
        if (r3 != r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r8 == r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01b7, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:30:0x00b0, B:25:0x008c], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:33:0x00b7, B:36:0x00bd], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:60:0x0123, B:55:0x0109], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:60:0x0123, B:58:0x011e], limit reached: 190 */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0249 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d1 -> B:41:0x00d6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
