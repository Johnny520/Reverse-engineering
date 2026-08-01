package io.ktor.client.statement;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {123}, m = "bodyAsText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpResponseKt$bodyAsText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsText$1(InterfaceC4357<? super HttpResponseKt$bodyAsText$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r3.result = r4
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r0
            r3.label = r4
            boolean r4 = r3 instanceof io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            if (r4 == 0) goto L17
            int r4 = r3.label
            r1 = r4 & r0
            if (r1 == 0) goto L17
            int r4 = r4 - r0
            r3.label = r4
            goto L1d
        L17:
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r4 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            r4.<init>(r3)
            r3 = r4
        L1d:
            java.lang.Object r4 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 0
            if (r0 == 0) goto L48
            r2 = 1
            if (r0 != r2) goto L42
            java.lang.Object r3 = r3.L$0
            java.nio.charset.CharsetDecoder r3 = (java.nio.charset.CharsetDecoder) r3
            kotlin.AbstractC5185.m10210(r4)
            if (r4 == 0) goto L3c
            kotlinx.io.飘花落叶言子楪苏兰世哲 r4 = (kotlinx.io.InterfaceC5481) r4
            r3.getClass()
            java.lang.String r1 = com.bumptech.glide.AbstractC3066.m6863(r3, r4)
            goto L47
        L3c:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.io.Source"
            bsh.C2633.m5343(r3)
            goto L47
        L42:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r3)
        L47:
            return r1
        L48:
            kotlin.AbstractC5185.m10210(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt$bodyAsText$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
