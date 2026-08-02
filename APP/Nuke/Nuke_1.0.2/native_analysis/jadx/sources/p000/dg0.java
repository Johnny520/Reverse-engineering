package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements t82, l82 {

    /* JADX INFO: renamed from: a */
    public final Object f2041a;

    /* JADX INFO: renamed from: b */
    public final t82 f2042b;

    /* JADX INFO: renamed from: c */
    public volatile l82 f2043c;

    /* JADX INFO: renamed from: d */
    public volatile l82 f2044d;

    /* JADX INFO: renamed from: e */
    public int f2045e = 3;

    /* JADX INFO: renamed from: f */
    public int f2046f = 3;

    public dg0(Object obj, t82 t82Var) {
        this.f2041a = obj;
        this.f2042b = t82Var;
    }

    @Override // p000.t82, p000.l82
    /* JADX INFO: renamed from: a */
    public final boolean mo1018a() {
        boolean z;
        synchronized (this.f2041a) {
            try {
                z = this.f2043c.mo1018a() || this.f2044d.mo1018a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: b */
    public final boolean mo1019b(l82 l82Var) {
        if (l82Var instanceof dg0) {
            dg0 dg0Var = (dg0) l82Var;
            if (this.f2043c.mo1019b(dg0Var.f2043c) && this.f2044d.mo1019b(dg0Var.f2044d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(l82 l82Var) {
        boolean z;
        synchronized (this.f2041a) {
            t82 t82Var = this.f2042b;
            z = (t82Var == null || t82Var.mo1020c(this)) && l82Var.equals(this.f2043c);
        }
        return z;
    }

    @Override // p000.l82
    public final void clear() {
        synchronized (this.f2041a) {
            try {
                this.f2045e = 3;
                this.f2043c.clear();
                if (this.f2046f != 3) {
                    this.f2046f = 3;
                    this.f2044d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: d */
    public final boolean mo1021d(l82 l82Var) {
        boolean z;
        int i;
        synchronized (this.f2041a) {
            t82 t82Var = this.f2042b;
            z = false;
            if (t82Var == null || t82Var.mo1021d(this)) {
                if (this.f2045e != 5 ? l82Var.equals(this.f2043c) : l82Var.equals(this.f2044d) && ((i = this.f2046f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: e */
    public final void mo1022e(l82 l82Var) {
        synchronized (this.f2041a) {
            try {
                if (l82Var.equals(this.f2044d)) {
                    this.f2046f = 5;
                    t82 t82Var = this.f2042b;
                    if (t82Var != null) {
                        t82Var.mo1022e(this);
                    }
                    return;
                }
                this.f2045e = 5;
                if (this.f2046f != 1) {
                    this.f2046f = 1;
                    this.f2044d.mo1026i();
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
        synchronized (this.f2041a) {
            t82 t82Var = this.f2042b;
            z = t82Var == null || t82Var.mo1023f(this);
        }
        return z;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: g */
    public final void mo1024g(l82 l82Var) {
        synchronized (this.f2041a) {
            try {
                if (l82Var.equals(this.f2043c)) {
                    this.f2045e = 4;
                } else if (l82Var.equals(this.f2044d)) {
                    this.f2046f = 4;
                }
                t82 t82Var = this.f2042b;
                if (t82Var != null) {
                    t82Var.mo1024g(this);
                }
            } catch (Throwable th) {
                throw th;
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
        synchronized (this.f2041a) {
            try {
                t82 t82Var = this.f2042b;
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
        synchronized (this.f2041a) {
            try {
                z = this.f2045e == 3 && this.f2046f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: i */
    public final void mo1026i() {
        synchronized (this.f2041a) {
            try {
                if (this.f2045e != 1) {
                    this.f2045e = 1;
                    this.f2043c.mo1026i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f2041a) {
            try {
                z = true;
                if (this.f2045e != 1 && this.f2046f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: j */
    public final boolean mo1027j() {
        boolean z;
        synchronized (this.f2041a) {
            try {
                z = this.f2045e == 4 || this.f2046f == 4;
            } finally {
            }
        }
        return z;
    }
}
