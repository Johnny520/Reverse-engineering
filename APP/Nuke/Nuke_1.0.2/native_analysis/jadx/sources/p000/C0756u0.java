package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import nuke.module.wechat.p002ai.AIChatError;
import nuke.module.wechat.p002ai.C0516a;
import nuke.module.wechat.p002ai.C0517b;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756u0 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11025l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f11026m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f11027n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f11028o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756u0(t00 t00Var, dq1 dq1Var, hg2 hg2Var, ui2 ui2Var) {
        super(2, t00Var);
        this.f11025l = 4;
        this.f11026m = dq1Var;
        this.f11027n = hg2Var;
        this.f11028o = ui2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IOException {
        int i = this.f11025l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C0756u0) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 2:
                ((C0756u0) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 3:
                break;
            case 4:
                ((C0756u0) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            default:
                ((C0756u0) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11025l;
        Object obj2 = this.f11028o;
        Object obj3 = this.f11027n;
        switch (i) {
            case 0:
                return new C0756u0((String) this.f11026m, (String) obj3, (String) obj2, t00Var, 0);
            case 1:
                return new C0756u0((String) this.f11026m, (xk1) obj3, (xk1) obj2, t00Var, 1);
            case 2:
                return new C0756u0((C0043b5) obj3, (String) this.f11026m, (d41) obj2, t00Var);
            case 3:
                C0756u0 c0756u0 = new C0756u0((s12) obj3, (kz2) obj2, t00Var);
                c0756u0.f11026m = obj;
                return c0756u0;
            case 4:
                return new C0756u0(t00Var, (dq1) this.f11026m, (hg2) obj3, (ui2) obj2);
            default:
                return new C0756u0((String) this.f11026m, (String) obj3, (xk1) obj2, t00Var, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws IOException {
        InterfaceC0333j1 c0261h1;
        InterfaceC0333j1 c0261h12;
        Object c0371k1;
        int i = this.f11025l;
        int i2 = 1;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f11027n;
        Object obj3 = this.f11028o;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                String str = (String) this.f11026m;
                String str2 = (String) obj2;
                C0517b c0517b = new C0517b(str, str2, (String) obj3);
                vf1 vf1Var = C0517b.f7334e;
                yw0 yw0VarM3435e = C0516a.m3435e(str, "models");
                EnumC0002a1 enumC0002a1 = EnumC0002a1.f16h;
                if (yw0VarM3435e == null) {
                    c0261h12 = new C0261h1(new AIChatError(enumC0002a1, "API Base URL must be a valid HTTPS URL", null, 4, null));
                } else if (pv2.m4006s0(str2)) {
                    c0261h12 = new C0261h1(new AIChatError(enumC0002a1, "API key is empty", null, 4, null));
                } else {
                    C0093cj c0093cj = new C0093cj(4);
                    c0093cj.f1579a = yw0VarM3435e;
                    c0093cj.m837l("Authorization", "Bearer " + pv2.m3993I0(str2).toString());
                    c0093cj.m837l("Accept", C0517b.f7334e.f11928a);
                    c0093cj.m839n("GET", null);
                    try {
                        r92 r92VarM4732h = new s52(c0517b.f7340d, new k82(c0093cj)).m4732h();
                        try {
                            int i3 = r92VarM4732h.f9459k;
                            String strM3431a = C0516a.m3431a(r92VarM4732h.f9462n.m5476b());
                            if (r92VarM4732h.f9471w) {
                                c0261h1 = C0516a.m3433c(strM3431a);
                            } else {
                                EnumC0002a1 enumC0002a12 = EnumC0002a1.f18j;
                                String strM3432b = C0516a.m3432b(strM3431a);
                                if (strM3432b == null) {
                                    strM3432b = "OpenAI-compatible service returned HTTP " + i3;
                                }
                                c0261h1 = new C0261h1(new AIChatError(enumC0002a12, strM3432b, Integer.valueOf(i3)));
                            }
                            r92VarM4732h.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                pp0.m3916n(r92VarM4732h, th);
                                throw th2;
                            }
                        }
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "OpenAI-compatible service is unavailable";
                        }
                        c0261h1 = new C0261h1(new AIChatError(EnumC0002a1.f17i, message, null, 4, null));
                    } catch (Throwable th3) {
                        String message2 = th3.getMessage();
                        if (message2 == null) {
                            message2 = "Unable to load model list";
                        }
                        c0261h1 = new C0261h1(new AIChatError(EnumC0002a1.f19k, message2, null, 4, null));
                    }
                    c0261h12 = c0261h1;
                }
                if (c0261h12 instanceof C0298i1) {
                    c0371k1 = new C0408l1(((C0298i1) c0261h12).f4207a);
                } else {
                    if (!(c0261h12 instanceof C0261h1)) {
                        c80.m675s();
                        return null;
                    }
                    c0371k1 = new C0371k1(((C0261h1) c0261h12).f3764a.getMessage());
                }
                return c0371k1;
            case 1:
                fg1.m1627T(obj);
                if (((Boolean) ((xk1) obj2).getValue()).booleanValue()) {
                    ((xk1) obj3).setValue((String) this.f11026m);
                }
                return a83Var;
            case 2:
                fg1.m1627T(obj);
                C0043b5 c0043b5 = (C0043b5) obj2;
                String str3 = (String) this.f11026m;
                File file = (File) c0043b5.f563j;
                file.getClass();
                File fileM5901g0 = wi0.m5901g0(file, str3 + ".json");
                File parentFile = fileM5901g0.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                wi0.m5902h0(fileM5901g0, ((v31) c0043b5.f564k).m5454b(d41.Companion.serializer(), (d41) obj3));
                return a83Var;
            case 3:
                fg1.m1627T(obj);
                j20 j20Var = (j20) this.f11026m;
                s12 s12Var = (s12) obj2;
                kz2 kz2Var = (kz2) obj3;
                AbstractC0570p7.m3745A(j20Var, null, new q10(s12Var, kz2Var, objArr2 == true ? 1 : 0, i2), 1);
                return AbstractC0570p7.m3745A(j20Var, null, new q10(s12Var, kz2Var, objArr == true ? 1 : 0, 2), 1);
            case 4:
                ui2 ui2Var = (ui2) obj3;
                fg1.m1627T(obj);
                dq1 dq1Var = (dq1) this.f11026m;
                hg2 hg2Var = (hg2) obj2;
                dq1.m1074S(hg2Var);
                String str4 = hg2Var.f4003b;
                if (str4.length() != 0) {
                    File fileM1095T = dq1Var.m1095T(hg2Var);
                    if (!fileM1095T.exists()) {
                        if (ui2Var.f11323b) {
                            return a83Var;
                        }
                        throw new FileNotFoundException("Target does not exist: ".concat(str4));
                    }
                    dq1.m1072C(dq1Var.m1096U(hg2Var.f4002a), fileM1095T, true);
                    if (fileM1095T.isDirectory() && !ui2Var.f11322a) {
                        String[] list = fileM1095T.list();
                        if (list == null) {
                            c80.m678v("Unable to list directory before removal.");
                        } else if (list.length != 0) {
                            c80.m672p("IO_ERROR", "Directory is not empty.", 0, null, null, 28);
                        }
                    } else {
                        if (fileM1095T.isDirectory() && ui2Var.f11322a) {
                            dq1.m1080x(fileM1095T);
                            return a83Var;
                        }
                        if (fileM1095T.delete()) {
                            return a83Var;
                        }
                        c80.m678v("Unable to remove target.");
                    }
                } else {
                    c80.m672p("INVALID_ARGUMENT", "Cannot remove an area root.", 0, null, null, 28);
                }
                return null;
            default:
                xk1 xk1Var = (xk1) obj3;
                fg1.m1627T(obj);
                String str5 = (String) this.f11026m;
                if (str5 == null) {
                    str5 = (String) obj2;
                }
                x13 x13VarM1874V = gf1.m1874V(str5);
                if (x13VarM1874V != null) {
                    x13 x13Var = AbstractC0570p7.m3759O(gf1.m1873U(x13VarM1874V)).equals(AbstractC0570p7.m3759O(gf1.m1873U((x13) xk1Var.getValue()))) ? null : x13VarM1874V;
                    if (x13Var != null) {
                        xk1Var.setValue(x13Var);
                    }
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756u0(C0043b5 c0043b5, String str, d41 d41Var, t00 t00Var) {
        super(2, t00Var);
        this.f11025l = 2;
        this.f11027n = c0043b5;
        this.f11026m = str;
        this.f11028o = d41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756u0(s12 s12Var, kz2 kz2Var, t00 t00Var) {
        super(2, t00Var);
        this.f11025l = 3;
        this.f11027n = s12Var;
        this.f11028o = kz2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0756u0(String str, Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11025l = i;
        this.f11026m = str;
        this.f11027n = obj;
        this.f11028o = obj2;
    }
}
