package lin.xposed.hook.javaplugin.online.upload;

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
import p007.C6127;
import p007.C6143;
import p017.AbstractC6238;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClientBuilder {
    public static C6127 build() {
        X509TrustManager x509TrustManager = getX509TrustManager();
        C6143 c6143M11517 = new C6127().m11517();
        SSLSocketFactory socketFactory = getSocketFactory(x509TrustManager);
        socketFactory.getClass();
        x509TrustManager.getClass();
        if (!socketFactory.equals(c6143M11517.f16851) || !x509TrustManager.equals(c6143M11517.f16848)) {
            c6143M11517.f16829 = null;
        }
        c6143M11517.f16851 = socketFactory;
        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
        c6143M11517.f16845 = AbstractC6238.f17198.mo11720(x509TrustManager);
        c6143M11517.f16848 = x509TrustManager;
        HostnameVerifier hostnameVerifier = getHostnameVerifier();
        hostnameVerifier.getClass();
        if (!hostnameVerifier.equals(c6143M11517.f16840)) {
            c6143M11517.f16829 = null;
        }
        c6143M11517.f16840 = hostnameVerifier;
        return new C6127(c6143M11517);
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
            SSLContext sSLContext = SSLContext.getInstance(AbstractC8405.m13973("喵喵呜喵喵喵喵喵~喵喵呜喵喵呜呜喵~喵喵呜呜喵呜呜喵"));
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
