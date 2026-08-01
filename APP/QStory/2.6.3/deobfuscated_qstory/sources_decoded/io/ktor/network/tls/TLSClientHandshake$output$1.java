package io.ktor.network.tls;

import io.ktor.utils.io.InterfaceC4247;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5194;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSClientHandshake$output$1", f = "TLSClientHandshake.kt", l = {108, 113, 119, 129, 119, 129}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪世苏哲兰;", "Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class TLSClientHandshake$output$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4247 $rawOutput;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4041 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$output$1(AbstractC4041 abstractC4041, InterfaceC4247 interfaceC4247, InterfaceC4357<? super TLSClientHandshake$output$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC4041;
        this.$rawOutput = interfaceC4247;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TLSClientHandshake$output$1 tLSClientHandshake$output$1 = new TLSClientHandshake$output$1(this.this$0, this.$rawOutput, interfaceC4357);
        tLSClientHandshake$output$1.L$0 = obj;
        return tLSClientHandshake$output$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5194 interfaceC5194, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TLSClientHandshake$output$1) create(interfaceC5194, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (((io.ktor.utils.io.C4249) r10).m8704(r9) != r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:22:0x0067, B:26:0x007c, B:28:0x0084, B:38:0x00ae, B:16:0x0048, B:21:0x0056, B:11:0x0036, B:30:0x008e, B:33:0x0095, B:36:0x00a8, B:37:0x00ad), top: B:58:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:39:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ae -> B:39:0x00b7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake$output$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
