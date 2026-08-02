package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements xg0 {
    public static final List g = wg3.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = wg3.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final t52 a;
    public final v52 b;
    public final qv0 c;
    public volatile xv0 d;
    public final c42 e;
    public volatile boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rv0(et1 et1Var, t52 t52Var, v52 v52Var, qv0 qv0Var) {
        et1Var.getClass();
        qv0Var.getClass();
        this.a = t52Var;
        this.b = v52Var;
        this.c = qv0Var;
        List list = et1Var.s;
        c42 c42Var = c42.n;
        this.e = list.contains(c42Var) ? c42Var : c42.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final ht2 a(r92 r92Var) {
        xv0 xv0Var = this.d;
        xv0Var.getClass();
        return xv0Var.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void b(k82 k82Var) throws IOException {
        int i;
        xv0 xv0Var;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = k82Var.d != null;
        js0 js0Var = k82Var.c;
        ArrayList arrayList = new ArrayList(js0Var.size() + 4);
        arrayList.add(new gs0(gs0.f, k82Var.b));
        no noVar = gs0.g;
        yw0 yw0Var = k82Var.a;
        yw0Var.getClass();
        String strB = yw0Var.b();
        String strD = yw0Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new gs0(noVar, strB));
        String strA = js0Var.a("Host");
        if (strA != null) {
            arrayList.add(new gs0(gs0.i, strA));
        }
        arrayList.add(new gs0(gs0.h, yw0Var.a));
        int size = js0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = js0Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && js0Var.d(i2).equals("trailers"))) {
                arrayList.add(new gs0(lowerCase, js0Var.d(i2)));
            }
        }
        qv0 qv0Var = this.c;
        qv0Var.getClass();
        boolean z3 = !z2;
        synchronized (qv0Var.D) {
            synchronized (qv0Var) {
                try {
                    if (qv0Var.l > 1073741823) {
                        qv0Var.g(cg0.REFUSED_STREAM);
                    }
                    if (qv0Var.m) {
                        throw new sy();
                    }
                    i = qv0Var.l;
                    qv0Var.l = i + 2;
                    xv0Var = new xv0(i, qv0Var, z3, false, null);
                    z = !z2 || qv0Var.A >= qv0Var.B || xv0Var.k >= xv0Var.l;
                    if (xv0Var.h()) {
                        qv0Var.i.put(Integer.valueOf(i), xv0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qv0Var.D.h(z3, i, arrayList);
        }
        if (z) {
            qv0Var.D.flush();
        }
        this.d = xv0Var;
        boolean z4 = this.f;
        xv0 xv0Var2 = this.d;
        if (z4) {
            xv0Var2.getClass();
            xv0Var2.e(cg0.CANCEL);
            c80.v("Canceled");
        } else {
            xv0Var2.getClass();
            xv0Var2.q.g(this.b.g);
            xv0 xv0Var3 = this.d;
            xv0Var3.getClass();
            xv0Var3.r.g(this.b.h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void c() {
        xv0 xv0Var = this.d;
        xv0Var.getClass();
        xv0Var.p.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void cancel() {
        this.f = true;
        xv0 xv0Var = this.d;
        if (xv0Var != null) {
            xv0Var.e(cg0.CANCEL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // defpackage.xg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        boolean z;
        xv0 xv0Var = this.d;
        if (xv0Var != null) {
            synchronized (xv0Var) {
                vv0 vv0Var = xv0Var.o;
                if (vv0Var.i) {
                    z = vv0Var.k.k();
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void e() {
        this.c.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final ys2 f() {
        xv0 xv0Var = this.d;
        xv0Var.getClass();
        return xv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final wg0 g() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final long h(r92 r92Var) {
        if (sw0.a(r92Var)) {
            return wg3.e(r92Var);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final fr2 i(k82 k82Var, long j) {
        xv0 xv0Var = this.d;
        xv0Var.getClass();
        return xv0Var.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // defpackage.xg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p92 j(boolean z) throws IOException {
        js0 js0Var;
        xv0 xv0Var = this.d;
        if (xv0Var == null) {
            c80.v("stream wasn't created");
            return null;
        }
        synchronized (xv0Var) {
            while (true) {
                if (!xv0Var.m.isEmpty() || xv0Var.f() != null) {
                    break;
                }
                if (!z) {
                    xv0Var.i.getClass();
                    uv0 uv0Var = xv0Var.p;
                    boolean z2 = uv0Var.j || uv0Var.h;
                    if (z2) {
                        xv0Var.q.h();
                    }
                    try {
                        try {
                            xv0Var.wait();
                            if (z2) {
                                xv0Var.q.l();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            xv0Var.q.l();
                        }
                        throw th;
                    }
                }
            }
            if (xv0Var.m.isEmpty()) {
                IOException iOException = xv0Var.t;
                if (iOException != null) {
                    throw iOException;
                }
                cg0 cg0VarF = xv0Var.f();
                cg0VarF.getClass();
                throw new av2(cg0VarF);
            }
            Object objRemoveFirst = xv0Var.m.removeFirst();
            objRemoveFirst.getClass();
            js0Var = (js0) objRemoveFirst;
        }
        c42 c42Var = this.e;
        c42Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = js0Var.size();
        e9 e9VarF = null;
        for (int i = 0; i < size; i++) {
            String strB = js0Var.b(i);
            String strD = js0Var.d(i);
            if (strB.equals(":status")) {
                e9VarF = t11.F("HTTP/1.1 ".concat(strD));
            } else if (!h.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(pv2.I0(strD).toString());
            }
        }
        if (e9VarF == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        p92 p92Var = new p92();
        p92Var.b = c42Var;
        p92Var.c = e9VarF.i;
        p92Var.d = (String) e9VarF.k;
        p92Var.f = new js0((String[]) arrayList.toArray(new String[0])).c();
        if (z && p92Var.c == 100) {
            return null;
        }
        return p92Var;
    }
}
