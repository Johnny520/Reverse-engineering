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
import p023.C6956;
import p023.C6972;
import p033.AbstractC7067;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClientBuilder {
    public static C6956 build() {
        X509TrustManager x509TrustManager = getX509TrustManager();
        C6972 c6972M12076 = new C6956().m12076();
        SSLSocketFactory socketFactory = getSocketFactory(x509TrustManager);
        socketFactory.getClass();
        x509TrustManager.getClass();
        if (!socketFactory.equals(c6972M12076.f17196) || !x509TrustManager.equals(c6972M12076.f17193)) {
            c6972M12076.f17174 = null;
        }
        c6972M12076.f17196 = socketFactory;
        AbstractC7067 abstractC7067 = AbstractC7067.f17543;
        c6972M12076.f17190 = AbstractC7067.f17543.mo12279(x509TrustManager);
        c6972M12076.f17193 = x509TrustManager;
        HostnameVerifier hostnameVerifier = getHostnameVerifier();
        hostnameVerifier.getClass();
        if (!hostnameVerifier.equals(c6972M12076.f17185)) {
            c6972M12076.f17174 = null;
        }
        c6972M12076.f17185 = hostnameVerifier;
        return new C6956(c6972M12076);
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
