package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class go0 implements InterfaceC0596px {

    /* JADX INFO: renamed from: A */
    public int f3595A;

    /* JADX INFO: renamed from: B */
    public int f3596B;

    /* JADX INFO: renamed from: C */
    public boolean f3597C;

    /* JADX INFO: renamed from: D */
    public final fo0 f3598D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f3599E;

    /* JADX INFO: renamed from: F */
    public boolean f3600F;

    /* JADX INFO: renamed from: G */
    public pr2 f3601G;

    /* JADX INFO: renamed from: H */
    public qr2 f3602H;

    /* JADX INFO: renamed from: I */
    public tr2 f3603I;

    /* JADX INFO: renamed from: J */
    public boolean f3604J;

    /* JADX INFO: renamed from: K */
    public yy1 f3605K;

    /* JADX INFO: renamed from: L */
    public C0138dq f3606L;

    /* JADX INFO: renamed from: M */
    public final C0635qx f3607M;

    /* JADX INFO: renamed from: N */
    public ao0 f3608N;

    /* JADX INFO: renamed from: O */
    public lj0 f3609O;

    /* JADX INFO: renamed from: P */
    public sq2 f3610P;

    /* JADX INFO: renamed from: Q */
    public final C0110cy f3611Q;

    /* JADX INFO: renamed from: R */
    public final a20 f3612R;

    /* JADX INFO: renamed from: S */
    public boolean f3613S;

    /* JADX INFO: renamed from: T */
    public long f3614T;

    /* JADX INFO: renamed from: U */
    public ho0 f3615U;

    /* JADX INFO: renamed from: a */
    public final s73 f3616a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0941yx f3617b;

    /* JADX INFO: renamed from: c */
    public final qr2 f3618c;

    /* JADX INFO: renamed from: d */
    public final uk1 f3619d;

    /* JADX INFO: renamed from: e */
    public final C0138dq f3620e;

    /* JADX INFO: renamed from: f */
    public final C0138dq f3621f;

    /* JADX INFO: renamed from: g */
    public final C0485n4 f3622g;

    /* JADX INFO: renamed from: h */
    public final C0220fy f3623h;

    /* JADX INFO: renamed from: j */
    public ko0 f3625j;

    /* JADX INFO: renamed from: k */
    public int f3626k;

    /* JADX INFO: renamed from: l */
    public int f3627l;

    /* JADX INFO: renamed from: m */
    public int f3628m;

    /* JADX INFO: renamed from: o */
    public int[] f3630o;

    /* JADX INFO: renamed from: p */
    public xj1 f3631p;

    /* JADX INFO: renamed from: q */
    public boolean f3632q;

    /* JADX INFO: renamed from: r */
    public boolean f3633r;

    /* JADX INFO: renamed from: v */
    public zj1 f3637v;

    /* JADX INFO: renamed from: w */
    public boolean f3638w;

    /* JADX INFO: renamed from: y */
    public boolean f3640y;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3624i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final i11 f3629n = new i11();

    /* JADX INFO: renamed from: s */
    public final ArrayList f3634s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final i11 f3635t = new i11();

    /* JADX INFO: renamed from: u */
    public yy1 f3636u = yy1.f13674k;

    /* JADX INFO: renamed from: x */
    public final i11 f3639x = new i11();

    /* JADX INFO: renamed from: z */
    public int f3641z = -1;

    public go0(s73 s73Var, AbstractC0941yx abstractC0941yx, qr2 qr2Var, uk1 uk1Var, C0138dq c0138dq, C0138dq c0138dq2, C0485n4 c0485n4, C0220fy c0220fy) {
        this.f3616a = s73Var;
        this.f3617b = abstractC0941yx;
        this.f3618c = qr2Var;
        this.f3619d = uk1Var;
        this.f3620e = c0138dq;
        this.f3621f = c0138dq2;
        this.f3622g = c0485n4;
        this.f3623h = c0220fy;
        this.f3597C = abstractC0941yx.mo1380f() || abstractC0941yx.mo1378d();
        this.f3598D = new fo0(0, this);
        this.f3599E = new ArrayList();
        pr2 pr2VarM4274c = qr2Var.m4274c();
        pr2VarM4274c.m3950c();
        this.f3601G = pr2VarM4274c;
        qr2 qr2Var2 = new qr2();
        if (abstractC0941yx.mo1380f()) {
            qr2Var2.m4273b();
        }
        if (abstractC0941yx.mo1378d()) {
            qr2Var2.f9142r = new zj1();
        }
        this.f3602H = qr2Var2;
        tr2 tr2VarM4275d = qr2Var2.m4275d();
        tr2VarM4275d.m5414e(true);
        this.f3603I = tr2VarM4275d;
        this.f3607M = new C0635qx(this, c0138dq);
        pr2 pr2VarM4274c2 = this.f3602H.m4274c();
        try {
            ao0 ao0VarM3948a = pr2VarM4274c2.m3948a(0);
            pr2VarM4274c2.m3950c();
            this.f3608N = ao0VarM3948a;
            this.f3609O = new lj0();
            this.f3611Q = new C0110cy(this);
            a20 a20VarMo1384j = abstractC0941yx.mo1384j();
            a20 a20VarM2004z = m2004z();
            this.f3612R = a20VarMo1384j.mo14k(a20VarM2004z == null ? zd0.f13837h : a20VarM2004z);
        } catch (Throwable th) {
            pr2VarM4274c2.m3950c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: N */
    public static final int m1944N(go0 go0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        pr2 pr2Var;
        pr2 pr2Var2 = go0Var.f3601G;
        int i7 = 0;
        if (pr2Var2.m3957j(i)) {
            int iM3956i = pr2Var2.m3956i(i);
            Object objM3963p = pr2Var2.m3963p(pr2Var2.f8516b, i);
            if (iM3956i == 206 && t11.m5086l(objM3963p, AbstractC0752tx.f10990e)) {
                Object objM3955h = pr2Var2.m3955h(i, 0);
                lo0 lo0Var = objM3955h instanceof lo0 ? (lo0) objM3955h : null;
                a82 a82Var = lo0Var != null ? lo0Var.f6226a : null;
                do0 do0Var = a82Var instanceof do0 ? (do0) a82Var : null;
                if (do0Var != null) {
                    sk1 sk1Var = do0Var.f2127h.f2527e;
                    Object[] objArr = sk1Var.f10175b;
                    long[] jArr3 = sk1Var.f10174a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        go0 go0Var2 = (go0) objArr[(i8 << 3) + i11];
                                        qr2 qr2Var = go0Var2.f3618c;
                                        if (qr2Var.f9133i <= 0 || (qr2Var.f9132h[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i9;
                                        } else {
                                            C0220fy c0220fy = go0Var2.f3623h;
                                            synchronized (c0220fy.f3179k) {
                                                c0220fy.m1745p();
                                                i6 = i9;
                                                rk1 rk1Var = c0220fy.f3189u;
                                                c0220fy.f3189u = qp0.m4260o();
                                                try {
                                                    c0220fy.f3174C.m1975c0(rk1Var);
                                                } finally {
                                                }
                                            }
                                            C0138dq c0138dq = new C0138dq();
                                            go0Var2.f3606L = c0138dq;
                                            pr2 pr2VarM4274c = go0Var2.f3618c.m4274c();
                                            try {
                                                go0Var2.f3601G = pr2VarM4274c;
                                                C0635qx c0635qx = go0Var2.f3607M;
                                                C0138dq c0138dq2 = c0635qx.f9262b;
                                                try {
                                                    c0635qx.f9262b = c0138dq;
                                                    go0Var2.m1957M(0);
                                                    C0635qx c0635qx2 = go0Var2.f3607M;
                                                    c0635qx2.m4292b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (c0635qx2.f9263c) {
                                                            pr2Var = pr2VarM4274c;
                                                            try {
                                                                c0635qx2.f9262b.f2145t.m2743X(bv1.f1043c);
                                                                if (c0635qx2.f9263c) {
                                                                    c0635qx2.m4294d(false);
                                                                    c0635qx2.m4294d(false);
                                                                    c0635qx2.f9262b.f2145t.m2743X(lu1.f6329c);
                                                                    i5 = 0;
                                                                    c0635qx2.f9263c = false;
                                                                }
                                                                c0635qx.f9262b = c0138dq2;
                                                                pr2Var.m3950c();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c0635qx.f9262b = c0138dq2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            pr2Var = pr2VarM4274c;
                                                        }
                                                        c0635qx.f9262b = c0138dq2;
                                                        pr2Var.m3950c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        pr2Var.m3950c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    pr2Var = pr2VarM4274c;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                pr2Var = pr2VarM4274c;
                                            }
                                        }
                                        go0Var.f3617b.mo1392r(go0Var2.f3623h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i9;
                                    }
                                    j >>= i6;
                                    i11++;
                                    i9 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return pr2Var2.m3962o(i);
            }
            i3 = 1;
            if (!pr2Var2.m3959l(i)) {
                return pr2Var2.m3962o(i);
            }
        } else {
            i3 = 1;
            if (pr2Var2.m3951d(i)) {
                int i12 = pr2Var2.f8516b[(i * 5) + 3] + i;
                int iM1944N = 0;
                for (int i13 = i + 1; i13 < i12; i13 += pr2Var2.f8516b[(i13 * 5) + 3]) {
                    boolean zM3959l = pr2Var2.m3959l(i13);
                    if (zM3959l) {
                        go0Var.f3607M.m4293c();
                        C0635qx c0635qx3 = go0Var.f3607M;
                        Object objM3961n = pr2Var2.m3961n(i13);
                        c0635qx3.m4293c();
                        c0635qx3.f9268h.add(objM3961n);
                    }
                    iM1944N += m1944N(go0Var, i13, zM3959l || z, zM3959l ? 0 : i2 + iM1944N);
                    if (zM3959l) {
                        go0Var.f3607M.m4293c();
                        go0Var.f3607M.m4291a();
                    }
                }
                if (!pr2Var2.m3959l(i)) {
                    return iM1944N;
                }
            } else if (!pr2Var2.m3959l(i)) {
                return pr2Var2.m3962o(i);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1945A() {
        b62 b62VarM2002x;
        return (this.f3613S || this.f3640y || this.f3638w || (b62VarM2002x = m2002x()) == null || (b62VarM2002x.f614b & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public final void m1946B(ArrayList arrayList) {
        go0 go0Var = this;
        C0138dq c0138dq = go0Var.f3621f;
        C0635qx c0635qx = go0Var.f3607M;
        C0138dq c0138dq2 = c0635qx.f9262b;
        try {
            c0635qx.f9262b = c0138dq;
            c0138dq.f2145t.m2743X(zu1.f14108c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ow1 ow1Var = (ow1) arrayList.get(i);
                ui1 ui1Var = (ui1) ow1Var.f7862h;
                ui1Var.getClass();
                ao0 ao0VarM5540e = up0.m5540e(null);
                qr2 qr2VarM4992d = sr2.m4992d(null);
                int iM4272a = qr2VarM4992d.m4272a(ao0VarM5540e);
                e11 e11Var = new e11();
                c0635qx.m4292b();
                kv1 kv1Var = c0635qx.f9262b.f2145t;
                kv1Var.m2743X(iu1.f4787c);
                rg3.m4460N(kv1Var, 0, e11Var, 1, ao0VarM5540e);
                if (qr2VarM4992d == go0Var.f3602H) {
                    if (!go0Var.f3603I.f10935w) {
                        AbstractC0752tx.m5443a("Check failed");
                    }
                    go0Var.m2000v();
                }
                pr2 pr2VarM4274c = qr2VarM4992d.m4274c();
                try {
                    pr2VarM4274c.m3965r(iM4272a);
                    c0635qx.f9266f = iM4272a;
                    C0138dq c0138dq3 = new C0138dq();
                    go0Var.m1951G(null, null, null, be0.f819h, new C0678s1(go0Var, c0138dq3, pr2VarM4274c, ui1Var));
                    C0138dq c0138dq4 = c0635qx.f9262b;
                    c0138dq4.getClass();
                    if (!c0138dq3.f2145t.m2742W()) {
                        kv1 kv1Var2 = c0138dq4.f2145t;
                        kv1Var2.m2743X(eu1.f2644c);
                        rg3.m4460N(kv1Var2, 0, c0138dq3, 1, e11Var);
                    }
                    pr2VarM4274c.m3950c();
                    c0635qx.f9262b.f2145t.m2743X(bv1.f1043c);
                    i++;
                    go0Var = this;
                } catch (Throwable th) {
                    pr2VarM4274c.m3950c();
                    throw th;
                }
            }
            c0635qx.m4292b();
            c0635qx.f9262b.f2145t.m2743X(mu1.f6883c);
            c0635qx.f9266f = 0;
            c0635qx.f9262b = c0138dq2;
        } catch (Throwable th2) {
            c0635qx.f9262b = c0138dq2;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1947C(yy1 yy1Var, Object obj) {
        m1962S(126665345, 0, null, null);
        m1948D();
        m1983g0(obj);
        long j = this.f3614T;
        try {
            this.f3614T = 126665345L;
            if (this.f3613S) {
                tr2.m5388z(this.f3603I);
            }
            boolean z = (this.f3613S || t11.m5086l(this.f3601G.m3953f(), yy1Var)) ? false : true;
            if (z) {
                m1954J(yy1Var);
            }
            m1962S(202, 0, AbstractC0752tx.f10988c, yy1Var);
            this.f3605K = null;
            boolean z2 = this.f3638w;
            this.f3638w = z;
            rg3.m4452F(this, new C0402kw(-59194059, true, new C0686s9(7, obj)));
            this.f3638w = z2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object m1948D() {
        boolean z = this.f3613S;
        C0160eb c0160eb = C0520nx.f7360a;
        if (!z) {
            Object objM3960m = this.f3601G.m3960m();
            if (!this.f3640y || (objM3960m instanceof ba2)) {
                return objM3960m;
            }
        } else if (this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected");
            return c0160eb;
        }
        return c0160eb;
    }

    /* JADX INFO: renamed from: E */
    public final List m1949E() {
        AbstractC0941yx abstractC0941yx = this.f3617b;
        InterfaceC0902xx interfaceC0902xxMo1382h = abstractC0941yx.mo1382h();
        C0220fy c0220fy = interfaceC0902xxMo1382h != null ? (C0220fy) interfaceC0902xxMo1382h : null;
        if (c0220fy != null) {
            qr2 qr2Var = c0220fy.f3181m;
            pr2 pr2VarM4274c = sr2.m4992d(qr2Var).m4274c();
            try {
                Integer numM3782r = AbstractC0570p7.m3782r(pr2VarM4274c, abstractC0941yx, 0, pr2VarM4274c.f8517c);
                if (numM3782r != null) {
                    pr2VarM4274c = sr2.m4992d(qr2Var).m4274c();
                    try {
                        ArrayList arrayListM3760P = AbstractC0570p7.m3760P(pr2VarM4274c, numM3782r.intValue(), 0);
                        pr2VarM4274c.m3950c();
                        return AbstractC0142du.m1168x0(arrayListM3760P, c0220fy.f3174C.m1949E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return be0.f819h;
    }

    /* JADX INFO: renamed from: F */
    public final int m1950F(int i) {
        int iM3964q = this.f3601G.m3964q(i) + 1;
        int i2 = 0;
        while (iM3964q < i) {
            if (!this.f3601G.m3958k(iM3964q)) {
                i2++;
            }
            iM3964q += this.f3601G.f8516b[(iM3964q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1951G(C0220fy c0220fy, C0220fy c0220fy2, Integer num, List list, xm0 xm0Var) {
        Object objMo6a;
        boolean z = this.f3600F;
        int i = this.f3626k;
        try {
            this.f3600F = true;
            this.f3626k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ow1 ow1Var = (ow1) list.get(i2);
                b62 b62Var = (b62) ow1Var.f7862h;
                Object obj = ow1Var.f7863i;
                if (obj != null) {
                    m1973b0(b62Var, obj);
                } else {
                    m1973b0(b62Var, null);
                }
            }
            if (c0220fy == null) {
                objMo6a = xm0Var.mo6a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (c0220fy2 == null || c0220fy2 == c0220fy || iIntValue < 0) {
                    objMo6a = xm0Var.mo6a();
                } else {
                    c0220fy.f3193y = c0220fy2;
                    c0220fy.f3194z = iIntValue;
                    try {
                        objMo6a = xm0Var.mo6a();
                        c0220fy.f3193y = null;
                        c0220fy.f3194z = 0;
                    } catch (Throwable th) {
                        c0220fy.f3193y = null;
                        c0220fy.f3194z = 0;
                        throw th;
                    }
                }
                if (objMo6a == null) {
                }
            }
            this.f3600F = z;
            this.f3626k = i;
            return objMo6a;
        } catch (Throwable th2) {
            this.f3600F = z;
            this.f3626k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1952H() {
        b21 b21Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        gk1 gk1Var;
        long j2;
        int iM3781q;
        int i8;
        int iHashCode;
        Object objM3949b;
        C0700sn c0700sn = C0700sn.f10216T;
        boolean z2 = this.f3600F;
        this.f3600F = true;
        pr2 pr2Var = this.f3601G;
        int i9 = pr2Var.f8523i;
        int i10 = (i9 * 5) + 3;
        int i11 = pr2Var.f8516b[i10] + i9;
        int i12 = this.f3626k;
        long j3 = this.f3614T;
        int i13 = this.f3627l;
        int i14 = this.f3628m;
        int i15 = pr2Var.f8521g;
        ArrayList arrayList = this.f3634s;
        int iM3781q2 = AbstractC0570p7.m3781q(i15, arrayList);
        if (iM3781q2 < 0) {
            iM3781q2 = -(iM3781q2 + 1);
        }
        if (iM3781q2 < arrayList.size()) {
            b21Var = (b21) arrayList.get(iM3781q2);
            if (b21Var.f536b >= i11) {
                b21Var = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (b21Var != null) {
            b62 b62Var = b21Var.f535a;
            int i19 = b21Var.f536b;
            C0700sn c0700sn2 = c0700sn;
            int iM3781q3 = AbstractC0570p7.m3781q(i19, arrayList);
            if (iM3781q3 >= 0) {
            }
            Object obj = b21Var.f537c;
            if (obj == null) {
                b62Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                rk1 rk1Var = b62Var.f619g;
                if (rk1Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof n70) {
                        n70 n70Var = (n70) obj;
                        ks2 ks2Var = n70Var.f7031j;
                        if (ks2Var == null) {
                            ks2Var = c0700sn2;
                        }
                        i2 = i12;
                        i6 = !ks2Var.mo1841c(n70Var.m3254h().f6496f, rk1Var.m4505g(n70Var)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof sk1) {
                            sk1 sk1Var = (sk1) obj;
                            if (sk1Var.m4889h()) {
                                Object[] objArr = sk1Var.f10175b;
                                long[] jArr = sk1Var.f10174a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof n70)) {
                                                        break;
                                                    }
                                                    n70 n70Var2 = (n70) obj2;
                                                    ks2 ks2Var2 = n70Var2.f7031j;
                                                    if (ks2Var2 == null) {
                                                        ks2Var2 = c0700sn2;
                                                    }
                                                    if (!ks2Var2.mo1841c(n70Var2.m3254h().f6496f, rk1Var.m4505g(n70Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.f3601G.m3965r(i19);
                        int i24 = this.f3601G.f8521g;
                        m1955K(i17, i24, i9);
                        int iM3964q = this.f3601G.m3964q(i24);
                        while (iM3964q != i9 && !this.f3601G.m3959l(iM3964q)) {
                            iM3964q = this.f3601G.m3964q(iM3964q);
                        }
                        int iM1985h0 = this.f3601G.m3959l(iM3964q) ? 0 : i2;
                        if (iM3964q != i24) {
                            int iM1985h02 = (m1985h0(iM3964q) - this.f3601G.m3962o(i24)) + iM1985h0;
                            while (iM1985h0 < iM1985h02 && iM3964q != i19) {
                                iM3964q++;
                                while (iM3964q < i19) {
                                    pr2 pr2Var2 = this.f3601G;
                                    int i25 = pr2Var2.f8516b[(iM3964q * 5) + 3] + iM3964q;
                                    if (i19 >= i25) {
                                        iM1985h0 += pr2Var2.m3959l(iM3964q) ? i16 : m1985h0(iM3964q);
                                        iM3964q = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.f3626k = iM1985h0;
                        this.f3628m = m1950F(i24);
                        int iM3964q2 = this.f3601G.m3964q(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iM3964q2 < 0) {
                                break;
                            }
                            if (iM3964q2 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            pr2 pr2Var3 = this.f3601G;
                            boolean zM3958k = pr2Var3.m3958k(iM3964q2);
                            int[] iArr = pr2Var3.f8516b;
                            if (zM3958k) {
                                Object objM3963p = pr2Var3.m3963p(iArr, iM3964q2);
                                if (objM3963p != null) {
                                    iHashCode = objM3963p instanceof Enum ? ((Enum) objM3963p).ordinal() : objM3963p.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int iM3956i = pr2Var3.m3956i(iM3964q2);
                                i8 = i24;
                                iHashCode = (iM3956i != 207 || (objM3949b = pr2Var3.m3949b(iArr, iM3964q2)) == null || objM3949b.equals(C0520nx.f7360a)) ? iM3956i : objM3949b.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.f3601G.m3958k(iM3964q2) ? 0 : m1950F(iM3964q2), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iM3964q2 = this.f3601G.m3964q(iM3964q2);
                            i24 = i8;
                        }
                        this.f3614T = jRotateLeft;
                        this.f3605K = null;
                        mn0 mn0Var = b62Var.f616d;
                        if (mn0Var == null) {
                            C0676s.m4653l("Invalid restart scope");
                            return;
                        }
                        mn0Var.mo12g(this, Integer.valueOf(i16));
                        this.f3605K = null;
                        pr2 pr2Var4 = this.f3601G;
                        int i28 = pr2Var4.f8516b[i] + i9;
                        int i29 = pr2Var4.f8521g;
                        if (((i29 < i9 || i29 > i28) ? 0 : i16) == 0) {
                            AbstractC0752tx.m5443a("Index " + i9 + " is not a parent of " + i29);
                        }
                        pr2Var4.f8523i = i9;
                        pr2Var4.f8522h = i28;
                        pr2Var4.f8526l = 0;
                        pr2Var4.f8527m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.f3599E;
                        arrayList2.add(b62Var);
                        this.f3622g.m3237m();
                        C0220fy c0220fy = b62Var.f613a;
                        if (c0220fy == null || (gk1Var = b62Var.f618f) == null) {
                            z = z2;
                        } else {
                            b62Var.m444d(i16);
                            try {
                                Object[] objArr3 = gk1Var.f3553b;
                                int[] iArr2 = gk1Var.f3554c;
                                long[] jArr2 = gk1Var.f3552a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i30 = 0;
                                    while (true) {
                                        long j5 = jArr2[i30];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                            int i32 = 0;
                                            while (i32 < i31) {
                                                if ((j5 & 255) < 128) {
                                                    int i33 = (i30 << 3) + i32;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i33];
                                                    int i34 = iArr2[i33];
                                                    c0220fy.m1754y(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i32++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i31 != 8) {
                                                break;
                                            }
                                        }
                                        if (i30 == length2) {
                                            break;
                                        }
                                        i30++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                b62Var.m444d(false);
                            } catch (Throwable th) {
                                b62Var.m444d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iM3781q = AbstractC0570p7.m3781q(this.f3601G.f8521g, arrayList);
                    if (iM3781q < 0) {
                        iM3781q = -(iM3781q + 1);
                    }
                    if (iM3781q >= arrayList.size()) {
                        b21 b21Var2 = (b21) arrayList.get(iM3781q);
                        i11 = i3;
                        b21Var = b21Var2.f536b < i11 ? b21Var2 : null;
                        z2 = z;
                        c0700sn = c0700sn2;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    c0700sn = c0700sn2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iM3781q = AbstractC0570p7.m3781q(this.f3601G.f8521g, arrayList);
            if (iM3781q < 0) {
            }
            if (iM3781q >= arrayList.size()) {
            }
            z2 = z;
            c0700sn = c0700sn2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i35 = i12;
        int i36 = i13;
        int i37 = i14;
        if (i18 != 0) {
            m1955K(i17, i9, i9);
            this.f3601G.m3967t();
            int iM1985h03 = m1985h0(i9);
            this.f3626k = i35 + iM1985h03;
            this.f3627l = i36 + iM1985h03;
            this.f3628m = i37;
        } else {
            m1960Q();
        }
        this.f3614T = j3;
        this.f3600F = z3;
    }

    /* JADX INFO: renamed from: I */
    public final void m1953I() throws Throwable {
        int i;
        m1957M(this.f3601G.f8521g);
        C0635qx c0635qx = this.f3607M;
        c0635qx.m4294d(false);
        i11 i11Var = c0635qx.f9264d;
        go0 go0Var = c0635qx.f9261a;
        pr2 pr2Var = go0Var.f3601G;
        if (pr2Var.f8517c > 0 && i11Var.m2241a(-2) != (i = pr2Var.f8523i)) {
            if (!c0635qx.f9263c && c0635qx.f9265e) {
                c0635qx.m4294d(false);
                c0635qx.f9262b.f2145t.m2743X(pu1.f8615c);
                c0635qx.f9263c = true;
            }
            if (i > 0) {
                ao0 ao0VarM3948a = pr2Var.m3948a(i);
                i11Var.m2243c(i);
                c0635qx.m4294d(false);
                kv1 kv1Var = c0635qx.f9262b.f2145t;
                kv1Var.m2743X(ou1.f7848c);
                rg3.m4459M(kv1Var, 0, ao0VarM3948a);
                c0635qx.f9263c = true;
            }
        }
        c0635qx.f9262b.f2145t.m2743X(xu1.f13179c);
        int i2 = c0635qx.f9266f;
        pr2 pr2Var2 = go0Var.f3601G;
        c0635qx.f9266f = pr2Var2.f8516b[(pr2Var2.f8521g * 5) + 3] + i2;
    }

    /* JADX INFO: renamed from: J */
    public final void m1954J(yy1 yy1Var) {
        zj1 zj1Var = this.f3637v;
        if (zj1Var == null) {
            zj1Var = new zj1();
            this.f3637v = zj1Var;
        }
        zj1Var.m6421h(this.f3601G.f8521g, yy1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1955K(int i, int i2, int i3) {
        pr2 pr2Var = this.f3601G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (pr2Var.m3964q(i) == i2) {
                    i3 = i2;
                } else if (pr2Var.m3964q(i2) == i) {
                    i3 = i;
                } else if (pr2Var.m3964q(i) == pr2Var.m3964q(i2)) {
                    i3 = pr2Var.m3964q(i);
                } else {
                    int iM3964q = i;
                    int i4 = 0;
                    while (iM3964q > 0 && iM3964q != i3) {
                        iM3964q = pr2Var.m3964q(iM3964q);
                        i4++;
                    }
                    int iM3964q2 = i2;
                    int i5 = 0;
                    while (iM3964q2 > 0 && iM3964q2 != i3) {
                        iM3964q2 = pr2Var.m3964q(iM3964q2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iM3964q3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iM3964q3 = pr2Var.m3964q(iM3964q3);
                    }
                    int i8 = i5 - i4;
                    int iM3964q4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iM3964q4 = pr2Var.m3964q(iM3964q4);
                    }
                    i3 = iM3964q3;
                    for (int iM3964q5 = iM3964q4; i3 != iM3964q5; iM3964q5 = pr2Var.m3964q(iM3964q5)) {
                        i3 = pr2Var.m3964q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (pr2Var.m3959l(i)) {
                this.f3607M.m4291a();
            }
            i = pr2Var.m3964q(i);
        }
        m1993o(i2, i3);
    }

    /* JADX INFO: renamed from: L */
    public final Object m1956L() {
        boolean z = this.f3613S;
        C0160eb c0160eb = C0520nx.f7360a;
        if (!z) {
            Object objM3960m = this.f3601G.m3960m();
            if (!this.f3640y || (objM3960m instanceof ba2)) {
                return objM3960m instanceof lo0 ? ((lo0) objM3960m).f6226a : objM3960m;
            }
        } else if (this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected");
            return c0160eb;
        }
        return c0160eb;
    }

    /* JADX INFO: renamed from: M */
    public final void m1957M(int i) throws Throwable {
        boolean zM3959l = this.f3601G.m3959l(i);
        C0635qx c0635qx = this.f3607M;
        if (zM3959l) {
            c0635qx.m4293c();
            Object objM3961n = this.f3601G.m3961n(i);
            c0635qx.m4293c();
            c0635qx.f9268h.add(objM3961n);
        }
        m1944N(this, i, zM3959l, 0);
        c0635qx.m4293c();
        if (zM3959l) {
            c0635qx.m4291a();
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1958O(int i, boolean z) {
        b62 b62VarM2002x;
        if ((i & 1) == 0 && (this.f3613S || this.f3640y)) {
            sq2 sq2Var = this.f3610P;
            if (sq2Var != null && (b62VarM2002x = m2002x()) != null && sq2Var.mo683a()) {
                int i2 = b62VarM2002x.f614b;
                if ((i2 & AIChatConfig.DefaultMaxTokens) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                b62VarM2002x.f614b = i3;
                b62VarM2002x.f614b = (this.f3640y ? i2 | 129 : i3 & (-129)) | 256;
                kv1 kv1Var = this.f3607M.f9262b.f2145t;
                kv1Var.m2743X(wu1.f12652c);
                rg3.m4459M(kv1Var, 0, b62VarM2002x);
                this.f3617b.mo1391q(b62VarM2002x);
                return false;
            }
        } else if (!z && m1945A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1959P() {
        long jRotateLeft;
        if (this.f3634s.isEmpty()) {
            this.f3627l = this.f3601G.m3966s() + this.f3627l;
            return;
        }
        pr2 pr2Var = this.f3601G;
        int iM3954g = pr2Var.m3954g();
        int[] iArr = pr2Var.f8516b;
        int i = pr2Var.f8521g;
        Object objM3963p = i < pr2Var.f8522h ? pr2Var.m3963p(iArr, i) : null;
        Object objM3953f = pr2Var.m3953f();
        int i2 = this.f3628m;
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM3963p != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) (objM3963p instanceof Enum ? ((Enum) objM3963p).ordinal() : objM3963p.hashCode())), 3);
        } else {
            if (objM3953f != null && iM3954g == 207 && !objM3953f.equals(c0160eb)) {
                this.f3614T = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) objM3953f.hashCode()), 3) ^ ((long) i2);
                m1965V(null, (iArr[(pr2Var.f8521g * 5) + 1] & 1073741824) != 0);
                m1952H();
                pr2Var.m3952e();
                if (objM3963p == null) {
                    if (objM3963p instanceof Enum) {
                        this.f3614T = Long.rotateRight(Long.rotateRight(this.f3614T, 3) ^ ((long) ((Enum) objM3963p).ordinal()), 3);
                        return;
                    } else {
                        this.f3614T = Long.rotateRight(Long.rotateRight(this.f3614T, 3) ^ ((long) objM3963p.hashCode()), 3);
                        return;
                    }
                }
                if (objM3953f == null || iM3954g != 207 || objM3953f.equals(c0160eb)) {
                    this.f3614T = Long.rotateRight(((long) iM3954g) ^ Long.rotateRight(this.f3614T ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.f3614T = Long.rotateRight(Long.rotateRight(this.f3614T ^ ((long) i2), 3) ^ ((long) objM3953f.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) iM3954g), 3) ^ ((long) i2);
        }
        this.f3614T = jRotateLeft;
        m1965V(null, (iArr[(pr2Var.f8521g * 5) + 1] & 1073741824) != 0);
        m1952H();
        pr2Var.m3952e();
        if (objM3963p == null) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1960Q() {
        pr2 pr2Var = this.f3601G;
        int i = pr2Var.f8523i;
        this.f3627l = i >= 0 ? pr2Var.f8516b[(i * 5) + 1] & 67108863 : 0;
        pr2Var.m3967t();
    }

    /* JADX INFO: renamed from: R */
    public final void m1961R() {
        if (this.f3627l != 0) {
            AbstractC0752tx.m5443a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f3613S) {
            return;
        }
        b62 b62VarM2002x = m2002x();
        if (b62VarM2002x != null) {
            int i = b62VarM2002x.f614b;
            if ((i & 128) == 0) {
                b62VarM2002x.f614b = i | 16;
            }
        }
        if (this.f3634s.isEmpty()) {
            m1960Q();
        } else {
            m1952H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1962S(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        ko0 ko0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.f3628m;
        Object obj4 = C0520nx.f7360a;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.f3614T = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.f3628m++;
                }
                boolean z3 = i2 == 0;
                if (!this.f3613S) {
                    this.f3601G.f8525k++;
                    tr2 tr2Var = this.f3603I;
                    int i10 = tr2Var.f10932t;
                    if (z3) {
                        tr2Var.m5405Q(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        tr2Var.m5405Q(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        tr2Var.m5405Q(i, obj3, obj4, false);
                    }
                    ko0 ko0Var2 = this.f3625j;
                    if (ko0Var2 != null) {
                        int i11 = (-2) - i10;
                        e51 e51Var = new e51(i, i11, -1, -1);
                        ko0Var2.f5692e.m6421h(i11, new br0(-1, this.f3626k - ko0Var2.f5689b, 0));
                        ko0Var2.f5691d.add(e51Var);
                    }
                    m1999u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.f3640y;
                if (this.f3625j == null) {
                    int iM3954g = this.f3601G.m3954g();
                    if (!z4 && iM3954g == i) {
                        pr2 pr2Var = this.f3601G;
                        int i12 = pr2Var.f8521g;
                        if (t11.m5086l(obj3, i12 < pr2Var.f8522h ? pr2Var.m3963p(pr2Var.f8516b, i12) : null)) {
                            m1965V(obj2, z3);
                            z = z4;
                        }
                    }
                    pr2 pr2Var2 = this.f3601G;
                    int[] iArr = pr2Var2.f8516b;
                    ArrayList arrayList = new ArrayList();
                    if (pr2Var2.f8525k <= 0) {
                        int i13 = pr2Var2.f8521g;
                        while (i13 < pr2Var2.f8522h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objM3963p = pr2Var2.m3963p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new e51(i15, i13, i8, objM3963p));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.f3625j = new ko0(this.f3626k, arrayList);
                } else {
                    z = z4;
                }
                ko0 ko0Var3 = this.f3625j;
                if (ko0Var3 != null) {
                    ArrayList arrayList2 = ko0Var3.f5691d;
                    zj1 zj1Var = ko0Var3.f5692e;
                    int i17 = ko0Var3.f5689b;
                    Object s21Var = obj3 != null ? new s21(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    rk1 rk1Var = ((rj1) ko0Var3.f5693f.getValue()).f9606a;
                    Object objM4505g = rk1Var.m4505g(s21Var);
                    if (objM4505g == null) {
                        objM4505g = null;
                    } else if (objM4505g instanceof lk1) {
                        lk1 lk1Var = (lk1) objM4505g;
                        Object objM2935k = lk1Var.m2935k(0);
                        if (lk1Var.m2932h()) {
                            rk1Var.m4509k(s21Var);
                        }
                        if (lk1Var.f6164b == 1) {
                            rk1Var.m4511m(s21Var, lk1Var.m2929e());
                        }
                        objM4505g = objM2935k;
                    } else {
                        rk1Var.m4509k(s21Var);
                    }
                    e51 e51Var2 = (e51) objM4505g;
                    if (z || e51Var2 == null) {
                        this.f3601G.f8525k++;
                        this.f3613S = true;
                        this.f3605K = null;
                        if (this.f3603I.f10935w) {
                            tr2 tr2VarM4275d = this.f3602H.m4275d();
                            this.f3603I = tr2VarM4275d;
                            tr2VarM4275d.m5401M();
                            this.f3604J = false;
                            this.f3605K = null;
                        }
                        this.f3603I.m5413d();
                        tr2 tr2Var2 = this.f3603I;
                        int i18 = tr2Var2.f10932t;
                        if (z3) {
                            tr2Var2.m5405Q(i, obj4, obj4, true);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            tr2Var2.m5405Q(i, obj4, obj2, false);
                        } else {
                            i3 = 0;
                            tr2Var2.m5405Q(i, obj == null ? obj4 : obj, obj4, false);
                        }
                        this.f3608N = this.f3603I.m5411b(i18);
                        int i19 = (-2) - i18;
                        e51 e51Var3 = new e51(i, i19, -1, -1);
                        zj1Var.m6421h(i19, new br0(-1, this.f3626k - i17, i3));
                        arrayList2.add(e51Var3);
                        ko0Var = new ko0(z3 ? i3 : this.f3626k, new ArrayList());
                    } else {
                        int i20 = e51Var2.f2311c;
                        arrayList2.add(e51Var2);
                        br0 br0Var = (br0) zj1Var.m6022b(i20);
                        this.f3626k = (br0Var != null ? br0Var.f990b : -1) + i17;
                        br0 br0Var2 = (br0) zj1Var.m6022b(i20);
                        int i21 = br0Var2 != null ? br0Var2.f989a : -1;
                        int i22 = ko0Var3.f5690c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = zj1Var.f12751c;
                            long[] jArr = zj1Var.f12749a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                br0 br0Var3 = (br0) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = br0Var3.f989a;
                                                if (i28 == i21) {
                                                    br0Var3.f989a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    br0Var3.f989a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = zj1Var.f12751c;
                                long[] jArr2 = zj1Var.f12749a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    br0 br0Var4 = (br0) objArr4[(i29 << 3) + i31];
                                                    int i32 = br0Var4.f989a;
                                                    if (i32 == i21) {
                                                        br0Var4.f989a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            br0Var4.f989a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        C0635qx c0635qx = this.f3607M;
                        int i33 = c0635qx.f9266f;
                        go0 go0Var = c0635qx.f9261a;
                        c0635qx.f9266f = (i20 - go0Var.f3601G.f8521g) + i33;
                        this.f3601G.m3965r(i20);
                        if (i4 > 0) {
                            c0635qx.m4294d(false);
                            i11 i11Var = c0635qx.f9264d;
                            pr2 pr2Var3 = go0Var.f3601G;
                            if (pr2Var3.f8517c > 0 && i11Var.m2241a(-2) != (i5 = pr2Var3.f8523i)) {
                                if (!c0635qx.f9263c && c0635qx.f9265e) {
                                    c0635qx.m4294d(false);
                                    c0635qx.f9262b.f2145t.m2743X(pu1.f8615c);
                                    c0635qx.f9263c = true;
                                }
                                if (i5 > 0) {
                                    ao0 ao0VarM3948a = pr2Var3.m3948a(i5);
                                    i11Var.m2243c(i5);
                                    c0635qx.m4294d(false);
                                    kv1 kv1Var = c0635qx.f9262b.f2145t;
                                    kv1Var.m2743X(ou1.f7848c);
                                    rg3.m4459M(kv1Var, 0, ao0VarM3948a);
                                    c0635qx.f9263c = true;
                                }
                            }
                            kv1 kv1Var2 = c0635qx.f9262b.f2145t;
                            kv1Var2.m2743X(tu1.f10967c);
                            kv1Var2.f5827o[kv1Var2.f5828p - kv1Var2.f5825m[kv1Var2.f5826n - 1].f4804a] = i4;
                        }
                        m1965V(obj2, z3);
                        ko0Var = null;
                    }
                } else {
                    ko0Var = null;
                }
                m1999u(z3, ko0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.f3614T = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.f3613S) {
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m1963T() {
        m1962S(-127, 0, null, null);
    }

    /* JADX INFO: renamed from: U */
    public final void m1964U(int i, yt1 yt1Var) {
        m1962S(i, 0, yt1Var, null);
    }

    /* JADX INFO: renamed from: V */
    public final void m1965V(Object obj, boolean z) {
        if (z) {
            pr2 pr2Var = this.f3601G;
            if (pr2Var.f8525k <= 0) {
                if ((pr2Var.f8516b[(pr2Var.f8521g * 5) + 1] & 1073741824) == 0) {
                    j22.m2429a("Expected a node group");
                }
                pr2Var.m3968u();
                return;
            }
            return;
        }
        if (obj != null && this.f3601G.m3953f() != obj) {
            C0635qx c0635qx = this.f3607M;
            c0635qx.getClass();
            c0635qx.m4294d(false);
            kv1 kv1Var = c0635qx.f9262b.f2145t;
            kv1Var.m2743X(ev1.f2654c);
            rg3.m4459M(kv1Var, 0, obj);
        }
        this.f3601G.m3968u();
    }

    /* JADX INFO: renamed from: W */
    public final void m1966W(int i) {
        int i2;
        int i3;
        if (this.f3625j != null) {
            m1962S(i, 0, null, null);
            return;
        }
        if (this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f3614T = Long.rotateLeft(Long.rotateLeft(this.f3614T, 3) ^ ((long) i), 3) ^ ((long) this.f3628m);
        this.f3628m++;
        pr2 pr2Var = this.f3601G;
        boolean z = this.f3613S;
        C0160eb c0160eb = C0520nx.f7360a;
        if (z) {
            pr2Var.f8525k++;
            this.f3603I.m5405Q(i, c0160eb, c0160eb, false);
            m1999u(false, null);
            return;
        }
        if (pr2Var.m3954g() == i && ((i3 = pr2Var.f8521g) >= pr2Var.f8522h || (pr2Var.f8516b[(i3 * 5) + 1] & 536870912) == 0)) {
            pr2Var.m3968u();
            m1999u(false, null);
            return;
        }
        if (pr2Var.f8525k <= 0 && (i2 = pr2Var.f8521g) != pr2Var.f8522h) {
            int i4 = this.f3626k;
            m1953I();
            this.f3607M.m4295e(i4, pr2Var.m3966s());
            AbstractC0570p7.m3773i(this.f3634s, i2, pr2Var.f8521g);
        }
        pr2Var.f8525k++;
        this.f3613S = true;
        this.f3605K = null;
        if (this.f3603I.f10935w) {
            tr2 tr2VarM4275d = this.f3602H.m4275d();
            this.f3603I = tr2VarM4275d;
            tr2VarM4275d.m5401M();
            this.f3604J = false;
            this.f3605K = null;
        }
        tr2 tr2Var = this.f3603I;
        tr2Var.m5413d();
        int i5 = tr2Var.f10932t;
        tr2Var.m5405Q(i, c0160eb, c0160eb, false);
        this.f3608N = tr2Var.m5411b(i5);
        m1999u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final go0 m1967X(int i) {
        b62 b62Var;
        boolean z;
        m1966W(i);
        boolean z2 = this.f3613S;
        C0485n4 c0485n4 = this.f3622g;
        ArrayList arrayList = this.f3599E;
        C0220fy c0220fy = this.f3623h;
        if (z2) {
            b62 b62Var2 = new b62(c0220fy);
            arrayList.add(b62Var2);
            m1983g0(b62Var2);
            b62Var2.f617e = this.f3596B;
            b62Var2.f614b &= -17;
            c0485n4.m3237m();
            return this;
        }
        int i2 = this.f3601G.f8523i;
        ArrayList arrayList2 = this.f3634s;
        int iM3781q = AbstractC0570p7.m3781q(i2, arrayList2);
        b21 b21Var = iM3781q >= 0 ? (b21) arrayList2.remove(iM3781q) : null;
        Object objM3960m = this.f3601G.m3960m();
        if (t11.m5086l(objM3960m, C0520nx.f7360a)) {
            b62Var = new b62(c0220fy);
            m1983g0(b62Var);
        } else {
            objM3960m.getClass();
            b62Var = (b62) objM3960m;
        }
        if (b21Var == null) {
            int i3 = b62Var.f614b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                b62Var.f614b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = b62Var.f614b;
        b62Var.f614b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(b62Var);
        b62Var.f617e = this.f3596B;
        b62Var.f614b &= -17;
        c0485n4.m3237m();
        int i5 = b62Var.f614b;
        if ((i5 & 256) != 0) {
            b62Var.f614b = (i5 & (-257)) | AIChatConfig.DefaultMaxTokens;
            kv1 kv1Var = this.f3607M.f9262b.f2145t;
            kv1Var.m2743X(cv1.f1746c);
            rg3.m4459M(kv1Var, 0, b62Var);
            if (!this.f3640y) {
                int i6 = b62Var.f614b;
                if ((i6 & 128) != 0) {
                    this.f3640y = true;
                    this.f3641z = this.f3601G.f8523i;
                    b62Var.f614b = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: Y */
    public final void m1968Y(Object obj) {
        if (!this.f3613S && this.f3601G.m3954g() == 207 && !t11.m5086l(this.f3601G.m3953f(), obj) && this.f3641z < 0) {
            this.f3641z = this.f3601G.f8521g;
            this.f3640y = true;
        }
        m1962S(207, 0, null, obj);
    }

    /* JADX INFO: renamed from: Z */
    public final void m1969Z() {
        m1962S(125, 2, null, null);
        this.f3633r = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m1970a() {
        m1986i();
        this.f3624i.clear();
        this.f3629n.f4215b = 0;
        this.f3635t.f4215b = 0;
        this.f3639x.f4215b = 0;
        this.f3637v = null;
        lj0 lj0Var = this.f3609O;
        lj0Var.f6145n.m2740U();
        lj0Var.f6144m.m2740U();
        this.f3614T = 0L;
        this.f3595A = 0;
        this.f3633r = false;
        this.f3613S = false;
        this.f3640y = false;
        this.f3600F = false;
        this.f3641z = -1;
        pr2 pr2Var = this.f3601G;
        if (!pr2Var.f8520f) {
            pr2Var.m3950c();
        }
        if (this.f3603I.f10935w) {
            return;
        }
        m2000v();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a0 */
    public final void m1971a0() {
        this.f3628m = 0;
        this.f3601G = this.f3618c.m4274c();
        m1962S(100, 0, null, null);
        AbstractC0941yx abstractC0941yx = this.f3617b;
        abstractC0941yx.mo1394t();
        yy1 yy1VarMo1383i = abstractC0941yx.mo1383i();
        this.f3639x.m2243c(this.f3638w ? 1 : 0);
        this.f3638w = m1980f(yy1VarMo1383i);
        this.f3605K = null;
        if (!this.f3632q) {
            this.f3632q = abstractC0941yx.mo1379e();
        }
        if (!this.f3597C) {
            this.f3597C = abstractC0941yx.mo1380f();
        }
        if (this.f3597C) {
            tu2 tu2Var = AbstractC0183ey.f2674a;
            tu2Var.getClass();
            yy1VarMo1383i = yy1VarMo1383i.m6370d(tu2Var, new uu2(m2004z()));
        }
        this.f3636u = yy1VarMo1383i;
        Set set = (Set) op0.m3600w(yy1VarMo1383i, k01.f5293a);
        if (set != null) {
            set.add(m2001w());
            abstractC0941yx.mo1389o(set);
        }
        m1962S(Long.hashCode(abstractC0941yx.mo1381g()), 0, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m1972b(mn0 mn0Var, Object obj) {
        if (this.f3613S) {
            kv1 kv1Var = this.f3609O.f6144m;
            kv1Var.m2743X(fv1.f3150c);
            rg3.m4459M(kv1Var, 0, obj);
            mn0Var.getClass();
            xe1.m6119f(2, mn0Var);
            rg3.m4459M(kv1Var, 1, mn0Var);
            return;
        }
        C0635qx c0635qx = this.f3607M;
        c0635qx.m4292b();
        kv1 kv1Var2 = c0635qx.f9262b.f2145t;
        kv1Var2.m2743X(fv1.f3150c);
        mn0Var.getClass();
        xe1.m6119f(2, mn0Var);
        rg3.m4460N(kv1Var2, 0, obj, 1, mn0Var);
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m1973b0(b62 b62Var, Object obj) {
        ao0 ao0Var = b62Var.f615c;
        if (ao0Var == null) {
            return false;
        }
        int iM4272a = this.f3601G.f8515a.m4272a(up0.m5540e(ao0Var));
        if (!this.f3600F || iM4272a < this.f3601G.f8521g) {
            return false;
        }
        ArrayList arrayList = this.f3634s;
        int iM3781q = AbstractC0570p7.m3781q(iM4272a, arrayList);
        if (iM3781q < 0) {
            int i = -(iM3781q + 1);
            if (!(obj instanceof n70)) {
                obj = null;
            }
            arrayList.add(i, new b21(b62Var, iM4272a, obj));
            return true;
        }
        b21 b21Var = (b21) arrayList.get(iM3781q);
        if (!(obj instanceof n70)) {
            b21Var.f537c = null;
            return true;
        }
        Object obj2 = b21Var.f537c;
        if (obj2 == null) {
            b21Var.f537c = obj;
            return true;
        }
        if (obj2 instanceof sk1) {
            ((sk1) obj2).m4882a(obj);
            return true;
        }
        sk1 sk1Var = fd2.f2911a;
        sk1 sk1Var2 = new sk1(2);
        sk1Var2.m4892k(obj2);
        sk1Var2.m4892k(obj);
        b21Var.f537c = sk1Var2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1974c(float f) {
        Object objM1948D = m1948D();
        if ((objM1948D instanceof Float) && f == ((Number) objM1948D).floatValue()) {
            return false;
        }
        m1983g0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1975c0(rk1 rk1Var) {
        ArrayList arrayList = this.f3634s;
        for (int iM1431L = AbstractC0179eu.m1431L(arrayList); -1 < iM1431L; iM1431L--) {
            b21 b21Var = (b21) arrayList.get(iM1431L);
            ao0 ao0Var = b21Var.f535a.f615c;
            ao0 ao0VarM5540e = ao0Var != null ? up0.m5540e(ao0Var) : null;
            if (ao0VarM5540e == null || !ao0VarM5540e.m237a()) {
                arrayList.remove(iM1431L);
            } else {
                int i = b21Var.f536b;
                int i2 = ao0VarM5540e.f313a;
                if (i != i2) {
                    b21Var.f536b = i2;
                }
            }
        }
        Object[] objArr = rk1Var.f9619b;
        Object[] objArr2 = rk1Var.f9620c;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            b62 b62Var = (b62) obj;
                            ao0 ao0Var2 = b62Var.f615c;
                            if (ao0Var2 != null) {
                                int i7 = up0.m5540e(ao0Var2).f313a;
                                if (obj2 == gd3.f3418E) {
                                    obj2 = null;
                                }
                                arrayList.add(new b21(b62Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        AbstractC0290hu.m2231f0(arrayList, AbstractC0570p7.f7995d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1976d(int i) {
        Object objM1948D = m1948D();
        if ((objM1948D instanceof Integer) && i == ((Number) objM1948D).intValue()) {
            return false;
        }
        m1983g0(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1977d0(int i, int i2) {
        if (m1985h0(i) != i2) {
            if (i < 0) {
                xj1 xj1Var = this.f3631p;
                if (xj1Var == null) {
                    xj1Var = new xj1();
                    this.f3631p = xj1Var;
                }
                xj1Var.m6157f(i, i2);
                return;
            }
            int[] iArr = this.f3630o;
            if (iArr == null) {
                int i3 = this.f3601G.f8517c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.f3630o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1978e(long j) {
        Object objM1948D = m1948D();
        if ((objM1948D instanceof Long) && j == ((Number) objM1948D).longValue()) {
            return false;
        }
        m1983g0(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1979e0(int i, int i2) {
        int iM1985h0 = m1985h0(i);
        if (iM1985h0 != i2) {
            int i3 = i2 - iM1985h0;
            ArrayList arrayList = this.f3624i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM1985h02 = m1985h0(i) + i3;
                m1977d0(i, iM1985h02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        ko0 ko0Var = (ko0) arrayList.get(i4);
                        if (ko0Var != null && ko0Var.m2726a(i, iM1985h02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                pr2 pr2Var = this.f3601G;
                if (i < 0) {
                    i = pr2Var.f8523i;
                } else if (pr2Var.m3959l(i)) {
                    return;
                } else {
                    i = this.f3601G.m3964q(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1980f(Object obj) {
        if (t11.m5086l(m1948D(), obj)) {
            return false;
        }
        m1983g0(obj);
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1981f0(Object obj) {
        if (obj instanceof a82) {
            lo0 lo0Var = new lo0((a82) obj, this.f3628m - 1);
            if (this.f3613S) {
                kv1 kv1Var = this.f3607M.f9262b.f2145t;
                kv1Var.m2743X(vu1.f12177c);
                rg3.m4459M(kv1Var, 0, lo0Var);
            }
            this.f3619d.add(obj);
            obj = lo0Var;
        }
        m1983g0(obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1982g(boolean z) {
        Object objM1948D = m1948D();
        if ((objM1948D instanceof Boolean) && z == ((Boolean) objM1948D).booleanValue()) {
            return false;
        }
        m1983g0(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1983g0(Object obj) {
        if (this.f3613S) {
            tr2 tr2Var = this.f3603I;
            if (tr2Var.f10926n <= 0 || tr2Var.f10921i == tr2Var.f10923k) {
                tr2Var.m5394F(obj);
                return;
            }
            zj1 zj1Var = tr2Var.f10931s;
            if (zj1Var == null) {
                zj1Var = new zj1();
            }
            tr2Var.f10931s = zj1Var;
            int i = tr2Var.f10934v;
            Object objM6022b = zj1Var.m6022b(i);
            if (objM6022b == null) {
                objM6022b = new lk1();
                zj1Var.m6421h(i, objM6022b);
            }
            ((lk1) objM6022b).m2925a(obj);
            return;
        }
        pr2 pr2Var = this.f3601G;
        boolean z = pr2Var.f8528n;
        C0635qx c0635qx = this.f3607M;
        if (!z) {
            ao0 ao0VarM3948a = pr2Var.m3948a(pr2Var.f8523i);
            kv1 kv1Var = c0635qx.f9262b.f2145t;
            kv1Var.m2743X(du1.f2228c);
            rg3.m4460N(kv1Var, 0, ao0VarM3948a, 1, obj);
            return;
        }
        int iM4990b = (pr2Var.f8526l - sr2.m4990b(pr2Var.f8516b, pr2Var.f8523i)) - 1;
        if (c0635qx.f9261a.f3601G.f8523i - c0635qx.f9266f >= 0) {
            c0635qx.m4294d(true);
            kv1 kv1Var2 = c0635qx.f9262b.f2145t;
            kv1Var2.m2743X(qu1.f9174g);
            rg3.m4459M(kv1Var2, 0, obj);
            kv1Var2.f5827o[kv1Var2.f5828p - kv1Var2.f5825m[kv1Var2.f5826n - 1].f4804a] = iM4990b;
            return;
        }
        pr2 pr2Var2 = this.f3601G;
        ao0 ao0VarM3948a2 = pr2Var2.m3948a(pr2Var2.f8523i);
        kv1 kv1Var3 = c0635qx.f9262b.f2145t;
        kv1Var3.m2743X(qu1.f9173f);
        rg3.m4460N(kv1Var3, 0, obj, 1, ao0VarM3948a2);
        kv1Var3.f5827o[kv1Var3.f5828p - kv1Var3.f5825m[kv1Var3.f5826n - 1].f4804a] = iM4990b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1984h(Object obj) {
        if (m1948D() == obj) {
            return false;
        }
        m1983g0(obj);
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final int m1985h0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f3630o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f3601G.m3962o(i) : i2;
        }
        xj1 xj1Var = this.f3631p;
        if (xj1Var != null && xj1Var.m6154c(i) >= 0) {
            int iM6154c = xj1Var.m6154c(i);
            if (iM6154c >= 0) {
                return xj1Var.f13055c[iM6154c];
            }
            um2.m5519i(vi0.m5688g("Cannot find value for key ", i));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m1986i() {
        this.f3625j = null;
        this.f3626k = 0;
        this.f3627l = 0;
        this.f3614T = 0L;
        this.f3633r = false;
        C0635qx c0635qx = this.f3607M;
        c0635qx.f9263c = false;
        c0635qx.f9264d.f4215b = 0;
        c0635qx.f9266f = 0;
        c0635qx.f9265e = true;
        c0635qx.f9267g = 0;
        c0635qx.f9268h.clear();
        c0635qx.f9269i = -1;
        c0635qx.f9270j = -1;
        c0635qx.f9271k = -1;
        c0635qx.f9272l = 0;
        this.f3599E.clear();
        this.f3630o = null;
        this.f3631p = null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1987i0() {
        if (!this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3633r = false;
        if (this.f3613S) {
            AbstractC0752tx.m5443a("useNode() called while inserting");
        }
        pr2 pr2Var = this.f3601G;
        Object objM3961n = pr2Var.m3961n(pr2Var.f8523i);
        C0635qx c0635qx = this.f3607M;
        c0635qx.m4293c();
        c0635qx.f9268h.add(objM3961n);
        if (this.f3640y && (objM3961n instanceof InterfaceC0788uw)) {
            c0635qx.m4292b();
            c0635qx.f9262b.f2145t.m2743X(hv1.f4143c);
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m1988j(e42 e42Var) {
        return op0.m3600w(m1990l(), e42Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m1989k(xm0 xm0Var) {
        if (!this.f3633r) {
            AbstractC0752tx.m5443a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3633r = false;
        if (!this.f3613S) {
            AbstractC0752tx.m5443a("createNode() can only be called when inserting");
        }
        i11 i11Var = this.f3629n;
        int i = i11Var.f4214a[i11Var.f4215b - 1];
        tr2 tr2Var = this.f3603I;
        ao0 ao0VarM5411b = tr2Var.m5411b(tr2Var.f10934v);
        this.f3627l++;
        lj0 lj0Var = this.f3609O;
        kv1 kv1Var = lj0Var.f6144m;
        kv1Var.m2743X(qu1.f9171d);
        rg3.m4459M(kv1Var, 0, xm0Var);
        kv1Var.f5827o[kv1Var.f5828p - kv1Var.f5825m[kv1Var.f5826n - 1].f4804a] = i;
        rg3.m4459M(kv1Var, 1, ao0VarM5411b);
        kv1 kv1Var2 = lj0Var.f6145n;
        kv1Var2.m2743X(qu1.f9172e);
        kv1Var2.f5827o[kv1Var2.f5828p - kv1Var2.f5825m[kv1Var2.f5826n - 1].f4804a] = i;
        rg3.m4459M(kv1Var2, 0, ao0VarM5411b);
    }

    /* JADX INFO: renamed from: l */
    public final yy1 m1990l() {
        yy1 yy1Var;
        yy1 yy1Var2 = this.f3605K;
        if (yy1Var2 != null) {
            return yy1Var2;
        }
        int iM3964q = this.f3601G.f8523i;
        boolean z = this.f3613S;
        yt1 yt1Var = AbstractC0752tx.f10988c;
        if (z && this.f3604J) {
            int iM5393E = this.f3603I.f10934v;
            while (iM5393E > 0) {
                if (this.f3603I.m5427s(iM5393E) == 202 && t11.m5086l(this.f3603I.m5428t(iM5393E), yt1Var)) {
                    Object objM5425q = this.f3603I.m5425q(iM5393E);
                    objM5425q.getClass();
                    yy1 yy1Var3 = (yy1) objM5425q;
                    this.f3605K = yy1Var3;
                    return yy1Var3;
                }
                tr2 tr2Var = this.f3603I;
                iM5393E = tr2Var.m5393E(tr2Var.f10914b, iM5393E);
            }
        }
        if (this.f3601G.f8517c > 0) {
            while (iM3964q > 0) {
                if (this.f3601G.m3956i(iM3964q) == 202) {
                    pr2 pr2Var = this.f3601G;
                    if (t11.m5086l(pr2Var.m3963p(pr2Var.f8516b, iM3964q), yt1Var)) {
                        zj1 zj1Var = this.f3637v;
                        if (zj1Var == null || (yy1Var = (yy1) zj1Var.m6022b(iM3964q)) == null) {
                            pr2 pr2Var2 = this.f3601G;
                            Object objM3949b = pr2Var2.m3949b(pr2Var2.f8516b, iM3964q);
                            objM3949b.getClass();
                            yy1Var = (yy1) objM3949b;
                        }
                        this.f3605K = yy1Var;
                        return yy1Var;
                    }
                }
                iM3964q = this.f3601G.m3964q(iM3964q);
            }
        }
        yy1 yy1Var4 = this.f3636u;
        this.f3605K = yy1Var4;
        return yy1Var4;
    }

    /* JADX INFO: renamed from: m */
    public final C0182ex m1991m() {
        Collection collection;
        if (!this.f3617b.mo1385k()) {
            return null;
        }
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        tr2 tr2Var = this.f3603I;
        pb1VarM1424E.addAll(AbstractC0570p7.m3776l(tr2Var, null, tr2Var.f10932t, null));
        pr2 pr2Var = this.f3601G;
        boolean z = pr2Var.f8520f;
        int[] iArr = pr2Var.f8516b;
        if (z || pr2Var.f8517c == 0) {
            collection = be0.f819h;
        } else {
            j52 j52Var = new j52(pr2Var);
            int iM3964q = pr2Var.f8523i;
            Object objValueOf = Integer.valueOf(pr2Var.f8526l - sr2.m4990b(iArr, iM3964q));
            while (iM3964q >= 0) {
                j52Var.m4876h(pr2Var.m3956i(iM3964q), pr2Var.m3958k(iM3964q) ? pr2Var.m3963p(iArr, iM3964q) : C0520nx.f7360a, pr2Var.f8515a.m4277f(iM3964q), objValueOf);
                objValueOf = pr2Var.m3948a(iM3964q);
                iM3964q = pr2Var.m3964q(iM3964q);
            }
            collection = (ArrayList) j52Var.f10161h;
        }
        pb1VarM1424E.addAll(collection);
        pb1VarM1424E.addAll(m1949E());
        return new C0182ex(AbstractC0179eu.m1476z(pb1VarM1424E), this.f3597C);
    }

    /* JADX INFO: renamed from: n */
    public final void m1992n(rk1 rk1Var, mn0 mn0Var) {
        ArrayList arrayList = this.f3634s;
        if (this.f3600F) {
            AbstractC0752tx.m5443a("Reentrant composition is not supported");
        }
        this.f3622g.m3237m();
        Trace.beginSection("Compose:recompose");
        try {
            this.f3596B = Long.hashCode(ds2.m1126j().mo79g());
            this.f3637v = null;
            m1975c0(rk1Var);
            this.f3626k = 0;
            this.f3600F = true;
            try {
                m1971a0();
                Object objM1948D = m1948D();
                if (objM1948D != mn0Var && mn0Var != null) {
                    m1983g0(mn0Var);
                }
                fo0 fo0Var = this.f3598D;
                zk1 zk1VarM3589l = op0.m3589l();
                try {
                    zk1VarM3589l.m6423b(fo0Var);
                    yt1 yt1Var = AbstractC0752tx.f10986a;
                    if (mn0Var != null) {
                        m1964U(200, yt1Var);
                        rg3.m4452F(this, mn0Var);
                        m1994p(false);
                    } else if (!this.f3638w || objM1948D == null || objM1948D.equals(C0520nx.f7360a)) {
                        m1959P();
                    } else {
                        m1964U(200, yt1Var);
                        xe1.m6119f(2, objM1948D);
                        rg3.m4452F(this, (mn0) objM1948D);
                        m1994p(false);
                    }
                    zk1VarM3589l.m6432k(zk1VarM3589l.f13936j - 1);
                    m1998t();
                    this.f3600F = false;
                    arrayList.clear();
                    if (!this.f3603I.f10935w) {
                        AbstractC0752tx.m5443a("Check failed");
                    }
                    m2000v();
                } catch (Throwable th) {
                    zk1VarM3589l.m6432k(zk1VarM3589l.f13936j - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1993o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m1993o(this.f3601G.m3964q(i), i2);
        if (this.f3601G.m3959l(i)) {
            Object objM3961n = this.f3601G.m3961n(i);
            C0635qx c0635qx = this.f3607M;
            c0635qx.m4293c();
            c0635qx.f9268h.add(objM3961n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1994p(boolean z) {
        long jRotateRight;
        i11 i11Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i11 i11Var2;
        int i7;
        int i8;
        ArrayList arrayList2;
        sk1 sk1Var;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        ko0 ko0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        i11 i11Var3 = this.f3629n;
        int i16 = i11Var3.f4214a[i11Var3.f4215b - 2] - 1;
        boolean z2 = this.f3613S;
        C0160eb c0160eb = C0520nx.f7360a;
        if (z2) {
            tr2 tr2Var = this.f3603I;
            int i17 = tr2Var.f10934v;
            int iM5427s = tr2Var.m5427s(i17);
            Object objM5428t = this.f3603I.m5428t(i17);
            Object objM5425q = this.f3603I.m5425q(i17);
            if (objM5428t != null) {
                jRotateRight2 = Long.rotateRight(this.f3614T, 3) ^ ((long) (objM5428t instanceof Enum ? ((Enum) objM5428t).ordinal() : objM5428t.hashCode()));
            } else if (objM5425q == null || iM5427s != 207 || objM5425q.equals(c0160eb)) {
                jRotateRight2 = Long.rotateRight(this.f3614T ^ ((long) i16), 3) ^ ((long) iM5427s);
            } else {
                this.f3614T = Long.rotateRight(Long.rotateRight(this.f3614T ^ ((long) i16), 3) ^ ((long) objM5425q.hashCode()), 3);
            }
            this.f3614T = Long.rotateRight(jRotateRight2, 3);
        } else {
            pr2 pr2Var = this.f3601G;
            int i18 = pr2Var.f8523i;
            int iM3956i = pr2Var.m3956i(i18);
            pr2 pr2Var2 = this.f3601G;
            Object objM3963p = pr2Var2.m3963p(pr2Var2.f8516b, i18);
            pr2 pr2Var3 = this.f3601G;
            Object objM3949b = pr2Var3.m3949b(pr2Var3.f8516b, i18);
            if (objM3963p != null) {
                jRotateRight = Long.rotateRight(this.f3614T, 3) ^ ((long) (objM3963p instanceof Enum ? ((Enum) objM3963p).ordinal() : objM3963p.hashCode()));
            } else if (objM3949b == null || iM3956i != 207 || objM3949b.equals(c0160eb)) {
                jRotateRight = Long.rotateRight(this.f3614T ^ ((long) i16), 3) ^ ((long) iM3956i);
            } else {
                this.f3614T = Long.rotateRight(Long.rotateRight(this.f3614T ^ ((long) i16), 3) ^ ((long) objM3949b.hashCode()), 3);
            }
            this.f3614T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.f3627l;
        ko0 ko0Var2 = this.f3625j;
        ArrayList arrayList5 = this.f3634s;
        C0635qx c0635qx = this.f3607M;
        if (ko0Var2 != null) {
            zj1 zj1Var = ko0Var2.f5692e;
            int i20 = ko0Var2.f5689b;
            ArrayList arrayList6 = ko0Var2.f5688a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = ko0Var2.f5691d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList7.get(i21));
                }
                i = -1;
                sk1 sk1Var2 = fd2.f2911a;
                sk1 sk1Var3 = new sk1();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    e51 e51Var = (e51) arrayList6.get(i22);
                    if (hashSet2.contains(e51Var)) {
                        i11Var2 = i11Var3;
                        i7 = i22;
                        if (!sk1Var3.m4884c(e51Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                e51 e51Var2 = (e51) arrayList7.get(i25);
                                if (e51Var2 != e51Var) {
                                    br0 br0Var = (br0) zj1Var.m6022b(e51Var2.f2311c);
                                    int i26 = br0Var != null ? br0Var.f990b : -1;
                                    sk1Var3.m4882a(e51Var2);
                                    i8 = i25;
                                    i11 = i24;
                                    ko0Var = ko0Var2;
                                    if (i26 != i11) {
                                        br0 br0Var2 = (br0) zj1Var.m6022b(e51Var2.f2311c);
                                        int i27 = br0Var2 != null ? br0Var2.f991c : e51Var2.f2312d;
                                        sk1Var = sk1Var3;
                                        int i28 = i26 + i20;
                                        i9 = size2;
                                        int i29 = i11 + i20;
                                        if (i27 > 0) {
                                            i10 = i20;
                                            int i30 = c0635qx.f9272l;
                                            if (i30 > 0) {
                                                arrayList3 = arrayList6;
                                                if (c0635qx.f9270j == i28 - i30 && c0635qx.f9271k == i29 - i30) {
                                                    c0635qx.f9272l = i30 + i27;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            c0635qx.m4293c();
                                            c0635qx.f9270j = i28;
                                            c0635qx.f9271k = i29;
                                            c0635qx.f9272l = i27;
                                        } else {
                                            i10 = i20;
                                            arrayList3 = arrayList6;
                                            c0635qx.getClass();
                                        }
                                        if (i26 > i11) {
                                            Object[] objArr5 = zj1Var.f12751c;
                                            long[] jArr5 = zj1Var.f12749a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i31 = 0;
                                                while (true) {
                                                    long j = jArr5[i31];
                                                    int i32 = i27;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                        int i34 = 0;
                                                        while (i34 < i33) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i34;
                                                                br0 br0Var3 = (br0) objArr5[(i31 << 3) + i34];
                                                                objArr4 = objArr5;
                                                                int i35 = br0Var3.f990b;
                                                                jArr4 = jArr5;
                                                                if (i26 <= i35 && i35 < i26 + i32) {
                                                                    br0Var3.f990b = (i35 - i26) + i11;
                                                                } else if (i11 <= i35 && i35 < i26) {
                                                                    br0Var3.f990b = i35 + i32;
                                                                }
                                                            } else {
                                                                i15 = i34;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i34 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i31 == length) {
                                                        break;
                                                    }
                                                    i31++;
                                                    arrayList5 = arrayList2;
                                                    i27 = i32;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i36 = i27;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i26) {
                                                Object[] objArr6 = zj1Var.f12751c;
                                                long[] jArr6 = zj1Var.f12749a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i37 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i37];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                                            int i39 = 0;
                                                            while (i39 < i38) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    br0 br0Var4 = (br0) objArr6[(i37 << 3) + i39];
                                                                    jArr2 = jArr6;
                                                                    int i40 = br0Var4.f990b;
                                                                    i14 = i26;
                                                                    if (i26 <= i40 && i40 < i14 + i36) {
                                                                        br0Var4.f990b = (i40 - i14) + i11;
                                                                    } else if (i14 + 1 <= i40 && i40 < i11) {
                                                                        br0Var4.f990b = i40 - i36;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i26;
                                                                }
                                                                j2 >>= 8;
                                                                i39++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i26 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                            if (i38 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                        }
                                                        if (i37 == length2) {
                                                            break;
                                                        }
                                                        i37++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i26 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        sk1Var = sk1Var3;
                                        i9 = size2;
                                        i10 = i20;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i25;
                                    arrayList2 = arrayList5;
                                    sk1Var = sk1Var3;
                                    i9 = size2;
                                    i10 = i20;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i24;
                                    ko0Var = ko0Var2;
                                    i12 = i7 + 1;
                                }
                                i23 = i8 + 1;
                                br0 br0Var5 = (br0) zj1Var.m6022b(e51Var2.f2311c);
                                int i41 = i11 + (br0Var5 != null ? br0Var5.f991c : e51Var2.f2312d);
                                i22 = i12;
                                ko0Var2 = ko0Var;
                                sk1Var3 = sk1Var;
                                size2 = i9;
                                i20 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i24 = i41;
                                i11Var3 = i11Var2;
                            } else {
                                i23 = i25;
                                i11Var3 = i11Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        i11Var2 = i11Var3;
                        br0 br0Var6 = (br0) zj1Var.m6022b(e51Var.f2311c);
                        int i42 = br0Var6 != null ? br0Var6.f990b : -1;
                        int i43 = e51Var.f2311c;
                        i7 = i22;
                        c0635qx.m4295e(i42 + i20, e51Var.f2312d);
                        ko0Var2.m2726a(i43, 0);
                        c0635qx.f9266f = (i43 - c0635qx.f9261a.f3601G.f8521g) + c0635qx.f9266f;
                        this.f3601G.m3965r(i43);
                        m1953I();
                        this.f3601G.m3966s();
                        AbstractC0570p7.m3773i(arrayList5, i43, this.f3601G.f8516b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    i11Var3 = i11Var2;
                }
                i11Var = i11Var3;
                arrayList = arrayList5;
                c0635qx.m4293c();
                if (arrayList6.size() > 0) {
                    pr2 pr2Var4 = this.f3601G;
                    c0635qx.f9266f = (pr2Var4.f8522h - c0635qx.f9261a.f3601G.f8521g) + c0635qx.f9266f;
                    pr2Var4.m3967t();
                }
            } else {
                i11Var = i11Var3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.f3613S;
        if (!z3) {
            pr2 pr2Var5 = this.f3601G;
            int i44 = pr2Var5.f8527m - pr2Var5.f8526l;
            if (i44 > 0) {
                if (i44 > 0) {
                    c0635qx.m4294d(false);
                    i11 i11Var4 = c0635qx.f9264d;
                    pr2 pr2Var6 = c0635qx.f9261a.f3601G;
                    if (pr2Var6.f8517c > 0 && i11Var4.m2241a(-2) != (i6 = pr2Var6.f8523i)) {
                        if (!c0635qx.f9263c && c0635qx.f9265e) {
                            c0635qx.m4294d(false);
                            c0635qx.f9262b.f2145t.m2743X(pu1.f8615c);
                            c0635qx.f9263c = true;
                        }
                        if (i6 > 0) {
                            ao0 ao0VarM3948a = pr2Var6.m3948a(i6);
                            i11Var4.m2243c(i6);
                            c0635qx.m4294d(false);
                            kv1 kv1Var = c0635qx.f9262b.f2145t;
                            kv1Var.m2743X(ou1.f7848c);
                            rg3.m4459M(kv1Var, 0, ao0VarM3948a);
                            c0635qx.f9263c = true;
                        }
                    }
                    kv1 kv1Var2 = c0635qx.f9262b.f2145t;
                    kv1Var2.m2743X(dv1.f2236c);
                    kv1Var2.f5827o[kv1Var2.f5828p - kv1Var2.f5825m[kv1Var2.f5826n - 1].f4804a] = i44;
                } else {
                    c0635qx.getClass();
                }
            }
        }
        int i45 = this.f3626k;
        while (true) {
            pr2 pr2Var7 = this.f3601G;
            if (pr2Var7.f8525k > 0 || (i5 = pr2Var7.f8521g) == pr2Var7.f8522h) {
                break;
            }
            m1953I();
            c0635qx.m4295e(i45, this.f3601G.m3966s());
            AbstractC0570p7.m3773i(arrayList, i5, this.f3601G.f8521g);
        }
        if (z3) {
            if (z) {
                lj0 lj0Var = this.f3609O;
                kv1 kv1Var3 = lj0Var.f6145n;
                if (kv1Var3.f5826n == 0) {
                    AbstractC0752tx.m5443a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                kv1 kv1Var4 = lj0Var.f6144m;
                iv1[] iv1VarArr = kv1Var3.f5825m;
                int i46 = kv1Var3.f5826n - 1;
                kv1Var3.f5826n = i46;
                iv1 iv1Var = iv1VarArr[i46];
                iv1VarArr[i46] = null;
                kv1Var4.m2743X(iv1Var);
                Object[] objArr7 = kv1Var3.f5829q;
                Object[] objArr8 = kv1Var4.f5829q;
                int i47 = kv1Var4.f5830r;
                int i48 = iv1Var.f4805b;
                int i49 = kv1Var3.f5830r;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = kv1Var3.f5829q;
                int i51 = kv1Var3.f5830r;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = kv1Var3.f5827o;
                int[] iArr2 = kv1Var4.f5827o;
                int i52 = kv1Var4.f5828p;
                int i53 = iv1Var.f4804a;
                int i54 = kv1Var3.f5828p;
                AbstractC0460mg.m3086a0(iArr, iArr2, i52 - i53, i54 - i53, i54);
                kv1Var3.f5830r -= i48;
                kv1Var3.f5828p -= i53;
                i19 = 1;
            }
            if (this.f3601G.f8525k <= 0) {
                j22.m2429a("Unbalanced begin/end empty");
            }
            r4.f8525k--;
            tr2 tr2Var2 = this.f3603I;
            int i55 = tr2Var2.f10934v;
            tr2Var2.m5418j();
            if (this.f3601G.f8525k <= 0) {
                int i56 = (-2) - i55;
                this.f3603I.m5419k();
                this.f3603I.m5414e(true);
                ao0 ao0Var = this.f3608N;
                boolean zM2742W = this.f3609O.f6144m.m2742W();
                qr2 qr2Var = this.f3602H;
                if (zM2742W) {
                    c0635qx.m4292b();
                    c0635qx.m4294d(false);
                    i11 i11Var5 = c0635qx.f9264d;
                    pr2 pr2Var8 = c0635qx.f9261a.f3601G;
                    if (pr2Var8.f8517c <= 0 || i11Var5.m2241a(-2) == (i4 = pr2Var8.f8523i)) {
                        i3 = 1;
                        c0635qx.m4293c();
                        kv1 kv1Var5 = c0635qx.f9262b.f2145t;
                        kv1Var5.m2743X(ru1.f9759c);
                        rg3.m4460N(kv1Var5, 0, ao0Var, i3, qr2Var);
                        r3 = 0;
                    } else {
                        if (!c0635qx.f9263c && c0635qx.f9265e) {
                            c0635qx.m4294d(false);
                            c0635qx.f9262b.f2145t.m2743X(pu1.f8615c);
                            c0635qx.f9263c = true;
                        }
                        if (i4 > 0) {
                            ao0 ao0VarM3948a2 = pr2Var8.m3948a(i4);
                            i11Var5.m2243c(i4);
                            c0635qx.m4294d(false);
                            kv1 kv1Var6 = c0635qx.f9262b.f2145t;
                            kv1Var6.m2743X(ou1.f7848c);
                            rg3.m4459M(kv1Var6, 0, ao0VarM3948a2);
                            i3 = 1;
                            c0635qx.f9263c = true;
                        }
                        c0635qx.m4293c();
                        kv1 kv1Var52 = c0635qx.f9262b.f2145t;
                        kv1Var52.m2743X(ru1.f9759c);
                        rg3.m4460N(kv1Var52, 0, ao0Var, i3, qr2Var);
                        r3 = 0;
                    }
                } else {
                    lj0 lj0Var2 = this.f3609O;
                    c0635qx.m4292b();
                    c0635qx.m4294d(false);
                    i11 i11Var6 = c0635qx.f9264d;
                    pr2 pr2Var9 = c0635qx.f9261a.f3601G;
                    if (pr2Var9.f8517c > 0 && i11Var6.m2241a(-2) != (i2 = pr2Var9.f8523i)) {
                        if (!c0635qx.f9263c && c0635qx.f9265e) {
                            c0635qx.m4294d(false);
                            c0635qx.f9262b.f2145t.m2743X(pu1.f8615c);
                            c0635qx.f9263c = true;
                        }
                        if (i2 > 0) {
                            ao0 ao0VarM3948a3 = pr2Var9.m3948a(i2);
                            i11Var6.m2243c(i2);
                            c0635qx.m4294d(false);
                            kv1 kv1Var7 = c0635qx.f9262b.f2145t;
                            kv1Var7.m2743X(ou1.f7848c);
                            rg3.m4459M(kv1Var7, 0, ao0VarM3948a3);
                            c0635qx.f9263c = true;
                        }
                    }
                    c0635qx.m4293c();
                    kv1 kv1Var8 = c0635qx.f9262b.f2145t;
                    kv1Var8.m2743X(su1.f10374c);
                    int i57 = kv1Var8.f5830r - kv1Var8.f5825m[kv1Var8.f5826n - 1].f4805b;
                    Object[] objArr10 = kv1Var8.f5829q;
                    objArr10[i57] = ao0Var;
                    objArr10[i57 + 1] = qr2Var;
                    objArr10[i57 + 2] = lj0Var2;
                    this.f3609O = new lj0();
                    r3 = 0;
                }
                this.f3613S = r3;
                if (this.f3618c.f9133i != 0) {
                    m1977d0(i56, r3);
                    m1979e0(i56, i19);
                }
            }
        } else {
            if (z) {
                c0635qx.m4291a();
            }
            int i58 = c0635qx.f9261a.f3601G.f8523i;
            i11 i11Var7 = c0635qx.f9264d;
            int i59 = i;
            if (i11Var7.m2241a(i59) > i58) {
                AbstractC0752tx.m5443a("Missed recording an endGroup");
            }
            if (i11Var7.m2241a(i59) == i58) {
                c0635qx.m4294d(false);
                i11Var7.m2242b();
                c0635qx.f9262b.f2145t.m2743X(lu1.f6329c);
            }
            int i60 = this.f3601G.f8523i;
            if (i19 != m1985h0(i60)) {
                m1979e0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.f3601G.m3952e();
            c0635qx.m4293c();
        }
        ko0 ko0Var3 = (ko0) this.f3624i.remove(r3.size() - 1);
        if (ko0Var3 != null && !z3) {
            ko0Var3.f5690c++;
        }
        this.f3625j = ko0Var3;
        this.f3626k = i11Var.m2242b() + i19;
        this.f3628m = i11Var.m2242b();
        this.f3627l = i11Var.m2242b() + i19;
    }

    /* JADX INFO: renamed from: q */
    public final void m1995q() {
        m1994p(false);
        b62 b62VarM2002x = m2002x();
        if (b62VarM2002x != null) {
            int i = b62VarM2002x.f614b;
            if ((i & 1) != 0) {
                b62VarM2002x.f614b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[EDGE_INSN: B:61:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081], EDGE_INSN: B:62:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b62 m1996r() {
        b62 b62Var;
        ao0 ao0VarM3948a;
        a62 a62Var;
        int i;
        ArrayList arrayList = this.f3599E;
        b62 b62Var2 = !arrayList.isEmpty() ? (b62) arrayList.remove(arrayList.size() - 1) : null;
        int i2 = 0;
        if (b62Var2 != null) {
            b62Var2.f614b &= -9;
            this.f3622g.m3237m();
            int i3 = this.f3596B;
            gk1 gk1Var = b62Var2.f618f;
            if (gk1Var == null || (b62Var2.f614b & 16) != 0) {
                a62Var = null;
                C0635qx c0635qx = this.f3607M;
                if (a62Var != null) {
                    kv1 kv1Var = c0635qx.f9262b.f2145t;
                    kv1Var.m2743X(ku1.f5819c);
                    rg3.m4460N(kv1Var, 0, a62Var, 1, this.f3623h);
                }
                i = b62Var2.f614b;
                if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
                    b62Var2.f614b = i & (-513);
                    kv1 kv1Var2 = c0635qx.f9262b.f2145t;
                    kv1Var2.m2743X(nu1.f7328c);
                    rg3.m4459M(kv1Var2, 0, b62Var2);
                    int i4 = b62Var2.f614b;
                    b62Var2.f614b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        b62Var2.f614b = i4 & (-1153);
                        if (this.f3641z == this.f3601G.f8523i) {
                            this.f3640y = false;
                            this.f3641z = -1;
                        }
                    }
                }
            } else {
                Object[] objArr = gk1Var.f3553b;
                int[] iArr = gk1Var.f3554c;
                long[] jArr = gk1Var.f3552a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        a62Var = new a62(i3, i2, b62Var2, gk1Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    a62Var = null;
                    C0635qx c0635qx2 = this.f3607M;
                    if (a62Var != null) {
                    }
                    i = b62Var2.f614b;
                    if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
                    }
                }
            }
        }
        if (b62Var2 != null) {
            int i9 = b62Var2.f614b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.f3632q)) {
                if (b62Var2.f615c == null) {
                    if (this.f3613S) {
                        tr2 tr2Var = this.f3603I;
                        ao0VarM3948a = tr2Var.m5411b(tr2Var.f10934v);
                    } else {
                        pr2 pr2Var = this.f3601G;
                        ao0VarM3948a = pr2Var.m3948a(pr2Var.f8523i);
                    }
                    b62Var2.f615c = ao0VarM3948a;
                }
                b62Var2.f614b &= -5;
                b62Var = b62Var2;
            } else {
                b62Var = null;
            }
        }
        m1994p(false);
        return b62Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m1997s() {
        if (this.f3600F || this.f3641z != 0) {
            j22.m2429a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f3641z = -1;
        this.f3640y = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m1998t() {
        m1994p(false);
        this.f3617b.mo1377c();
        m1994p(false);
        C0635qx c0635qx = this.f3607M;
        if (c0635qx.f9263c) {
            c0635qx.m4294d(false);
            c0635qx.m4294d(false);
            c0635qx.f9262b.f2145t.m2743X(lu1.f6329c);
            c0635qx.f9263c = false;
        }
        c0635qx.m4292b();
        if (c0635qx.f9264d.f4215b != 0) {
            AbstractC0752tx.m5443a("Missed recording an endGroup()");
        }
        if (!this.f3624i.isEmpty()) {
            AbstractC0752tx.m5443a("Start/end imbalance");
        }
        m1986i();
        this.f3601G.m3950c();
        this.f3638w = this.f3639x.m2242b() != 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m1999u(boolean z, ko0 ko0Var) {
        this.f3624i.add(this.f3625j);
        this.f3625j = ko0Var;
        int i = this.f3627l;
        i11 i11Var = this.f3629n;
        i11Var.m2243c(i);
        i11Var.m2243c(this.f3628m);
        i11Var.m2243c(this.f3626k);
        if (z) {
            this.f3626k = 0;
        }
        this.f3627l = 0;
        this.f3628m = 0;
    }

    /* JADX INFO: renamed from: v */
    public final void m2000v() {
        qr2 qr2Var = new qr2();
        if (this.f3597C) {
            qr2Var.m4273b();
        }
        if (this.f3617b.mo1378d()) {
            qr2Var.f9142r = new zj1();
        }
        this.f3602H = qr2Var;
        tr2 tr2VarM4275d = qr2Var.m4275d();
        tr2VarM4275d.m5414e(true);
        this.f3603I = tr2VarM4275d;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC0035ay m2001w() {
        ho0 ho0Var = this.f3615U;
        if (ho0Var != null) {
            return ho0Var;
        }
        ho0 ho0Var2 = new ho0(this.f3623h);
        this.f3615U = ho0Var2;
        return ho0Var2;
    }

    /* JADX INFO: renamed from: x */
    public final b62 m2002x() {
        if (this.f3595A != 0) {
            return null;
        }
        ArrayList arrayList = this.f3599E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (b62) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m2003y() {
        if (!m1945A() || this.f3638w) {
            return true;
        }
        b62 b62VarM2002x = m2002x();
        return (b62VarM2002x == null || (b62VarM2002x.f614b & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public final C0110cy m2004z() {
        if (this.f3617b.mo1385k()) {
            return this.f3611Q;
        }
        return null;
    }
}
