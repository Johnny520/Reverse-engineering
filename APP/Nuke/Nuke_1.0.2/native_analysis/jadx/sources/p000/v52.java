package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 {

    /* JADX INFO: renamed from: a */
    public final s52 f11697a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11698b;

    /* JADX INFO: renamed from: c */
    public final int f11699c;

    /* JADX INFO: renamed from: d */
    public final f90 f11700d;

    /* JADX INFO: renamed from: e */
    public final k82 f11701e;

    /* JADX INFO: renamed from: f */
    public final int f11702f;

    /* JADX INFO: renamed from: g */
    public final int f11703g;

    /* JADX INFO: renamed from: h */
    public final int f11704h;

    /* JADX INFO: renamed from: i */
    public final gd3 f11705i;

    /* JADX INFO: renamed from: j */
    public final C0102cq f11706j;

    /* JADX INFO: renamed from: k */
    public final C0485n4 f11707k;

    /* JADX INFO: renamed from: l */
    public final C0700sn f11708l;

    /* JADX INFO: renamed from: m */
    public final na0 f11709m;

    /* JADX INFO: renamed from: n */
    public final HostnameVerifier f11710n;

    /* JADX INFO: renamed from: o */
    public final Proxy f11711o;

    /* JADX INFO: renamed from: p */
    public final gd3 f11712p;

    /* JADX INFO: renamed from: q */
    public final ProxySelector f11713q;

    /* JADX INFO: renamed from: r */
    public final boolean f11714r;

    /* JADX INFO: renamed from: s */
    public final SocketFactory f11715s;

    /* JADX INFO: renamed from: t */
    public final SSLSocketFactory f11716t;

    /* JADX INFO: renamed from: u */
    public final X509TrustManager f11717u;

    /* JADX INFO: renamed from: v */
    public final up0 f11718v;

    /* JADX INFO: renamed from: w */
    public int f11719w;

    public v52(s52 s52Var, ArrayList arrayList, int i, f90 f90Var, k82 k82Var, int i2, int i3, int i4, gd3 gd3Var, C0102cq c0102cq, C0485n4 c0485n4, C0700sn c0700sn, na0 na0Var, HostnameVerifier hostnameVerifier, Proxy proxy, gd3 gd3Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, up0 up0Var) {
        gd3Var.getClass();
        c0102cq.getClass();
        c0485n4.getClass();
        c0700sn.getClass();
        na0Var.getClass();
        hostnameVerifier.getClass();
        gd3Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.f11697a = s52Var;
        this.f11698b = arrayList;
        this.f11699c = i;
        this.f11700d = f90Var;
        this.f11701e = k82Var;
        this.f11702f = i2;
        this.f11703g = i3;
        this.f11704h = i4;
        this.f11705i = gd3Var;
        this.f11706j = c0102cq;
        this.f11707k = c0485n4;
        this.f11708l = c0700sn;
        this.f11709m = na0Var;
        this.f11710n = hostnameVerifier;
        this.f11711o = proxy;
        this.f11712p = gd3Var2;
        this.f11713q = proxySelector;
        this.f11714r = z;
        this.f11715s = socketFactory;
        this.f11716t = sSLSocketFactory;
        this.f11717u = x509TrustManager;
        this.f11718v = up0Var;
    }

    /* JADX INFO: renamed from: a */
    public static v52 m5623a(v52 v52Var, int i, f90 f90Var, k82 k82Var, int i2) {
        int i3 = (i2 & 1) != 0 ? v52Var.f11699c : i;
        f90 f90Var2 = (i2 & 2) != 0 ? v52Var.f11700d : f90Var;
        k82 k82Var2 = (i2 & 4) != 0 ? v52Var.f11701e : k82Var;
        int i4 = v52Var.f11702f;
        int i5 = v52Var.f11703g;
        int i6 = v52Var.f11704h;
        gd3 gd3Var = v52Var.f11705i;
        C0102cq c0102cq = v52Var.f11706j;
        C0485n4 c0485n4 = v52Var.f11707k;
        C0700sn c0700sn = v52Var.f11708l;
        na0 na0Var = v52Var.f11709m;
        HostnameVerifier hostnameVerifier = v52Var.f11710n;
        Proxy proxy = v52Var.f11711o;
        gd3 gd3Var2 = v52Var.f11712p;
        ProxySelector proxySelector = v52Var.f11713q;
        boolean z = v52Var.f11714r;
        SocketFactory socketFactory = v52Var.f11715s;
        SSLSocketFactory sSLSocketFactory = v52Var.f11716t;
        X509TrustManager x509TrustManager = v52Var.f11717u;
        up0 up0Var = v52Var.f11718v;
        k82Var2.getClass();
        gd3Var.getClass();
        c0102cq.getClass();
        c0485n4.getClass();
        c0700sn.getClass();
        na0Var.getClass();
        hostnameVerifier.getClass();
        gd3Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new v52(v52Var.f11697a, v52Var.f11698b, i3, f90Var2, k82Var2, i4, i5, i6, gd3Var, c0102cq, c0485n4, c0700sn, na0Var, hostnameVerifier, proxy, gd3Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, up0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x06e0 A[PHI: r19
  0x06e0: PHI (r19v3 p92) = (r19v2 p92), (r19v4 p92) binds: [B:283:0x06c6, B:286:0x06d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07d0 A[Catch: IOException -> 0x06e3, TryCatch #7 {IOException -> 0x06e3, blocks: (B:285:0x06c9, B:287:0x06d2, B:291:0x06e6, B:300:0x070d, B:302:0x0716, B:303:0x071f, B:304:0x0738, B:309:0x074b, B:315:0x0759, B:316:0x0760, B:318:0x0763, B:321:0x076c, B:326:0x0777, B:328:0x07b0, B:330:0x07c1, B:333:0x07ca, B:340:0x07e3, B:356:0x0825, B:357:0x0849, B:335:0x07d0, B:327:0x0799), top: B:376:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07e3 A[Catch: IOException -> 0x06e3, TRY_LEAVE, TryCatch #7 {IOException -> 0x06e3, blocks: (B:285:0x06c9, B:287:0x06d2, B:291:0x06e6, B:300:0x070d, B:302:0x0716, B:303:0x071f, B:304:0x0738, B:309:0x074b, B:315:0x0759, B:316:0x0760, B:318:0x0763, B:321:0x076c, B:326:0x0777, B:328:0x07b0, B:330:0x07c1, B:333:0x07ca, B:340:0x07e3, B:356:0x0825, B:357:0x0849, B:335:0x07d0, B:327:0x0799), top: B:376:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x080a  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r92 m5624b(k82 k82Var) throws Throwable {
        Object obj;
        f90 f90Var;
        C0969zo c0969zo;
        boolean z;
        p92 p92VarM1592f;
        IOException iOException;
        p92 p92Var;
        r92 r92VarM3830a;
        xg0 iv0Var;
        ArrayList arrayList;
        boolean z2;
        js0 js0Var;
        ArrayList arrayList2;
        Object obj2;
        ArrayList arrayList3;
        s52 s52Var;
        List list;
        boolean z3;
        boolean z4;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C0102cq c0102cq;
        f90 f90Var2 = this.f11700d;
        k82Var.getClass();
        int i = this.f11699c;
        ArrayList arrayList4 = this.f11698b;
        if (i >= arrayList4.size()) {
            C0676s.m4653l("Check failed.");
            return null;
        }
        this.f11719w++;
        if (f90Var2 != null) {
            x52 x52VarMo2187i = ((yg0) f90Var2.f2864c).mo2187i();
            yw0 yw0Var = k82Var.f5390a;
            x52VarMo2187i.getClass();
            yw0Var.getClass();
            yw0 yw0Var2 = x52VarMo2187i.f12827i.f8739i;
            if (yw0Var.f13645e != yw0Var2.f13645e || !t11.m5086l(yw0Var.f13644d, yw0Var2.f13644d)) {
                c80.m666i(arrayList4.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.f11719w != 1) {
                c80.m666i(arrayList4.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        v52 v52VarM5623a = m5623a(this, i2, null, k82Var, 2097146);
        C0969zo c0969zo2 = (C0969zo) arrayList4.get(i);
        switch (c0969zo2.f13992a) {
            case 0:
                obj = " must call proceed() exactly once";
                f90Var = f90Var2;
                c0969zo = c0969zo2;
                ArrayList arrayList5 = arrayList4;
                f90 f90Var3 = v52VarM5623a.f11700d;
                f90Var3.getClass();
                k82 k82Var2 = v52VarM5623a.f11701e;
                o82 o82Var = k82Var2.f5393d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z5 = fg1.m1617I(k82Var2.f5391b) && o82Var != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(k82Var2.f5392c.m2557a("Connection"));
                try {
                    try {
                        ((s52) f90Var3.f2863b).f9916k.getClass();
                        ((xg0) f90Var3.f2865d).mo2397b(k82Var2);
                        ((s52) f90Var3.f2863b).f9916k.getClass();
                    } catch (IOException e) {
                        ((s52) f90Var3.f2863b).f9916k.getClass();
                        f90Var3.m1593g(e);
                        throw e;
                    }
                    break;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    p92VarM1592f = null;
                }
                try {
                    if (z5) {
                        if ("100-continue".equalsIgnoreCase(k82Var2.f5392c.m2557a("Expect"))) {
                            try {
                                ((xg0) f90Var3.f2865d).mo2400e();
                                p92 p92VarM1592f2 = f90Var3.m1592f(true);
                                try {
                                    ((s52) f90Var3.f2863b).f9916k.getClass();
                                    p92VarM1592f = p92VarM1592f2;
                                    z = false;
                                } catch (IOException e3) {
                                    e = e3;
                                    p92VarM1592f = p92VarM1592f2;
                                    z = true;
                                    if (!(e instanceof C0712sy) || !f90Var3.f2862a) {
                                        throw e;
                                    }
                                    iOException = e;
                                }
                            } catch (IOException e4) {
                                ((s52) f90Var3.f2863b).f9916k.getClass();
                                f90Var3.m1593g(e4);
                                throw e4;
                            }
                        } else {
                            z = true;
                            p92VarM1592f = null;
                        }
                        if (p92VarM1592f == null) {
                            o82Var.getClass();
                            o82 o82Var2 = k82Var2.f5393d;
                            o82Var2.getClass();
                            long jMo3042a = o82Var2.mo3042a();
                            ((s52) f90Var3.f2863b).f9916k.getClass();
                            n52 n52Var = new n52(new ug0(f90Var3, ((xg0) f90Var3.f2865d).mo2404i(k82Var2, jMo3042a), jMo3042a, false));
                            o82Var.mo3044d(n52Var);
                            n52Var.close();
                        } else {
                            ((s52) f90Var3.f2863b).m4735k(f90Var3, true, false, false, false, null);
                            if (!(f90Var3.m1589c().f10569i != null)) {
                                ((xg0) f90Var3.f2865d).mo2402g().mo4628h();
                            }
                        }
                    } else {
                        ((s52) f90Var3.f2863b).m4735k(f90Var3, true, false, false, false, null);
                        z = true;
                        p92VarM1592f = null;
                    }
                    try {
                        ((xg0) f90Var3.f2865d).mo2398c();
                        iOException = null;
                    } catch (IOException e5) {
                        ((s52) f90Var3.f2863b).f9916k.getClass();
                        f90Var3.m1593g(e5);
                        throw e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    if (!(e instanceof C0712sy)) {
                        throw e;
                    }
                    throw e;
                }
                if (p92VarM1592f == null) {
                    try {
                        p92VarM1592f = f90Var3.m1592f(false);
                        p92VarM1592f.getClass();
                        if (z) {
                            ((s52) f90Var3.f2863b).f9916k.getClass();
                            p92Var = p92VarM1592f;
                            z = false;
                        } else {
                            p92Var = p92VarM1592f;
                        }
                        p92Var.f8044a = k82Var2;
                        p92Var.f8048e = f90Var3.m1589c().f10566f;
                        p92Var.f8055l = jCurrentTimeMillis;
                        p92Var.f8056m = System.currentTimeMillis();
                        r92 r92VarM3830a2 = p92Var.m3830a();
                        int i3 = r92VarM3830a2.f9459k;
                        while (true) {
                            if (i3 != 100 && (102 > i3 || i3 >= 200)) {
                            }
                            p92 p92VarM1592f3 = f90Var3.m1592f(false);
                            p92VarM1592f3.getClass();
                            if (z) {
                                ((s52) f90Var3.f2863b).f9916k.getClass();
                            }
                            p92VarM1592f3.f8044a = k82Var2;
                            p92VarM1592f3.f8048e = f90Var3.m1589c().f10566f;
                            p92VarM1592f3.f8055l = jCurrentTimeMillis;
                            p92VarM1592f3.f8056m = System.currentTimeMillis();
                            r92VarM3830a2 = p92VarM1592f3.m3830a();
                            i3 = r92VarM3830a2.f9459k;
                        }
                        boolean z6 = false;
                        ((s52) f90Var3.f2863b).f9916k.getClass();
                        boolean z7 = i3 == 101;
                        if (z7) {
                            if (f90Var3.m1589c().f10569i != null) {
                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                            }
                        }
                        if (z7) {
                            String strM2557a = r92VarM3830a2.f9461m.m2557a("Connection");
                            if (strM2557a == null) {
                                strM2557a = null;
                            }
                            if ("upgrade".equalsIgnoreCase(strM2557a)) {
                                z6 = true;
                            }
                        }
                        if (zEqualsIgnoreCase && z6) {
                            p92 p92VarM4416b = r92VarM3830a2.m4416b();
                            p92VarM4416b.f8050g = new h83(r92VarM3830a2.f9462n.mo274e(), r92VarM3830a2.f9462n.mo273c());
                            p92VarM4416b.f8051h = f90Var3.m1594h();
                            r92VarM3830a = p92VarM4416b.m3830a();
                        } else {
                            w52 w52VarM1591e = f90Var3.m1591e(r92VarM3830a2);
                            p92 p92VarM4416b2 = r92VarM3830a2.m4416b();
                            p92VarM4416b2.f8050g = w52VarM1591e;
                            p92VarM4416b2.f8058o = new C0953z8(10);
                            r92VarM3830a = p92VarM4416b2.m3830a();
                        }
                        k82 k82Var3 = r92VarM3830a.f9456h;
                        k82Var3.getClass();
                        if ("close".equalsIgnoreCase(k82Var3.f5392c.m2557a("Connection"))) {
                            ((xg0) f90Var3.f2865d).mo2402g().mo4628h();
                            if (i3 == 204) {
                                arrayList = arrayList5;
                                if (i3 == 205) {
                                    arrayList = arrayList5;
                                    if (r92VarM3830a.f9462n.mo273c() > 0) {
                                        throw new ProtocolException("HTTP " + i3 + " had non-zero Content-Length: " + r92VarM3830a.f9462n.mo273c());
                                    }
                                }
                            }
                        } else {
                            String strM2557a2 = r92VarM3830a.f9461m.m2557a("Connection");
                            if (strM2557a2 == null) {
                                strM2557a2 = null;
                            }
                            if ("close".equalsIgnoreCase(strM2557a2)) {
                            }
                            if (i3 == 204) {
                            }
                        }
                    } catch (IOException e7) {
                        if (iOException == null) {
                            throw e7;
                        }
                        fg1.m1638m(iOException, e7);
                        throw iOException;
                    }
                }
                if (r92VarM3830a != null) {
                    throw new NullPointerException("interceptor " + c0969zo + " returned null");
                }
                if (f90Var == null || i2 >= arrayList.size() || v52VarM5623a.f11719w == 1) {
                    return r92VarM3830a;
                }
                c80.m666i(c0969zo, obj);
                return null;
            case 1:
                obj = " must call proceed() exactly once";
                f90Var = f90Var2;
                c0969zo = c0969zo2;
                ArrayList arrayList6 = arrayList4;
                s52 s52Var2 = v52VarM5623a.f11697a;
                synchronized (s52Var2) {
                    if (!s52Var2.f9928w) {
                        throw new IllegalStateException("released");
                    }
                    if (s52Var2.f9925t || s52Var2.f9924s || s52Var2.f9927v || s52Var2.f9926u) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                yg0 yg0Var = s52Var2.f9920o;
                yg0Var.getClass();
                t52 t52VarMo2186e = yg0Var.mo2186e();
                et1 et1Var = s52Var2.f9913h;
                t52VarMo2186e.getClass();
                et1Var.getClass();
                int i4 = v52VarM5623a.f11703g;
                C0043b5 c0043b5 = t52VarMo2186e.f10568h;
                qv0 qv0Var = t52VarMo2186e.f10569i;
                if (qv0Var != null) {
                    iv0Var = new rv0(et1Var, t52VarMo2186e, v52VarM5623a, qv0Var);
                } else {
                    t52VarMo2186e.f10565e.setSoTimeout(i4);
                    ((o52) c0043b5.f563j).f7529h.mo889a().mo3228g(i4);
                    ((n52) c0043b5.f564k).f7010h.mo1174a().mo3228g(v52VarM5623a.f11704h);
                    iv0Var = new iv0(et1Var, t52VarMo2186e, c0043b5);
                }
                f90 f90Var4 = new f90(s52Var2, yg0Var, iv0Var);
                s52Var2.f9923r = f90Var4;
                s52Var2.f9930y = f90Var4;
                synchronized (s52Var2) {
                    s52Var2.f9924s = true;
                    s52Var2.f9925t = true;
                }
                if (s52Var2.f9929x) {
                    c80.m678v("Canceled");
                    r92VarM3830a = null;
                    arrayList = arrayList6;
                } else {
                    r92VarM3830a = m5623a(v52VarM5623a, 0, f90Var4, null, 2097149).m5624b(v52VarM5623a.f11701e);
                    arrayList = arrayList6;
                }
                if (r92VarM3830a != null) {
                }
                break;
            case 2:
                f90Var = f90Var2;
                arrayList = arrayList4;
                C0700sn c0700sn = v52VarM5623a.f11708l;
                k82 k82Var4 = v52VarM5623a.f11701e;
                C0093cj c0093cjM2615a = k82Var4.m2615a();
                obj = " must call proceed() exactly once";
                yw0 yw0Var3 = k82Var4.f5390a;
                c0969zo = c0969zo2;
                js0 js0Var2 = k82Var4.f5392c;
                o82 o82Var3 = k82Var4.f5393d;
                if (o82Var3 != null) {
                    vf1 vf1VarMo3043b = o82Var3.mo3043b();
                    if (vf1VarMo3043b != null) {
                        c0093cjM2615a.m837l("Content-Type", vf1VarMo3043b.f11928a);
                    }
                    long jMo3042a2 = o82Var3.mo3042a();
                    if (jMo3042a2 != -1) {
                        c0093cjM2615a.m837l("Content-Length", String.valueOf(jMo3042a2));
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Transfer-Encoding");
                    } else {
                        c0093cjM2615a.m837l("Transfer-Encoding", "chunked");
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Content-Length");
                    }
                }
                if (js0Var2.m2557a("Host") == null) {
                    c0093cjM2615a.m837l("Host", wg3.m5895h(yw0Var3, false));
                }
                if (js0Var2.m2557a("Connection") == null) {
                    c0093cjM2615a.m837l("Connection", "Keep-Alive");
                }
                if (js0Var2.m2557a("Accept-Encoding") == null && js0Var2.m2557a("Range") == null) {
                    c0093cjM2615a.m837l("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0700sn.getClass();
                yw0Var3.getClass();
                if (js0Var2.m2557a("User-Agent") == null) {
                    c0093cjM2615a.m837l("User-Agent", "okhttp/5.4.0");
                }
                k82 k82Var5 = new k82(c0093cjM2615a);
                r92 r92VarM5624b = v52VarM5623a.m5624b(k82Var5);
                js0 js0Var3 = r92VarM5624b.f9461m;
                sw0.m5007b(c0700sn, k82Var5.f5390a, js0Var3);
                p92 p92VarM4416b3 = r92VarM5624b.m4416b();
                p92VarM4416b3.f8044a = k82Var5;
                if (z2) {
                    String strM2557a3 = js0Var3.m2557a("Content-Encoding");
                    if (strM2557a3 == null) {
                        strM2557a3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM2557a3) && sw0.m5006a(r92VarM5624b)) {
                        or0 or0Var = new or0(r92VarM5624b.f9462n.mo275g());
                        ye0 ye0VarM2559c = js0Var3.m2559c();
                        ye0VarM2559c.m6262n("Content-Encoding");
                        ye0VarM2559c.m6262n("Content-Length");
                        p92VarM4416b3.f8049f = ye0VarM2559c.m6250b().m2559c();
                        String strM2557a4 = js0Var3.m2557a("Content-Type");
                        if (strM2557a4 == null) {
                            strM2557a4 = null;
                        }
                        p92VarM4416b3.f8050g = new w52(strM2557a4, -1L, new o52(or0Var));
                    }
                }
                r92VarM3830a = p92VarM4416b3.m3830a();
                if (r92VarM3830a != null) {
                }
                break;
            case 3:
                f90Var = f90Var2;
                ArrayList arrayList7 = arrayList4;
                System.currentTimeMillis();
                k82 k82Var6 = v52VarM5623a.f11701e;
                int i5 = 4;
                sz0 sz0Var = new sz0(i5, k82Var6, null);
                C0550oo c0550ooM792Q = k82Var6.f5395f;
                if (c0550ooM792Q == null) {
                    int i6 = C0550oo.f7737n;
                    c0550ooM792Q = ci0.m792Q(k82Var6.f5392c);
                    k82Var6.f5395f = c0550ooM792Q;
                }
                if (c0550ooM792Q.f7747j) {
                    Object obj3 = null;
                    sz0Var = new sz0(i5, obj3, obj3);
                }
                k82 k82Var7 = (k82) sz0Var.f10436i;
                r92 r92Var = (r92) sz0Var.f10437j;
                if (k82Var7 == null && r92Var == null) {
                    r92 r92Var2 = new r92(v52VarM5623a.f11701e, c42.f1138k, "Unsatisfiable Request (only-if-cached)", 504, null, new js0((String[]) new ArrayList(20).toArray(new String[0])), u92.f11170i, null, null, null, null, -1L, System.currentTimeMillis(), null, e33.f2303g);
                    v52VarM5623a.f11697a.f9916k.getClass();
                    r92VarM3830a = r92Var2;
                    arrayList2 = arrayList7;
                } else if (k82Var7 == null) {
                    r92Var.getClass();
                    p92 p92VarM4416b4 = r92Var.m4416b();
                    r92 r92VarM1011f = df3.m1011f(r92Var);
                    p92.m3829b("cacheResponse", r92VarM1011f);
                    p92VarM4416b4.f8053j = r92VarM1011f;
                    r92VarM3830a = p92VarM4416b4.m3830a();
                    v52VarM5623a.f11697a.f9916k.getClass();
                    arrayList2 = arrayList7;
                } else {
                    if (r92Var != null) {
                        v52VarM5623a.f11697a.f9916k.getClass();
                    }
                    r92 r92VarM5624b2 = v52VarM5623a.m5624b(k82Var7);
                    if (r92Var != null) {
                        if (r92VarM5624b2.f9459k == 304) {
                            p92 p92VarM4416b5 = r92Var.m4416b();
                            js0 js0Var4 = r92Var.f9461m;
                            js0 js0Var5 = r92VarM5624b2.f9461m;
                            ArrayList arrayList8 = new ArrayList(20);
                            int size = js0Var4.size();
                            int i7 = 0;
                            while (i7 < size) {
                                String strM2558b = js0Var4.m2558b(i7);
                                String strM2560d = js0Var4.m2560d(i7);
                                if ("Warning".equalsIgnoreCase(strM2558b)) {
                                    js0Var = js0Var4;
                                    if (wv2.m6012d0(strM2560d, "1", false)) {
                                    }
                                    i7++;
                                    js0Var4 = js0Var;
                                } else {
                                    js0Var = js0Var4;
                                }
                                if ("Content-Length".equalsIgnoreCase(strM2558b) || "Content-Encoding".equalsIgnoreCase(strM2558b) || "Content-Type".equalsIgnoreCase(strM2558b) || !op0.m3595r(strM2558b) || js0Var5.m2557a(strM2558b) == null) {
                                    arrayList8.add(strM2558b);
                                    arrayList8.add(pv2.m3993I0(strM2560d).toString());
                                }
                                i7++;
                                js0Var4 = js0Var;
                            }
                            int size2 = js0Var5.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                String strM2558b2 = js0Var5.m2558b(i8);
                                if (!"Content-Length".equalsIgnoreCase(strM2558b2) && !"Content-Encoding".equalsIgnoreCase(strM2558b2) && !"Content-Type".equalsIgnoreCase(strM2558b2) && op0.m3595r(strM2558b2)) {
                                    String strM2560d2 = js0Var5.m2560d(i8);
                                    arrayList8.add(strM2558b2);
                                    arrayList8.add(pv2.m3993I0(strM2560d2).toString());
                                }
                            }
                            p92VarM4416b5.f8049f = new js0((String[]) arrayList8.toArray(new String[0])).m2559c();
                            p92VarM4416b5.f8055l = r92VarM5624b2.f9467s;
                            p92VarM4416b5.f8056m = r92VarM5624b2.f9468t;
                            r92 r92VarM1011f2 = df3.m1011f(r92Var);
                            p92.m3829b("cacheResponse", r92VarM1011f2);
                            p92VarM4416b5.f8053j = r92VarM1011f2;
                            r92 r92VarM1011f3 = df3.m1011f(r92VarM5624b2);
                            p92.m3829b("networkResponse", r92VarM1011f3);
                            p92VarM4416b5.f8052i = r92VarM1011f3;
                            p92VarM4416b5.m3830a();
                            r92VarM5624b2.f9462n.close();
                            throw null;
                        }
                        ug3.m5494b(r92Var.f9462n);
                    }
                    p92 p92VarM4416b6 = r92VarM5624b2.m4416b();
                    r92 r92VarM1011f4 = r92Var != null ? df3.m1011f(r92Var) : null;
                    p92.m3829b("cacheResponse", r92VarM1011f4);
                    p92VarM4416b6.f8053j = r92VarM1011f4;
                    r92 r92VarM1011f5 = df3.m1011f(r92VarM5624b2);
                    p92.m3829b("networkResponse", r92VarM1011f5);
                    p92VarM4416b6.f8052i = r92VarM1011f5;
                    r92VarM3830a = p92VarM4416b6.m3830a();
                    arrayList2 = arrayList7;
                }
                obj = " must call proceed() exactly once";
                c0969zo = c0969zo2;
                arrayList = arrayList2;
                if (r92VarM3830a != null) {
                }
                break;
            default:
                k82 k82Var8 = v52VarM5623a.f11701e;
                s52 s52Var3 = v52VarM5623a.f11697a;
                r92 r92Var3 = null;
                List listM1169y0 = be0.f819h;
                int i9 = 0;
                k82 k82VarM6476a = k82Var8;
                boolean z8 = true;
                while (s52Var3.f9923r == null) {
                    synchronized (s52Var3) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            obj2 = s52Var3;
                        }
                        try {
                            if (s52Var3.f9925t) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (s52Var3.f9924s || s52Var3.f9927v || s52Var3.f9926u) {
                                throw new IllegalStateException("Check failed.");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = arrayList4;
                            throw th;
                        }
                    }
                    if (z8) {
                        et1 et1Var2 = s52Var3.f9913h;
                        iy2 iy2Var = et1Var2.f2598D;
                        ud0 ud0Var = (ud0) v52VarM5623a.f11707k.f6983i;
                        int i10 = v52VarM5623a.f11703g;
                        int i11 = v52VarM5623a.f11704h;
                        int i12 = v52VarM5623a.f11702f;
                        boolean z9 = v52VarM5623a.f11714r;
                        boolean z10 = et1Var2.f2605f;
                        yw0 yw0Var4 = k82VarM6476a.f5390a;
                        yw0Var4.getClass();
                        f90Var = f90Var2;
                        arrayList3 = arrayList4;
                        if (t11.m5086l(yw0Var4.f13641a, "https")) {
                            SSLSocketFactory sSLSocketFactory2 = v52VarM5623a.f11716t;
                            HostnameVerifier hostnameVerifier2 = v52VarM5623a.f11710n;
                            c0102cq = v52VarM5623a.f11706j;
                            hostnameVerifier = hostnameVerifier2;
                            sSLSocketFactory = sSLSocketFactory2;
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            c0102cq = null;
                        }
                        String str = yw0Var4.f13644d;
                        int i13 = yw0Var4.f13645e;
                        na0 na0Var = v52VarM5623a.f11709m;
                        SocketFactory socketFactory = v52VarM5623a.f11715s;
                        gd3 gd3Var = v52VarM5623a.f11712p;
                        Proxy proxy = v52VarM5623a.f11711o;
                        et1 et1Var3 = v52VarM5623a.f11697a.f9913h;
                        s52 s52Var4 = s52Var3;
                        k82 k82Var9 = k82VarM6476a;
                        list = listM1169y0;
                        x52 x52Var = new x52(iy2Var, ud0Var, i10, i11, i12, i10, z9, z10, new C0605q5(str, i13, na0Var, socketFactory, sSLSocketFactory, hostnameVerifier, c0102cq, gd3Var, proxy, et1Var3.f2618s, et1Var3.f2617r, v52VarM5623a.f11713q), s52Var3.f9913h.f2597C, s52Var4, k82Var9);
                        s52Var = s52Var4;
                        k82VarM6476a = k82Var9;
                        et1 et1Var4 = s52Var.f9913h;
                        s52Var.f9920o = et1Var4.f2605f ? new yh0(x52Var, et1Var4.f2598D) : new hh1(12, x52Var);
                    } else {
                        f90Var = f90Var2;
                        arrayList3 = arrayList4;
                        s52Var = s52Var3;
                        list = listM1169y0;
                    }
                    try {
                        if (s52Var.f9929x) {
                            throw new IOException("Canceled");
                        }
                        try {
                            p92 p92VarM4416b7 = v52VarM5623a.m5624b(k82VarM6476a).m4416b();
                            p92VarM4416b7.f8044a = k82VarM6476a;
                            p92VarM4416b7.f8054k = r92Var3 != null ? df3.m1011f(r92Var3) : null;
                            r92VarM3830a = p92VarM4416b7.m3830a();
                            k82VarM6476a = C0969zo.m6476a(r92VarM3830a, s52Var.f9923r, v52VarM5623a);
                        } catch (IOException e8) {
                            boolean zM6477b = C0969zo.m6477b(e8, s52Var, v52VarM5623a, k82VarM6476a);
                            s52Var.f9916k.getClass();
                            if (!zM6477b) {
                                byte[] bArr = ug3.f11300a;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    fg1.m1638m(e8, (Exception) it.next());
                                }
                                throw e8;
                            }
                            listM1169y0 = AbstractC0142du.m1169y0(list, e8);
                            s52Var.m4733i(true);
                            s52Var3 = s52Var;
                            f90Var2 = f90Var;
                            arrayList4 = arrayList3;
                            z8 = false;
                        }
                        try {
                            if (k82VarM6476a == null) {
                                s52Var.f9916k.getClass();
                                z4 = false;
                            } else {
                                o82 o82Var4 = k82VarM6476a.f5393d;
                                if (o82Var4 == null || !o82Var4.mo3540c()) {
                                    ug3.m5494b(r92VarM3830a.f9462n);
                                    int i14 = i9 + 1;
                                    kg0 kg0Var = s52Var.f9916k;
                                    if (i14 > 20) {
                                        kg0Var.getClass();
                                        throw new ProtocolException("Too many follow-up requests: " + i14);
                                    }
                                    kg0Var.getClass();
                                    s52Var.m4733i(true);
                                    r92Var3 = r92VarM3830a;
                                    listM1169y0 = list;
                                    s52Var3 = s52Var;
                                    i9 = i14;
                                    f90Var2 = f90Var;
                                    arrayList4 = arrayList3;
                                    z8 = true;
                                } else {
                                    s52Var.f9916k.getClass();
                                    z4 = false;
                                }
                            }
                            s52Var.m4733i(z4);
                            arrayList2 = arrayList3;
                            obj = " must call proceed() exactly once";
                            c0969zo = c0969zo2;
                            arrayList = arrayList2;
                            if (r92VarM3830a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z3 = false;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = true;
                    }
                    s52Var.m4733i(z3);
                    throw th;
                }
                f90Var = f90Var2;
                arrayList2 = arrayList4;
                C0676s.m4653l("Check failed.");
                r92VarM3830a = null;
                obj = " must call proceed() exactly once";
                c0969zo = c0969zo2;
                arrayList = arrayList2;
                if (r92VarM3830a != null) {
                }
                break;
        }
    }
}
