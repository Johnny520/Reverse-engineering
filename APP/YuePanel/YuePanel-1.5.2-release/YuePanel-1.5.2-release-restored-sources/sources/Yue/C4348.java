package Yue;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4348 implements InterfaceC8421 {

    /* JADX INFO: renamed from: ۥ */
    public SSLContext f827;

    /* JADX INFO: renamed from: ۥ۟ */
    public ExecutorService f828;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4348(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // Yue.InterfaceC8421
    public void close() {
        this.f828.shutdown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ InterfaceC8409 mo1315(AbstractC8410 abstractC8410, List list) {
        return mo1315(abstractC8410, (List<AbstractC4514>) list);
    }

    @Override // Yue.InterfaceC8421
    /* JADX INFO: renamed from: ۥ۟۟ */
    public ByteChannel mo12319(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f827.createSSLEngine();
        ArrayList arrayList = new ArrayList(Arrays.asList(sSLEngineCreateSSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sSLEngineCreateSSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new C7201(socketChannel, sSLEngineCreateSSLEngine, this.f828, selectionKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4348(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f827 = sSLContext;
        this.f828 = executorService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ(LYue/ۥۢۥۡۡ;LYue/ۥ۠۠۠۟;)LYue/ۥۢۥۡ۠; */
    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ */
    public C8414 mo1314(AbstractC8410 abstractC8410, AbstractC4514 abstractC4514) {
        return new C8414(abstractC8410, abstractC4514);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC8421, Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ۟ */
    public C8414 mo1315(AbstractC8410 abstractC8410, List<AbstractC4514> list) {
        return new C8414(abstractC8410, list);
    }
}
