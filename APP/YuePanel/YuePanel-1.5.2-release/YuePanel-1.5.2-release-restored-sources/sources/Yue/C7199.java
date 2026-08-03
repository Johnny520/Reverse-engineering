package Yue;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7199 extends C4348 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final SSLParameters f21737;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7199(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    @Override // Yue.C4348, Yue.InterfaceC8421
    /* JADX INFO: renamed from: ۥ۟۟ */
    public ByteChannel mo12319(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f827.createSSLEngine();
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        sSLEngineCreateSSLEngine.setSSLParameters(this.f21737);
        return new C7201(socketChannel, sSLEngineCreateSSLEngine, this.f828, selectionKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7199(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.f21737 = sSLParameters;
    }
}
