package io.ktor.client.engine.cio;

import io.ktor.http.content.AbstractC3987;
import io.ktor.utils.io.C4230;
import io.ktor.utils.io.InterfaceC4247;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8139;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", f = "utils.kt", l = {130, 135, 137, 135, 137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$writeBody$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC3987 $body;
    final /* synthetic */ InterfaceC4247 $channel;
    final /* synthetic */ C4230 $chunkedJob;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC4247 $output;
    final /* synthetic */ C8139 $request;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeBody$2(C8139 c8139, AbstractC3987 abstractC3987, InterfaceC4247 interfaceC4247, C4230 c4230, InterfaceC4247 interfaceC42472, boolean z, InterfaceC4357<? super UtilsKt$writeBody$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$request = c8139;
        this.$body = abstractC3987;
        this.$channel = interfaceC4247;
        this.$chunkedJob = c4230;
        this.$output = interfaceC42472;
        this.$closeChannel = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new UtilsKt$writeBody$2(this.$request, this.$body, this.$channel, this.$chunkedJob, this.$output, this.$closeChannel, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((UtilsKt$writeBody$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r10 == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt$writeBody$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
