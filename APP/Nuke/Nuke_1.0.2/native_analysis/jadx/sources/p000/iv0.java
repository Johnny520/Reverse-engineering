package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 implements xg0 {

    /* JADX INFO: renamed from: f */
    public static final js0 f4798f;

    /* JADX INFO: renamed from: a */
    public final et1 f4799a;

    /* JADX INFO: renamed from: b */
    public final wg0 f4800b;

    /* JADX INFO: renamed from: c */
    public final C0043b5 f4801c;

    /* JADX INFO: renamed from: d */
    public int f4802d;

    /* JADX INFO: renamed from: e */
    public final ms0 f4803e;

    static {
        js0 js0Var = js0.f5193i;
        f4798f = ci0.m791P("OkHttp-Response-Body", "Truncated");
    }

    public iv0(et1 et1Var, wg0 wg0Var, C0043b5 c0043b5) {
        c0043b5.getClass();
        this.f4799a = et1Var;
        this.f4800b = wg0Var;
        this.f4801c = c0043b5;
        o52 o52Var = (o52) c0043b5.f563j;
        o52Var.getClass();
        ms0 ms0Var = new ms0();
        ms0Var.f6809b = o52Var;
        ms0Var.f6808a = 262144L;
        this.f4803e = ms0Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: a */
    public final ht2 mo2396a(r92 r92Var) {
        k82 k82Var = r92Var.f9456h;
        if (!sw0.m5006a(r92Var)) {
            return m2406k(k82Var.f5390a, 0L);
        }
        String strM2557a = r92Var.f9461m.m2557a("Transfer-Encoding");
        if (strM2557a == null) {
            strM2557a = null;
        }
        if ("chunked".equalsIgnoreCase(strM2557a)) {
            yw0 yw0Var = k82Var.f5390a;
            if (this.f4802d == 4) {
                this.f4802d = 5;
                return new ev0(this, yw0Var);
            }
            c80.m668k("state: ", this.f4802d);
            return null;
        }
        long jM5892e = wg3.m5892e(r92Var);
        if (jM5892e != -1) {
            return m2406k(k82Var.f5390a, jM5892e);
        }
        yw0 yw0Var2 = k82Var.f5390a;
        if (this.f4802d != 4) {
            c80.m668k("state: ", this.f4802d);
            return null;
        }
        this.f4802d = 5;
        this.f4800b.mo4628h();
        yw0Var2.getClass();
        return new hv0(this, yw0Var2);
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo2397b(k82 k82Var) {
        Proxy.Type type = this.f4800b.mo4627f().f3945b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(k82Var.f5391b);
        sb.append(' ');
        yw0 yw0Var = k82Var.f5390a;
        if (t11.m5086l(yw0Var.f13641a, "https") || type != Proxy.Type.HTTP) {
            String strM6356b = yw0Var.m6356b();
            String strM6358d = yw0Var.m6358d();
            if (strM6358d != null) {
                strM6356b = strM6356b + '?' + strM6358d;
            }
            sb.append(strM6356b);
        } else {
            sb.append(yw0Var);
        }
        sb.append(" HTTP/1.1");
        m2407l(k82Var.f5392c, sb.toString());
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: c */
    public final void mo2398c() {
        ((n52) this.f4801c.f564k).flush();
    }

    @Override // p000.xg0
    public final void cancel() {
        this.f4800b.cancel();
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: d */
    public final boolean mo2399d() {
        return this.f4802d == 6;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: e */
    public final void mo2400e() {
        ((n52) this.f4801c.f564k).flush();
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: f */
    public final ys2 mo2401f() {
        return this.f4801c;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: g */
    public final wg0 mo2402g() {
        return this.f4800b;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: h */
    public final long mo2403h(r92 r92Var) {
        if (!sw0.m5006a(r92Var)) {
            return 0L;
        }
        String strM2557a = r92Var.f9461m.m2557a("Transfer-Encoding");
        if (strM2557a == null) {
            strM2557a = null;
        }
        if ("chunked".equalsIgnoreCase(strM2557a)) {
            return -1L;
        }
        return wg3.m5892e(r92Var);
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: i */
    public final fr2 mo2404i(k82 k82Var, long j) {
        if ("chunked".equalsIgnoreCase(k82Var.f5392c.m2557a("Transfer-Encoding"))) {
            if (this.f4802d == 1) {
                this.f4802d = 2;
                return new dv0(this);
            }
            c80.m668k("state: ", this.f4802d);
            return null;
        }
        if (j == -1) {
            C0676s.m4653l("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f4802d == 1) {
            this.f4802d = 2;
            return new gv0(this);
        }
        c80.m668k("state: ", this.f4802d);
        return null;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: j */
    public final p92 mo2405j(boolean z) {
        ms0 ms0Var = this.f4803e;
        int i = this.f4802d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            c80.m668k("state: ", this.f4802d);
            return null;
        }
        try {
            String strMo1690s = ((InterfaceC0549on) ms0Var.f6809b).mo1690s(ms0Var.f6808a);
            ms0Var.f6808a -= (long) strMo1690s.length();
            C0158e9 c0158e9M5054F = t11.m5054F(strMo1690s);
            int i2 = c0158e9M5054F.f2352i;
            p92 p92Var = new p92();
            p92Var.f8045b = (c42) c0158e9M5054F.f2353j;
            p92Var.f8046c = i2;
            p92Var.f8047d = (String) c0158e9M5054F.f2354k;
            p92Var.f8049f = ms0Var.m3190c().m2559c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f4802d = 3;
                return p92Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.f4802d = 4;
                return p92Var;
            }
            this.f4802d = 3;
            return p92Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f4800b.mo4627f().f3944a.f8739i.m6361g()), e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final fv0 m2406k(yw0 yw0Var, long j) {
        if (this.f4802d == 4) {
            this.f4802d = 5;
            return new fv0(this, yw0Var, j);
        }
        c80.m668k("state: ", this.f4802d);
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m2407l(js0 js0Var, String str) {
        js0Var.getClass();
        if (this.f4802d != 0) {
            c80.m668k("state: ", this.f4802d);
            return;
        }
        C0043b5 c0043b5 = this.f4801c;
        n52 n52Var = (n52) c0043b5.f564k;
        n52Var.mo1696y(str);
        n52Var.mo1696y("\r\n");
        int size = js0Var.size();
        int i = 0;
        while (true) {
            n52 n52Var2 = (n52) c0043b5.f564k;
            if (i >= size) {
                n52Var2.mo1696y("\r\n");
                this.f4802d = 1;
                return;
            } else {
                n52Var2.mo1696y(js0Var.m2558b(i));
                n52Var2.mo1696y(": ");
                n52Var2.mo1696y(js0Var.m2560d(i));
                n52Var2.mo1696y("\r\n");
                i++;
            }
        }
    }
}
