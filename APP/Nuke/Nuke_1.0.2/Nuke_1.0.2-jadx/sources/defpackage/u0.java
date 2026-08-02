package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import nuke.module.wechat.ai.AIChatError;
import nuke.module.wechat.ai.a;
import nuke.module.wechat.ai.b;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(t00 t00Var, dq1 dq1Var, hg2 hg2Var, ui2 ui2Var) {
        super(2, t00Var);
        this.l = 4;
        this.m = dq1Var;
        this.n = hg2Var;
        this.o = ui2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IOException {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                ((u0) p(t00Var, j20Var)).r(a83Var);
                break;
            case 2:
                ((u0) p(t00Var, j20Var)).r(a83Var);
                break;
            case 3:
                break;
            case 4:
                ((u0) p(t00Var, j20Var)).r(a83Var);
                break;
            default:
                ((u0) p(t00Var, j20Var)).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                return new u0((String) this.m, (String) obj3, (String) obj2, t00Var, 0);
            case 1:
                return new u0((String) this.m, (xk1) obj3, (xk1) obj2, t00Var, 1);
            case 2:
                return new u0((b5) obj3, (String) this.m, (d41) obj2, t00Var);
            case 3:
                u0 u0Var = new u0((s12) obj3, (kz2) obj2, t00Var);
                u0Var.m = obj;
                return u0Var;
            case 4:
                return new u0(t00Var, (dq1) this.m, (hg2) obj3, (ui2) obj2);
            default:
                return new u0((String) this.m, (String) obj3, (xk1) obj2, t00Var, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws IOException {
        j1 h1Var;
        j1 h1Var2;
        Object k1Var;
        int i = this.l;
        int i2 = 1;
        a83 a83Var = a83.a;
        Object obj2 = this.n;
        Object obj3 = this.o;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                fg1.T(obj);
                String str = (String) this.m;
                String str2 = (String) obj2;
                b bVar = new b(str, str2, (String) obj3);
                vf1 vf1Var = b.e;
                yw0 yw0VarE = a.e(str, "models");
                a1 a1Var = a1.h;
                if (yw0VarE == null) {
                    h1Var2 = new h1(new AIChatError(a1Var, "API Base URL must be a valid HTTPS URL", null, 4, null));
                } else if (pv2.s0(str2)) {
                    h1Var2 = new h1(new AIChatError(a1Var, "API key is empty", null, 4, null));
                } else {
                    cj cjVar = new cj(4);
                    cjVar.a = yw0VarE;
                    cjVar.l("Authorization", "Bearer " + pv2.I0(str2).toString());
                    cjVar.l("Accept", b.e.a);
                    cjVar.n("GET", null);
                    try {
                        r92 r92VarH = new s52(bVar.d, new k82(cjVar)).h();
                        try {
                            int i3 = r92VarH.k;
                            String strA = a.a(r92VarH.n.b());
                            if (r92VarH.w) {
                                h1Var = a.c(strA);
                            } else {
                                a1 a1Var2 = a1.j;
                                String strB = a.b(strA);
                                if (strB == null) {
                                    strB = "OpenAI-compatible service returned HTTP " + i3;
                                }
                                h1Var = new h1(new AIChatError(a1Var2, strB, Integer.valueOf(i3)));
                            }
                            r92VarH.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                pp0.n(r92VarH, th);
                                throw th2;
                            }
                        }
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "OpenAI-compatible service is unavailable";
                        }
                        h1Var = new h1(new AIChatError(a1.i, message, null, 4, null));
                    } catch (Throwable th3) {
                        String message2 = th3.getMessage();
                        if (message2 == null) {
                            message2 = "Unable to load model list";
                        }
                        h1Var = new h1(new AIChatError(a1.k, message2, null, 4, null));
                    }
                    h1Var2 = h1Var;
                }
                if (h1Var2 instanceof i1) {
                    k1Var = new l1(((i1) h1Var2).a);
                } else {
                    if (!(h1Var2 instanceof h1)) {
                        c80.s();
                        return null;
                    }
                    k1Var = new k1(((h1) h1Var2).a.getMessage());
                }
                return k1Var;
            case 1:
                fg1.T(obj);
                if (((Boolean) ((xk1) obj2).getValue()).booleanValue()) {
                    ((xk1) obj3).setValue((String) this.m);
                }
                return a83Var;
            case 2:
                fg1.T(obj);
                b5 b5Var = (b5) obj2;
                String str3 = (String) this.m;
                File file = (File) b5Var.j;
                file.getClass();
                File fileG0 = wi0.g0(file, str3 + ".json");
                File parentFile = fileG0.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                wi0.h0(fileG0, ((v31) b5Var.k).b(d41.Companion.serializer(), (d41) obj3));
                return a83Var;
            case 3:
                fg1.T(obj);
                j20 j20Var = (j20) this.m;
                s12 s12Var = (s12) obj2;
                kz2 kz2Var = (kz2) obj3;
                p7.A(j20Var, null, new q10(s12Var, kz2Var, objArr2 == true ? 1 : 0, i2), 1);
                return p7.A(j20Var, null, new q10(s12Var, kz2Var, objArr == true ? 1 : 0, 2), 1);
            case 4:
                ui2 ui2Var = (ui2) obj3;
                fg1.T(obj);
                dq1 dq1Var = (dq1) this.m;
                hg2 hg2Var = (hg2) obj2;
                dq1.S(hg2Var);
                String str4 = hg2Var.b;
                if (str4.length() != 0) {
                    File fileT = dq1Var.T(hg2Var);
                    if (!fileT.exists()) {
                        if (ui2Var.b) {
                            return a83Var;
                        }
                        throw new FileNotFoundException("Target does not exist: ".concat(str4));
                    }
                    dq1.C(dq1Var.U(hg2Var.a), fileT, true);
                    if (fileT.isDirectory() && !ui2Var.a) {
                        String[] list = fileT.list();
                        if (list == null) {
                            c80.v("Unable to list directory before removal.");
                        } else if (list.length != 0) {
                            c80.p("IO_ERROR", "Directory is not empty.", 0, null, null, 28);
                        }
                    } else {
                        if (fileT.isDirectory() && ui2Var.a) {
                            dq1.x(fileT);
                            return a83Var;
                        }
                        if (fileT.delete()) {
                            return a83Var;
                        }
                        c80.v("Unable to remove target.");
                    }
                } else {
                    c80.p("INVALID_ARGUMENT", "Cannot remove an area root.", 0, null, null, 28);
                }
                return null;
            default:
                xk1 xk1Var = (xk1) obj3;
                fg1.T(obj);
                String str5 = (String) this.m;
                if (str5 == null) {
                    str5 = (String) obj2;
                }
                x13 x13VarV = gf1.V(str5);
                if (x13VarV != null) {
                    x13 x13Var = p7.O(gf1.U(x13VarV)).equals(p7.O(gf1.U((x13) xk1Var.getValue()))) ? null : x13VarV;
                    if (x13Var != null) {
                        xk1Var.setValue(x13Var);
                    }
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b5 b5Var, String str, d41 d41Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 2;
        this.n = b5Var;
        this.m = str;
        this.o = d41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s12 s12Var, kz2 kz2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.n = s12Var;
        this.o = kz2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(String str, Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.m = str;
        this.n = obj;
        this.o = obj2;
    }
}
