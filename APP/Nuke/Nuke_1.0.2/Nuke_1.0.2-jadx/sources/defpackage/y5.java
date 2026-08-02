package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 extends zz1 {
    public static final boolean d;
    public final ArrayList c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y5() {
        ArrayList arrayListQ = eu.Q(Build.VERSION.SDK_INT >= 29 ? new z5() : null, new q60(fb.e), new q60(cz.a), new q60(ul.a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ) {
            if (((zs2) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final up0 a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        h6 h6Var = x509TrustManagerExtensions != null ? new h6(x509TrustManager, x509TrustManagerExtensions) : null;
        if (h6Var != null) {
            return h6Var;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ck(new mk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final void b(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((zs2) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        zs2 zs2Var = (zs2) next;
        if (zs2Var != null) {
            zs2Var.d(sSLSocket, str, list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final String d(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((zs2) next).b(sSLSocket)) {
                break;
            }
        }
        zs2 zs2Var = (zs2) next;
        if (zs2Var != null) {
            return zs2Var.a(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final Object e() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.e();
        }
        CloseGuard closeGuardG = e4.g();
        closeGuardG.open("response.body().close()");
        return closeGuardG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final boolean f(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final void g(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = ca.d;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = ca.d;
            Log.i("OkHttp", str, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final void h(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.h(str, obj);
        } else {
            obj.getClass();
            e4.h(obj).warnIfOpen();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zz1
    public final SSLContext i() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
