package p000;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz1 {

    /* JADX INFO: renamed from: a */
    public static volatile zz1 f14161a;

    /* JADX INFO: renamed from: b */
    public static final Logger f14162b;

    static {
        try {
            for (Map.Entry entry : AbstractC0453m9.f6519b.entrySet()) {
                AbstractC0453m9.m3046b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        zz1 c0911y5 = C0911y5.f13305d ? new C0911y5() : null;
        if (c0911y5 == null) {
            c0911y5 = C0084ca.f1255d ? new C0084ca() : null;
        }
        if (c0911y5 == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        f14161a = c0911y5;
        f14162b = Logger.getLogger(et1.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public abstract up0 mo710a(X509TrustManager x509TrustManager);

    /* JADX INFO: renamed from: b */
    public abstract void mo711b(SSLSocket sSLSocket, String str, List list);

    /* JADX INFO: renamed from: c */
    public void mo712c(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo713d(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: e */
    public Object mo6222e() {
        if (f14162b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo714f(String str);

    /* JADX INFO: renamed from: g */
    public abstract void mo715g(String str, int i, Throwable th);

    /* JADX INFO: renamed from: h */
    public void mo6223h(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo715g(str, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: i */
    public abstract SSLContext mo716i();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
