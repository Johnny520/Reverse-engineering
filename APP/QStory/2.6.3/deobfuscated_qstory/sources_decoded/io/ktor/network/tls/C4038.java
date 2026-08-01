package io.ktor.network.tls;

import io.ktor.network.sockets.AbstractC4023;
import io.ktor.network.sockets.InterfaceC4022;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4227;
import io.ktor.utils.io.C4230;
import io.ktor.utils.io.C4249;
import java.io.IOException;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5200;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4038 implements InterfaceC5401, InterfaceC4022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4360 f12315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5200 f12316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4022 f12317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5199 f12318;

    public C4038(InterfaceC5199 interfaceC5199, InterfaceC5200 interfaceC5200, InterfaceC4022 interfaceC4022, InterfaceC4360 interfaceC4360) {
        interfaceC5199.getClass();
        interfaceC5200.getClass();
        interfaceC4022.getClass();
        interfaceC4360.getClass();
        this.f12318 = interfaceC5199;
        this.f12316 = interfaceC5200;
        this.f12317 = interfaceC4022;
        this.f12315 = interfaceC4360;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r14.mo8433(r10, r0) == r1) goto L32;
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
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8442(io.ktor.network.tls.C4038 r12, io.ktor.utils.io.InterfaceC4252 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.C4038.m8442(io.ktor.network.tls.飘花落叶言子楪哲世兰苏, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
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
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8443(io.ktor.network.tls.C4038 r11, io.ktor.utils.io.InterfaceC4247 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.C4038.m8443(io.ktor.network.tls.飘花落叶言子楪哲世兰苏, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12317.close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4012, kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        this.f12317.dispose();
    }

    @Override // io.ktor.network.sockets.InterfaceC4015
    public final AbstractC4023 getLocalAddress() {
        return this.f12317.getLocalAddress();
    }

    @Override // io.ktor.network.sockets.InterfaceC4012
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC5452 mo8423() {
        return this.f12317.mo8423();
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12315;
    }

    @Override // io.ktor.network.sockets.InterfaceC4013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4227 mo8424(C4249 c4249) {
        return AbstractC4246.m8696(this, this.f12315.plus(new C5402("cio-tls-input-loop")), c4249, new TLSSocket$attachForReading$1(this, null));
    }

    @Override // io.ktor.network.sockets.InterfaceC4014
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4023 mo8425() {
        return this.f12317.mo8425();
    }

    @Override // io.ktor.network.sockets.InterfaceC4011
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C4230 mo8422(C4249 c4249) {
        return AbstractC4244.m8660(this, this.f12315.plus(new C5402("cio-tls-output-loop")), c4249, new TLSSocket$attachForWriting$1(this, null));
    }
}
