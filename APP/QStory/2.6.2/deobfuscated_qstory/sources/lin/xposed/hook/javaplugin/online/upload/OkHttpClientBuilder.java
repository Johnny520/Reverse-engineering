package lin.xposed.hook.javaplugin.online.upload;

import com.bumptech.glide.AbstractC3056;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p015.C6200;
import p015.C6216;
import p019.AbstractC6241;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClientBuilder {
    public static C6200 build() {
        X509TrustManager x509TrustManager = getX509TrustManager();
        C6216 c6216M11646 = new C6200().m11646();
        SSLSocketFactory socketFactory = getSocketFactory(x509TrustManager);
        socketFactory.getClass();
        x509TrustManager.getClass();
        if (!socketFactory.equals(c6216M11646.f17090) || !x509TrustManager.equals(c6216M11646.f17087)) {
            c6216M11646.f17068 = null;
        }
        c6216M11646.f17090 = socketFactory;
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        c6216M11646.f17084 = AbstractC6241.f17194.mo11718(x509TrustManager);
        c6216M11646.f17087 = x509TrustManager;
        HostnameVerifier hostnameVerifier = getHostnameVerifier();
        hostnameVerifier.getClass();
        if (!hostnameVerifier.equals(c6216M11646.f17079)) {
            c6216M11646.f17068 = null;
        }
        c6216M11646.f17079 = hostnameVerifier;
        return new C6200(c6216M11646);
    }

    public static HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() { // from class: lin.xposed.hook.javaplugin.online.upload.OkHttpClientBuilder.2
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        };
    }

    public static SSLSocketFactory getSocketFactory(TrustManager trustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{trustManager}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static X509TrustManager getX509TrustManager() {
        return new X509TrustManager() { // from class: lin.xposed.hook.javaplugin.online.upload.OkHttpClientBuilder.1
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }
        };
    }

    public static SSLSocketFactory getSocketFactory() {
        return getSocketFactory(getX509TrustManager());
    }
}
