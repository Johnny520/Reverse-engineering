package io.ktor.client.engine.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {85, 92}, m = "makePipelineRequest")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Endpoint$makePipelineRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$makePipelineRequest$1(C3871 c3871, InterfaceC4357<? super Endpoint$makePipelineRequest$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c3871;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r4.result = r5
            int r5 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r0
            r4.label = r5
            io.ktor.client.engine.cio.飘花落叶言子楪世兰苏哲 r5 = r4.this$0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = io.ktor.client.engine.cio.C3871.f12090
            r5.getClass()
            int r1 = r4.label
            r2 = r1 & r0
            if (r2 == 0) goto L1a
            int r1 = r1 - r0
            r4.label = r1
            goto L20
        L1a:
            io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1 r0 = new io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1
            r0.<init>(r5, r4)
            r4 = r0
        L20:
            java.lang.Object r5 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 0
            if (r0 == 0) goto L52
            r2 = 1
            r3 = 2
            if (r0 == r2) goto L3b
            if (r0 != r3) goto L35
            kotlin.AbstractC5185.m10210(r5)
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        L35:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r1
        L3b:
            java.lang.Object r0 = r4.L$1
            androidx.activity.AbstractC0053.m137(r0)
            java.lang.Object r0 = r4.L$0
            io.ktor.client.engine.cio.飘花落叶言子楪世兰苏哲 r0 = (io.ktor.client.engine.cio.C3871) r0
            kotlin.AbstractC5185.m10210(r5)     // Catch: java.lang.Throwable -> L51
            r0.getClass()
            r4.L$0 = r1
            r4.L$1 = r1
            r4.label = r3
            throw r1
        L51:
            throw r1
        L52:
            kotlin.AbstractC5185.m10210(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.Endpoint$makePipelineRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
