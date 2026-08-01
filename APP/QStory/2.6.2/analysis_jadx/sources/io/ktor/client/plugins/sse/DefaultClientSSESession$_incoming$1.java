package io.ktor.client.plugins.sse;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", l = {25, 30}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "L飘花落叶言楪兰哲子苏世/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultClientSSESession$_incoming$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3905 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$_incoming$1(C3905 c3905, InterfaceC4356<? super DefaultClientSSESession$_incoming$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c3905;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new DefaultClientSSESession$_incoming$1(this.this$0, interfaceC4356);
        defaultClientSSESession$_incoming$1.L$0 = obj;
        return defaultClientSSESession$_incoming$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultClientSSESession$_incoming$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5210) r1).f14798.mo8443(r12, r11) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0088 -> B:36:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r1 = (kotlinx.coroutines.channels.InterfaceC5195) r1
            kotlin.AbstractC5184.m10206(r12)
            goto L79
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            r11 = 0
            return r11
        L1c:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r1 = (kotlinx.coroutines.channels.InterfaceC5195) r1
            kotlin.AbstractC5184.m10206(r12)
            goto L3d
        L24:
            kotlin.AbstractC5184.m10206(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r12 = (kotlinx.coroutines.channels.InterfaceC5195) r12
        L2b:
            io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲 r1 = r11.this$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r4 = r1.f12109
            r11.L$0 = r12
            r11.label = r3
            java.lang.Object r1 = io.ktor.client.plugins.sse.C3905.m8295(r1, r4, r11)
            if (r1 != r0) goto L3a
            goto L8a
        L3a:
            r10 = r1
            r1 = r12
            r12 = r10
        L3d:
            飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏哲兰 r12 = (p245.C8152) r12
            if (r12 != 0) goto L44
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        L44:
            java.lang.String r4 = r12.f22481
            java.lang.Long r5 = r12.f22482
            java.lang.String r6 = r12.f22483
            java.lang.String r7 = r12.f22484
            java.lang.String r8 = r12.f22485
            io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲 r9 = r11.this$0
            r9.getClass()
            if (r8 != 0) goto L63
            if (r7 != 0) goto L63
            if (r6 != 0) goto L63
            if (r5 != 0) goto L63
            if (r4 == 0) goto L63
            io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲 r9 = r11.this$0
            boolean r9 = r9.f12106
            if (r9 == 0) goto L79
        L63:
            io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲 r9 = r11.this$0
            r9.getClass()
            if (r8 != 0) goto L7b
            if (r7 != 0) goto L7b
            if (r6 != 0) goto L7b
            if (r4 != 0) goto L7b
            if (r5 == 0) goto L7b
            io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲 r4 = r11.this$0
            boolean r4 = r4.f12105
            if (r4 == 0) goto L79
            goto L7b
        L79:
            r12 = r1
            goto L2b
        L7b:
            r11.L$0 = r1
            r11.label = r2
            r4 = r1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r4 = (kotlinx.coroutines.channels.AbstractC5210) r4
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r4 = r4.f14798
            java.lang.Object r12 = r4.mo8443(r12, r11)
            if (r12 != r0) goto L79
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
