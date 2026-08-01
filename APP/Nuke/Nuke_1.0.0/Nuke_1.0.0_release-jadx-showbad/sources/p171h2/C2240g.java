package p171h2;

/* JADX INFO: renamed from: h2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2240g implements InterfaceC2237d, InterfaceC2236c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2237d f7344a;

    /* JADX INFO: renamed from: b */
    public final Object f7345b;

    /* JADX INFO: renamed from: c */
    public volatile C2239f f7346c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC2236c f7347d;

    /* JADX INFO: renamed from: e */
    public int f7348e = 3;

    /* JADX INFO: renamed from: f */
    public int f7349f = 3;

    /* JADX INFO: renamed from: g */
    public boolean f7350g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2240g(Object obj, InterfaceC2237d interfaceC2237d) {
        this.f7345b = obj;
        this.f7344a = interfaceC2237d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d, p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: a */
    public final boolean mo4051a() {
        boolean z5;
        synchronized (this.f7345b) {
            try {
                z5 = this.f7347d.mo4051a() || this.f7346c.mo4051a();
            } finally {
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: b */
    public final boolean mo4052b() {
        boolean z5;
        synchronized (this.f7345b) {
            z5 = this.f7348e == 4;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: c */
    public final void mo4053c(InterfaceC2236c interfaceC2236c) {
        synchronized (this.f7345b) {
            try {
                if (interfaceC2236c.equals(this.f7347d)) {
                    this.f7349f = 4;
                    return;
                }
                this.f7348e = 4;
                InterfaceC2237d interfaceC2237d = this.f7344a;
                if (interfaceC2237d != null) {
                    interfaceC2237d.mo4053c(this);
                }
                int i5 = this.f7349f;
                boolean z5 = false;
                if (i5 != 1 && i5 != 2 && i5 != 3) {
                    if (i5 != 4 && i5 != 5) {
                        throw null;
                    }
                    z5 = true;
                }
                if (!z5) {
                    this.f7347d.clear();
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    public final void clear() {
        synchronized (this.f7345b) {
            this.f7350g = false;
            this.f7348e = 3;
            this.f7349f = 3;
            this.f7347d.clear();
            this.f7346c.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: d */
    public final boolean mo4054d(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        synchronized (this.f7345b) {
            try {
                InterfaceC2237d interfaceC2237d = this.f7344a;
                z5 = (interfaceC2237d == null || interfaceC2237d.mo4054d(this)) && (interfaceC2236c.equals(this.f7346c) || this.f7348e != 4);
            } finally {
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: e */
    public final boolean mo4055e() {
        boolean z5;
        synchronized (this.f7345b) {
            z5 = this.f7348e == 3;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: f */
    public final void mo4056f(InterfaceC2236c interfaceC2236c) {
        synchronized (this.f7345b) {
            try {
                if (!interfaceC2236c.equals(this.f7346c)) {
                    this.f7349f = 5;
                    return;
                }
                this.f7348e = 5;
                InterfaceC2237d interfaceC2237d = this.f7344a;
                if (interfaceC2237d != null) {
                    interfaceC2237d.mo4056f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: g */
    public final boolean mo4057g(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        synchronized (this.f7345b) {
            try {
                InterfaceC2237d interfaceC2237d = this.f7344a;
                z5 = (interfaceC2237d == null || interfaceC2237d.mo4057g(this)) && interfaceC2236c.equals(this.f7346c) && this.f7348e != 2;
            } finally {
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    public final InterfaceC2237d getRoot() {
        InterfaceC2237d root;
        synchronized (this.f7345b) {
            try {
                InterfaceC2237d interfaceC2237d = this.f7344a;
                root = interfaceC2237d != null ? interfaceC2237d.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: h */
    public final void mo4058h() {
        synchronized (this.f7345b) {
            try {
                this.f7350g = true;
                try {
                    if (this.f7348e != 4 && this.f7349f != 1) {
                        this.f7349f = 1;
                        this.f7347d.mo4058h();
                    }
                    if (this.f7350g && this.f7348e != 1) {
                        this.f7348e = 1;
                        this.f7346c.mo4058h();
                    }
                    this.f7350g = false;
                } catch (Throwable th) {
                    this.f7350g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: i */
    public final boolean mo4059i(InterfaceC2236c interfaceC2236c) {
        if (!(interfaceC2236c instanceof C2240g)) {
            return false;
        }
        C2240g c2240g = (C2240g) interfaceC2236c;
        if (this.f7346c == null) {
            if (c2240g.f7346c != null) {
                return false;
            }
        } else if (!this.f7346c.mo4059i(c2240g.f7346c)) {
            return false;
        }
        return this.f7347d == null ? c2240g.f7347d == null : this.f7347d.mo4059i(c2240g.f7347d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f7345b) {
            z5 = true;
            if (this.f7348e != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2237d
    /* JADX INFO: renamed from: j */
    public final boolean mo4060j(InterfaceC2236c interfaceC2236c) {
        boolean z5;
        synchronized (this.f7345b) {
            try {
                InterfaceC2237d interfaceC2237d = this.f7344a;
                z5 = (interfaceC2237d == null || interfaceC2237d.mo4060j(this)) && interfaceC2236c.equals(this.f7346c) && !mo4051a();
            } finally {
            }
        }
        return z5;
    }
}
