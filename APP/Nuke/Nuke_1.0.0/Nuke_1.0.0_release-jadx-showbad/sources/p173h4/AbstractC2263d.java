package p173h4;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p011B4.AbstractC0231b;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p118X3.C1715y;
import p179i4.AbstractC2348c;
import p196l4.C2513b;
import p196l4.InterfaceC2515d;

/* JADX INFO: renamed from: h4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2263d {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC2263d f7404a;

    /* JADX INFO: renamed from: b */
    public static final Logger f7405b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            for (Map.Entry entry : AbstractC2348c.f7644b.entrySet()) {
                AbstractC2348c.m4177b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e5) {
            System.err.println("Possibly running android unit test without robolectric");
            e5.printStackTrace();
        } catch (UnsatisfiedLinkError e6) {
            System.err.println("Possibly running android unit test without robolectric");
            e6.printStackTrace();
        }
        AbstractC2263d c2260a = C2260a.f7398d ? new C2260a() : null;
        if (c2260a == null) {
            c2260a = C2262c.f7402d ? new C2262c() : null;
        }
        if (c2260a == null) {
            throw new IllegalStateException(AbstractC0231b.m398i("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT));
        }
        f7404a = c2260a;
        f7405b = Logger.getLogger(C1715y.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0797o mo4110a(X509TrustManager x509TrustManager);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public InterfaceC2515d mo4111b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C2513b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4112c(SSLSocket sSLSocket, String str, List list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void mo4120d(Socket socket, InetSocketAddress inetSocketAddress, int i5) throws IOException {
        AbstractC1665j.m2985e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i5);
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo4113e(SSLSocket sSLSocket);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public Object mo4114f() {
        if (f7405b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo4115g(String str);

    /* JADX INFO: renamed from: h */
    public abstract void mo4116h(String str, int i5, Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void mo4117i(Object obj, String str) {
        AbstractC1665j.m2985e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo4116h(str, 5, (Throwable) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public SSLContext mo4118j() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC1665j.m2984d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName();
    }
}
