package Yue;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4268 extends C4348 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String[] f8790;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String[] f8791;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4268(SSLContext sSLContext, String[] strArr, String[] strArr2) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), strArr, strArr2);
    }

    @Override // Yue.C4348, Yue.InterfaceC8421
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ByteChannel mo12319(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f827.createSSLEngine();
        String[] strArr = this.f8790;
        if (strArr != null) {
            sSLEngineCreateSSLEngine.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f8791;
        if (strArr2 != null) {
            sSLEngineCreateSSLEngine.setEnabledCipherSuites(strArr2);
        }
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new C7201(socketChannel, sSLEngineCreateSSLEngine, this.f828, selectionKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4268(SSLContext sSLContext, ExecutorService executorService, String[] strArr, String[] strArr2) {
        super(sSLContext, executorService);
        this.f8790 = strArr;
        this.f8791 = strArr2;
    }
}
