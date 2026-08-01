package p171h2;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2235b implements InterfaceC2237d, InterfaceC2236c {

    /* JADX INFO: renamed from: a */
    public final Object f7310a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2237d f7311b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC2236c f7312c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC2236c f7313d;

    /* JADX INFO: renamed from: e */
    public int f7314e = 3;

    /* JADX INFO: renamed from: f */
    public int f7315f = 3;

    public C2235b(Object obj, InterfaceC2237d interfaceC2237d) {
        this.f7310a = obj;
        this.f7311b = interfaceC2237d;
    }

    @Override // p171h2.InterfaceC2237d, p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: a */
    public final boolean mo4051a() {
        boolean z5;
        synchronized (this.f7310a) {
            try {
                z5 = this.f7312c.mo4051a() || this.f7313d.mo4051a();
            } finally {
            }
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: b */
    public final boolean mo4052b() {
        boolean z5;
        synchronized (this.f7310a) {
            try {
                z5 = this.f7314e == 4 || this.f7315f == 4;
            } finally {
            }
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: c */
    public final void mo4053c(InterfaceC2236c interfaceC2236c) {
        synchronized (this.f7310a) {
            try {
                if (interfaceC2236c.equals(this.f7312c)) {
                    this.f7314e = 4;
                } else if (interfaceC2236c.equals(this.f7313d)) {
                    this.f7315f = 4;
                }
                InterfaceC2237d interfaceC2237d = this.f7311b;
                if (interfaceC2237d != null) {
                    interfaceC2237d.mo4053c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p171h2.InterfaceC2236c
    public final void clear() {
        synchronized (this.f7310a) {
            try {
                this.f7314e = 3;
                this.f7312c.clear();
                if (this.f7315f != 3) {
                    this.f7315f = 3;
                    this.f7313d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: d */
    public final boolean mo4054d(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        synchronized (this.f7310a) {
            InterfaceC2237d interfaceC2237d = this.f7311b;
            z5 = interfaceC2237d == null || interfaceC2237d.mo4054d(this);
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: e */
    public final boolean mo4055e() {
        boolean z5;
        synchronized (this.f7310a) {
            try {
                z5 = this.f7314e == 3 && this.f7315f == 3;
            } finally {
            }
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: f */
    public final void mo4056f(InterfaceC2236c interfaceC2236c) {
        synchronized (this.f7310a) {
            try {
                if (interfaceC2236c.equals(this.f7313d)) {
                    this.f7315f = 5;
                    InterfaceC2237d interfaceC2237d = this.f7311b;
                    if (interfaceC2237d != null) {
                        interfaceC2237d.mo4056f(this);
                    }
                    return;
                }
                this.f7314e = 5;
                if (this.f7315f != 1) {
                    this.f7315f = 1;
                    this.f7313d.mo4058h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: g */
    public final boolean mo4057g(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        synchronized (this.f7310a) {
            InterfaceC2237d interfaceC2237d = this.f7311b;
            z5 = (interfaceC2237d == null || interfaceC2237d.mo4057g(this)) && interfaceC2236c.equals(this.f7312c);
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2237d
    public final InterfaceC2237d getRoot() {
        InterfaceC2237d root;
        synchronized (this.f7310a) {
            try {
                InterfaceC2237d interfaceC2237d = this.f7311b;
                root = interfaceC2237d != null ? interfaceC2237d.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: h */
    public final void mo4058h() {
        synchronized (this.f7310a) {
            try {
                if (this.f7314e != 1) {
                    this.f7314e = 1;
                    this.f7312c.mo4058h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: i */
    public final boolean mo4059i(InterfaceC2236c interfaceC2236c) {
        if (interfaceC2236c instanceof C2235b) {
            C2235b c2235b = (C2235b) interfaceC2236c;
            if (this.f7312c.mo4059i(c2235b.f7312c) && this.f7313d.mo4059i(c2235b.f7313d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p171h2.InterfaceC2236c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f7310a) {
            try {
                z5 = true;
                if (this.f7314e != 1 && this.f7315f != 1) {
                    z5 = false;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: j */
    public final boolean mo4060j(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        int i5;
        synchronized (this.f7310a) {
            InterfaceC2237d interfaceC2237d = this.f7311b;
            z5 = false;
            if (interfaceC2237d == null || interfaceC2237d.mo4060j(this)) {
                if (this.f7314e != 5 ? interfaceC2236c.equals(this.f7312c) : interfaceC2236c.equals(this.f7313d) && ((i5 = this.f7315f) == 4 || i5 == 5)) {
                    z5 = true;
                }
            }
        }
        return z5;
    }
}
