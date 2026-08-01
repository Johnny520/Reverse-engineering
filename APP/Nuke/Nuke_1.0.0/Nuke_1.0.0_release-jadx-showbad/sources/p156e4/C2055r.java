package p156e4;

import com.bumptech.glide.AbstractC1923e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p049I2.C0793k;
import p117X2.AbstractC1665j;
import p118X3.C1679A;
import p118X3.C1683E;
import p118X3.C1684F;
import p118X3.C1706p;
import p118X3.C1707q;
import p118X3.C1709s;
import p118X3.C1715y;
import p118X3.EnumC1716z;
import p123Y3.AbstractC1776g;
import p138b4.C1870o;
import p144c4.AbstractC1916f;
import p144c4.C1917g;
import p144c4.InterfaceC1914d;
import p144c4.InterfaceC1915e;
import p208n4.C2709h;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: e4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2055r implements InterfaceC1915e {

    /* JADX INFO: renamed from: g */
    public static final List f6869g = AbstractC1776g.m3183j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h */
    public static final List f6870h = AbstractC1776g.m3183j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a */
    public final C1870o f6871a;

    /* JADX INFO: renamed from: b */
    public final C1917g f6872b;

    /* JADX INFO: renamed from: c */
    public final C2054q f6873c;

    /* JADX INFO: renamed from: d */
    public volatile C2062y f6874d;

    /* JADX INFO: renamed from: e */
    public final EnumC1716z f6875e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f6876f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2055r(C1715y c1715y, C1870o c1870o, C1917g c1917g, C2054q c2054q) {
        AbstractC1665j.m2985e(c2054q, "http2Connection");
        this.f6871a = c1870o;
        this.f6872b = c1917g;
        this.f6873c = c2054q;
        List list = c1715y.f5934r;
        EnumC1716z enumC1716z = EnumC1716z.f5948j;
        this.f6875e = list.contains(enumC1716z) ? enumC1716z : EnumC1716z.f5947i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: a */
    public final void mo3396a(C1679A c1679a) throws IOException {
        int i5;
        C2062y c2062y;
        boolean z5;
        if (this.f6874d != null) {
            return;
        }
        boolean z6 = c1679a.f5715d != null;
        C1707q c1707q = c1679a.f5714c;
        ArrayList arrayList = new ArrayList(c1707q.size() + 4);
        arrayList.add(new C2041d(C2041d.f6795f, c1679a.f5713b));
        C2709h c2709h = C2041d.f6796g;
        C1709s c1709s = c1679a.f5712a;
        AbstractC1665j.m2985e(c1709s, "url");
        String strM3047b = c1709s.m3047b();
        String strM3049d = c1709s.m3049d();
        if (strM3049d != null) {
            strM3047b = strM3047b + '?' + strM3049d;
        }
        arrayList.add(new C2041d(c2709h, strM3047b));
        String strM3038a = c1679a.f5714c.m3038a("Host");
        if (strM3038a != null) {
            arrayList.add(new C2041d(C2041d.f6798i, strM3038a));
        }
        arrayList.add(new C2041d(C2041d.f6797h, c1709s.f5868a));
        int size = c1707q.size();
        for (int i6 = 0; i6 < size; i6++) {
            String strM3039b = c1707q.m3039b(i6);
            Locale locale = Locale.US;
            AbstractC1665j.m2984d(locale, "US");
            String lowerCase = strM3039b.toLowerCase(locale);
            AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
            if (!f6869g.contains(lowerCase) || (lowerCase.equals("te") && c1707q.m3041d(i6).equals("trailers"))) {
                arrayList.add(new C2041d(lowerCase, c1707q.m3041d(i6)));
            }
        }
        C2054q c2054q = this.f6873c;
        c2054q.getClass();
        boolean z7 = !z6;
        synchronized (c2054q.f6868z) {
            synchronized (c2054q) {
                try {
                    if (c2054q.f6850h > 1073741823) {
                        c2054q.m3755f(EnumC2039b.f6788j);
                    }
                    if (c2054q.f6851i) {
                        throw new C2038a();
                    }
                    i5 = c2054q.f6850h;
                    c2054q.f6850h = i5 + 2;
                    c2062y = new C2062y(i5, c2054q, z7, false, null);
                    z5 = !z6 || c2054q.f6865w >= c2054q.f6866x || c2062y.f6900g >= c2062y.f6901h;
                    if (c2062y.m3776h()) {
                        c2054q.f6847e.put(Integer.valueOf(i5), c2062y);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2054q.f6868z.m3782h(z7, i5, arrayList);
        }
        if (z5) {
            c2054q.f6868z.flush();
        }
        this.f6874d = c2062y;
        if (this.f6876f) {
            C2062y c2062y2 = this.f6874d;
            AbstractC1665j.m2982b(c2062y2);
            c2062y2.m3773e(EnumC2039b.f6789k);
            throw new IOException("Canceled");
        }
        C2062y c2062y3 = this.f6874d;
        AbstractC1665j.m2982b(c2062y3);
        C2061x c2061x = c2062y3.f6906m;
        long j5 = this.f6872b.f6491g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2061x.mo4749g(j5);
        C2062y c2062y4 = this.f6874d;
        AbstractC1665j.m2982b(c2062y4);
        c2062y4.f6907n.mo4749g(this.f6872b.f6492h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: b */
    public final long mo3397b(C1684F c1684f) {
        if (AbstractC1916f.m3406a(c1684f)) {
            return AbstractC1776g.m3177d(c1684f);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: c */
    public final void mo3398c() {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        c2062y.f6905l.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    public final void cancel() {
        this.f6876f = true;
        C2062y c2062y = this.f6874d;
        if (c2062y != null) {
            c2062y.m3773e(EnumC2039b.f6789k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3399d() {
        boolean z5;
        C2062y c2062y = this.f6874d;
        if (c2062y == null) {
            return false;
        }
        synchronized (c2062y) {
            C2060w c2060w = c2062y.f6904k;
            if (c2060w.f6891e) {
                z5 = c2060w.f6893g.m4720m();
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: e */
    public final void mo3400e() {
        this.f6873c.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: f */
    public final InterfaceC2721t mo3401f() {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: g */
    public final InterfaceC2722u mo3402g(C1684F c1684f) {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y.f6904k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: h */
    public final InterfaceC1914d mo3403h() {
        return this.f6871a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: i */
    public final InterfaceC2720s mo3404i(C1679A c1679a, long j5) {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y.f6905l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1683E mo3405j(boolean z5) throws IOException {
        int i5;
        C1707q c1707q;
        C2062y c2062y = this.f6874d;
        if (c2062y == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c2062y) {
            while (true) {
                if (!c2062y.f6902i.isEmpty() || c2062y.m3774f() != null) {
                    break;
                }
                if (!z5) {
                    c2062y.f6898e.getClass();
                    C2059v c2059v = c2062y.f6905l;
                    i5 = c2059v.f6888f || c2059v.f6886d ? 1 : 0;
                    if (i5 != 0) {
                        c2062y.f6906m.m4696h();
                    }
                    try {
                        try {
                            c2062y.wait();
                            if (i5 != 0) {
                                c2062y.f6906m.m3768l();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        if (i5 != 0) {
                            c2062y.f6906m.m3768l();
                        }
                        throw th;
                    }
                }
            }
            if (c2062y.f6902i.isEmpty()) {
                IOException iOException = c2062y.f6909p;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC2039b enumC2039bM3774f = c2062y.m3774f();
                AbstractC1665j.m2982b(enumC2039bM3774f);
                throw new C2037D(enumC2039bM3774f);
            }
            Object objRemoveFirst = c2062y.f6902i.removeFirst();
            AbstractC1665j.m2984d(objRemoveFirst, "removeFirst(...)");
            c1707q = (C1707q) objRemoveFirst;
        }
        EnumC1716z enumC1716z = this.f6875e;
        AbstractC1665j.m2985e(enumC1716z, "protocol");
        C1706p c1706p = new C1706p(0);
        int size = c1707q.size();
        C0793k c0793kM3453M = null;
        while (i5 < size) {
            String strM3039b = c1707q.m3039b(i5);
            String strM3041d = c1707q.m3041d(i5);
            if (strM3039b.equals(":status")) {
                c0793kM3453M = AbstractC1923e.m3453M("HTTP/1.1 ".concat(strM3041d));
            } else if (!f6870h.contains(strM3039b)) {
                c1706p.m3023b(strM3039b, strM3041d);
            }
            i5++;
        }
        if (c0793kM3453M == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C1683E c1683e = new C1683E();
        c1683e.f5724b = enumC1716z;
        c1683e.f5725c = c0793kM3453M.f2537e;
        c1683e.f5726d = (String) c0793kM3453M.f2539g;
        c1683e.f5728f = c1706p.m3024c().m3040c();
        if (z5 && c1683e.f5725c == 100) {
            return null;
        }
        return c1683e;
    }
}
