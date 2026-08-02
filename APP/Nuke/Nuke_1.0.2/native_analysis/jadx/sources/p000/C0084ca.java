package p000;

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

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0084ca extends zz1 {

    /* JADX INFO: renamed from: d */
    public static final boolean f1255d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1256c;

    static {
        f1255d = Build.VERSION.SDK_INT < 29;
    }

    public C0084ca() {
        au2 au2Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            au2Var = new au2(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0453m9.f6518a;
            AbstractC0453m9.m3045a(5, et1.class.getName(), "unable to load android socket classes", e);
            au2Var = null;
        }
        ArrayList arrayListM1436Q = AbstractC0179eu.m1436Q(au2Var, new q60(C0197fb.f2887e), new q60(C0111cz.f1786a), new q60(C0777ul.f11342a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM1436Q) {
            if (((zs2) obj).mo922c()) {
                arrayList.add(obj);
            }
        }
        this.f1256c = arrayList;
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: a */
    public final up0 mo710a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        l43 c0464mk;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0266h6 c0266h6 = x509TrustManagerExtensions != null ? new C0266h6(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c0266h6 != null) {
            return c0266h6;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            c0464mk = new C0048ba(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            c0464mk = new C0464mk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new C0094ck(c0464mk);
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: b */
    public final void mo711b(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f1256c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((zs2) next).mo921b(sSLSocket)) {
                    break;
                }
            }
        }
        zs2 zs2Var = (zs2) next;
        if (zs2Var != null) {
            zs2Var.mo923d(sSLSocket, str, list);
        }
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: c */
    public final void mo712c(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: d */
    public final String mo713d(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1256c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((zs2) next).mo921b(sSLSocket)) {
                break;
            }
        }
        zs2 zs2Var = (zs2) next;
        if (zs2Var != null) {
            return zs2Var.mo920a(sSLSocket);
        }
        return null;
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: f */
    public final boolean mo714f(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: g */
    public final void mo715g(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: i */
    public final SSLContext mo716i() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
