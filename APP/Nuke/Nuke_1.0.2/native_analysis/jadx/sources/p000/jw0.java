package p000;

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

    /* JADX INFO: renamed from: a */
    public final vn1 f5238a;

    /* JADX INFO: renamed from: b */
    public final dq1 f5239b;

    /* JADX INFO: renamed from: c */
    public final bf2 f5240c;

    /* JADX INFO: renamed from: d */
    public final pn1 f5241d;

    /* JADX INFO: renamed from: e */
    public final eo2 f5242e;

    /* JADX INFO: renamed from: f */
    public final et1 f5243f;

    public jw0(vn1 vn1Var, dq1 dq1Var) {
        this.f5238a = vn1Var;
        this.f5239b = dq1Var;
        bf2 bf2Var = ((df2) vn1Var.f12033d).f2023a;
        this.f5240c = bf2Var;
        this.f5241d = new pn1(((u22) vn1Var.f12031b).f11075a.f10782k.f9601a, (pi2) vn1Var.f12036g);
        bf2Var.getClass();
        int i = fo2.f3080a;
        this.f5242e = new eo2(8);
        dt1 dt1Var = new dt1();
        dt1Var.f2210k = C0700sn.f10200D;
        dt1Var.f2208i = false;
        dt1Var.f2209j = false;
        dt1Var.f2205f = false;
        Proxy proxy = Proxy.NO_PROXY;
        if (!t11.m5086l(proxy, dt1Var.f2212m)) {
            dt1Var.f2198D = null;
        }
        dt1Var.f2212m = proxy;
        this.f5243f = new et1(dt1Var);
    }

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
    
        if (((p000.on1) r11.next()).m3574a(r12) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r11 = new p000.mn1(r15);
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2582a(jw0 jw0Var, k82 k82Var, tw0 tw0Var, nn0 nn0Var, u00 u00Var) {
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
        Object objM3150t;
        xw0 xw0Var;
        yw0 yw0VarM6193b;
        r92 r92Var;
        Throwable th;
        Throwable th2;
        jw0Var.getClass();
        if (u00Var instanceof iw0) {
            iw0Var = (iw0) u00Var;
            int i = iw0Var.f4822r;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw0Var.f4822r = i - Integer.MIN_VALUE;
            } else {
                iw0Var = new iw0(jw0Var, u00Var);
            }
        }
        Object obj = iw0Var.f4820p;
        int i2 = iw0Var.f4822r;
        char c = 2;
        Object obj2 = null;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            nn0Var2 = nn0Var;
            a72Var = new a72();
            iw0Var2 = iw0Var;
            k82Var2 = k82Var;
            tw0Var2 = tw0Var;
            pn1Var = jw0Var.f5241d;
            yw0 yw0Var = k82Var2.f5390a;
            ArrayList arrayList = pn1Var.f8414c;
            ArrayList arrayList2 = pn1Var.f8413b;
            boolean z2 = pn1Var.f8416e;
            yw0Var.getClass();
            if (!pn1Var.f8412a) {
            }
            long j = tw0Var2.f10979d;
            et1 et1Var = jw0Var.f5243f;
            et1Var.getClass();
            dt1 dt1Var = new dt1();
            dt1Var.f2200a = et1Var.f2600a;
            dt1Var.f2201b = et1Var.f2599E;
            AbstractC0325iu.m2393g0(et1Var.f2601b, dt1Var.f2202c);
            AbstractC0325iu.m2393g0(et1Var.f2602c, dt1Var.f2203d);
            dt1Var.f2204e = et1Var.f2603d;
            dt1Var.f2205f = et1Var.f2604e;
            dt1Var.f2206g = et1Var.f2605f;
            dt1Var.f2207h = et1Var.f2606g;
            dt1Var.f2208i = et1Var.f2607h;
            dt1Var.f2209j = et1Var.f2608i;
            dt1Var.f2210k = et1Var.f2609j;
            na0Var = et1Var.f2610k;
            dt1Var.f2211l = na0Var;
            dt1Var.f2212m = et1Var.f2611l;
            dt1Var.f2213n = et1Var.f2612m;
            dt1Var.f2214o = et1Var.f2613n;
            dt1Var.f2215p = et1Var.f2614o;
            dt1Var.f2216q = et1Var.f2615p;
            dt1Var.f2217r = et1Var.f2616q;
            dt1Var.f2218s = et1Var.f2617r;
            dt1Var.f2219t = et1Var.f2618s;
            dt1Var.f2220u = et1Var.f2619t;
            dt1Var.f2221v = et1Var.f2620u;
            dt1Var.f2222w = et1Var.f2621v;
            dt1Var.f2223x = et1Var.f2622w;
            dt1Var.f2224y = et1Var.f2623x;
            dt1Var.f2225z = et1Var.f2624y;
            dt1Var.f2195A = et1Var.f2625z;
            dt1Var.f2196B = et1Var.f2595A;
            dt1Var.f2197C = et1Var.f2596B;
            dt1Var.f2198D = et1Var.f2597C;
            dt1Var.f2199E = et1Var.f2598D;
            k93Var = new k93(mn1Var.f6732a);
            if (k93Var != na0Var) {
            }
            dt1Var.f2211l = k93Var;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            dt1Var.f2223x = wg3.m5889b(j, timeUnit);
            s52 s52Var = new s52(new et1(dt1Var), k82Var2);
            iw0Var2.f4815k = tw0Var2;
            iw0Var2.f4816l = nn0Var2;
            iw0Var2.f4817m = k82Var2;
            iw0Var2.f4818n = a72Var;
            iw0Var2.f4822r = 1;
            Set set = mw0.f6903a;
            C0469mp c0469mp = new C0469mp(1, gf1.m1908z(iw0Var2));
            c0469mp.m3151u();
            c0469mp.m3153w(new C0967zm(1, s52Var));
            z = false;
            s52Var.m4731g(new lw0(c0469mp, 0 == true ? 1 : 0));
            objM3150t = c0469mp.m3150t();
            if (objM3150t != k20Var) {
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r92Var = iw0Var.f4819o;
            try {
                fg1.m1627T(obj);
                th = null;
                pp0.m3916n(r92Var, th);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    pp0.m3916n(r92Var, th2);
                    throw th4;
                }
            }
        }
        a72 a72Var2 = iw0Var.f4818n;
        k82 k82Var3 = iw0Var.f4817m;
        nn0 nn0Var3 = iw0Var.f4816l;
        tw0 tw0Var3 = iw0Var.f4815k;
        fg1.m1627T(obj);
        a72Var = a72Var2;
        nn0Var2 = nn0Var3;
        iw0 iw0Var3 = iw0Var;
        tw0Var2 = tw0Var3;
        z = false;
        r92 r92Var2 = (r92) obj;
        try {
            if (mw0.f6906d.contains(Integer.valueOf(r92Var2.f9459k))) {
                String strM2557a = r92Var2.f9461m.m2557a("Location");
                if (strM2557a == null) {
                    strM2557a = null;
                }
                if (strM2557a != null) {
                    yw0 yw0Var2 = r92Var2.f9456h.f5390a;
                    yw0Var2.getClass();
                    try {
                    } catch (IllegalArgumentException unused) {
                        xw0Var = null;
                    }
                    xw0Var = new xw0();
                    xw0Var.m6196e(yw0Var2, strM2557a);
                    yw0VarM6193b = xw0Var != null ? xw0Var.m6193b() : null;
                    if (yw0VarM6193b == null) {
                        throw new sd2("NETWORK_ERROR", "The server returned an invalid redirect target.", false, null, null, 28);
                    }
                    if (yw0VarM6193b != null) {
                        try {
                            if (a72Var.f108h > 0) {
                                z = true;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            iw0Var3.f4815k = null;
                            iw0Var3.f4816l = null;
                            iw0Var3.f4817m = null;
                            iw0Var3.f4818n = null;
                            iw0Var3.f4819o = r92Var2;
                            iw0Var3.f4822r = 2;
                            Object objMo489e = nn0Var2.mo489e(r92Var2, boolValueOf, iw0Var3);
                            if (objMo489e != k20Var) {
                                r92Var = r92Var2;
                                th = null;
                                obj = objMo489e;
                                pp0.m3916n(r92Var, th);
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
                    int i3 = r92Var2.f9459k;
                    r92Var2.close();
                    if (tw0Var2.f10980e == x62.f12852j) {
                        c80.m672p("NETWORK_ERROR", "HTTP redirects are disabled for this request.", 0, null, null, 28);
                        return null;
                    }
                    int i4 = a72Var.f108h;
                    jw0Var.f5240c.getClass();
                    if (i4 >= 10) {
                        c80.m672p("QUOTA_EXCEEDED", "HTTP redirect limit has been exceeded.", 0, null, null, 28);
                        return null;
                    }
                    boolean z3 = (i3 == 303 || ((i3 == 301 || i3 == 302) && t11.m5086l(k82Var3.f5391b, "POST"))) ? true : z;
                    String str = (!z3 || t11.m5086l(k82Var3.f5391b, "HEAD")) ? k82Var3.f5391b : "GET";
                    o82 o82Var = (t11.m5086l(str, "GET") || t11.m5086l(str, "HEAD")) ? null : k82Var3.f5393d;
                    C0093cj c0093cjM2615a = k82Var3.m2615a();
                    c0093cjM2615a.f1579a = yw0VarM6193b;
                    c0093cjM2615a.m839n(str, o82Var);
                    if (z3) {
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Content-Type");
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Content-Length");
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Transfer-Encoding");
                    }
                    yw0 yw0Var3 = k82Var3.f5390a;
                    if (!t11.m5086l(yw0Var3.f13641a, yw0VarM6193b.f13641a) || !t11.m5086l(yw0Var3.f13644d, yw0VarM6193b.f13644d) || yw0Var3.f13645e != yw0VarM6193b.f13645e) {
                        ((ye0) c0093cjM2615a.f1581c).m6262n("Authorization");
                    }
                    k82Var2 = new k82(c0093cjM2615a);
                    a72Var.f108h++;
                    iw0Var2 = iw0Var3;
                    c = 2;
                    obj2 = null;
                    pn1Var = jw0Var.f5241d;
                    yw0 yw0Var4 = k82Var2.f5390a;
                    ArrayList arrayList3 = pn1Var.f8414c;
                    ArrayList arrayList22 = pn1Var.f8413b;
                    boolean z22 = pn1Var.f8416e;
                    yw0Var4.getClass();
                    if (!pn1Var.f8412a) {
                        if (arrayList22.isEmpty()) {
                            Object obj3 = obj2;
                            c80.m672p("PERMISSION_DENIED", "The script did not declare network access.", 0, null, null, 28);
                            return obj3;
                        }
                        if (arrayList3.isEmpty()) {
                            Object obj4 = obj2;
                            c80.m672p("PERMISSION_DENIED", "Network access has not been authorized by the user.", 0, null, null, 28);
                            return obj4;
                        }
                        if (arrayList22 == null || !arrayList22.isEmpty()) {
                            Iterator it = arrayList22.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((on1) it.next()).m3574a(yw0Var4)) {
                                    break;
                                }
                            }
                        }
                        c80.m672p("PERMISSION_DENIED", "The requested origin is outside the authorized network scope.", 0, null, null, 28);
                        return null;
                    }
                    mn1Var = new mn1(z22);
                    long j2 = tw0Var2.f10979d;
                    et1 et1Var2 = jw0Var.f5243f;
                    et1Var2.getClass();
                    dt1 dt1Var2 = new dt1();
                    dt1Var2.f2200a = et1Var2.f2600a;
                    dt1Var2.f2201b = et1Var2.f2599E;
                    AbstractC0325iu.m2393g0(et1Var2.f2601b, dt1Var2.f2202c);
                    AbstractC0325iu.m2393g0(et1Var2.f2602c, dt1Var2.f2203d);
                    dt1Var2.f2204e = et1Var2.f2603d;
                    dt1Var2.f2205f = et1Var2.f2604e;
                    dt1Var2.f2206g = et1Var2.f2605f;
                    dt1Var2.f2207h = et1Var2.f2606g;
                    dt1Var2.f2208i = et1Var2.f2607h;
                    dt1Var2.f2209j = et1Var2.f2608i;
                    dt1Var2.f2210k = et1Var2.f2609j;
                    na0Var = et1Var2.f2610k;
                    dt1Var2.f2211l = na0Var;
                    dt1Var2.f2212m = et1Var2.f2611l;
                    dt1Var2.f2213n = et1Var2.f2612m;
                    dt1Var2.f2214o = et1Var2.f2613n;
                    dt1Var2.f2215p = et1Var2.f2614o;
                    dt1Var2.f2216q = et1Var2.f2615p;
                    dt1Var2.f2217r = et1Var2.f2616q;
                    dt1Var2.f2218s = et1Var2.f2617r;
                    dt1Var2.f2219t = et1Var2.f2618s;
                    dt1Var2.f2220u = et1Var2.f2619t;
                    dt1Var2.f2221v = et1Var2.f2620u;
                    dt1Var2.f2222w = et1Var2.f2621v;
                    dt1Var2.f2223x = et1Var2.f2622w;
                    dt1Var2.f2224y = et1Var2.f2623x;
                    dt1Var2.f2225z = et1Var2.f2624y;
                    dt1Var2.f2195A = et1Var2.f2625z;
                    dt1Var2.f2196B = et1Var2.f2595A;
                    dt1Var2.f2197C = et1Var2.f2596B;
                    dt1Var2.f2198D = et1Var2.f2597C;
                    dt1Var2.f2199E = et1Var2.f2598D;
                    k93Var = new k93(mn1Var.f6732a);
                    if (k93Var != na0Var) {
                        dt1Var2.f2198D = null;
                    }
                    dt1Var2.f2211l = k93Var;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    timeUnit2.getClass();
                    dt1Var2.f2223x = wg3.m5889b(j2, timeUnit2);
                    s52 s52Var2 = new s52(new et1(dt1Var2), k82Var2);
                    iw0Var2.f4815k = tw0Var2;
                    iw0Var2.f4816l = nn0Var2;
                    iw0Var2.f4817m = k82Var2;
                    iw0Var2.f4818n = a72Var;
                    iw0Var2.f4822r = 1;
                    Set set2 = mw0.f6903a;
                    C0469mp c0469mp2 = new C0469mp(1, gf1.m1908z(iw0Var2));
                    c0469mp2.m3151u();
                    c0469mp2.m3153w(new C0967zm(1, s52Var2));
                    z = false;
                    s52Var2.m4731g(new lw0(c0469mp2, 0 == true ? 1 : 0));
                    objM3150t = c0469mp2.m3150t();
                    if (objM3150t != k20Var) {
                        iw0 iw0Var4 = iw0Var2;
                        k82Var3 = k82Var2;
                        obj = objM3150t;
                        iw0Var3 = iw0Var4;
                        r92 r92Var22 = (r92) obj;
                        if (mw0.f6906d.contains(Integer.valueOf(r92Var22.f9459k))) {
                        }
                    }
                    return k20Var;
                }
            }
            yw0VarM6193b = null;
            if (yw0VarM6193b != null) {
            }
        } catch (Throwable th6) {
            r92Var22.close();
            throw th6;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m2583b(jw0 jw0Var, js0 js0Var) {
        jw0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int size = js0Var.size();
        int iAddExact = 0;
        for (int i = 0; i < size; i++) {
            String strM2558b = js0Var.m2558b(i);
            String strM2560d = js0Var.m2560d(i);
            iAddExact = Math.addExact(iAddExact, mw0.m3216c(strM2560d) + mw0.m3216c(strM2558b));
            int size2 = arrayList.size();
            jw0Var.f5240c.getClass();
            if (size2 >= 128 || iAddExact > 65536) {
                c80.m672p("QUOTA_EXCEEDED", "HTTP response headers exceed the limit.", 0, null, null, 28);
                return null;
            }
            arrayList.add(new ow1(strM2558b, strM2560d));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2584c(yw0 yw0Var, tw0 tw0Var, u00 u00Var) throws Throwable {
        zv0 zv0Var;
        byte[] bArr;
        String str;
        if (u00Var instanceof zv0) {
            zv0Var = (zv0) u00Var;
            int i = zv0Var.f14114o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv0Var.f14114o = i - Integer.MIN_VALUE;
            } else {
                zv0Var = new zv0(this, u00Var);
            }
        }
        Object objM1090N = zv0Var.f14112m;
        int i2 = zv0Var.f14114o;
        n82 n82Var = null;
        if (i2 == 0) {
            fg1.m1627T(objM1090N);
            pw0 pw0Var = tw0Var.f10978c;
            if (pw0Var == null) {
                bArr = null;
            } else if (pw0Var instanceof nw0) {
                bArr = ((nw0) pw0Var).f7348a;
            } else {
                if (!(pw0Var instanceof ow0)) {
                    c80.m675s();
                    return null;
                }
                hg2 hg2Var = ((ow0) pw0Var).f7861a;
                zv0Var.f14110k = yw0Var;
                zv0Var.f14111l = tw0Var;
                zv0Var.f14114o = 1;
                objM1090N = this.f5239b.m1090N(hg2Var, zv0Var);
                k20 k20Var = k20.f5323h;
                if (objM1090N == k20Var) {
                    return k20Var;
                }
            }
            if (bArr != null) {
                long length = bArr.length;
                this.f5240c.getClass();
                if (length > 16777216) {
                    c80.m672p("QUOTA_EXCEEDED", "HTTP request body exceeds the size limit.", 0, null, null, 28);
                    return null;
                }
            }
            str = tw0Var.f10976a;
            if ((!str.equals("GET") || str.equals("HEAD")) && bArr != null) {
                c80.m672p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
                return null;
            }
            if (bArr == null) {
                int i3 = o82.f7582a;
                int length2 = bArr.length;
                ug3.m5493a(bArr.length, 0L, length2);
                n82Var = new n82(null, length2, bArr);
            } else if (mw0.f6904b.contains(str)) {
                n82Var = mw0.f6905c;
            }
            C0093cj c0093cj = new C0093cj(4);
            yw0Var.getClass();
            c0093cj.f1579a = yw0Var;
            c0093cj.f1581c = tw0Var.f10977b.m2559c();
            c0093cj.m839n(str, n82Var);
            return new k82(c0093cj);
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0Var = zv0Var.f14111l;
        yw0Var = zv0Var.f14110k;
        fg1.m1627T(objM1090N);
        bArr = (byte[]) objM1090N;
        if (bArr != null) {
        }
        str = tw0Var.f10976a;
        if (str.equals("GET")) {
            c80.m672p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
            return null;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" requests cannot contain a body."), 0, null, null, 28);
        return null;
        if (bArr == null) {
        }
        C0093cj c0093cj2 = new C0093cj(4);
        yw0Var.getClass();
        c0093cj2.f1579a = yw0Var;
        c0093cj2.f1581c = tw0Var.f10977b.m2559c();
        c0093cj2.m839n(str, n82Var);
        return new k82(c0093cj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2585d(String str, hg2 hg2Var, Object obj, u00 u00Var) throws Throwable {
        aw0 aw0Var;
        tw0 tw0Var;
        hg2 hg2Var2;
        if (u00Var instanceof aw0) {
            aw0Var = (aw0) u00Var;
            int i = aw0Var.f420o;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw0Var.f420o = i - Integer.MIN_VALUE;
            } else {
                aw0Var = new aw0(this, u00Var);
            }
        }
        aw0 aw0Var2 = aw0Var;
        Object obj2 = aw0Var2.f418m;
        int i2 = aw0Var2.f420o;
        Object obj3 = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj2);
            if (hg2Var.f4002a == fg2.f2985h) {
                c80.m672p("PERMISSION_DENIED", "Downloads cannot write package files.", 0, null, null, 28);
                return null;
            }
            tw0 tw0VarM6114c0 = xe1.m6114c0(obj, this.f5240c, true);
            yw0 yw0VarM3214a = mw0.m3214a(str);
            aw0Var2.f416k = hg2Var;
            aw0Var2.f417l = tw0VarM6114c0;
            aw0Var2.f420o = 1;
            Object objM2584c = m2584c(yw0VarM3214a, tw0VarM6114c0, aw0Var2);
            if (objM2584c != obj3) {
                tw0Var = tw0VarM6114c0;
                obj2 = objM2584c;
                hg2Var2 = hg2Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(obj2);
                return obj2;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0 tw0Var2 = aw0Var2.f417l;
        hg2 hg2Var3 = aw0Var2.f416k;
        fg1.m1627T(obj2);
        hg2Var2 = hg2Var3;
        tw0Var = tw0Var2;
        long j = tw0Var.f10979d;
        in0 cw0Var = new cw0(this, (k82) obj2, tw0Var, hg2Var2, null, 0);
        aw0Var2.f416k = null;
        aw0Var2.f417l = null;
        aw0Var2.f420o = 2;
        Object objM2586e = m2586e(j, cw0Var, aw0Var2);
        return objM2586e == obj3 ? obj3 : objM2586e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2586e(long j, in0 in0Var, u00 u00Var) {
        dw0 dw0Var;
        if (u00Var instanceof dw0) {
            dw0Var = (dw0) u00Var;
            int i = dw0Var.f2247m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw0Var.f2247m = i - Integer.MIN_VALUE;
            } else {
                dw0Var = new dw0(this, u00Var);
            }
        }
        Object obj = dw0Var.f2245k;
        int i2 = dw0Var.f2247m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            C0793v0 c0793v0 = new C0793v0(this, in0Var, null);
            dw0Var.f2247m = 1;
            Object objM1820e = ga3.m1820e(j, c0793v0, dw0Var);
            k20 k20Var = k20.f5323h;
            return objM1820e == k20Var ? k20Var : objM1820e;
        } catch (cg2 e) {
            Throwable cause = e.getCause();
            if (cause instanceof SocketTimeoutException) {
                c80.m672p("TIMEOUT", "The HTTP operation timed out.", 1, null, cause, 8);
                return null;
            }
            c80.m672p("NETWORK_ERROR", "The HTTP response body could not be downloaded.", 1, null, cause, 8);
            return null;
        } catch (SocketTimeoutException e2) {
            c80.m672p("TIMEOUT", "The HTTP operation timed out.", 1, null, e2, 8);
            return null;
        } catch (k32 e3) {
            c80.m672p("PERMISSION_DENIED", "The target resolved to a private or reserved network address.", 0, null, e3, 12);
            return null;
        } catch (IOException e4) {
            c80.m672p("NETWORK_ERROR", "The HTTP request failed.", 1, null, e4, 8);
            return null;
        } catch (p23 e5) {
            c80.m672p("TIMEOUT", "The HTTP operation timed out.", 1, null, e5, 8);
            return null;
        } catch (sd2 e6) {
            throw e6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2587f(String str, Object obj, u00 u00Var) throws Throwable {
        fw0 fw0Var;
        tw0 tw0Var;
        if (u00Var instanceof fw0) {
            fw0Var = (fw0) u00Var;
            int i = fw0Var.f3157n;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw0Var.f3157n = i - Integer.MIN_VALUE;
            } else {
                fw0Var = new fw0(this, u00Var);
            }
        }
        Object objM2584c = fw0Var.f3155l;
        int i2 = fw0Var.f3157n;
        Object obj2 = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM2584c);
            tw0 tw0VarM6114c0 = xe1.m6114c0(obj, this.f5240c, false);
            yw0 yw0VarM3214a = mw0.m3214a(str);
            fw0Var.f3154k = tw0VarM6114c0;
            fw0Var.f3157n = 1;
            objM2584c = m2584c(yw0VarM3214a, tw0VarM6114c0, fw0Var);
            if (objM2584c != obj2) {
                tw0Var = tw0VarM6114c0;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(objM2584c);
                return objM2584c;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tw0 tw0Var2 = fw0Var.f3154k;
        fg1.m1627T(objM2584c);
        tw0Var = tw0Var2;
        long j = tw0Var.f10979d;
        in0 hw0Var = new hw0(this, (k82) objM2584c, tw0Var, null, 0);
        fw0Var.f3154k = null;
        fw0Var.f3157n = 2;
        Object objM2586e = m2586e(j, hw0Var, fw0Var);
        return objM2586e == obj2 ? obj2 : objM2586e;
    }
}
