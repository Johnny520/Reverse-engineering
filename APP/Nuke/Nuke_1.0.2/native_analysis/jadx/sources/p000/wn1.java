package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wn1 implements xn1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // p000.xn1
    /* JADX INFO: renamed from: b */
    public final boolean mo2444b(th1 th1Var) {
        ?? zk1Var = 0;
        while (true) {
            int i = 0;
            if (th1Var == 0) {
                return false;
            }
            if (th1Var instanceof r12) {
                ((r12) th1Var).mo3568t0();
            } else if ((th1Var.f10759j & 16) != 0 && (th1Var instanceof u60)) {
                th1 th1Var2 = ((u60) th1Var).f11116w;
                zk1Var = zk1Var;
                th1Var = th1Var;
                while (th1Var2 != null) {
                    if ((th1Var2.f10759j & 16) != 0) {
                        i++;
                        zk1Var = zk1Var;
                        if (i == 1) {
                            th1Var = th1Var2;
                        } else {
                            if (zk1Var == 0) {
                                zk1Var = new zk1(new th1[16]);
                            }
                            if (th1Var != 0) {
                                zk1Var.m6423b(th1Var);
                                th1Var = 0;
                            }
                            zk1Var.m6423b(th1Var2);
                        }
                    }
                    th1Var2 = th1Var2.f10762m;
                    zk1Var = zk1Var;
                    th1Var = th1Var;
                }
                if (i == 1) {
                }
            }
            th1Var = sp0.m4952m(zk1Var);
        }
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: d */
    public final int mo2445d() {
        return 16;
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: l */
    public final void mo2448l(r61 r61Var, long j, xs0 xs0Var, int i, boolean z) {
        r61Var.m4394z(j, xs0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000.xn1
    /* JADX INFO: renamed from: o */
    public final boolean mo2450o(xs0 xs0Var, r61 r61Var) {
        zn1 zn1Var = (zn1) r61Var.f9372M.f12034e;
        zn1Var.getClass();
        th1 th1VarM6453U0 = zn1Var.m6453U0(ao1.m244g(16));
        if (th1VarM6453U0 != null && th1VarM6453U0.f10770u) {
            if (!th1VarM6453U0.f10757h.f10770u) {
                kz0.m2764b("visitLocalDescendants called on an unattached node");
            }
            th1 th1Var = th1VarM6453U0.f10757h;
            if ((th1Var.f10760k & 16) != 0) {
                while (th1Var != null) {
                    if ((th1Var.f10759j & 16) != 0) {
                        ?? M4952m = th1Var;
                        ?? zk1Var = 0;
                        while (M4952m != 0) {
                            if (M4952m instanceof r12) {
                                if (((r12) M4952m).mo3566b0()) {
                                    xs0Var.f13157j = xs0Var.f13155h.f6164b - 1;
                                    return true;
                                }
                            } else if ((M4952m.f10759j & 16) != 0 && (M4952m instanceof u60)) {
                                th1 th1Var2 = ((u60) M4952m).f11116w;
                                int i = 0;
                                M4952m = M4952m;
                                zk1Var = zk1Var;
                                while (th1Var2 != null) {
                                    if ((th1Var2.f10759j & 16) != 0) {
                                        i++;
                                        zk1Var = zk1Var;
                                        if (i == 1) {
                                            M4952m = th1Var2;
                                        } else {
                                            if (zk1Var == 0) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (M4952m != 0) {
                                                zk1Var.m6423b(M4952m);
                                                M4952m = 0;
                                            }
                                            zk1Var.m6423b(th1Var2);
                                        }
                                    }
                                    th1Var2 = th1Var2.f10762m;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    th1Var = th1Var.f10762m;
                }
            }
        }
        return false;
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: r */
    public final boolean mo2452r(r61 r61Var) {
        return true;
    }
}
