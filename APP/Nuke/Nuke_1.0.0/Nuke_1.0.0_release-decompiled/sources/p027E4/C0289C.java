package p027E4;

import java.io.IOException;
import java.util.ArrayList;
import p000A.C0038T0;
import p000A.C0072l0;
import p007B0.C0173F;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p118X3.AbstractC1682D;
import p118X3.AbstractC1687I;
import p118X3.C1679A;
import p118X3.C1681C;
import p118X3.C1683E;
import p118X3.C1684F;
import p118X3.C1686H;
import p118X3.C1704n;
import p118X3.C1706p;
import p118X3.C1708r;
import p118X3.C1709s;
import p118X3.C1711u;
import p118X3.C1713w;
import p118X3.C1715y;
import p118X3.InterfaceC1694d;
import p118X3.InterfaceC1695e;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p128a.AbstractC1785a;
import p138b4.C1869n;
import p138b4.RunnableC1866k;
import p173h4.AbstractC2263d;
import p208n4.C2706e;
import p208n4.C2709h;

/* JADX INFO: renamed from: E4.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0289C implements InterfaceC0318e {

    /* JADX INFO: renamed from: d */
    public final C0305T f922d;

    /* JADX INFO: renamed from: e */
    public final Object f923e;

    /* JADX INFO: renamed from: f */
    public final Object[] f924f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1694d f925g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0327n f926h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f927i;

    /* JADX INFO: renamed from: j */
    public C1869n f928j;

    /* JADX INFO: renamed from: k */
    public Throwable f929k;

    /* JADX INFO: renamed from: l */
    public boolean f930l;

    public C0289C(C0305T c0305t, Object obj, Object[] objArr, InterfaceC1694d interfaceC1694d, InterfaceC0327n interfaceC0327n) {
        this.f922d = c0305t;
        this.f923e = obj;
        this.f924f = objArr;
        this.f925g = interfaceC1694d;
        this.f926h = interfaceC0327n;
    }

    /* JADX INFO: renamed from: a */
    public final C1869n m508a() {
        C1709s c1709sM3043a;
        C0305T c0305t = this.f922d;
        AbstractC0315b0[] abstractC0315b0Arr = c0305t.f1015k;
        Object[] objArr = this.f924f;
        int length = objArr.length;
        if (length != abstractC0315b0Arr.length) {
            StringBuilder sbM404o = AbstractC0231b.m404o(length, "Argument count (", ") doesn't match expected count (");
            sbM404o.append(abstractC0315b0Arr.length);
            sbM404o.append(")");
            throw new IllegalArgumentException(sbM404o.toString());
        }
        C0303Q c0303q = new C0303Q(c0305t.f1008d, c0305t.f1007c, c0305t.f1009e, c0305t.f1010f, c0305t.f1011g, c0305t.f1012h, c0305t.f1013i, c0305t.f1014j);
        if (c0305t.f1016l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(objArr[i5]);
            abstractC0315b0Arr[i5].mo515a(c0303q, objArr[i5]);
        }
        C1708r c1708r = c0303q.f971d;
        if (c1708r != null) {
            c1709sM3043a = c1708r.m3043a();
        } else {
            String str = c0303q.f970c;
            C1709s c1709s = c0303q.f969b;
            c1709s.getClass();
            AbstractC1665j.m2985e(str, "link");
            C1708r c1708rM3051f = c1709s.m3051f(str);
            c1709sM3043a = c1708rM3051f != null ? c1708rM3051f.m3043a() : null;
            if (c1709sM3043a == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c1709s + ", Relative: " + c0303q.f970c);
            }
        }
        AbstractC1682D c0302p = c0303q.f978k;
        if (c0302p == null) {
            C0038T0 c0038t0 = c0303q.f977j;
            if (c0038t0 != null) {
                c0302p = new C1704n((ArrayList) c0038t0.f169e, (ArrayList) c0038t0.f170f);
            } else {
                C0072l0 c0072l0 = c0303q.f976i;
                if (c0072l0 != null) {
                    ArrayList arrayList2 = (ArrayList) c0072l0.f309g;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    c0302p = new C1713w((C2709h) c0072l0.f307e, (C1711u) c0072l0.f308f, AbstractC1776g.m3182i(arrayList2));
                } else if (c0303q.f975h) {
                    int i6 = AbstractC1682D.f5722a;
                    long j5 = 0;
                    AbstractC1774e.m3160a(j5, j5, j5);
                    c0302p = new C1681C(0, new byte[0]);
                }
            }
        }
        C1711u c1711u = c0303q.f974g;
        C1706p c1706p = c0303q.f973f;
        if (c1711u != null) {
            if (c0302p != null) {
                c0302p = new C0302P(c0302p, c1711u);
            } else {
                c1706p.m3022a("Content-Type", c1711u.f5879a);
            }
        }
        C0240b c0240b = c0303q.f972e;
        c0240b.getClass();
        c0240b.f808a = c1709sM3043a;
        c0240b.f810c = c1706p.m3024c().m3040c();
        c0240b.m438o(c0303q.f968a, c0302p);
        c0240b.f812e = ((AbstractC1785a) c0240b.f812e).mo3156p(AbstractC1676u.m2995a(C0334u.class), new C0334u(c0305t.f1005a, this.f923e, c0305t.f1006b, arrayList));
        C1679A c1679a = new C1679A(c0240b);
        C1715y c1715y = (C1715y) this.f925g;
        c1715y.getClass();
        return new C1869n(c1715y, c1679a);
    }

    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: b */
    public final C0306U mo509b() {
        InterfaceC1695e interfaceC1695eM512e;
        synchronized (this) {
            if (this.f930l) {
                throw new IllegalStateException("Already executed.");
            }
            this.f930l = true;
            interfaceC1695eM512e = m512e();
        }
        if (this.f927i) {
            ((C1869n) interfaceC1695eM512e).cancel();
        }
        return m514g(((C1869n) interfaceC1695eM512e).m3351h());
    }

    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: c */
    public final void mo510c(InterfaceC0321h interfaceC0321h) {
        C1869n c1869n;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f930l) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f930l = true;
                c1869n = this.f928j;
                th = this.f929k;
                if (c1869n == null && th == null) {
                    try {
                        C1869n c1869nM508a = m508a();
                        this.f928j = c1869nM508a;
                        c1869n = c1869nM508a;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC0315b0.m547r(th);
                        this.f929k = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0321h.mo44m(this, th);
            return;
        }
        if (this.f927i) {
            c1869n.cancel();
        }
        C0038T0 c0038t0 = new C0038T0(4, this, interfaceC0321h, false);
        c1869n.getClass();
        if (!c1869n.f6331i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
        c1869n.f6332j = AbstractC2263d.f7404a.mo4114f();
        c1869n.f6329g.getClass();
        C0173F c0173f = c1869n.f6326d.f5917a;
        RunnableC1866k runnableC1866k = new RunnableC1866k(c1869n, c0038t0);
        c0173f.getClass();
        C0173F.m246l(c0173f, runnableC1866k, null, null, 6);
    }

    @Override // p027E4.InterfaceC0318e
    public final void cancel() {
        C1869n c1869n;
        this.f927i = true;
        synchronized (this) {
            c1869n = this.f928j;
        }
        if (c1869n != null) {
            c1869n.cancel();
        }
    }

    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: clone */
    public final InterfaceC0318e m5856clone() {
        return new C0289C(this.f922d, this.f923e, this.f924f, this.f925g, this.f926h);
    }

    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: d */
    public final synchronized C1679A mo511d() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create request.", e5);
        }
        return ((C1869n) m512e()).f6327e;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC1695e m512e() throws IOException {
        C1869n c1869n = this.f928j;
        if (c1869n != null) {
            return c1869n;
        }
        Throwable th = this.f929k;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C1869n c1869nM508a = m508a();
            this.f928j = c1869nM508a;
            return c1869nM508a;
        } catch (IOException | Error | RuntimeException e5) {
            AbstractC0315b0.m547r(e5);
            this.f929k = e5;
            throw e5;
        }
    }

    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: f */
    public final boolean mo513f() {
        boolean z5 = true;
        if (this.f927i) {
            return true;
        }
        synchronized (this) {
            try {
                C1869n c1869n = this.f928j;
                if (c1869n == null || !c1869n.f6342t) {
                    z5 = false;
                }
            } finally {
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: g */
    public final C0306U m514g(C1684F c1684f) throws IOException {
        AbstractC1687I abstractC1687I = c1684f.f5744j;
        C1683E c1683eM3005b = c1684f.m3005b();
        c1683eM3005b.f5729g = new C0288B(abstractC1687I.mo506d(), abstractC1687I.mo505c());
        C1684F c1684fM3004a = c1683eM3005b.m3004a();
        boolean z5 = c1684fM3004a.f5753s;
        int i5 = c1684fM3004a.f5741g;
        if (i5 < 200 || i5 >= 300) {
            try {
                C2706e c2706e = new C2706e();
                abstractC1687I.mo507f().mo4723q(c2706e);
                C1711u c1711uMo506d = abstractC1687I.mo506d();
                long jMo505c = abstractC1687I.mo505c();
                C1686H c1686h = AbstractC1687I.f5761e;
                C1686H c1686h2 = new C1686H(c1711uMo506d, jMo505c, c2706e);
                if (z5) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C0306U(c1684fM3004a, null, c1686h2);
            } finally {
                abstractC1687I.close();
            }
        }
        if (i5 == 204 || i5 == 205) {
            if (z5) {
                return new C0306U(c1684fM3004a, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C0287A c0287a = new C0287A(abstractC1687I);
        try {
            Object objMo63a = this.f926h.mo63a(c0287a);
            if (z5) {
                return new C0306U(c1684fM3004a, objMo63a, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e5) {
            IOException iOException = c0287a.f919h;
            if (iOException == null) {
                throw e5;
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m5855clone() {
        return new C0289C(this.f922d, this.f923e, this.f924f, this.f925g, this.f926h);
    }
}
