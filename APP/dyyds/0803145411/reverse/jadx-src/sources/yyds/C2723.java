package yyds;

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

/* JADX INFO: renamed from: yyds.ᲈᛸᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2723 extends AbstractC2165 implements InterfaceC1604 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f13375;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0644 f13376;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f13377;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0937 f13378;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Socket f13379;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0105 f13381;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final EnumC0940 f13383;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f13384;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f13385;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f13386;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1369 f13387;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2126 f13389;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Socket f13390;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f13380 = 1;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final ArrayList f13388 = new ArrayList();

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public long f13382 = Long.MAX_VALUE;

    public C2723(C0105 c0105, C1369 c1369, Socket socket, Socket socket2, C2126 c2126, EnumC0940 enumC0940, C0644 c0644) {
        this.f13381 = c0105;
        this.f13387 = c1369;
        this.f13390 = socket;
        this.f13379 = socket2;
        this.f13389 = c2126;
        this.f13383 = enumC0940;
        this.f13376 = c0644;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m4845(C1284 c1284, C1369 c1369, IOException iOException) {
        if (c1369.f6394.type() != Proxy.Type.DIRECT) {
            C1618 c1618 = c1369.f6393;
            c1618.f8239.connectFailed(c1618.f8234.m475(), c1369.f6394.address(), iOException);
        }
        C2014 c2014 = c1284.f5899;
        synchronized (c2014) {
            ((LinkedHashSet) c2014.f10074).add(c1369);
        }
    }

    @Override // yyds.InterfaceC1604
    public final void cancel() {
        AbstractC0795.m1808(this.f13390);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C1369 c1369 = this.f13387;
        sb.append(c1369.f6393.f8234.f670);
        sb.append(':');
        sb.append(c1369.f6393.f8234.f664);
        sb.append(", proxy=");
        sb.append(c1369.f6394);
        sb.append(" hostAddress=");
        sb.append(c1369.f6395);
        sb.append(" cipherSuite=");
        C2126 c2126 = this.f13389;
        sb.append(c2126 != null ? c2126.f10512 : "none");
        sb.append(" protocol=");
        sb.append(this.f13383);
        sb.append('}');
        return sb.toString();
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo3290() {
        synchronized (this) {
            this.f13386 = true;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4846() throws SocketException {
        this.f13382 = System.nanoTime();
        EnumC0940 enumC0940 = this.f13383;
        if (enumC0940 == EnumC0940.HTTP_2 || enumC0940 == EnumC0940.H2_PRIOR_KNOWLEDGE) {
            this.f13379.setSoTimeout(0);
            C1586 c1586 = C1586.f8038;
            C1601 c1601 = C1601.f8156;
            C0105 c0105 = this.f13381;
            C1633 c1633 = new C1633();
            c1633.f8333 = c0105;
            c1633.f8334 = AbstractC2165.f10632;
            c1633.f8332 = C1601.f8156;
            C0644 c0644 = this.f13376;
            String str = this.f13387.f6393.f8234.f670;
            c1633.f8335 = c0644;
            c1633.f8331 = AbstractC0795.f3654 + ' ' + str;
            c1633.f8334 = this;
            c1633.f8332 = c1601;
            C0937 c0937 = new C0937(c1633);
            this.f13378 = c0937;
            C1670 c1670 = C0937.f4293;
            this.f13380 = (c1670.f8523 & 8) != 0 ? c1670.f8524[3] : Integer.MAX_VALUE;
            C0276 c0276 = c0937.f4318;
            synchronized (c0276) {
                try {
                    if (c0276.f1484) {
                        throw new IOException("closed");
                    }
                    Logger logger = C0276.f1480;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC0795.m1810(">> CONNECTION " + AbstractC0545.f2617.mo4265(), new Object[0]));
                    }
                    c0276.f1483.m4895(AbstractC0545.f2617);
                    c0276.f1483.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0276 c02762 = c0937.f4318;
            C1670 c16702 = c0937.f4313;
            synchronized (c02762) {
                try {
                    if (c02762.f1484) {
                        throw new IOException("closed");
                    }
                    c02762.m921(0, Integer.bitCount(c16702.f8523) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & c16702.f8523) == 0) {
                            z = false;
                        }
                        if (z) {
                            C2776 c2776 = c02762.f1483;
                            if (c2776.f13528) {
                                throw new IllegalStateException("closed");
                            }
                            C1507 c1507 = c2776.f13530;
                            C0502 c0502M3039 = c1507.m3039(2);
                            byte[] bArr = c0502M3039.f2443;
                            int i2 = c0502M3039.f2446;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            c0502M3039.f2446 = i2 + 2;
                            c1507.f7087 += 2;
                            c2776.m4891();
                            c02762.f1483.m4894(c16702.f8524[i]);
                        }
                    }
                    c02762.f1483.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c0937.f4313.m3416() != 65535) {
                c0937.f4318.m918(0, r11 - 65535);
            }
            C0153.m694(c0937.f4298.m510(), c0937.f4299, c0937.f4304);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4847(C1618 c1618, List list) {
        C0082 c0082 = c1618.f8234;
        String str = c0082.f670;
        TimeZone timeZone = AbstractC0795.f3653;
        if (this.f13388.size() < this.f13380 && !this.f13386) {
            C1369 c1369 = this.f13387;
            C1618 c16182 = c1369.f6393;
            C1618 c16183 = c1369.f6393;
            if (c16182.m3314(c1618)) {
                if (AbstractC1544.m3188(str, c16183.f8234.f670)) {
                    return true;
                }
                if (this.f13378 != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1369 c13692 = (C1369) it.next();
                        Proxy.Type type = c13692.f6394.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c1369.f6394.type() == type2 && AbstractC1544.m3188(c1369.f6395, c13692.f6395)) {
                            if (c1618.f8243 == C2745.f13458) {
                                TimeZone timeZone2 = AbstractC0795.f3653;
                                C0082 c00822 = c16183.f8234;
                                if (c0082.f664 == c00822.f664) {
                                    boolean zM3188 = AbstractC1544.m3188(str, c00822.f670);
                                    C2126 c2126 = this.f13389;
                                    if (!zM3188) {
                                        if (!this.f13384 && c2126 != null) {
                                            List listM4040 = c2126.m4040();
                                            if (!listM4040.isEmpty() && C2745.m4871(str, (X509Certificate) listM4040.get(0))) {
                                                try {
                                                    C2342 c2342 = c1618.f8236;
                                                    c2126.m4040();
                                                    Iterator it2 = c2342.f11509.iterator();
                                                    if (!it2.hasNext()) {
                                                        return true;
                                                    }
                                                    AbstractC0897.m1996(it2.next());
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
        return false;
    }

    @Override // yyds.AbstractC2165
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo4130(C1670 c1670) {
        synchronized (this) {
            this.f13380 = (c1670.f8523 & 8) != 0 ? c1670.f8524[3] : Integer.MAX_VALUE;
        }
    }

    @Override // yyds.AbstractC2165
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo2352(C2521 c2521) {
        c2521.m4573(8, null);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m4848(boolean z) {
        long j;
        TimeZone timeZone = AbstractC0795.f3653;
        long jNanoTime = System.nanoTime();
        if (this.f13390.isClosed() || this.f13379.isClosed() || this.f13379.isInputShutdown() || this.f13379.isOutputShutdown()) {
            return false;
        }
        C0937 c0937 = this.f13378;
        if (c0937 != null) {
            synchronized (c0937) {
                if (c0937.f4295) {
                    return false;
                }
                if (c0937.f4315 < c0937.f4302) {
                    if (jNanoTime >= c0937.f4306) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f13382;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f13379;
        C2066 c2066 = (C2066) this.f13376.f3102;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c2066.m3920();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final C1369 mo3291() {
        return this.f13387;
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo3292(C2729 c2729, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof C2601)) {
                    if (!(this.f13378 != null) || (iOException instanceof C1496)) {
                        this.f13386 = true;
                        if (this.f13377 == 0) {
                            if (iOException != null) {
                                m4845(c2729.f13423, this.f13387, iOException);
                            }
                            this.f13385++;
                        }
                    }
                } else if (((C2601) iOException).f12802 == 8) {
                    int i = this.f13375 + 1;
                    this.f13375 = i;
                    if (i > 1) {
                        this.f13386 = true;
                        this.f13385++;
                    }
                } else if (((C2601) iOException).f12802 != 9 || !c2729.f13422) {
                    this.f13386 = true;
                    this.f13385++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
