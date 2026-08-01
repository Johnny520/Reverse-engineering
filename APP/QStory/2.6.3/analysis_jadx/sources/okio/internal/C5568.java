package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p004.C6095;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5568 extends C6095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Socket f15345;

    public C5568(Socket socket) {
        this.f15345 = socket;
    }

    @Override // p004.C6095
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo10930() {
        Socket socket = this.f15345;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC5567.m10929(e)) {
                throw e;
            }
            AbstractC5567.f15344.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC5567.f15344.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // p004.C6095
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final IOException mo10931(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
