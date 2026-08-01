package p007;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4211;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
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
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import okhttp3.Protocol;
import p000.C6083;
import p013.AbstractC6230;
import p015.C6234;
import p017.AbstractC6238;
import p053.AbstractC6561;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6127 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C5856 f16719;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C6234 f16720;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5856 f16721;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f16722;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f16723;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int f16724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f16725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f16726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5925 f16727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f16728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f16729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0325 f16730;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6135 f16731;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final HostnameVerifier f16732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f16733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f16734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC6561 f16735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f16736;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final SocketFactory f16737;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C6138 f16738;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f16739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f16740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final SSLSocketFactory f16741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final X509TrustManager f16742;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f16743;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6138 f16744;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC6155 f16745;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ProxySelector f16746;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f16747;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6138 f16748;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final List f16718 = AbstractC6230.m11701(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final List f16717 = AbstractC6230.m11701(new C6152[]{C6152.f16897, C6152.f16896});

    public C6127(C6143 c6143) throws NoSuchAlgorithmException, KeyStoreException {
        this.f16730 = c6143.f16839;
        this.f16729 = AbstractC6230.m11703(c6143.f16837);
        this.f16728 = AbstractC6230.m11703(c6143.f16836);
        this.f16727 = c6143.f16835;
        this.f16726 = c6143.f16834;
        this.f16725 = c6143.f16853;
        this.f16744 = c6143.f16852;
        this.f16743 = c6143.f16856;
        this.f16747 = c6143.f16857;
        this.f16748 = c6143.f16854;
        this.f16745 = c6143.f16855;
        ProxySelector proxySelector = c6143.f16847;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = C6083.f16634;
        }
        this.f16746 = proxySelector;
        this.f16738 = c6143.f16846;
        this.f16737 = c6143.f16850;
        List list = c6143.f16849;
        this.f16739 = list;
        this.f16740 = c6143.f16841;
        this.f16732 = c6143.f16840;
        this.f16736 = c6143.f16842;
        this.f16733 = c6143.f16843;
        this.f16734 = c6143.f16833;
        this.f16724 = c6143.f16832;
        this.f16723 = c6143.f16831;
        this.f16722 = c6143.f16830;
        C5856 c5856 = c6143.f16829;
        this.f16721 = c5856 == null ? new C5856(2) : c5856;
        C6234 c6234 = c6143.f16828;
        this.f16720 = c6234 == null ? C6234.f17175 : c6234;
        C5856 c58562 = c6143.f16838;
        if (c58562 == null) {
            c58562 = new C5856(1);
            c6143.f16838 = c58562;
        }
        this.f16719 = c58562;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C6152) it.next()).f16901) {
                    SSLSocketFactory sSLSocketFactory = c6143.f16851;
                    if (sSLSocketFactory == null) {
                        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
                        AbstractC6238.f17198.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f16742 = x509TrustManager;
                                AbstractC6238 abstractC62382 = AbstractC6238.f17198;
                                abstractC62382.getClass();
                                try {
                                    SSLContext sSLContextMo11723 = abstractC62382.mo11723();
                                    sSLContextMo11723.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextMo11723.getSocketFactory();
                                    socketFactory.getClass();
                                    this.f16741 = socketFactory;
                                    AbstractC6561 abstractC6561Mo11720 = AbstractC6238.f17198.mo11720(x509TrustManager);
                                    this.f16735 = abstractC6561Mo11720;
                                    C6135 c6135 = c6143.f16844;
                                    c6135.getClass();
                                    this.f16731 = AbstractC4395.m8907(c6135.f16791, abstractC6561Mo11720) ? c6135 : new C6135(c6135.f16792, abstractC6561Mo11720);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        C5925.m11312("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.f16741 = sSLSocketFactory;
                    AbstractC6561 abstractC6561 = c6143.f16845;
                    abstractC6561.getClass();
                    this.f16735 = abstractC6561;
                    X509TrustManager x509TrustManager2 = c6143.f16848;
                    x509TrustManager2.getClass();
                    this.f16742 = x509TrustManager2;
                    C6135 c61352 = c6143.f16844;
                    c61352.getClass();
                    this.f16731 = AbstractC4395.m8907(c61352.f16791, abstractC6561) ? c61352 : new C6135(c61352.f16792, abstractC6561);
                }
            }
            this.f16741 = null;
            this.f16735 = null;
            this.f16742 = null;
            this.f16731 = C6135.f16790;
        } else {
            this.f16741 = null;
            this.f16735 = null;
            this.f16742 = null;
            this.f16731 = C6135.f16790;
        }
        X509TrustManager x509TrustManager3 = this.f16742;
        AbstractC6561 abstractC65612 = this.f16735;
        SSLSocketFactory sSLSocketFactory2 = this.f16741;
        List list2 = this.f16728;
        List list3 = this.f16729;
        list3.getClass();
        if (list3.contains(null)) {
            C4211.m8615(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            C4211.m8615(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.f16739;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C6152) it2.next()).f16901) {
                    if (sSLSocketFactory2 == null) {
                        C5925.m11311("sslSocketFactory == null");
                        throw null;
                    }
                    if (abstractC65612 == null) {
                        C5925.m11311("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    C5925.m11311("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            C5925.m11311("Check failed.");
            throw null;
        }
        if (abstractC65612 != null) {
            C5925.m11311("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            C5925.m11311("Check failed.");
            throw null;
        }
        if (AbstractC4395.m8907(this.f16731, C6135.f16790)) {
            return;
        }
        C5925.m11311("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6143 m11517() {
        C6143 c6143 = new C6143();
        c6143.f16839 = this.f16730;
        c6143.f16838 = this.f16719;
        AbstractC4344.m8804(this.f16729, c6143.f16837);
        AbstractC4344.m8804(this.f16728, c6143.f16836);
        c6143.f16835 = this.f16727;
        c6143.f16834 = this.f16726;
        c6143.f16853 = this.f16725;
        c6143.f16852 = this.f16744;
        c6143.f16856 = this.f16743;
        c6143.f16857 = this.f16747;
        c6143.f16854 = this.f16748;
        c6143.f16855 = this.f16745;
        c6143.f16847 = this.f16746;
        c6143.f16846 = this.f16738;
        c6143.f16850 = this.f16737;
        c6143.f16851 = this.f16741;
        c6143.f16848 = this.f16742;
        c6143.f16849 = this.f16739;
        c6143.f16841 = this.f16740;
        c6143.f16840 = this.f16732;
        c6143.f16844 = this.f16731;
        c6143.f16845 = this.f16735;
        c6143.f16842 = this.f16736;
        c6143.f16843 = this.f16733;
        c6143.f16833 = this.f16734;
        c6143.f16832 = this.f16724;
        c6143.f16831 = this.f16723;
        c6143.f16830 = this.f16722;
        c6143.f16829 = this.f16721;
        c6143.f16828 = this.f16720;
        return c6143;
    }

    public C6127() {
        this(new C6143());
    }
}
