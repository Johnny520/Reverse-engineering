package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 {

    /* JADX INFO: renamed from: b */
    public static final gl0 f3569b = new gl0();

    /* JADX INFO: renamed from: c */
    public static final gl0 f3570c = new gl0();

    /* JADX INFO: renamed from: d */
    public static final gl0 f3571d = new gl0();

    /* JADX INFO: renamed from: a */
    public final zk1 f3572a = new zk1(new il0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1938a(gl0 gl0Var) {
        gl0Var.getClass();
        if (gl0Var == f3569b) {
            C0676s.m4653l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (gl0Var == f3570c) {
            C0676s.m4653l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        zk1 zk1Var = gl0Var.f3572a;
        int i = zk1Var.f13936j;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = zk1Var.f13934h;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (il0) objArr[i2];
            if (!((th1) obj).f10757h.f10770u) {
                kz0.m2764b("visitChildren called on an unattached node");
            }
            zk1 zk1Var2 = new zk1(new th1[16]);
            th1 th1Var = ((th1) obj).f10757h;
            th1 th1Var2 = th1Var.f10762m;
            if (th1Var2 == null) {
                sp0.m4948k(zk1Var2, th1Var);
            } else {
                zk1Var2.m6423b(th1Var2);
            }
            while (true) {
                int i3 = zk1Var2.f13936j;
                if (i3 != 0) {
                    th1 th1VarM4952m = (th1) zk1Var2.m6432k(i3 - 1);
                    if ((th1VarM4952m.f10760k & 1024) == 0) {
                        sp0.m4948k(zk1Var2, th1VarM4952m);
                    } else {
                        while (true) {
                            if (th1VarM4952m == null) {
                                break;
                            }
                            if ((th1VarM4952m.f10759j & 1024) != 0) {
                                zk1 zk1Var3 = null;
                                while (th1VarM4952m != null) {
                                    if (th1VarM4952m instanceof pl0) {
                                        if (((pl0) th1VarM4952m).m3878T0(7)) {
                                            break;
                                        }
                                    } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                        int i4 = 0;
                                        for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                            if ((th1Var3.f10759j & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    th1VarM4952m = th1Var3;
                                                } else {
                                                    if (zk1Var3 == null) {
                                                        zk1Var3 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM4952m != null) {
                                                        zk1Var3.m6423b(th1VarM4952m);
                                                        th1VarM4952m = null;
                                                    }
                                                    zk1Var3.m6423b(th1Var3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    th1VarM4952m = sp0.m4952m(zk1Var3);
                                }
                            } else {
                                th1VarM4952m = th1VarM4952m.f10762m;
                            }
                        }
                    }
                }
            }
        }
    }
}
