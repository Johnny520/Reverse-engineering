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
    public int f8356e;

    /* JADX INFO: renamed from: f */
    public int f8357f;

    public C2373pg(Object r2, InterfaceC1237bw r3) {
        this.f8356e = 3;
        this.f8357f = 3;
        this.f8352a = r2;
        this.f8353b = r3;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: a */
    public final boolean mo2356a(InterfaceC1026Xv r3) {
        Object r0 = this.f8352a;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f8353b;     // Catch: Throwable -> L14
        if (r1 == null) goto L9;
        if (r1.mo2356a(this) == true) goto L9;
    L11:
        boolean r32 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r32;
    L9:
        if (r3.equals(this.f8354c) == false) goto L11;
        r32 = true;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: b */
    public final boolean mo2357b(InterfaceC1026Xv r6) {
        Object r0 = this.f8352a;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f8353b;     // Catch: Throwable -> L22
        boolean r2 = false;
        if (r1 == null) goto L9;
        if (r1.mo2357b(this) == true) goto L9;
    L20:
        monitor-exit(r0);     // Catch: Throwable -> L22
        return r2;
    L9:
        if (this.f8356e == 5) goto L12;
        boolean r62 = r6.equals(this.f8354c);     // Catch: Throwable -> L22
    L18:
        if (r62 == false) goto L20;
        r2 = true;
        goto L20
    L12:
        if (r6.equals(this.f8355d) == false) goto L17;
        int r63 = this.f8357f;     // Catch: Throwable -> L22
        if (r63 == 4) goto L16;
        if (r63 != 5) goto L17;
    L16:
        r62 = true;
    L17:
        r62 = false;
    L22:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: c */
    public final void mo2358c(InterfaceC1026Xv r3) {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f8355d) == true) goto L13;
        this.f8356e = 5;     // Catch: Throwable -> L9
        if (this.f8357f == 1) goto L11;
        this.f8357f = 1;     // Catch: Throwable -> L9
        this.f8355d.mo1941j();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L13:
        this.f8357f = 5;     // Catch: Throwable -> L9
        InterfaceC1237bw r32 = this.f8353b;     // Catch: Throwable -> L9
        if (r32 == null) goto L16;
        r32.mo2358c(this);     // Catch: Throwable -> L9
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
        this.f8356e = 3;     // Catch: Throwable -> L8
        this.f8354c.clear();     // Catch: Throwable -> L8
        if (this.f8357f == 3) goto L10;
        this.f8357f = 3;     // Catch: Throwable -> L8
        this.f8355d.clear();     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f8356e != 1) goto L10;
        this.f8356e = 2;     // Catch: Throwable -> L7
        this.f8354c.mo1937d();     // Catch: Throwable -> L7
    L10:
        if (this.f8357f != 1) goto L12;
        this.f8357f = 2;     // Catch: Throwable -> L7
        this.f8355d.mo1937d();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // p000.InterfaceC1237bw, p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: e */
    public final boolean mo1938e() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8354c.mo1938e() == false) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f8355d.mo1938e() == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv r4) {
        if ((r4 instanceof C2373pg) == false) goto L10;
        C2373pg r42 = (C2373pg) r4;
        if (this.f8354c.mo1939f(r42.f8354c) == false) goto L10;
        if (this.f8355d.mo1939f(r42.f8355d) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: g */
    public final boolean mo2359g(InterfaceC1026Xv r2) {
        Object r22 = this.f8352a;
        monitor-enter(r22);
        InterfaceC1237bw r0 = this.f8353b;     // Catch: Throwable -> L13
        if (r0 != null) goto L7;
    L10:
        boolean r02 = true;
    L11:
        monitor-exit(r22);     // Catch: Throwable -> L13
        return r02;
    L7:
        if (r0.mo2359g(this) == true) goto L10;
        r02 = false;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    public final InterfaceC1237bw getRoot() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f8353b;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        InterfaceC1237bw r12 = r1.getRoot();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r12;
    L9:
        r12 = this;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: h */
    public final void mo2360h(InterfaceC1026Xv r4) {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r4.equals(this.f8354c) == false) goto L10;
        this.f8356e = 4;     // Catch: Throwable -> L7
    L12:
        InterfaceC1237bw r42 = this.f8353b;     // Catch: Throwable -> L7
        if (r42 == null) goto L15;
        r42.mo2360h(this);     // Catch: Throwable -> L7
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L10:
        if (r4.equals(this.f8355d) == false) goto L12;
        this.f8357f = 4;     // Catch: Throwable -> L7
        goto L12
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: i */
    public final boolean mo1940i() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f8356e == 3) goto L7;
    L11:
        boolean r1 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L7:
        if (this.f8357f != 3) goto L11;
        r1 = true;
        goto L12
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.f8356e != 1) goto L7;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        if (this.f8357f == 1) goto L12;
        r2 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f8356e == 1) goto L9;
        this.f8356e = 1;     // Catch: Throwable -> L7
        this.f8354c.mo1941j();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        Object r0 = this.f8352a;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8356e != 4) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f8357f == 4) goto L12;
        r1 = false;
        goto L13
    }
}
