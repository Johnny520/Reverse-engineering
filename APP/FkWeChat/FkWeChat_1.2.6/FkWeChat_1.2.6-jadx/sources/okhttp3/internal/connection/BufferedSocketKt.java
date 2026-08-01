package okhttp3.internal.connection;

import java.net.Socket;
import kotlin.Metadata;
import p376zd.AbstractC9988e0;
import p376zd.InterfaceC10022v0;
import p376zd.InterfaceC9997j;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m16758d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lzd/v0;", "(Lzd/v0;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        socket.getClass();
        return asBufferedSocket(AbstractC9988e0.m38652g(socket));
    }

    public static final BufferedSocket asBufferedSocket(InterfaceC10022v0 interfaceC10022v0) {
        interfaceC10022v0.getClass();
        return new BufferedSocket(interfaceC10022v0) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            private final InterfaceC10022v0 delegate;
            private final InterfaceC9997j sink;
            private final InterfaceC9999k source;

            {
                this.delegate = interfaceC10022v0;
                this.source = AbstractC9988e0.m38648c(interfaceC10022v0.getSource());
                this.sink = AbstractC9988e0.m38647b(interfaceC10022v0.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
            public void cancel() {
                this.delegate.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
            public InterfaceC9997j getSink() {
                return this.sink;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
            public InterfaceC9999k getSource() {
                return this.source;
            }
        };
    }
}
