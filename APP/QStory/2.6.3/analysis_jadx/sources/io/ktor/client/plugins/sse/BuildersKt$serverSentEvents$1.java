package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", l = {105, 107}, m = "serverSentEvents-mY9Nd3A")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BuildersKt$serverSentEvents$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$serverSentEvents$1(InterfaceC4357<? super BuildersKt$serverSentEvents$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.result = r6
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r5.label = r0
            io.ktor.util.飘花落叶言子楪世苏哲兰 r2 = io.ktor.client.plugins.sse.AbstractC3907.f12118
            int r0 = r0 - r1
            r5.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L49
            r4 = 2
            if (r0 == r3) goto L2a
            if (r0 == r4) goto L1f
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L1f:
            java.lang.Object r5 = r5.L$0
            androidx.activity.AbstractC0053.m137(r5)
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Throwable -> L43
            goto L3f
        L28:
            r5 = move-exception
            goto L44
        L2a:
            java.lang.Object r0 = r5.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r0 = (p052.InterfaceC6554) r0
            kotlin.AbstractC5185.m10210(r6)
            androidx.activity.AbstractC0053.m137(r6)
            r5.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Throwable -> L43
            r5.label = r4     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Throwable -> L43
            java.lang.Object r5 = r0.invoke(r2, r5)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Throwable -> L43
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.AbstractC5399.m10509(r2, r2)
            throw r2
        L43:
            throw r2     // Catch: java.lang.Throwable -> L45
        L44:
            throw r5     // Catch: java.lang.Throwable -> L45
        L45:
            kotlinx.coroutines.AbstractC5399.m10509(r2, r2)
            throw r2
        L49:
            kotlin.AbstractC5185.m10210(r6)
            r5.L$0 = r2
            r5.label = r3
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r5 = io.ktor.client.plugins.sse.AbstractC3902.f12103
            int r5 = io.ktor.client.plugins.AbstractC3938.f12153
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
