package io.ktor.server.websocket;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4178 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r7, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r1) == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8543(io.ktor.websocket.C4261 r7, io.ktor.server.application.InterfaceC4057 r8, p052.InterfaceC6554 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws io.ktor.util.cio.ChannelIOException {
        /*
            java.lang.String r0 = "Starting websocket session for "
            boolean r1 = r10 instanceof io.ktor.server.websocket.RoutingKt$handleServerSession$1
            if (r1 == 0) goto L15
            r1 = r10
            io.ktor.server.websocket.RoutingKt$handleServerSession$1 r1 = (io.ktor.server.websocket.RoutingKt$handleServerSession$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.server.websocket.RoutingKt$handleServerSession$1 r1 = new io.ktor.server.websocket.RoutingKt$handleServerSession$1
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L47
            if (r3 == r6) goto L3a
            if (r3 != r4) goto L34
            java.lang.Object r7 = r1.L$0
            r8 = r7
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r8 = (io.ktor.server.application.InterfaceC4057) r8
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            goto L85
        L32:
            r7 = move-exception
            goto L88
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r5
        L3a:
            java.lang.Object r7 = r1.L$1
            r8 = r7
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r8 = (io.ktor.server.application.InterfaceC4057) r8
            java.lang.Object r7 = r1.L$0
            io.ktor.websocket.飘花落叶言子楪世哲苏兰 r7 = (io.ktor.websocket.InterfaceC4262) r7
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            goto L78
        L47:
            kotlin.AbstractC5185.m10210(r10)
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r10 = io.ktor.server.websocket.AbstractC4184.f12653     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            io.ktor.server.request.飘花落叶言子楪世哲苏兰 r0 = r8.mo8459()     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.String r0 = com.alibaba.fastjson2.AbstractC2905.m6295(r0)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r3.append(r0)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r10.trace(r0)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r7.getClass()     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            io.ktor.server.websocket.飘花落叶言子楪世苏兰哲 r10 = new io.ktor.server.websocket.飘花落叶言子楪世苏兰哲     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r10.<init>(r8, r7)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r1.L$0 = r7     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r1.L$1 = r8     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r1.label = r6     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.Object r9 = r9.invoke(r10, r1)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            if (r9 != r2) goto L78
            goto L84
        L78:
            r1.L$0 = r8     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r1.L$1 = r5     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r1.label = r4     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.Object r7 = io.ktor.websocket.AbstractC4257.m8713(r7, r1)     // Catch: java.lang.Throwable -> L32 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            if (r7 != r2) goto L85
        L84:
            return r2
        L85:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        L88:
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r8 = r8.mo8460()
            r8.getClass()
            io.ktor.server.application.飘花落叶言子楪世哲兰苏 r8 = r8.f12341
            io.ktor.server.engine.飘花落叶言子楪世哲苏兰 r8 = (io.ktor.server.engine.C4092) r8
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r8 = r8.f12437
            java.lang.String r9 = "Websocket handler failed"
            r8.error(r9, r7)
            throw r7
        L9b:
            r7 = move-exception
            throw r7
        L9d:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.websocket.AbstractC4178.m8543(io.ktor.websocket.飘花落叶言子楪世哲兰苏, io.ktor.server.application.飘花落叶言子楪世苏兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8544(io.ktor.server.websocket.InterfaceC4177 r9, p052.InterfaceC6554 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.server.websocket.RoutingKt$proceedWebSocket$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.server.websocket.RoutingKt$proceedWebSocket$1 r0 = (io.ktor.server.websocket.RoutingKt$proceedWebSocket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.websocket.RoutingKt$proceedWebSocket$1 r0 = new io.ktor.server.websocket.RoutingKt$proceedWebSocket$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            kotlin.AbstractC5185.m10210(r11)
            return r4
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r3
        L33:
            java.lang.Object r9 = r0.L$0
            io.ktor.websocket.飘花落叶言子楪世哲苏兰 r9 = (io.ktor.websocket.InterfaceC4262) r9
            kotlin.AbstractC5185.m10210(r11)
            goto L81
        L3b:
            kotlin.AbstractC5185.m10210(r11)
            r9.getClass()
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r11 = r9.mo8542()
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r11 = r11.mo8460()
            io.ktor.server.websocket.飘花落叶言子楪苏世哲兰 r2 = io.ktor.server.websocket.C4182.f12646
            java.lang.Object r11 = io.ktor.server.application.AbstractC4054.m8455(r11)
            io.ktor.server.websocket.飘花落叶言子楪苏世兰哲 r11 = (io.ktor.server.websocket.C4182) r11
            long r7 = r11.f12652
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r11 = io.ktor.websocket.AbstractC4260.f12784
            boolean r11 = r9 instanceof io.ktor.websocket.InterfaceC4262
            if (r11 != 0) goto La0
            io.ktor.websocket.飘花落叶言子楪世哲兰苏 r11 = new io.ktor.websocket.飘花落叶言子楪世哲兰苏
            r11.<init>(r9, r7)
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r2 = r9.mo8542()
            io.ktor.util.飘花落叶言子楪世兰哲苏 r2 = r2.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r7 = io.ktor.server.websocket.C4182.f12648
            java.lang.Object r2 = r2.m8589(r7)
            java.util.List r2 = (java.util.List) r2
            r11.m8719(r2)
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r9 = r9.mo8542()
            r0.L$0 = r11
            r0.label = r6
            java.lang.Object r9 = m8543(r11, r9, r10, r0)
            if (r9 != r1) goto L80
            goto L9e
        L80:
            r9 = r11
        L81:
            r0.L$0 = r3
            r0.label = r5
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r9 = r9.mo2430()
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r10 = kotlinx.coroutines.C5453.f15105
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r9 = r9.get(r10)
            r9.getClass()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r9 = (kotlinx.coroutines.InterfaceC5452) r9
            java.lang.Object r9 = r9.mo10564(r0)
            if (r9 != r1) goto L9b
            goto L9c
        L9b:
            r9 = r4
        L9c:
            if (r9 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r4
        La0:
            java.lang.String r9 = "Cannot wrap other DefaultWebSocketSession"
            top.suzhelan.qstory.hook.item.C5925.m11310(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.websocket.AbstractC4178.m8544(io.ktor.server.websocket.飘花落叶言子楪世兰苏哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
