package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 {
    public static final gl0 b = new gl0();
    public static final gl0 c = new gl0();
    public static final gl0 d = new gl0();
    public final zk1 a = new zk1(new il0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(gl0 gl0Var) {
        gl0Var.getClass();
        if (gl0Var == b) {
            s.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (gl0Var == c) {
            s.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        zk1 zk1Var = gl0Var.a;
        int i = zk1Var.j;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = zk1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (il0) objArr[i2];
            if (!((th1) obj).h.u) {
                kz0.b("visitChildren called on an unattached node");
            }
            zk1 zk1Var2 = new zk1(new th1[16]);
            th1 th1Var = ((th1) obj).h;
            th1 th1Var2 = th1Var.m;
            if (th1Var2 == null) {
                sp0.k(zk1Var2, th1Var);
            } else {
                zk1Var2.b(th1Var2);
            }
            while (true) {
                int i3 = zk1Var2.j;
                if (i3 != 0) {
                    th1 th1VarM = (th1) zk1Var2.k(i3 - 1);
                    if ((th1VarM.k & 1024) == 0) {
                        sp0.k(zk1Var2, th1VarM);
                    } else {
                        while (true) {
                            if (th1VarM == null) {
                                break;
                            }
                            if ((th1VarM.j & 1024) != 0) {
                                zk1 zk1Var3 = null;
                                while (th1VarM != null) {
                                    if (th1VarM instanceof pl0) {
                                        if (((pl0) th1VarM).T0(7)) {
                                            break;
                                        }
                                    } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                        int i4 = 0;
                                        for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                            if ((th1Var3.j & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    th1VarM = th1Var3;
                                                } else {
                                                    if (zk1Var3 == null) {
                                                        zk1Var3 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM != null) {
                                                        zk1Var3.b(th1VarM);
                                                        th1VarM = null;
                                                    }
                                                    zk1Var3.b(th1Var3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    th1VarM = sp0.m(zk1Var3);
                                }
                            } else {
                                th1VarM = th1VarM.m;
                            }
                        }
                    }
                }
            }
        }
    }
}
