package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements t82, l82 {
    public final Object a;
    public final t82 b;
    public volatile l82 c;
    public volatile l82 d;
    public int e = 3;
    public int f = 3;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dg0(Object obj, t82 t82Var) {
        this.a = obj;
        this.b = t82Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82, defpackage.l82
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean b(l82 l82Var) {
        if (l82Var instanceof dg0) {
            dg0 dg0Var = (dg0) l82Var;
            if (this.c.b(dg0Var.c) && this.d.b(dg0Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final boolean c(l82 l82Var) {
        boolean z;
        synchronized (this.a) {
            t82 t82Var = this.b;
            z = (t82Var == null || t82Var.c(this)) && l82Var.equals(this.c);
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final boolean d(l82 l82Var) {
        boolean z;
        int i;
        synchronized (this.a) {
            t82 t82Var = this.b;
            z = false;
            if (t82Var == null || t82Var.d(this)) {
                if (this.e != 5 ? l82Var.equals(this.c) : l82Var.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final void e(l82 l82Var) {
        synchronized (this.a) {
            try {
                if (l82Var.equals(this.d)) {
                    this.f = 5;
                    t82 t82Var = this.b;
                    if (t82Var != null) {
                        t82Var.e(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final boolean f(l82 l82Var) {
        boolean z;
        synchronized (this.a) {
            t82 t82Var = this.b;
            z = t82Var == null || t82Var.f(this);
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final void g(l82 l82Var) {
        synchronized (this.a) {
            try {
                if (l82Var.equals(this.c)) {
                    this.e = 4;
                } else if (l82Var.equals(this.d)) {
                    this.f = 4;
                }
                t82 t82Var = this.b;
                if (t82Var != null) {
                    t82Var.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [t82] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.t82
    public final t82 getRoot() {
        ?? root;
        synchronized (this.a) {
            try {
                t82 t82Var = this.b;
                this = this;
                if (t82Var != null) {
                    root = t82Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void i() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } finally {
            }
        }
        return z;
    }
}
