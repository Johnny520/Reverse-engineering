package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p005.C6104;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5567 extends C6104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Socket f15345;

    public C5567(Socket socket) {
        this.f15345 = socket;
    }

    @Override // p005.C6104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo10873() {
        Socket socket = this.f15345;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC5566.m10872(e)) {
                throw e;
            }
            AbstractC5566.f15344.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC5566.f15344.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // p005.C6104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final IOException mo10874(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
