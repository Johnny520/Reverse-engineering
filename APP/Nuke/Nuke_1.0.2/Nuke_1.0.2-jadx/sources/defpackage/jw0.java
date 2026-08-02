package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 {
    public final vn1 a;
    public final dq1 b;
    public final bf2 c;
    public final pn1 d;
    public final eo2 e;
    public final et1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jw0(vn1 vn1Var, dq1 dq1Var) {
        this.a = vn1Var;
        this.b = dq1Var;
        bf2 bf2Var = ((df2) vn1Var.d).a;
        this.c = bf2Var;
        this.d = new pn1(((u22) vn1Var.b).a.k.a, (pi2) vn1Var.g);
        bf2Var.getClass();
        int i = fo2.a;
        this.e = new eo2(8);
        dt1 dt1Var = new dt1();
        dt1Var.k = sn.D;
        dt1Var.i = false;
        dt1Var.j = false;
        dt1Var.f = false;
        Proxy proxy = Proxy.NO_PROXY;
        if (!t11.l(proxy, dt1Var.m)) {
            dt1Var.D = null;
        }
        dt1Var.m = proxy;
        this.f = new et1(dt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, IGET] complete}, expected: {[INVOKE] complete} */
    /* JADX DEBUG: Multi-variable search result rejected for r14v13, resolved type: java.lang.Object[] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r13 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r13.isEmpty() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        r11 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (r11.hasNext() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (((defpackage.on1) r11.next()).a(r12) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r11 = new defpackage.mn1(r15);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:56:0x01c1, B:55:0x01bf], limit reached: 151 */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1 A[Catch: all -> 0x02ff, TryCatch #4 {all -> 0x02ff, blocks: (B:53:0x01b1, B:56:0x01c1, B:61:0x01cf, B:62:0x01d6, B:66:0x01e2, B:130:0x02ee, B:131:0x02fe), top: B:151:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01a9 -> B:52:0x01af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jw0 jw0Var, k82 k82Var, tw0 tw0Var, nn0 nn0Var, u00 u00Var) {
        iw0 iw0Var;
        nn0 nn0Var2;
        a72 a72Var;
        iw0 iw0Var2;
        k82 k82Var2;
        tw0 tw0Var2;
        pn1 pn1Var;
        mn1 mn1Var;
        na0 na0Var;
        k93 k93Var;
        boolean z;
        Object objT;
        xw0 xw0Var;
        yw0 yw0VarB;
        r92 r92Var;
        Throwable th;
        Throwable th2;
        jw0Var.getClass();
        if (u00Var instanceof iw0) {
            iw0Var = (iw0) u00Var;
            int i = iw0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw0Var.r = i - Integer.MIN_VALUE;
            } else {
                iw0Var = new iw0(jw0Var, u00Var);
            }
        }
        Object obj = iw0Var.p;
        int i2 = iw0Var.r;
        char c = 2;
        Object obj2 = null;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            nn0Var2 = nn0Var;
            a72Var = new a72();
            iw0Var2 = iw0Var;
            k82Var2 = k82Var;
            tw0Var2 = tw0Var;
            pn1Var = jw0Var.d;
            yw0 yw0Var = k82Var2.a;
            ArrayList arrayList = pn1Var.c;
            ArrayList arrayList2 = pn1Var.b;
            boolean z2 = pn1Var.e;
            yw0Var.getClass();
            if (!pn1Var.a) {
            }
            long j = tw0Var2.d;
            et1 et1Var = jw0Var.f;
            et1Var.getClass();
            dt1 dt1Var = new dt1();
            dt1Var.a = et1Var.a;
            dt1Var.b = et1Var.E;
            iu.g0(et1Var.b, dt1Var.c);
            iu.g0(et1Var.c, dt1Var.d);
            dt1Var.e = et1Var.d;
            dt1Var.f = et1Var.e;
            dt1Var.g = et1Var.f;
            dt1Var.h = et1Var.g;
            dt1Var.i = et1Var.h;
            dt1Var.j = et1Var.i;
            dt1Var.k = et1Var.j;
            na0Var = et1Var.k;
            dt1Var.l = na0Var;
            dt1Var.m = et1Var.l;
            dt1Var.n = et1Var.m;
            dt1Var.o = et1Var.n;
            dt1Var.p = et1Var.o;
            dt1Var.q = et1Var.p;
            dt1Var.r = et1Var.q;
            dt1Var.s = et1Var.r;
            dt1Var.t = et1Var.s;
            dt1Var.u = et1Var.t;
            dt1Var.v = et1Var.u;
            dt1Var.w = et1Var.v;
            dt1Var.x = et1Var.w;
            dt1Var.y = et1Var.x;
            dt1Var.z = et1Var.y;
            dt1Var.A = et1Var.z;
            dt1Var.B = et1Var.A;
            dt1Var.C = et1Var.B;
            dt1Var.D = et1Var.C;
            dt1Var.E = et1Var.D;
            k93Var = new k93(mn1Var.a);
            if (k93Var != na0Var) {
            }
            dt1Var.l = k93Var;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            dt1Var.x = wg3.b(j, timeUnit);
            s52 s52Var = new s52(new et1(dt1Var), k82Var2);
            iw0Var2.k = tw0Var2;
            iw0Var2.l = nn0Var2;
            iw0Var2.m = k82Var2;
            iw0Var2.n = a72Var;
            iw0Var2.r = 1;
            Set set = mw0.a;
            mp mpVar = new mp(1, gf1.z(iw0Var2));
            mpVar.u();
            mpVar.w(new zm(1, s52Var));
            z = false;
            s52Var.g(new lw0(mpVar, 0 == true ? 1 : 0));
            objT = mpVar.t();
            if (objT != k20Var) {
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r92Var = iw0Var.o;
            try {
                fg1.T(obj);
                th = null;
                pp0.n(r92Var, th);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    pp0.n(r92Var, th2);
                    throw th4;
                }
            }
        }
        a72 a72Var2 = iw0Var.n;
        k82 k82Var3 = iw0Var.m;
        nn0 nn0Var3 = iw0Var.l;
        tw0 tw0Var3 = iw0Var.k;
        fg1.T(obj);
        a72Var = a72Var2;
        nn0Var2 = nn0Var3;
        iw0 iw0Var3 = iw0Var;
        tw0Var2 = tw0Var3;
        z = false;
        r92 r92Var2 = (r92) obj;
        try {
            if (mw0.d.contains(Integer.valueOf(r92Var2.k))) {
                String strA = r92Var2.m.a("Location");
                if (strA == null) {
                    strA = null;
                }
                if (strA != null) {
                    yw0 yw0Var2 = r92Var2.h.a;
                    yw0Var2.getClass();
                    try {
                    } catch (IllegalArgumentException unused) {
                        xw0Var = null;
                    }
                    xw0Var = new xw0();
                    xw0Var.e(yw0Var2, strA);
                    yw0VarB = xw0Var != null ? xw0Var.b() : null;
                    if (yw0VarB == null) {
                        throw new sd2("NETWORK_ERROR", "The server returned an invalid redirect target.", false, null, null, 28);
                    }
                    if (yw0VarB != null) {
                        try {
                            if (a72Var.h > 0) {
                                z = true;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            iw0Var3.k = null;
                            iw0Var3.l = null;
                            iw0Var3.m = null;
                            iw0Var3.n = null;
                            iw0Var3.o = r92Var2;
                            iw0Var3.r = 2;
                            Object objE = nn0Var2.e(r92Var2, boolValueOf, iw0Var3);
                            if (objE != k20Var) {
                                r92Var = r92Var2;
                                th = null;
                                obj = objE;
                                pp0.n(r92Var, th);
                                return obj;
                            }
                            return k20Var;
                        } catch (Throwable th5) {
                            th = th5;
                            r92Var = r92Var2;
                            th2 = th;
                            throw th2;
                        }
                    }
                    int i3 = r92Var2.k;
                    r92Var2.close();
                    if (tw0Var2.e == x62.j) {
                        c80.p("NETWORK_ERROR", "HTTP redirects are disabled for this request.", 0, null, null, 28);
                        return null;
                    }
                    int i4 = a72Var.h;
                    jw0Var.c.getClass();
                    if (i4 >= 10) {
                        c80.p("QUOTA_EXCEEDED", "HTTP redirect limit has been exceeded.", 0, null, null, 28);
                        return null;
                    }
                    boolean z3 = (i3 == 303 || ((i3 == 301 || i3 == 302) && t11.l(k82Var3.b, "POST"))) ? true : z;
                    String str = (!z3 || t11.l(k82Var3.b, "HEAD")) ? k82Var3.b : "GET";
                    o82 o82Var = (t11.l(str, "GET") || t11.l(str, "HEAD")) ? null : k82Var3.d;
                    cj cjVarA = k82Var3.a();
                    cjVarA.a = yw0VarB;
                    cjVarA.n(str, o82Var);
                    if (z3) {
                        ((ye0) cjVarA.c).n("Content-Type");
                        ((ye0) cjVarA.c).n("Content-Length");
                        ((ye0) cjVarA.c).n("Transfer-Encoding");
                    }
                    yw0 yw0Var3 = k82Var3.a;
                    if (!t11.l(yw0Var3.a, yw0VarB.a) || !t11.l(yw0Var3.d, yw0VarB.d) || yw0Var3.e != yw0VarB.e) {
                        ((ye0) cjVarA.c).n("Authorization");
                    }
                    k82Var2 = new k82(cjVarA);
                    a72Var.h++;
                    iw0Var2 = iw0Var3;
                    c = 2;
                    obj2 = null;
                    pn1Var = jw0Var.d;
                    yw0 yw0Var4 = k82Var2.a;
                    ArrayList arrayList3 = pn1Var.c;
                    ArrayList arrayList22 = pn1Var.b;
                    boolean z22 = pn1Var.e;
                    yw0Var4.getClass();
                    if (!pn1Var.a) {
                        if (arrayList22.isEmpty()) {
                            Object obj3 = obj2;
                            c80.p("PERMISSION_DENIED", "The script did not declare network access.", 0, null, null, 28);
                            return obj3;
                        }
                        if (arrayList3.isEmpty()) {
                            Object obj4 = obj2;
                            c80.p("PERMISSION_DENIED", "Network access has not been authorized by the user.", 0, null, null, 28);
                            return obj4;
                        }
                        if (arrayList22 == null || !arrayList22.isEmpty()) {
                            Iterator it = arrayList22.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((on1) it.next()).a(yw0Var4)) {
                                    break;
                                }
                            }
                        }
                        c80.p("PERMISSION_DENIED", "The requested origin is outside the authorized network scope.", 0, null, null, 28);
                        return null;
                    }
                    mn1Var = new mn1(z22);
                    long j2 = tw0Var2.d;
                    et1 et1Var2 = jw0Var.f;
                    et1Var2.getClass();
                    dt1 dt1Var2 = new dt1();
                    dt1Var2.a = et1Var2.a;
                    dt1Var2.b = et1Var2.E;
                    iu.g0(et1Var2.b, dt1Var2.c);
                    iu.g0(et1Var2.c, dt1Var2.d);
                    dt1Var2.e = et1Var2.d;
                    dt1Var2.f = et1Var2.e;
                    dt1Var2.g = et1Var2.f;
                    dt1Var2.h = et1Var2.g;
                    dt1Var2.i = et1Var2.h;
                    dt1Var2.j = et1Var2.i;
                    dt1Var2.k = et1Var2.j;
                    na0Var = et1Var2.k;
                    dt1Var2.l = na0Var;
                    dt1Var2.m = et1Var2.l;
                    dt1Var2.n = et1Var2.m;
                    dt1Var2.o = et1Var2.n;
                    dt1Var2.p = et1Var2.o;
                    dt1Var2.q = et1Var2.p;
                    dt1Var2.r = et1Var2.q;
                    dt1Var2.s = et1Var2.r;
                    dt1Var2.t = et1Var2.s;
                    dt1Var2.u = et1Var2.t;
                    dt1Var2.v = et1Var2.u;
                    dt1Var2.w = et1Var2.v;
                    dt1Var2.x = et1Var2.w;
                    dt1Var2.y = et1Var2.x;
                    dt1Var2.z = et1Var2.y;
                    dt1Var2.A = et1Var2.z;
                    dt1Var2.B = et1Var2.A;
                    dt1Var2.C = et1Var2.B;
                    dt1Var2.D = et1Var2.C;
                    dt1Var2.E = et1Var2.D;
                    k93Var = new k93(mn1Var.a);
                    if (k93Var != na0Var) {
                        dt1Var2.D = null;
                    }
                    dt1Var2.l = k93Var;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    timeUnit2.getClass();
                    dt1Var2.x = wg3.b(j2, timeUnit2);
                    s52 s52Var2 = new s52(new et1(dt1Var2), k82Var2);
                    iw0Var2.k = tw0Var2;
                    iw0Var2.l = nn0Var2;
                    iw0Var2.m = k82Var2;
                    iw0Var2.n = a72Var;
                    iw0Var2.r = 1;
                    Set set2 = mw0.a;
                    mp mpVar2 = new mp(1, gf1.z(iw0Var2));
                    mpVar2.u();
                    mpVar2.w(new zm(1, s52Var2));
                    z = false;
                    s52Var2.g(new lw0(mpVar2, 0 == true ? 1 : 0));
                    objT = mpVar2.t();
                    if (objT != k20Var) {
                        iw0 iw0Var4 = iw0Var2;
                        k82Var3 = k82Var2;
                        obj = objT;
                        iw0Var3 = iw0Var4;
                        r92 r92Var22 = (r92) obj;
                        if (mw0.d.contains(Integer.valueOf(r92Var22.k))) {
                        }
                    }
                    return k20Var;
                }
            }
            yw0VarB = null;
            if (yw0VarB != null) {
            }
        } catch (Throwable th6) {
            r92Var22.close();
            throw th6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList b(jw0 jw0Var, js0 js0Var) {
        jw0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int size = js0Var.size();
        int iAddExact = 0;
        for (int i = 0; i < size; i++) {
            String strB = js0Var.b(i);
            String strD = js0Var.d(i);
            iAddExact = Math.addExact(iAddExact, mw0.c(strD) + mw0.c(strB));
            int size2 = arrayList.size();
            jw0Var.c.getClass();
            if (size2 >= 128 || iAddExact > 65536) {
                c80.p("QUOTA_EXCEEDED", "HTTP response headers exceed the limit.", 0, null, null, 28);
                return null;
            }
            arrayList.add(new ow1(strB, strD));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(yw0 yw0Var, tw0 tw0Var, u00 u00Var) throws Throwable {
        zv0 zv0Var;
        byte[] bArr;
        String str;
        if (u00Var instanceof zv0) {
            zv0Var = (zv0) u00Var;
            int i = zv0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv0Var.o = i - Integer.MIN_VALUE;
            } else {
                zv0Var = new zv0(this, u00Var);
            }
        }
        Object objN = zv0Var.m;
        int i2 = zv0Var.o;
        n82 n82Var = null;
        if (i2 == 0) {
            fg1.T(objN);
            pw0 pw0Var = tw0Var.c;
            if (pw0Var == null) {
                bArr = null;
            } else if (pw0Var instanceof nw0) {
                bArr = ((nw0) pw0Var).a;
            } else {
                if (!(pw0Var instanceof ow0)) {
                    c80.s();
                    return null;
                }
                hg2 hg2Var = ((ow0) pw0Var).a;
                zv0Var.k = yw0Var;
                zv0Var.l = tw0Var;
                zv0Var.o = 1;
                objN = this.b.N(hg2Var, zv0Var);
                k20 k20Var = k20.h;
                if (objN == k20Var) {
                    return k20Var;
                }
            }
            if (bArr != null) {
                long length = bArr.length;
                this.c.getClass();
                if (length > 16777216) {
                    c80.p("QUOTA_EXCEEDED", "HTTP request body exceeds the size limit.", 0, null, null, 28);
                    return null;
                }
            }
            str = tw0Var.a;
            if ((!str.equals("GET") || str.equals("HEAD")) && bArr != null) {
                c80.p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
                return null;
            }
            if (bArr == null) {
                int i3 = o82.a;
                int length2 = bArr.length;
                ug3.a(bArr.length, 0L, length2);
                n82Var = new n82(null, length2, bArr);
            } else if (mw0.b.contains(str)) {
                n82Var = mw0.c;
            }
            cj cjVar = new cj(4);
            yw0Var.getClass();
            cjVar.a = yw0Var;
            cjVar.c = tw0Var.b.c();
            cjVar.n(str, n82Var);
            return new k82(cjVar);
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0Var = zv0Var.l;
        yw0Var = zv0Var.k;
        fg1.T(objN);
        bArr = (byte[]) objN;
        if (bArr != null) {
        }
        str = tw0Var.a;
        if (str.equals("GET")) {
            c80.p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
            return null;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
        return null;
        if (bArr == null) {
        }
        cj cjVar2 = new cj(4);
        yw0Var.getClass();
        cjVar2.a = yw0Var;
        cjVar2.c = tw0Var.b.c();
        cjVar2.n(str, n82Var);
        return new k82(cjVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, hg2 hg2Var, Object obj, u00 u00Var) throws Throwable {
        aw0 aw0Var;
        tw0 tw0Var;
        hg2 hg2Var2;
        if (u00Var instanceof aw0) {
            aw0Var = (aw0) u00Var;
            int i = aw0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw0Var.o = i - Integer.MIN_VALUE;
            } else {
                aw0Var = new aw0(this, u00Var);
            }
        }
        aw0 aw0Var2 = aw0Var;
        Object obj2 = aw0Var2.m;
        int i2 = aw0Var2.o;
        Object obj3 = k20.h;
        if (i2 == 0) {
            fg1.T(obj2);
            if (hg2Var.a == fg2.h) {
                c80.p("PERMISSION_DENIED", "Downloads cannot write package files.", 0, null, null, 28);
                return null;
            }
            tw0 tw0VarC0 = xe1.c0(obj, this.c, true);
            yw0 yw0VarA = mw0.a(str);
            aw0Var2.k = hg2Var;
            aw0Var2.l = tw0VarC0;
            aw0Var2.o = 1;
            Object objC = c(yw0VarA, tw0VarC0, aw0Var2);
            if (objC != obj3) {
                tw0Var = tw0VarC0;
                obj2 = objC;
                hg2Var2 = hg2Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(obj2);
                return obj2;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0 tw0Var2 = aw0Var2.l;
        hg2 hg2Var3 = aw0Var2.k;
        fg1.T(obj2);
        hg2Var2 = hg2Var3;
        tw0Var = tw0Var2;
        long j = tw0Var.d;
        in0 cw0Var = new cw0(this, (k82) obj2, tw0Var, hg2Var2, null, 0);
        aw0Var2.k = null;
        aw0Var2.l = null;
        aw0Var2.o = 2;
        Object objE = e(j, cw0Var, aw0Var2);
        return objE == obj3 ? obj3 : objE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, in0 in0Var, u00 u00Var) {
        dw0 dw0Var;
        if (u00Var instanceof dw0) {
            dw0Var = (dw0) u00Var;
            int i = dw0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw0Var.m = i - Integer.MIN_VALUE;
            } else {
                dw0Var = new dw0(this, u00Var);
            }
        }
        Object obj = dw0Var.k;
        int i2 = dw0Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            v0 v0Var = new v0(this, in0Var, null);
            dw0Var.m = 1;
            Object objE = ga3.e(j, v0Var, dw0Var);
            k20 k20Var = k20.h;
            return objE == k20Var ? k20Var : objE;
        } catch (cg2 e) {
            Throwable cause = e.getCause();
            if (cause instanceof SocketTimeoutException) {
                c80.p("TIMEOUT", "The HTTP operation timed out.", 1, null, cause, 8);
                return null;
            }
            c80.p("NETWORK_ERROR", "The HTTP response body could not be downloaded.", 1, null, cause, 8);
            return null;
        } catch (SocketTimeoutException e2) {
            c80.p("TIMEOUT", "The HTTP operation timed out.", 1, null, e2, 8);
            return null;
        } catch (k32 e3) {
            c80.p("PERMISSION_DENIED", "The target resolved to a private or reserved network address.", 0, null, e3, 12);
            return null;
        } catch (IOException e4) {
            c80.p("NETWORK_ERROR", "The HTTP request failed.", 1, null, e4, 8);
            return null;
        } catch (p23 e5) {
            c80.p("TIMEOUT", "The HTTP operation timed out.", 1, null, e5, 8);
            return null;
        } catch (sd2 e6) {
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Object obj, u00 u00Var) throws Throwable {
        fw0 fw0Var;
        tw0 tw0Var;
        if (u00Var instanceof fw0) {
            fw0Var = (fw0) u00Var;
            int i = fw0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw0Var.n = i - Integer.MIN_VALUE;
            } else {
                fw0Var = new fw0(this, u00Var);
            }
        }
        Object objC = fw0Var.l;
        int i2 = fw0Var.n;
        Object obj2 = k20.h;
        if (i2 == 0) {
            fg1.T(objC);
            tw0 tw0VarC0 = xe1.c0(obj, this.c, false);
            yw0 yw0VarA = mw0.a(str);
            fw0Var.k = tw0VarC0;
            fw0Var.n = 1;
            objC = c(yw0VarA, tw0VarC0, fw0Var);
            if (objC != obj2) {
                tw0Var = tw0VarC0;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(objC);
                return objC;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0 tw0Var2 = fw0Var.k;
        fg1.T(objC);
        tw0Var = tw0Var2;
        long j = tw0Var.d;
        in0 hw0Var = new hw0(this, (k82) objC, tw0Var, null, 0);
        fw0Var.k = null;
        fw0Var.n = 2;
        Object objE = e(j, hw0Var, fw0Var);
        return objE == obj2 ? obj2 : objE;
    }
}
