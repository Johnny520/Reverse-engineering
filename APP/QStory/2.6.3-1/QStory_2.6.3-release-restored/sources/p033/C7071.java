package p033;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import androidx.core.view.AbstractC3059;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC5179;
import p018.C6916;
import p018.C6917;
import p034.C7073;
import p034.C7076;
import p034.C7077;
import p034.C7079;
import p034.C7081;
import p034.C7083;
import p034.InterfaceC7078;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7071 extends AbstractC7067 implements InterfaceC7068 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f17549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f17550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Context f17551;

    static {
        f17549 = Build.VERSION.SDK_INT >= 29;
    }

    public C7071() {
        ArrayList arrayListM9385 = AbstractC5179.m9385(new InterfaceC7078[]{Build.VERSION.SDK_INT >= 29 ? new C7077() : null, new C7079(C7073.f17552), new C7079(C7083.f17567), new C7079(C7081.f17565)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM9385) {
            if (((InterfaceC7078) obj).mo12290()) {
                arrayList.add(obj);
            }
        }
        this.f17550 = arrayList;
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12276(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f17550.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7078) next).mo12289(sSLSocket)) {
                break;
            }
        }
        InterfaceC7078 interfaceC7078 = (InterfaceC7078) next;
        if (interfaceC7078 != null) {
            return interfaceC7078.mo12288(sSLSocket);
        }
        return null;
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12278(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f17550.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC7078) next).mo12289(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC7078 interfaceC7078 = (InterfaceC7078) next;
        if (interfaceC7078 != null) {
            interfaceC7078.mo12287(sSLSocket, str, list);
        }
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7390 mo12279(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C7076 c7076 = x509TrustManagerExtensions != null ? new C7076(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c7076 != null) {
            return c7076;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C6917(new C6916((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // p033.InterfaceC7068
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Context mo12285() {
        return this.f17551;
    }

    @Override // p033.InterfaceC7068
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12286(Context context) {
        this.f17551 = context;
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo12280(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12281() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo12281();
        }
        CloseGuard closeGuardM4637 = AbstractC3059.m4637();
        closeGuardM4637.open("response.body().close()");
        return closeGuardM4637;
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final SSLContext mo12282() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12283(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = C7069.f17544;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = C7069.f17544;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // p033.AbstractC7067
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo12284(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.mo12284(obj, str);
        } else {
            obj.getClass();
            AbstractC3059.m4636(obj).warnIfOpen();
        }
    }
}
