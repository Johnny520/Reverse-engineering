package defpackage;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tb3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final d43 a(u60 u60Var, Object obj) {
        vn1 vn1Var;
        if (!u60Var.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var = u60Var.h.l;
        r61 r61VarC0 = sp0.c0(u60Var);
        while (r61VarC0 != null) {
            if ((((th1) r61VarC0.M.g).k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.j & 262144) != 0) {
                        th1 th1VarM = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof d43) {
                                d43 d43Var = (d43) th1VarM;
                                if (obj.equals(d43Var.r())) {
                                    return d43Var;
                                }
                            }
                            if ((th1VarM.j & 262144) != 0 && (th1VarM instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var.b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    th1Var = th1Var.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lb3 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            lb3 lb3Var = tag instanceof lb3 ? (lb3) tag : null;
            if (lb3Var != null) {
                return lb3Var;
            }
            Object objB = pb3.b(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(t60 t60Var, Object obj, in0 in0Var) {
        vn1 vn1Var;
        boolean z;
        if (!((th1) t60Var).h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var = ((th1) t60Var).h.l;
        r61 r61VarC0 = sp0.c0(t60Var);
        while (r61VarC0 != null) {
            if ((((th1) r61VarC0.M.g).k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.j & 262144) != 0) {
                        th1 th1VarM = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof d43) {
                                d43 d43Var = (d43) th1VarM;
                                if (!(obj.equals(d43Var.r()) ? ((Boolean) in0Var.j(d43Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((th1VarM.j & 262144) != 0) && (th1VarM instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                        if ((th1Var2.j & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM = th1Var2;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var.b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    th1Var = th1Var.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: d43 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(d43 d43Var, in0 in0Var) {
        vn1 vn1Var;
        boolean z;
        th1 th1Var = (th1) d43Var;
        if (!th1Var.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = th1Var.h.l;
        r61 r61VarC0 = sp0.c0(d43Var);
        while (r61VarC0 != null) {
            if ((((th1) r61VarC0.M.g).k & 262144) != 0) {
                while (th1Var2 != null) {
                    if ((th1Var2.j & 262144) != 0) {
                        th1 th1VarM = th1Var2;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof d43) {
                                d43 d43Var2 = (d43) th1VarM;
                                if (!((t11.l(d43Var.r(), d43Var2.r()) && d43Var.getClass() == d43Var2.getClass()) ? ((Boolean) in0Var.j(d43Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((th1VarM.j & 262144) != 0) && (th1VarM instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                        if ((th1Var3.j & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM = th1Var3;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var.b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    th1Var2 = th1Var2.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var2 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0097 */
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
    public static final void e(th1 th1Var, String str, in0 in0Var) {
        if (!th1Var.h.u) {
            kz0.b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = th1Var.h;
        th1 th1Var3 = th1Var2.m;
        if (th1Var3 == null) {
            sp0.k(zk1Var, th1Var2);
        } else {
            zk1Var.b(th1Var3);
        }
        while (true) {
            int i = zk1Var.j;
            if (i == 0) {
                return;
            }
            th1 th1Var4 = (th1) zk1Var.k(i - 1);
            if ((th1Var4.k & 262144) != 0) {
                for (th1 th1Var5 = th1Var4; th1Var5 != null && th1Var5.u; th1Var5 = th1Var5.m) {
                    if ((th1Var5.j & 262144) != 0) {
                        ?? M = th1Var5;
                        ?? zk1Var2 = 0;
                        while (M != 0) {
                            if (M instanceof d43) {
                                d43 d43Var = (d43) M;
                                c43 c43Var = str.equals(d43Var.r()) ? (c43) in0Var.j(d43Var) : c43.h;
                                if (c43Var == c43.j) {
                                    return;
                                }
                                if (c43Var == c43.i) {
                                    break;
                                }
                            } else if ((M.j & 262144) != 0 && (M instanceof u60)) {
                                th1 th1Var6 = ((u60) M).w;
                                int i2 = 0;
                                M = M;
                                zk1Var2 = zk1Var2;
                                while (th1Var6 != null) {
                                    if ((th1Var6.j & 262144) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M = th1Var6;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M != 0) {
                                                zk1Var2.b(M);
                                                M = 0;
                                            }
                                            zk1Var2.b(th1Var6);
                                        }
                                    }
                                    th1Var6 = th1Var6.m;
                                    M = M;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = sp0.m(zk1Var2);
                        }
                    }
                }
            }
            sp0.k(zk1Var, th1Var4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00ae */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00a8 */
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
    public static final void f(d43 d43Var, in0 in0Var) {
        th1 th1Var = (th1) d43Var;
        if (!th1Var.h.u) {
            kz0.b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = th1Var.h;
        th1 th1Var3 = th1Var2.m;
        if (th1Var3 == null) {
            sp0.k(zk1Var, th1Var2);
        } else {
            zk1Var.b(th1Var3);
        }
        while (true) {
            int i = zk1Var.j;
            if (i == 0) {
                return;
            }
            th1 th1Var4 = (th1) zk1Var.k(i - 1);
            if ((th1Var4.k & 262144) != 0) {
                for (th1 th1Var5 = th1Var4; th1Var5 != null && th1Var5.u; th1Var5 = th1Var5.m) {
                    if ((th1Var5.j & 262144) != 0) {
                        ?? M = th1Var5;
                        ?? zk1Var2 = 0;
                        while (M != 0) {
                            if (M instanceof d43) {
                                d43 d43Var2 = (d43) M;
                                c43 c43Var = (t11.l(d43Var.r(), d43Var2.r()) && d43Var.getClass() == d43Var2.getClass()) ? (c43) in0Var.j(d43Var2) : c43.h;
                                if (c43Var == c43.j) {
                                    return;
                                }
                                if (c43Var == c43.i) {
                                    break;
                                }
                            } else if ((M.j & 262144) != 0 && (M instanceof u60)) {
                                th1 th1Var6 = ((u60) M).w;
                                int i2 = 0;
                                M = M;
                                zk1Var2 = zk1Var2;
                                while (th1Var6 != null) {
                                    if ((th1Var6.j & 262144) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M = th1Var6;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M != 0) {
                                                zk1Var2.b(M);
                                                M = 0;
                                            }
                                            zk1Var2.b(th1Var6);
                                        }
                                    }
                                    th1Var6 = th1Var6.m;
                                    M = M;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = sp0.m(zk1Var2);
                        }
                    }
                }
            }
            sp0.k(zk1Var, th1Var4);
        }
    }
}
