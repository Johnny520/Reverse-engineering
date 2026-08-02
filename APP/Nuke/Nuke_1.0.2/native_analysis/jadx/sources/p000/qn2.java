package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qn2 {

    /* JADX INFO: renamed from: a */
    public final th1 f9047a;

    /* JADX INFO: renamed from: b */
    public final boolean f9048b;

    /* JADX INFO: renamed from: c */
    public final r61 f9049c;

    /* JADX INFO: renamed from: d */
    public final ln2 f9050d;

    /* JADX INFO: renamed from: e */
    public qn2 f9051e;

    /* JADX INFO: renamed from: f */
    public final int f9052f;

    public qn2(th1 th1Var, boolean z, r61 r61Var, ln2 ln2Var) {
        this.f9047a = th1Var;
        this.f9048b = z;
        this.f9049c = r61Var;
        this.f9050d = ln2Var;
        this.f9052f = r61Var.f9385i;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m4199j(int i, qn2 qn2Var) {
        return qn2Var.m4208i((i & 1) != 0 ? !qn2Var.f9048b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: a */
    public final o62 m4200a(zn1 zn1Var) {
        ?? M4952m;
        qn2 qn2VarM4210l = m4210l();
        if (qn2VarM4210l == null) {
            return o62.f7535e;
        }
        th1 th1Var = (th1) qn2VarM4210l.f9049c.f9372M.f12036g;
        if ((th1Var.f10760k & 8) != 0) {
            loop0: while (th1Var != null) {
                if ((th1Var.f10759j & 8) != 0) {
                    M4952m = th1Var;
                    ?? zk1Var = 0;
                    while (M4952m != 0) {
                        if (M4952m instanceof on2) {
                            if (((on2) M4952m).mo1364i()) {
                                break loop0;
                            }
                        } else if ((M4952m.f10759j & 8) != 0 && (M4952m instanceof u60)) {
                            th1 th1Var2 = ((u60) M4952m).f11116w;
                            int i = 0;
                            M4952m = M4952m;
                            zk1Var = zk1Var;
                            while (th1Var2 != null) {
                                if ((th1Var2.f10759j & 8) != 0) {
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
                if ((th1Var.f10760k & 8) == 0) {
                    break;
                }
                th1Var = th1Var.f10762m;
            }
            M4952m = 0;
        } else {
            M4952m = 0;
        }
        on2 on2Var = (on2) M4952m;
        zn1 zn1VarM4927Z = on2Var != null ? sp0.m4927Z(on2Var, 8) : null;
        return zn1VarM4927Z == null ? qn2VarM4210l.m4200a(zn1Var) : zn1VarM4927Z.mo644J(zn1Var, true);
    }

    /* JADX INFO: renamed from: b */
    public final qn2 m4201b(va2 va2Var, in0 in0Var) {
        ln2 ln2Var = new ln2();
        ln2Var.f6223j = false;
        ln2Var.f6224k = false;
        in0Var.mo5j(ln2Var);
        qn2 qn2Var = new qn2(new pn2(in0Var), false, new r61(this.f9052f + (va2Var != null ? 1000000000 : 2000000000), true), ln2Var);
        qn2Var.f9051e = this;
        return qn2Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m4202c(r61 r61Var, ArrayList arrayList) {
        zk1 zk1VarM4392x = r61Var.m4392x();
        Object[] objArr = zk1VarM4392x.f13934h;
        int i = zk1VarM4392x.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.m4350H() && !r61Var2.f9383X) {
                if (r61Var2.f9372M.m5731m(8)) {
                    arrayList.add(rp0.m4528N(r61Var2, this.f9048b));
                } else {
                    m4202c(r61Var2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final zn1 m4203d() {
        if (!m4213o()) {
            on2 on2VarM4205f = m4205f();
            return on2VarM4205f != null ? sp0.m4927Z(on2VarM4205f, 8) : (qz0) this.f9049c.f9372M.f12033d;
        }
        qn2 qn2VarM4210l = m4210l();
        if (qn2VarM4210l != null) {
            return qn2VarM4210l.m4203d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m4204e(ArrayList arrayList, ArrayList arrayList2) {
        m4217s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qn2 qn2Var = (qn2) arrayList.get(size2);
            if (qn2Var.m4214p()) {
                arrayList2.add(qn2Var);
            } else if (!qn2Var.f9050d.f6224k) {
                qn2Var.m4204e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [th1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: f */
    public final on2 m4205f() {
        ?? M4952m;
        boolean z;
        boolean z2 = this.f9050d.f6223j;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        r61 r61Var = this.f9049c;
        if (z2) {
            th1 th1Var = (th1) r61Var.f9372M.f12036g;
            if ((th1Var.f10760k & 8) != 0) {
                M4952m = 0;
                while (th1Var != null) {
                    if ((th1Var.f10759j & 8) != 0) {
                        th1 th1VarM4952m = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof on2) {
                                on2 on2Var = (on2) th1VarM4952m;
                                ?? r0 = M4952m;
                                if (on2Var.mo1364i()) {
                                    r0 = M4952m;
                                    if (on2Var.mo358o0()) {
                                        return on2Var;
                                    }
                                    if (M4952m == 0) {
                                        r0 = on2Var;
                                    }
                                }
                                z = false;
                                M4952m = r0;
                            } else {
                                z = true;
                                M4952m = M4952m;
                            }
                            if (z && (th1VarM4952m.f10759j & 8) != 0 && (th1VarM4952m instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM4952m = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var.m6423b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    if ((th1Var.f10760k & 8) == 0) {
                        break;
                    }
                    th1Var = th1Var.f10762m;
                    M4952m = M4952m;
                }
                r4 = M4952m;
            }
        } else {
            th1 th1Var3 = (th1) r61Var.f9372M.f12036g;
            if ((th1Var3.f10760k & 8) != 0) {
                loop3: while (th1Var3 != null) {
                    if ((th1Var3.f10759j & 8) != 0) {
                        M4952m = th1Var3;
                        ?? zk1Var2 = 0;
                        while (M4952m != 0) {
                            if (M4952m instanceof on2) {
                                if (((on2) M4952m).mo1364i()) {
                                    r4 = M4952m;
                                }
                            } else if ((M4952m.f10759j & 8) != 0 && (M4952m instanceof u60)) {
                                th1 th1Var4 = ((u60) M4952m).f11116w;
                                int i2 = 0;
                                M4952m = M4952m;
                                zk1Var2 = zk1Var2;
                                while (th1Var4 != null) {
                                    if ((th1Var4.f10759j & 8) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M4952m = th1Var4;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M4952m != 0) {
                                                zk1Var2.m6423b(M4952m);
                                                M4952m = 0;
                                            }
                                            zk1Var2.m6423b(th1Var4);
                                        }
                                    }
                                    th1Var4 = th1Var4.f10762m;
                                    M4952m = M4952m;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M4952m = sp0.m4952m(zk1Var2);
                        }
                    }
                    if ((th1Var3.f10760k & 8) == 0) {
                        break;
                    }
                    th1Var3 = th1Var3.f10762m;
                }
            }
        }
        return (on2) r4;
    }

    /* JADX INFO: renamed from: g */
    public final o62 m4206g() {
        zn1 zn1VarM4203d = m4203d();
        if (zn1VarM4203d != null) {
            if (!zn1VarM4203d.mo2843S0().f10770u) {
                zn1VarM4203d = null;
            }
            if (zn1VarM4203d != null) {
                return s11.m4665J(zn1VarM4203d).mo644J(zn1VarM4203d, true);
            }
        }
        return o62.f7535e;
    }

    /* JADX INFO: renamed from: h */
    public final o62 m4207h() {
        zn1 zn1VarM4203d = m4203d();
        if (zn1VarM4203d != null) {
            if (!zn1VarM4203d.mo2843S0().f10770u) {
                zn1VarM4203d = null;
            }
            if (zn1VarM4203d != null) {
                return s11.m4724w(zn1VarM4203d, true);
            }
        }
        return o62.f7535e;
    }

    /* JADX INFO: renamed from: i */
    public final List m4208i(boolean z, boolean z2) {
        if (!z && this.f9050d.f6224k) {
            return be0.f819h;
        }
        ArrayList arrayList = new ArrayList();
        if (!m4214p()) {
            return m4217s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m4204e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final ln2 m4209k() {
        boolean zM4214p = m4214p();
        ln2 ln2Var = this.f9050d;
        if (!zM4214p) {
            return ln2Var;
        }
        ln2 ln2VarM2947b = ln2Var.m2947b();
        m4216r(new ArrayList(), ln2VarM2947b);
        return ln2VarM2947b;
    }

    /* JADX INFO: renamed from: l */
    public final qn2 m4210l() {
        r61 r61VarM4389u;
        qn2 qn2Var = this.f9051e;
        if (qn2Var != null) {
            return qn2Var;
        }
        r61 r61Var = this.f9049c;
        boolean z = this.f9048b;
        if (z) {
            r61VarM4389u = r61Var.m4389u();
            while (r61VarM4389u != null) {
                ln2 ln2VarM4391w = r61VarM4389u.m4391w();
                if (ln2VarM4391w != null && ln2VarM4391w.f6223j) {
                    break;
                }
                r61VarM4389u = r61VarM4389u.m4389u();
            }
            r61VarM4389u = null;
        } else {
            r61VarM4389u = null;
        }
        if (r61VarM4389u == null) {
            r61 r61VarM4389u2 = r61Var.m4389u();
            while (true) {
                if (r61VarM4389u2 == null) {
                    r61VarM4389u = null;
                    break;
                }
                if (r61VarM4389u2.f9372M.m5731m(8)) {
                    r61VarM4389u = r61VarM4389u2;
                    break;
                }
                r61VarM4389u2 = r61VarM4389u2.m4389u();
            }
        }
        if (r61VarM4389u == null) {
            return null;
        }
        return rp0.m4528N(r61VarM4389u, z);
    }

    /* JADX INFO: renamed from: m */
    public final o62 m4211m() {
        Object objM4205f = m4205f();
        if (objM4205f == null) {
            return ((qz0) this.f9049c.f9372M.f12033d).m6470o1();
        }
        th1 th1Var = ((th1) objM4205f).f10757h;
        Object objM4505g = this.f9050d.f6221h.m4505g(kn2.f5660b);
        if (objM4505g == null) {
            objM4505g = null;
        }
        return qp0.m4267v(th1Var, objM4505g != null, true);
    }

    /* JADX INFO: renamed from: n */
    public final ln2 m4212n() {
        return this.f9050d;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4213o() {
        return this.f9051e != null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4214p() {
        return this.f9048b && this.f9050d.f6223j;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4215q() {
        if (m4213o() || !m4199j(4, this).isEmpty()) {
            return false;
        }
        r61 r61VarM4389u = this.f9049c.m4389u();
        while (true) {
            if (r61VarM4389u == null) {
                r61VarM4389u = null;
                break;
            }
            ln2 ln2VarM4391w = r61VarM4389u.m4391w();
            if (ln2VarM4391w != null && ln2VarM4391w.f6223j) {
                break;
            }
            r61VarM4389u = r61VarM4389u.m4389u();
        }
        return r61VarM4389u == null;
    }

    /* JADX INFO: renamed from: r */
    public final void m4216r(ArrayList arrayList, ln2 ln2Var) {
        if (this.f9050d.f6224k) {
            return;
        }
        m4217s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qn2 qn2Var = (qn2) arrayList.get(size2);
            if (!qn2Var.m4214p()) {
                ln2Var.m2949d(qn2Var.f9050d);
                qn2Var.m4216r(arrayList, ln2Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final List m4217s(ArrayList arrayList, boolean z) {
        if (m4213o()) {
            return be0.f819h;
        }
        m4202c(this.f9049c, arrayList);
        if (z) {
            ln2 ln2Var = this.f9050d;
            rk1 rk1Var = ln2Var.f6221h;
            Object objM4505g = rk1Var.m4505g(vn2.f12083z);
            if (objM4505g == null) {
                objM4505g = null;
            }
            va2 va2Var = (va2) objM4505g;
            if (va2Var != null && ln2Var.f6223j && !arrayList.isEmpty()) {
                arrayList.add(m4201b(va2Var, new oq0(23, va2Var)));
            }
            yn2 yn2Var = vn2.f12058a;
            if (rk1Var.m4501c(yn2Var) && !arrayList.isEmpty() && ln2Var.f6223j) {
                Object objM4505g2 = rk1Var.m4505g(yn2Var);
                if (objM4505g2 == null) {
                    objM4505g2 = null;
                }
                List list = (List) objM4505g2;
                String str = list != null ? (String) AbstractC0142du.m1161q0(list) : null;
                if (str != null) {
                    arrayList.add(0, m4201b(null, new C0798v5(18, str)));
                }
            }
        }
        return arrayList;
    }
}
