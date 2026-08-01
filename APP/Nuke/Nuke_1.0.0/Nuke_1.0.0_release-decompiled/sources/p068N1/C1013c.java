package p068N1;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import p000A.C0038T0;
import p029F0.C0413m0;
import p088R1.C1213n;
import p117X2.AbstractC1665j;
import p118X3.C1683E;
import p118X3.C1684F;
import p138b4.C1861f;
import p138b4.C1869n;
import p138b4.C1870o;
import p138b4.InterfaceC1862g;
import p144c4.C1918h;
import p144c4.InterfaceC1914d;
import p144c4.InterfaceC1915e;
import p154e2.C2026e;
import p154e2.C2028g;
import p179i4.AbstractC2352g;
import p260x.C3438u;
import p260x.InterfaceC3411Q;

/* JADX INFO: renamed from: N1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1013c {

    /* JADX INFO: renamed from: a */
    public boolean f3128a;

    /* JADX INFO: renamed from: b */
    public final Object f3129b;

    /* JADX INFO: renamed from: c */
    public Object f3130c;

    /* JADX INFO: renamed from: d */
    public Object f3131d;

    public C1013c() {
        this.f3129b = new Object();
        this.f3130c = new ArrayList();
        this.f3131d = new ArrayList();
        this.f3128a = true;
    }

    /* JADX INFO: renamed from: b */
    public static IOException m2079b(C1013c c1013c, boolean z5, IOException iOException, int i5) {
        boolean z6 = (i5 & 4) == 0;
        boolean z7 = (i5 & 8) == 0;
        if (iOException != null) {
            c1013c.m2085g(iOException);
        }
        if (z7) {
            if (iOException != null) {
                ((C1869n) c1013c.f3129b).f6329g.getClass();
            } else {
                ((C1869n) c1013c.f3129b).f6329g.getClass();
            }
        }
        if (z6) {
            if (iOException != null) {
                ((C1869n) c1013c.f3129b).f6329g.getClass();
            } else {
                ((C1869n) c1013c.f3129b).f6329g.getClass();
            }
        }
        return ((C1869n) c1013c.f3129b).m3354k(c1013c, z7 && !z5, z6 && !z5, z6 && z5, z7 && z5, iOException);
    }

    /* JADX INFO: renamed from: a */
    public void m2080a() {
        C1015e.m2088b((C1015e) this.f3131d, this, false);
    }

    /* JADX INFO: renamed from: c */
    public C1870o m2081c() {
        InterfaceC1914d interfaceC1914dMo3403h = ((InterfaceC1915e) this.f3131d).mo3403h();
        C1870o c1870o = interfaceC1914dMo3403h instanceof C1870o ? (C1870o) interfaceC1914dMo3403h : null;
        if (c1870o != null) {
            return c1870o;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* JADX INFO: renamed from: d */
    public File m2082d() {
        File file;
        synchronized (((C1015e) this.f3131d)) {
            try {
                C1014d c1014d = (C1014d) this.f3129b;
                if (c1014d.f3137f != this) {
                    throw new IllegalStateException();
                }
                if (!c1014d.f3136e) {
                    ((boolean[]) this.f3130c)[0] = true;
                }
                file = c1014d.f3135d[0];
                ((C1015e) this.f3131d).f3139d.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public C1918h m2083e(C1684F c1684f) throws IOException {
        C1013c c1013c;
        String strM3038a;
        long jMo3397b;
        try {
            strM3038a = c1684f.f5743i.m3038a("Content-Type");
            if (strM3038a == null) {
                strM3038a = null;
            }
            jMo3397b = ((InterfaceC1915e) this.f3131d).mo3397b(c1684f);
            c1013c = this;
        } catch (IOException e5) {
            e = e5;
            c1013c = this;
        }
        try {
            return new C1918h(strM3038a, jMo3397b, AbstractC2352g.m4199l(new C1861f(c1013c, ((InterfaceC1915e) this.f3131d).mo3402g(c1684f), jMo3397b, false)));
        } catch (IOException e6) {
            e = e6;
            IOException iOException = e;
            ((C1869n) c1013c.f3129b).f6329g.getClass();
            m2085g(iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: f */
    public C1683E m2084f(boolean z5) throws IOException {
        try {
            C1683E c1683eMo3405j = ((InterfaceC1915e) this.f3131d).mo3405j(z5);
            if (c1683eMo3405j == null) {
                return c1683eMo3405j;
            }
            c1683eMo3405j.f5736n = this;
            return c1683eMo3405j;
        } catch (IOException e5) {
            ((C1869n) this.f3129b).f6329g.getClass();
            m2085g(e5);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2085g(IOException iOException) {
        this.f3128a = true;
        ((InterfaceC1915e) this.f3131d).mo3403h().mo3327b((C1869n) this.f3129b, iOException);
    }

    /* JADX INFO: renamed from: h */
    public C0038T0 m2086h() throws SocketException {
        C1869n c1869n = (C1869n) this.f3129b;
        if (c1869n.f6335m) {
            throw new IllegalStateException("Check failed.");
        }
        c1869n.f6335m = true;
        c1869n.f6330h.m4697i();
        synchronized (c1869n) {
            if (c1869n.f6343u == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c1869n.f6339q || c1869n.f6340r) {
                throw new IllegalStateException("Check failed.");
            }
            if (c1869n.f6337o) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c1869n.f6338p) {
                throw new IllegalStateException("Check failed.");
            }
            c1869n.f6338p = false;
            c1869n.f6339q = true;
            c1869n.f6340r = true;
        }
        InterfaceC1914d interfaceC1914dMo3403h = ((InterfaceC1915e) this.f3131d).mo3403h();
        AbstractC1665j.m2983c(interfaceC1914dMo3403h, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        C1870o c1870o = (C1870o) interfaceC1914dMo3403h;
        c1870o.f6348e.setSoTimeout(0);
        c1870o.mo3333h();
        return new C0038T0(this);
    }

    public C1013c(C1869n c1869n, InterfaceC1862g interfaceC1862g, InterfaceC1915e interfaceC1915e) {
        AbstractC1665j.m2985e(interfaceC1862g, "finder");
        this.f3129b = c1869n;
        this.f3130c = interfaceC1862g;
        this.f3131d = interfaceC1915e;
    }

    public C1013c(C1213n c1213n, C2026e c2026e) {
        this.f3131d = new C2028g(this);
        this.f3130c = c1213n;
        this.f3129b = c2026e;
    }

    public C1013c(C3438u c3438u, C0413m0 c0413m0, InterfaceC3411Q interfaceC3411Q) {
        this.f3129b = c3438u;
        this.f3130c = c0413m0;
        this.f3131d = interfaceC3411Q;
        this.f3128a = true;
    }

    public C1013c(C1015e c1015e, C1014d c1014d) {
        this.f3131d = c1015e;
        this.f3129b = c1014d;
        this.f3130c = c1014d.f3136e ? null : new boolean[c1015e.f3145j];
    }
}
