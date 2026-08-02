package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0911y5 extends zz1 {

    /* JADX INFO: renamed from: d */
    public static final boolean f13305d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f13306c;

    static {
        f13305d = Build.VERSION.SDK_INT >= 29;
    }

    public C0911y5() {
        ArrayList arrayListM1436Q = AbstractC0179eu.m1436Q(Build.VERSION.SDK_INT >= 29 ? new C0950z5() : null, new q60(C0197fb.f2887e), new q60(C0111cz.f1786a), new q60(C0777ul.f11342a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM1436Q) {
            if (((zs2) obj).mo922c()) {
                arrayList.add(obj);
            }
        }
        this.f13306c = arrayList;
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: a */
    public final up0 mo710a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0266h6 c0266h6 = x509TrustManagerExtensions != null ? new C0266h6(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c0266h6 != null) {
            return c0266h6;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C0094ck(new C0464mk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: b */
    public final void mo711b(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f13306c.iterator();
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
    /* JADX INFO: renamed from: d */
    public final String mo713d(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f13306c.iterator();
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
    /* JADX INFO: renamed from: e */
    public final Object mo6222e() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo6222e();
        }
        CloseGuard closeGuardM1228g = AbstractC0153e4.m1228g();
        closeGuardM1228g.open("response.body().close()");
        return closeGuardM1228g;
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
            boolean z = C0084ca.f1255d;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = C0084ca.f1255d;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // p000.zz1
    /* JADX INFO: renamed from: h */
    public final void mo6223h(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.mo6223h(str, obj);
        } else {
            obj.getClass();
            AbstractC0153e4.m1229h(obj).warnIfOpen();
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
