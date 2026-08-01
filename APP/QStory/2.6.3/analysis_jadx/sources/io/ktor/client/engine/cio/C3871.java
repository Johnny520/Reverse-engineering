package io.ktor.client.engine.cio;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5401;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3871 implements InterfaceC5401, Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12090 = AtomicIntegerFieldUpdater.newUpdater(C3871.class, "connections");
    private volatile /* synthetic */ int connections;
    volatile /* synthetic */ long lastActivity;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m8257(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws io.ktor.client.engine.cio.FailToConnectException, io.ktor.client.network.sockets.ConnectTimeoutException {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.C3871.m8257(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
