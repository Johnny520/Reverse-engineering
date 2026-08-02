package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ak implements h01 {
    public int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ak(int i) {
        this.h = i;
        if (i > 0) {
            return;
        }
        s.j("maxSchemaBytes must be positive.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(sz0 sz0Var, th2 th2Var, u00 u00Var) throws Throwable {
        of2 of2Var;
        if (u00Var instanceof of2) {
            of2Var = (of2) u00Var;
            int i = of2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                of2Var.o = i - Integer.MIN_VALUE;
            } else {
                of2Var = new of2(this, u00Var);
            }
        }
        Object objR = of2Var.m;
        int i2 = of2Var.o;
        t00 t00Var = null;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objR);
            if (th2Var.j == null) {
                return null;
            }
            of2Var.k = sz0Var;
            of2Var.l = th2Var;
            of2Var.o = 1;
            objR = p7.R((c20) sz0Var.i, new u80(sz0Var, t00Var, 0), of2Var);
            if (objR != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(objR);
                return ((mf2) objR).a;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        th2Var = of2Var.l;
        sz0Var = of2Var.k;
        fg1.T(objR);
        of2Var.k = null;
        of2Var.l = null;
        of2Var.o = 2;
        objR = b(sz0Var, th2Var, (List) objR, of2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: sz0 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(sz0 sz0Var, th2 th2Var, List list, u00 u00Var) {
        pf2 pf2Var;
        bh2 bh2Var;
        String str;
        String str2;
        th2 th2Var2;
        String str3;
        int i = this.h;
        if (u00Var instanceof pf2) {
            pf2Var = (pf2) u00Var;
            int i2 = pf2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pf2Var.o = i2 - Integer.MIN_VALUE;
            } else {
                pf2Var = new pf2(this, u00Var);
            }
        }
        Object obj = pf2Var.m;
        int i3 = pf2Var.o;
        si2 si2Var = si2.j;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                String str4 = th2Var.j;
                if (str4 == null) {
                    return new mf2(null, 0);
                }
                if (!list.contains(new oi2(str4))) {
                    throw new dg2(th2Var.c, si2Var, str4, "Config schema declared by the manifest does not exist.", null, 16);
                }
                k20 k20Var = k20.h;
                try {
                    if (sz0Var != 0) {
                        pf2Var.k = th2Var;
                        pf2Var.l = str4;
                        pf2Var.o = 1;
                        Object objK = sz0Var.K(str4, i, pf2Var);
                        if (objK != k20Var) {
                            str2 = str4;
                            obj = objK;
                            th2Var2 = th2Var;
                            str3 = (String) obj;
                        }
                    } else {
                        pf2Var.k = th2Var;
                        pf2Var.l = str4;
                        pf2Var.o = 2;
                        Object objK2 = sz0Var.K(str4, Integer.MAX_VALUE, pf2Var);
                        if (objK2 != k20Var) {
                            str2 = str4;
                            obj = objK2;
                            th2Var2 = th2Var;
                            str3 = (String) obj;
                        }
                    }
                    return k20Var;
                } catch (Throwable th) {
                    str = str4;
                    bh2Var = th;
                    if (bh2Var instanceof CancellationException) {
                        throw bh2Var;
                    }
                    throw new dg2(th2Var.c, si2.i, str, bh2Var instanceof bh2 ? hk1.g(bh2Var.h, "Config schema exceeds the maximum of ", " bytes.") : "Unable to read config schema as UTF-8.", bh2Var);
                }
            }
            if (i3 == 1) {
                str2 = pf2Var.l;
                th2Var2 = pf2Var.k;
                fg1.T(obj);
                str3 = (String) obj;
            } else {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = pf2Var.l;
                th2Var2 = pf2Var.k;
                fg1.T(obj);
                str3 = (String) obj;
            }
            String str5 = str2;
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str3.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            if (length > i) {
                throw new dg2(th2Var2.c, si2Var, str5, hk1.g(i, "Config schema exceeds the maximum of ", " bytes."), null, 16);
            }
            try {
                return new mf2(nf2.i(str3), length);
            } catch (Throwable th2) {
                String str6 = th2Var2.c;
                String message = th2.getMessage();
                if (message == null) {
                    message = "Invalid config schema.";
                }
                throw new dg2(str6, si2Var, str5, message, th2);
            }
        } catch (Throwable th3) {
            bh2Var = th3;
            str = sz0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void c(j23 j23Var) {
        f(j23Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void d(xz1 xz1Var) {
        f(xz1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void e(wz1 wz1Var) {
        f(wz1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(i01 i01Var) {
        r72 r72Var = i01Var.j;
        if (r72Var != null) {
            int iD = r72Var.d() + r72Var.h;
            if (iD > this.h) {
                this.h = iD;
            }
        }
        s72 s72Var = i01Var.k;
        int length = s72Var.i.length;
        for (int i = 0; i < length; i++) {
            r72 r72Var2 = (r72) s72Var.e(i);
            int iD2 = r72Var2.d() + r72Var2.h;
            if (iD2 > this.h) {
                this.h = iD2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void h(k23 k23Var) {
        f(k23Var);
    }
}
