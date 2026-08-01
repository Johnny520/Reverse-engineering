package p179i4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: i4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2358m implements InterfaceC2359n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2357l f7656a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2359n f7657b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2358m(InterfaceC2357l interfaceC2357l) {
        this.f7656a = interfaceC2357l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: a */
    public final boolean mo4172a(SSLSocket sSLSocket) {
        return this.f7656a.mo2848a(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: b */
    public final String mo4173b(SSLSocket sSLSocket) {
        InterfaceC2359n interfaceC2359nM4215e = m4215e(sSLSocket);
        if (interfaceC2359nM4215e != null) {
            return interfaceC2359nM4215e.mo4173b(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: c */
    public final boolean mo4174c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: d */
    public final void mo4175d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1665j.m2985e(list, "protocols");
        InterfaceC2359n interfaceC2359nM4215e = m4215e(sSLSocket);
        if (interfaceC2359nM4215e != null) {
            interfaceC2359nM4215e.mo4175d(sSLSocket, str, list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized InterfaceC2359n m4215e(SSLSocket sSLSocket) {
        try {
            if (this.f7657b == null && this.f7656a.mo2848a(sSLSocket)) {
                this.f7657b = this.f7656a.mo2849e(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7657b;
    }
}
