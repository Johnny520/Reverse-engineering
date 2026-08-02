package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m23 implements t82, l82 {
    public final t82 a;
    public final Object b;
    public volatile yq2 c;
    public volatile l82 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m23(Object obj, t82 t82Var) {
        this.b = obj;
        this.a = t82Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82, defpackage.l82
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean b(l82 l82Var) {
        if (!(l82Var instanceof m23)) {
            return false;
        }
        m23 m23Var = (m23) l82Var;
        if (this.c == null) {
            if (m23Var.c != null) {
                return false;
            }
        } else if (!this.c.b(m23Var.c)) {
            return false;
        }
        return this.d == null ? m23Var.d == null : this.d.b(m23Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final boolean c(l82 l82Var) {
        boolean z;
        synchronized (this.b) {
            try {
                t82 t82Var = this.a;
                z = (t82Var == null || t82Var.c(this)) && l82Var.equals(this.c) && this.e != 2;
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final boolean d(l82 l82Var) {
        boolean z;
        synchronized (this.b) {
            try {
                t82 t82Var = this.a;
                z = (t82Var == null || t82Var.d(this)) && l82Var.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final void e(l82 l82Var) {
        synchronized (this.b) {
            try {
                if (!l82Var.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                t82 t82Var = this.a;
                if (t82Var != null) {
                    t82Var.e(this);
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
        synchronized (this.b) {
            try {
                t82 t82Var = this.a;
                z = (t82Var == null || t82Var.f(this)) && (l82Var.equals(this.c) || this.e != 4);
            } finally {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t82
    public final void g(l82 l82Var) {
        synchronized (this.b) {
            try {
                if (l82Var.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                t82 t82Var = this.a;
                if (t82Var != null) {
                    t82Var.g(this);
                }
                int i = this.f;
                boolean z = false;
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4 && i != 5) {
                        throw null;
                    }
                    z = true;
                }
                if (!z) {
                    this.d.clear();
                }
            } finally {
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
        synchronized (this.b) {
            try {
                t82 t82Var = this.a;
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
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void i() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.i();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.i();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }
}
