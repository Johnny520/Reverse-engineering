package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.text.AbstractC5143;
import p056.AbstractC6602;
import p230.C8048;
import p249.InterfaceC8159;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4291 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8159 f12845;

    static {
        InterfaceC8159 c8048;
        String name = AbstractC6602.class.getName();
        if (AbstractC5143.m10171(name, "Kt$", false)) {
            name = AbstractC5143.m10138(name, "Kt$");
        } else if (AbstractC5143.m10171(name, "$", false)) {
            name = AbstractC5143.m10138(name, "$");
        }
        if (System.getProperty("kotlin-logging-to-android-native") != null) {
            c8048 = new C4484(name, 5);
        } else {
            InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712(name);
            interfaceC9156M14712.getClass();
            c8048 = new C8048(interfaceC9156M14712, 2);
        }
        f12845 = c8048;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8740(io.ktor.server.routing.C4154 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpPostEndpoint$1
            if (r0 == 0) goto L13
            r0 = r8
            io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpPostEndpoint$1 r0 = (io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpPostEndpoint$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpPostEndpoint$1 r0 = new io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpPostEndpoint$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r4 = io.modelcontextprotocol.kotlin.sdk.server.AbstractC4291.f12845
            r5 = 1
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L48
            r7 = 2
            if (r2 == r7) goto L44
            r7 = 3
            if (r2 != r7) goto L3e
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.AbstractC5184.m10206(r8)
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰 r8 = new io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰
            r8.<init>(r7, r5)
            r4.mo9057(r8)
            return r6
        L3e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L44:
            kotlin.AbstractC5184.m10206(r8)
            return r6
        L48:
            kotlin.AbstractC5184.m10206(r8)
            return r6
        L4c:
            kotlin.AbstractC5184.m10206(r8)
            io.ktor.server.routing.飘花落叶言子楪哲兰苏世 r8 = r7.f12579
            kotlin.飘花落叶言子楪苏世哲兰 r8 = r8.f12611
            java.lang.Object r8 = r8.getValue()
            io.ktor.server.routing.飘花落叶言子楪兰哲苏世 r8 = (io.ktor.server.routing.C4156) r8
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪兰苏哲 r8 = r8.f12589
            java.lang.String r2 = "sessionId"
            java.lang.String r8 = r8.mo8366(r2)
            if (r8 != 0) goto L8b
            io.ktor.server.routing.飘花落叶言子楪哲兰苏世 r7 = r7.f12579
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22355
            io.ktor.server.routing.飘花落叶言子世苏楪哲兰 r2 = r7.mo8471()
            r2.mo396(r8)
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r8 = kotlin.jvm.internal.AbstractC4395.f12971
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r8 = r8.mo8927(r2)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r3 = kotlin.jvm.internal.AbstractC4395.m8922(r2)     // Catch: java.lang.Throwable -> L7a
        L7a:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r2 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r2.<init>(r8, r3)
            r0.label = r5
            java.lang.String r8 = "sessionId query parameter is not provided"
            java.lang.Object r7 = r7.mo8472(r8, r2, r0)
            if (r7 != r1) goto L8a
            return r1
        L8a:
            return r6
        L8b:
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰 r7 = new io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰
            r0 = 0
            r7.<init>(r8, r0)
            r4.mo9058(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.server.AbstractC4291.m8740(io.ktor.server.routing.飘花落叶言子楪兰世苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8741(io.ktor.server.sse.InterfaceC4171 r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpSseEndpoint$1
            if (r0 == 0) goto L13
            r0 = r6
            io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpSseEndpoint$1 r0 = (io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpSseEndpoint$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpSseEndpoint$1 r0 = new io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcpSseEndpoint$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            if (r1 == 0) goto L41
            r4 = 1
            if (r1 != r4) goto L3b
            java.lang.Object r4 = r0.L$0
            if (r4 != 0) goto L37
            kotlin.AbstractC5184.m10206(r6)
            androidx.window.area.飘花落叶言子楪世兰哲苏 r4 = new androidx.window.area.飘花落叶言子楪世兰哲苏
            r5 = 8
            r4.<init>(r5)
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r5 = io.modelcontextprotocol.kotlin.sdk.server.AbstractC4291.f12845
            r5.mo9058(r4)
            return
        L37:
            com.alibaba.fastjson2.C2941.m6336()
            return
        L3b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return
        L41:
            kotlin.AbstractC5184.m10206(r6)
            r4.getClass()
            r5.getClass()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.server.AbstractC4291.m8741(io.ktor.server.sse.飘花落叶言子楪世哲兰苏, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
