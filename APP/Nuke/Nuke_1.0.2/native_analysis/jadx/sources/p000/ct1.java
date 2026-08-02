package p000;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ct1 implements InterfaceC0854wo {

    /* JADX INFO: renamed from: h */
    public final v82 f1723h;

    /* JADX INFO: renamed from: i */
    public final Object f1724i;

    /* JADX INFO: renamed from: j */
    public final Object[] f1725j;

    /* JADX INFO: renamed from: k */
    public final et1 f1726k;

    /* JADX INFO: renamed from: l */
    public final x00 f1727l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f1728m;

    /* JADX INFO: renamed from: n */
    public s52 f1729n;

    /* JADX INFO: renamed from: o */
    public Throwable f1730o;

    /* JADX INFO: renamed from: p */
    public boolean f1731p;

    public ct1(v82 v82Var, Object obj, Object[] objArr, et1 et1Var, x00 x00Var) {
        this.f1723h = v82Var;
        this.f1724i = obj;
        this.f1725j = objArr;
        this.f1726k = et1Var;
        this.f1727l = x00Var;
    }

    /* JADX INFO: renamed from: a */
    public final s52 m886a() {
        xw0 xw0Var;
        yw0 yw0VarM6193b;
        v82 v82Var = this.f1723h;
        op0[] op0VarArr = v82Var.f11842j;
        Object[] objArr = this.f1725j;
        int length = objArr.length;
        if (length != op0VarArr.length) {
            StringBuilder sbM5695n = vi0.m5695n(length, "Argument count (", ") doesn't match expected count (");
            sbM5695n.append(op0VarArr.length);
            sbM5695n.append(")");
            throw new IllegalArgumentException(sbM5695n.toString());
        }
        r82 r82Var = new r82(v82Var.f11835c, v82Var.f11834b, v82Var.f11836d, v82Var.f11837e, v82Var.f11838f, v82Var.f11839g, v82Var.f11840h, v82Var.f11841i);
        if (v82Var.f11843k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            op0VarArr[i].mo301j(r82Var, objArr[i]);
        }
        xw0 xw0Var2 = r82Var.f9433d;
        if (xw0Var2 != null) {
            yw0VarM6193b = xw0Var2.m6193b();
        } else {
            String str = r82Var.f9432c;
            yw0 yw0Var = r82Var.f9431b;
            yw0Var.getClass();
            str.getClass();
            try {
                xw0Var = new xw0();
                xw0Var.m6196e(yw0Var, str);
            } catch (IllegalArgumentException unused) {
                xw0Var = null;
            }
            yw0VarM6193b = xw0Var != null ? xw0Var.m6193b() : null;
            if (yw0VarM6193b == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(yw0Var);
                String str2 = r82Var.f9432c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        o82 q82Var = r82Var.f9440k;
        if (q82Var == null) {
            sz0 sz0Var = r82Var.f9439j;
            if (sz0Var != null) {
                q82Var = new pm0((ArrayList) sz0Var.f10436i, (ArrayList) sz0Var.f10437j);
            } else {
                C0043b5 c0043b5 = r82Var.f9438i;
                if (c0043b5 != null) {
                    ArrayList arrayList2 = (ArrayList) c0043b5.f564k;
                    if (arrayList2.isEmpty()) {
                        C0676s.m4653l("Multipart body must have at least one part.");
                        return null;
                    }
                    q82Var = new uj1((C0505no) c0043b5.f562i, (vf1) c0043b5.f563j, wg3.m5896i(arrayList2));
                } else if (r82Var.f9437h) {
                    int i2 = o82.f7582a;
                    ug3.m5493a(0L, 0L, 0L);
                    q82Var = new n82(null, 0, new byte[0]);
                }
            }
        }
        vf1 vf1Var = r82Var.f9436g;
        ye0 ye0Var = r82Var.f9435f;
        if (vf1Var != null) {
            if (q82Var != null) {
                q82Var = new q82(q82Var, vf1Var);
            } else {
                ye0Var.m6249a("Content-Type", vf1Var.f11928a);
            }
        }
        C0093cj c0093cj = r82Var.f9434e;
        c0093cj.getClass();
        c0093cj.f1579a = yw0VarM6193b;
        c0093cj.f1581c = ye0Var.m6250b().m2559c();
        c0093cj.m839n(r82Var.f9430a, q82Var);
        c0093cj.f1583e = ((p40) c0093cj.f1583e).mo2317P(d72.m967a(d21.class), new d21(this.f1724i, v82Var.f11833a, arrayList));
        k82 k82Var = new k82(c0093cj);
        et1 et1Var = this.f1726k;
        et1Var.getClass();
        return new s52(et1Var, k82Var);
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: b */
    public final void mo93b(InterfaceC0101cp interfaceC0101cp) {
        int i;
        s52 s52Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f1731p) {
                    throw new IllegalStateException("Already executed.");
                }
                i = 1;
                this.f1731p = true;
                s52Var = this.f1729n;
                th = this.f1730o;
                if (s52Var == null && th == null) {
                    try {
                        s52 s52VarM886a = m886a();
                        this.f1729n = s52VarM886a;
                        s52Var = s52VarM886a;
                    } catch (Throwable th2) {
                        th = th2;
                        xe1.m6134m0(th);
                        this.f1730o = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0101cp.mo880d(this, th);
            return;
        }
        if (this.f1728m) {
            s52Var.cancel();
        }
        s52Var.m4731g(new dq1(i, this, interfaceC0101cp, false));
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: c */
    public final synchronized k82 mo94c() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m887d().f9914i;
    }

    @Override // p000.InterfaceC0854wo
    public final void cancel() {
        s52 s52Var;
        this.f1728m = true;
        synchronized (this) {
            s52Var = this.f1729n;
        }
        if (s52Var != null) {
            s52Var.cancel();
        }
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: clone */
    public final InterfaceC0854wo mo6522clone() {
        return new ct1(this.f1723h, this.f1724i, this.f1725j, this.f1726k, this.f1727l);
    }

    /* JADX INFO: renamed from: d */
    public final s52 m887d() throws IOException {
        s52 s52Var = this.f1729n;
        if (s52Var != null) {
            return s52Var;
        }
        Throwable th = this.f1730o;
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
            s52 s52VarM886a = m886a();
            this.f1729n = s52VarM886a;
            return s52VarM886a;
        } catch (IOException | Error | RuntimeException e) {
            xe1.m6134m0(e);
            this.f1730o = e;
            throw e;
        }
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: e */
    public final boolean mo95e() {
        boolean z = true;
        if (this.f1728m) {
            return true;
        }
        synchronized (this) {
            try {
                s52 s52Var = this.f1729n;
                if (s52Var == null || !s52Var.f9929x) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final q92 m888f(r92 r92Var) throws IOException {
        u92 u92Var = r92Var.f9462n;
        p92 p92VarM4416b = r92Var.m4416b();
        p92VarM4416b.f8050g = new bt1(u92Var.mo274e(), u92Var.mo273c());
        r92 r92VarM3830a = p92VarM4416b.m3830a();
        boolean z = r92VarM3830a.f9471w;
        int i = r92VarM3830a.f9459k;
        if (i < 200 || i >= 300) {
            try {
                u92Var.mo275g().mo1681i(new C0209fn());
                u92Var.mo274e();
                u92Var.mo273c();
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new q92(r92VarM3830a, null);
            } finally {
                u92Var.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new q92(r92VarM3830a, null);
            }
            C0676s.m4651j("rawResponse must be successful response");
            return null;
        }
        at1 at1Var = new at1(u92Var);
        try {
            Object objMo1846j = this.f1727l.mo1846j(at1Var);
            if (z) {
                return new q92(r92VarM3830a, objMo1846j);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = at1Var.f385l;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    public final Object clone() {
        return new ct1(this.f1723h, this.f1724i, this.f1725j, this.f1726k, this.f1727l);
    }
}
