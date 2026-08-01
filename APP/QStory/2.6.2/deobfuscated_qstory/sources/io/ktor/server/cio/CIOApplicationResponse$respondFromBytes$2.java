package io.ktor.server.cio;

import io.ktor.utils.io.InterfaceC4246;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2", f = "CIOApplicationResponse.kt", l = {66, 67}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationResponse$respondFromBytes$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ InterfaceC4246 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationResponse$respondFromBytes$2(InterfaceC4246 interfaceC4246, byte[] bArr, InterfaceC4356<? super CIOApplicationResponse$respondFromBytes$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$channel = interfaceC4246;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CIOApplicationResponse$respondFromBytes$2(this.$channel, this.$bytes, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOApplicationResponse$respondFromBytes$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (((io.ktor.utils.io.C4248) r6).m8714(r5) == r0) goto L15;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5184.m10206(r6)
            goto L3c
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L17:
            kotlin.AbstractC5184.m10206(r6)
            goto L2f
        L1b:
            kotlin.AbstractC5184.m10206(r6)
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.$channel
            byte[] r1 = r5.$bytes
            r5.label = r3
            io.ktor.utils.io.飘花落叶言子楪哲兰世苏 r3 = io.ktor.utils.io.AbstractC4245.f12750
            r3 = 0
            int r4 = r1.length
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4245.m8699(r6, r1, r3, r4, r5)
            if (r6 != r0) goto L2f
            goto L3b
        L2f:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.$channel
            r5.label = r2
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4248) r6
            java.lang.Object r5 = r6.m8714(r5)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
