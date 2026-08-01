package io.ktor.client.engine.cio;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3870 implements InterfaceC5400, Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12085 = AtomicIntegerFieldUpdater.newUpdater(C3870.class, "connections");
    private volatile /* synthetic */ int connections;
    volatile /* synthetic */ long lastActivity;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m8270(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws io.ktor.client.engine.cio.FailToConnectException, io.ktor.client.network.sockets.ConnectTimeoutException {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.C3870.m8270(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
