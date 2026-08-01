package io.ktor.websocket;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.C5476;
import p058.AbstractC6854;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4256 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m8720(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer2.getClass();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i = 0; i < iRemaining2; i++) {
            byteBufferSlice.put(i, (byte) (byteBufferSlice.get(i) ^ byteBufferSlice2.get(i % iRemaining)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4262 m8721(C4277 c4277) throws EOFException {
        byte[] bArr = c4277.f12832;
        if (bArr.length < 2) {
            return null;
        }
        C5476 c5476 = new C5476();
        AbstractC6854.m12055(c5476, bArr, 0, bArr.length);
        return new C4262(AbstractC6854.m12049(c5476, null, 3), c5476.readShort());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m8722(InterfaceC4257 interfaceC4257, Throwable th, ContinuationImpl continuationImpl) {
        Object objM8724 = m8724(interfaceC4257, th instanceof CancellationException ? new C4262(CloseReason$Codes.NORMAL, "") : new C4262(CloseReason$Codes.INTERNAL_ERROR, th.toString()), continuationImpl);
        return objM8724 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8724 : C5175.f14739;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r6.mo8558(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8724(io.ktor.websocket.InterfaceC4257 r6, io.ktor.websocket.C4262 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.websocket.WebSocketSessionKt$close$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = (io.ktor.websocket.WebSocketSessionKt$close$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = new io.ktor.websocket.WebSocketSessionKt$close$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L57
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r6 = (io.ktor.websocket.InterfaceC4257) r6
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L57
            goto L4c
        L39:
            kotlin.AbstractC5184.m10206(r8)
            io.ktor.websocket.飘花落叶言子楪苏世哲兰 r8 = new io.ktor.websocket.飘花落叶言子楪苏世哲兰     // Catch: java.lang.Throwable -> L57
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L57
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L57
            r0.label = r5     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r6.mo8556(r8, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L4c
            goto L56
        L4c:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L57
            r0.label = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r6.mo8558(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.AbstractC4256.m8724(io.ktor.websocket.飘花落叶言子世楪苏哲兰, io.ktor.websocket.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
