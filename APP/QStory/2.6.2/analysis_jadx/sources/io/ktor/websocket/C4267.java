package io.ktor.websocket;

import androidx.appcompat.widget.C0137;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import p057.InterfaceC6850;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4267 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4270 f12804;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public WebSocketReader$State f12805;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0137 f12806;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5189 f12807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f12808;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f12809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4251 f12810;

    public C4267(InterfaceC4251 interfaceC4251, InterfaceC4359 interfaceC4359, long j, InterfaceC6850 interfaceC6850) {
        interfaceC4251.getClass();
        interfaceC4359.getClass();
        this.f12810 = interfaceC4251;
        this.f12808 = interfaceC4359;
        this.f12809 = j;
        this.f12805 = WebSocketReader$State.HEADER;
        this.f12804 = new C4270();
        this.f12806 = new C0137((byte) 0, 5);
        this.f12807 = AbstractC5204.m10278(8, 6, null);
        AbstractC5398.m10474(this, new C5401("ws-reader"), CoroutineStart.ATOMIC, new WebSocketReader$readerJob$1(interfaceC6850, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r7.m8732(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8731(io.ktor.websocket.C4267 r6, java.nio.ByteBuffer r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof io.ktor.websocket.WebSocketReader$readLoop$1
            if (r0 == 0) goto L16
            r0 = r8
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = (io.ktor.websocket.WebSocketReader$readLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = new io.ktor.websocket.WebSocketReader$readLoop$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.飘花落叶言子楪兰哲苏世 r7 = (io.ktor.websocket.C4267) r7
            kotlin.AbstractC5184.m10206(r8)
        L34:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L87
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L3f:
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.飘花落叶言子楪兰哲苏世 r7 = (io.ktor.websocket.C4267) r7
            kotlin.AbstractC5184.m10206(r8)
            goto L69
        L4b:
            kotlin.AbstractC5184.m10206(r8)
            r7.clear()
        L51:
            io.ktor.websocket.WebSocketReader$State r8 = r6.f12805
            io.ktor.websocket.WebSocketReader$State r2 = io.ktor.websocket.WebSocketReader$State.CLOSED
            if (r8 == r2) goto L8b
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r8 = r6.f12810
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = io.ktor.utils.io.AbstractC4243.m8686(r8, r7, r0)
            if (r8 != r1) goto L66
            goto L86
        L66:
            r5 = r7
            r7 = r6
            r6 = r5
        L69:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r2 = -1
            if (r8 != r2) goto L77
            io.ktor.websocket.WebSocketReader$State r6 = io.ktor.websocket.WebSocketReader$State.CLOSED
            r7.f12805 = r6
            goto L8b
        L77:
            r6.flip()
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r7.m8732(r6, r0)
            if (r8 != r1) goto L34
        L86:
            return r1
        L87:
            r7.compact()
            goto L51
        L8b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4267.m8731(io.ktor.websocket.飘花落叶言子楪兰哲苏世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12808;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x024b, code lost:
    
        return kotlin.C5175.f14739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
    
        if (r4.get() != io.ktor.websocket.FrameParser$State.BODY) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
    
        r2.f12805 = io.ktor.websocket.WebSocketReader$State.BODY;
        r10 = r9.f12824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
    
        if (r10 > 2147483647L) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r10 > r2.f12809) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r4 = (int) r10;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        if (r8.f596 != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r8.f596 = r4;
        r9 = (java.nio.ByteBuffer) r8.f595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r9.capacity() >= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        r8.f595 = java.nio.ByteBuffer.allocate(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r4 = (java.nio.ByteBuffer) r8.f595;
        r4.getClass();
        r4.clear();
        r4 = r8.f596;
        r9 = (java.nio.ByteBuffer) r8.f595;
        r9.getClass();
        r8.f596 = r4 - io.ktor.util.AbstractC4216.m8648(r0, r9, r8.f596);
        r1.L$0 = r2;
        r1.L$1 = r0;
        r1.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0161, code lost:
    
        if (r2.m8733(r1) != r3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        top.suzhelan.qstory.hook.item.C5919.m11250("remaining should be 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r9.f12824);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8732(java.nio.ByteBuffer r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws io.ktor.websocket.FrameTooBigException, io.ktor.websocket.ProtocolViolationException {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4267.m8732(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8733(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4267.m8733(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
