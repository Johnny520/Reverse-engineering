package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0021ak implements h01 {

    /* JADX INFO: renamed from: h */
    public int f232h;

    public C0021ak(int i) {
        this.f232h = i;
        if (i > 0) {
            return;
        }
        C0676s.m4651j("maxSchemaBytes must be positive.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m174a(sz0 sz0Var, th2 th2Var, u00 u00Var) throws Throwable {
        of2 of2Var;
        if (u00Var instanceof of2) {
            of2Var = (of2) u00Var;
            int i = of2Var.f7668o;
            if ((i & Integer.MIN_VALUE) != 0) {
                of2Var.f7668o = i - Integer.MIN_VALUE;
            } else {
                of2Var = new of2(this, u00Var);
            }
        }
        Object objM3762R = of2Var.f7666m;
        int i2 = of2Var.f7668o;
        t00 t00Var = null;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM3762R);
            if (th2Var.f10781j == null) {
                return null;
            }
            of2Var.f7664k = sz0Var;
            of2Var.f7665l = th2Var;
            of2Var.f7668o = 1;
            objM3762R = AbstractC0570p7.m3762R((c20) sz0Var.f10436i, new u80(sz0Var, t00Var, 0), of2Var);
            if (objM3762R != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(objM3762R);
                return ((mf2) objM3762R).f6632a;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        th2Var = of2Var.f7665l;
        sz0Var = of2Var.f7664k;
        fg1.m1627T(objM3762R);
        of2Var.f7664k = null;
        of2Var.f7665l = null;
        of2Var.f7668o = 2;
        objM3762R = m175b(sz0Var, th2Var, (List) objM3762R, of2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m175b(sz0 sz0Var, th2 th2Var, List list, u00 u00Var) {
        pf2 pf2Var;
        bh2 bh2Var;
        String str;
        String str2;
        th2 th2Var2;
        String str3;
        int i = this.f232h;
        if (u00Var instanceof pf2) {
            pf2Var = (pf2) u00Var;
            int i2 = pf2Var.f8304o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pf2Var.f8304o = i2 - Integer.MIN_VALUE;
            } else {
                pf2Var = new pf2(this, u00Var);
            }
        }
        Object obj = pf2Var.f8302m;
        int i3 = pf2Var.f8304o;
        si2 si2Var = si2.f10154j;
        try {
            if (i3 == 0) {
                fg1.m1627T(obj);
                String str4 = th2Var.f10781j;
                if (str4 == null) {
                    return new mf2(null, 0);
                }
                if (!list.contains(new oi2(str4))) {
                    throw new dg2(th2Var.f10774c, si2Var, str4, "Config schema declared by the manifest does not exist.", null, 16);
                }
                k20 k20Var = k20.f5323h;
                try {
                    if (sz0Var != 0) {
                        pf2Var.f8300k = th2Var;
                        pf2Var.f8301l = str4;
                        pf2Var.f8304o = 1;
                        Object objM5038K = sz0Var.m5038K(str4, i, pf2Var);
                        if (objM5038K != k20Var) {
                            str2 = str4;
                            obj = objM5038K;
                            th2Var2 = th2Var;
                            str3 = (String) obj;
                        }
                    } else {
                        pf2Var.f8300k = th2Var;
                        pf2Var.f8301l = str4;
                        pf2Var.f8304o = 2;
                        Object objM5038K2 = sz0Var.m5038K(str4, Integer.MAX_VALUE, pf2Var);
                        if (objM5038K2 != k20Var) {
                            str2 = str4;
                            obj = objM5038K2;
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
                    throw new dg2(th2Var.f10774c, si2.f10153i, str, bh2Var instanceof bh2 ? hk1.m2208g(bh2Var.f862h, "Config schema exceeds the maximum of ", " bytes.") : "Unable to read config schema as UTF-8.", bh2Var);
                }
            }
            if (i3 == 1) {
                str2 = pf2Var.f8301l;
                th2Var2 = pf2Var.f8300k;
                fg1.m1627T(obj);
                str3 = (String) obj;
            } else {
                if (i3 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = pf2Var.f8301l;
                th2Var2 = pf2Var.f8300k;
                fg1.m1627T(obj);
                str3 = (String) obj;
            }
            String str5 = str2;
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str3.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            if (length > i) {
                throw new dg2(th2Var2.f10774c, si2Var, str5, hk1.m2208g(i, "Config schema exceeds the maximum of ", " bytes."), null, 16);
            }
            try {
                return new mf2(nf2.m3302i(str3), length);
            } catch (Throwable th2) {
                String str6 = th2Var2.f10774c;
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

    @Override // p000.h01
    /* JADX INFO: renamed from: c */
    public void mo176c(j23 j23Var) {
        m179f(j23Var);
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: d */
    public void mo177d(xz1 xz1Var) {
        m179f(xz1Var);
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: e */
    public void mo178e(wz1 wz1Var) {
        m179f(wz1Var);
    }

    /* JADX INFO: renamed from: f */
    public void m179f(i01 i01Var) {
        r72 r72Var = i01Var.f4204j;
        if (r72Var != null) {
            int iM4400d = r72Var.m4400d() + r72Var.f9419h;
            if (iM4400d > this.f232h) {
                this.f232h = iM4400d;
            }
        }
        s72 s72Var = i01Var.f4205k;
        int length = s72Var.f5590i.length;
        for (int i = 0; i < length; i++) {
            r72 r72Var2 = (r72) s72Var.m2693e(i);
            int iM4400d2 = r72Var2.m4400d() + r72Var2.f9419h;
            if (iM4400d2 > this.f232h) {
                this.f232h = iM4400d2;
            }
        }
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: h */
    public void mo180h(k23 k23Var) {
        m179f(k23Var);
    }
}
