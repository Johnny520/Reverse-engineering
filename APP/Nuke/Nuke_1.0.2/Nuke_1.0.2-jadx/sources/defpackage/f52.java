package defpackage;

import com.dokar.quickjs.QuickJs;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f52 implements AutoCloseable {
    public static final i51 q = new i51(15);
    public final u22 h;
    public final eg2 i;
    public final df2 j;
    public final c20 k;
    public volatile QuickJs m;
    public volatile vn1 n;
    public final kl1 l = new kl1();
    public volatile rk2 o = rk2.h;
    public volatile String p = "unknown";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f52(u22 u22Var, eg2 eg2Var, df2 df2Var, c20 c20Var) {
        this.h = u22Var;
        this.i = eg2Var;
        this.j = df2Var;
        this.k = c20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x01a7 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f52 f52Var, u00 u00Var) {
        d52 d52Var;
        ?? r6;
        Throwable th;
        ?? r3;
        d41 d41Var;
        rf2 rf2VarE;
        QuickJs quickJsC;
        vn1 vn1Var;
        QuickJs quickJs;
        vn1 vn1Var2;
        ?? r4;
        rk2 rk2Var = rk2.m;
        if (u00Var instanceof d52) {
            d52Var = (d52) u00Var;
            int i = d52Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                d52Var.p = i - Integer.MIN_VALUE;
            } else {
                d52Var = new d52(f52Var, u00Var);
            }
        }
        Object objG = d52Var.n;
        k20 k20Var = k20.h;
        int i2 = d52Var.p;
        try {
            try {
                try {
                    if (i2 == 0) {
                        fg1.T(objG);
                        kl1 kl1Var = f52Var.l;
                        d52Var.k = kl1Var;
                        d52Var.p = 1;
                        if (kl1Var.d(d52Var) != k20Var) {
                            r6 = kl1Var;
                        }
                        return k20Var;
                    }
                    if (i2 == 1) {
                        il1 il1Var = d52Var.k;
                        fg1.T(objG);
                        r6 = il1Var;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                s.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vn1Var2 = d52Var.m;
                            quickJs = d52Var.l;
                            il1 il1Var2 = d52Var.k;
                            try {
                                fg1.T(objG);
                                r4 = il1Var2;
                                f52Var.o = rk2.j;
                                ((kl1) r4).f(null);
                                return a83.a;
                            } catch (CancellationException e) {
                                e = e;
                                f52Var.o = rk2Var;
                                vn1Var2.f();
                                f52Var.n = null;
                                quickJs.close();
                                f52Var.m = null;
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                f52Var.o = rk2Var;
                                vn1Var2.f();
                                f52Var.n = null;
                                quickJs.close();
                                f52Var.m = null;
                                if (!(th instanceof dg2)) {
                                    throw th;
                                }
                                String str = f52Var.h.a.c;
                                si2 si2Var = si2.m;
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "Unable to start script.";
                                }
                                throw new dg2(str, si2Var, null, message, th, 4);
                            }
                        }
                        il1 il1Var3 = d52Var.k;
                        try {
                            fg1.T(objG);
                            r3 = il1Var3;
                            d41Var = (d41) objG;
                            lf2 lf2Var = f52Var.h.d;
                            rf2VarE = lf2Var == null ? up0.E(lf2Var, d41Var) : null;
                            if (rf2VarE == null && !rf2VarE.a()) {
                                f52Var.o = rk2Var;
                                th2 th2Var = f52Var.h.a;
                                String str2 = th2Var.c;
                                si2 si2Var2 = si2.j;
                                String str3 = th2Var.j;
                                ArrayList arrayList = rf2VarE.c;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((gf2) obj).c == hf2.i) {
                                        arrayList2.add(obj);
                                    }
                                }
                                throw new dg2(str2, si2Var2, str3, du.u0(arrayList2, ", ", null, null, new eq1(16), 30), null, 16);
                            }
                            quickJsC = f52Var.c();
                            f52Var.m = quickJsC;
                            f52Var.p = quickJsC.getVersion();
                            u22 u22Var = f52Var.h;
                            eg2 eg2Var = f52Var.i;
                            df2 df2Var = f52Var.j;
                            String str4 = f52Var.p;
                            if (rf2VarE != null) {
                                d41Var = rf2VarE.b;
                            }
                            vn1Var = new vn1(u22Var, eg2Var, df2Var, str4, d41Var);
                            f52Var.n = vn1Var;
                            try {
                                f52Var.i.getClass();
                                af2.d(quickJsC, vn1Var);
                                f52Var.g(quickJsC);
                                d52Var.k = r3;
                                d52Var.l = quickJsC;
                                d52Var.m = vn1Var;
                                d52Var.p = 3;
                                if (f52Var.j(quickJsC, d52Var) != k20Var) {
                                    r4 = r3;
                                    quickJs = quickJsC;
                                    vn1Var2 = vn1Var;
                                    f52Var.o = rk2.j;
                                    ((kl1) r4).f(null);
                                    return a83.a;
                                }
                                return k20Var;
                            } catch (CancellationException e2) {
                                e = e2;
                                quickJs = quickJsC;
                                vn1Var2 = vn1Var;
                                f52Var.o = rk2Var;
                                vn1Var2.f();
                                f52Var.n = null;
                                quickJs.close();
                                f52Var.m = null;
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                quickJs = quickJsC;
                                vn1Var2 = vn1Var;
                                f52Var.o = rk2Var;
                                vn1Var2.f();
                                f52Var.n = null;
                                quickJs.close();
                                f52Var.m = null;
                                if (!(th instanceof dg2)) {
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            f52Var.o = rk2Var;
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            f52Var.o = rk2Var;
                            th2 th2Var2 = f52Var.h.a;
                            throw new dg2(th2Var2.c, si2.i, th2Var2.j, "Unable to read script config.", th);
                        }
                    }
                    if (f52Var.o != rk2.h) {
                        throw new IllegalStateException(("Script session can only be started once: " + f52Var.h.a.c).toString());
                    }
                    f52Var.o = rk2.i;
                    try {
                        tf2 tf2Var = f52Var.j.e;
                        String str5 = f52Var.h.a.c;
                        d52Var.k = r6;
                        d52Var.p = 2;
                        objG = tf2Var.g(str5, d52Var);
                        if (objG != k20Var) {
                            r3 = r6;
                            d41Var = (d41) objG;
                            lf2 lf2Var2 = f52Var.h.d;
                            if (lf2Var2 == null) {
                            }
                            if (rf2VarE == null) {
                            }
                            quickJsC = f52Var.c();
                            f52Var.m = quickJsC;
                            f52Var.p = quickJsC.getVersion();
                            u22 u22Var2 = f52Var.h;
                            eg2 eg2Var2 = f52Var.i;
                            df2 df2Var2 = f52Var.j;
                            String str42 = f52Var.p;
                            if (rf2VarE != null) {
                            }
                            vn1Var = new vn1(u22Var2, eg2Var2, df2Var2, str42, d41Var);
                            f52Var.n = vn1Var;
                            f52Var.i.getClass();
                            af2.d(quickJsC, vn1Var);
                            f52Var.g(quickJsC);
                            d52Var.k = r3;
                            d52Var.l = quickJsC;
                            d52Var.m = vn1Var;
                            d52Var.p = 3;
                            if (f52Var.j(quickJsC, d52Var) != k20Var) {
                            }
                        }
                        return k20Var;
                    } catch (CancellationException e4) {
                        e = e4;
                        f52Var.o = rk2Var;
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        f52Var.o = rk2Var;
                        th2 th2Var22 = f52Var.h.a;
                        throw new dg2(th2Var22.c, si2.i, th2Var22.j, "Unable to read script config.", th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    ((kl1) r6).f(null);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final QuickJs c() throws dg2 {
        try {
            s42 s42Var = QuickJs.Companion;
            c20 c20Var = this.k;
            s42Var.getClass();
            c20Var.getClass();
            return new QuickJs(c20Var, null);
        } catch (Throwable th) {
            this.o = rk2.m;
            String str = this.h.a.c;
            si2 si2Var = si2.k;
            String message = th.getMessage();
            if (message == null) {
                message = "Unable to create QuickJS runtime.";
            }
            throw new dg2(str, si2Var, null, message, th, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        vn1 vn1Var = this.n;
        if (vn1Var != null) {
            vn1Var.f();
        }
        this.n = null;
        QuickJs quickJs = this.m;
        if (quickJs != null) {
            quickJs.close();
        }
        this.m = null;
        this.o = rk2.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[Catch: all -> 0x0036, CancellationException -> 0x003e, TryCatch #8 {CancellationException -> 0x003e, all -> 0x0036, blocks: (B:13:0x0032, B:31:0x0089, B:33:0x00a0, B:34:0x00a6), top: B:71:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x0036, CancellationException -> 0x003e, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x003e, all -> 0x0036, blocks: (B:13:0x0032, B:31:0x0089, B:33:0x00a0, B:34:0x00a6), top: B:71:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ci2 ci2Var, u00 u00Var) throws Throwable {
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
        si2 si2Var = si2.n;
        if (u00Var instanceof a52) {
            a52Var = (a52) u00Var;
            int i = a52Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                a52Var.q = i - Integer.MIN_VALUE;
            } else {
                a52Var = new a52(this, u00Var);
            }
        }
        Object obj3 = a52Var.o;
        k20 k20Var = k20.h;
        int i2 = a52Var.q;
        int i3 = 0;
        try {
            if (i2 == 0) {
                fg1.T(obj3);
                kl1 kl1Var = this.l;
                a52Var.k = ci2Var;
                a52Var.l = kl1Var;
                a52Var.q = 1;
                Object objD = kl1Var.d(a52Var);
                il1Var = kl1Var;
                if (objD != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs = a52Var.n;
                vn1Var2 = a52Var.m;
                il1 il1Var4 = a52Var.l;
                ci2Var2 = a52Var.k;
                try {
                    fg1.T(obj3);
                    il1Var3 = il1Var4;
                    obj2 = obj3;
                    int iIntValue = ((Number) tp0.m(obj2, d72.c(Integer.TYPE), new b52(quickJs, i3))).intValue();
                    bi2Var = iIntValue >= 0 ? new bi2(0, false) : new bi2(iIntValue, true);
                    try {
                        vn1Var2.k(ci2Var2.a);
                        ((kl1) il1Var3).f(null);
                        return bi2Var;
                    } catch (Throwable th4) {
                        th = th4;
                        obj = il1Var3;
                        ((kl1) obj).f(null);
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
                        vn1Var.k(ci2Var.a);
                        throw th3;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    vn1Var = vn1Var2;
                    ci2Var = ci2Var2;
                    try {
                        String str = this.h.a.c;
                        message = th2.getMessage();
                        if (message == null) {
                            message = "Unable to dispatch the message event.";
                        }
                        throw new dg2(str, si2Var, null, message, th2, 4);
                    } catch (Throwable th7) {
                        th3 = th7;
                        vn1Var.k(ci2Var.a);
                        throw th3;
                    }
                }
            }
            il1 il1Var5 = a52Var.l;
            ci2 ci2Var3 = a52Var.k;
            fg1.T(obj3);
            il1Var = il1Var5;
            ci2Var = ci2Var3;
            QuickJs quickJsH = h();
            vn1Var = this.n;
            if (vn1Var == null) {
                throw new dg2(this.h.a.c, si2Var, null, "Script API context is unavailable.", null, 20);
            }
            try {
                vn1Var.u(ci2Var);
                a52Var.k = ci2Var;
                a52Var.l = il1Var;
                a52Var.m = vn1Var;
                a52Var.n = quickJsH;
                a52Var.q = 2;
                Object objEvaluateInternal = quickJsH.evaluateInternal("typeof globalThis.__nukeMessagingDispatch === \"function\"\n    ? globalThis.__nukeMessagingDispatch()\n    : -1", "__nuke_message__.js", false, a52Var);
                if (objEvaluateInternal != k20Var) {
                    ci2Var2 = ci2Var;
                    quickJs = quickJsH;
                    vn1Var2 = vn1Var;
                    il1Var3 = il1Var;
                    obj2 = objEvaluateInternal;
                    int iIntValue2 = ((Number) tp0.m(obj2, d72.c(Integer.TYPE), new b52(quickJs, i3))).intValue();
                    if (iIntValue2 >= 0) {
                    }
                    vn1Var2.k(ci2Var2.a);
                    ((kl1) il1Var3).f(null);
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
                String str2 = this.h.a.c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(QuickJs quickJs) throws dg2 {
        u22 u22Var = this.h;
        for (ii2 ii2Var : u22Var.b) {
            try {
                quickJs.addModule(ii2Var.a, ii2Var.b);
            } catch (Throwable th) {
                String str = u22Var.a.c;
                String str2 = ii2Var.a;
                String message = th.getMessage();
                if (message == null) {
                    message = "Unable to compile JavaScript module.";
                }
                throw new dg2(str, si2.l, str2, message, th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final QuickJs h() throws dg2 {
        si2 si2Var = si2.n;
        if (this.o == rk2.j) {
            QuickJs quickJs = this.m;
            if (quickJs != null) {
                return quickJs;
            }
            throw new dg2(this.h.a.c, si2Var, null, "QuickJS runtime is unavailable.", null, 20);
        }
        throw new dg2(this.h.a.c, si2Var, null, "Script is not running; current state is " + this.o + ".", null, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(QuickJs quickJs, u00 u00Var) throws dg2 {
        c52 c52Var;
        if (u00Var instanceof c52) {
            c52Var = (c52) u00Var;
            int i = c52Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c52Var.n = i - Integer.MIN_VALUE;
            } else {
                c52Var = new c52(this, u00Var);
            }
        }
        Object objEvaluateInternal = c52Var.l;
        int i2 = c52Var.n;
        u22 u22Var = this.h;
        int i3 = 1;
        try {
            if (i2 == 0) {
                fg1.T(objEvaluateInternal);
                String str = u22Var.a.g;
                this.i.getClass();
                String strO = tp0.O(str);
                c52Var.k = quickJs;
                c52Var.n = 1;
                objEvaluateInternal = quickJs.evaluateInternal(strO, "__nuke_bootstrap__.js", true, c52Var);
                k20 k20Var = k20.h;
                if (objEvaluateInternal == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs = c52Var.k;
                fg1.T(objEvaluateInternal);
            }
            tp0.m(objEvaluateInternal, d72.b(), new b52(quickJs, i3));
            return a83.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th2 th2Var = u22Var.a;
            String str2 = th2Var.c;
            String str3 = th2Var.g;
            String message = th.getMessage();
            if (message == null) {
                message = "Unable to evaluate the entry module.";
            }
            throw new dg2(str2, si2.m, str3, message, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0041 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x00eb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0027 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x00b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:? */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(u00 u00Var) throws dg2 {
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
        rk2 rk2Var = rk2.l;
        if (u00Var instanceof e52) {
            e52Var = (e52) u00Var;
            int i = e52Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                e52Var.r = i - Integer.MIN_VALUE;
            } else {
                e52Var = new e52(this, u00Var);
            }
        }
        Object objEvaluateInternal = e52Var.p;
        k20 k20Var = k20.h;
        ?? r54 = e52Var.r;
        int i2 = 2;
        ?? r72 = 1;
        try {
            try {
                if (r54 == 0) {
                    fg1.T(objEvaluateInternal);
                    o72 o72Var4 = new o72();
                    o72 o72Var5 = new o72();
                    kl1 kl1Var = this.l;
                    e52Var.k = o72Var4;
                    e52Var.l = o72Var5;
                    e52Var.m = kl1Var;
                    e52Var.r = 1;
                    if (kl1Var.d(e52Var) != k20Var) {
                        o72Var = o72Var5;
                        il1Var = kl1Var;
                        o72Var2 = o72Var4;
                    }
                    return k20Var;
                }
                if (r54 != 1) {
                    if (r54 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    QuickJs quickJs = e52Var.o;
                    r54 = e52Var.n;
                    r72 = e52Var.m;
                    o72Var = e52Var.l;
                    o72Var3 = e52Var.k;
                    try {
                        fg1.T(objEvaluateInternal);
                        r4 = quickJs;
                        r54 = r54;
                        r72 = r72;
                        tp0.m(objEvaluateInternal, d72.b(), new b52(r4, i2));
                    } catch (CancellationException e) {
                        e = e;
                        o72Var.i = e;
                        r54 = r54;
                        r72 = r72;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = r54;
                        r7 = r72;
                        String str = this.h.a.c;
                        si2 si2Var = si2.o;
                        message = th.getMessage();
                        if (message == null) {
                        }
                        o72Var3.i = new dg2(str, si2Var, null, message, th, 4);
                        r54 = r5;
                        r72 = r7;
                    }
                    o72Var2 = o72Var3;
                    r112 = r54;
                    r53 = r72;
                    vn1Var = this.n;
                    if (vn1Var != null) {
                        vn1Var.f();
                    }
                    this.n = null;
                    if (r112 != 0) {
                        r112.close();
                    }
                    this.m = null;
                    this.o = rk2Var;
                    r52 = r53;
                    ((kl1) r52).f(null);
                    cancellationException = (CancellationException) o72Var.i;
                    if (cancellationException != null) {
                        throw cancellationException;
                    }
                    dg2 dg2Var = (dg2) o72Var2.i;
                    if (dg2Var == null) {
                        return a83.a;
                    }
                    throw dg2Var;
                }
                il1 il1Var2 = e52Var.m;
                o72Var = e52Var.l;
                o72Var2 = e52Var.k;
                fg1.T(objEvaluateInternal);
                il1Var = il1Var2;
                if (this.o == rk2Var) {
                    r52 = il1Var;
                    ((kl1) r52).f(null);
                    cancellationException = (CancellationException) o72Var.i;
                    if (cancellationException != null) {
                    }
                } else {
                    r11 = this.m;
                    this.o = rk2.k;
                    r53 = il1Var;
                    r112 = r11;
                    if (r11 != 0) {
                        try {
                            boolean zIsClosed = r11.isClosed();
                            r53 = il1Var;
                            r112 = r11;
                            if (!zIsClosed) {
                                this.i.getClass();
                                try {
                                    e52Var.k = o72Var2;
                                    e52Var.l = o72Var;
                                    e52Var.m = il1Var;
                                    e52Var.n = r11;
                                    e52Var.o = r11;
                                    e52Var.r = 2;
                                    objEvaluateInternal = r11.evaluateInternal("const entryModule = globalThis.__nukeScript;\nif (entryModule && typeof entryModule.deactivate === \"function\") {\n    await entryModule.deactivate();\n}", "__nuke_shutdown__.js", true, e52Var);
                                } catch (CancellationException e2) {
                                    e = e2;
                                    r72 = il1Var;
                                    o72Var3 = o72Var2;
                                    r54 = r11;
                                    o72Var.i = e;
                                    r54 = r54;
                                    r72 = r72;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r7 = il1Var;
                                    o72Var3 = o72Var2;
                                    r5 = r11;
                                    String str2 = this.h.a.c;
                                    si2 si2Var2 = si2.o;
                                    message = th.getMessage();
                                    if (message == null) {
                                        message = "Script deactivation failed.";
                                    }
                                    o72Var3.i = new dg2(str2, si2Var2, null, message, th, 4);
                                    r54 = r5;
                                    r72 = r7;
                                }
                                if (objEvaluateInternal != k20Var) {
                                    r72 = il1Var;
                                    o72Var3 = o72Var2;
                                    ?? r42 = r11;
                                    r54 = r42;
                                    r4 = r42;
                                    tp0.m(objEvaluateInternal, d72.b(), new b52(r4, i2));
                                    o72Var2 = o72Var3;
                                    r112 = r54;
                                    r53 = r72;
                                }
                                return k20Var;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            vn1 vn1Var2 = this.n;
                            if (vn1Var2 != null) {
                                vn1Var2.f();
                            }
                            this.n = null;
                            if (r11 != 0) {
                                r11.close();
                            }
                            this.m = null;
                            this.o = rk2Var;
                            throw th;
                        }
                    }
                    vn1Var = this.n;
                    if (vn1Var != null) {
                    }
                    this.n = null;
                    if (r112 != 0) {
                    }
                    this.m = null;
                    this.o = rk2Var;
                    r52 = r53;
                    ((kl1) r52).f(null);
                    cancellationException = (CancellationException) o72Var.i;
                    if (cancellationException != null) {
                    }
                }
            } catch (Throwable th5) {
                ((kl1) r54).f(null);
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            r11 = r54;
        }
    }
}
