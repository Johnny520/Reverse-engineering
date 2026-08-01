package p019;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import androidx.core.view.AbstractC2226;
import com.bumptech.glide.AbstractC3056;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC4346;
import p000.C6078;
import p000.C6081;
import p000.C6082;
import p000.C6084;
import p000.C6086;
import p000.C6088;
import p000.InterfaceC6083;
import p003.C6096;
import p003.C6097;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6245 extends AbstractC6241 implements InterfaceC6242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f17200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f17201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Context f17202;

    static {
        f17200 = Build.VERSION.SDK_INT >= 29;
    }

    public C6245() {
        ArrayList arrayListM8864 = AbstractC4346.m8864(new InterfaceC6083[]{Build.VERSION.SDK_INT >= 29 ? new C6082() : null, new C6084(C6078.f16625), new C6084(C6088.f16643), new C6084(C6086.f16638)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8864) {
            if (((InterfaceC6083) obj).mo11383()) {
                arrayList.add(obj);
            }
        }
        this.f17201 = arrayList;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11715(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f17201.iterator();
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11717(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f17201.iterator();
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
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C6081 c6081 = x509TrustManagerExtensions != null ? new C6081(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c6081 != null) {
            return c6081;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C6097(new C6096((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // p019.InterfaceC6242
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Context mo11724() {
        return this.f17202;
    }

    @Override // p019.InterfaceC6242
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11725(Context context) {
        this.f17202 = context;
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo11719(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo11720() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo11720();
        }
        CloseGuard closeGuardM4067 = AbstractC2226.m4067();
        closeGuardM4067.open("response.body().close()");
        return closeGuardM4067;
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
            boolean z = C6243.f17195;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = C6243.f17195;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // p019.AbstractC6241
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11723(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.mo11723(obj, str);
        } else {
            obj.getClass();
            AbstractC2226.m4066(obj).warnIfOpen();
        }
    }
}
