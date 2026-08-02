package p000;

import com.dokar.quickjs.QuickJs;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f52 implements AutoCloseable {

    /* JADX INFO: renamed from: q */
    public static final i51 f2797q = new i51(15);

    /* JADX INFO: renamed from: h */
    public final u22 f2798h;

    /* JADX INFO: renamed from: i */
    public final eg2 f2799i;

    /* JADX INFO: renamed from: j */
    public final df2 f2800j;

    /* JADX INFO: renamed from: k */
    public final c20 f2801k;

    /* JADX INFO: renamed from: m */
    public volatile QuickJs f2803m;

    /* JADX INFO: renamed from: n */
    public volatile vn1 f2804n;

    /* JADX INFO: renamed from: l */
    public final kl1 f2802l = new kl1();

    /* JADX INFO: renamed from: o */
    public volatile rk2 f2805o = rk2.f9624h;

    /* JADX INFO: renamed from: p */
    public volatile String f2806p = "unknown";

    public f52(u22 u22Var, eg2 eg2Var, df2 df2Var, c20 c20Var) {
        this.f2798h = u22Var;
        this.f2799i = eg2Var;
        this.f2800j = df2Var;
        this.f2801k = c20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: all -> 0x009d, TryCatch #7 {all -> 0x009d, blocks: (B:42:0x0092, B:44:0x0098, B:49:0x00a4, B:51:0x00aa, B:52:0x00c1, B:54:0x00c7, B:56:0x00d4, B:57:0x00d8, B:58:0x00f2, B:59:0x00f3, B:61:0x010b, B:62:0x010d, B:92:0x0190, B:93:0x01a3, B:94:0x01a4, B:95:0x01a6), top: B:103:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b A[Catch: all -> 0x009d, TryCatch #7 {all -> 0x009d, blocks: (B:42:0x0092, B:44:0x0098, B:49:0x00a4, B:51:0x00aa, B:52:0x00c1, B:54:0x00c7, B:56:0x00d4, B:57:0x00d8, B:58:0x00f2, B:59:0x00f3, B:61:0x010b, B:62:0x010d, B:92:0x0190, B:93:0x01a3, B:94:0x01a4, B:95:0x01a6), top: B:103:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:74:0x0147, B:76:0x0157, B:82:0x016f, B:83:0x0177, B:85:0x017a, B:86:0x017b, B:87:0x0187), top: B:103:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Type inference failed for: r19v0, types: [f52] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [il1] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [il1] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1505b(f52 f52Var, u00 u00Var) {
        d52 d52Var;
        ?? r6;
        Throwable th;
        ?? r3;
        d41 d41Var;
        rf2 rf2VarM5526E;
        QuickJs quickJsM1506c;
        vn1 vn1Var;
        QuickJs quickJs;
        vn1 vn1Var2;
        ?? r4;
        rk2 rk2Var = rk2.f9629m;
        if (u00Var instanceof d52) {
            d52Var = (d52) u00Var;
            int i = d52Var.f1874p;
            if ((i & Integer.MIN_VALUE) != 0) {
                d52Var.f1874p = i - Integer.MIN_VALUE;
            } else {
                d52Var = new d52(f52Var, u00Var);
            }
        }
        Object objMo420g = d52Var.f1872n;
        k20 k20Var = k20.f5323h;
        int i2 = d52Var.f1874p;
        try {
            try {
                try {
                    if (i2 == 0) {
                        fg1.m1627T(objMo420g);
                        kl1 kl1Var = f52Var.f2802l;
                        d52Var.f1869k = kl1Var;
                        d52Var.f1874p = 1;
                        if (kl1Var.m2720d(d52Var) != k20Var) {
                            r6 = kl1Var;
                        }
                        return k20Var;
                    }
                    if (i2 == 1) {
                        il1 il1Var = d52Var.f1869k;
                        fg1.m1627T(objMo420g);
                        r6 = il1Var;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vn1Var2 = d52Var.f1871m;
                            quickJs = d52Var.f1870l;
                            il1 il1Var2 = d52Var.f1869k;
                            try {
                                fg1.m1627T(objMo420g);
                                r4 = il1Var2;
                                f52Var.f2805o = rk2.f9626j;
                                ((kl1) r4).m2722f(null);
                                return a83.f116a;
                            } catch (CancellationException e) {
                                e = e;
                                f52Var.f2805o = rk2Var;
                                vn1Var2.m5726f();
                                f52Var.f2804n = null;
                                quickJs.close();
                                f52Var.f2803m = null;
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                f52Var.f2805o = rk2Var;
                                vn1Var2.m5726f();
                                f52Var.f2804n = null;
                                quickJs.close();
                                f52Var.f2803m = null;
                                if (!(th instanceof dg2)) {
                                    throw th;
                                }
                                String str = f52Var.f2798h.f11075a.f10774c;
                                si2 si2Var = si2.f10157m;
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "Unable to start script.";
                                }
                                throw new dg2(str, si2Var, null, message, th, 4);
                            }
                        }
                        il1 il1Var3 = d52Var.f1869k;
                        try {
                            fg1.m1627T(objMo420g);
                            r3 = il1Var3;
                            d41Var = (d41) objMo420g;
                            lf2 lf2Var = f52Var.f2798h.f11078d;
                            rf2VarM5526E = lf2Var == null ? up0.m5526E(lf2Var, d41Var) : null;
                            if (rf2VarM5526E == null && !rf2VarM5526E.m4446a()) {
                                f52Var.f2805o = rk2Var;
                                th2 th2Var = f52Var.f2798h.f11075a;
                                String str2 = th2Var.f10774c;
                                si2 si2Var2 = si2.f10154j;
                                String str3 = th2Var.f10781j;
                                ArrayList arrayList = rf2VarM5526E.f9546c;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((gf2) obj).f3491c == hf2.f3994i) {
                                        arrayList2.add(obj);
                                    }
                                }
                                throw new dg2(str2, si2Var2, str3, AbstractC0142du.m1165u0(arrayList2, ", ", null, null, new eq1(16), 30), null, 16);
                            }
                            quickJsM1506c = f52Var.m1506c();
                            f52Var.f2803m = quickJsM1506c;
                            f52Var.f2806p = quickJsM1506c.getVersion();
                            u22 u22Var = f52Var.f2798h;
                            eg2 eg2Var = f52Var.f2799i;
                            df2 df2Var = f52Var.f2800j;
                            String str4 = f52Var.f2806p;
                            if (rf2VarM5526E != null) {
                                d41Var = rf2VarM5526E.f9545b;
                            }
                            vn1Var = new vn1(u22Var, eg2Var, df2Var, str4, d41Var);
                            f52Var.f2804n = vn1Var;
                            try {
                                f52Var.f2799i.getClass();
                                af2.m148d(quickJsM1506c, vn1Var);
                                f52Var.m1508g(quickJsM1506c);
                                d52Var.f1869k = r3;
                                d52Var.f1870l = quickJsM1506c;
                                d52Var.f1871m = vn1Var;
                                d52Var.f1874p = 3;
                                if (f52Var.m1510j(quickJsM1506c, d52Var) != k20Var) {
                                    r4 = r3;
                                    quickJs = quickJsM1506c;
                                    vn1Var2 = vn1Var;
                                    f52Var.f2805o = rk2.f9626j;
                                    ((kl1) r4).m2722f(null);
                                    return a83.f116a;
                                }
                                return k20Var;
                            } catch (CancellationException e2) {
                                e = e2;
                                quickJs = quickJsM1506c;
                                vn1Var2 = vn1Var;
                                f52Var.f2805o = rk2Var;
                                vn1Var2.m5726f();
                                f52Var.f2804n = null;
                                quickJs.close();
                                f52Var.f2803m = null;
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                quickJs = quickJsM1506c;
                                vn1Var2 = vn1Var;
                                f52Var.f2805o = rk2Var;
                                vn1Var2.m5726f();
                                f52Var.f2804n = null;
                                quickJs.close();
                                f52Var.f2803m = null;
                                if (!(th instanceof dg2)) {
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            f52Var.f2805o = rk2Var;
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            f52Var.f2805o = rk2Var;
                            th2 th2Var2 = f52Var.f2798h.f11075a;
                            throw new dg2(th2Var2.f10774c, si2.f10153i, th2Var2.f10781j, "Unable to read script config.", th);
                        }
                    }
                    if (f52Var.f2805o != rk2.f9624h) {
                        throw new IllegalStateException(("Script session can only be started once: " + f52Var.f2798h.f11075a.f10774c).toString());
                    }
                    f52Var.f2805o = rk2.f9625i;
                    try {
                        tf2 tf2Var = f52Var.f2800j.f2027e;
                        String str5 = f52Var.f2798h.f11075a.f10774c;
                        d52Var.f1869k = r6;
                        d52Var.f1874p = 2;
                        objMo420g = tf2Var.mo420g(str5, d52Var);
                        if (objMo420g != k20Var) {
                            r3 = r6;
                            d41Var = (d41) objMo420g;
                            lf2 lf2Var2 = f52Var.f2798h.f11078d;
                            if (lf2Var2 == null) {
                            }
                            if (rf2VarM5526E == null) {
                            }
                            quickJsM1506c = f52Var.m1506c();
                            f52Var.f2803m = quickJsM1506c;
                            f52Var.f2806p = quickJsM1506c.getVersion();
                            u22 u22Var2 = f52Var.f2798h;
                            eg2 eg2Var2 = f52Var.f2799i;
                            df2 df2Var2 = f52Var.f2800j;
                            String str42 = f52Var.f2806p;
                            if (rf2VarM5526E != null) {
                            }
                            vn1Var = new vn1(u22Var2, eg2Var2, df2Var2, str42, d41Var);
                            f52Var.f2804n = vn1Var;
                            f52Var.f2799i.getClass();
                            af2.m148d(quickJsM1506c, vn1Var);
                            f52Var.m1508g(quickJsM1506c);
                            d52Var.f1869k = r3;
                            d52Var.f1870l = quickJsM1506c;
                            d52Var.f1871m = vn1Var;
                            d52Var.f1874p = 3;
                            if (f52Var.m1510j(quickJsM1506c, d52Var) != k20Var) {
                            }
                        }
                        return k20Var;
                    } catch (CancellationException e4) {
                        e = e4;
                        f52Var.f2805o = rk2Var;
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        f52Var.f2805o = rk2Var;
                        th2 th2Var22 = f52Var.f2798h.f11075a;
                        throw new dg2(th2Var22.f10774c, si2.f10153i, th2Var22.f10781j, "Unable to read script config.", th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    ((kl1) r6).m2722f(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                r6 = d52Var;
            }
        } catch (Throwable th8) {
            th = th8;
            r6 = "Script session can only be started once: ";
        }
    }

    /* JADX INFO: renamed from: c */
    public final QuickJs m1506c() throws dg2 {
        try {
            s42 s42Var = QuickJs.Companion;
            c20 c20Var = this.f2801k;
            s42Var.getClass();
            c20Var.getClass();
            return new QuickJs(c20Var, null);
        } catch (Throwable th) {
            this.f2805o = rk2.f9629m;
            String str = this.f2798h.f11075a.f10774c;
            si2 si2Var = si2.f10155k;
            String message = th.getMessage();
            if (message == null) {
                message = "Unable to create QuickJS runtime.";
            }
            throw new dg2(str, si2Var, null, message, th, 4);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        vn1 vn1Var = this.f2804n;
        if (vn1Var != null) {
            vn1Var.m5726f();
        }
        this.f2804n = null;
        QuickJs quickJs = this.f2803m;
        if (quickJs != null) {
            quickJs.close();
        }
        this.f2803m = null;
        this.f2805o = rk2.f9628l;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[Catch: all -> 0x0036, CancellationException -> 0x003e, TryCatch #8 {CancellationException -> 0x003e, all -> 0x0036, blocks: (B:13:0x0032, B:31:0x0089, B:33:0x00a0, B:34:0x00a6), top: B:71:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x0036, CancellationException -> 0x003e, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x003e, all -> 0x0036, blocks: (B:13:0x0032, B:31:0x0089, B:33:0x00a0, B:34:0x00a6), top: B:71:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1507e(ci2 ci2Var, u00 u00Var) throws Throwable {
        a52 a52Var;
        Throwable th;
        Object obj;
        il1 il1Var;
        vn1 vn1Var;
        Throwable th2;
        CancellationException cancellationException;
        ci2 ci2Var2;
        il1 il1Var2;
        vn1 vn1Var2;
        QuickJs quickJs;
        il1 il1Var3;
        Object obj2;
        Throwable th3;
        String message;
        bi2 bi2Var;
        si2 si2Var = si2.f10158n;
        if (u00Var instanceof a52) {
            a52Var = (a52) u00Var;
            int i = a52Var.f71q;
            if ((i & Integer.MIN_VALUE) != 0) {
                a52Var.f71q = i - Integer.MIN_VALUE;
            } else {
                a52Var = new a52(this, u00Var);
            }
        }
        Object obj3 = a52Var.f69o;
        k20 k20Var = k20.f5323h;
        int i2 = a52Var.f71q;
        int i3 = 0;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj3);
                kl1 kl1Var = this.f2802l;
                a52Var.f65k = ci2Var;
                a52Var.f66l = kl1Var;
                a52Var.f71q = 1;
                Object objM2720d = kl1Var.m2720d(a52Var);
                il1Var = kl1Var;
                if (objM2720d != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs = a52Var.f68n;
                vn1Var2 = a52Var.f67m;
                il1 il1Var4 = a52Var.f66l;
                ci2Var2 = a52Var.f65k;
                try {
                    fg1.m1627T(obj3);
                    il1Var3 = il1Var4;
                    obj2 = obj3;
                    int iIntValue = ((Number) tp0.m5365m(obj2, d72.m969c(Integer.TYPE), new b52(quickJs, i3))).intValue();
                    bi2Var = iIntValue >= 0 ? new bi2(0, false) : new bi2(iIntValue, true);
                    try {
                        vn1Var2.m5729k(ci2Var2.f1572a);
                        ((kl1) il1Var3).m2722f(null);
                        return bi2Var;
                    } catch (Throwable th4) {
                        th = th4;
                        obj = il1Var3;
                        ((kl1) obj).m2722f(null);
                        throw th;
                    }
                } catch (CancellationException e) {
                    cancellationException = e;
                    il1Var2 = il1Var4;
                    try {
                        throw cancellationException;
                    } catch (Throwable th5) {
                        th3 = th5;
                        vn1Var = vn1Var2;
                        ci2Var = ci2Var2;
                        vn1Var.m5729k(ci2Var.f1572a);
                        throw th3;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    vn1Var = vn1Var2;
                    ci2Var = ci2Var2;
                    try {
                        String str = this.f2798h.f11075a.f10774c;
                        message = th2.getMessage();
                        if (message == null) {
                            message = "Unable to dispatch the message event.";
                        }
                        throw new dg2(str, si2Var, null, message, th2, 4);
                    } catch (Throwable th7) {
                        th3 = th7;
                        vn1Var.m5729k(ci2Var.f1572a);
                        throw th3;
                    }
                }
            }
            il1 il1Var5 = a52Var.f66l;
            ci2 ci2Var3 = a52Var.f65k;
            fg1.m1627T(obj3);
            il1Var = il1Var5;
            ci2Var = ci2Var3;
            QuickJs quickJsM1509h = m1509h();
            vn1Var = this.f2804n;
            if (vn1Var == null) {
                throw new dg2(this.f2798h.f11075a.f10774c, si2Var, null, "Script API context is unavailable.", null, 20);
            }
            try {
                vn1Var.m5739u(ci2Var);
                a52Var.f65k = ci2Var;
                a52Var.f66l = il1Var;
                a52Var.f67m = vn1Var;
                a52Var.f68n = quickJsM1509h;
                a52Var.f71q = 2;
                Object objEvaluateInternal = quickJsM1509h.evaluateInternal("typeof globalThis.__nukeMessagingDispatch === \"function\"\n    ? globalThis.__nukeMessagingDispatch()\n    : -1", "__nuke_message__.js", false, a52Var);
                if (objEvaluateInternal != k20Var) {
                    ci2Var2 = ci2Var;
                    quickJs = quickJsM1509h;
                    vn1Var2 = vn1Var;
                    il1Var3 = il1Var;
                    obj2 = objEvaluateInternal;
                    int iIntValue2 = ((Number) tp0.m5365m(obj2, d72.m969c(Integer.TYPE), new b52(quickJs, i3))).intValue();
                    if (iIntValue2 >= 0) {
                    }
                    vn1Var2.m5729k(ci2Var2.f1572a);
                    ((kl1) il1Var3).m2722f(null);
                    return bi2Var;
                }
                return k20Var;
            } catch (CancellationException e2) {
                cancellationException = e2;
                ci2Var2 = ci2Var;
                il1Var2 = il1Var;
                vn1Var2 = vn1Var;
                throw cancellationException;
            } catch (Throwable th8) {
                th2 = th8;
                String str2 = this.f2798h.f11075a.f10774c;
                message = th2.getMessage();
                if (message == null) {
                }
                throw new dg2(str2, si2Var, null, message, th2, 4);
            }
        } catch (Throwable th9) {
            th = th9;
            obj = obj3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1508g(QuickJs quickJs) throws dg2 {
        u22 u22Var = this.f2798h;
        for (ii2 ii2Var : u22Var.f11076b) {
            try {
                quickJs.addModule(ii2Var.f4645a, ii2Var.f4646b);
            } catch (Throwable th) {
                String str = u22Var.f11075a.f10774c;
                String str2 = ii2Var.f4645a;
                String message = th.getMessage();
                if (message == null) {
                    message = "Unable to compile JavaScript module.";
                }
                throw new dg2(str, si2.f10156l, str2, message, th);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final QuickJs m1509h() throws dg2 {
        si2 si2Var = si2.f10158n;
        if (this.f2805o == rk2.f9626j) {
            QuickJs quickJs = this.f2803m;
            if (quickJs != null) {
                return quickJs;
            }
            throw new dg2(this.f2798h.f11075a.f10774c, si2Var, null, "QuickJS runtime is unavailable.", null, 20);
        }
        throw new dg2(this.f2798h.f11075a.f10774c, si2Var, null, "Script is not running; current state is " + this.f2805o + ".", null, 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1510j(QuickJs quickJs, u00 u00Var) throws dg2 {
        c52 c52Var;
        if (u00Var instanceof c52) {
            c52Var = (c52) u00Var;
            int i = c52Var.f1208n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c52Var.f1208n = i - Integer.MIN_VALUE;
            } else {
                c52Var = new c52(this, u00Var);
            }
        }
        Object objEvaluateInternal = c52Var.f1206l;
        int i2 = c52Var.f1208n;
        u22 u22Var = this.f2798h;
        int i3 = 1;
        try {
            if (i2 == 0) {
                fg1.m1627T(objEvaluateInternal);
                String str = u22Var.f11075a.f10778g;
                this.f2799i.getClass();
                String strM5351O = tp0.m5351O(str);
                c52Var.f1205k = quickJs;
                c52Var.f1208n = 1;
                objEvaluateInternal = quickJs.evaluateInternal(strM5351O, "__nuke_bootstrap__.js", true, c52Var);
                k20 k20Var = k20.f5323h;
                if (objEvaluateInternal == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs = c52Var.f1205k;
                fg1.m1627T(objEvaluateInternal);
            }
            tp0.m5365m(objEvaluateInternal, d72.m968b(), new b52(quickJs, i3));
            return a83.f116a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th2 th2Var = u22Var.f11075a;
            String str2 = th2Var.f10774c;
            String str3 = th2Var.f10778g;
            String message = th.getMessage();
            if (message == null) {
                message = "Unable to evaluate the entry module.";
            }
            throw new dg2(str2, si2.f10157m, str3, message, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[Catch: all -> 0x00f4, TryCatch #2 {all -> 0x00f4, blocks: (B:64:0x0102, B:66:0x0106, B:67:0x0109, B:69:0x010d, B:70:0x0110, B:54:0x00ec, B:56:0x00f0, B:59:0x00f6, B:61:0x00fa, B:62:0x00fd, B:63:0x0101, B:26:0x0076, B:29:0x007c), top: B:81:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d A[Catch: all -> 0x00f4, TryCatch #2 {all -> 0x00f4, blocks: (B:64:0x0102, B:66:0x0106, B:67:0x0109, B:69:0x010d, B:70:0x0110, B:54:0x00ec, B:56:0x00f0, B:59:0x00f6, B:61:0x00fa, B:62:0x00fd, B:63:0x0101, B:26:0x0076, B:29:0x007c), top: B:81:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.dokar.quickjs.QuickJs] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.dokar.quickjs.QuickJs] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.dokar.quickjs.QuickJs] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.dokar.quickjs.QuickJs] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.dokar.quickjs.QuickJs] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [il1] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1511k(u00 u00Var) throws dg2 {
        e52 e52Var;
        ?? r11;
        o72 o72Var;
        il1 il1Var;
        o72 o72Var2;
        Throwable th;
        ?? r7;
        o72 o72Var3;
        ?? r5;
        String message;
        ?? r52;
        CancellationException cancellationException;
        ?? r112;
        ?? r53;
        vn1 vn1Var;
        ?? r4;
        rk2 rk2Var = rk2.f9628l;
        if (u00Var instanceof e52) {
            e52Var = (e52) u00Var;
            int i = e52Var.f2320r;
            if ((i & Integer.MIN_VALUE) != 0) {
                e52Var.f2320r = i - Integer.MIN_VALUE;
            } else {
                e52Var = new e52(this, u00Var);
            }
        }
        Object objEvaluateInternal = e52Var.f2318p;
        k20 k20Var = k20.f5323h;
        ?? r54 = e52Var.f2320r;
        int i2 = 2;
        ?? r72 = 1;
        try {
            try {
                if (r54 == 0) {
                    fg1.m1627T(objEvaluateInternal);
                    o72 o72Var4 = new o72();
                    o72 o72Var5 = new o72();
                    kl1 kl1Var = this.f2802l;
                    e52Var.f2313k = o72Var4;
                    e52Var.f2314l = o72Var5;
                    e52Var.f2315m = kl1Var;
                    e52Var.f2320r = 1;
                    if (kl1Var.m2720d(e52Var) != k20Var) {
                        o72Var = o72Var5;
                        il1Var = kl1Var;
                        o72Var2 = o72Var4;
                    }
                    return k20Var;
                }
                if (r54 != 1) {
                    if (r54 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    QuickJs quickJs = e52Var.f2317o;
                    r54 = e52Var.f2316n;
                    r72 = e52Var.f2315m;
                    o72Var = e52Var.f2314l;
                    o72Var3 = e52Var.f2313k;
                    try {
                        fg1.m1627T(objEvaluateInternal);
                        r4 = quickJs;
                        r54 = r54;
                        r72 = r72;
                        tp0.m5365m(objEvaluateInternal, d72.m968b(), new b52(r4, i2));
                    } catch (CancellationException e) {
                        e = e;
                        o72Var.f7574i = e;
                        r54 = r54;
                        r72 = r72;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = r54;
                        r7 = r72;
                        String str = this.f2798h.f11075a.f10774c;
                        si2 si2Var = si2.f10159o;
                        message = th.getMessage();
                        if (message == null) {
                        }
                        o72Var3.f7574i = new dg2(str, si2Var, null, message, th, 4);
                        r54 = r5;
                        r72 = r7;
                    }
                    o72Var2 = o72Var3;
                    r112 = r54;
                    r53 = r72;
                    vn1Var = this.f2804n;
                    if (vn1Var != null) {
                        vn1Var.m5726f();
                    }
                    this.f2804n = null;
                    if (r112 != 0) {
                        r112.close();
                    }
                    this.f2803m = null;
                    this.f2805o = rk2Var;
                    r52 = r53;
                    ((kl1) r52).m2722f(null);
                    cancellationException = (CancellationException) o72Var.f7574i;
                    if (cancellationException != null) {
                        throw cancellationException;
                    }
                    dg2 dg2Var = (dg2) o72Var2.f7574i;
                    if (dg2Var == null) {
                        return a83.f116a;
                    }
                    throw dg2Var;
                }
                il1 il1Var2 = e52Var.f2315m;
                o72Var = e52Var.f2314l;
                o72Var2 = e52Var.f2313k;
                fg1.m1627T(objEvaluateInternal);
                il1Var = il1Var2;
                if (this.f2805o == rk2Var) {
                    r52 = il1Var;
                    ((kl1) r52).m2722f(null);
                    cancellationException = (CancellationException) o72Var.f7574i;
                    if (cancellationException != null) {
                    }
                } else {
                    r11 = this.f2803m;
                    this.f2805o = rk2.f9627k;
                    r53 = il1Var;
                    r112 = r11;
                    if (r11 != 0) {
                        try {
                            boolean zIsClosed = r11.isClosed();
                            r53 = il1Var;
                            r112 = r11;
                            if (!zIsClosed) {
                                this.f2799i.getClass();
                                try {
                                    e52Var.f2313k = o72Var2;
                                    e52Var.f2314l = o72Var;
                                    e52Var.f2315m = il1Var;
                                    e52Var.f2316n = r11;
                                    e52Var.f2317o = r11;
                                    e52Var.f2320r = 2;
                                    objEvaluateInternal = r11.evaluateInternal("const entryModule = globalThis.__nukeScript;\nif (entryModule && typeof entryModule.deactivate === \"function\") {\n    await entryModule.deactivate();\n}", "__nuke_shutdown__.js", true, e52Var);
                                } catch (CancellationException e2) {
                                    e = e2;
                                    r72 = il1Var;
                                    o72Var3 = o72Var2;
                                    r54 = r11;
                                    o72Var.f7574i = e;
                                    r54 = r54;
                                    r72 = r72;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r7 = il1Var;
                                    o72Var3 = o72Var2;
                                    r5 = r11;
                                    String str2 = this.f2798h.f11075a.f10774c;
                                    si2 si2Var2 = si2.f10159o;
                                    message = th.getMessage();
                                    if (message == null) {
                                        message = "Script deactivation failed.";
                                    }
                                    o72Var3.f7574i = new dg2(str2, si2Var2, null, message, th, 4);
                                    r54 = r5;
                                    r72 = r7;
                                }
                                if (objEvaluateInternal != k20Var) {
                                    r72 = il1Var;
                                    o72Var3 = o72Var2;
                                    ?? r42 = r11;
                                    r54 = r42;
                                    r4 = r42;
                                    tp0.m5365m(objEvaluateInternal, d72.m968b(), new b52(r4, i2));
                                    o72Var2 = o72Var3;
                                    r112 = r54;
                                    r53 = r72;
                                }
                                return k20Var;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            vn1 vn1Var2 = this.f2804n;
                            if (vn1Var2 != null) {
                                vn1Var2.m5726f();
                            }
                            this.f2804n = null;
                            if (r11 != 0) {
                                r11.close();
                            }
                            this.f2803m = null;
                            this.f2805o = rk2Var;
                            throw th;
                        }
                    }
                    vn1Var = this.f2804n;
                    if (vn1Var != null) {
                    }
                    this.f2804n = null;
                    if (r112 != 0) {
                    }
                    this.f2803m = null;
                    this.f2805o = rk2Var;
                    r52 = r53;
                    ((kl1) r52).m2722f(null);
                    cancellationException = (CancellationException) o72Var.f7574i;
                    if (cancellationException != null) {
                    }
                }
            } catch (Throwable th5) {
                ((kl1) r54).m2722f(null);
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            r11 = r54;
        }
    }
}
