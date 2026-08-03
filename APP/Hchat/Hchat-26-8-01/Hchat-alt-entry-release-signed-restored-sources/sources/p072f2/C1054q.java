package p072f2;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import p016b1.C0166f;
import p057e1.C0808c;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p131j0.C2046b;
import p308v1.AbstractC4434w;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: f2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1054q {

    /* JADX INFO: renamed from: a */
    public final AbstractC5852n f3347a;

    /* JADX INFO: renamed from: b */
    public final boolean f3348b;

    /* JADX INFO: renamed from: c */
    public final C5602f0 f3349c;

    /* JADX INFO: renamed from: d */
    public final C1050m f3350d;

    /* JADX INFO: renamed from: e */
    public C1054q f3351e;

    /* JADX INFO: renamed from: f */
    public final int f3352f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1054q(AbstractC5852n abstractC5852n, boolean z9, C5602f0 c5602f0, C1050m c1050m) {
        this.f3347a = abstractC5852n;
        this.f3348b = z9;
        this.f3349c = c5602f0;
        this.f3350d = c1050m;
        this.f3352f = c5602f0.f22791h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m2649j(int i9, C1054q c1054q) {
        return c1054q.m2658i((i9 & 1) != 0 ? !c1054q.f3348b : false, (i9 & 2) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: a */
    public final C0808c m2650a(AbstractC5614i1 abstractC5614i1) {
        ?? M10149e;
        C1054q c1054qM2660l = m2660l();
        if (c1054qM2660l == null) {
            return C0808c.f2415e;
        }
        AbstractC5852n abstractC5852n = c1054qM2660l.f3349c.f22778L.f22719f;
        if ((abstractC5852n.f23791j & 8) != 0) {
            loop0: while (abstractC5852n != null) {
                if ((abstractC5852n.f23790i & 8) != 0) {
                    M10149e = abstractC5852n;
                    ?? c2046b = 0;
                    while (M10149e != 0) {
                        if (M10149e instanceof InterfaceC5665z1) {
                            if (((InterfaceC5665z1) M10149e).mo2629A()) {
                                break loop0;
                            }
                        } else if ((M10149e.f23790i & 8) != 0 && (M10149e instanceof AbstractC5615j)) {
                            AbstractC5852n abstractC5852n2 = ((AbstractC5615j) M10149e).f22875v;
                            int i9 = 0;
                            M10149e = M10149e;
                            c2046b = c2046b;
                            while (abstractC5852n2 != null) {
                                if ((abstractC5852n2.f23790i & 8) != 0) {
                                    i9++;
                                    c2046b = c2046b;
                                    if (i9 == 1) {
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
                                M10149e = M10149e;
                                c2046b = c2046b;
                            }
                            if (i9 == 1) {
                            }
                        }
                        M10149e = AbstractC5618k.m10149e(c2046b);
                    }
                }
                if ((abstractC5852n.f23791j & 8) == 0) {
                    break;
                }
                abstractC5852n = abstractC5852n.f23793l;
            }
            M10149e = 0;
        } else {
            M10149e = 0;
        }
        InterfaceC5665z1 interfaceC5665z1 = (InterfaceC5665z1) M10149e;
        AbstractC5614i1 abstractC5614i1M10164t = interfaceC5665z1 != null ? AbstractC5618k.m10164t(interfaceC5665z1, 8) : null;
        return abstractC5614i1M10164t == null ? c1054qM2660l.m2650a(abstractC5614i1) : abstractC5614i1M10164t.mo8866k0(abstractC5614i1, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1054q m2651b(C1046i c1046i, InterfaceC1231l interfaceC1231l) {
        C1050m c1050m = new C1050m();
        c1050m.f3343i = false;
        c1050m.f3344j = false;
        interfaceC1231l.invoke(c1050m);
        C1054q c1054q = new C1054q(new C1053p(interfaceC1231l), false, new C5602f0(this.f3352f + (c1046i != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000), true), c1050m);
        c1054q.f3351e = this;
        return c1054q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2652c(C5602f0 c5602f0, ArrayList arrayList) {
        C2046b c2046bM10052x = c5602f0.m10052x();
        Object[] objArr = c2046bM10052x.f6891g;
        int i9 = c2046bM10052x.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (c5602f02.m10010G() && !c5602f02.f22789W) {
                if (c5602f02.f22778L.m9982d(8)) {
                    arrayList.add(AbstractC1057t.m2670a(c5602f02, this.f3348b));
                } else {
                    m2652c(c5602f02, arrayList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC5614i1 m2653d() {
        if (!m2663o()) {
            InterfaceC5665z1 interfaceC5665z1M2655f = m2655f();
            return interfaceC5665z1M2655f != null ? AbstractC5618k.m10164t(interfaceC5665z1M2655f, 8) : this.f3349c.f22778L.f22716c;
        }
        C1054q c1054qM2660l = m2660l();
        if (c1054qM2660l != null) {
            return c1054qM2660l.m2653d();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2654e(ArrayList arrayList, ArrayList arrayList2) {
        m2667s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1054q c1054q = (C1054q) arrayList.get(size2);
            if (c1054q.m2664p()) {
                arrayList2.add(c1054q);
            } else if (!c1054q.f3350d.f3344j) {
                c1054q.m2654e(arrayList, arrayList2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x00e1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x009b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x009b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x00db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x00d2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC5665z1 m2655f() {
        ?? M10149e;
        boolean z9;
        boolean z10 = this.f3350d.f3343i;
        ?? r42 = 0;
        r42 = 0;
        r42 = 0;
        r42 = 0;
        C5602f0 c5602f0 = this.f3349c;
        if (z10) {
            AbstractC5852n abstractC5852n = c5602f0.f22778L.f22719f;
            if ((abstractC5852n.f23791j & 8) != 0) {
                M10149e = 0;
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & 8) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof InterfaceC5665z1) {
                                InterfaceC5665z1 interfaceC5665z1 = (InterfaceC5665z1) abstractC5852nM10149e;
                                ?? r5 = M10149e;
                                if (interfaceC5665z1.mo2629A()) {
                                    r5 = M10149e;
                                    if (interfaceC5665z1.mo1609S0()) {
                                        return interfaceC5665z1;
                                    }
                                    if (M10149e == 0) {
                                        r5 = interfaceC5665z1;
                                    }
                                }
                                z9 = false;
                                M10149e = r5;
                            } else {
                                z9 = true;
                                M10149e = M10149e;
                            }
                            if (z9 && (abstractC5852nM10149e.f23790i & 8) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i9 = 0;
                                for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                    if ((abstractC5852n2.f23790i & 8) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC5852nM10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b == null) {
                                                c2046b = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b.m5056b(abstractC5852n2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                        }
                    }
                    if ((abstractC5852n.f23791j & 8) == 0) {
                        break;
                    }
                    abstractC5852n = abstractC5852n.f23793l;
                    M10149e = M10149e;
                }
                r42 = M10149e;
            }
        } else {
            AbstractC5852n abstractC5852n3 = c5602f0.f22778L.f22719f;
            if ((abstractC5852n3.f23791j & 8) != 0) {
                loop3: while (abstractC5852n3 != null) {
                    if ((abstractC5852n3.f23790i & 8) != 0) {
                        M10149e = abstractC5852n3;
                        ?? c2046b2 = 0;
                        while (M10149e != 0) {
                            if (M10149e instanceof InterfaceC5665z1) {
                                if (((InterfaceC5665z1) M10149e).mo2629A()) {
                                    r42 = M10149e;
                                }
                            } else if ((M10149e.f23790i & 8) != 0 && (M10149e instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n4 = ((AbstractC5615j) M10149e).f22875v;
                                int i10 = 0;
                                M10149e = M10149e;
                                c2046b2 = c2046b2;
                                while (abstractC5852n4 != null) {
                                    if ((abstractC5852n4.f23790i & 8) != 0) {
                                        i10++;
                                        c2046b2 = c2046b2;
                                        if (i10 == 1) {
                                            M10149e = abstractC5852n4;
                                        } else {
                                            if (c2046b2 == 0) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (M10149e != 0) {
                                                c2046b2.m5056b(M10149e);
                                                M10149e = 0;
                                            }
                                            c2046b2.m5056b(abstractC5852n4);
                                        }
                                    }
                                    abstractC5852n4 = abstractC5852n4.f23793l;
                                    M10149e = M10149e;
                                    c2046b2 = c2046b2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M10149e = AbstractC5618k.m10149e(c2046b2);
                        }
                    }
                    if ((abstractC5852n3.f23791j & 8) == 0) {
                        break;
                    }
                    abstractC5852n3 = abstractC5852n3.f23793l;
                }
            }
        }
        return (InterfaceC5665z1) r42;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C0808c m2656g() {
        AbstractC5614i1 abstractC5614i1M2653d = m2653d();
        if (abstractC5614i1M2653d != null) {
            if (!abstractC5614i1M2653d.mo10106r1().f23801t) {
                abstractC5614i1M2653d = null;
            }
            if (abstractC5614i1M2653d != null) {
                return AbstractC4434w.m8884h(abstractC5614i1M2653d).mo8866k0(abstractC5614i1M2653d, true);
            }
        }
        return C0808c.f2415e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C0808c m2657h() {
        AbstractC5614i1 abstractC5614i1M2653d = m2653d();
        if (abstractC5614i1M2653d != null) {
            if (!abstractC5614i1M2653d.mo10106r1().f23801t) {
                abstractC5614i1M2653d = null;
            }
            if (abstractC5614i1M2653d != null) {
                return AbstractC4434w.m8882f(abstractC5614i1M2653d, true);
            }
        }
        return C0808c.f2415e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m2658i(boolean z9, boolean z10) {
        if (!z9 && this.f3350d.f3344j) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        if (!m2664p()) {
            return m2667s(arrayList, z10);
        }
        ArrayList arrayList2 = new ArrayList();
        m2654e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C1050m m2659k() {
        boolean zM2664p = m2664p();
        C1050m c1050m = this.f3350d;
        if (!zM2664p) {
            return c1050m;
        }
        C1050m c1050mM2645c = c1050m.m2645c();
        m2666r(new ArrayList(), c1050mM2645c);
        return c1050mM2645c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C1054q m2660l() {
        C5602f0 c5602f0M10049u;
        C1054q c1054q = this.f3351e;
        if (c1054q != null) {
            return c1054q;
        }
        C5602f0 c5602f0 = this.f3349c;
        boolean z9 = this.f3348b;
        if (z9) {
            c5602f0M10049u = c5602f0.m10049u();
            while (c5602f0M10049u != null) {
                C1050m c1050mM10051w = c5602f0M10049u.m10051w();
                if (c1050mM10051w != null && c1050mM10051w.f3343i) {
                    break;
                }
                c5602f0M10049u = c5602f0M10049u.m10049u();
            }
            c5602f0M10049u = null;
        } else {
            c5602f0M10049u = null;
        }
        if (c5602f0M10049u == null) {
            C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
            while (true) {
                if (c5602f0M10049u2 == null) {
                    c5602f0M10049u = null;
                    break;
                }
                if (c5602f0M10049u2.f22778L.m9982d(8)) {
                    c5602f0M10049u = c5602f0M10049u2;
                    break;
                }
                c5602f0M10049u2 = c5602f0M10049u2.m10049u();
            }
        }
        if (c5602f0M10049u == null) {
            return null;
        }
        return AbstractC1057t.m2670a(c5602f0M10049u, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C0808c m2661m() {
        InterfaceC5612i interfaceC5612iM2655f = m2655f();
        if (interfaceC5612iM2655f == null) {
            return this.f3349c.f22778L.f22716c.m10081N1();
        }
        AbstractC5852n abstractC5852n = ((AbstractC5852n) interfaceC5612iM2655f).f23788g;
        Object objM2320g = this.f3350d.f3341g.m2320g(AbstractC1049l.f3316b);
        if (objM2320g == null) {
            objM2320g = null;
        }
        return AbstractC5618k.m10153i(abstractC5852n, objM2320g != null, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final C1050m m2662n() {
        return this.f3350d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m2663o() {
        return this.f3351e != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m2664p() {
        return this.f3348b && this.f3350d.f3343i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m2665q() {
        if (m2663o() || !m2649j(4, this).isEmpty()) {
            return false;
        }
        C5602f0 c5602f0M10049u = this.f3349c.m10049u();
        while (true) {
            if (c5602f0M10049u == null) {
                c5602f0M10049u = null;
                break;
            }
            C1050m c1050mM10051w = c5602f0M10049u.m10051w();
            if (c1050mM10051w != null && c1050mM10051w.f3343i) {
                break;
            }
            c5602f0M10049u = c5602f0M10049u.m10049u();
        }
        return c5602f0M10049u == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m2666r(ArrayList arrayList, C1050m c1050m) {
        if (this.f3350d.f3344j) {
            return;
        }
        m2667s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1054q c1054q = (C1054q) arrayList.get(size2);
            if (!c1054q.m2664p()) {
                c1050m.m2647e(c1054q.f3350d);
                c1054q.m2666r(arrayList, c1050m);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final List m2667s(ArrayList arrayList, boolean z9) {
        if (m2663o()) {
            return C4173t.f13710g;
        }
        m2652c(this.f3349c, arrayList);
        if (z9) {
            C1050m c1050m = this.f3350d;
            C0943k0 c0943k0 = c1050m.f3341g;
            Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3400y);
            if (objM2320g == null) {
                objM2320g = null;
            }
            C1046i c1046i = (C1046i) objM2320g;
            if (c1046i != null && c1050m.f3343i && !arrayList.isEmpty()) {
                arrayList.add(m2651b(c1046i, new C0166f(c1046i, 8)));
            }
            C1061x c1061x = AbstractC1058u.f3376a;
            if (c0943k0.m2316c(c1061x) && !arrayList.isEmpty() && c1050m.f3343i) {
                Object objM2320g2 = c0943k0.m2320g(c1061x);
                if (objM2320g2 == null) {
                    objM2320g2 = null;
                }
                List list = (List) objM2320g2;
                String str = list != null ? (String) AbstractC4166m.m8424v1(list) : null;
                if (str != null) {
                    arrayList.add(0, m2651b(null, new C0166f(str, 9)));
                }
            }
        }
        return arrayList;
    }
}
