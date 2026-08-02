package p000;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 implements ys2 {

    /* JADX INFO: renamed from: h */
    public final int f13181h;

    /* JADX INFO: renamed from: i */
    public final qv0 f13182i;

    /* JADX INFO: renamed from: j */
    public final sd3 f13183j;

    /* JADX INFO: renamed from: k */
    public long f13184k;

    /* JADX INFO: renamed from: l */
    public long f13185l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f13186m;

    /* JADX INFO: renamed from: n */
    public boolean f13187n;

    /* JADX INFO: renamed from: o */
    public final vv0 f13188o;

    /* JADX INFO: renamed from: p */
    public final uv0 f13189p;

    /* JADX INFO: renamed from: q */
    public final wv0 f13190q;

    /* JADX INFO: renamed from: r */
    public final wv0 f13191r;

    /* JADX INFO: renamed from: s */
    public cg0 f13192s;

    /* JADX INFO: renamed from: t */
    public IOException f13193t;

    public xv0(int i, qv0 qv0Var, boolean z, boolean z2, js0 js0Var) {
        qv0Var.getClass();
        this.f13181h = i;
        this.f13182i = qv0Var;
        this.f13183j = new sd3(i);
        this.f13185l = qv0Var.f9203y.m6170a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13186m = arrayDeque;
        this.f13188o = new vv0(this, qv0Var.f9202x.m6170a(), z2);
        this.f13189p = new uv0(this, z);
        this.f13190q = new wv0(this);
        this.f13191r = new wv0(this);
        if (js0Var == null) {
            if (m6188g()) {
                return;
            }
            C0676s.m4653l("remotely-initiated streams should have headers");
            throw null;
        }
        if (m6188g()) {
            C0676s.m4653l("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(js0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6182a() {
        boolean z;
        boolean zM6189h;
        TimeZone timeZone = wg3.f12507a;
        synchronized (this) {
            try {
                vv0 vv0Var = this.f13188o;
                if (vv0Var.f12183i || !vv0Var.f12186l) {
                    z = false;
                } else {
                    uv0 uv0Var = this.f13189p;
                    if (uv0Var.f11510h || uv0Var.f11512j) {
                        z = true;
                    }
                }
                zM6189h = m6189h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m6184c(cg0.CANCEL, null);
        } else {
            if (zM6189h) {
                return;
            }
            this.f13182i.m4283e(this.f13181h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6183b() throws IOException {
        uv0 uv0Var = this.f13189p;
        if (uv0Var.f11512j) {
            c80.m678v("stream closed");
            return;
        }
        if (uv0Var.f11510h) {
            c80.m678v("stream finished");
            return;
        }
        if (m6187f() != null) {
            IOException iOException = this.f13193t;
            if (iOException != null) {
                throw iOException;
            }
            cg0 cg0VarM6187f = m6187f();
            cg0VarM6187f.getClass();
            throw new av2(cg0VarM6187f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6184c(cg0 cg0Var, IOException iOException) {
        if (m6185d(cg0Var, iOException)) {
            qv0 qv0Var = this.f13182i;
            qv0Var.getClass();
            qv0Var.f9183D.m6353k(this.f13181h, cg0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6185d(cg0 cg0Var, IOException iOException) {
        TimeZone timeZone = wg3.f12507a;
        synchronized (this) {
            if (m6187f() != null) {
                return false;
            }
            this.f13192s = cg0Var;
            this.f13193t = iOException;
            notifyAll();
            if (this.f13188o.f12183i) {
                if (this.f13189p.f11510h) {
                    return false;
                }
            }
            this.f13182i.m4283e(this.f13181h);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6186e(cg0 cg0Var) {
        if (m6185d(cg0Var, null)) {
            this.f13182i.m4287k(this.f13181h, cg0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final cg0 m6187f() {
        cg0 cg0Var;
        synchronized (this) {
            cg0Var = this.f13192s;
        }
        return cg0Var;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6188g() {
        boolean z = (this.f13181h & 1) == 1;
        this.f13182i.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6189h() {
        synchronized (this) {
            try {
                if (m6187f() != null) {
                    return false;
                }
                vv0 vv0Var = this.f13188o;
                if (vv0Var.f12183i || vv0Var.f12186l) {
                    uv0 uv0Var = this.f13189p;
                    if (uv0Var.f11510h || uv0Var.f11512j) {
                        if (this.f13187n) {
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
    public final void m6190i(js0 js0Var, boolean z) {
        boolean zM6189h;
        js0Var.getClass();
        TimeZone timeZone = wg3.f12507a;
        synchronized (this) {
            try {
                if (this.f13187n && js0Var.m2557a(":status") == null && js0Var.m2557a(":method") == null) {
                    this.f13188o.getClass();
                } else {
                    this.f13187n = true;
                    this.f13186m.add(js0Var);
                }
                if (z) {
                    this.f13188o.f12183i = true;
                }
                zM6189h = m6189h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM6189h) {
            return;
        }
        this.f13182i.m4283e(this.f13181h);
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: l */
    public final fr2 mo425l() {
        return this.f13189p;
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: n */
    public final ht2 mo427n() {
        return this.f13188o;
    }
}
