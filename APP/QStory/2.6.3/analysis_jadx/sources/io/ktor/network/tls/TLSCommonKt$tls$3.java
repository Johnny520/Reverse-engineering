package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSCommonKt", f = "TLSCommon.kt", l = {39}, m = "tls")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSCommonKt$tls$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TLSCommonKt$tls$3(InterfaceC4357<? super TLSCommonKt$tls$3> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.io.IOException {
        /*
            r5 = this;
            r5.result = r6
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.label = r6
            boolean r6 = r5 instanceof io.ktor.network.tls.TLSCommonKt$tls$3
            if (r6 == 0) goto L17
            int r6 = r5.label
            r1 = r6 & r0
            if (r1 == 0) goto L17
            int r6 = r6 - r0
            r5.label = r6
            goto L1d
        L17:
            io.ktor.network.tls.TLSCommonKt$tls$3 r6 = new io.ktor.network.tls.TLSCommonKt$tls$3
            r6.<init>(r5)
            r5 = r6
        L1d:
            java.lang.Object r6 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 != r3) goto L34
            java.lang.Object r5 = r5.L$0
            r2 = r5
            io.ktor.network.sockets.飘花落叶言子楪苏世兰哲 r2 = (io.ktor.network.sockets.C4026) r2
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L32
            goto L4f
        L32:
            r5 = move-exception
            goto L53
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r0 = r2
            goto L52
        L3b:
            kotlin.AbstractC5185.m10210(r6)
            io.ktor.network.sockets.飘花落叶言子楪哲兰世苏 r6 = r2.f12292     // Catch: java.lang.Throwable -> L32
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r1 = r2.f12291     // Catch: java.lang.Throwable -> L32
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r4 = r2.f12290     // Catch: java.lang.Throwable -> L32
            r5.L$0 = r2     // Catch: java.lang.Throwable -> L32
            r5.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = io.ktor.network.tls.AbstractC4035.m8441(r6, r1, r4, r2, r5)     // Catch: java.lang.Throwable -> L32
            if (r6 != r0) goto L4f
            goto L52
        L4f:
            r0 = r6
            io.ktor.network.sockets.飘花落叶言子楪哲兰世苏 r0 = (io.ktor.network.sockets.InterfaceC4022) r0     // Catch: java.lang.Throwable -> L32
        L52:
            return r0
        L53:
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = r2.f12291
            r6.mo8645(r5)
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = r2.f12290
            io.ktor.utils.io.AbstractC4246.m8692(r6, r5)
            io.ktor.network.sockets.飘花落叶言子楪哲兰世苏 r6 = r2.f12292
            r6.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSCommonKt$tls$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
