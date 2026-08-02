package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: zo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969zo {

    /* JADX INFO: renamed from: b */
    public static final C0969zo f13990b = new C0969zo(0);

    /* JADX INFO: renamed from: c */
    public static final C0969zo f13991c = new C0969zo(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13992a;

    public /* synthetic */ C0969zo(int i) {
        this.f13992a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k82 m6476a(r92 r92Var, f90 f90Var, v52 v52Var) throws ProtocolException {
        xw0 xw0Var;
        o82 o82Var;
        r92 r92Var2;
        hb2 hb2Var = f90Var != null ? f90Var.m1589c().f10563c : null;
        int i = r92Var.f9459k;
        k82 k82Var = r92Var.f9456h;
        String str = k82Var.f5391b;
        if (i == 307 || i == 308) {
            if (v52Var.f11697a.f9913h.f2607h) {
                String strM2557a = r92Var.f9461m.m2557a("Location");
                if (strM2557a == null) {
                    strM2557a = null;
                }
                k82 k82Var2 = r92Var.f9456h;
                if (strM2557a != null) {
                    yw0 yw0Var = k82Var2.f5390a;
                    yw0Var.getClass();
                    try {
                        xw0Var = new xw0();
                        xw0Var.m6196e(yw0Var, strM2557a);
                    } catch (IllegalArgumentException unused) {
                        xw0Var = null;
                    }
                    yw0 yw0VarM6193b = xw0Var != null ? xw0Var.m6193b() : null;
                    if (yw0VarM6193b != null && (t11.m5086l(yw0VarM6193b.f13641a, k82Var2.f5390a.f13641a) || v52Var.f11697a.f9913h.f2608i)) {
                        C0093cj c0093cjM2615a = k82Var2.m2615a();
                        if (fg1.m1617I(str)) {
                            int i2 = r92Var.f9459k;
                            boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                c0093cjM2615a.m839n(str, z ? k82Var2.f5393d : null);
                            } else {
                                c0093cjM2615a.m839n("GET", null);
                            }
                            if (!z) {
                                ((ye0) c0093cjM2615a.f1581c).m6262n("Transfer-Encoding");
                                ((ye0) c0093cjM2615a.f1581c).m6262n("Content-Length");
                                ((ye0) c0093cjM2615a.f1581c).m6262n("Content-Type");
                            }
                        }
                        if (!wg3.m5888a(k82Var2.f5390a, yw0VarM6193b)) {
                            ((ye0) c0093cjM2615a.f1581c).m6262n("Authorization");
                        }
                        c0093cjM2615a.f1579a = yw0VarM6193b;
                        return new k82(c0093cjM2615a);
                    }
                }
            }
        } else {
            if (i == 401) {
                v52Var.f11705i.getClass();
                return null;
            }
            if (i == 421) {
                o82 o82Var2 = k82Var.f5393d;
                if ((o82Var2 == null || !o82Var2.mo3540c()) && f90Var != null && !t11.m5086l(((yg0) f90Var.f2864c).mo2187i().f12827i.f8739i.f13644d, ((xg0) f90Var.f2865d).mo2402g().mo4627f().f3944a.f8739i.f13644d)) {
                    t52 t52VarM1589c = f90Var.m1589c();
                    synchronized (t52VarM1589c) {
                        t52VarM1589c.f10571k = true;
                    }
                    return r92Var.f9456h;
                }
            } else if (i == 503) {
                r92 r92Var3 = r92Var.f9466r;
                if ((r92Var3 == null || r92Var3.f9459k != 503) && m6478c(r92Var, Integer.MAX_VALUE) == 0) {
                    return r92Var.f9456h;
                }
            } else {
                if (i == 407) {
                    hb2Var.getClass();
                    if (hb2Var.f3945b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    v52Var.f11712p.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        default:
                            return null;
                    }
                } else if (v52Var.f11714r && (((o82Var = k82Var.f5393d) == null || !o82Var.mo3540c()) && (((r92Var2 = r92Var.f9466r) == null || r92Var2.f9459k != 408) && m6478c(r92Var, 0) <= 0))) {
                    return r92Var.f9456h;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6477b(IOException iOException, s52 s52Var, v52 v52Var, k82 k82Var) {
        o82 o82Var;
        boolean z = iOException instanceof C0712sy;
        if (!v52Var.f11714r) {
            return false;
        }
        if ((!z && (((o82Var = k82Var.f5393d) != null && o82Var.mo3540c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        f90 f90Var = s52Var.f9930y;
        if (f90Var == null || !f90Var.f2862a) {
            return false;
        }
        yg0 yg0Var = s52Var.f9920o;
        yg0Var.getClass();
        x52 x52VarMo2187i = yg0Var.mo2187i();
        f90 f90Var2 = s52Var.f9930y;
        return x52VarMo2187i.m6036a(f90Var2 != null ? f90Var2.m1589c() : null);
    }

    /* JADX INFO: renamed from: c */
    public static int m6478c(r92 r92Var, int i) {
        String strM2557a = r92Var.f9461m.m2557a("Retry-After");
        if (strM2557a == null) {
            strM2557a = null;
        }
        if (strM2557a == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strM2557a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM2557a);
        numValueOf.getClass();
        return numValueOf.intValue();
    }
}
