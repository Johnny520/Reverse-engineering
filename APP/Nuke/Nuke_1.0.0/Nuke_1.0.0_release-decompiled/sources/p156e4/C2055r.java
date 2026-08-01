package p156e4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p117X2.AbstractC1665j;
import p118X3.C1679A;
import p118X3.C1684F;
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

    public C2055r(C1715y c1715y, C1870o c1870o, C1917g c1917g, C2054q c2054q) {
        AbstractC1665j.m2985e(c2054q, "http2Connection");
        this.f6871a = c1870o;
        this.f6872b = c1917g;
        this.f6873c = c2054q;
        List list = c1715y.f5934r;
        EnumC1716z enumC1716z = EnumC1716z.f5948j;
        this.f6875e = list.contains(enumC1716z) ? enumC1716z : EnumC1716z.f5947i;
    }

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

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: b */
    public final long mo3397b(C1684F c1684f) {
        if (AbstractC1916f.m3406a(c1684f)) {
            return AbstractC1776g.m3177d(c1684f);
        }
        return 0L;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: c */
    public final void mo3398c() {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        c2062y.f6905l.close();
    }

    @Override // p144c4.InterfaceC1915e
    public final void cancel() {
        this.f6876f = true;
        C2062y c2062y = this.f6874d;
        if (c2062y != null) {
            c2062y.m3773e(EnumC2039b.f6789k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3399d() {
        /*
            r5 = this;
            e4.y r0 = r5.f6874d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            e4.w r2 = r0.f6904k     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f6891e     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            n4.e r2 = r2.f6893g     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.m4720m()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p156e4.C2055r.mo3399d():boolean");
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: e */
    public final void mo3400e() {
        this.f6873c.flush();
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: f */
    public final InterfaceC2721t mo3401f() {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: g */
    public final InterfaceC2722u mo3402g(C1684F c1684f) {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y.f6904k;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: h */
    public final InterfaceC1914d mo3403h() {
        return this.f6871a;
    }

    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: i */
    public final InterfaceC2720s mo3404i(C1679A c1679a, long j5) {
        C2062y c2062y = this.f6874d;
        AbstractC1665j.m2982b(c2062y);
        return c2062y.f6905l;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // p144c4.InterfaceC1915e
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p118X3.C1683E mo3405j(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p156e4.C2055r.mo3405j(boolean):X3.E");
    }
}
