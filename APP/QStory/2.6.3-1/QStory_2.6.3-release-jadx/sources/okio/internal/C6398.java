package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p020.C6924;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6398 extends C6924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Socket f15690;

    public C6398(Socket socket) {
        this.f15690 = socket;
    }

    @Override // p020.C6924
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo11489() {
        Socket socket = this.f15690;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC6397.m11488(e)) {
                throw e;
            }
            AbstractC6397.f15689.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC6397.f15689.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // p020.C6924
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final IOException mo11490(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
