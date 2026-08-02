package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m23 implements t82, l82 {

    /* JADX INFO: renamed from: a */
    public final t82 f6448a;

    /* JADX INFO: renamed from: b */
    public final Object f6449b;

    /* JADX INFO: renamed from: c */
    public volatile yq2 f6450c;

    /* JADX INFO: renamed from: d */
    public volatile l82 f6451d;

    /* JADX INFO: renamed from: e */
    public int f6452e = 3;

    /* JADX INFO: renamed from: f */
    public int f6453f = 3;

    /* JADX INFO: renamed from: g */
    public boolean f6454g;

    public m23(Object obj, t82 t82Var) {
        this.f6449b = obj;
        this.f6448a = t82Var;
    }

    @Override // p000.t82, p000.l82
    /* JADX INFO: renamed from: a */
    public final boolean mo1018a() {
        boolean z;
        synchronized (this.f6449b) {
            try {
                z = this.f6451d.mo1018a() || this.f6450c.mo1018a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: b */
    public final boolean mo1019b(l82 l82Var) {
        if (!(l82Var instanceof m23)) {
            return false;
        }
        m23 m23Var = (m23) l82Var;
        if (this.f6450c == null) {
            if (m23Var.f6450c != null) {
                return false;
            }
        } else if (!this.f6450c.mo1019b(m23Var.f6450c)) {
            return false;
        }
        return this.f6451d == null ? m23Var.f6451d == null : this.f6451d.mo1019b(m23Var.f6451d);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(l82 l82Var) {
        boolean z;
        synchronized (this.f6449b) {
            try {
                t82 t82Var = this.f6448a;
                z = (t82Var == null || t82Var.mo1020c(this)) && l82Var.equals(this.f6450c) && this.f6452e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.l82
    public final void clear() {
        synchronized (this.f6449b) {
            this.f6454g = false;
            this.f6452e = 3;
            this.f6453f = 3;
            this.f6451d.clear();
            this.f6450c.clear();
        }
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: d */
    public final boolean mo1021d(l82 l82Var) {
        boolean z;
        synchronized (this.f6449b) {
            try {
                t82 t82Var = this.f6448a;
                z = (t82Var == null || t82Var.mo1021d(this)) && l82Var.equals(this.f6450c) && !mo1018a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: e */
    public final void mo1022e(l82 l82Var) {
        synchronized (this.f6449b) {
            try {
                if (!l82Var.equals(this.f6450c)) {
                    this.f6453f = 5;
                    return;
                }
                this.f6452e = 5;
                t82 t82Var = this.f6448a;
                if (t82Var != null) {
                    t82Var.mo1022e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: f */
    public final boolean mo1023f(l82 l82Var) {
        boolean z;
        synchronized (this.f6449b) {
            try {
                t82 t82Var = this.f6448a;
                z = (t82Var == null || t82Var.mo1023f(this)) && (l82Var.equals(this.f6450c) || this.f6452e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: g */
    public final void mo1024g(l82 l82Var) {
        synchronized (this.f6449b) {
            try {
                if (l82Var.equals(this.f6451d)) {
                    this.f6453f = 4;
                    return;
                }
                this.f6452e = 4;
                t82 t82Var = this.f6448a;
                if (t82Var != null) {
                    t82Var.mo1024g(this);
                }
                int i = this.f6453f;
                boolean z = false;
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4 && i != 5) {
                        throw null;
                    }
                    z = true;
                }
                if (!z) {
                    this.f6451d.clear();
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [t82] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.t82
    public final t82 getRoot() {
        ?? root;
        synchronized (this.f6449b) {
            try {
                t82 t82Var = this.f6448a;
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

    @Override // p000.l82
    /* JADX INFO: renamed from: h */
    public final boolean mo1025h() {
        boolean z;
        synchronized (this.f6449b) {
            z = this.f6452e == 3;
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: i */
    public final void mo1026i() {
        synchronized (this.f6449b) {
            try {
                this.f6454g = true;
                try {
                    if (this.f6452e != 4 && this.f6453f != 1) {
                        this.f6453f = 1;
                        this.f6451d.mo1026i();
                    }
                    if (this.f6454g && this.f6452e != 1) {
                        this.f6452e = 1;
                        this.f6450c.mo1026i();
                    }
                    this.f6454g = false;
                } catch (Throwable th) {
                    this.f6454g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f6449b) {
            z = true;
            if (this.f6452e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: j */
    public final boolean mo1027j() {
        boolean z;
        synchronized (this.f6449b) {
            z = this.f6452e == 4;
        }
        return z;
    }
}
