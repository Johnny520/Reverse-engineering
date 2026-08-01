package p156e4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import p000A.C0072l0;
import p007B0.C0173F;
import p014C1.C0240b;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p133a4.C1807c;
import p133a4.C1808d;
import p161f4.C2167a;
import p208n4.C2706e;
import p208n4.C2715n;
import p208n4.C2716o;

/* JADX INFO: renamed from: e4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2054q implements Closeable {

    /* JADX INFO: renamed from: C */
    public static final C2036C f6843C;

    /* JADX INFO: renamed from: A */
    public final C2053p f6844A;

    /* JADX INFO: renamed from: B */
    public final LinkedHashSet f6845B;

    /* JADX INFO: renamed from: d */
    public final AbstractC2051n f6846d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f6847e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final String f6848f;

    /* JADX INFO: renamed from: g */
    public int f6849g;

    /* JADX INFO: renamed from: h */
    public int f6850h;

    /* JADX INFO: renamed from: i */
    public boolean f6851i;

    /* JADX INFO: renamed from: j */
    public final C1808d f6852j;

    /* JADX INFO: renamed from: k */
    public final C1807c f6853k;

    /* JADX INFO: renamed from: l */
    public final C1807c f6854l;

    /* JADX INFO: renamed from: m */
    public final C1807c f6855m;

    /* JADX INFO: renamed from: n */
    public final C2035B f6856n;

    /* JADX INFO: renamed from: o */
    public long f6857o;

    /* JADX INFO: renamed from: p */
    public long f6858p;

    /* JADX INFO: renamed from: q */
    public long f6859q;

    /* JADX INFO: renamed from: r */
    public long f6860r;

    /* JADX INFO: renamed from: s */
    public final C2040c f6861s;

    /* JADX INFO: renamed from: t */
    public final C2036C f6862t;

    /* JADX INFO: renamed from: u */
    public C2036C f6863u;

    /* JADX INFO: renamed from: v */
    public final C2167a f6864v;

    /* JADX INFO: renamed from: w */
    public long f6865w;

    /* JADX INFO: renamed from: x */
    public long f6866x;

    /* JADX INFO: renamed from: y */
    public final C0072l0 f6867y;

    /* JADX INFO: renamed from: z */
    public final C2063z f6868z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2036C c2036c = new C2036C();
        c2036c.m3736c(4, 65535);
        c2036c.m3736c(5, 16384);
        f6843C = c2036c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2054q(C0240b c0240b) {
        this.f6846d = (AbstractC2051n) c0240b.f811d;
        String str = (String) c0240b.f810c;
        if (str == null) {
            AbstractC1665j.m2991k("connectionName");
            throw null;
        }
        this.f6848f = str;
        this.f6850h = 3;
        C1808d c1808d = (C1808d) c0240b.f808a;
        this.f6852j = c1808d;
        this.f6853k = c1808d.m3283d();
        this.f6854l = c1808d.m3283d();
        this.f6855m = c1808d.m3283d();
        this.f6856n = C2035B.f6779a;
        this.f6861s = (C2040c) c0240b.f812e;
        C2036C c2036c = new C2036C();
        c2036c.m3736c(4, 16777216);
        this.f6862t = c2036c;
        this.f6863u = f6843C;
        this.f6864v = new C2167a(0);
        this.f6866x = r0.m3734a();
        C0072l0 c0072l0 = (C0072l0) c0240b.f809b;
        if (c0072l0 == null) {
            AbstractC1665j.m2991k("socket");
            throw null;
        }
        this.f6867y = c0072l0;
        this.f6868z = new C2063z((C2715n) c0072l0.f309g);
        this.f6844A = new C2053p(this, new C2058u((C2716o) c0072l0.f308f));
        this.f6845B = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3752b(EnumC2039b enumC2039b, EnumC2039b enumC2039b2, IOException iOException) {
        int i5;
        Object[] array;
        TimeZone timeZone = AbstractC1776g.f6076a;
        try {
            m3755f(enumC2039b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f6847e.isEmpty()) {
                array = null;
            } else {
                array = this.f6847e.values().toArray(new C2062y[0]);
                this.f6847e.clear();
            }
        }
        C2062y[] c2062yArr = (C2062y[]) array;
        if (c2062yArr != null) {
            for (C2062y c2062y : c2062yArr) {
                try {
                    c2062y.m3771c(enumC2039b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f6868z.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C0173F) this.f6867y.f307e).f612e).close();
        } catch (IOException unused4) {
        }
        this.f6853k.m3279e();
        this.f6854l.m3279e();
        this.f6855m.m3279e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2062y m3753c(int i5) {
        C2062y c2062y;
        synchronized (this) {
            c2062y = (C2062y) this.f6847e.get(Integer.valueOf(i5));
        }
        return c2062y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3752b(EnumC2039b.f6784f, EnumC2039b.f6789k, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C2062y m3754d(int i5) {
        C2062y c2062y;
        synchronized (this) {
            c2062y = (C2062y) this.f6847e.remove(Integer.valueOf(i5));
            notifyAll();
        }
        return c2062y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3755f(EnumC2039b enumC2039b) {
        synchronized (this.f6868z) {
            synchronized (this) {
                if (this.f6851i) {
                    return;
                }
                this.f6851i = true;
                this.f6868z.m3781f(this.f6849g, enumC2039b, AbstractC1774e.f6072a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        this.f6868z.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3756h(long j5) {
        synchronized (this) {
            try {
                C2167a.m4004b(this.f6864v, j5, 0L, 2);
                long jM4005a = this.f6864v.m4005a();
                if (jM4005a >= this.f6862t.m3734a() / 2) {
                    m3759m(jM4005a, 0);
                    C2167a.m4004b(this.f6864v, 0L, jM4005a, 1);
                }
                C2040c c2040c = this.f6861s;
                C2167a c2167a = this.f6864v;
                c2040c.getClass();
                AbstractC1665j.m2985e(c2167a, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f6868z.f6913f);
        r6 = r2;
        r8.f6865w += r6;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3757j(int i5, boolean z5, C2706e c2706e, long j5) {
        int iMin;
        long j6;
        if (j5 == 0) {
            this.f6868z.m3779c(z5, i5, c2706e, 0);
            return;
        }
        while (j5 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j7 = this.f6865w;
                            long j8 = this.f6866x;
                            if (j7 < j8) {
                                break;
                            } else {
                                if (!this.f6847e.containsKey(Integer.valueOf(i5))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j5 -= j6;
            this.f6868z.m3779c(z5 && j5 == 0, i5, c2706e, iMin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m3758l(final int i5, final EnumC2039b enumC2039b) {
        C1807c.m3275b(this.f6853k, this.f6848f + '[' + i5 + "] writeSynReset", new InterfaceC1599a() { // from class: e4.j
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                C2054q c2054q = this.f6827d;
                try {
                    c2054q.f6868z.m3784l(i5, enumC2039b);
                } catch (IOException e5) {
                    EnumC2039b enumC2039b2 = EnumC2039b.f6785g;
                    c2054q.m3752b(enumC2039b2, enumC2039b2, e5);
                }
                return C0891q.f2780a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m3759m(final long j5, final int i5) {
        C1807c.m3275b(this.f6853k, this.f6848f + '[' + i5 + "] windowUpdate", new InterfaceC1599a() { // from class: e4.i
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                C2054q c2054q = this.f6824d;
                int i6 = i5;
                try {
                    c2054q.f6868z.m3785m(j5, i6);
                } catch (IOException e5) {
                    EnumC2039b enumC2039b = EnumC2039b.f6785g;
                    c2054q.m3752b(enumC2039b, enumC2039b, e5);
                }
                return C0891q.f2780a;
            }
        });
    }
}
