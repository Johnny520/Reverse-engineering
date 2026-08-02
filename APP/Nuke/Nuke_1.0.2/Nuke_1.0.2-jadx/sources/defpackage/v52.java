package defpackage;

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
    public final s52 a;
    public final ArrayList b;
    public final int c;
    public final f90 d;
    public final k82 e;
    public final int f;
    public final int g;
    public final int h;
    public final gd3 i;
    public final cq j;
    public final n4 k;
    public final sn l;
    public final na0 m;
    public final HostnameVerifier n;
    public final Proxy o;
    public final gd3 p;
    public final ProxySelector q;
    public final boolean r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final up0 v;
    public int w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v52(s52 s52Var, ArrayList arrayList, int i, f90 f90Var, k82 k82Var, int i2, int i3, int i4, gd3 gd3Var, cq cqVar, n4 n4Var, sn snVar, na0 na0Var, HostnameVerifier hostnameVerifier, Proxy proxy, gd3 gd3Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, up0 up0Var) {
        gd3Var.getClass();
        cqVar.getClass();
        n4Var.getClass();
        snVar.getClass();
        na0Var.getClass();
        hostnameVerifier.getClass();
        gd3Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = s52Var;
        this.b = arrayList;
        this.c = i;
        this.d = f90Var;
        this.e = k82Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = gd3Var;
        this.j = cqVar;
        this.k = n4Var;
        this.l = snVar;
        this.m = na0Var;
        this.n = hostnameVerifier;
        this.o = proxy;
        this.p = gd3Var2;
        this.q = proxySelector;
        this.r = z;
        this.s = socketFactory;
        this.t = sSLSocketFactory;
        this.u = x509TrustManager;
        this.v = up0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static v52 a(v52 v52Var, int i, f90 f90Var, k82 k82Var, int i2) {
        int i3 = (i2 & 1) != 0 ? v52Var.c : i;
        f90 f90Var2 = (i2 & 2) != 0 ? v52Var.d : f90Var;
        k82 k82Var2 = (i2 & 4) != 0 ? v52Var.e : k82Var;
        int i4 = v52Var.f;
        int i5 = v52Var.g;
        int i6 = v52Var.h;
        gd3 gd3Var = v52Var.i;
        cq cqVar = v52Var.j;
        n4 n4Var = v52Var.k;
        sn snVar = v52Var.l;
        na0 na0Var = v52Var.m;
        HostnameVerifier hostnameVerifier = v52Var.n;
        Proxy proxy = v52Var.o;
        gd3 gd3Var2 = v52Var.p;
        ProxySelector proxySelector = v52Var.q;
        boolean z = v52Var.r;
        SocketFactory socketFactory = v52Var.s;
        SSLSocketFactory sSLSocketFactory = v52Var.t;
        X509TrustManager x509TrustManager = v52Var.u;
        up0 up0Var = v52Var.v;
        k82Var2.getClass();
        gd3Var.getClass();
        cqVar.getClass();
        n4Var.getClass();
        snVar.getClass();
        na0Var.getClass();
        hostnameVerifier.getClass();
        gd3Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new v52(v52Var.a, v52Var.b, i3, f90Var2, k82Var2, i4, i5, i6, gd3Var, cqVar, n4Var, snVar, na0Var, hostnameVerifier, proxy, gd3Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, up0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:398:0x007d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:400:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06e0 A[PHI: r19
  0x06e0: PHI (r19v3 p92) = (r19v2 p92), (r19v4 p92) binds: [B:283:0x06c6, B:286:0x06d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07d0 A[Catch: IOException -> 0x06e3, TryCatch #7 {IOException -> 0x06e3, blocks: (B:285:0x06c9, B:287:0x06d2, B:291:0x06e6, B:300:0x070d, B:302:0x0716, B:303:0x071f, B:304:0x0738, B:309:0x074b, B:315:0x0759, B:316:0x0760, B:318:0x0763, B:321:0x076c, B:326:0x0777, B:328:0x07b0, B:330:0x07c1, B:333:0x07ca, B:340:0x07e3, B:356:0x0825, B:357:0x0849, B:335:0x07d0, B:327:0x0799), top: B:376:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07e3 A[Catch: IOException -> 0x06e3, TRY_LEAVE, TryCatch #7 {IOException -> 0x06e3, blocks: (B:285:0x06c9, B:287:0x06d2, B:291:0x06e6, B:300:0x070d, B:302:0x0716, B:303:0x071f, B:304:0x0738, B:309:0x074b, B:315:0x0759, B:316:0x0760, B:318:0x0763, B:321:0x076c, B:326:0x0777, B:328:0x07b0, B:330:0x07c1, B:333:0x07ca, B:340:0x07e3, B:356:0x0825, B:357:0x0849, B:335:0x07d0, B:327:0x0799), top: B:376:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x080a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r92 b(k82 k82Var) throws Throwable {
        Object obj;
        f90 f90Var;
        zo zoVar;
        boolean z;
        p92 p92VarF;
        IOException iOException;
        p92 p92Var;
        r92 r92VarA;
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
        cq cqVar;
        f90 f90Var2 = this.d;
        k82Var.getClass();
        int i = this.c;
        ArrayList arrayList4 = this.b;
        if (i >= arrayList4.size()) {
            s.l("Check failed.");
            return null;
        }
        this.w++;
        if (f90Var2 != null) {
            x52 x52VarI = ((yg0) f90Var2.c).i();
            yw0 yw0Var = k82Var.a;
            x52VarI.getClass();
            yw0Var.getClass();
            yw0 yw0Var2 = x52VarI.i.i;
            if (yw0Var.e != yw0Var2.e || !t11.l(yw0Var.d, yw0Var2.d)) {
                c80.i(arrayList4.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.w != 1) {
                c80.i(arrayList4.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        v52 v52VarA = a(this, i2, null, k82Var, 2097146);
        zo zoVar2 = (zo) arrayList4.get(i);
        switch (zoVar2.a) {
            case 0:
                obj = " must call proceed() exactly once";
                f90Var = f90Var2;
                zoVar = zoVar2;
                ArrayList arrayList5 = arrayList4;
                f90 f90Var3 = v52VarA.d;
                f90Var3.getClass();
                k82 k82Var2 = v52VarA.e;
                o82 o82Var = k82Var2.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z5 = fg1.I(k82Var2.b) && o82Var != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(k82Var2.c.a("Connection"));
                try {
                    try {
                        ((s52) f90Var3.b).k.getClass();
                        ((xg0) f90Var3.d).b(k82Var2);
                        ((s52) f90Var3.b).k.getClass();
                    } catch (IOException e) {
                        ((s52) f90Var3.b).k.getClass();
                        f90Var3.g(e);
                        throw e;
                    }
                    break;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    p92VarF = null;
                }
                try {
                    if (z5) {
                        if ("100-continue".equalsIgnoreCase(k82Var2.c.a("Expect"))) {
                            try {
                                ((xg0) f90Var3.d).e();
                                p92 p92VarF2 = f90Var3.f(true);
                                try {
                                    ((s52) f90Var3.b).k.getClass();
                                    p92VarF = p92VarF2;
                                    z = false;
                                } catch (IOException e3) {
                                    e = e3;
                                    p92VarF = p92VarF2;
                                    z = true;
                                    if (!(e instanceof sy) || !f90Var3.a) {
                                        throw e;
                                    }
                                    iOException = e;
                                }
                            } catch (IOException e4) {
                                ((s52) f90Var3.b).k.getClass();
                                f90Var3.g(e4);
                                throw e4;
                            }
                        } else {
                            z = true;
                            p92VarF = null;
                        }
                        if (p92VarF == null) {
                            o82Var.getClass();
                            o82 o82Var2 = k82Var2.d;
                            o82Var2.getClass();
                            long jA = o82Var2.a();
                            ((s52) f90Var3.b).k.getClass();
                            n52 n52Var = new n52(new ug0(f90Var3, ((xg0) f90Var3.d).i(k82Var2, jA), jA, false));
                            o82Var.d(n52Var);
                            n52Var.close();
                        } else {
                            ((s52) f90Var3.b).k(f90Var3, true, false, false, false, null);
                            if (!(f90Var3.c().i != null)) {
                                ((xg0) f90Var3.d).g().h();
                            }
                        }
                    } else {
                        ((s52) f90Var3.b).k(f90Var3, true, false, false, false, null);
                        z = true;
                        p92VarF = null;
                    }
                    try {
                        ((xg0) f90Var3.d).c();
                        iOException = null;
                    } catch (IOException e5) {
                        ((s52) f90Var3.b).k.getClass();
                        f90Var3.g(e5);
                        throw e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    if (!(e instanceof sy)) {
                        throw e;
                    }
                    throw e;
                }
                if (p92VarF == null) {
                    try {
                        p92VarF = f90Var3.f(false);
                        p92VarF.getClass();
                        if (z) {
                            ((s52) f90Var3.b).k.getClass();
                            p92Var = p92VarF;
                            z = false;
                        } else {
                            p92Var = p92VarF;
                        }
                        p92Var.a = k82Var2;
                        p92Var.e = f90Var3.c().f;
                        p92Var.l = jCurrentTimeMillis;
                        p92Var.m = System.currentTimeMillis();
                        r92 r92VarA2 = p92Var.a();
                        int i3 = r92VarA2.k;
                        while (true) {
                            if (i3 != 100 && (102 > i3 || i3 >= 200)) {
                            }
                            p92 p92VarF3 = f90Var3.f(false);
                            p92VarF3.getClass();
                            if (z) {
                                ((s52) f90Var3.b).k.getClass();
                            }
                            p92VarF3.a = k82Var2;
                            p92VarF3.e = f90Var3.c().f;
                            p92VarF3.l = jCurrentTimeMillis;
                            p92VarF3.m = System.currentTimeMillis();
                            r92VarA2 = p92VarF3.a();
                            i3 = r92VarA2.k;
                        }
                        boolean z6 = false;
                        ((s52) f90Var3.b).k.getClass();
                        boolean z7 = i3 == 101;
                        if (z7) {
                            if (f90Var3.c().i != null) {
                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                            }
                        }
                        if (z7) {
                            String strA = r92VarA2.m.a("Connection");
                            if (strA == null) {
                                strA = null;
                            }
                            if ("upgrade".equalsIgnoreCase(strA)) {
                                z6 = true;
                            }
                        }
                        if (zEqualsIgnoreCase && z6) {
                            p92 p92VarB = r92VarA2.b();
                            p92VarB.g = new h83(r92VarA2.n.e(), r92VarA2.n.c());
                            p92VarB.h = f90Var3.h();
                            r92VarA = p92VarB.a();
                        } else {
                            w52 w52VarE = f90Var3.e(r92VarA2);
                            p92 p92VarB2 = r92VarA2.b();
                            p92VarB2.g = w52VarE;
                            p92VarB2.o = new z8(10);
                            r92VarA = p92VarB2.a();
                        }
                        k82 k82Var3 = r92VarA.h;
                        k82Var3.getClass();
                        if ("close".equalsIgnoreCase(k82Var3.c.a("Connection"))) {
                            ((xg0) f90Var3.d).g().h();
                            if (i3 == 204) {
                                arrayList = arrayList5;
                                if (i3 == 205) {
                                    arrayList = arrayList5;
                                    if (r92VarA.n.c() > 0) {
                                        throw new ProtocolException("HTTP " + i3 + " had non-zero Content-Length: " + r92VarA.n.c());
                                    }
                                }
                            }
                        } else {
                            String strA2 = r92VarA.m.a("Connection");
                            if (strA2 == null) {
                                strA2 = null;
                            }
                            if ("close".equalsIgnoreCase(strA2)) {
                            }
                            if (i3 == 204) {
                            }
                        }
                    } catch (IOException e7) {
                        if (iOException == null) {
                            throw e7;
                        }
                        fg1.m(iOException, e7);
                        throw iOException;
                    }
                }
                if (r92VarA != null) {
                    throw new NullPointerException("interceptor " + zoVar + " returned null");
                }
                if (f90Var == null || i2 >= arrayList.size() || v52VarA.w == 1) {
                    return r92VarA;
                }
                c80.i(zoVar, obj);
                return null;
            case 1:
                obj = " must call proceed() exactly once";
                f90Var = f90Var2;
                zoVar = zoVar2;
                ArrayList arrayList6 = arrayList4;
                s52 s52Var2 = v52VarA.a;
                synchronized (s52Var2) {
                    if (!s52Var2.w) {
                        throw new IllegalStateException("released");
                    }
                    if (s52Var2.t || s52Var2.s || s52Var2.v || s52Var2.u) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                yg0 yg0Var = s52Var2.o;
                yg0Var.getClass();
                t52 t52VarE = yg0Var.e();
                et1 et1Var = s52Var2.h;
                t52VarE.getClass();
                et1Var.getClass();
                int i4 = v52VarA.g;
                b5 b5Var = t52VarE.h;
                qv0 qv0Var = t52VarE.i;
                if (qv0Var != null) {
                    iv0Var = new rv0(et1Var, t52VarE, v52VarA, qv0Var);
                } else {
                    t52VarE.e.setSoTimeout(i4);
                    ((o52) b5Var.j).h.a().g(i4);
                    ((n52) b5Var.k).h.a().g(v52VarA.h);
                    iv0Var = new iv0(et1Var, t52VarE, b5Var);
                }
                f90 f90Var4 = new f90(s52Var2, yg0Var, iv0Var);
                s52Var2.r = f90Var4;
                s52Var2.y = f90Var4;
                synchronized (s52Var2) {
                    s52Var2.s = true;
                    s52Var2.t = true;
                }
                if (s52Var2.x) {
                    c80.v("Canceled");
                    r92VarA = null;
                    arrayList = arrayList6;
                } else {
                    r92VarA = a(v52VarA, 0, f90Var4, null, 2097149).b(v52VarA.e);
                    arrayList = arrayList6;
                }
                if (r92VarA != null) {
                }
                break;
            case 2:
                f90Var = f90Var2;
                arrayList = arrayList4;
                sn snVar = v52VarA.l;
                k82 k82Var4 = v52VarA.e;
                cj cjVarA = k82Var4.a();
                obj = " must call proceed() exactly once";
                yw0 yw0Var3 = k82Var4.a;
                zoVar = zoVar2;
                js0 js0Var2 = k82Var4.c;
                o82 o82Var3 = k82Var4.d;
                if (o82Var3 != null) {
                    vf1 vf1VarB = o82Var3.b();
                    if (vf1VarB != null) {
                        cjVarA.l("Content-Type", vf1VarB.a);
                    }
                    long jA2 = o82Var3.a();
                    if (jA2 != -1) {
                        cjVarA.l("Content-Length", String.valueOf(jA2));
                        ((ye0) cjVarA.c).n("Transfer-Encoding");
                    } else {
                        cjVarA.l("Transfer-Encoding", "chunked");
                        ((ye0) cjVarA.c).n("Content-Length");
                    }
                }
                if (js0Var2.a("Host") == null) {
                    cjVarA.l("Host", wg3.h(yw0Var3, false));
                }
                if (js0Var2.a("Connection") == null) {
                    cjVarA.l("Connection", "Keep-Alive");
                }
                if (js0Var2.a("Accept-Encoding") == null && js0Var2.a("Range") == null) {
                    cjVarA.l("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = false;
                }
                snVar.getClass();
                yw0Var3.getClass();
                if (js0Var2.a("User-Agent") == null) {
                    cjVarA.l("User-Agent", "okhttp/5.4.0");
                }
                k82 k82Var5 = new k82(cjVarA);
                r92 r92VarB = v52VarA.b(k82Var5);
                js0 js0Var3 = r92VarB.m;
                sw0.b(snVar, k82Var5.a, js0Var3);
                p92 p92VarB3 = r92VarB.b();
                p92VarB3.a = k82Var5;
                if (z2) {
                    String strA3 = js0Var3.a("Content-Encoding");
                    if (strA3 == null) {
                        strA3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strA3) && sw0.a(r92VarB)) {
                        or0 or0Var = new or0(r92VarB.n.g());
                        ye0 ye0VarC = js0Var3.c();
                        ye0VarC.n("Content-Encoding");
                        ye0VarC.n("Content-Length");
                        p92VarB3.f = ye0VarC.b().c();
                        String strA4 = js0Var3.a("Content-Type");
                        if (strA4 == null) {
                            strA4 = null;
                        }
                        p92VarB3.g = new w52(strA4, -1L, new o52(or0Var));
                    }
                }
                r92VarA = p92VarB3.a();
                if (r92VarA != null) {
                }
                break;
            case 3:
                f90Var = f90Var2;
                ArrayList arrayList7 = arrayList4;
                System.currentTimeMillis();
                k82 k82Var6 = v52VarA.e;
                int i5 = 4;
                sz0 sz0Var = new sz0(i5, k82Var6, null);
                oo ooVarQ = k82Var6.f;
                if (ooVarQ == null) {
                    int i6 = oo.n;
                    ooVarQ = ci0.Q(k82Var6.c);
                    k82Var6.f = ooVarQ;
                }
                if (ooVarQ.j) {
                    Object obj3 = null;
                    sz0Var = new sz0(i5, obj3, obj3);
                }
                k82 k82Var7 = (k82) sz0Var.i;
                r92 r92Var = (r92) sz0Var.j;
                if (k82Var7 == null && r92Var == null) {
                    r92 r92Var2 = new r92(v52VarA.e, c42.k, "Unsatisfiable Request (only-if-cached)", 504, null, new js0((String[]) new ArrayList(20).toArray(new String[0])), u92.i, null, null, null, null, -1L, System.currentTimeMillis(), null, e33.g);
                    v52VarA.a.k.getClass();
                    r92VarA = r92Var2;
                    arrayList2 = arrayList7;
                } else if (k82Var7 == null) {
                    r92Var.getClass();
                    p92 p92VarB4 = r92Var.b();
                    r92 r92VarF = df3.f(r92Var);
                    p92.b("cacheResponse", r92VarF);
                    p92VarB4.j = r92VarF;
                    r92VarA = p92VarB4.a();
                    v52VarA.a.k.getClass();
                    arrayList2 = arrayList7;
                } else {
                    if (r92Var != null) {
                        v52VarA.a.k.getClass();
                    }
                    r92 r92VarB2 = v52VarA.b(k82Var7);
                    if (r92Var != null) {
                        if (r92VarB2.k == 304) {
                            p92 p92VarB5 = r92Var.b();
                            js0 js0Var4 = r92Var.m;
                            js0 js0Var5 = r92VarB2.m;
                            ArrayList arrayList8 = new ArrayList(20);
                            int size = js0Var4.size();
                            int i7 = 0;
                            while (i7 < size) {
                                String strB = js0Var4.b(i7);
                                String strD = js0Var4.d(i7);
                                if ("Warning".equalsIgnoreCase(strB)) {
                                    js0Var = js0Var4;
                                    if (wv2.d0(strD, "1", false)) {
                                    }
                                    i7++;
                                    js0Var4 = js0Var;
                                } else {
                                    js0Var = js0Var4;
                                }
                                if ("Content-Length".equalsIgnoreCase(strB) || "Content-Encoding".equalsIgnoreCase(strB) || "Content-Type".equalsIgnoreCase(strB) || !op0.r(strB) || js0Var5.a(strB) == null) {
                                    arrayList8.add(strB);
                                    arrayList8.add(pv2.I0(strD).toString());
                                }
                                i7++;
                                js0Var4 = js0Var;
                            }
                            int size2 = js0Var5.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                String strB2 = js0Var5.b(i8);
                                if (!"Content-Length".equalsIgnoreCase(strB2) && !"Content-Encoding".equalsIgnoreCase(strB2) && !"Content-Type".equalsIgnoreCase(strB2) && op0.r(strB2)) {
                                    String strD2 = js0Var5.d(i8);
                                    arrayList8.add(strB2);
                                    arrayList8.add(pv2.I0(strD2).toString());
                                }
                            }
                            p92VarB5.f = new js0((String[]) arrayList8.toArray(new String[0])).c();
                            p92VarB5.l = r92VarB2.s;
                            p92VarB5.m = r92VarB2.t;
                            r92 r92VarF2 = df3.f(r92Var);
                            p92.b("cacheResponse", r92VarF2);
                            p92VarB5.j = r92VarF2;
                            r92 r92VarF3 = df3.f(r92VarB2);
                            p92.b("networkResponse", r92VarF3);
                            p92VarB5.i = r92VarF3;
                            p92VarB5.a();
                            r92VarB2.n.close();
                            throw null;
                        }
                        ug3.b(r92Var.n);
                    }
                    p92 p92VarB6 = r92VarB2.b();
                    r92 r92VarF4 = r92Var != null ? df3.f(r92Var) : null;
                    p92.b("cacheResponse", r92VarF4);
                    p92VarB6.j = r92VarF4;
                    r92 r92VarF5 = df3.f(r92VarB2);
                    p92.b("networkResponse", r92VarF5);
                    p92VarB6.i = r92VarF5;
                    r92VarA = p92VarB6.a();
                    arrayList2 = arrayList7;
                }
                obj = " must call proceed() exactly once";
                zoVar = zoVar2;
                arrayList = arrayList2;
                if (r92VarA != null) {
                }
                break;
            default:
                k82 k82Var8 = v52VarA.e;
                s52 s52Var3 = v52VarA.a;
                r92 r92Var3 = null;
                List listY0 = be0.h;
                int i9 = 0;
                k82 k82VarA = k82Var8;
                boolean z8 = true;
                while (s52Var3.r == null) {
                    synchronized (s52Var3) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            obj2 = s52Var3;
                        }
                        try {
                            if (s52Var3.t) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (s52Var3.s || s52Var3.v || s52Var3.u) {
                                throw new IllegalStateException("Check failed.");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = arrayList4;
                            throw th;
                        }
                    }
                    if (z8) {
                        et1 et1Var2 = s52Var3.h;
                        iy2 iy2Var = et1Var2.D;
                        ud0 ud0Var = (ud0) v52VarA.k.i;
                        int i10 = v52VarA.g;
                        int i11 = v52VarA.h;
                        int i12 = v52VarA.f;
                        boolean z9 = v52VarA.r;
                        boolean z10 = et1Var2.f;
                        yw0 yw0Var4 = k82VarA.a;
                        yw0Var4.getClass();
                        f90Var = f90Var2;
                        arrayList3 = arrayList4;
                        if (t11.l(yw0Var4.a, "https")) {
                            SSLSocketFactory sSLSocketFactory2 = v52VarA.t;
                            HostnameVerifier hostnameVerifier2 = v52VarA.n;
                            cqVar = v52VarA.j;
                            hostnameVerifier = hostnameVerifier2;
                            sSLSocketFactory = sSLSocketFactory2;
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            cqVar = null;
                        }
                        String str = yw0Var4.d;
                        int i13 = yw0Var4.e;
                        na0 na0Var = v52VarA.m;
                        SocketFactory socketFactory = v52VarA.s;
                        gd3 gd3Var = v52VarA.p;
                        Proxy proxy = v52VarA.o;
                        et1 et1Var3 = v52VarA.a.h;
                        s52 s52Var4 = s52Var3;
                        k82 k82Var9 = k82VarA;
                        list = listY0;
                        x52 x52Var = new x52(iy2Var, ud0Var, i10, i11, i12, i10, z9, z10, new q5(str, i13, na0Var, socketFactory, sSLSocketFactory, hostnameVerifier, cqVar, gd3Var, proxy, et1Var3.s, et1Var3.r, v52VarA.q), s52Var3.h.C, s52Var4, k82Var9);
                        s52Var = s52Var4;
                        k82VarA = k82Var9;
                        et1 et1Var4 = s52Var.h;
                        s52Var.o = et1Var4.f ? new yh0(x52Var, et1Var4.D) : new hh1(12, x52Var);
                    } else {
                        f90Var = f90Var2;
                        arrayList3 = arrayList4;
                        s52Var = s52Var3;
                        list = listY0;
                    }
                    try {
                        if (s52Var.x) {
                            throw new IOException("Canceled");
                        }
                        try {
                            p92 p92VarB7 = v52VarA.b(k82VarA).b();
                            p92VarB7.a = k82VarA;
                            p92VarB7.k = r92Var3 != null ? df3.f(r92Var3) : null;
                            r92VarA = p92VarB7.a();
                            k82VarA = zo.a(r92VarA, s52Var.r, v52VarA);
                        } catch (IOException e8) {
                            boolean zB = zo.b(e8, s52Var, v52VarA, k82VarA);
                            s52Var.k.getClass();
                            if (!zB) {
                                byte[] bArr = ug3.a;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    fg1.m(e8, (Exception) it.next());
                                }
                                throw e8;
                            }
                            listY0 = du.y0(list, e8);
                            s52Var.i(true);
                            s52Var3 = s52Var;
                            f90Var2 = f90Var;
                            arrayList4 = arrayList3;
                            z8 = false;
                        }
                        try {
                            if (k82VarA == null) {
                                s52Var.k.getClass();
                                z4 = false;
                            } else {
                                o82 o82Var4 = k82VarA.d;
                                if (o82Var4 == null || !o82Var4.c()) {
                                    ug3.b(r92VarA.n);
                                    int i14 = i9 + 1;
                                    kg0 kg0Var = s52Var.k;
                                    if (i14 > 20) {
                                        kg0Var.getClass();
                                        throw new ProtocolException("Too many follow-up requests: " + i14);
                                    }
                                    kg0Var.getClass();
                                    s52Var.i(true);
                                    r92Var3 = r92VarA;
                                    listY0 = list;
                                    s52Var3 = s52Var;
                                    i9 = i14;
                                    f90Var2 = f90Var;
                                    arrayList4 = arrayList3;
                                    z8 = true;
                                } else {
                                    s52Var.k.getClass();
                                    z4 = false;
                                }
                            }
                            s52Var.i(z4);
                            arrayList2 = arrayList3;
                            obj = " must call proceed() exactly once";
                            zoVar = zoVar2;
                            arrayList = arrayList2;
                            if (r92VarA != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z3 = false;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = true;
                    }
                    s52Var.i(z3);
                    throw th;
                }
                f90Var = f90Var2;
                arrayList2 = arrayList4;
                s.l("Check failed.");
                r92VarA = null;
                obj = " must call proceed() exactly once";
                zoVar = zoVar2;
                arrayList = arrayList2;
                if (r92VarA != null) {
                }
                break;
        }
    }
}
