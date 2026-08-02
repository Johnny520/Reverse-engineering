package p000;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tb3 {
    /* JADX INFO: renamed from: a */
    public static final d43 m5155a(u60 u60Var, Object obj) {
        vn1 vn1Var;
        if (!u60Var.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var = u60Var.f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(u60Var);
        while (r61VarM4933c0 != null) {
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.f10759j & 262144) != 0) {
                        th1 th1VarM4952m = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof d43) {
                                d43 d43Var = (d43) th1VarM4952m;
                                if (obj.equals(d43Var.mo962r())) {
                                    return d43Var;
                                }
                            }
                            if ((th1VarM4952m.f10759j & 262144) != 0 && (th1VarM4952m instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 262144) != 0) {
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
                    th1Var = th1Var.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final lb3 m5156b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            lb3 lb3Var = tag instanceof lb3 ? (lb3) tag : null;
            if (lb3Var != null) {
                return lb3Var;
            }
            Object objM3845b = pb3.m3845b(view);
            view = objM3845b instanceof View ? (View) objM3845b : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5157c(t60 t60Var, Object obj, in0 in0Var) {
        vn1 vn1Var;
        boolean z;
        if (!((th1) t60Var).f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var = ((th1) t60Var).f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(t60Var);
        while (r61VarM4933c0 != null) {
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.f10759j & 262144) != 0) {
                        th1 th1VarM4952m = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof d43) {
                                d43 d43Var = (d43) th1VarM4952m;
                                if (!(obj.equals(d43Var.mo962r()) ? ((Boolean) in0Var.mo5j(d43Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((th1VarM4952m.f10759j & 262144) != 0) && (th1VarM4952m instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                        if ((th1Var2.f10759j & 262144) != 0) {
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
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    th1Var = th1Var.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m5158d(d43 d43Var, in0 in0Var) {
        vn1 vn1Var;
        boolean z;
        th1 th1Var = (th1) d43Var;
        if (!th1Var.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = th1Var.f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(d43Var);
        while (r61VarM4933c0 != null) {
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 262144) != 0) {
                while (th1Var2 != null) {
                    if ((th1Var2.f10759j & 262144) != 0) {
                        th1 th1VarM4952m = th1Var2;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof d43) {
                                d43 d43Var2 = (d43) th1VarM4952m;
                                if (!((t11.m5086l(d43Var.mo962r(), d43Var2.mo962r()) && d43Var.getClass() == d43Var2.getClass()) ? ((Boolean) in0Var.mo5j(d43Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((th1VarM4952m.f10759j & 262144) != 0) && (th1VarM4952m instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                        if ((th1Var3.f10759j & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM4952m = th1Var3;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var.m6423b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    th1Var2 = th1Var2.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var2 = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [in0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: e */
    public static final void m5159e(th1 th1Var, String str, in0 in0Var) {
        if (!th1Var.f10757h.f10770u) {
            kz0.m2764b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = th1Var.f10757h;
        th1 th1Var3 = th1Var2.f10762m;
        if (th1Var3 == null) {
            sp0.m4948k(zk1Var, th1Var2);
        } else {
            zk1Var.m6423b(th1Var3);
        }
        while (true) {
            int i = zk1Var.f13936j;
            if (i == 0) {
                return;
            }
            th1 th1Var4 = (th1) zk1Var.m6432k(i - 1);
            if ((th1Var4.f10760k & 262144) != 0) {
                for (th1 th1Var5 = th1Var4; th1Var5 != null && th1Var5.f10770u; th1Var5 = th1Var5.f10762m) {
                    if ((th1Var5.f10759j & 262144) != 0) {
                        ?? M4952m = th1Var5;
                        ?? zk1Var2 = 0;
                        while (M4952m != 0) {
                            if (M4952m instanceof d43) {
                                d43 d43Var = (d43) M4952m;
                                c43 c43Var = str.equals(d43Var.mo962r()) ? (c43) in0Var.mo5j(d43Var) : c43.f1146h;
                                if (c43Var == c43.f1148j) {
                                    return;
                                }
                                if (c43Var == c43.f1147i) {
                                    break;
                                }
                            } else if ((M4952m.f10759j & 262144) != 0 && (M4952m instanceof u60)) {
                                th1 th1Var6 = ((u60) M4952m).f11116w;
                                int i2 = 0;
                                M4952m = M4952m;
                                zk1Var2 = zk1Var2;
                                while (th1Var6 != null) {
                                    if ((th1Var6.f10759j & 262144) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M4952m = th1Var6;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M4952m != 0) {
                                                zk1Var2.m6423b(M4952m);
                                                M4952m = 0;
                                            }
                                            zk1Var2.m6423b(th1Var6);
                                        }
                                    }
                                    th1Var6 = th1Var6.f10762m;
                                    M4952m = M4952m;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M4952m = sp0.m4952m(zk1Var2);
                        }
                    }
                }
            }
            sp0.m4948k(zk1Var, th1Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [d43, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [in0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [th1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: f */
    public static final void m5160f(d43 d43Var, in0 in0Var) {
        th1 th1Var = (th1) d43Var;
        if (!th1Var.f10757h.f10770u) {
            kz0.m2764b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = th1Var.f10757h;
        th1 th1Var3 = th1Var2.f10762m;
        if (th1Var3 == null) {
            sp0.m4948k(zk1Var, th1Var2);
        } else {
            zk1Var.m6423b(th1Var3);
        }
        while (true) {
            int i = zk1Var.f13936j;
            if (i == 0) {
                return;
            }
            th1 th1Var4 = (th1) zk1Var.m6432k(i - 1);
            if ((th1Var4.f10760k & 262144) != 0) {
                for (th1 th1Var5 = th1Var4; th1Var5 != null && th1Var5.f10770u; th1Var5 = th1Var5.f10762m) {
                    if ((th1Var5.f10759j & 262144) != 0) {
                        ?? M4952m = th1Var5;
                        ?? zk1Var2 = 0;
                        while (M4952m != 0) {
                            if (M4952m instanceof d43) {
                                d43 d43Var2 = (d43) M4952m;
                                c43 c43Var = (t11.m5086l(d43Var.mo962r(), d43Var2.mo962r()) && d43Var.getClass() == d43Var2.getClass()) ? (c43) in0Var.mo5j(d43Var2) : c43.f1146h;
                                if (c43Var == c43.f1148j) {
                                    return;
                                }
                                if (c43Var == c43.f1147i) {
                                    break;
                                }
                            } else if ((M4952m.f10759j & 262144) != 0 && (M4952m instanceof u60)) {
                                th1 th1Var6 = ((u60) M4952m).f11116w;
                                int i2 = 0;
                                M4952m = M4952m;
                                zk1Var2 = zk1Var2;
                                while (th1Var6 != null) {
                                    if ((th1Var6.f10759j & 262144) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M4952m = th1Var6;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M4952m != 0) {
                                                zk1Var2.m6423b(M4952m);
                                                M4952m = 0;
                                            }
                                            zk1Var2.m6423b(th1Var6);
                                        }
                                    }
                                    th1Var6 = th1Var6.f10762m;
                                    M4952m = M4952m;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M4952m = sp0.m4952m(zk1Var2);
                        }
                    }
                }
            }
            sp0.m4948k(zk1Var, th1Var4);
        }
    }
}
