package p019;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC4346;
import p000.AbstractC6080;
import p000.C6078;
import p000.C6081;
import p000.C6084;
import p000.C6085;
import p000.C6086;
import p000.C6088;
import p000.InterfaceC6083;
import p003.C6096;
import p003.C6097;
import p003.InterfaceC6094;
import p015.C6200;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6243 extends AbstractC6241 implements InterfaceC6242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f17195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f17196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Context f17197;

    static {
        f17195 = Build.VERSION.SDK_INT < 29;
    }

    public C6243() {
        C6085 c6085;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c6085 = new C6085(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC6080.f16632;
            AbstractC6080.m11385(5, C6200.class.getName(), "unable to load android socket classes", e);
            c6085 = null;
        }
        ArrayList arrayListM8864 = AbstractC4346.m8864(new InterfaceC6083[]{c6085, new C6084(C6078.f16625), new C6084(C6088.f16643), new C6084(C6086.f16638)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8864) {
            if (((InterfaceC6083) obj).mo11383()) {
                arrayList.add(obj);
            }
        }
        this.f17196 = arrayList;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11715(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f17196.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC6083) next).mo11382(sSLSocket)) {
                break;
            }
        }
        InterfaceC6083 interfaceC6083 = (InterfaceC6083) next;
        if (interfaceC6083 != null) {
            return interfaceC6083.mo11381(sSLSocket);
        }
        return null;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11716(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11717(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f17196.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC6083) next).mo11382(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC6083 interfaceC6083 = (InterfaceC6083) next;
        if (interfaceC6083 != null) {
            interfaceC6083.mo11380(sSLSocket, str, list);
        }
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC3056 mo11718(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        InterfaceC6094 c6096;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C6081 c6081 = x509TrustManagerExtensions != null ? new C6081(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c6081 != null) {
            return c6081;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            c6096 = new C6244(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            c6096 = new C6096((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new C6097(c6096);
    }

    @Override // p019.InterfaceC6242
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Context mo11724() {
        return this.f17197;
    }

    @Override // p019.InterfaceC6242
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11725(Context context) {
        this.f17197 = context;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo11719(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final SSLContext mo11721() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11722(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }
}
