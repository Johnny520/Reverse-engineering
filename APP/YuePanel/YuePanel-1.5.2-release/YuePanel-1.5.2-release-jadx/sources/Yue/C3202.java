package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7687
@InterfaceC7507({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
public final class C3202 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0078 f4857 = new C0078(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f4858;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<InterfaceC7490> f4859;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۢ$ۥ */
    public static final class C0078 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۠ۤۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0078(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C6668 m275() {
            if (m276()) {
                return new C3202();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m276() {
            return C3202.f4858;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0078() {
        }
    }

    static {
        f4858 = C6668.f2226.m21322() && Build.VERSION.SDK_INT >= 29;
    }

    public C3202() {
        List listM10744 = C3880.m10744(C3205.f129.m281(), new C4362(C3214.f4944.m6583()), new C4362(C4114.f681.m1082()), new C4362(C3589.f400.m635()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM10744) {
            if (((InterfaceC7490) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f4859 = arrayList;
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC3685 mo6560(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        C3206 c3206M284 = C3206.f4860.m284(x509TrustManager);
        return c3206M284 != null ? c3206M284 : super.mo6560(x509TrustManager);
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list) {
        Object next;
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        Iterator<T> it = this.f4859.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC7490) next).mo279(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            interfaceC7490.mo6567(sSLSocket, str, list);
        }
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        Object next;
        C5499.m17103(sSLSocket, "sslSocket");
        Iterator<T> it = this.f4859.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7490) next).mo279(sSLSocket)) {
                break;
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            return interfaceC7490.mo280(sSLSocket);
        }
        return null;
    }

    @Override // Yue.C6668
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo6563(@InterfaceC6399 String str) {
        C5499.m17103(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public X509TrustManager mo6564(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        Object next;
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f4859.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7490) next).mo6566(sSLSocketFactory)) {
                break;
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            return interfaceC7490.mo6565(sSLSocketFactory);
        }
        return null;
    }
}
