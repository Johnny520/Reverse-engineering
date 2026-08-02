package p000;

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

    /* JADX INFO: renamed from: b */
    public final iy2 f10562b;

    /* JADX INFO: renamed from: c */
    public final hb2 f10563c;

    /* JADX INFO: renamed from: d */
    public final Socket f10564d;

    /* JADX INFO: renamed from: e */
    public final Socket f10565e;

    /* JADX INFO: renamed from: f */
    public final yr0 f10566f;

    /* JADX INFO: renamed from: g */
    public final c42 f10567g;

    /* JADX INFO: renamed from: h */
    public final C0043b5 f10568h;

    /* JADX INFO: renamed from: i */
    public qv0 f10569i;

    /* JADX INFO: renamed from: j */
    public boolean f10570j;

    /* JADX INFO: renamed from: k */
    public boolean f10571k;

    /* JADX INFO: renamed from: l */
    public int f10572l;

    /* JADX INFO: renamed from: m */
    public int f10573m;

    /* JADX INFO: renamed from: n */
    public int f10574n;

    /* JADX INFO: renamed from: o */
    public int f10575o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f10576p;

    /* JADX INFO: renamed from: q */
    public long f10577q;

    public t52(iy2 iy2Var, ud0 ud0Var, hb2 hb2Var, Socket socket, Socket socket2, yr0 yr0Var, c42 c42Var, C0043b5 c0043b5) {
        iy2Var.getClass();
        ud0Var.getClass();
        hb2Var.getClass();
        socket.getClass();
        socket2.getClass();
        c42Var.getClass();
        c0043b5.getClass();
        this.f10562b = iy2Var;
        this.f10563c = hb2Var;
        this.f10564d = socket;
        this.f10565e = socket2;
        this.f10566f = yr0Var;
        this.f10567g = c42Var;
        this.f10568h = c0043b5;
        this.f10575o = 1;
        this.f10576p = new ArrayList();
        this.f10577q = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static void m5121d(et1 et1Var, hb2 hb2Var, IOException iOException) {
        et1Var.getClass();
        hb2Var.getClass();
        iOException.getClass();
        if (hb2Var.f3945b.type() != Proxy.Type.DIRECT) {
            C0605q5 c0605q5 = hb2Var.f3944a;
            c0605q5.f8738h.connectFailed(c0605q5.f8739i.m6362h(), hb2Var.f3945b.address(), iOException);
        }
        hh1 hh1Var = et1Var.f2597C;
        synchronized (hh1Var) {
            ((LinkedHashSet) hh1Var.f4019i).add(hb2Var);
        }
    }

    @Override // p000.ov0
    /* JADX INFO: renamed from: a */
    public final void mo3642a(qv0 qv0Var, xp2 xp2Var) {
        xp2Var.getClass();
        synchronized (this) {
            this.f10575o = (xp2Var.f13107a & 8) != 0 ? xp2Var.f13108b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // p000.wg0
    /* JADX INFO: renamed from: b */
    public final void mo4626b(s52 s52Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof av2)) {
                    if (!(this.f10569i != null) || (iOException instanceof C0712sy)) {
                        this.f10570j = true;
                        if (this.f10573m == 0) {
                            if (iOException != null) {
                                m5121d(s52Var.f9913h, this.f10563c, iOException);
                            }
                            this.f10572l++;
                        }
                    }
                } else if (((av2) iOException).f411h == cg0.REFUSED_STREAM) {
                    int i = this.f10574n + 1;
                    this.f10574n = i;
                    if (i > 1) {
                        this.f10570j = true;
                        this.f10572l++;
                    }
                } else if (((av2) iOException).f411h != cg0.CANCEL || !s52Var.f9929x) {
                    this.f10570j = true;
                    this.f10572l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ov0
    /* JADX INFO: renamed from: c */
    public final void mo3451c(xv0 xv0Var) {
        xv0Var.m6184c(cg0.REFUSED_STREAM, null);
    }

    @Override // p000.wg0
    public final void cancel() {
        wg3.m5890c(this.f10564d);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5122e(C0605q5 c0605q5, List list) {
        yw0 yw0Var = c0605q5.f8739i;
        TimeZone timeZone = wg3.f12507a;
        if (this.f10576p.size() < this.f10575o && !this.f10570j) {
            hb2 hb2Var = this.f10563c;
            C0605q5 c0605q52 = hb2Var.f3944a;
            C0605q5 c0605q53 = hb2Var.f3944a;
            if (c0605q52.m4054a(c0605q5)) {
                String str = yw0Var.f13644d;
                String str2 = yw0Var.f13644d;
                if (t11.m5086l(str, c0605q53.f8739i.f13644d)) {
                    return true;
                }
                if (this.f10569i != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hb2 hb2Var2 = (hb2) it.next();
                        Proxy.Type type = hb2Var2.f3945b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && hb2Var.f3945b.type() == type2 && t11.m5086l(hb2Var.f3946c, hb2Var2.f3946c)) {
                            if (c0605q5.f8734d == ys1.f13610a) {
                                TimeZone timeZone2 = wg3.f12507a;
                                yw0 yw0Var2 = c0605q53.f8739i;
                                if (yw0Var.f13645e == yw0Var2.f13645e) {
                                    boolean zM5086l = t11.m5086l(str2, yw0Var2.f13644d);
                                    yr0 yr0Var = this.f10566f;
                                    if (!zM5086l) {
                                        if (!this.f10571k && yr0Var != null) {
                                            List listM6320a = yr0Var.m6320a();
                                            if (!listM6320a.isEmpty()) {
                                                Object obj = listM6320a.get(0);
                                                obj.getClass();
                                                if (ys1.m6324c(str2, (X509Certificate) obj)) {
                                                    try {
                                                        C0102cq c0102cq = c0605q5.f8735e;
                                                        c0102cq.getClass();
                                                        yr0Var.getClass();
                                                        List listM6320a2 = yr0Var.m6320a();
                                                        str2.getClass();
                                                        listM6320a2.getClass();
                                                        Iterator it2 = c0102cq.f1666a.iterator();
                                                        if (!it2.hasNext()) {
                                                            return true;
                                                        }
                                                        vi0.m5701t(it2.next());
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

    @Override // p000.wg0
    /* JADX INFO: renamed from: f */
    public final hb2 mo4627f() {
        return this.f10563c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5123g(boolean z) {
        long j;
        TimeZone timeZone = wg3.f12507a;
        long jNanoTime = System.nanoTime();
        if (this.f10564d.isClosed() || this.f10565e.isClosed() || this.f10565e.isInputShutdown() || this.f10565e.isOutputShutdown()) {
            return false;
        }
        qv0 qv0Var = this.f10569i;
        if (qv0Var != null) {
            synchronized (qv0Var) {
                if (qv0Var.f9191m) {
                    return false;
                }
                if (qv0Var.f9199u < qv0Var.f9198t) {
                    if (jNanoTime >= qv0Var.f9200v) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f10577q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f10565e;
        o52 o52Var = (o52) this.f10568h.f563j;
        socket.getClass();
        o52Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !o52Var.m3509b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // p000.wg0
    /* JADX INFO: renamed from: h */
    public final void mo4628h() {
        synchronized (this) {
            this.f10570j = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5124i() throws SocketException {
        this.f10577q = System.nanoTime();
        c42 c42Var = this.f10567g;
        if (c42Var == c42.f1140m || c42Var == c42.f1141n) {
            this.f10565e.setSoTimeout(0);
            gd3 gd3Var = gd3.f3437o;
            bk0 bk0Var = bk0.f905a;
            iy2 iy2Var = this.f10562b;
            iy2Var.getClass();
            C0093cj c0093cj = new C0093cj();
            c0093cj.f1579a = iy2Var;
            c0093cj.f1582d = ov0.f7857a;
            c0093cj.f1583e = bk0.f905a;
            C0043b5 c0043b5 = this.f10568h;
            String str = this.f10563c.f3944a.f8739i.f13644d;
            c0043b5.getClass();
            str.getClass();
            c0093cj.f1580b = c0043b5;
            c0093cj.f1581c = wg3.f12508b + ' ' + str;
            c0093cj.f1582d = this;
            c0093cj.f1583e = bk0Var;
            qv0 qv0Var = new qv0(c0093cj);
            this.f10569i = qv0Var;
            xp2 xp2Var = qv0.f9179G;
            this.f10575o = (xp2Var.f13107a & 8) != 0 ? xp2Var.f13108b[3] : Integer.MAX_VALUE;
            yv0 yv0Var = qv0Var.f9183D;
            synchronized (yv0Var) {
                try {
                    if (yv0Var.f13630k) {
                        throw new IOException("closed");
                    }
                    Logger logger = yv0.f13626m;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(wg3.m5891d(">> CONNECTION " + jv0.f5231a.mo3323b(), new Object[0]));
                    }
                    yv0Var.f13627h.mo1697z(jv0.f5231a);
                    yv0Var.f13627h.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            yv0 yv0Var2 = qv0Var.f9183D;
            xp2 xp2Var2 = qv0Var.f9202x;
            yv0Var2.getClass();
            xp2Var2.getClass();
            synchronized (yv0Var2) {
                try {
                    if (yv0Var2.f13630k) {
                        throw new IOException("closed");
                    }
                    yv0Var2.m6349e(0, Integer.bitCount(xp2Var2.f13107a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & xp2Var2.f13107a) == 0) {
                            z = false;
                        }
                        if (z) {
                            yv0Var2.f13627h.writeShort(i);
                            yv0Var2.f13627h.writeInt(xp2Var2.f13108b[i]);
                        }
                    }
                    yv0Var2.f13627h.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (qv0Var.f9202x.m6170a() != 65535) {
                qv0Var.f9183D.m6354o(r7 - 65535, 0);
            }
            hy2.m2234b(qv0Var.f9192n.m2421d(), qv0Var.f9188j, qv0Var.f9184E);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        hb2 hb2Var = this.f10563c;
        sb.append(hb2Var.f3944a.f8739i.f13644d);
        sb.append(':');
        sb.append(hb2Var.f3944a.f8739i.f13645e);
        sb.append(", proxy=");
        sb.append(hb2Var.f3945b);
        sb.append(" hostAddress=");
        sb.append(hb2Var.f3946c);
        sb.append(" cipherSuite=");
        yr0 yr0Var = this.f10566f;
        sb.append(yr0Var != null ? yr0Var.f13597b : "none");
        sb.append(" protocol=");
        sb.append(this.f10567g);
        sb.append('}');
        return sb.toString();
    }
}
