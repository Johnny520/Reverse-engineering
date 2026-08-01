package io.ktor.http.cio;

import io.ktor.utils.io.C4225;
import io.ktor.utils.io.C4241;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p094.C7204;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", l = {182, 183}, m = "invokeSuspend")
public final class MultipartKt$parseMultipart$1$preambleData$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4241 $countedInput;
    final /* synthetic */ C7204 $firstBoundary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1$preambleData$1(C7204 c7204, C4241 c4241, InterfaceC4356<? super MultipartKt$parseMultipart$1$preambleData$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$firstBoundary = c7204;
        this.$countedInput = c4241;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new MultipartKt$parseMultipart$1$preambleData$1(this.$firstBoundary, this.$countedInput, interfaceC4356);
        multipartKt$parseMultipart$1$preambleData$1.L$0 = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MultipartKt$parseMultipart$1$preambleData$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (((io.ktor.utils.io.C4248) r12).m8714(r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5184.m10206(r13)
            goto L4e
        L11:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r2
        L17:
            java.lang.Object r1 = r12.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r1 = (io.ktor.utils.io.C4225) r1
            kotlin.AbstractC5184.m10206(r13)
            r11 = r12
            goto L3f
        L20:
            kotlin.AbstractC5184.m10206(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r1 = (io.ktor.utils.io.C4225) r1
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r6 = r12.$firstBoundary
            io.ktor.utils.io.飘花落叶言子楪兰苏哲世 r5 = r12.$countedInput
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r7 = r1.f12722
            r12.L$0 = r1
            r12.label = r4
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r13 = io.ktor.http.cio.AbstractC3968.f12203
            r10 = 1
            r8 = 8192(0x2000, double:4.0474E-320)
            r11 = r12
            java.lang.Object r12 = io.ktor.utils.io.AbstractC4243.m8672(r5, r6, r7, r8, r10, r11)
            if (r12 != r0) goto L3f
            goto L4d
        L3f:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r12 = r1.f12722
            r11.L$0 = r2
            r11.label = r3
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r12 = (io.ktor.utils.io.C4248) r12
            java.lang.Object r12 = r12.m8714(r11)
            if (r12 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5175.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
