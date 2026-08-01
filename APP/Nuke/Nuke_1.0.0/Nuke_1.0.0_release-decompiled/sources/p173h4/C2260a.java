package p173h4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p010B3.AbstractC0228g;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p179i4.C2346a;
import p179i4.C2347b;
import p179i4.C2350e;
import p179i4.C2353h;
import p179i4.C2356k;
import p179i4.C2358m;
import p179i4.InterfaceC2359n;
import p196l4.C2512a;
import p196l4.InterfaceC2515d;

/* JADX INFO: renamed from: h4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2260a extends AbstractC2263d {

    /* JADX INFO: renamed from: d */
    public static final boolean f7398d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f7399c;

    static {
        f7398d = Build.VERSION.SDK_INT >= 29;
    }

    public C2260a() {
        InterfaceC2359n[] interfaceC2359nArr = {Build.VERSION.SDK_INT >= 29 ? new C2346a() : null, new C2358m(C2350e.f7646e), new C2358m(C2356k.f7654a), new C2358m(C2353h.f7652a)};
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
        this.f7399c = arrayList2;
    }

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

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: b */
    public final InterfaceC2515d mo4111b(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.mo4111b(x509TrustManager);
    }

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: c */
    public final void mo4112c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1665j.m2985e(list, "protocols");
        Iterator it = this.f7399c.iterator();
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

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: e */
    public final String mo4113e(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7399c.iterator();
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

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: f */
    public final Object mo4114f() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo4114f();
        }
        CloseGuard closeGuardM368f = AbstractC0228g.m368f();
        closeGuardM368f.open("response.body().close()");
        return closeGuardM368f;
    }

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: g */
    public final boolean mo4115g(String str) {
        AbstractC1665j.m2985e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: h */
    public final void mo4116h(String str, int i5, Throwable th) {
        AbstractC1665j.m2985e(str, "message");
        if (i5 == 5) {
            boolean z5 = C2262c.f7402d;
            Log.w("OkHttp", str, th);
        } else {
            boolean z6 = C2262c.f7402d;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: i */
    public final void mo4117i(Object obj, String str) {
        AbstractC1665j.m2985e(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.mo4117i(obj, str);
        } else {
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            AbstractC0228g.m369g(obj).warnIfOpen();
        }
    }

    @Override // p173h4.AbstractC2263d
    /* JADX INFO: renamed from: j */
    public final SSLContext mo4118j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo4118j();
    }
}
