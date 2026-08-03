package p000;

/* JADX INFO: renamed from: fB */
/* JADX INFO: loaded from: classes.dex */
public final class C1401fB implements InterfaceC1237bw, InterfaceC1026Xv {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1237bw f4969a;

    /* JADX INFO: renamed from: b */
    public final Object f4970b;

    /* JADX INFO: renamed from: c */
    public volatile C2563ty f4971c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC1026Xv f4972d;

    /* JADX INFO: renamed from: e */
    public int f4973e = 3;

    /* JADX INFO: renamed from: f */
    public int f4974f = 3;

    /* JADX INFO: renamed from: g */
    public boolean f4975g;

    public C1401fB(Object obj, InterfaceC1237bw interfaceC1237bw) {
        this.f4970b = obj;
        this.f4969a = interfaceC1237bw;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: a */
    public final boolean mo2356a(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        synchronized (this.f4970b) {
            try {
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                z = (interfaceC1237bw == null || interfaceC1237bw.mo2356a(this)) && interfaceC1026Xv.equals(this.f4971c) && this.f4973e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: b */
    public final boolean mo2357b(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        synchronized (this.f4970b) {
            try {
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                z = (interfaceC1237bw == null || interfaceC1237bw.mo2357b(this)) && interfaceC1026Xv.equals(this.f4971c) && !mo1938e();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: c */
    public final void mo2358c(InterfaceC1026Xv interfaceC1026Xv) {
        synchronized (this.f4970b) {
            try {
                if (!interfaceC1026Xv.equals(this.f4971c)) {
                    this.f4974f = 5;
                    return;
                }
                this.f4973e = 5;
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                if (interfaceC1237bw != null) {
                    interfaceC1237bw.mo2358c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        synchronized (this.f4970b) {
            this.f4975g = false;
            this.f4973e = 3;
            this.f4974f = 3;
            this.f4972d.clear();
            this.f4971c.clear();
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        synchronized (this.f4970b) {
            try {
                if (!AbstractC2374ph.m4807d(this.f4974f)) {
                    this.f4974f = 2;
                    this.f4972d.mo1937d();
                }
                if (!AbstractC2374ph.m4807d(this.f4973e)) {
                    this.f4973e = 2;
                    this.f4971c.mo1937d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1237bw, p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: e */
    public final boolean mo1938e() {
        boolean z;
        synchronized (this.f4970b) {
            try {
                z = this.f4972d.mo1938e() || this.f4971c.mo1938e();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv interfaceC1026Xv) {
        if (!(interfaceC1026Xv instanceof C1401fB)) {
            return false;
        }
        C1401fB c1401fB = (C1401fB) interfaceC1026Xv;
        if (this.f4971c == null) {
            if (c1401fB.f4971c != null) {
                return false;
            }
        } else if (!this.f4971c.mo1939f(c1401fB.f4971c)) {
            return false;
        }
        return this.f4972d == null ? c1401fB.f4972d == null : this.f4972d.mo1939f(c1401fB.f4972d);
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: g */
    public final boolean mo2359g(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        synchronized (this.f4970b) {
            try {
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                z = (interfaceC1237bw == null || interfaceC1237bw.mo2359g(this)) && (interfaceC1026Xv.equals(this.f4971c) || this.f4973e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    public final InterfaceC1237bw getRoot() {
        InterfaceC1237bw root;
        synchronized (this.f4970b) {
            try {
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                root = interfaceC1237bw != null ? interfaceC1237bw.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: h */
    public final void mo2360h(InterfaceC1026Xv interfaceC1026Xv) {
        synchronized (this.f4970b) {
            try {
                if (interfaceC1026Xv.equals(this.f4972d)) {
                    this.f4974f = 4;
                    return;
                }
                this.f4973e = 4;
                InterfaceC1237bw interfaceC1237bw = this.f4969a;
                if (interfaceC1237bw != null) {
                    interfaceC1237bw.mo2360h(this);
                }
                if (!AbstractC2374ph.m4807d(this.f4974f)) {
                    this.f4972d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: i */
    public final boolean mo1940i() {
        boolean z;
        synchronized (this.f4970b) {
            z = this.f4973e == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f4970b) {
            z = true;
            if (this.f4973e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        synchronized (this.f4970b) {
            try {
                this.f4975g = true;
                try {
                    if (this.f4973e != 4 && this.f4974f != 1) {
                        this.f4974f = 1;
                        this.f4972d.mo1941j();
                    }
                    if (this.f4975g && this.f4973e != 1) {
                        this.f4973e = 1;
                        this.f4971c.mo1941j();
                    }
                    this.f4975g = false;
                } catch (Throwable th) {
                    this.f4975g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        boolean z;
        synchronized (this.f4970b) {
            z = this.f4973e == 4;
        }
        return z;
    }
}
