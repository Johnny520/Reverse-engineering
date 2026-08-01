package p150d4;

import com.bumptech.glide.AbstractC1923e;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import p000A.C0072l0;
import p049I2.C0793k;
import p117X2.AbstractC1665j;
import p118X3.C1679A;
import p118X3.C1683E;
import p118X3.C1684F;
import p118X3.C1707q;
import p118X3.C1709s;
import p118X3.C1715y;
import p118X3.EnumC1716z;
import p123Y3.AbstractC1776g;
import p144c4.AbstractC1916f;
import p144c4.InterfaceC1914d;
import p144c4.InterfaceC1915e;
import p179i4.AbstractC2352g;
import p208n4.C2715n;
import p208n4.C2716o;
import p208n4.InterfaceC2708g;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: d4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1991h implements InterfaceC1915e {

    /* JADX INFO: renamed from: f */
    public static final C1707q f6692f;

    /* JADX INFO: renamed from: a */
    public final C1715y f6693a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1914d f6694b;

    /* JADX INFO: renamed from: c */
    public final C0072l0 f6695c;

    /* JADX INFO: renamed from: d */
    public int f6696d;

    /* JADX INFO: renamed from: e */
    public final C1984a f6697e;

    static {
        C1707q c1707q = C1707q.f5858e;
        f6692f = AbstractC2352g.m4179B("OkHttp-Response-Body", "Truncated");
    }

    public C1991h(C1715y c1715y, InterfaceC1914d interfaceC1914d, C0072l0 c0072l0) {
        AbstractC1665j.m2985e(c0072l0, "socket");
        this.f6693a = c1715y;
        this.f6694b = interfaceC1914d;
        this.f6695c = c0072l0;
        C2716o c2716o = (C2716o) c0072l0.f308f;
        AbstractC1665j.m2985e(c2716o, "source");
        C1984a c1984a = new C1984a();
        c1984a.f6675b = c2716o;
        c1984a.f6674a = 262144L;
        this.f6697e = c1984a;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: a */
    public final void mo3396a(C1679A c1679a) {
        Proxy.Type type = this.f6694b.mo3331f().f5764b.type();
        AbstractC1665j.m2984d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(c1679a.f5713b);
        sb.append(' ');
        C1709s c1709s = c1679a.f5712a;
        if (AbstractC1665j.m2981a(c1709s.f5868a, "https") || type != Proxy.Type.HTTP) {
            String strM3047b = c1709s.m3047b();
            String strM3049d = c1709s.m3049d();
            if (strM3049d != null) {
                strM3047b = strM3047b + '?' + strM3049d;
            }
            sb.append(strM3047b);
        } else {
            sb.append(c1709s);
        }
        sb.append(" HTTP/1.1");
        m3664l(c1679a.f5714c, sb.toString());
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: b */
    public final long mo3397b(C1684F c1684f) {
        if (!AbstractC1916f.m3406a(c1684f)) {
            return 0L;
        }
        String strM3038a = c1684f.f5743i.m3038a("Transfer-Encoding");
        if (strM3038a == null) {
            strM3038a = null;
        }
        if ("chunked".equalsIgnoreCase(strM3038a)) {
            return -1L;
        }
        return AbstractC1776g.m3177d(c1684f);
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: c */
    public final void mo3398c() {
        ((C2715n) this.f6695c.f309g).flush();
    }

    @Override // p144c4.InterfaceC1915e
    public final void cancel() {
        this.f6694b.cancel();
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: d */
    public final boolean mo3399d() {
        return this.f6696d == 6;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: e */
    public final void mo3400e() {
        ((C2715n) this.f6695c.f309g).flush();
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: f */
    public final InterfaceC2721t mo3401f() {
        return this.f6695c;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: g */
    public final InterfaceC2722u mo3402g(C1684F c1684f) {
        C1679A c1679a = c1684f.f5738d;
        if (!AbstractC1916f.m3406a(c1684f)) {
            return m3663k(c1679a.f5712a, 0L);
        }
        String strM3038a = c1684f.f5743i.m3038a("Transfer-Encoding");
        if (strM3038a == null) {
            strM3038a = null;
        }
        if ("chunked".equalsIgnoreCase(strM3038a)) {
            C1709s c1709s = c1679a.f5712a;
            if (this.f6696d == 4) {
                this.f6696d = 5;
                return new C1987d(this, c1709s);
            }
            throw new IllegalStateException(("state: " + this.f6696d).toString());
        }
        long jM3177d = AbstractC1776g.m3177d(c1684f);
        if (jM3177d != -1) {
            return m3663k(c1679a.f5712a, jM3177d);
        }
        C1709s c1709s2 = c1679a.f5712a;
        if (this.f6696d != 4) {
            throw new IllegalStateException(("state: " + this.f6696d).toString());
        }
        this.f6696d = 5;
        this.f6694b.mo3333h();
        AbstractC1665j.m2985e(c1709s2, "url");
        return new C1990g(this, c1709s2);
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: h */
    public final InterfaceC1914d mo3403h() {
        return this.f6694b;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: i */
    public final InterfaceC2720s mo3404i(C1679A c1679a, long j5) {
        if ("chunked".equalsIgnoreCase(c1679a.f5714c.m3038a("Transfer-Encoding"))) {
            if (this.f6696d == 1) {
                this.f6696d = 2;
                return new C1986c(this);
            }
            throw new IllegalStateException(("state: " + this.f6696d).toString());
        }
        if (j5 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f6696d == 1) {
            this.f6696d = 2;
            return new C1989f(this);
        }
        throw new IllegalStateException(("state: " + this.f6696d).toString());
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: j */
    public final C1683E mo3405j(boolean z5) {
        C1984a c1984a = this.f6697e;
        int i5 = this.f6696d;
        if (i5 != 0 && i5 != 1 && i5 != 2 && i5 != 3) {
            throw new IllegalStateException(("state: " + this.f6696d).toString());
        }
        try {
            String strMo4722o = ((InterfaceC2708g) c1984a.f6675b).mo4722o(c1984a.f6674a);
            c1984a.f6674a -= (long) strMo4722o.length();
            C0793k c0793kM3453M = AbstractC1923e.m3453M(strMo4722o);
            int i6 = c0793kM3453M.f2537e;
            C1683E c1683e = new C1683E();
            c1683e.f5724b = (EnumC1716z) c0793kM3453M.f2538f;
            c1683e.f5725c = i6;
            c1683e.f5726d = (String) c0793kM3453M.f2539g;
            c1683e.f5728f = c1984a.m3661c().m3040c();
            if (z5 && i6 == 100) {
                return null;
            }
            if (i6 == 100) {
                this.f6696d = 3;
                return c1683e;
            }
            if (102 > i6 || i6 >= 200) {
                this.f6696d = 4;
                return c1683e;
            }
            this.f6696d = 3;
            return c1683e;
        } catch (EOFException e5) {
            throw new IOException("unexpected end of stream on " + this.f6694b.mo3331f().f5763a.f5782h.m3052g(), e5);
        }
    }

    /* JADX INFO: renamed from: k */
    public final C1988e m3663k(C1709s c1709s, long j5) {
        if (this.f6696d == 4) {
            this.f6696d = 5;
            return new C1988e(this, c1709s, j5);
        }
        throw new IllegalStateException(("state: " + this.f6696d).toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m3664l(C1707q c1707q, String str) {
        AbstractC1665j.m2985e(c1707q, "headers");
        AbstractC1665j.m2985e(str, "requestLine");
        if (this.f6696d != 0) {
            throw new IllegalStateException(("state: " + this.f6696d).toString());
        }
        C0072l0 c0072l0 = this.f6695c;
        C2715n c2715n = (C2715n) c0072l0.f309g;
        C2715n c2715n2 = (C2715n) c0072l0.f309g;
        c2715n.mo4728v(str);
        c2715n.mo4728v("\r\n");
        int size = c1707q.size();
        for (int i5 = 0; i5 < size; i5++) {
            c2715n2.mo4728v(c1707q.m3039b(i5));
            c2715n2.mo4728v(": ");
            c2715n2.mo4728v(c1707q.m3041d(i5));
            c2715n2.mo4728v("\r\n");
        }
        c2715n2.mo4728v("\r\n");
        this.f6696d = 1;
    }
}
