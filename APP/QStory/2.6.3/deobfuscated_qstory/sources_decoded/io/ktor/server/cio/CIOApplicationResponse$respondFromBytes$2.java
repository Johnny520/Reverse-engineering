package io.ktor.server.cio;

import io.ktor.utils.io.InterfaceC4247;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2", f = "CIOApplicationResponse.kt", l = {66, 67}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationResponse$respondFromBytes$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ InterfaceC4247 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationResponse$respondFromBytes$2(InterfaceC4247 interfaceC4247, byte[] bArr, InterfaceC4357<? super CIOApplicationResponse$respondFromBytes$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC4247;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CIOApplicationResponse$respondFromBytes$2(this.$channel, this.$bytes, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CIOApplicationResponse$respondFromBytes$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (((io.ktor.utils.io.C4249) r6).m8704(r5) == r0) goto L15;
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
            kotlin.AbstractC5185.m10210(r6)
            goto L3c
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L17:
            kotlin.AbstractC5185.m10210(r6)
            goto L2f
        L1b:
            kotlin.AbstractC5185.m10210(r6)
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.$channel
            byte[] r1 = r5.$bytes
            r5.label = r3
            io.ktor.utils.io.飘花落叶言子楪哲兰世苏 r3 = io.ktor.utils.io.AbstractC4246.f12754
            r3 = 0
            int r4 = r1.length
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4246.m8689(r6, r1, r3, r4, r5)
            if (r6 != r0) goto L2f
            goto L3b
        L2f:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.$channel
            r5.label = r2
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4249) r6
            java.lang.Object r5 = r6.m8704(r5)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
