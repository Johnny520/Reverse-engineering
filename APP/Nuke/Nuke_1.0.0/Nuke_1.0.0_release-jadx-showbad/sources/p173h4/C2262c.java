package p173h4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p118X3.C1715y;
import p179i4.AbstractC2348c;
import p179i4.C2347b;
import p179i4.C2350e;
import p179i4.C2353h;
import p179i4.C2356k;
import p179i4.C2358m;
import p179i4.C2360o;
import p179i4.InterfaceC2359n;
import p196l4.C2512a;
import p196l4.InterfaceC2515d;

/* JADX INFO: renamed from: h4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2262c extends AbstractC2263d {

    /* JADX INFO: renamed from: d */
    public static final boolean f7402d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f7403c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f7402d = Build.VERSION.SDK_INT < 29;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2262c() {
        C2360o c2360o;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c2360o = new C2360o(cls);
        } catch (Exception e5) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC2348c.f7643a;
            AbstractC2348c.m4176a(C1715y.class.getName(), 5, "unable to load android socket classes", e5);
            c2360o = null;
        }
        InterfaceC2359n[] interfaceC2359nArr = {c2360o, new C2358m(C2350e.f7646e), new C2358m(C2356k.f7654a), new C2358m(C2353h.f7652a)};
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 4; i5++) {
            InterfaceC2359n interfaceC2359n = interfaceC2359nArr[i5];
            if (interfaceC2359n != null) {
                arrayList.add(interfaceC2359n);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC2359n) obj).mo4174c()) {
                arrayList2.add(obj);
            }
        }
        this.f7403c = arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: a */
    public final AbstractC0797o mo4110a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C2347b c2347b = x509TrustManagerExtensions != null ? new C2347b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c2347b != null ? c2347b : new C2512a(mo4111b(x509TrustManager));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: b */
    public final InterfaceC2515d mo4111b(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C2261b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo4111b(x509TrustManager);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: c */
    public final void mo4112c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1665j.m2985e(list, "protocols");
        Iterator it = this.f7403c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC2359n) next).mo4172a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC2359n interfaceC2359n = (InterfaceC2359n) next;
        if (interfaceC2359n != null) {
            interfaceC2359n.mo4175d(sSLSocket, str, list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: d */
    public final void mo4120d(Socket socket, InetSocketAddress inetSocketAddress, int i5) throws IOException {
        AbstractC1665j.m2985e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: e */
    public final String mo4113e(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7403c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2359n) next).mo4172a(sSLSocket)) {
                break;
            }
        }
        InterfaceC2359n interfaceC2359n = (InterfaceC2359n) next;
        if (interfaceC2359n != null) {
            return interfaceC2359n.mo4173b(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: g */
    public final boolean mo4115g(String str) {
        AbstractC1665j.m2985e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: h */
    public final void mo4116h(String str, int i5, Throwable th) {
        AbstractC1665j.m2985e(str, "message");
        if (i5 == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: j */
    public final SSLContext mo4118j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo4118j();
    }
}
