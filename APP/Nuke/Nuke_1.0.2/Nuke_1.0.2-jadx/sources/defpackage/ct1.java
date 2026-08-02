package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ct1 implements wo {
    public final v82 h;
    public final Object i;
    public final Object[] j;
    public final et1 k;
    public final x00 l;
    public volatile boolean m;
    public s52 n;
    public Throwable o;
    public boolean p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ct1(v82 v82Var, Object obj, Object[] objArr, et1 et1Var, x00 x00Var) {
        this.h = v82Var;
        this.i = obj;
        this.j = objArr;
        this.k = et1Var;
        this.l = x00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s52 a() {
        xw0 xw0Var;
        yw0 yw0VarB;
        v82 v82Var = this.h;
        op0[] op0VarArr = v82Var.j;
        Object[] objArr = this.j;
        int length = objArr.length;
        if (length != op0VarArr.length) {
            StringBuilder sbN = vi0.n(length, "Argument count (", ") doesn't match expected count (");
            sbN.append(op0VarArr.length);
            sbN.append(")");
            throw new IllegalArgumentException(sbN.toString());
        }
        r82 r82Var = new r82(v82Var.c, v82Var.b, v82Var.d, v82Var.e, v82Var.f, v82Var.g, v82Var.h, v82Var.i);
        if (v82Var.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            op0VarArr[i].j(r82Var, objArr[i]);
        }
        xw0 xw0Var2 = r82Var.d;
        if (xw0Var2 != null) {
            yw0VarB = xw0Var2.b();
        } else {
            String str = r82Var.c;
            yw0 yw0Var = r82Var.b;
            yw0Var.getClass();
            str.getClass();
            try {
                xw0Var = new xw0();
                xw0Var.e(yw0Var, str);
            } catch (IllegalArgumentException unused) {
                xw0Var = null;
            }
            yw0VarB = xw0Var != null ? xw0Var.b() : null;
            if (yw0VarB == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(yw0Var);
                String str2 = r82Var.c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        o82 q82Var = r82Var.k;
        if (q82Var == null) {
            sz0 sz0Var = r82Var.j;
            if (sz0Var != null) {
                q82Var = new pm0((ArrayList) sz0Var.i, (ArrayList) sz0Var.j);
            } else {
                b5 b5Var = r82Var.i;
                if (b5Var != null) {
                    ArrayList arrayList2 = (ArrayList) b5Var.k;
                    if (arrayList2.isEmpty()) {
                        s.l("Multipart body must have at least one part.");
                        return null;
                    }
                    q82Var = new uj1((no) b5Var.i, (vf1) b5Var.j, wg3.i(arrayList2));
                } else if (r82Var.h) {
                    int i2 = o82.a;
                    ug3.a(0L, 0L, 0L);
                    q82Var = new n82(null, 0, new byte[0]);
                }
            }
        }
        vf1 vf1Var = r82Var.g;
        ye0 ye0Var = r82Var.f;
        if (vf1Var != null) {
            if (q82Var != null) {
                q82Var = new q82(q82Var, vf1Var);
            } else {
                ye0Var.a("Content-Type", vf1Var.a);
            }
        }
        cj cjVar = r82Var.e;
        cjVar.getClass();
        cjVar.a = yw0VarB;
        cjVar.c = ye0Var.b().c();
        cjVar.n(r82Var.a, q82Var);
        cjVar.e = ((p40) cjVar.e).P(d72.a(d21.class), new d21(this.i, v82Var.a, arrayList));
        k82 k82Var = new k82(cjVar);
        et1 et1Var = this.k;
        et1Var.getClass();
        return new s52(et1Var, k82Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wo
    public final void b(cp cpVar) {
        int i;
        s52 s52Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.p) {
                    throw new IllegalStateException("Already executed.");
                }
                i = 1;
                this.p = true;
                s52Var = this.n;
                th = this.o;
                if (s52Var == null && th == null) {
                    try {
                        s52 s52VarA = a();
                        this.n = s52VarA;
                        s52Var = s52VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        xe1.m0(th);
                        this.o = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            cpVar.d(this, th);
            return;
        }
        if (this.m) {
            s52Var.cancel();
        }
        s52Var.g(new dq1(i, this, cpVar, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wo
    public final synchronized k82 c() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wo
    public final void cancel() {
        s52 s52Var;
        this.m = true;
        synchronized (this) {
            s52Var = this.n;
        }
        if (s52Var != null) {
            s52Var.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wo
    /* JADX INFO: renamed from: clone */
    public final wo mo0clone() {
        return new ct1(this.h, this.i, this.j, this.k, this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s52 d() throws IOException {
        s52 s52Var = this.n;
        if (s52Var != null) {
            return s52Var;
        }
        Throwable th = this.o;
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
            s52 s52VarA = a();
            this.n = s52VarA;
            return s52VarA;
        } catch (IOException | Error | RuntimeException e) {
            xe1.m0(e);
            this.o = e;
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wo
    public final boolean e() {
        boolean z = true;
        if (this.m) {
            return true;
        }
        synchronized (this) {
            try {
                s52 s52Var = this.n;
                if (s52Var == null || !s52Var.x) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q92 f(r92 r92Var) throws IOException {
        u92 u92Var = r92Var.n;
        p92 p92VarB = r92Var.b();
        p92VarB.g = new bt1(u92Var.e(), u92Var.c());
        r92 r92VarA = p92VarB.a();
        boolean z = r92VarA.w;
        int i = r92VarA.k;
        if (i < 200 || i >= 300) {
            try {
                u92Var.g().i(new fn());
                u92Var.e();
                u92Var.c();
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new q92(r92VarA, null);
            } finally {
                u92Var.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new q92(r92VarA, null);
            }
            s.j("rawResponse must be successful response");
            return null;
        }
        at1 at1Var = new at1(u92Var);
        try {
            Object objJ = this.l.j(at1Var);
            if (z) {
                return new q92(r92VarA, objJ);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = at1Var.l;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    public final Object clone() {
        return new ct1(this.h, this.i, this.j, this.k, this.l);
    }
}
