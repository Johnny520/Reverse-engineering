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
    public int f4973e;

    /* JADX INFO: renamed from: f */
    public int f4974f;

    /* JADX INFO: renamed from: g */
    public boolean f4975g;

    public C1401fB(Object r2, InterfaceC1237bw r3) {
        this.f4973e = 3;
        this.f4974f = 3;
        this.f4970b = r2;
        this.f4969a = r3;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: a */
    public final boolean mo2356a(InterfaceC1026Xv r3) {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f4969a;     // Catch: Throwable -> L13
        if (r1 == null) goto L9;
        if (r1.mo2356a(this) == true) goto L9;
    L15:
        boolean r32 = false;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r32;
    L9:
        if (r3.equals(this.f4971c) == false) goto L15;
        if (this.f4973e == 2) goto L15;
        r32 = true;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: b */
    public final boolean mo2357b(InterfaceC1026Xv r3) {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f4969a;     // Catch: Throwable -> L13
        if (r1 == null) goto L9;
        if (r1.mo2357b(this) == true) goto L9;
    L15:
        boolean r32 = false;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r32;
    L9:
        if (r3.equals(this.f4971c) == false) goto L15;
        if (mo1938e() == true) goto L15;
        r32 = true;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: c */
    public final void mo2358c(InterfaceC1026Xv r3) {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f4971c) == true) goto L11;
        this.f4974f = 5;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        this.f4973e = 5;     // Catch: Throwable -> L9
        InterfaceC1237bw r32 = this.f4969a;     // Catch: Throwable -> L9
        if (r32 == null) goto L14;
        r32.mo2358c(this);     // Catch: Throwable -> L9
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        this.f4975g = false;     // Catch: Throwable -> L8
        this.f4973e = 3;     // Catch: Throwable -> L8
        this.f4974f = 3;     // Catch: Throwable -> L8
        this.f4972d.clear();     // Catch: Throwable -> L8
        this.f4971c.clear();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (AbstractC2374ph.m4807d(this.f4974f) == true) goto L10;
        this.f4974f = 2;     // Catch: Throwable -> L7
        this.f4972d.mo1937d();     // Catch: Throwable -> L7
    L10:
        if (AbstractC2374ph.m4807d(this.f4973e) == true) goto L12;
        this.f4973e = 2;     // Catch: Throwable -> L7
        this.f4971c.mo1937d();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // p000.InterfaceC1237bw, p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: e */
    public final boolean mo1938e() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f4972d.mo1938e() == false) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f4971c.mo1938e() == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv r3) {
        if ((r3 instanceof C1401fB) == false) goto L20;
        C1401fB r32 = (C1401fB) r3;
        if (this.f4971c != null) goto L10;
        if (r32.f4971c == null) goto L12;
        return false;
    L12:
        if (this.f4972d != null) goto L17;
        if (r32.f4972d != null) goto L25;
        return true;
    L25:
        return false;
    L17:
        if (this.f4972d.mo1939f(r32.f4972d) == false) goto L26;
        return true;
    L26:
        return false;
    L10:
        if (this.f4971c.mo1939f(r32.f4971c) == true) goto L12;
        return false;
    L20:
        return false;
    }

    @Override // p000.InterfaceC1237bw
    /* JADX INFO: renamed from: g */
    public final boolean mo2359g(InterfaceC1026Xv r3) {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f4969a;     // Catch: Throwable -> L14
        if (r1 == null) goto L9;
        if (r1.mo2359g(this) == true) goto L9;
    L13:
        boolean r32 = false;
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r32;
    L9:
        if (r3.equals(this.f4971c) == false) goto L11;
    L16:
        r32 = true;
        goto L17
    L11:
        if (this.f4973e == 4) goto L13;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1237bw
    public final InterfaceC1237bw getRoot() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        InterfaceC1237bw r1 = this.f4969a;     // Catch: Throwable -> L7
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
    public final void mo2360h(InterfaceC1026Xv r3) {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f4972d) == false) goto L11;
        this.f4974f = 4;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        this.f4973e = 4;     // Catch: Throwable -> L9
        InterfaceC1237bw r32 = this.f4969a;     // Catch: Throwable -> L9
        if (r32 == null) goto L15;
        r32.mo2360h(this);     // Catch: Throwable -> L9
    L15:
        if (AbstractC2374ph.m4807d(this.f4974f) == true) goto L17;
        this.f4972d.clear();     // Catch: Throwable -> L9
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: i */
    public final boolean mo1940i() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f4973e != 3) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.f4973e == 1) goto L8;
        r2 = false;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
        this.f4975g = true;     // Catch: Throwable -> L22
    L12:
        th = move-exception;
        this.f4975g = false;     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L8:
        if (this.f4973e == 4) goto L15;
        if (this.f4974f == 1) goto L15;
        this.f4974f = 1;     // Catch: Throwable -> L12
        this.f4972d.mo1941j();     // Catch: Throwable -> L12
    L15:
        if (this.f4975g == true) goto L17;
    L19:
        this.f4975g = false;     // Catch: Throwable -> L22
        monitor-exit(r0);     // Catch: Throwable -> L22
        return;
    L17:
        if (this.f4973e == 1) goto L19;
        this.f4973e = 1;     // Catch: Throwable -> L12
        this.f4971c.mo1941j();     // Catch: Throwable -> L12
    L22:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        Object r0 = this.f4970b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f4973e != 4) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }
}
