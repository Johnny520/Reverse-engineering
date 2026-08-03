package p339x1;

import android.os.Trace;
import gg.AbstractC1416l;
import okio.C3193a;
import p020b5.C0184c;
import p071f1.C1020o0;
import p131j0.C2046b;
import p174m.C2571a;
import p227p4.C3315t;
import p292u1.AbstractC4229a;
import p293u2.C4231a;
import p308v1.AbstractC4374a1;
import p356y0.AbstractC5852n;
import p357y1.C5910n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5646t0 {

    /* JADX INFO: renamed from: a */
    public final C5602f0 f22992a;

    /* JADX INFO: renamed from: c */
    public boolean f22994c;

    /* JADX INFO: renamed from: d */
    public boolean f22995d;

    /* JADX INFO: renamed from: i */
    public C4231a f23000i;

    /* JADX INFO: renamed from: b */
    public final C0184c f22993b = new C0184c(29);

    /* JADX INFO: renamed from: e */
    public final C3315t f22996e = new C3315t(18);

    /* JADX INFO: renamed from: f */
    public final C2046b f22997f = new C2046b(new C5602f0[16]);

    /* JADX INFO: renamed from: g */
    public final long f22998g = 1;

    /* JADX INFO: renamed from: h */
    public final C2046b f22999h = new C2046b(new C5643s0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5646t0(C5602f0 c5602f0) {
        this.f22992a = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m10195a(C5646t0 c5646t0, C5602f0 c5602f0, boolean z9) {
        C4231a c4231a;
        AbstractC4374a1 placementScope;
        C5639r c5639r;
        C5602f0 c5602f0M10049u;
        C5602f0 c5602f02 = c5646t0.f22992a;
        boolean z10 = c5602f0.f22789W;
        C5616j0 c5616j0 = c5602f0.f22779M;
        if (!z10 && m10200k(c5602f0)) {
            if (c5602f0 == c5602f02) {
                c4231a = c5646t0.f23000i;
                c4231a.getClass();
            } else {
                c4231a = null;
            }
            if (z9) {
                zM10196c = c5616j0.f22880e ? m10196c(c5602f0, c4231a) : false;
                if ((zM10196c || c5616j0.f22881f) && AbstractC1416l.m3825a(c5602f0.m10012I(), Boolean.TRUE)) {
                    c5602f0.m10013J();
                }
            } else {
                boolean zM10197d = c5602f0.m10045q() ? m10197d(c5602f0, c4231a) : false;
                if (c5602f0.m10044p() && (c5602f0 == c5602f02 || ((c5602f0M10049u = c5602f0.m10049u()) != null && c5602f0M10049u.m10011H() && c5616j0.f22891p.f23043z))) {
                    if (c5602f0 == c5602f02) {
                        if (c5602f0.f22775I == EnumC5594d0.f22745i) {
                            c5602f0.m10034f();
                        }
                        C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
                        if (c5602f0M10049u2 == null || (c5639r = c5602f0M10049u2.f22778L.f22716c) == null || (placementScope = c5639r.f22925r) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getPlacementScope();
                        }
                        AbstractC4374a1.m8811E(placementScope, c5616j0.f22891p, 0, 0);
                    } else {
                        c5602f0.m10020R();
                    }
                    C3315t c3315t = c5646t0.f22996e;
                    c3315t.getClass();
                    if (c5602f0.f22788V > 0) {
                        ((C2046b) c3315t.f10677h).m5056b(c5602f0);
                        c5602f0.f22787U = true;
                    }
                }
                zM10196c = zM10197d;
            }
            c5646t0.m10202e();
        }
        return zM10196c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10196c(C5602f0 c5602f0, C4231a c4231a) {
        boolean zM10194X0;
        C5602f0 c5602f02 = c5602f0.f22797n;
        C5616j0 c5616j0 = c5602f0.f22779M;
        if (c5602f02 == null) {
            return false;
        }
        if (c4231a == null) {
            C5640r0 c5640r0 = c5616j0.f22892q;
            C4231a c4231a2 = c5640r0 != null ? c5640r0.f22967s : null;
            if (c4231a2 != null && c5602f02 != null) {
                c5640r0.getClass();
                zM10194X0 = c5640r0.m10194X0(c4231a2.f13903a);
            }
        } else if (c5602f02 != null) {
            C5640r0 c5640r02 = c5616j0.f22892q;
            c5640r02.getClass();
            zM10194X0 = c5640r02.m10194X0(c4231a.f13903a);
        } else {
            zM10194X0 = false;
        }
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        if (zM10194X0 && c5602f0M10049u != null) {
            if (c5602f0M10049u.f22797n == null) {
                C5602f0.m10001V(c5602f0M10049u, false, 3);
                return zM10194X0;
            }
            if (c5602f0.m10047s() == EnumC5594d0.f22743g) {
                C5602f0.m10000T(c5602f0M10049u, false, 3);
                return zM10194X0;
            }
            if (c5602f0.m10047s() == EnumC5594d0.f22744h) {
                c5602f0M10049u.m10021S(false);
            }
        }
        return zM10194X0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m10197d(C5602f0 c5602f0, C4231a c4231a) {
        boolean zM10221X0;
        if (c4231a != null) {
            if (c5602f0.f22775I == EnumC5594d0.f22745i) {
                c5602f0.m10032e();
            }
            zM10221X0 = c5602f0.f22779M.f22891p.m10221X0(c4231a.f13903a);
        } else {
            C5652v0 c5652v0 = c5602f0.f22779M.f22891p;
            C4231a c4231a2 = c5652v0.f23033p ? new C4231a(c5652v0.f14596j) : null;
            if (c4231a2 != null) {
                if (c5602f0.f22775I == EnumC5594d0.f22745i) {
                    c5602f0.m10032e();
                }
                zM10221X0 = c5602f0.f22779M.f22891p.m10221X0(c4231a2.f13903a);
            } else {
                c5602f0.getClass();
                zM10221X0 = false;
            }
        }
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        if (zM10221X0 && c5602f0M10049u != null) {
            if (c5602f0.m10046r() == EnumC5594d0.f22743g) {
                C5602f0.m10001V(c5602f0M10049u, false, 3);
                return zM10221X0;
            }
            if (c5602f0.m10046r() == EnumC5594d0.f22744h) {
                c5602f0M10049u.m10022U(false);
            }
        }
        return zM10221X0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m10198i(C5602f0 c5602f0) {
        C5640r0 c5640r0;
        C5606g0 c5606g0;
        if (c5602f0.f22779M.f22880e) {
            return (c5602f0.m10047s() == EnumC5594d0.f22745i && ((c5640r0 = c5602f0.f22779M.f22892q) == null || (c5606g0 = c5640r0.f22972x) == null || !c5606g0.m10060e())) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m10199j(C5602f0 c5602f0) {
        if (!c5602f0.m10045q()) {
            return false;
        }
        do {
            if (c5602f0.m10046r() == EnumC5594d0.f22745i && !c5602f0.f22779M.f22891p.f23014D.m10060e()) {
                C5602f0 c5602f0M10049u = c5602f0.m10049u();
                if ((c5602f0M10049u != null ? c5602f0M10049u.f22779M.f22879d : null) != EnumC5586b0.f22708g) {
                    return false;
                }
            }
            c5602f0 = c5602f0.m10049u();
            if (c5602f0 == null) {
                return false;
            }
        } while (!c5602f0.m10011H());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m10200k(C5602f0 c5602f0) {
        C5640r0 c5640r0;
        C5606g0 c5606g0;
        C5616j0 c5616j0 = c5602f0.f22779M;
        return c5602f0.m10011H() || c5616j0.f22891p.f23043z || m10199j(c5602f0) || AbstractC1416l.m3825a(c5602f0.m10012I(), Boolean.TRUE) || m10198i(c5602f0) || c5616j0.f22891p.f23014D.m10060e() || !((c5640r0 = c5616j0.f22892q) == null || (c5606g0 = c5640r0.f22972x) == null || !c5606g0.m10060e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10201b(boolean z9) {
        C3315t c3315t = this.f22996e;
        if (z9) {
            C2046b c2046b = (C2046b) c3315t.f10677h;
            C5602f0 c5602f0 = this.f22992a;
            if (c5602f0.f22788V > 0) {
                c2046b.m5061g();
                c2046b.m5056b(c5602f0);
                c5602f0.f22787U = true;
            }
        }
        if (((C2046b) c3315t.f10677h).f6893i != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c3315t.m7028t();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10202e() {
        C2046b c2046b = this.f22999h;
        int i9 = c2046b.f6893i;
        if (i9 != 0) {
            Object[] objArr = c2046b.f6891g;
            for (int i10 = 0; i10 < i9; i10++) {
                C5643s0 c5643s0 = (C5643s0) objArr[i10];
                if (c5643s0.f22980a.m10010G()) {
                    boolean z9 = c5643s0.f22981b;
                    C5602f0 c5602f0 = c5643s0.f22980a;
                    boolean z10 = c5643s0.f22982c;
                    if (z9) {
                        C5602f0.m10000T(c5602f0, z10, 2);
                    } else {
                        C5602f0.m10001V(c5602f0, z10, 2);
                    }
                }
            }
            c2046b.m5061g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10203f(C5602f0 c5602f0) {
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (AbstractC1416l.m3825a(c5602f02.m10012I(), Boolean.TRUE) && !c5602f02.f22789W) {
                if (this.f22993b.m812i(c5602f02)) {
                    c5602f02.m10013J();
                }
                m10203f(c5602f02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10204g(C5602f0 c5602f0, boolean z9) {
        if (!this.f22994c) {
            AbstractC4229a.m8494b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z9 ? c5602f0.f22779M.f22880e : c5602f0.m10045q()) {
            AbstractC4229a.m8493a("node not yet measured");
        }
        m10205h(c5602f0, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m10205h(C5602f0 c5602f0, boolean z9) {
        C5640r0 c5640r0;
        C5606g0 c5606g0;
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            EnumC5594d0 enumC5594d0 = EnumC5594d0.f22743g;
            if ((!z9 && (c5602f02.m10046r() == enumC5594d0 || c5602f02.f22779M.f22891p.f23014D.m10060e())) || (z9 && (c5602f02.m10047s() == enumC5594d0 || ((c5640r0 = c5602f02.f22779M.f22892q) != null && (c5606g0 = c5640r0.f22972x) != null && c5606g0.m10060e())))) {
                boolean zM10161q = AbstractC5618k.m10161q(c5602f02);
                C5616j0 c5616j0 = c5602f02.f22779M;
                if (zM10161q && !z9) {
                    if (c5616j0.f22880e && this.f22993b.m812i(c5602f02)) {
                        m10209o(c5602f02, true);
                    } else {
                        m10204g(c5602f02, true);
                    }
                }
                if (z9 ? c5616j0.f22880e : c5602f02.m10045q()) {
                    m10209o(c5602f02, z9);
                }
                if (!(z9 ? c5616j0.f22880e : c5602f02.m10045q())) {
                    m10205h(c5602f02, z9);
                }
            }
        }
        if (z9 ? c5602f0.f22779M.f22880e : c5602f0.m10045q()) {
            m10209o(c5602f0, z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x015f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:126:0x0156 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x014d */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: l */
    public final boolean m10206l(C5910n c5910n) {
        boolean z9;
        AbstractC5852n abstractC5852n;
        ?? c2046b;
        ?? M10149e;
        int i9;
        boolean z10;
        C5602f0 c5602f0;
        boolean z11;
        boolean zM10209o;
        C0184c c0184c = this.f22993b;
        C5602f0 c5602f02 = this.f22992a;
        if (!c5602f02.m10010G()) {
            AbstractC4229a.m8493a("performMeasureAndLayout called with unattached root");
        }
        if (!c5602f02.m10011H()) {
            AbstractC4229a.m8493a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f22994c) {
            AbstractC4229a.m8493a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (this.f23000i != null) {
            this.f22994c = true;
            this.f22995d = true;
            try {
                boolean zM786C = c0184c.m786C();
                C2571a c2571a = (C2571a) c0184c.f469a;
                if (zM786C) {
                    z9 = false;
                    while (true) {
                        C2571a c2571a2 = (C2571a) c0184c.f471c;
                        C2571a c2571a3 = (C2571a) c0184c.f470b;
                        if (!((C5584a2) c2571a.f8339h).isEmpty()) {
                            c5602f0 = (C5602f0) ((C5584a2) c2571a.f8339h).first();
                            c2571a.m6039u(c5602f0);
                            z11 = c5602f0.f22797n != null;
                            z10 = false;
                        } else if (!((C5584a2) c2571a3.f8339h).isEmpty()) {
                            c5602f0 = (C5602f0) ((C5584a2) c2571a3.f8339h).first();
                            c2571a3.m6039u(c5602f0);
                            z11 = c5602f0.f22797n != null;
                            z10 = true;
                        } else {
                            if (((C5584a2) c2571a2.f8339h).isEmpty()) {
                                break;
                            }
                            C5602f0 c5602f03 = (C5602f0) ((C5584a2) c2571a2.f8339h).first();
                            c2571a2.m6039u(c5602f03);
                            z10 = true;
                            c5602f0 = c5602f03;
                            z11 = false;
                        }
                        if (z10) {
                            zM10209o = m10195a(this, c5602f0, z11);
                        } else {
                            zM10209o = m10209o(c5602f0, z11);
                            if (c5602f0.f22779M.f22881f) {
                                c0184c.m807b(c5602f0, EnumC5642s.f22976h);
                            }
                            if (c5602f0.m10044p()) {
                                c0184c.m807b(c5602f0, EnumC5642s.f22978j);
                            }
                        }
                        if (c5602f0 == c5602f02 && zM10209o) {
                            z9 = true;
                        }
                    }
                    if (c5910n != null) {
                        c5910n.invoke();
                    }
                } else {
                    z9 = false;
                }
            } finally {
            }
        } else {
            z9 = false;
        }
        C2046b c2046b2 = this.f22997f;
        Object[] objArr = c2046b2.f6891g;
        int i11 = c2046b2.f6893i;
        int i12 = 0;
        while (i12 < i11) {
            C5587b1 c5587b1 = ((C5602f0) objArr[i12]).f22778L;
            C5639r c5639r = c5587b1.f22716c;
            int i13 = 4194304;
            boolean zM10141g = AbstractC5617j1.m10141g(4194304);
            if (zM10141g) {
                abstractC5852n = c5639r.f22950Y;
            } else {
                abstractC5852n = c5639r.f22950Y.f23792k;
                if (abstractC5852n == null) {
                }
                i12++;
                i10 = 0;
            }
            C1020o0 c1020o0 = AbstractC5614i1.f22844T;
            AbstractC5852n abstractC5852nM10108t1 = c5639r.m10108t1(zM10141g);
            while (abstractC5852nM10108t1 != null && (abstractC5852nM10108t1.f23791j & i13) != 0) {
                if ((abstractC5852nM10108t1.f23790i & i13) != 0) {
                    ?? r13 = abstractC5852nM10108t1;
                    ?? r14 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof InterfaceC5648u) {
                            ((InterfaceC5648u) r13).mo1802p0(c5587b1.f22716c);
                        } else {
                            if ((r13.f23790i & i13) != 0 && (r13 instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n2 = ((AbstractC5615j) r13).f22875v;
                                M10149e = r13;
                                c2046b = r14;
                                while (abstractC5852n2 != null) {
                                    int i14 = i13;
                                    if ((abstractC5852n2.f23790i & i14) != 0) {
                                        i10++;
                                        c2046b = c2046b;
                                        if (i10 == 1) {
                                            M10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b == 0) {
                                                c2046b = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (M10149e != 0) {
                                                c2046b.m5056b(M10149e);
                                                M10149e = 0;
                                            }
                                            c2046b.m5056b(abstractC5852n2);
                                        }
                                    }
                                    abstractC5852n2 = abstractC5852n2.f23793l;
                                    i13 = i14;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                }
                                i9 = i13;
                                c2046b = c2046b;
                                if (i10 == 1) {
                                }
                                i13 = i9;
                                i10 = 0;
                                r13 = M10149e;
                                r14 = c2046b;
                            }
                            M10149e = AbstractC5618k.m10149e(c2046b);
                            i13 = i9;
                            i10 = 0;
                            r13 = M10149e;
                            r14 = c2046b;
                        }
                        i9 = i13;
                        c2046b = r14;
                        M10149e = AbstractC5618k.m10149e(c2046b);
                        i13 = i9;
                        i10 = 0;
                        r13 = M10149e;
                        r14 = c2046b;
                    }
                }
                int i15 = i13;
                if (abstractC5852nM10108t1 != abstractC5852n) {
                    abstractC5852nM10108t1 = abstractC5852nM10108t1.f23793l;
                    i13 = i15;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        c2046b2.m5061g();
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x015a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0154 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x014b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x0158 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, x1.f0] */
    /* JADX INFO: renamed from: m */
    public final void m10207m(C5602f0 c5602f0, long j3) {
        AbstractC5852n abstractC5852n;
        ?? M10149e;
        boolean z9 = c5602f0.f22789W;
        C5616j0 c5616j0 = c5602f0.f22779M;
        if (z9) {
            return;
        }
        C5602f0 c5602f02 = this.f22992a;
        if (c5602f0.equals(c5602f02)) {
            AbstractC4229a.m8493a("measureAndLayout called on root");
        }
        if (!c5602f02.m10010G()) {
            AbstractC4229a.m8493a("performMeasureAndLayout called with unattached root");
        }
        if (!c5602f02.m10011H()) {
            AbstractC4229a.m8493a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f22994c) {
            AbstractC4229a.m8493a("performMeasureAndLayout called during measure layout");
        }
        boolean z10 = false;
        if (this.f23000i != null) {
            this.f22994c = true;
            this.f22995d = false;
            try {
                C0184c c0184c = this.f22993b;
                ((C2571a) c0184c.f469a).m6039u(c5602f0);
                ((C2571a) c0184c.f470b).m6039u(c5602f0);
                ((C2571a) c0184c.f471c).m6039u(c5602f0);
                if (m10196c(c5602f0, new C4231a(j3)) || c5616j0.f22881f) {
                    if (AbstractC1416l.m3825a(c5602f0.m10012I(), Boolean.TRUE)) {
                        c5602f0.m10013J();
                    }
                }
                m10203f(c5602f0);
                if (c5602f0.f22775I == EnumC5594d0.f22745i) {
                    c5602f0.m10032e();
                }
                boolean zM10221X0 = c5616j0.f22891p.m10221X0(j3);
                C5602f0 c5602f0M10049u = c5602f0.m10049u();
                if (zM10221X0 && c5602f0M10049u != null) {
                    if (c5602f0.m10046r() == EnumC5594d0.f22743g) {
                        C5602f0.m10001V(c5602f0M10049u, false, 3);
                    } else if (c5602f0.m10046r() == EnumC5594d0.f22744h) {
                        c5602f0M10049u.m10022U(false);
                    }
                }
                if (c5602f0.m10044p() && c5602f0.m10011H()) {
                    c5602f0.m10020R();
                    C3315t c3315t = this.f22996e;
                    c3315t.getClass();
                    if (c5602f0.f22788V > 0) {
                        ((C2046b) c3315t.f10677h).m5056b(c5602f0);
                        c5602f0.f22787U = true;
                    }
                }
                m10202e();
            } finally {
            }
        }
        C2046b c2046b = this.f22997f;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        int i10 = 0;
        while (i10 < i9) {
            C5587b1 c5587b1 = ((C5602f0) objArr[i10]).f22778L;
            C5639r c5639r = c5587b1.f22716c;
            boolean zM10141g = AbstractC5617j1.m10141g(4194304);
            if (zM10141g) {
                abstractC5852n = c5639r.f22950Y;
            } else {
                abstractC5852n = c5639r.f22950Y.f23792k;
                if (abstractC5852n == null) {
                }
                i10++;
                z10 = false;
            }
            C1020o0 c1020o0 = AbstractC5614i1.f22844T;
            AbstractC5852n abstractC5852nM10108t1 = c5639r.m10108t1(zM10141g);
            while (abstractC5852nM10108t1 != null && (abstractC5852nM10108t1.f23791j & 4194304) != 0) {
                if ((abstractC5852nM10108t1.f23790i & 4194304) != 0) {
                    ?? r12 = abstractC5852nM10108t1;
                    ?? c2046b2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC5648u) {
                            ((InterfaceC5648u) r12).mo1802p0(c5587b1.f22716c);
                        } else {
                            if ((r12.f23790i & 4194304) != 0 && (r12 instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n2 = ((AbstractC5615j) r12).f22875v;
                                ?? r15 = z10;
                                M10149e = r12;
                                c2046b2 = c2046b2;
                                while (abstractC5852n2 != null) {
                                    if ((abstractC5852n2.f23790i & 4194304) != 0) {
                                        r15++;
                                        c2046b2 = c2046b2;
                                        if (r15 == 1) {
                                            M10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b2 == 0) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (M10149e != 0) {
                                                c2046b2.m5056b(M10149e);
                                                M10149e = 0;
                                            }
                                            c2046b2.m5056b(abstractC5852n2);
                                        }
                                    }
                                    abstractC5852n2 = abstractC5852n2.f23793l;
                                    M10149e = M10149e;
                                    c2046b2 = c2046b2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z10 = false;
                            r12 = M10149e;
                            c2046b2 = c2046b2;
                        }
                        M10149e = AbstractC5618k.m10149e(c2046b2);
                        z10 = false;
                        r12 = M10149e;
                        c2046b2 = c2046b2;
                    }
                }
                if (abstractC5852nM10108t1 != abstractC5852n) {
                    abstractC5852nM10108t1 = abstractC5852nM10108t1.f23793l;
                    z10 = false;
                }
            }
            i10++;
            z10 = false;
        }
        c2046b.m5061g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: n */
    public final void m10208n() {
        C0184c c0184c = this.f22993b;
        if (c0184c.m786C()) {
            C5602f0 c5602f0 = this.f22992a;
            if (!c5602f0.m10010G()) {
                AbstractC4229a.m8493a("performMeasureAndLayout called with unattached root");
            }
            if (!c5602f0.m10011H()) {
                AbstractC4229a.m8493a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f22994c) {
                AbstractC4229a.m8493a("performMeasureAndLayout called during measure layout");
            }
            if (this.f23000i != null) {
                this.f22994c = true;
                this.f22995d = false;
                try {
                    if ((((C5584a2) ((C2571a) c0184c.f471c).f8339h).isEmpty() || ((C5584a2) ((C2571a) c0184c.f469a).f8339h).isEmpty()) ? false : true) {
                        if (c5602f0.f22797n != null) {
                            m10211q(c5602f0, true);
                        } else {
                            m10210p(c5602f0);
                        }
                    }
                    m10211q(c5602f0, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f22994c = false;
                        this.f22995d = false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m10209o(C5602f0 c5602f0, boolean z9) {
        C4231a c4231a;
        boolean zM10197d = false;
        if (!c5602f0.f22789W && m10200k(c5602f0)) {
            if (c5602f0 == this.f22992a) {
                c4231a = this.f23000i;
                c4231a.getClass();
            } else {
                c4231a = null;
            }
            if (z9) {
                if (c5602f0.f22779M.f22880e) {
                    zM10197d = m10196c(c5602f0, c4231a);
                }
            } else if (c5602f0.m10045q()) {
                zM10197d = m10197d(c5602f0, c4231a);
            }
            m10202e();
        }
        return zM10197d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m10210p(C5602f0 c5602f0) {
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (c5602f02.m10046r() == EnumC5594d0.f22743g || c5602f02.f22779M.f22891p.f23014D.m10060e()) {
                if (AbstractC5618k.m10161q(c5602f02)) {
                    m10211q(c5602f02, true);
                } else {
                    m10210p(c5602f02);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m10211q(C5602f0 c5602f0, boolean z9) {
        C4231a c4231a;
        if (c5602f0.f22789W) {
            return;
        }
        if (c5602f0 == this.f22992a) {
            c4231a = this.f23000i;
            c4231a.getClass();
        } else {
            c4231a = null;
        }
        if (z9) {
            m10196c(c5602f0, c4231a);
        } else {
            m10197d(c5602f0, c4231a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m10212r(C5602f0 c5602f0, boolean z9) {
        int iOrdinal = c5602f0.f22779M.f22879d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f22999h.m5056b(new C5643s0(c5602f0, false, z9));
            } else {
                if (iOrdinal != 4) {
                    C3193a.m6822k();
                    return false;
                }
                if (!c5602f0.m10045q() || z9) {
                    c5602f0.f22779M.f22891p.f23011A = true;
                    if (!c5602f0.f22789W && (c5602f0.m10011H() || m10199j(c5602f0))) {
                        C5602f0 c5602f0M10049u = c5602f0.m10049u();
                        if (c5602f0M10049u == null || !c5602f0M10049u.m10045q()) {
                            this.f22993b.m807b(c5602f0, EnumC5642s.f22977i);
                        }
                        if (!this.f22995d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m10213s(long j3) {
        C4231a c4231a = this.f23000i;
        if (c4231a == null ? false : C4231a.m8498b(c4231a.f13903a, j3)) {
            return;
        }
        if (this.f22994c) {
            AbstractC4229a.m8493a("updateRootConstraints called while measuring");
        }
        this.f23000i = new C4231a(j3);
        C5602f0 c5602f0 = this.f22992a;
        C5602f0 c5602f02 = c5602f0.f22797n;
        C5616j0 c5616j0 = c5602f0.f22779M;
        if (c5602f02 != null) {
            c5616j0.f22880e = true;
        }
        c5616j0.f22891p.f23011A = true;
        this.f22993b.m807b(c5602f0, c5602f02 != null ? EnumC5642s.f22975g : EnumC5642s.f22977i);
    }
}
