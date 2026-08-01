package p138b4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p007B0.C0173F;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1703m;
import p118X3.C1679A;
import p118X3.C1684F;
import p118X3.C1715y;
import p118X3.InterfaceC1695e;
import p123Y3.AbstractC1776g;
import p133a4.C1807c;
import p144c4.InterfaceC1915e;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: b4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1869n implements InterfaceC1695e, Cloneable {

    /* JADX INFO: renamed from: d */
    public final C1715y f6326d;

    /* JADX INFO: renamed from: e */
    public final C1679A f6327e;

    /* JADX INFO: renamed from: f */
    public final C1871p f6328f;

    /* JADX INFO: renamed from: g */
    public volatile AbstractC1703m f6329g;

    /* JADX INFO: renamed from: h */
    public final C1868m f6330h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f6331i;

    /* JADX INFO: renamed from: j */
    public Object f6332j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1862g f6333k;

    /* JADX INFO: renamed from: l */
    public C1870o f6334l;

    /* JADX INFO: renamed from: m */
    public boolean f6335m;

    /* JADX INFO: renamed from: n */
    public C1013c f6336n;

    /* JADX INFO: renamed from: o */
    public boolean f6337o;

    /* JADX INFO: renamed from: p */
    public boolean f6338p;

    /* JADX INFO: renamed from: q */
    public boolean f6339q;

    /* JADX INFO: renamed from: r */
    public boolean f6340r;

    /* JADX INFO: renamed from: s */
    public boolean f6341s;

    /* JADX INFO: renamed from: t */
    public volatile boolean f6342t;

    /* JADX INFO: renamed from: u */
    public volatile C1013c f6343u;

    /* JADX INFO: renamed from: v */
    public final CopyOnWriteArrayList f6344v;

    static {
        AbstractC1665j.m2984d(AtomicReferenceFieldUpdater.newUpdater(C1869n.class, AbstractC1703m.class, "g"), "newUpdater(...)");
    }

    public C1869n(C1715y c1715y, C1679A c1679a) {
        this.f6326d = c1715y;
        this.f6327e = c1679a;
        this.f6328f = (C1871p) c1715y.f5916A.f297e;
        c1715y.f5920d.getClass();
        this.f6329g = AbstractC1703m.f5849a;
        C1868m c1868m = new C1868m(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1868m.mo4749g(0);
        this.f6330h = c1868m;
        this.f6331i = new AtomicBoolean();
        this.f6341s = true;
        this.f6344v = new CopyOnWriteArrayList();
        new AtomicReference(c1679a.f5716e);
    }

    /* JADX INFO: renamed from: a */
    public static final String m3348a(C1869n c1869n) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1869n.f6342t ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(c1869n.f6327e.f5712a.m3052g());
        return sb.toString();
    }

    public final void cancel() {
        if (this.f6342t) {
            return;
        }
        this.f6342t = true;
        C1013c c1013c = this.f6343u;
        if (c1013c != null) {
            ((InterfaceC1915e) c1013c.f3131d).cancel();
        }
        Iterator it = this.f6344v.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1875t) it.next()).cancel();
        }
        this.f6329g.getClass();
    }

    public final Object clone() {
        return new C1869n(this.f6326d, this.f6327e);
    }

    /* JADX INFO: renamed from: e */
    public final void m3349e(C1870o c1870o) {
        AbstractC1665j.m2985e(c1870o, "connection");
        TimeZone timeZone = AbstractC1776g.f6076a;
        if (this.f6334l != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f6334l = c1870o;
        c1870o.f6359p.add(new C1867l(this, this.f6332j));
    }

    /* JADX INFO: renamed from: g */
    public final IOException m3350g(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM3356m;
        TimeZone timeZone = AbstractC1776g.f6076a;
        C1870o c1870o = this.f6334l;
        if (c1870o != null) {
            synchronized (c1870o) {
                socketM3356m = m3356m();
            }
            if (this.f6334l == null) {
                if (socketM3356m != null) {
                    AbstractC1776g.m3175b(socketM3356m);
                }
                this.f6329g.getClass();
            } else if (socketM3356m != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f6335m && this.f6330h.m4697i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f6329g.getClass();
            return interruptedIOException;
        }
        AbstractC1703m abstractC1703m = this.f6329g;
        AbstractC1665j.m2982b(interruptedIOException);
        abstractC1703m.getClass();
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: h */
    public final C1684F m3351h() {
        if (!this.f6331i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f6330h.m4696h();
        AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
        this.f6332j = AbstractC2263d.f7404a.mo4114f();
        this.f6329g.getClass();
        try {
            C0173F c0173f = this.f6326d.f5917a;
            synchronized (c0173f) {
                ((ArrayDeque) c0173f.f615h).add(this);
            }
            return m3353j();
        } finally {
            C0173F c0173f2 = this.f6326d.f5917a;
            c0173f2.getClass();
            C0173F.m246l(c0173f2, null, this, null, 5);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3352i(boolean z5) {
        C1013c c1013c;
        synchronized (this) {
            if (!this.f6341s) {
                throw new IllegalStateException("released");
            }
        }
        if (z5 && (c1013c = this.f6343u) != null) {
            ((InterfaceC1915e) c1013c.f3131d).cancel();
            ((C1869n) c1013c.f3129b).m3354k(c1013c, true, true, true, true, null);
        }
        this.f6336n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p118X3.C1684F m3353j() {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X3.y r0 = r1.f6326d
            java.util.List r0 = r0.f5918b
            p061L2.AbstractC0978r.m2032N(r0, r2)
            c4.b r0 = new c4.b
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            c4.b r0 = new c4.b
            r3 = 1
            r0.<init>(r3)
            r2.add(r0)
            K3.a r0 = new K3.a
            r0.<init>()
            r2.add(r0)
            b4.a r0 = p138b4.C1856a.f6273a
            r2.add(r0)
            X3.y r0 = r1.f6326d
            java.util.List r0 = r0.f5919c
            p061L2.AbstractC0978r.m2032N(r0, r2)
            c4.b r0 = p144c4.C1912b.f6482b
            r2.add(r0)
            c4.g r0 = new c4.g
            X3.A r5 = r1.f6327e
            X3.y r3 = r1.f6326d
            int r6 = r3.f5938v
            int r7 = r3.f5939w
            int r8 = r3.f5940x
            X3.b r9 = r3.f5923g
            X3.f r10 = r3.f5936t
            A.i0 r11 = r3.f5916A
            X3.b r12 = r3.f5926j
            X3.b r13 = r3.f5927k
            l4.c r14 = r3.f5935s
            X3.b r15 = r3.f5929m
            java.net.ProxySelector r4 = r3.f5928l
            r16 = r0
            boolean r0 = r3.f5921e
            r17 = r0
            javax.net.SocketFactory r0 = r3.f5930n
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.f5931o
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.f5932p
            I2.o r3 = r3.f5937u
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            X3.A r4 = r1.f6327e     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            X3.F r0 = r0.m3409b(r4)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            boolean r4 = r1.f6342t     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            if (r4 != 0) goto L84
            r1.m3355l(r2)
            return r0
        L84:
            p123Y3.AbstractC1774e.m3161b(r0)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            throw r0     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
        L8f:
            r0 = move-exception
            goto L9d
        L91:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r1.m3355l(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            p117X2.AbstractC1665j.m2983c(r0, r4)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L9d:
            if (r3 != 0) goto La2
            r1.m3355l(r2)
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p138b4.C1869n.m3353j():X3.F");
    }

    /* JADX INFO: renamed from: k */
    public final IOException m3354k(C1013c c1013c, boolean z5, boolean z6, boolean z7, boolean z8, IOException iOException) {
        boolean z9;
        boolean z10;
        AbstractC1665j.m2985e(c1013c, "exchange");
        if (c1013c.equals(this.f6343u)) {
            synchronized (this) {
                z9 = false;
                if (z5) {
                    try {
                        if (!this.f6337o) {
                            if ((z6 || !this.f6338p) && ((!z8 || !this.f6339q) && (!z7 || !this.f6340r))) {
                            }
                        }
                        if (z5) {
                            this.f6337o = false;
                        }
                        if (z6) {
                            this.f6338p = false;
                        }
                        if (z8) {
                            this.f6339q = false;
                        }
                        if (z7) {
                            this.f6340r = false;
                        }
                        boolean z11 = (this.f6337o || this.f6338p || this.f6339q || this.f6340r) ? false : true;
                        if (z11) {
                            if (!this.f6341s) {
                                z9 = true;
                            }
                        }
                        boolean z12 = z9;
                        z9 = z11;
                        z10 = z12;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z10 = z6 ? false : false;
                }
            }
            if (z9) {
                this.f6343u = null;
                C1870o c1870o = this.f6334l;
                if (c1870o != null) {
                    synchronized (c1870o) {
                        c1870o.f6356m++;
                    }
                }
            }
            if (z10) {
                return m3350g(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: l */
    public final IOException m3355l(IOException iOException) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.f6341s) {
                this.f6341s = false;
                if (!this.f6337o && !this.f6338p && !this.f6339q) {
                    if (!this.f6340r) {
                        z5 = true;
                    }
                }
            }
        }
        return z5 ? m3350g(iOException) : iOException;
    }

    /* JADX INFO: renamed from: m */
    public final Socket m3356m() {
        C1870o c1870o = this.f6334l;
        AbstractC1665j.m2982b(c1870o);
        TimeZone timeZone = AbstractC1776g.f6076a;
        ArrayList arrayList = c1870o.f6359p;
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (AbstractC1665j.m2981a(((Reference) it.next()).get(), this)) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i5);
        this.f6334l = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c1870o.f6360q = System.nanoTime();
        C1871p c1871p = this.f6328f;
        ConcurrentLinkedQueue concurrentLinkedQueue = c1871p.f6364d;
        TimeZone timeZone2 = AbstractC1776g.f6076a;
        if (!c1870o.f6353j) {
            c1871p.f6362b.m3277c(c1871p.f6363c, 0L);
            return null;
        }
        c1870o.f6353j = true;
        concurrentLinkedQueue.remove(c1870o);
        if (concurrentLinkedQueue.isEmpty()) {
            C1807c c1807c = c1871p.f6362b;
            synchronized (c1807c.f6154a) {
                if (c1807c.m3276a()) {
                    c1807c.f6154a.m3282c(c1807c);
                }
            }
        }
        return c1870o.f6348e;
    }
}
