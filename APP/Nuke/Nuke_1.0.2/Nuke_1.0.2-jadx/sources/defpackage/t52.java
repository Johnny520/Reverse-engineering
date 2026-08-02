package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t52 extends ov0 implements wg0 {
    public final iy2 b;
    public final hb2 c;
    public final Socket d;
    public final Socket e;
    public final yr0 f;
    public final c42 g;
    public final b5 h;
    public qv0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t52(iy2 iy2Var, ud0 ud0Var, hb2 hb2Var, Socket socket, Socket socket2, yr0 yr0Var, c42 c42Var, b5 b5Var) {
        iy2Var.getClass();
        ud0Var.getClass();
        hb2Var.getClass();
        socket.getClass();
        socket2.getClass();
        c42Var.getClass();
        b5Var.getClass();
        this.b = iy2Var;
        this.c = hb2Var;
        this.d = socket;
        this.e = socket2;
        this.f = yr0Var;
        this.g = c42Var;
        this.h = b5Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(et1 et1Var, hb2 hb2Var, IOException iOException) {
        et1Var.getClass();
        hb2Var.getClass();
        iOException.getClass();
        if (hb2Var.b.type() != Proxy.Type.DIRECT) {
            q5 q5Var = hb2Var.a;
            q5Var.h.connectFailed(q5Var.i.h(), hb2Var.b.address(), iOException);
        }
        hh1 hh1Var = et1Var.C;
        synchronized (hh1Var) {
            ((LinkedHashSet) hh1Var.i).add(hb2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ov0
    public final void a(qv0 qv0Var, xp2 xp2Var) {
        xp2Var.getClass();
        synchronized (this) {
            this.o = (xp2Var.a & 8) != 0 ? xp2Var.b[3] : Integer.MAX_VALUE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg0
    public final void b(s52 s52Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof av2)) {
                    if (!(this.i != null) || (iOException instanceof sy)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                d(s52Var.h, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((av2) iOException).h == cg0.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((av2) iOException).h != cg0.CANCEL || !s52Var.x) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ov0
    public final void c(xv0 xv0Var) {
        xv0Var.c(cg0.REFUSED_STREAM, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg0
    public final void cancel() {
        wg3.c(this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(q5 q5Var, List list) {
        yw0 yw0Var = q5Var.i;
        TimeZone timeZone = wg3.a;
        if (this.p.size() < this.o && !this.j) {
            hb2 hb2Var = this.c;
            q5 q5Var2 = hb2Var.a;
            q5 q5Var3 = hb2Var.a;
            if (q5Var2.a(q5Var)) {
                String str = yw0Var.d;
                String str2 = yw0Var.d;
                if (t11.l(str, q5Var3.i.d)) {
                    return true;
                }
                if (this.i != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hb2 hb2Var2 = (hb2) it.next();
                        Proxy.Type type = hb2Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && hb2Var.b.type() == type2 && t11.l(hb2Var.c, hb2Var2.c)) {
                            if (q5Var.d == ys1.a) {
                                TimeZone timeZone2 = wg3.a;
                                yw0 yw0Var2 = q5Var3.i;
                                if (yw0Var.e == yw0Var2.e) {
                                    boolean zL = t11.l(str2, yw0Var2.d);
                                    yr0 yr0Var = this.f;
                                    if (!zL) {
                                        if (!this.k && yr0Var != null) {
                                            List listA = yr0Var.a();
                                            if (!listA.isEmpty()) {
                                                Object obj = listA.get(0);
                                                obj.getClass();
                                                if (ys1.c(str2, (X509Certificate) obj)) {
                                                    try {
                                                        cq cqVar = q5Var.e;
                                                        cqVar.getClass();
                                                        yr0Var.getClass();
                                                        List listA2 = yr0Var.a();
                                                        str2.getClass();
                                                        listA2.getClass();
                                                        Iterator it2 = cqVar.a.iterator();
                                                        if (!it2.hasNext()) {
                                                            return true;
                                                        }
                                                        vi0.t(it2.next());
                                                        throw null;
                                                    } catch (SSLPeerUnverifiedException unused) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg0
    public final hb2 f() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = wg3.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        qv0 qv0Var = this.i;
        if (qv0Var != null) {
            synchronized (qv0Var) {
                if (qv0Var.m) {
                    return false;
                }
                if (qv0Var.u < qv0Var.t) {
                    if (jNanoTime >= qv0Var.v) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        o52 o52Var = (o52) this.h.j;
        socket.getClass();
        o52Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !o52Var.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg0
    public final void h() {
        synchronized (this) {
            this.j = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() throws SocketException {
        this.q = System.nanoTime();
        c42 c42Var = this.g;
        if (c42Var == c42.m || c42Var == c42.n) {
            this.e.setSoTimeout(0);
            gd3 gd3Var = gd3.o;
            bk0 bk0Var = bk0.a;
            iy2 iy2Var = this.b;
            iy2Var.getClass();
            cj cjVar = new cj();
            cjVar.a = iy2Var;
            cjVar.d = ov0.a;
            cjVar.e = bk0.a;
            b5 b5Var = this.h;
            String str = this.c.a.i.d;
            b5Var.getClass();
            str.getClass();
            cjVar.b = b5Var;
            cjVar.c = wg3.b + ' ' + str;
            cjVar.d = this;
            cjVar.e = bk0Var;
            qv0 qv0Var = new qv0(cjVar);
            this.i = qv0Var;
            xp2 xp2Var = qv0.G;
            this.o = (xp2Var.a & 8) != 0 ? xp2Var.b[3] : Integer.MAX_VALUE;
            yv0 yv0Var = qv0Var.D;
            synchronized (yv0Var) {
                try {
                    if (yv0Var.k) {
                        throw new IOException("closed");
                    }
                    Logger logger = yv0.m;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(wg3.d(">> CONNECTION " + jv0.a.b(), new Object[0]));
                    }
                    yv0Var.h.z(jv0.a);
                    yv0Var.h.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            yv0 yv0Var2 = qv0Var.D;
            xp2 xp2Var2 = qv0Var.x;
            yv0Var2.getClass();
            xp2Var2.getClass();
            synchronized (yv0Var2) {
                try {
                    if (yv0Var2.k) {
                        throw new IOException("closed");
                    }
                    yv0Var2.e(0, Integer.bitCount(xp2Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & xp2Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            yv0Var2.h.writeShort(i);
                            yv0Var2.h.writeInt(xp2Var2.b[i]);
                        }
                    }
                    yv0Var2.h.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (qv0Var.x.a() != 65535) {
                qv0Var.D.o(r7 - 65535, 0);
            }
            hy2.b(qv0Var.n.d(), qv0Var.j, qv0Var.E);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        hb2 hb2Var = this.c;
        sb.append(hb2Var.a.i.d);
        sb.append(':');
        sb.append(hb2Var.a.i.e);
        sb.append(", proxy=");
        sb.append(hb2Var.b);
        sb.append(" hostAddress=");
        sb.append(hb2Var.c);
        sb.append(" cipherSuite=");
        yr0 yr0Var = this.f;
        sb.append(yr0Var != null ? yr0Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
