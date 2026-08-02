package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 implements ys2 {
    public final int h;
    public final qv0 i;
    public final sd3 j;
    public long k;
    public long l;
    public final ArrayDeque m;
    public boolean n;
    public final vv0 o;
    public final uv0 p;
    public final wv0 q;
    public final wv0 r;
    public cg0 s;
    public IOException t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xv0(int i, qv0 qv0Var, boolean z, boolean z2, js0 js0Var) {
        qv0Var.getClass();
        this.h = i;
        this.i = qv0Var;
        this.j = new sd3(i);
        this.l = qv0Var.y.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.m = arrayDeque;
        this.o = new vv0(this, qv0Var.x.a(), z2);
        this.p = new uv0(this, z);
        this.q = new wv0(this);
        this.r = new wv0(this);
        if (js0Var == null) {
            if (g()) {
                return;
            }
            s.l("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            s.l("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(js0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        boolean zH;
        TimeZone timeZone = wg3.a;
        synchronized (this) {
            try {
                vv0 vv0Var = this.o;
                if (vv0Var.i || !vv0Var.l) {
                    z = false;
                } else {
                    uv0 uv0Var = this.p;
                    if (uv0Var.h || uv0Var.j) {
                        z = true;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(cg0.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.i.e(this.h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() throws IOException {
        uv0 uv0Var = this.p;
        if (uv0Var.j) {
            c80.v("stream closed");
            return;
        }
        if (uv0Var.h) {
            c80.v("stream finished");
            return;
        }
        if (f() != null) {
            IOException iOException = this.t;
            if (iOException != null) {
                throw iOException;
            }
            cg0 cg0VarF = f();
            cg0VarF.getClass();
            throw new av2(cg0VarF);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(cg0 cg0Var, IOException iOException) {
        if (d(cg0Var, iOException)) {
            qv0 qv0Var = this.i;
            qv0Var.getClass();
            qv0Var.D.k(this.h, cg0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(cg0 cg0Var, IOException iOException) {
        TimeZone timeZone = wg3.a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.s = cg0Var;
            this.t = iOException;
            notifyAll();
            if (this.o.i) {
                if (this.p.h) {
                    return false;
                }
            }
            this.i.e(this.h);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(cg0 cg0Var) {
        if (d(cg0Var, null)) {
            this.i.k(this.h, cg0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cg0 f() {
        cg0 cg0Var;
        synchronized (this) {
            cg0Var = this.s;
        }
        return cg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        boolean z = (this.h & 1) == 1;
        this.i.getClass();
        return true == z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                vv0 vv0Var = this.o;
                if (vv0Var.i || vv0Var.l) {
                    uv0 uv0Var = this.p;
                    if (uv0Var.h || uv0Var.j) {
                        if (this.n) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(js0 js0Var, boolean z) {
        boolean zH;
        js0Var.getClass();
        TimeZone timeZone = wg3.a;
        synchronized (this) {
            try {
                if (this.n && js0Var.a(":status") == null && js0Var.a(":method") == null) {
                    this.o.getClass();
                } else {
                    this.n = true;
                    this.m.add(js0Var);
                }
                if (z) {
                    this.o.i = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.i.e(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public final fr2 l() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public final ht2 n() {
        return this.o;
    }
}
