package io.ktor.client.engine.cio;

import io.ktor.http.content.AbstractC3986;
import io.ktor.utils.io.C4229;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8138;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", f = "utils.kt", l = {130, 135, 137, 135, 137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$writeBody$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC3986 $body;
    final /* synthetic */ InterfaceC4246 $channel;
    final /* synthetic */ C4229 $chunkedJob;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC4246 $output;
    final /* synthetic */ C8138 $request;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeBody$2(C8138 c8138, AbstractC3986 abstractC3986, InterfaceC4246 interfaceC4246, C4229 c4229, InterfaceC4246 interfaceC42462, boolean z, InterfaceC4356<? super UtilsKt$writeBody$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$request = c8138;
        this.$body = abstractC3986;
        this.$channel = interfaceC4246;
        this.$chunkedJob = c4229;
        this.$output = interfaceC42462;
        this.$closeChannel = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new UtilsKt$writeBody$2(this.$request, this.$body, this.$channel, this.$chunkedJob, this.$output, this.$closeChannel, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((UtilsKt$writeBody$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
