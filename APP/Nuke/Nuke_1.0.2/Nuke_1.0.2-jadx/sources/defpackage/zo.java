package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo {
    public static final zo b = new zo(0);
    public static final zo c = new zo(1);
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [s52.j():r92, zo.<clinit>():void] */
    public /* synthetic */ zo(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k82 a(r92 r92Var, f90 f90Var, v52 v52Var) throws ProtocolException {
        xw0 xw0Var;
        o82 o82Var;
        r92 r92Var2;
        hb2 hb2Var = f90Var != null ? f90Var.c().c : null;
        int i = r92Var.k;
        k82 k82Var = r92Var.h;
        String str = k82Var.b;
        if (i == 307 || i == 308) {
            if (v52Var.a.h.h) {
                String strA = r92Var.m.a("Location");
                if (strA == null) {
                    strA = null;
                }
                k82 k82Var2 = r92Var.h;
                if (strA != null) {
                    yw0 yw0Var = k82Var2.a;
                    yw0Var.getClass();
                    try {
                        xw0Var = new xw0();
                        xw0Var.e(yw0Var, strA);
                    } catch (IllegalArgumentException unused) {
                        xw0Var = null;
                    }
                    yw0 yw0VarB = xw0Var != null ? xw0Var.b() : null;
                    if (yw0VarB != null && (t11.l(yw0VarB.a, k82Var2.a.a) || v52Var.a.h.i)) {
                        cj cjVarA = k82Var2.a();
                        if (fg1.I(str)) {
                            int i2 = r92Var.k;
                            boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                cjVarA.n(str, z ? k82Var2.d : null);
                            } else {
                                cjVarA.n("GET", null);
                            }
                            if (!z) {
                                ((ye0) cjVarA.c).n("Transfer-Encoding");
                                ((ye0) cjVarA.c).n("Content-Length");
                                ((ye0) cjVarA.c).n("Content-Type");
                            }
                        }
                        if (!wg3.a(k82Var2.a, yw0VarB)) {
                            ((ye0) cjVarA.c).n("Authorization");
                        }
                        cjVarA.a = yw0VarB;
                        return new k82(cjVarA);
                    }
                }
            }
        } else {
            if (i == 401) {
                v52Var.i.getClass();
                return null;
            }
            if (i == 421) {
                o82 o82Var2 = k82Var.d;
                if ((o82Var2 == null || !o82Var2.c()) && f90Var != null && !t11.l(((yg0) f90Var.c).i().i.i.d, ((xg0) f90Var.d).g().f().a.i.d)) {
                    t52 t52VarC = f90Var.c();
                    synchronized (t52VarC) {
                        t52VarC.k = true;
                    }
                    return r92Var.h;
                }
            } else if (i == 503) {
                r92 r92Var3 = r92Var.r;
                if ((r92Var3 == null || r92Var3.k != 503) && c(r92Var, Integer.MAX_VALUE) == 0) {
                    return r92Var.h;
                }
            } else {
                if (i == 407) {
                    hb2Var.getClass();
                    if (hb2Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    v52Var.p.getClass();
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
                } else if (v52Var.r && (((o82Var = k82Var.d) == null || !o82Var.c()) && (((r92Var2 = r92Var.r) == null || r92Var2.k != 408) && c(r92Var, 0) <= 0))) {
                    return r92Var.h;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(IOException iOException, s52 s52Var, v52 v52Var, k82 k82Var) {
        o82 o82Var;
        boolean z = iOException instanceof sy;
        if (!v52Var.r) {
            return false;
        }
        if ((!z && (((o82Var = k82Var.d) != null && o82Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        f90 f90Var = s52Var.y;
        if (f90Var == null || !f90Var.a) {
            return false;
        }
        yg0 yg0Var = s52Var.o;
        yg0Var.getClass();
        x52 x52VarI = yg0Var.i();
        f90 f90Var2 = s52Var.y;
        return x52VarI.a(f90Var2 != null ? f90Var2.c() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(r92 r92Var, int i) {
        String strA = r92Var.m.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }
}
