package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: cz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0111cz implements zs2 {

    /* JADX INFO: renamed from: a */
    public static final C0036az f1786a = new C0036az();

    /* JADX INFO: renamed from: b */
    public static final boolean f1787b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0072bz.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0072bz.m607a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1787b = z;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: a */
    public final String mo920a(SSLSocket sSLSocket) {
        if (mo921b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: b */
    public final boolean mo921b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: c */
    public final boolean mo922c() {
        return f1787b;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: d */
    public final void mo923d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo921b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            zz1 zz1Var = zz1.f14161a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j51.m2439u(list).toArray(new String[0]));
        }
    }
}
