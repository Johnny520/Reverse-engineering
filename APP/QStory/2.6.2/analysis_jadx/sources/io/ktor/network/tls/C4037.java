package io.ktor.network.tls;

import io.ktor.network.sockets.AbstractC4022;
import io.ktor.network.sockets.InterfaceC4021;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.C4229;
import io.ktor.utils.io.C4248;
import java.io.IOException;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.channels.InterfaceC5199;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4037 implements InterfaceC5400, InterfaceC4021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4359 f12311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5199 f12312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4021 f12313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5198 f12314;

    public C4037(InterfaceC5198 interfaceC5198, InterfaceC5199 interfaceC5199, InterfaceC4021 interfaceC4021, InterfaceC4359 interfaceC4359) {
        interfaceC5198.getClass();
        interfaceC5199.getClass();
        interfaceC4021.getClass();
        interfaceC4359.getClass();
        this.f12314 = interfaceC5198;
        this.f12312 = interfaceC5199;
        this.f12313 = interfaceC4021;
        this.f12311 = interfaceC4359;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:16:0x0045, B:33:0x0091, B:35:0x0099, B:37:0x00b4, B:47:0x00e2, B:48:0x0105, B:21:0x005b, B:24:0x006d), top: B:75:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106 A[Catch: all -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x011b, blocks: (B:59:0x0125, B:60:0x0128, B:49:0x0106, B:57:0x0123), top: B:75:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00da -> B:17:0x0048). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8452(io.ktor.network.tls.C4037 r11, io.ktor.utils.io.InterfaceC4246 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.C4037.m8452(io.ktor.network.tls.飘花落叶言子楪哲世兰苏, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r14.mo8443(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: all -> 0x0045, ClosedSendChannelException -> 0x00bd, TRY_LEAVE, TryCatch #6 {ClosedSendChannelException -> 0x00bd, all -> 0x0045, blocks: (B:13:0x003c, B:28:0x008d, B:30:0x0096, B:20:0x0060), top: B:47:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.ktor.utils.io.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r14v5, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲苏兰, 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ba -> B:14:0x003f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8453(io.ktor.network.tls.C4037 r12, io.ktor.utils.io.InterfaceC4251 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.C4037.m8453(io.ktor.network.tls.飘花落叶言子楪哲世兰苏, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12313.close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4011, kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        this.f12313.dispose();
    }

    @Override // io.ktor.network.sockets.InterfaceC4014
    public final AbstractC4022 getLocalAddress() {
        return this.f12313.getLocalAddress();
    }

    @Override // io.ktor.network.sockets.InterfaceC4011
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC5451 mo8433() {
        return this.f12313.mo8433();
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12311;
    }

    @Override // io.ktor.network.sockets.InterfaceC4012
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4226 mo8434(C4248 c4248) {
        return AbstractC4245.m8706(this, this.f12311.plus(new C5401("cio-tls-input-loop")), c4248, new TLSSocket$attachForReading$1(this, null));
    }

    @Override // io.ktor.network.sockets.InterfaceC4013
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4022 mo8435() {
        return this.f12313.mo8435();
    }

    @Override // io.ktor.network.sockets.InterfaceC4010
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C4229 mo8432(C4248 c4248) {
        return AbstractC4243.m8670(this, this.f12311.plus(new C5401("cio-tls-output-loop")), c4248, new TLSSocket$attachForWriting$1(this, null));
    }
}
