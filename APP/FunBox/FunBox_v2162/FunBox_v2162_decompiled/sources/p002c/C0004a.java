package p002c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p009j.AbstractC0156g;
import p009j.AbstractC0167r;
import p009j.C0150a;
import p009j.C0152c;
import p009j.C0157h;
import p009j.C0158i;
import p009j.C0159j;
import p009j.C0164o;
import p009j.C0166q;
import p009j.C0168s;
import p009j.C0169t;
import p009j.C0170u;
import p010k.C0180j;
import p011l.C0193a;
import p011l.C0194b;
import p011l.C0195c;
import p013n.C0205g;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a {

    /* JADX INFO: renamed from: a */
    private final C0012i f1a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f2b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private C0010g f3c;

    /* JADX INFO: renamed from: d */
    private boolean f4d;

    /* JADX INFO: renamed from: e */
    private final C0011h f5e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f6f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f7g;

    /* JADX INFO: renamed from: h */
    private C0168s f8h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f9i;

    /* JADX INFO: renamed from: j */
    private C0194b f10j;

    C0004a(C0006c c0006c) {
        ArrayList arrayList = new ArrayList();
        this.f6f = arrayList;
        this.f7g = new ArrayList();
        this.f8h = C0168s.f681a;
        new ArrayList();
        this.f9i = new ArrayList();
        this.f10j = C0194b.f722c;
        C0012i c0012i = c0006c.f11a;
        this.f1a = c0012i;
        if (c0006c.m45c()) {
            this.f5e = null;
        } else {
            C0011h c0011hM60a = C0011h.m60a(this, c0012i.f36a);
            this.f5e = c0011hM60a;
            arrayList.add(c0011hM60a);
        }
        C0013j[] c0013jArr = c0012i.f39d.f55a;
        for (C0013j c0013j : c0013jArr) {
            this.f6f.add(C0011h.m60a(this, c0013j));
        }
        C0010g c0010g = new C0010g();
        this.f3c = c0010g;
        C0004a c0004a = c0010g.f26b;
        if (c0004a != this) {
            if (c0004a != null) {
                throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
            }
            c0010g.f26b = this;
            this.f2b.add(c0010g);
        }
        this.f3c.f27c = true;
    }

    /* JADX INFO: renamed from: a */
    private void m24a(AbstractC0156g abstractC0156g) {
        C0010g c0010g = this.f3c;
        if (c0010g == null || !c0010g.f27c) {
            throw new IllegalStateException("no current label");
        }
        c0010g.f25a.add(abstractC0156g);
        int iM412b = abstractC0156g.m366h().m412b();
        if (iM412b != 1) {
            if (iM412b == 2) {
                this.f3c = null;
                return;
            }
            if (iM412b == 3) {
                throw new IllegalArgumentException("branch == null");
            }
            if (iM412b == 4) {
                throw new IllegalArgumentException("branch == null");
            }
            if (iM412b != 6) {
                throw new IllegalArgumentException();
            }
            ArrayList arrayList = new ArrayList(this.f9i);
            C0010g c0010g2 = new C0010g();
            C0004a c0004a = c0010g2.f26b;
            if (c0004a != this) {
                if (c0004a != null) {
                    throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
                }
                c0010g2.f26b = this;
                this.f2b.add(c0010g2);
            }
            C0010g c0010g3 = this.f3c;
            c0010g3.f29e = c0010g2;
            c0010g3.f30f = null;
            c0010g3.f28d = arrayList;
            this.f3c = c0010g2;
            c0010g2.f27c = true;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m25d(C0011h c0011h, C0013j c0013j) {
        if (c0011h.f33b.equals(c0013j)) {
            return;
        }
        throw new IllegalArgumentException("requested " + c0013j + " but was " + c0011h.f33b);
    }

    /* JADX INFO: renamed from: h */
    private void m26h(C0166q c0166q, C0012i c0012i, C0011h c0011h, C0011h c0011h2, C0011h... c0011hArr) {
        C0168s c0168s = this.f8h;
        int i2 = c0011h2 != null ? 1 : 0;
        C0164o c0164o = new C0164o(c0011hArr.length + i2);
        if (c0011h2 != null) {
            c0164o.m521x(0, c0011h2.m62c());
        }
        for (int i3 = 0; i3 < c0011hArr.length; i3++) {
            c0164o.m521x(i3 + i2, c0011hArr[i3].m62c());
        }
        m24a(new C0169t(c0166q, c0168s, c0164o, this.f10j, c0012i.f40e));
        m27l(c0011h, false);
    }

    /* JADX INFO: renamed from: l */
    private void m27l(C0011h c0011h, boolean z) {
        C0166q c0166q;
        C0013j c0013j = c0011h.f33b;
        if (z) {
            C0195c c0195c = c0013j.f53b;
            C0166q c0166q2 = AbstractC0167r.f600a;
            c0195c.getClass();
            c0166q = new C0166q(56, c0195c, C0194b.f722c, null);
        } else {
            C0195c c0195c2 = c0013j.f53b;
            C0166q c0166q3 = AbstractC0167r.f600a;
            c0195c2.getClass();
            c0166q = new C0166q(55, c0195c2, C0194b.f722c, null);
        }
        m24a(new C0159j(c0166q, this.f8h, c0011h.m62c(), C0164o.f512c));
    }

    /* JADX INFO: renamed from: b */
    public final void m28b(C0011h c0011h, C0011h c0011h2, C0011h c0011h3) {
        m24a(new C0170u(AbstractC0167r.m417a(c0011h3.f33b.f53b), this.f8h, C0164o.m398J(c0011h3.m62c(), c0011h.m62c(), c0011h2.m62c()), this.f10j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5 == 7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29c(C0011h c0011h, C0011h c0011h2) {
        C0166q c0166q;
        C0013j c0013j = c0011h2.f33b;
        boolean zM474l = c0013j.f53b.m474l();
        C0013j c0013j2 = c0011h.f33b;
        if (zM474l) {
            m24a(new C0169t(AbstractC0167r.f557L1, this.f8h, C0164o.m396H(c0011h2.m62c()), this.f10j, c0013j2.f54c));
            m27l(c0011h, true);
            return;
        }
        C0195c c0195c = c0013j.f53b;
        C0195c c0195c2 = c0013j2.f53b;
        if (c0195c.mo380d() != 6) {
            C0166q c0166q2 = AbstractC0167r.f600a;
            int iM468e = c0195c2.m468e();
            int iM468e2 = c0195c.m468e();
            if (iM468e2 != 4) {
                if (iM468e2 != 5) {
                    if (iM468e2 == 6) {
                        if (iM468e == 4) {
                            c0166q = AbstractC0167r.f583U0;
                        } else if (iM468e == 5) {
                            c0166q = AbstractC0167r.f574R0;
                        } else if (iM468e == 7) {
                            c0166q = AbstractC0167r.f565O0;
                        }
                    }
                    if (iM468e == 4) {
                        c0166q = AbstractC0167r.f586V0;
                    } else if (iM468e == 5) {
                        c0166q = AbstractC0167r.f577S0;
                    } else if (iM468e == 6) {
                        c0166q = AbstractC0167r.f556L0;
                    }
                }
                if (iM468e == 4) {
                    c0166q = AbstractC0167r.f589W0;
                } else if (iM468e == 6) {
                    c0166q = AbstractC0167r.f559M0;
                } else if (iM468e == 7) {
                    c0166q = AbstractC0167r.f568P0;
                }
            }
            if (iM468e == 5) {
                c0166q = AbstractC0167r.f580T0;
            } else {
                if (iM468e != 6) {
                    if (iM468e == 7) {
                        c0166q = AbstractC0167r.f571Q0;
                    }
                    throw new IllegalArgumentException("bad types: " + C0194b.m461G(c0195c2, c0195c));
                }
                c0166q = AbstractC0167r.f562N0;
            }
        } else {
            int iMo380d = c0195c2.mo380d();
            if (iMo380d == 2) {
                c0166q = AbstractC0167r.f592X0;
            } else if (iMo380d == 3) {
                c0166q = AbstractC0167r.f595Y0;
            } else if (iMo380d == 8) {
                c0166q = AbstractC0167r.f598Z0;
            }
        }
        m24a(new C0159j(c0166q, this.f8h, c0011h.m62c(), C0164o.m396H(c0011h2.m62c())));
    }

    /* JADX INFO: renamed from: e */
    public final C0011h m30e(int i2, C0013j c0013j) {
        if (this.f5e != null) {
            i2++;
        }
        C0011h c0011h = (C0011h) this.f6f.get(i2);
        m25d(c0011h, c0013j);
        return c0011h;
    }

    /* JADX INFO: renamed from: f */
    public final C0011h m31f(C0013j c0013j) {
        C0011h c0011h = this.f5e;
        if (c0011h == null) {
            throw new IllegalStateException("static methods cannot access 'this'");
        }
        m25d(c0011h, c0013j);
        return c0011h;
    }

    /* JADX INFO: renamed from: g */
    final void m32g() {
        if (this.f4d) {
            throw new AssertionError();
        }
        this.f4d = true;
        Iterator it = this.f7g.iterator();
        int iM61b = 0;
        while (it.hasNext()) {
            iM61b += ((C0011h) it.next()).m61b(iM61b);
        }
        ArrayList arrayList = new ArrayList();
        int iM61b2 = iM61b;
        for (C0011h c0011h : this.f6f) {
            C0180j c0180jM436j = C0180j.m436j(iM61b2 - iM61b);
            iM61b2 += c0011h.m61b(iM61b2);
            arrayList.add(new C0158i(AbstractC0167r.m419c(c0011h.f33b.f53b), this.f8h, c0011h.m62c(), C0164o.f512c, c0180jM436j));
        }
        ((C0010g) this.f2b.get(0)).f25a.addAll(0, arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final void m33i(C0012i c0012i, C0011h c0011h, C0011h... c0011hArr) {
        C0193a c0193aM454f = C0193a.m454f(c0012i.m63a(true));
        C0166q c0166q = AbstractC0167r.f600a;
        m26h(new C0166q(49, c0193aM454f.m456c(), C0194b.f729j), c0012i, c0011h, null, c0011hArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m34j(C0012i c0012i, C0011h c0011h, C0011h c0011h2, C0011h... c0011hArr) {
        C0193a c0193aM454f = C0193a.m454f(c0012i.m63a(true));
        C0166q c0166q = AbstractC0167r.f600a;
        m26h(new C0166q(50, c0193aM454f.m456c(), C0194b.f729j), c0012i, c0011h, c0011h2, c0011hArr);
    }

    /* JADX INFO: renamed from: k */
    public final void m35k(C0011h c0011h, Integer num) {
        C0166q c0166qM418b = num == null ? AbstractC0167r.f651q : AbstractC0167r.m418b(c0011h.f33b.f53b);
        if (c0166qM418b.m412b() == 1) {
            m24a(new C0158i(c0166qM418b, this.f8h, c0011h.m62c(), C0164o.f512c, AbstractC0005b.m42a(num)));
        } else {
            m24a(new C0169t(c0166qM418b, this.f8h, C0164o.f512c, this.f10j, AbstractC0005b.m42a(num)));
            m27l(c0011h, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m36m(C0011h c0011h, C0011h c0011h2) {
        C0013j c0013j = c0011h.f33b;
        m24a(new C0169t(AbstractC0167r.m420d(c0013j.f53b), this.f8h, C0164o.m396H(c0011h2.m62c()), this.f10j, c0013j.f54c));
        m27l(c0011h, true);
    }

    /* JADX INFO: renamed from: n */
    public final C0011h m37n(C0013j c0013j) {
        if (this.f4d) {
            throw new IllegalStateException("Cannot allocate locals after adding instructions");
        }
        C0011h c0011hM60a = C0011h.m60a(this, c0013j);
        this.f7g.add(c0011hM60a);
        return c0011hM60a;
    }

    /* JADX INFO: renamed from: o */
    final int m38o() {
        Iterator it = this.f6f.iterator();
        int iM469f = 0;
        while (it.hasNext()) {
            iM469f += ((C0011h) it.next()).f33b.f53b.m469f();
        }
        return iM469f;
    }

    /* JADX INFO: renamed from: p */
    public final void m39p(C0011h c0011h) {
        C0012i c0012i = this.f1a;
        C0013j c0013j = c0012i.f37b;
        C0013j c0013j2 = c0011h.f33b;
        if (c0013j2.equals(c0013j)) {
            m24a(new C0159j(AbstractC0167r.m421e(c0013j2.f53b), this.f8h, null, C0164o.m396H(c0011h.m62c())));
            return;
        }
        throw new IllegalArgumentException("declared " + c0012i.f37b + " but returned " + c0013j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m40q() {
        C0012i c0012i = this.f1a;
        if (c0012i.f37b.equals(C0013j.f49l)) {
            m24a(new C0159j(AbstractC0167r.f602a1, this.f8h, null, C0164o.f512c));
            return;
        }
        throw new IllegalArgumentException("declared " + c0012i.f37b + " but returned void");
    }

    /* JADX INFO: renamed from: r */
    final C0152c m41r() {
        int i2;
        if (!this.f4d) {
            m32g();
        }
        ArrayList arrayList = this.f2b;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C0010g c0010g = (C0010g) it.next();
            if (c0010g.f25a.isEmpty()) {
                it.remove();
            } else {
                for (int i4 = 0; i4 < c0010g.f28d.size(); i4++) {
                    while (((C0010g) c0010g.f28d.get(i4)).f25a.isEmpty()) {
                        List list = c0010g.f28d;
                        list.set(i4, ((C0010g) list.get(i4)).f29e);
                    }
                }
                while (true) {
                    C0010g c0010g2 = c0010g.f29e;
                    if (c0010g2 == null || !c0010g2.f25a.isEmpty()) {
                        break;
                    }
                    c0010g.f29e = c0010g.f29e.f29e;
                }
                while (true) {
                    C0010g c0010g3 = c0010g.f30f;
                    if (c0010g3 == null || !c0010g3.f25a.isEmpty()) {
                        break;
                    }
                    c0010g.f30f = c0010g.f30f.f29e;
                }
                c0010g.f31g = i3;
                i3++;
            }
        }
        C0152c c0152c = new C0152c(arrayList.size());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C0010g c0010g4 = (C0010g) arrayList.get(i5);
            ArrayList arrayList2 = c0010g4.f25a;
            C0157h c0157h = new C0157h(arrayList2.size());
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                c0157h.m520w(i6, (AbstractC0156g) arrayList2.get(i6));
            }
            c0157h.m536g();
            C0205g c0205g = new C0205g(4);
            Iterator it2 = c0010g4.f28d.iterator();
            while (it2.hasNext()) {
                c0205g.m524j(((C0010g) it2.next()).f31g);
            }
            C0010g c0010g5 = c0010g4.f29e;
            if (c0010g5 != null) {
                i2 = c0010g5.f31g;
                c0205g.m524j(i2);
            } else {
                i2 = -1;
            }
            C0010g c0010g6 = c0010g4.f30f;
            if (c0010g6 != null) {
                c0205g.m524j(c0010g6.f31g);
            }
            c0205g.m536g();
            c0152c.m360L(i5, new C0150a(c0010g4.f31g, c0157h, c0205g, i2));
        }
        return c0152c;
    }
}
