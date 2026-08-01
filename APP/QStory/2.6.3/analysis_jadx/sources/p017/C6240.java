package p017;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
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
import kotlin.collections.AbstractC4347;
import p002.C6087;
import p002.C6088;
import p002.InterfaceC6085;
import p007.C6127;
import p018.AbstractC6246;
import p018.C6244;
import p018.C6247;
import p018.C6250;
import p018.C6251;
import p018.C6252;
import p018.C6254;
import p018.InterfaceC6249;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6240 extends AbstractC6238 implements InterfaceC6239 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f17199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f17200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Context f17201;

    static {
        f17199 = Build.VERSION.SDK_INT < 29;
    }

    public C6240() {
        C6251 c6251;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c6251 = new C6251(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC6246.f17214;
            AbstractC6246.m11733(5, C6127.class.getName(), "unable to load android socket classes", e);
            c6251 = null;
        }
        ArrayList arrayListM8826 = AbstractC4347.m8826(new InterfaceC6249[]{c6251, new C6250(C6244.f17207), new C6250(C6254.f17222), new C6250(C6252.f17220)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8826) {
            if (((InterfaceC6249) obj).mo11731()) {
                arrayList.add(obj);
            }
        }
        this.f17200 = arrayList;
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11717(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f17200.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC6249) next).mo11730(sSLSocket)) {
                break;
            }
        }
        InterfaceC6249 interfaceC6249 = (InterfaceC6249) next;
        if (interfaceC6249 != null) {
            return interfaceC6249.mo11729(sSLSocket);
        }
        return null;
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11718(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11719(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f17200.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC6249) next).mo11730(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC6249 interfaceC6249 = (InterfaceC6249) next;
        if (interfaceC6249 != null) {
            interfaceC6249.mo11728(sSLSocket, str, list);
        }
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6561 mo11720(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        InterfaceC6085 c6087;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C6247 c6247 = x509TrustManagerExtensions != null ? new C6247(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c6247 != null) {
            return c6247;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            c6087 = new C6241(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            c6087 = new C6087((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new C6088(c6087);
    }

    @Override // p017.InterfaceC6239
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Context mo11726() {
        return this.f17201;
    }

    @Override // p017.InterfaceC6239
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11727(Context context) {
        this.f17201 = context;
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo11721(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final SSLContext mo11723() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // p017.AbstractC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11724(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }
}
