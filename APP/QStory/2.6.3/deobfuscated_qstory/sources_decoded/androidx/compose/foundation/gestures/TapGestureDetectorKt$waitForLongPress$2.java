package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {412, 435}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref$ObjectRef<AbstractC0542> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref$ObjectRef<AbstractC0542> ref$ObjectRef, InterfaceC4357<? super TapGestureDetectorKt$waitForLongPress$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$pass = pointerEventPass;
        this.$result = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, interfaceC4357);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r15.f4850 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r14.$result.element = androidx.compose.foundation.gestures.C0543.f1568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        r15 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7 >= r15) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r8 = (androidx.compose.ui.input.pointer.C1643) r6.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r8.m3022() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (androidx.compose.ui.input.pointer.AbstractC1646.m3025(r8, ((androidx.compose.ui.input.pointer.C1621) r1).f4741.f4753, ((androidx.compose.ui.input.pointer.C1621) r1).m2998()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r15 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r14.L$0 = r1;
        r14.label = 2;
        r1 = (androidx.compose.ui.input.pointer.C1621) r1;
        r15 = r1.m2999(r15, r14);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r15 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        return kotlin.C5176.f14739;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世兰楪哲] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲兰楪] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲楪兰] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:34:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
