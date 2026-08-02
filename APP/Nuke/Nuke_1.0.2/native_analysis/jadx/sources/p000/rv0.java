package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements xg0 {

    /* JADX INFO: renamed from: g */
    public static final List f9764g = wg3.m5897j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h */
    public static final List f9765h = wg3.m5897j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a */
    public final t52 f9766a;

    /* JADX INFO: renamed from: b */
    public final v52 f9767b;

    /* JADX INFO: renamed from: c */
    public final qv0 f9768c;

    /* JADX INFO: renamed from: d */
    public volatile xv0 f9769d;

    /* JADX INFO: renamed from: e */
    public final c42 f9770e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f9771f;

    public rv0(et1 et1Var, t52 t52Var, v52 v52Var, qv0 qv0Var) {
        et1Var.getClass();
        qv0Var.getClass();
        this.f9766a = t52Var;
        this.f9767b = v52Var;
        this.f9768c = qv0Var;
        List list = et1Var.f2618s;
        c42 c42Var = c42.f1141n;
        this.f9770e = list.contains(c42Var) ? c42Var : c42.f1140m;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: a */
    public final ht2 mo2396a(r92 r92Var) {
        xv0 xv0Var = this.f9769d;
        xv0Var.getClass();
        return xv0Var.f13188o;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo2397b(k82 k82Var) throws IOException {
        int i;
        xv0 xv0Var;
        boolean z;
        if (this.f9769d != null) {
            return;
        }
        boolean z2 = k82Var.f5393d != null;
        js0 js0Var = k82Var.f5392c;
        ArrayList arrayList = new ArrayList(js0Var.size() + 4);
        arrayList.add(new gs0(gs0.f3688f, k82Var.f5391b));
        C0505no c0505no = gs0.f3689g;
        yw0 yw0Var = k82Var.f5390a;
        yw0Var.getClass();
        String strM6356b = yw0Var.m6356b();
        String strM6358d = yw0Var.m6358d();
        if (strM6358d != null) {
            strM6356b = strM6356b + '?' + strM6358d;
        }
        arrayList.add(new gs0(c0505no, strM6356b));
        String strM2557a = js0Var.m2557a("Host");
        if (strM2557a != null) {
            arrayList.add(new gs0(gs0.f3691i, strM2557a));
        }
        arrayList.add(new gs0(gs0.f3690h, yw0Var.f13641a));
        int size = js0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM2558b = js0Var.m2558b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strM2558b.toLowerCase(locale);
            lowerCase.getClass();
            if (!f9764g.contains(lowerCase) || (lowerCase.equals("te") && js0Var.m2560d(i2).equals("trailers"))) {
                arrayList.add(new gs0(lowerCase, js0Var.m2560d(i2)));
            }
        }
        qv0 qv0Var = this.f9768c;
        qv0Var.getClass();
        boolean z3 = !z2;
        synchronized (qv0Var.f9183D) {
            synchronized (qv0Var) {
                try {
                    if (qv0Var.f9190l > 1073741823) {
                        qv0Var.m4284g(cg0.REFUSED_STREAM);
                    }
                    if (qv0Var.f9191m) {
                        throw new C0712sy();
                    }
                    i = qv0Var.f9190l;
                    qv0Var.f9190l = i + 2;
                    xv0Var = new xv0(i, qv0Var, z3, false, null);
                    z = !z2 || qv0Var.f9180A >= qv0Var.f9181B || xv0Var.f13184k >= xv0Var.f13185l;
                    if (xv0Var.m6189h()) {
                        qv0Var.f9187i.put(Integer.valueOf(i), xv0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qv0Var.f9183D.m6351h(z3, i, arrayList);
        }
        if (z) {
            qv0Var.f9183D.flush();
        }
        this.f9769d = xv0Var;
        boolean z4 = this.f9771f;
        xv0 xv0Var2 = this.f9769d;
        if (z4) {
            xv0Var2.getClass();
            xv0Var2.m6186e(cg0.CANCEL);
            c80.m678v("Canceled");
        } else {
            xv0Var2.getClass();
            xv0Var2.f13190q.mo3228g(this.f9767b.f11703g);
            xv0 xv0Var3 = this.f9769d;
            xv0Var3.getClass();
            xv0Var3.f13191r.mo3228g(this.f9767b.f11704h);
        }
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: c */
    public final void mo2398c() {
        xv0 xv0Var = this.f9769d;
        xv0Var.getClass();
        xv0Var.f13189p.close();
    }

    @Override // p000.xg0
    public final void cancel() {
        this.f9771f = true;
        xv0 xv0Var = this.f9769d;
        if (xv0Var != null) {
            xv0Var.m6186e(cg0.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p000.xg0
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2399d() {
        boolean z;
        xv0 xv0Var = this.f9769d;
        if (xv0Var != null) {
            synchronized (xv0Var) {
                vv0 vv0Var = xv0Var.f13188o;
                if (vv0Var.f12183i) {
                    z = vv0Var.f12185k.m1683k();
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: e */
    public final void mo2400e() {
        this.f9768c.flush();
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: f */
    public final ys2 mo2401f() {
        xv0 xv0Var = this.f9769d;
        xv0Var.getClass();
        return xv0Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: g */
    public final wg0 mo2402g() {
        return this.f9766a;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: h */
    public final long mo2403h(r92 r92Var) {
        if (sw0.m5006a(r92Var)) {
            return wg3.m5892e(r92Var);
        }
        return 0L;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: i */
    public final fr2 mo2404i(k82 k82Var, long j) {
        xv0 xv0Var = this.f9769d;
        xv0Var.getClass();
        return xv0Var.f13189p;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // p000.xg0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p92 mo2405j(boolean z) throws IOException {
        js0 js0Var;
        xv0 xv0Var = this.f9769d;
        if (xv0Var == null) {
            c80.m678v("stream wasn't created");
            return null;
        }
        synchronized (xv0Var) {
            while (true) {
                if (!xv0Var.f13186m.isEmpty() || xv0Var.m6187f() != null) {
                    break;
                }
                if (!z) {
                    xv0Var.f13182i.getClass();
                    uv0 uv0Var = xv0Var.f13189p;
                    boolean z2 = uv0Var.f11512j || uv0Var.f11510h;
                    if (z2) {
                        xv0Var.f13190q.m5886h();
                    }
                    try {
                        try {
                            xv0Var.wait();
                            if (z2) {
                                xv0Var.f13190q.m6004l();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            xv0Var.f13190q.m6004l();
                        }
                        throw th;
                    }
                }
            }
            if (xv0Var.f13186m.isEmpty()) {
                IOException iOException = xv0Var.f13193t;
                if (iOException != null) {
                    throw iOException;
                }
                cg0 cg0VarM6187f = xv0Var.m6187f();
                cg0VarM6187f.getClass();
                throw new av2(cg0VarM6187f);
            }
            Object objRemoveFirst = xv0Var.f13186m.removeFirst();
            objRemoveFirst.getClass();
            js0Var = (js0) objRemoveFirst;
        }
        c42 c42Var = this.f9770e;
        c42Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = js0Var.size();
        C0158e9 c0158e9M5054F = null;
        for (int i = 0; i < size; i++) {
            String strM2558b = js0Var.m2558b(i);
            String strM2560d = js0Var.m2560d(i);
            if (strM2558b.equals(":status")) {
                c0158e9M5054F = t11.m5054F("HTTP/1.1 ".concat(strM2560d));
            } else if (!f9765h.contains(strM2558b)) {
                arrayList.add(strM2558b);
                arrayList.add(pv2.m3993I0(strM2560d).toString());
            }
        }
        if (c0158e9M5054F == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        p92 p92Var = new p92();
        p92Var.f8045b = c42Var;
        p92Var.f8046c = c0158e9M5054F.f2352i;
        p92Var.f8047d = (String) c0158e9M5054F.f2354k;
        p92Var.f8049f = new js0((String[]) arrayList.toArray(new String[0])).m2559c();
        if (z && p92Var.f8046c == 100) {
            return null;
        }
        return p92Var;
    }
}
