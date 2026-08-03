package Yue;

import Yue.C5375;
import Yue.C7101;
import Yue.InterfaceC5491;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: Yue.ۥۡۦۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7158 implements InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1193 f21575 = new C1193(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f21576 = 20;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C6504 f2709;

    /* JADX INFO: renamed from: Yue.ۥۡۦۨۢ$ۥ */
    public static final class C1193 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۨۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1193(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1193() {
        }
    }

    public C7158(@InterfaceC6399 C6504 c6504) {
        C5499.m17103(c6504, "client");
        this.f2709 = c6504;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.m21828();
        r6 = m22423(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m14281() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.m21839();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.m21822(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.m22149();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.m22207() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.m21822(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.m22311();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        Yue.C8158.m26844(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.m22326().m22358(r7.m22326().m3432(null).m22334()).m22334();
     */
    @Override // Yue.InterfaceC5491
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) throws IOException {
        C7101 c7101M22423;
        C5499.m17103(interfaceC0776, "chain");
        C7031 c7031 = (C7031) interfaceC0776;
        C7101 c7101M21890 = c7031.m21890();
        C7024 c7024M21886 = c7031.m21886();
        List listM10735 = C3880.m10735();
        int i = 0;
        C7141 c7141 = null;
        while (true) {
            boolean z = true;
            while (true) {
                c7024M21886.m21821(c7101M21890, z);
                try {
                    if (c7024M21886.mo9975()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        C7141 c7141Mo17083 = c7031.mo17083(c7101M21890);
                        break;
                    } catch (C7186 e) {
                        if (!m22425(e.m22509(), c7024M21886, c7101M21890, false)) {
                            throw C8158.m26896(e.m3473(), listM10735);
                        }
                        listM10735 = C3888.m10994(listM10735, e.m3473());
                        c7024M21886.m21822(true);
                        z = false;
                    } catch (IOException e2) {
                        if (!m22425(e2, c7024M21886, c7101M21890, !(e2 instanceof C4109))) {
                            throw C8158.m26896(e2, listM10735);
                        }
                        listM10735 = C3888.m10994(listM10735, e2);
                        c7024M21886.m21822(true);
                        z = false;
                    }
                    c7024M21886.m21822(true);
                    z = false;
                } catch (Throwable th) {
                    c7024M21886.m21822(true);
                    throw th;
                }
            }
            c7024M21886.m21822(true);
            c7101M21890 = c7101M22423;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final C7101 m3449(C7141 c7141, String str) {
        String strM22298;
        C5385 c5385M16788;
        if (!this.f2709.m20643() || (strM22298 = C7141.m22298(c7141, C5375.C5378.f13209, null, 2, null)) == null || (c5385M16788 = c7141.m22331().m22160().m16788(strM22298)) == null) {
            return null;
        }
        if (!C5499.m17094(c5385M16788.m16789(), c7141.m22331().m22160().m16789()) && !this.f2709.m20644()) {
            return null;
        }
        C7101.C1165 c1165M22157 = c7141.m22331().m22157();
        if (C5383.m2138(str)) {
            int iM22315 = c7141.m22315();
            C5383 c5383 = C5383.f1469;
            boolean z = c5383.m16741(str) || iM22315 == 308 || iM22315 == 307;
            if (!c5383.m16740(str) || iM22315 == 308 || iM22315 == 307) {
                c1165M22157.m22174(str, z ? c7141.m22331().m22149() : null);
            } else {
                c1165M22157.m22174("GET", null);
            }
            if (!z) {
                c1165M22157.m22178("Transfer-Encoding");
                c1165M22157.m22178("Content-Length");
                c1165M22157.m22178(C5375.f13182);
            }
        }
        if (!C8158.m26841(c7141.m22331().m22160(), c5385M16788)) {
            c1165M22157.m22178("Authorization");
        }
        return c1165M22157.m22186(c5385M16788).m3393();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7101 m22423(C7141 c7141, C4742 c4742) throws IOException {
        C7026 c7026M14276;
        C7184 c7184Mo1066 = (c4742 == null || (c7026M14276 = c4742.m14276()) == null) ? null : c7026M14276.mo1066();
        int iM22315 = c7141.m22315();
        String strM22156 = c7141.m22331().m22156();
        if (iM22315 != 307 && iM22315 != 308) {
            if (iM22315 == 401) {
                return this.f2709.m20631().mo542(c7184Mo1066, c7141);
            }
            if (iM22315 == 421) {
                AbstractC7103 abstractC7103M22149 = c7141.m22331().m22149();
                if ((abstractC7103M22149 != null && abstractC7103M22149.m22207()) || c4742 == null || !c4742.m14280()) {
                    return null;
                }
                c4742.m14276().m21869();
                return c7141.m22331();
            }
            if (iM22315 == 503) {
                C7141 c7141M22328 = c7141.m22328();
                if ((c7141M22328 == null || c7141M22328.m22315() != 503) && m22427(c7141, Integer.MAX_VALUE) == 0) {
                    return c7141.m22331();
                }
                return null;
            }
            if (iM22315 == 407) {
                C5499.m17100(c7184Mo1066);
                if (c7184Mo1066.m22505().type() == Proxy.Type.HTTP) {
                    return this.f2709.m20654().mo542(c7184Mo1066, c7141);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM22315 == 408) {
                if (!this.f2709.m20657()) {
                    return null;
                }
                AbstractC7103 abstractC7103M221492 = c7141.m22331().m22149();
                if (abstractC7103M221492 != null && abstractC7103M221492.m22207()) {
                    return null;
                }
                C7141 c7141M223282 = c7141.m22328();
                if ((c7141M223282 == null || c7141M223282.m22315() != 408) && m22427(c7141, 0) <= 0) {
                    return c7141.m22331();
                }
                return null;
            }
            switch (iM22315) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m3449(c7141, strM22156);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m22424(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m22425(IOException iOException, C7024 c7024, C7101 c7101, boolean z) {
        if (this.f2709.m20657()) {
            return !(z && m22426(iOException, c7101)) && m22424(iOException, z) && c7024.m21836();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m22426(IOException iOException, C7101 c7101) {
        AbstractC7103 abstractC7103M22149 = c7101.m22149();
        return (abstractC7103M22149 != null && abstractC7103M22149.m22207()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m22427(C7141 c7141, int i) {
        String strM22298 = C7141.m22298(c7141, "Retry-After", null, 2, null);
        if (strM22298 == null) {
            return i;
        }
        if (!new C7075("\\d+").m22055(strM22298)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM22298);
        C5499.m17102(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }
}
