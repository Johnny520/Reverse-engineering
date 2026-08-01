package io.ktor.client.plugins.websocket.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt", f = "buildersCio.kt", l = {63, 71, 75, 73, 75, 75}, m = "webSocketRaw")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BuildersCioKt$webSocketRaw$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersCioKt$webSocketRaw$1(InterfaceC4356<? super BuildersCioKt$webSocketRaw$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.result = r4
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r3.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L3f;
                case 2: goto L31;
                case 3: goto L2d;
                case 4: goto L1f;
                case 5: goto L2d;
                case 6: goto L16;
                default: goto L10;
            }
        L10:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r3)
            return r2
        L16:
            java.lang.Object r3 = r3.L$0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.AbstractC5184.m10206(r4)
            goto L88
        L1f:
            java.lang.Object r0 = r3.L$0
            if (r0 != 0) goto L29
            kotlin.AbstractC5184.m10206(r4)     // Catch: java.lang.Throwable -> L27
            goto L6c
        L27:
            r4 = move-exception
            goto L7b
        L29:
            com.alibaba.fastjson2.C2941.m6336()
            return r2
        L2d:
            kotlin.AbstractC5184.m10206(r4)
            goto L78
        L31:
            java.lang.Object r0 = r3.L$0
            if (r0 != 0) goto L3b
            kotlin.AbstractC5184.m10206(r4)     // Catch: java.lang.Throwable -> L39
            goto L54
        L39:
            r4 = move-exception
            goto L60
        L3b:
            com.alibaba.fastjson2.C2941.m6336()
            return r2
        L3f:
            java.lang.Object r0 = r3.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r0 = (p052.InterfaceC6553) r0
            kotlin.AbstractC5184.m10206(r4)
            if (r4 != 0) goto L89
            r3.L$0 = r2     // Catch: java.lang.Throwable -> L39
            r4 = 2
            r3.label = r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L39
            if (r4 != r1) goto L54
            goto L86
        L54:
            r3.L$0 = r2
            r4 = 3
            r3.label = r4
            java.lang.Object r3 = io.ktor.websocket.AbstractC4256.m8723(r2, r3)
            if (r3 != r1) goto L78
            goto L86
        L60:
            r3.L$0 = r2     // Catch: java.lang.Throwable -> L27
            r0 = 4
            r3.label = r0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = io.ktor.websocket.AbstractC4256.m8722(r2, r4, r3)     // Catch: java.lang.Throwable -> L27
            if (r4 != r1) goto L6c
            goto L86
        L6c:
            r3.L$0 = r2
            r4 = 5
            r3.label = r4
            java.lang.Object r3 = io.ktor.websocket.AbstractC4256.m8723(r2, r3)
            if (r3 != r1) goto L78
            goto L86
        L78:
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5175.f14739
            goto L86
        L7b:
            r3.L$0 = r4
            r0 = 6
            r3.label = r0
            java.lang.Object r3 = io.ktor.websocket.AbstractC4256.m8723(r2, r3)
            if (r3 != r1) goto L87
        L86:
            return r1
        L87:
            r3 = r4
        L88:
            throw r3
        L89:
            com.alibaba.fastjson2.C2941.m6336()
            return r2
        L8d:
            kotlin.AbstractC5184.m10206(r4)
            r3.L$0 = r2
            r4 = 1
            r3.label = r4
            飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰楪哲 r3 = new 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰楪哲
            r3.<init>()
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏哲兰 r3 = p236.C8098.f22372
            io.ktor.util.飘花落叶言子楪世哲兰苏 r3 = new io.ktor.util.飘花落叶言子楪世哲兰苏
            r3.<init>()
            kotlinx.coroutines.AbstractC5398.m10483()
            io.ktor.util.AbstractC4216.m8637(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.cio.BuildersCioKt$webSocketRaw$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
