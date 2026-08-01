package p179i4;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: i4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2354i implements InterfaceC2357l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2357l
    /* JADX INFO: renamed from: a */
    public final boolean mo2848a(SSLSocket sSLSocket) {
        return C2356k.f7655b && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2357l
    /* JADX INFO: renamed from: e */
    public final InterfaceC2359n mo2849e(SSLSocket sSLSocket) {
        return new C2356k();
    }
}
