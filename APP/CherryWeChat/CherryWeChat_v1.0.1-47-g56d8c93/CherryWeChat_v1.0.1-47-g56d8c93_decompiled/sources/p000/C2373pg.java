package p000;

/* JADX INFO: renamed from: pg */
/* JADX INFO: loaded from: classes.dex */
public final class C2373pg implements InterfaceC1237bw, InterfaceC1026Xv {

    /* JADX INFO: renamed from: a */
    public final Object f8352a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1237bw f8353b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC1026Xv f8354c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC1026Xv f8355d;

    /* JADX INFO: renamed from: e */
    public int f8356e = 3;

    /* JADX INFO: renamed from: f */
    public int f8357f = 3;

    public C2373pg(Object obj, InterfaceC1237bw interfaceC1237bw) {
        this.f8352a = obj;
        this.f8353b = interfaceC1237bw;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: a */
    public final boolean mo2356a(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        synchronized (this.f8352a) {
            InterfaceC1237bw interfaceC1237bw = this.f8353b;
            z = (interfaceC1237bw == null || interfaceC1237bw.mo2356a(this)) && interfaceC1026Xv.equals(this.f8354c);
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: b */
    public final boolean mo2357b(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        int i;
        synchronized (this.f8352a) {
            InterfaceC1237bw interfaceC1237bw = this.f8353b;
            z = false;
            if (interfaceC1237bw == null || interfaceC1237bw.mo2357b(this)) {
                if (this.f8356e != 5 ? interfaceC1026Xv.equals(this.f8354c) : interfaceC1026Xv.equals(this.f8355d) && ((i = this.f8357f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: c */
    public final void mo2358c(InterfaceC1026Xv interfaceC1026Xv) {
        synchronized (this.f8352a) {
            try {
                if (interfaceC1026Xv.equals(this.f8355d)) {
                    this.f8357f = 5;
                    InterfaceC1237bw interfaceC1237bw = this.f8353b;
                    if (interfaceC1237bw != null) {
                        interfaceC1237bw.mo2358c(this);
                    }
                    return;
                }
                this.f8356e = 5;
                if (this.f8357f != 1) {
                    this.f8357f = 1;
                    this.f8355d.mo1941j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        synchronized (this.f8352a) {
            try {
                this.f8356e = 3;
                this.f8354c.clear();
                if (this.f8357f != 3) {
                    this.f8357f = 3;
                    this.f8355d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        synchronized (this.f8352a) {
            try {
                if (this.f8356e == 1) {
                    this.f8356e = 2;
                    this.f8354c.mo1937d();
                }
                if (this.f8357f == 1) {
                    this.f8357f = 2;
                    this.f8355d.mo1937d();
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
        synchronized (this.f8352a) {
            try {
                z = this.f8354c.mo1938e() || this.f8355d.mo1938e();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv interfaceC1026Xv) {
        if (interfaceC1026Xv instanceof C2373pg) {
            C2373pg c2373pg = (C2373pg) interfaceC1026Xv;
            if (this.f8354c.mo1939f(c2373pg.f8354c) && this.f8355d.mo1939f(c2373pg.f8355d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: g */
    public final boolean mo2359g(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z;
        synchronized (this.f8352a) {
            InterfaceC1237bw interfaceC1237bw = this.f8353b;
            z = interfaceC1237bw == null || interfaceC1237bw.mo2359g(this);
        }
        return z;
    }

    @Override // p000.InterfaceC1237bw
    public final InterfaceC1237bw getRoot() {
        InterfaceC1237bw root;
        synchronized (this.f8352a) {
            try {
                InterfaceC1237bw interfaceC1237bw = this.f8353b;
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
        synchronized (this.f8352a) {
            try {
                if (interfaceC1026Xv.equals(this.f8354c)) {
                    this.f8356e = 4;
                } else if (interfaceC1026Xv.equals(this.f8355d)) {
                    this.f8357f = 4;
                }
                InterfaceC1237bw interfaceC1237bw = this.f8353b;
                if (interfaceC1237bw != null) {
                    interfaceC1237bw.mo2360h(this);
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
        synchronized (this.f8352a) {
            try {
                z = this.f8356e == 3 && this.f8357f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f8352a) {
            try {
                z = true;
                if (this.f8356e != 1 && this.f8357f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        synchronized (this.f8352a) {
            try {
                if (this.f8356e != 1) {
                    this.f8356e = 1;
                    this.f8354c.mo1941j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        boolean z;
        synchronized (this.f8352a) {
            try {
                z = this.f8356e == 4 || this.f8357f == 4;
            } finally {
            }
        }
        return z;
    }
}
