package yyds;

import android.net.http.X509TrustManagerExtensions;
import android.os.StrictMode;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: yyds.ᛶᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1284 {

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final List f5893 = AbstractC0795.m1806(new EnumC0940[]{EnumC0940.HTTP_2, EnumC0940.HTTP_1_1});

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final List f5894 = AbstractC0795.m1806(new C2640[]{C2640.f13018, C2640.f13019});

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final C0052 f5895;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final SocketFactory f5896;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f5897;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0469 f5898;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final C2014 f5899;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f5900;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f5901;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final int f5902;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0299 f5903;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final C2342 f5904;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final SSLSocketFactory f5905;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final List f5906;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final List f5907;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final long f5908;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final int f5909;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final List f5910;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC2656 f5911;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final int f5912;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final AbstractC0181 f5913;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0135 f5914;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ProxySelector f5915;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final C0105 f5916;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C1985 f5917;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final HostnameVerifier f5918;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f5919;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final X509TrustManager f5920;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f5921;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1693 f5922;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final int f5923;

    public C1284(C2787 c2787) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory socketFactory;
        X509TrustManager x509TrustManager;
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AbstractC0181 c0143;
        this.f5903 = c2787.f13619;
        this.f5907 = AbstractC0795.m1807(c2787.f13635);
        this.f5919 = AbstractC0795.m1807(c2787.f13638);
        this.f5922 = c2787.f13617;
        this.f5901 = c2787.f13637;
        this.f5921 = c2787.f13627;
        this.f5911 = c2787.f13613;
        this.f5897 = c2787.f13616;
        this.f5900 = c2787.f13633;
        this.f5917 = c2787.f13630;
        this.f5914 = c2787.f13631;
        ProxySelector proxySelector = c2787.f13614;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = C2306.f11311;
        }
        this.f5915 = proxySelector;
        this.f5898 = c2787.f13612;
        this.f5896 = c2787.f13621;
        List list = c2787.f13622;
        this.f5910 = list;
        this.f5906 = c2787.f13634;
        this.f5918 = c2787.f13620;
        this.f5912 = c2787.f13625;
        this.f5909 = c2787.f13618;
        this.f5902 = c2787.f13639;
        this.f5923 = c2787.f13624;
        this.f5908 = c2787.f13615;
        C2014 c2014 = c2787.f13632;
        this.f5899 = c2014 == null ? new C2014(14, (byte) 0) : c2014;
        C0105 c0105 = c2787.f13611;
        this.f5916 = c0105 == null ? C0105.f738 : c0105;
        C0052 c0052 = c2787.f13623;
        if (c0052 == null) {
            c0052 = new C0052(9);
            c2787.f13623 = c0052;
        }
        this.f5895 = c0052;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C2640) it.next()).f13020) {
                    socketFactory = c2787.f13636;
                    if (socketFactory == null) {
                        C1966 c1966 = AbstractC1325.f6087;
                        AbstractC1325.f6087.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                x509TrustManager = (X509TrustManager) trustManager;
                                this.f5920 = x509TrustManager;
                                AbstractC1325.f6087.getClass();
                                try {
                                    StrictMode.noteSlowCall("newSSLContext");
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                                    socketFactory = sSLContext.getSocketFactory();
                                    this.f5905 = socketFactory;
                                    AbstractC1325.f6087.getClass();
                                    try {
                                        x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
                                    } catch (IllegalArgumentException unused) {
                                        x509TrustManagerExtensions = null;
                                    }
                                    C0766 c0766 = x509TrustManagerExtensions != null ? new C0766(x509TrustManager, x509TrustManagerExtensions) : null;
                                    if (c0766 != null) {
                                        c0143 = c0766;
                                    } else {
                                        StrictMode.noteSlowCall("buildTrustRootIndex");
                                        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                                        c0143 = new C0143(new C0460((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
                                    }
                                    this.f5913 = c0143;
                                    C2342 c2342 = c2787.f13629;
                                    this.f5904 = AbstractC1544.m3188(c2342.f11510, c0143) ? c2342 : new C2342(c2342.f11509, c0143);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
                    }
                    this.f5905 = socketFactory;
                    c0143 = c2787.f13628;
                    this.f5913 = c0143;
                    x509TrustManager = c2787.f13626;
                    this.f5920 = x509TrustManager;
                    C2342 c23422 = c2787.f13629;
                    this.f5904 = AbstractC1544.m3188(c23422.f11510, c0143) ? c23422 : new C2342(c23422.f11509, c0143);
                }
            }
            this.f5905 = null;
            this.f5913 = null;
            this.f5920 = null;
            this.f5904 = C2342.f11508;
            socketFactory = null;
            c0143 = null;
            x509TrustManager = null;
        } else {
            this.f5905 = null;
            this.f5913 = null;
            this.f5920 = null;
            this.f5904 = C2342.f11508;
            socketFactory = null;
            c0143 = null;
            x509TrustManager = null;
        }
        List list2 = this.f5919;
        List list3 = this.f5907;
        if (list3.contains(null)) {
            C0188.m802(list3, "Null interceptor: ");
            throw null;
        }
        if (list2.contains(null)) {
            C0188.m802(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.f5910;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C2640) it2.next()).f13020) {
                    if (socketFactory == null) {
                        C0188.m800("sslSocketFactory == null");
                        throw null;
                    }
                    if (c0143 == null) {
                        C0188.m800("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    C0188.m800("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (socketFactory != null) {
            C0188.m800("Check failed.");
            throw null;
        }
        if (c0143 != null) {
            C0188.m800("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            C0188.m800("Check failed.");
            throw null;
        }
        if (AbstractC1544.m3188(this.f5904, C2342.f11508)) {
            return;
        }
        C0188.m800("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2729 m2559(C2098 c2098) {
        return new C2729(this, c2098);
    }
}
