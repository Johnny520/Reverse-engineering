package p339x1;

import p131j0.C2046b;
import p292u1.AbstractC4229a;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: x1.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5591c1 implements InterfaceC5599e1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: a */
    public final int mo9986a() {
        return 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: c */
    public final boolean mo9987c(C5602f0 c5602f0) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0072 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x007b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: d */
    public final boolean mo9988d(C5633p c5633p, C5602f0 c5602f0) {
        AbstractC5614i1 abstractC5614i1 = c5602f0.f22778L.f22717d;
        abstractC5614i1.getClass();
        AbstractC5852n abstractC5852nM10108t1 = abstractC5614i1.m10108t1(AbstractC5617j1.m10141g(16));
        if (abstractC5852nM10108t1 != null && abstractC5852nM10108t1.f23801t) {
            if (!abstractC5852nM10108t1.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitLocalDescendants called on an unattached node");
            }
            AbstractC5852n abstractC5852n = abstractC5852nM10108t1.f23788g;
            if ((abstractC5852n.f23791j & 16) != 0) {
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & 16) != 0) {
                        ?? M10149e = abstractC5852n;
                        ?? c2046b = 0;
                        while (M10149e != 0) {
                            if (M10149e instanceof InterfaceC5656w1) {
                                if (((InterfaceC5656w1) M10149e).mo9974J0()) {
                                    c5633p.f22942i = c5633p.f22940g.f2924b - 1;
                                    return true;
                                }
                            } else if ((M10149e.f23790i & 16) != 0 && (M10149e instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n2 = ((AbstractC5615j) M10149e).f22875v;
                                int i9 = 0;
                                M10149e = M10149e;
                                c2046b = c2046b;
                                while (abstractC5852n2 != null) {
                                    if ((abstractC5852n2.f23790i & 16) != 0) {
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
                    abstractC5852n = abstractC5852n.f23793l;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: e */
    public final void mo9989e(C5602f0 c5602f0, long j3, C5633p c5633p, int i9, boolean z9) {
        c5602f0.m10054z(j3, c5633p, i9, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0045 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x003f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: f */
    public final boolean mo9990f(AbstractC5852n abstractC5852n) {
        ?? c2046b = 0;
        while (true) {
            int i9 = 0;
            if (abstractC5852n == 0) {
                return false;
            }
            if (abstractC5852n instanceof InterfaceC5656w1) {
                ((InterfaceC5656w1) abstractC5852n).mo9976h0();
            } else if ((abstractC5852n.f23790i & 16) != 0 && (abstractC5852n instanceof AbstractC5615j)) {
                AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852n).f22875v;
                c2046b = c2046b;
                abstractC5852n = abstractC5852n;
                while (abstractC5852n2 != null) {
                    if ((abstractC5852n2.f23790i & 16) != 0) {
                        i9++;
                        c2046b = c2046b;
                        if (i9 == 1) {
                            abstractC5852n = abstractC5852n2;
                        } else {
                            if (c2046b == 0) {
                                c2046b = new C2046b(new AbstractC5852n[16]);
                            }
                            if (abstractC5852n != 0) {
                                c2046b.m5056b(abstractC5852n);
                                abstractC5852n = 0;
                            }
                            c2046b.m5056b(abstractC5852n2);
                        }
                    }
                    abstractC5852n2 = abstractC5852n2.f23793l;
                    c2046b = c2046b;
                    abstractC5852n = abstractC5852n;
                }
                if (i9 == 1) {
                }
            }
            abstractC5852n = AbstractC5618k.m10149e(c2046b);
        }
    }
}
