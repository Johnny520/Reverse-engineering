package io.ktor.network.tls;

import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSClientHandshake$input$1", f = "TLSClientHandshake.kt", l = {61, 91}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class TLSClientHandshake$input$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4252 $rawInput;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4041 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$input$1(InterfaceC4252 interfaceC4252, AbstractC4041 abstractC4041, InterfaceC4357<? super TLSClientHandshake$input$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$rawInput = interfaceC4252;
        this.this$0 = abstractC4041;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TLSClientHandshake$input$1 tLSClientHandshake$input$1 = new TLSClientHandshake$input$1(this.$rawInput, this.this$0, interfaceC4357);
        tLSClientHandshake$input$1.L$0 = obj;
        return tLSClientHandshake$input$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TLSClientHandshake$input$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0119: CHECK_CAST (r5 I:kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) = (kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) (r5 I:??[OBJECT, ARRAY]), block:B:63:0x0119 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0125: CHECK_CAST (r5 I:kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) = (kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) (r5 I:??[OBJECT, ARRAY]), block:B:66:0x0125 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0017, ClosedReceiveChannelException -> 0x0125, TryCatch #1 {ClosedReceiveChannelException -> 0x0125, blocks: (B:7:0x0013, B:17:0x0033, B:20:0x0042, B:22:0x0046, B:25:0x0056, B:29:0x0072, B:32:0x007a, B:33:0x0095, B:34:0x0096, B:35:0x009d, B:36:0x009e, B:39:0x00ad, B:45:0x00ba, B:46:0x00c2, B:49:0x00cf, B:54:0x00e2, B:58:0x00ea, B:53:0x00da, B:61:0x0115, B:14:0x0026), top: B:71:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115 A[Catch: all -> 0x0017, ClosedReceiveChannelException -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClosedReceiveChannelException -> 0x0125, blocks: (B:7:0x0013, B:17:0x0033, B:20:0x0042, B:22:0x0046, B:25:0x0056, B:29:0x0072, B:32:0x007a, B:33:0x0095, B:34:0x0096, B:35:0x009d, B:36:0x009e, B:39:0x00ad, B:45:0x00ba, B:46:0x00c2, B:49:0x00cf, B:54:0x00e2, B:58:0x00ea, B:53:0x00da, B:61:0x0115, B:14:0x0026), top: B:71:0x0007, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006d -> B:17:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0078 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake$input$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
