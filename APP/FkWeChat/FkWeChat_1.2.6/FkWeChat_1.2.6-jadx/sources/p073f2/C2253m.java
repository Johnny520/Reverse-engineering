package p073f2;

import java.util.List;
import p091g2.C2508e;
import p117i.C3037a0;
import p117i.C3076o0;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4598w1;
import p250r1.C6455e;
import p349y0.C9508c;

/* JADX INFO: renamed from: f2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2253m extends C2255n {

    /* JADX INFO: renamed from: c */
    public final InterfaceC4507m.c f6185c;

    /* JADX INFO: renamed from: f */
    public InterfaceC3578w f6188f;

    /* JADX INFO: renamed from: g */
    public C2261q f6189g;

    /* JADX INFO: renamed from: h */
    public boolean f6190h;

    /* JADX INFO: renamed from: d */
    public final C2508e f6186d = new C2508e();

    /* JADX INFO: renamed from: e */
    public final C3037a0 f6187e = new C3037a0(2);

    /* JADX INFO: renamed from: i */
    public boolean f6191i = true;

    /* JADX INFO: renamed from: j */
    public boolean f6192j = true;

    public C2253m(InterfaceC4507m.c cVar) {
        this.f6185c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo8179a(p117i.C3037a0 r46, p135j2.InterfaceC3578w r47, p073f2.C2241g r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073f2.C2253m.mo8179a(i.a0, j2.w, f2.g, boolean):boolean");
    }

    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: b */
    public void mo8180b(C2241g c2241g) {
        super.mo8180b(c2241g);
        C2261q c2261q = this.f6189g;
        if (c2261q == null) {
            return;
        }
        this.f6190h = this.f6191i;
        List listM8216c = c2261q.m8216c();
        int size = listM8216c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2236d0 c2236d0 = (C2236d0) listM8216c.get(i10);
            boolean zM8078i = c2236d0.m8078i();
            boolean zM8123a = c2241g.m8123a(c2236d0.m8075f());
            boolean z10 = this.f6191i;
            if ((!zM8078i && !zM8123a) || (!zM8078i && !z10)) {
                this.f6186d.m8997g(c2236d0.m8075f());
            }
        }
        this.f6191i = false;
        this.f6192j = AbstractC2269u.m8264i(c2261q.m8220g(), AbstractC2269u.f6230a.m8266b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: d */
    public void mo8181d() {
        C9508c c9508cM8191g = m8191g();
        Object[] objArr = c9508cM8191g.f32299q;
        int iM37039l = c9508cM8191g.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((C2253m) objArr[i10]).mo8181d();
        }
        ?? M18008j = this.f6185c;
        int iM17812a = AbstractC4547h1.m17812a(16);
        ?? c9508c = 0;
        while (M18008j != 0) {
            if (M18008j instanceof InterfaceC4598w1) {
                ((InterfaceC4598w1) M18008j).mo8048G0();
            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                int i11 = 0;
                M18008j = M18008j;
                c9508c = c9508c;
                while (cVarM18050H2 != null) {
                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                        i11++;
                        c9508c = c9508c;
                        if (i11 == 1) {
                            M18008j = cVarM18050H2;
                        } else {
                            if (c9508c == 0) {
                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                            }
                            if (M18008j != 0) {
                                c9508c.m37029b(M18008j);
                                M18008j = 0;
                            }
                            c9508c.m37029b(cVarM18050H2);
                        }
                    }
                    cVarM18050H2 = cVarM18050H2.m17453d2();
                    M18008j = M18008j;
                    c9508c = c9508c;
                }
                if (i11 == 1) {
                }
            }
            M18008j = AbstractC4557k.m18008j(c9508c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: e */
    public boolean mo8182e(C2241g c2241g) {
        boolean z10 = false;
        z10 = false;
        if (!this.f6187e.m11225g() && this.f6185c.m17461m2()) {
            C2261q c2261q = this.f6189g;
            c2261q.getClass();
            InterfaceC3578w interfaceC3578w = this.f6188f;
            interfaceC3578w.getClass();
            long jMo13242a = interfaceC3578w.mo13242a();
            ?? M18008j = this.f6185c;
            int iM17812a = AbstractC4547h1.m17812a(16);
            ?? c9508c = 0;
            while (M18008j != 0) {
                if (M18008j instanceof InterfaceC4598w1) {
                    ((InterfaceC4598w1) M18008j).mo8047A0(c2261q, EnumC2265s.f6227s, jMo13242a);
                } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                    InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                    int i10 = 0;
                    M18008j = M18008j;
                    c9508c = c9508c;
                    while (cVarM18050H2 != null) {
                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                            i10++;
                            c9508c = c9508c;
                            if (i10 == 1) {
                                M18008j = cVarM18050H2;
                            } else {
                                if (c9508c == 0) {
                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                }
                                if (M18008j != 0) {
                                    c9508c.m37029b(M18008j);
                                    M18008j = 0;
                                }
                                c9508c.m37029b(cVarM18050H2);
                            }
                        }
                        cVarM18050H2 = cVarM18050H2.m17453d2();
                        M18008j = M18008j;
                        c9508c = c9508c;
                    }
                    if (i10 == 1) {
                    }
                }
                M18008j = AbstractC4557k.m18008j(c9508c);
            }
            if (this.f6185c.m17461m2()) {
                C9508c c9508cM8191g = m8191g();
                Object[] objArr = c9508cM8191g.f32299q;
                int iM37039l = c9508cM8191g.m37039l();
                for (int i11 = 0; i11 < iM37039l; i11++) {
                    ((C2253m) objArr[i11]).mo8182e(c2241g);
                }
            }
            z10 = true;
        }
        mo8180b(c2241g);
        m8185j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: f */
    public boolean mo8183f(C3037a0 c3037a0, InterfaceC3578w interfaceC3578w, C2241g c2241g, boolean z10) {
        if (this.f6187e.m11225g() || !this.f6185c.m17461m2()) {
            return false;
        }
        C2261q c2261q = this.f6189g;
        c2261q.getClass();
        InterfaceC3578w interfaceC3578w2 = this.f6188f;
        interfaceC3578w2.getClass();
        long jMo13242a = interfaceC3578w2.mo13242a();
        ?? M18008j = this.f6185c;
        int iM17812a = AbstractC4547h1.m17812a(16);
        ?? c9508c = 0;
        while (M18008j != 0) {
            if (M18008j instanceof InterfaceC4598w1) {
                ((InterfaceC4598w1) M18008j).mo8047A0(c2261q, EnumC2265s.f6225q, jMo13242a);
            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                int i10 = 0;
                M18008j = M18008j;
                c9508c = c9508c;
                while (cVarM18050H2 != null) {
                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                        i10++;
                        c9508c = c9508c;
                        if (i10 == 1) {
                            M18008j = cVarM18050H2;
                        } else {
                            if (c9508c == 0) {
                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                            }
                            if (M18008j != 0) {
                                c9508c.m37029b(M18008j);
                                M18008j = 0;
                            }
                            c9508c.m37029b(cVarM18050H2);
                        }
                    }
                    cVarM18050H2 = cVarM18050H2.m17453d2();
                    M18008j = M18008j;
                    c9508c = c9508c;
                }
                if (i10 == 1) {
                }
            }
            M18008j = AbstractC4557k.m18008j(c9508c);
        }
        if (this.f6185c.m17461m2()) {
            C9508c c9508cM8191g = m8191g();
            Object[] objArr = c9508cM8191g.f32299q;
            int iM37039l = c9508cM8191g.m37039l();
            for (int i11 = 0; i11 < iM37039l; i11++) {
                C2253m c2253m = (C2253m) objArr[i11];
                C3037a0 c3037a02 = this.f6187e;
                InterfaceC3578w interfaceC3578w3 = this.f6188f;
                interfaceC3578w3.getClass();
                c2253m.mo8183f(c3037a02, interfaceC3578w3, c2241g, z10);
            }
        }
        if (this.f6185c.m17461m2()) {
            ?? M18008j2 = this.f6185c;
            int iM17812a2 = AbstractC4547h1.m17812a(16);
            ?? c9508c2 = 0;
            while (M18008j2 != 0) {
                if (M18008j2 instanceof InterfaceC4598w1) {
                    ((InterfaceC4598w1) M18008j2).mo8047A0(c2261q, EnumC2265s.f6226r, jMo13242a);
                } else if ((M18008j2.m17457h2() & iM17812a2) != 0 && (M18008j2 instanceof AbstractC4565m)) {
                    InterfaceC4507m.c cVarM18050H22 = ((AbstractC4565m) M18008j2).m18050H2();
                    int i12 = 0;
                    c9508c2 = c9508c2;
                    M18008j2 = M18008j2;
                    while (cVarM18050H22 != null) {
                        if ((cVarM18050H22.m17457h2() & iM17812a2) != 0) {
                            i12++;
                            c9508c2 = c9508c2;
                            if (i12 == 1) {
                                M18008j2 = cVarM18050H22;
                            } else {
                                if (c9508c2 == 0) {
                                    c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
                                }
                                if (M18008j2 != 0) {
                                    c9508c2.m37029b(M18008j2);
                                    M18008j2 = 0;
                                }
                                c9508c2.m37029b(cVarM18050H22);
                            }
                        }
                        cVarM18050H22 = cVarM18050H22.m17453d2();
                        c9508c2 = c9508c2;
                        M18008j2 = M18008j2;
                    }
                    if (i12 == 1) {
                    }
                }
                M18008j2 = AbstractC4557k.m18008j(c9508c2);
            }
        }
        return true;
    }

    @Override // p073f2.C2255n
    /* JADX INFO: renamed from: h */
    public void mo8184h(long j10, C3076o0 c3076o0) {
        if (this.f6186d.m8993c(j10) && !c3076o0.m11583a(this)) {
            this.f6186d.m8997g(j10);
            this.f6187e.m11228j(j10);
        }
        C9508c c9508cM8191g = m8191g();
        Object[] objArr = c9508cM8191g.f32299q;
        int iM37039l = c9508cM8191g.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((C2253m) objArr[i10]).mo8184h(j10, c3076o0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8185j() {
        this.f6187e.m11220a();
        this.f6188f = null;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC4507m.c m8186k() {
        return this.f6185c;
    }

    /* JADX INFO: renamed from: l */
    public final C2508e m8187l() {
        return this.f6186d;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8188m(C2261q c2261q, C2261q c2261q2) {
        if (c2261q == null || c2261q.m8216c().size() != c2261q2.m8216c().size()) {
            return true;
        }
        int size = c2261q2.m8216c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C6455e.m25556j(((C2236d0) c2261q.m8216c().get(i10)).m8077h(), ((C2236d0) c2261q2.m8216c().get(i10)).m8077h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m8189n() {
        this.f6191i = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.f6185c + ", children=" + m8191g() + ", pointerIds=" + this.f6186d + ')';
    }
}
