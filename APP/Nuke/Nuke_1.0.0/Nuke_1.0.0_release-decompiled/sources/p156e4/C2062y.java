package p156e4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import p117X2.AbstractC1665j;
import p118X3.C1707q;
import p123Y3.AbstractC1776g;
import p161f4.C2167a;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: e4.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2062y implements InterfaceC2721t {

    /* JADX INFO: renamed from: d */
    public final int f6897d;

    /* JADX INFO: renamed from: e */
    public final C2054q f6898e;

    /* JADX INFO: renamed from: f */
    public final C2167a f6899f;

    /* JADX INFO: renamed from: g */
    public long f6900g;

    /* JADX INFO: renamed from: h */
    public long f6901h;

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f6902i;

    /* JADX INFO: renamed from: j */
    public boolean f6903j;

    /* JADX INFO: renamed from: k */
    public final C2060w f6904k;

    /* JADX INFO: renamed from: l */
    public final C2059v f6905l;

    /* JADX INFO: renamed from: m */
    public final C2061x f6906m;

    /* JADX INFO: renamed from: n */
    public final C2061x f6907n;

    /* JADX INFO: renamed from: o */
    public EnumC2039b f6908o;

    /* JADX INFO: renamed from: p */
    public IOException f6909p;

    public C2062y(int i5, C2054q c2054q, boolean z5, boolean z6, C1707q c1707q) {
        AbstractC1665j.m2985e(c2054q, "connection");
        this.f6897d = i5;
        this.f6898e = c2054q;
        this.f6899f = new C2167a(i5);
        this.f6901h = c2054q.f6863u.m3734a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f6902i = arrayDeque;
        this.f6904k = new C2060w(this, c2054q.f6862t.m3734a(), z6);
        this.f6905l = new C2059v(this, z5);
        this.f6906m = new C2061x(this);
        this.f6907n = new C2061x(this);
        if (c1707q == null) {
            if (!m3775g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m3775g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c1707q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3769a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = p123Y3.AbstractC1776g.f6076a
            monitor-enter(r2)
            e4.w r0 = r2.f6904k     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f6891e     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f6894h     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            e4.v r0 = r2.f6905l     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f6886d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f6888f     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m3776h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            e4.b r0 = p156e4.EnumC2039b.f6789k
            r1 = 0
            r2.m3771c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            e4.q r0 = r2.f6898e
            int r1 = r2.f6897d
            r0.m3754d(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p156e4.C2062y.m3769a():void");
    }

    /* JADX INFO: renamed from: b */
    public final void m3770b() throws IOException {
        C2059v c2059v = this.f6905l;
        if (c2059v.f6888f) {
            throw new IOException("stream closed");
        }
        if (c2059v.f6886d) {
            throw new IOException("stream finished");
        }
        if (m3774f() != null) {
            IOException iOException = this.f6909p;
            if (iOException != null) {
                throw iOException;
            }
            EnumC2039b enumC2039bM3774f = m3774f();
            AbstractC1665j.m2982b(enumC2039bM3774f);
            throw new C2037D(enumC2039bM3774f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3771c(EnumC2039b enumC2039b, IOException iOException) {
        if (m3772d(enumC2039b, iOException)) {
            this.f6898e.f6868z.m3784l(this.f6897d, enumC2039b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3772d(EnumC2039b enumC2039b, IOException iOException) {
        TimeZone timeZone = AbstractC1776g.f6076a;
        synchronized (this) {
            if (m3774f() != null) {
                return false;
            }
            this.f6908o = enumC2039b;
            this.f6909p = iOException;
            notifyAll();
            if (this.f6904k.f6891e) {
                if (this.f6905l.f6886d) {
                    return false;
                }
            }
            this.f6898e.m3754d(this.f6897d);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3773e(EnumC2039b enumC2039b) {
        if (m3772d(enumC2039b, null)) {
            this.f6898e.m3758l(this.f6897d, enumC2039b);
        }
    }

    /* JADX INFO: renamed from: f */
    public final EnumC2039b m3774f() {
        EnumC2039b enumC2039b;
        synchronized (this) {
            enumC2039b = this.f6908o;
        }
        return enumC2039b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3775g() {
        boolean z5 = (this.f6897d & 1) == 1;
        this.f6898e.getClass();
        return true == z5;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3776h() {
        synchronized (this) {
            try {
                if (m3774f() != null) {
                    return false;
                }
                C2060w c2060w = this.f6904k;
                if (c2060w.f6891e || c2060w.f6894h) {
                    C2059v c2059v = this.f6905l;
                    if (c2059v.f6886d || c2059v.f6888f) {
                        if (this.f6903j) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3777i(C1707q c1707q, boolean z5) {
        boolean zM3776h;
        AbstractC1665j.m2985e(c1707q, "headers");
        TimeZone timeZone = AbstractC1776g.f6076a;
        synchronized (this) {
            try {
                if (this.f6903j && c1707q.m3038a(":status") == null && c1707q.m3038a(":method") == null) {
                    this.f6904k.getClass();
                } else {
                    this.f6903j = true;
                    this.f6902i.add(c1707q);
                }
                if (z5) {
                    this.f6904k.f6891e = true;
                }
                zM3776h = m3776h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM3776h) {
            return;
        }
        this.f6898e.m3754d(this.f6897d);
    }

    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: p */
    public final InterfaceC2720s mo47p() {
        return this.f6905l;
    }

    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: q */
    public final InterfaceC2722u mo48q() {
        return this.f6904k;
    }
}
