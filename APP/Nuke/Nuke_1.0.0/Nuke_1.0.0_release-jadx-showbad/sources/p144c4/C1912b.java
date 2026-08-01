package p144c4;

import com.bumptech.glide.AbstractC1922d;
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
import p014C1.C0240b;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1682D;
import p118X3.C1679A;
import p118X3.C1684F;
import p118X3.C1688J;
import p118X3.C1706p;
import p118X3.C1708r;
import p118X3.C1709s;
import p118X3.InterfaceC1710t;
import p123Y3.AbstractC1776g;
import p138b4.C1869n;
import p138b4.C1870o;
import p138b4.C1872q;
import p138b4.InterfaceC1862g;
import p156e4.C2038a;

/* JADX INFO: renamed from: c4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1912b implements InterfaceC1710t {

    /* JADX INFO: renamed from: b */
    public static final C1912b f6482b = new C1912b(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6483a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b4.n.j():X3.F, c4.b.<clinit>():void] */
    public /* synthetic */ C1912b(int i5) {
        this.f6483a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1679A m3393b(C1684F c1684f, C1013c c1013c, C1917g c1917g) throws ProtocolException {
        AbstractC1682D abstractC1682D;
        C1684F c1684f2;
        C1688J c1688j = c1013c != null ? c1013c.m2081c().f6346c : null;
        int i5 = c1684f.f5741g;
        C1679A c1679a = c1684f.f5738d;
        String str = c1679a.f5713b;
        if (i5 == 307 || i5 == 308) {
            if (c1917g.f6485a.f6326d.f5924h) {
                String strM3038a = c1684f.f5743i.m3038a("Location");
                if (strM3038a == null) {
                    strM3038a = null;
                }
                C1679A c1679a2 = c1684f.f5738d;
                if (strM3038a != null) {
                    C1709s c1709s = c1679a2.f5712a;
                    c1709s.getClass();
                    C1708r c1708rM3051f = c1709s.m3051f(strM3038a);
                    C1709s c1709sM3043a = c1708rM3051f != null ? c1708rM3051f.m3043a() : null;
                    if (c1709sM3043a != null && (AbstractC1665j.m2981a(c1709sM3043a.f5868a, c1679a2.f5712a.f5868a) || c1917g.f6485a.f6326d.f5925i)) {
                        C0240b c0240bM3001a = c1679a2.m3001a();
                        if (AbstractC1922d.m3442z(str)) {
                            int i6 = c1684f.f5741g;
                            boolean z5 = str.equals("PROPFIND") || i6 == 308 || i6 == 307;
                            if (str.equals("PROPFIND") || i6 == 308 || i6 == 307) {
                                c0240bM3001a.m438o(str, z5 ? c1679a2.f5715d : null);
                            } else {
                                c0240bM3001a.m438o("GET", null);
                            }
                            if (!z5) {
                                ((C1706p) c0240bM3001a.f810c).m3036o("Transfer-Encoding");
                                ((C1706p) c0240bM3001a.f810c).m3036o("Content-Length");
                                ((C1706p) c0240bM3001a.f810c).m3036o("Content-Type");
                            }
                        }
                        if (!AbstractC1776g.m3174a(c1679a2.f5712a, c1709sM3043a)) {
                            ((C1706p) c0240bM3001a.f810c).m3036o("Authorization");
                        }
                        c0240bM3001a.f808a = c1709sM3043a;
                        return new C1679A(c0240bM3001a);
                    }
                }
            }
        } else {
            if (i5 == 401) {
                c1917g.f6493i.getClass();
                return null;
            }
            if (i5 == 421) {
                AbstractC1682D abstractC1682D2 = c1679a.f5715d;
                if ((abstractC1682D2 == null || !abstractC1682D2.mo3002c()) && c1013c != null && !AbstractC1665j.m2981a(((InterfaceC1862g) c1013c.f3130c).mo3118h().f6373i.f5782h.f5871d, ((InterfaceC1915e) c1013c.f3131d).mo3403h().mo3331f().f5763a.f5782h.f5871d)) {
                    C1870o c1870oM2081c = c1013c.m2081c();
                    synchronized (c1870oM2081c) {
                        c1870oM2081c.f6354k = true;
                    }
                    return c1684f.f5738d;
                }
            } else if (i5 == 503) {
                C1684F c1684f3 = c1684f.f5748n;
                if ((c1684f3 == null || c1684f3.f5741g != 503) && m3395d(c1684f, Integer.MAX_VALUE) == 0) {
                    return c1684f.f5738d;
                }
            } else {
                if (i5 == 407) {
                    AbstractC1665j.m2982b(c1688j);
                    if (c1688j.f5764b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    c1917g.f6499o.getClass();
                    return null;
                }
                if (i5 != 408) {
                    switch (i5) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        default:
                            return null;
                    }
                } else if (c1917g.f6501q && (((abstractC1682D = c1679a.f5715d) == null || !abstractC1682D.mo3002c()) && (((c1684f2 = c1684f.f5748n) == null || c1684f2.f5741g != 408) && m3395d(c1684f, 0) <= 0))) {
                    return c1684f.f5738d;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m3394c(IOException iOException, C1869n c1869n, C1917g c1917g, C1679A c1679a) {
        AbstractC1682D abstractC1682D;
        boolean z5 = iOException instanceof C2038a;
        if (!c1917g.f6501q) {
            return false;
        }
        if ((!z5 && (((abstractC1682D = c1679a.f5715d) != null && abstractC1682D.mo3002c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z5) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C1013c c1013c = c1869n.f6343u;
        if (c1013c == null || !c1013c.f3128a) {
            return false;
        }
        InterfaceC1862g interfaceC1862g = c1869n.f6333k;
        AbstractC1665j.m2982b(interfaceC1862g);
        C1872q c1872qMo3118h = interfaceC1862g.mo3118h();
        C1013c c1013c2 = c1869n.f6343u;
        return c1872qMo3118h.m3364a(c1013c2 != null ? c1013c2.m2081c() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m3395d(C1684F c1684f, int i5) {
        String strM3038a = c1684f.f5743i.m3038a("Retry-After");
        if (strM3038a == null) {
            strM3038a = null;
        }
        if (strM3038a == null) {
            return i5;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC1665j.m2984d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM3038a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM3038a);
        AbstractC1665j.m2984d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v72 b4.q, still in use, count: 2, list:
          (r0v72 b4.q) from 0x0068: MOVE (r16v5 b4.q) = (r0v72 b4.q) (LINE:105)
          (r0v72 b4.q) from 0x005d: MOVE (r16v8 b4.q) = (r0v72 b4.q) (LINE:94)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p118X3.InterfaceC1710t
    /* JADX INFO: renamed from: a */
    public final p118X3.C1684F mo1903a(p144c4.C1917g r36) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            int r0 = r1.f6483a
            switch(r0) {
                case 0: goto L2ae;
                case 1: goto L1b2;
                default: goto L9;
            }
        L9:
            X3.A r0 = r2.f6489e
            b4.n r6 = r2.f6485a
            L2.u r7 = p061L2.C0981u.f3047d
            r8 = r7
            r19 = 0
            r20 = 0
            r7 = r0
            r0 = 1
        L16:
            N1.c r9 = r6.f6336n
            if (r9 != 0) goto L1aa
            monitor-enter(r6)
            boolean r9 = r6.f6338p     // Catch: java.lang.Throwable -> L192
            if (r9 != 0) goto L19f
            boolean r9 = r6.f6337o     // Catch: java.lang.Throwable -> L192
            if (r9 != 0) goto L190
            boolean r9 = r6.f6340r     // Catch: java.lang.Throwable -> L192
            if (r9 != 0) goto L190
            boolean r9 = r6.f6339q     // Catch: java.lang.Throwable -> L192
            if (r9 != 0) goto L190
            monitor-exit(r6)
            if (r0 == 0) goto Lc9
            b4.q r0 = new b4.q
            X3.y r9 = r6.f6326d
            a4.d r10 = r9.f5942z
            A.i0 r11 = r2.f6495k
            java.lang.Object r11 = r11.f297e
            b4.p r11 = (p138b4.C1871p) r11
            int r12 = r2.f6491g
            r13 = r10
            int r10 = r2.f6492h
            r14 = r8
            r8 = r11
            int r11 = r2.f6490f
            r15 = r13
            boolean r13 = r2.f6501q
            boolean r9 = r9.f5922f
            X3.s r4 = r7.f5712a
            java.lang.String r3 = "url"
            p117X2.AbstractC1665j.m2985e(r4, r3)
            java.lang.String r3 = r4.f5868a
            java.lang.String r5 = "https"
            boolean r3 = p117X2.AbstractC1665j.m2981a(r3, r5)
            if (r3 == 0) goto L68
            javax.net.ssl.SSLSocketFactory r3 = r2.f6503s
            javax.net.ssl.HostnameVerifier r5 = r2.f6498n
            r16 = r0
            X3.f r0 = r2.f6494j
            r29 = r0
            r27 = r3
            r28 = r5
            goto L70
        L68:
            r16 = r0
            r27 = 0
            r28 = 0
            r29 = 0
        L70:
            X3.a r22 = new X3.a
            java.lang.String r0 = r4.f5871d
            int r3 = r4.f5872e
            X3.b r4 = r2.f6497m
            javax.net.SocketFactory r5 = r2.f6502r
            r23 = r0
            X3.b r0 = r2.f6499o
            r30 = r0
            b4.n r0 = r2.f6485a
            X3.y r0 = r0.f6326d
            java.util.List r1 = r0.f5934r
            java.util.List r0 = r0.f5933q
            r32 = r0
            java.net.ProxySelector r0 = r2.f6500p
            r33 = r0
            r31 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X3.y r0 = r6.f6326d
            Y1.n r0 = r0.f5941y
            r1 = r14
            r14 = r9
            r9 = r12
            r17 = r6
            r18 = r7
            r7 = r15
            r6 = r16
            r15 = r22
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r17
            r7 = r18
            X3.y r0 = r3.f6326d
            boolean r4 = r0.f5922f
            if (r4 == 0) goto Lc0
            b4.j r4 = new b4.j
            a4.d r0 = r0.f5942z
            r4.<init>(r6, r0)
            goto Lc6
        Lc0:
            Y1.n r4 = new Y1.n
            r0 = 3
            r4.<init>(r0, r6)
        Lc6:
            r3.f6333k = r4
            goto Lcb
        Lc9:
            r3 = r6
            r1 = r8
        Lcb:
            boolean r0 = r3.f6342t     // Catch: java.lang.Throwable -> Le0
            if (r0 != 0) goto L184
            X3.F r0 = r2.m3409b(r7)     // Catch: java.lang.Throwable -> Le0 java.io.IOException -> L14e
            X3.E r0 = r0.m3005b()     // Catch: java.lang.Throwable -> Le0
            r0.f5723a = r7     // Catch: java.lang.Throwable -> Le0
            if (r19 == 0) goto Le4
            X3.F r4 = com.bumptech.glide.AbstractC1922d.m3420F(r19)     // Catch: java.lang.Throwable -> Le0
            goto Le5
        Le0:
            r0 = move-exception
            r1 = 1
            goto L18c
        Le4:
            r4 = 0
        Le5:
            r0.f5733k = r4     // Catch: java.lang.Throwable -> Le0
            X3.F r0 = r0.m3004a()     // Catch: java.lang.Throwable -> Le0
            N1.c r4 = r3.f6336n     // Catch: java.lang.Throwable -> Le0
            X3.A r7 = m3393b(r0, r4, r2)     // Catch: java.lang.Throwable -> Le0
            if (r7 != 0) goto L101
            X3.m r1 = r3.f6329g     // Catch: java.lang.Throwable -> Lfd
            r1.getClass()     // Catch: java.lang.Throwable -> Lfd
            r1 = 0
        Lf9:
            r3.m3352i(r1)
            goto L112
        Lfd:
            r0 = move-exception
            r1 = 0
            goto L18c
        L101:
            X3.D r4 = r7.f5715d     // Catch: java.lang.Throwable -> Le0
            if (r4 == 0) goto L113
            boolean r4 = r4.mo3002c()     // Catch: java.lang.Throwable -> Le0
            if (r4 == 0) goto L113
            X3.m r1 = r3.f6329g     // Catch: java.lang.Throwable -> Lfd
            r1.getClass()     // Catch: java.lang.Throwable -> Lfd
            r1 = 0
            goto Lf9
        L112:
            return r0
        L113:
            X3.I r4 = r0.f5744j     // Catch: java.lang.Throwable -> Le0
            p123Y3.AbstractC1774e.m3161b(r4)     // Catch: java.lang.Throwable -> Le0
            int r4 = r20 + 1
            r5 = 20
            if (r4 > r5) goto L132
            X3.m r5 = r3.f6329g     // Catch: java.lang.Throwable -> Le0
            r5.getClass()     // Catch: java.lang.Throwable -> Le0
            r5 = 1
            r3.m3352i(r5)
            r19 = r0
            r8 = r1
            r6 = r3
            r20 = r4
            r0 = 1
            r1 = r35
            goto L16
        L132:
            X3.m r0 = r3.f6329g     // Catch: java.lang.Throwable -> Le0
            r0.getClass()     // Catch: java.lang.Throwable -> Le0
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r1.<init>()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r2 = "Too many follow-up requests: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le0
            r1.append(r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le0
            throw r0     // Catch: java.lang.Throwable -> Le0
        L14e:
            r0 = move-exception
            boolean r4 = m3394c(r0, r3, r2, r7)     // Catch: java.lang.Throwable -> Le0
            X3.m r5 = r3.f6329g     // Catch: java.lang.Throwable -> Le0
            r5.getClass()     // Catch: java.lang.Throwable -> Le0
            if (r4 != 0) goto L176
            byte[] r2 = p123Y3.AbstractC1774e.f6072a     // Catch: java.lang.Throwable -> Le0
            java.lang.String r2 = "suppressed"
            p117X2.AbstractC1665j.m2985e(r1, r2)     // Catch: java.lang.Throwable -> Le0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le0
        L165:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le0
            if (r2 == 0) goto L175
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le0
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch: java.lang.Throwable -> Le0
            p179i4.AbstractC2352g.m4193f(r0, r2)     // Catch: java.lang.Throwable -> Le0
            goto L165
        L175:
            throw r0     // Catch: java.lang.Throwable -> Le0
        L176:
            java.util.ArrayList r8 = p061L2.AbstractC0973m.m2020a0(r1, r0)     // Catch: java.lang.Throwable -> Le0
            r5 = 1
            r3.m3352i(r5)
            r1 = r35
            r6 = r3
            r0 = 0
            goto L16
        L184:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le0
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le0
            throw r0     // Catch: java.lang.Throwable -> Le0
        L18c:
            r3.m3352i(r1)
            throw r0
        L190:
            r3 = r6
            goto L195
        L192:
            r0 = move-exception
            r3 = r6
            goto L1a8
        L195:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19d
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19d
            throw r0     // Catch: java.lang.Throwable -> L19d
        L19d:
            r0 = move-exception
            goto L1a8
        L19f:
            r3 = r6
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L19d
            throw r1     // Catch: java.lang.Throwable -> L19d
        L1a8:
            monitor-exit(r3)
            throw r0
        L1aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L1b2:
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = "User-Agent"
            java.lang.String r3 = "gzip"
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "Connection"
            java.lang.String r6 = "Host"
            java.lang.String r7 = "Transfer-Encoding"
            java.lang.String r8 = "Content-Type"
            java.lang.String r9 = "Content-Length"
            X3.b r10 = r2.f6496l
            X3.A r11 = r2.f6489e
            X3.q r12 = r11.f5714c
            C1.b r13 = r11.m3001a()
            X3.s r14 = r11.f5712a
            X3.D r11 = r11.f5715d
            r15 = r10
            r16 = r11
            r17 = -1
            if (r16 == 0) goto L207
            X3.u r10 = r16.mo520b()
            if (r10 == 0) goto L1e4
            java.lang.String r10 = r10.f5879a
            r13.m436m(r8, r10)
        L1e4:
            long r10 = r16.mo519a()
            int r16 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r16 == 0) goto L1fb
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r13.m436m(r9, r10)
            java.lang.Object r10 = r13.f810c
            X3.p r10 = (p118X3.C1706p) r10
            r10.m3036o(r7)
            goto L207
        L1fb:
            java.lang.String r10 = "chunked"
            r13.m436m(r7, r10)
            java.lang.Object r7 = r13.f810c
            X3.p r7 = (p118X3.C1706p) r7
            r7.m3036o(r9)
        L207:
            java.lang.String r7 = r12.m3038a(r6)
            if (r7 != 0) goto L215
            r7 = 0
            java.lang.String r10 = p123Y3.AbstractC1776g.m3181h(r14, r7)
            r13.m436m(r6, r10)
        L215:
            java.lang.String r6 = r12.m3038a(r5)
            if (r6 != 0) goto L220
            java.lang.String r6 = "Keep-Alive"
            r13.m436m(r5, r6)
        L220:
            java.lang.String r5 = r12.m3038a(r4)
            if (r5 != 0) goto L234
            java.lang.String r5 = "Range"
            java.lang.String r5 = r12.m3038a(r5)
            if (r5 != 0) goto L234
            r13.m436m(r4, r3)
            r21 = 1
            goto L236
        L234:
            r21 = 0
        L236:
            r15.getClass()
            java.lang.String r4 = "url"
            p117X2.AbstractC1665j.m2985e(r14, r4)
            java.lang.String r4 = r12.m3038a(r1)
            if (r4 != 0) goto L249
            java.lang.String r4 = "okhttp/5.4.0"
            r13.m436m(r1, r4)
        L249:
            X3.A r1 = new X3.A
            r1.<init>(r13)
            X3.F r2 = r2.m3409b(r1)
            X3.q r4 = r2.f5743i
            X3.s r5 = r1.f5712a
            p144c4.AbstractC1916f.m3407b(r15, r5, r4)
            X3.E r5 = r2.m3005b()
            r5.f5723a = r1
            if (r21 == 0) goto L2a9
            java.lang.String r1 = r4.m3038a(r0)
            if (r1 != 0) goto L268
            r1 = 0
        L268:
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L2a9
            boolean r1 = p144c4.AbstractC1916f.m3406a(r2)
            if (r1 == 0) goto L2a9
            X3.I r1 = r2.f5744j
            n4.k r2 = new n4.k
            n4.g r1 = r1.mo507f()
            r2.<init>(r1)
            X3.p r1 = r4.m3040c()
            r1.m3036o(r0)
            r1.m3036o(r9)
            X3.q r0 = r1.m3024c()
            X3.p r0 = r0.m3040c()
            r5.f5728f = r0
            java.lang.String r0 = r4.m3038a(r8)
            if (r0 != 0) goto L29b
            r4 = 0
            goto L29c
        L29b:
            r4 = r0
        L29c:
            c4.h r0 = new c4.h
            n4.o r1 = p179i4.AbstractC2352g.m4199l(r2)
            r2 = r17
            r0.<init>(r4, r2, r1)
            r5.f5729g = r0
        L2a9:
            X3.F r0 = r5.m3004a()
            return r0
        L2ae:
            java.lang.String r1 = "close"
            java.lang.String r3 = "upgrade"
            java.lang.String r4 = "Connection"
            N1.c r6 = r2.f6488d
            p117X2.AbstractC1665j.m2982b(r6)
            X3.A r2 = r2.f6489e
            X3.D r0 = r2.f5715d
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = r2.f5713b
            boolean r5 = com.bumptech.glide.AbstractC1922d.m3442z(r5)
            if (r5 == 0) goto L2cd
            if (r0 == 0) goto L2cd
            r5 = 1
            goto L2ce
        L2cd:
            r5 = 0
        L2ce:
            X3.q r7 = r2.f5714c
            java.lang.String r7 = r7.m3038a(r4)
            boolean r14 = r3.equalsIgnoreCase(r7)
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L3c7
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L3c7
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L3c7
            r7.getClass()     // Catch: java.io.IOException -> L3c7
            java.lang.Object r7 = r6.f3131d     // Catch: java.io.IOException -> L3c7
            c4.e r7 = (p144c4.InterfaceC1915e) r7     // Catch: java.io.IOException -> L3c7
            r7.mo3396a(r2)     // Catch: java.io.IOException -> L3c7
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L3c7
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L3c7
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L3c7
            r7.getClass()     // Catch: java.io.IOException -> L3c7
            if (r5 == 0) goto L39c
            java.lang.String r5 = "100-continue"
            java.lang.String r7 = "Expect"
            X3.q r8 = r2.f5714c     // Catch: java.io.IOException -> L399
            java.lang.String r7 = r8.m3038a(r7)     // Catch: java.io.IOException -> L399
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch: java.io.IOException -> L399
            if (r5 == 0) goto L337
            java.lang.Object r5 = r6.f3131d     // Catch: java.io.IOException -> L328
            c4.e r5 = (p144c4.InterfaceC1915e) r5     // Catch: java.io.IOException -> L328
            r5.mo3400e()     // Catch: java.io.IOException -> L328
            r15 = 1
            X3.E r5 = r6.m2084f(r15)     // Catch: java.io.IOException -> L322
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L31d
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L31d
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L31d
            r7.getClass()     // Catch: java.io.IOException -> L31d
            r16 = r5
            r17 = 0
            goto L33c
        L31d:
            r0 = move-exception
            r17 = r15
            goto L3d6
        L322:
            r0 = move-exception
        L323:
            r17 = r15
            r5 = 0
            goto L3d6
        L328:
            r0 = move-exception
            r15 = 1
            java.lang.Object r5 = r6.f3129b     // Catch: java.io.IOException -> L322
            b4.n r5 = (p138b4.C1869n) r5     // Catch: java.io.IOException -> L322
            X3.m r5 = r5.f6329g     // Catch: java.io.IOException -> L322
            r5.getClass()     // Catch: java.io.IOException -> L322
            r6.m2085g(r0)     // Catch: java.io.IOException -> L322
            throw r0     // Catch: java.io.IOException -> L322
        L337:
            r15 = 1
            r17 = r15
            r16 = 0
        L33c:
            if (r16 != 0) goto L371
            r0.getClass()     // Catch: java.io.IOException -> L36d
            X3.D r5 = r2.f5715d     // Catch: java.io.IOException -> L36d
            p117X2.AbstractC1665j.m2982b(r5)     // Catch: java.io.IOException -> L36d
            long r8 = r5.mo519a()     // Catch: java.io.IOException -> L36d
            java.lang.Object r5 = r6.f3129b     // Catch: java.io.IOException -> L36d
            b4.n r5 = (p138b4.C1869n) r5     // Catch: java.io.IOException -> L36d
            X3.m r5 = r5.f6329g     // Catch: java.io.IOException -> L36d
            r5.getClass()     // Catch: java.io.IOException -> L36d
            java.lang.Object r5 = r6.f3131d     // Catch: java.io.IOException -> L36d
            c4.e r5 = (p144c4.InterfaceC1915e) r5     // Catch: java.io.IOException -> L36d
            n4.s r7 = r5.mo3404i(r2, r8)     // Catch: java.io.IOException -> L36d
            b4.e r5 = new b4.e     // Catch: java.io.IOException -> L36d
            r10 = 0
            r5.<init>(r6, r7, r8, r10)     // Catch: java.io.IOException -> L36d
            n4.n r7 = new n4.n     // Catch: java.io.IOException -> L36d
            r7.<init>(r5)     // Catch: java.io.IOException -> L36d
            r0.mo521d(r7)     // Catch: java.io.IOException -> L36d
            r7.close()     // Catch: java.io.IOException -> L36d
            goto L396
        L36d:
            r0 = move-exception
            r5 = r16
            goto L3d6
        L371:
            java.lang.Object r0 = r6.f3129b     // Catch: java.io.IOException -> L36d
            r5 = r0
            b4.n r5 = (p138b4.C1869n) r5     // Catch: java.io.IOException -> L36d
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 1
            r8 = 0
            r5.m3354k(r6, r7, r8, r9, r10, r11)     // Catch: java.io.IOException -> L36d
            b4.o r0 = r6.m2081c()     // Catch: java.io.IOException -> L36d
            e4.q r0 = r0.f6352i     // Catch: java.io.IOException -> L36d
            if (r0 == 0) goto L388
            r0 = r15
            goto L389
        L388:
            r0 = 0
        L389:
            if (r0 != 0) goto L396
            java.lang.Object r0 = r6.f3131d     // Catch: java.io.IOException -> L36d
            c4.e r0 = (p144c4.InterfaceC1915e) r0     // Catch: java.io.IOException -> L36d
            c4.d r0 = r0.mo3403h()     // Catch: java.io.IOException -> L36d
            r0.mo3333h()     // Catch: java.io.IOException -> L36d
        L396:
            r5 = r16
            goto L3ad
        L399:
            r0 = move-exception
            r15 = 1
            goto L323
        L39c:
            r15 = 1
            java.lang.Object r0 = r6.f3129b     // Catch: java.io.IOException -> L322
            r5 = r0
            b4.n r5 = (p138b4.C1869n) r5     // Catch: java.io.IOException -> L322
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 1
            r8 = 0
            r5.m3354k(r6, r7, r8, r9, r10, r11)     // Catch: java.io.IOException -> L322
            r17 = r15
            r5 = 0
        L3ad:
            java.lang.Object r0 = r6.f3131d     // Catch: java.io.IOException -> L3b7
            c4.e r0 = (p144c4.InterfaceC1915e) r0     // Catch: java.io.IOException -> L3b7
            r0.mo3398c()     // Catch: java.io.IOException -> L3b7
            r0 = r5
            r5 = 0
            goto L3e3
        L3b7:
            r0 = move-exception
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L3c5
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L3c5
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L3c5
            r7.getClass()     // Catch: java.io.IOException -> L3c5
            r6.m2085g(r0)     // Catch: java.io.IOException -> L3c5
            throw r0     // Catch: java.io.IOException -> L3c5
        L3c5:
            r0 = move-exception
            goto L3d6
        L3c7:
            r0 = move-exception
            r15 = 1
            java.lang.Object r5 = r6.f3129b     // Catch: java.io.IOException -> L322
            b4.n r5 = (p138b4.C1869n) r5     // Catch: java.io.IOException -> L322
            X3.m r5 = r5.f6329g     // Catch: java.io.IOException -> L322
            r5.getClass()     // Catch: java.io.IOException -> L322
            r6.m2085g(r0)     // Catch: java.io.IOException -> L322
            throw r0     // Catch: java.io.IOException -> L322
        L3d6:
            boolean r7 = r0 instanceof p156e4.C2038a
            if (r7 != 0) goto L534
            boolean r7 = r6.f3128a
            if (r7 == 0) goto L533
            r34 = r5
            r5 = r0
            r0 = r34
        L3e3:
            if (r0 != 0) goto L3fe
            r7 = 0
            X3.E r0 = r6.m2084f(r7)     // Catch: java.io.IOException -> L3fb
            p117X2.AbstractC1665j.m2982b(r0)     // Catch: java.io.IOException -> L3fb
            if (r17 == 0) goto L3fe
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L3fb
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L3fb
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L3fb
            r7.getClass()     // Catch: java.io.IOException -> L3fb
            r17 = 0
            goto L3fe
        L3fb:
            r0 = move-exception
            goto L52c
        L3fe:
            r0.f5723a = r2     // Catch: java.io.IOException -> L3fb
            b4.o r7 = r6.m2081c()     // Catch: java.io.IOException -> L3fb
            X3.o r7 = r7.f6349f     // Catch: java.io.IOException -> L3fb
            r0.f5727e = r7     // Catch: java.io.IOException -> L3fb
            r0.f5734l = r12     // Catch: java.io.IOException -> L3fb
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L3fb
            r0.f5735m = r7     // Catch: java.io.IOException -> L3fb
            X3.F r0 = r0.m3004a()     // Catch: java.io.IOException -> L3fb
            int r7 = r0.f5741g     // Catch: java.io.IOException -> L3fb
        L416:
            r8 = 100
            if (r7 != r8) goto L41c
        L41a:
            r8 = 0
            goto L425
        L41c:
            r8 = 102(0x66, float:1.43E-43)
            if (r8 > r7) goto L450
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 >= r8) goto L450
            goto L41a
        L425:
            X3.E r0 = r6.m2084f(r8)     // Catch: java.io.IOException -> L3fb
            p117X2.AbstractC1665j.m2982b(r0)     // Catch: java.io.IOException -> L3fb
            if (r17 == 0) goto L437
            java.lang.Object r7 = r6.f3129b     // Catch: java.io.IOException -> L3fb
            b4.n r7 = (p138b4.C1869n) r7     // Catch: java.io.IOException -> L3fb
            X3.m r7 = r7.f6329g     // Catch: java.io.IOException -> L3fb
            r7.getClass()     // Catch: java.io.IOException -> L3fb
        L437:
            r0.f5723a = r2     // Catch: java.io.IOException -> L3fb
            b4.o r7 = r6.m2081c()     // Catch: java.io.IOException -> L3fb
            X3.o r7 = r7.f6349f     // Catch: java.io.IOException -> L3fb
            r0.f5727e = r7     // Catch: java.io.IOException -> L3fb
            r0.f5734l = r12     // Catch: java.io.IOException -> L3fb
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L3fb
            r0.f5735m = r9     // Catch: java.io.IOException -> L3fb
            X3.F r0 = r0.m3004a()     // Catch: java.io.IOException -> L3fb
            int r7 = r0.f5741g     // Catch: java.io.IOException -> L3fb
            goto L416
        L450:
            r8 = 0
            java.lang.Object r2 = r6.f3129b     // Catch: java.io.IOException -> L3fb
            b4.n r2 = (p138b4.C1869n) r2     // Catch: java.io.IOException -> L3fb
            X3.m r2 = r2.f6329g     // Catch: java.io.IOException -> L3fb
            r2.getClass()     // Catch: java.io.IOException -> L3fb
            r2 = 101(0x65, float:1.42E-43)
            if (r7 != r2) goto L460
            r2 = r15
            goto L461
        L460:
            r2 = r8
        L461:
            if (r2 == 0) goto L479
            b4.o r9 = r6.m2081c()     // Catch: java.io.IOException -> L3fb
            e4.q r9 = r9.f6352i     // Catch: java.io.IOException -> L3fb
            if (r9 == 0) goto L46d
            r9 = r15
            goto L46e
        L46d:
            r9 = r8
        L46e:
            if (r9 != 0) goto L471
            goto L479
        L471:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L3fb
            java.lang.String r1 = "Unexpected 101 code on HTTP/2 connection"
            r0.<init>(r1)     // Catch: java.io.IOException -> L3fb
            throw r0     // Catch: java.io.IOException -> L3fb
        L479:
            if (r2 == 0) goto L48c
            X3.q r2 = r0.f5743i     // Catch: java.io.IOException -> L3fb
            java.lang.String r2 = r2.m3038a(r4)     // Catch: java.io.IOException -> L3fb
            if (r2 != 0) goto L484
            r2 = 0
        L484:
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> L3fb
            if (r2 == 0) goto L48c
            r3 = r15
            goto L48d
        L48c:
            r3 = r8
        L48d:
            if (r14 == 0) goto L4b3
            if (r3 == 0) goto L4b3
            X3.E r2 = r0.m3005b()     // Catch: java.io.IOException -> L3fb
            Y3.c r3 = new Y3.c     // Catch: java.io.IOException -> L3fb
            X3.I r8 = r0.f5744j     // Catch: java.io.IOException -> L3fb
            X3.u r8 = r8.mo506d()     // Catch: java.io.IOException -> L3fb
            X3.I r0 = r0.f5744j     // Catch: java.io.IOException -> L3fb
            long r9 = r0.mo505c()     // Catch: java.io.IOException -> L3fb
            r3.<init>(r8, r9)     // Catch: java.io.IOException -> L3fb
            r2.f5729g = r3     // Catch: java.io.IOException -> L3fb
            A.T0 r0 = r6.m2086h()     // Catch: java.io.IOException -> L3fb
            r2.f5730h = r0     // Catch: java.io.IOException -> L3fb
            X3.F r0 = r2.m3004a()     // Catch: java.io.IOException -> L3fb
            goto L4c8
        L4b3:
            c4.h r2 = r6.m2083e(r0)     // Catch: java.io.IOException -> L3fb
            X3.E r0 = r0.m3005b()     // Catch: java.io.IOException -> L3fb
            r0.f5729g = r2     // Catch: java.io.IOException -> L3fb
            c4.a r2 = new c4.a     // Catch: java.io.IOException -> L3fb
            r2.<init>()     // Catch: java.io.IOException -> L3fb
            r0.f5737o = r2     // Catch: java.io.IOException -> L3fb
            X3.F r0 = r0.m3004a()     // Catch: java.io.IOException -> L3fb
        L4c8:
            X3.A r2 = r0.f5738d     // Catch: java.io.IOException -> L3fb
            X3.q r2 = r2.f5714c     // Catch: java.io.IOException -> L3fb
            java.lang.String r2 = r2.m3038a(r4)     // Catch: java.io.IOException -> L3fb
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> L3fb
            if (r2 != 0) goto L4e7
            X3.q r2 = r0.f5743i     // Catch: java.io.IOException -> L3fb
            java.lang.String r2 = r2.m3038a(r4)     // Catch: java.io.IOException -> L3fb
            if (r2 != 0) goto L4e0
            r4 = 0
            goto L4e1
        L4e0:
            r4 = r2
        L4e1:
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch: java.io.IOException -> L3fb
            if (r1 == 0) goto L4f2
        L4e7:
            java.lang.Object r1 = r6.f3131d     // Catch: java.io.IOException -> L3fb
            c4.e r1 = (p144c4.InterfaceC1915e) r1     // Catch: java.io.IOException -> L3fb
            c4.d r1 = r1.mo3403h()     // Catch: java.io.IOException -> L3fb
            r1.mo3333h()     // Catch: java.io.IOException -> L3fb
        L4f2:
            r1 = 204(0xcc, float:2.86E-43)
            if (r7 == r1) goto L4fa
            r1 = 205(0xcd, float:2.87E-43)
            if (r7 != r1) goto L506
        L4fa:
            X3.I r1 = r0.f5744j     // Catch: java.io.IOException -> L3fb
            long r1 = r1.mo505c()     // Catch: java.io.IOException -> L3fb
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L507
        L506:
            return r0
        L507:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.io.IOException -> L3fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3fb
            r2.<init>()     // Catch: java.io.IOException -> L3fb
            java.lang.String r3 = "HTTP "
            r2.append(r3)     // Catch: java.io.IOException -> L3fb
            r2.append(r7)     // Catch: java.io.IOException -> L3fb
            java.lang.String r3 = " had non-zero Content-Length: "
            r2.append(r3)     // Catch: java.io.IOException -> L3fb
            X3.I r0 = r0.f5744j     // Catch: java.io.IOException -> L3fb
            long r3 = r0.mo505c()     // Catch: java.io.IOException -> L3fb
            r2.append(r3)     // Catch: java.io.IOException -> L3fb
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L3fb
            r1.<init>(r0)     // Catch: java.io.IOException -> L3fb
            throw r1     // Catch: java.io.IOException -> L3fb
        L52c:
            if (r5 == 0) goto L532
            p179i4.AbstractC2352g.m4193f(r5, r0)
            throw r5
        L532:
            throw r0
        L533:
            throw r0
        L534:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p144c4.C1912b.mo1903a(c4.g):X3.F");
    }
}
