package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {Opcodes.XOR_INT_LIT16, 415}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downstream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC5318 $this_debounceInternal;
    final /* synthetic */ InterfaceC6557 $timeoutMillisSelector;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC6557 interfaceC6557, InterfaceC5318 interfaceC5318, InterfaceC4356<? super FlowKt__DelayKt$debounceInternal$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$timeoutMillisSelector = interfaceC6557;
        this.$this_debounceInternal = interfaceC5318;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC5317 interfaceC5317, InterfaceC4356<? super C5175> interfaceC4356) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, interfaceC4356);
        flowKt__DelayKt$debounceInternal$1.L$0 = interfaceC5400;
        flowKt__DelayKt$debounceInternal$1.L$1 = interfaceC5317;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r2.emit(r10, r16) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[PHI: r1 r2 r4 r9
  0x009f: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r2v2 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲) = 
  (r2v8 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
  (r2v9 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
  (r2v9 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r4v3 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r4v5 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r9v3 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = 
  (r9v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:7:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
