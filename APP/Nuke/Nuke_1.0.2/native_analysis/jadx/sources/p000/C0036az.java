package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: az */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036az implements p60 {
    @Override // p000.p60
    /* JADX INFO: renamed from: b */
    public final boolean mo312b(SSLSocket sSLSocket) {
        return C0111cz.f1787b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.p60
    /* JADX INFO: renamed from: c */
    public final zs2 mo313c(SSLSocket sSLSocket) {
        return new C0111cz();
    }
}
