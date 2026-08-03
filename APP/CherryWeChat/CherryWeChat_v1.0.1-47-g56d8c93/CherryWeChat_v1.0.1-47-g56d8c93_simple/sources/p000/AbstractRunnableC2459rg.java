package p000;

/* JADX INFO: renamed from: rg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2459rg implements Runnable, Comparable, InterfaceC2100je {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f8666a;

    /* JADX INFO: renamed from: b */
    public int f8667b;

    @Override // p000.InterfaceC2100je
    /* JADX INFO: renamed from: a */
    public final void mo1795a() {
        monitor-enter(this);
        Object r0 = this._heap;     // Catch: Throwable -> L10
        C2610v1 r1 = AbstractC0628Oj.f2011e;     // Catch: Throwable -> L10
        if (r0 != r1) goto L7;
        monitor-exit(this);
        return;
    L7:
        C1209bB r3 = null;
        if ((r0 instanceof C2502sg) == false) goto L12;
        C2502sg r02 = (C2502sg) r0;     // Catch: Throwable -> L10
    L13:
        if (r02 == null) goto L26;
        monitor-enter(r02);     // Catch: Throwable -> L10
        Object r2 = this._heap;     // Catch: Throwable -> L23
        if ((r2 instanceof C1209bB) == false) goto L18;
        r3 = (C1209bB) r2;     // Catch: Throwable -> L23
    L18:
        if (r3 == null) goto L21;
        r02.m2331b(this.f8667b);     // Catch: Throwable -> L23
    L21:
        monitor-exit(r02);     // Catch: Throwable -> L10
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L26:
        this._heap = r1;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L12:
        r02 = null;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final int m4950c(long r9, C2502sg r11, AbstractC2545tg r12) {
        monitor-enter(this);
    L22:
        th = move-exception;
        throw th;
    L4:
        if (this._heap != AbstractC0628Oj.f2011e) goto L8;
        monitor-exit(this);
        return 2;
    L8:
        monitor-enter(r11);     // Catch: Throwable -> L22
        AbstractRunnableC2459rg[] r0 = r11.f4140a;     // Catch: Throwable -> L27
        if (r0 == null) goto L12;
        AbstractRunnableC2459rg r02 = r0[0];     // Catch: Throwable -> L27
    L15:
        if (AbstractC2545tg.f8863g.get(r12) != 1) goto L17;
        boolean r122 = true;
    L18:
        if (r122 == false) goto L25;
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 1;
    L25:
        if (r02 != null) goto L29;
        r11.f8789c = r9;     // Catch: Throwable -> L27
    L36:
        long r92 = this.f8666a;     // Catch: Throwable -> L27
        long r4 = r11.f8789c;     // Catch: Throwable -> L27
        if ((r92 - r4) >= 0) goto L39;
        this.f8666a = r4;     // Catch: Throwable -> L27
    L39:
        r11.m2330a(this);     // Catch: Throwable -> L27
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 0;
    L29:
        long r42 = r02.f8666a;     // Catch: Throwable -> L27
        if ((r42 - r9) >= 0) goto L34;
        r9 = r42;
    L34:
        if ((r9 - r11.f8789c) <= 0) goto L36;
        r11.f8789c = r9;     // Catch: Throwable -> L27
        goto L36
    L17:
        r122 = false;
        goto L18
    L12:
        r02 = null;
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        long r0 = this.f8666a - ((AbstractRunnableC2459rg) r5).f8666a;
        if (r0 <= 0) goto L6;
        return 1;
    L6:
        if (r0 >= 0) goto L9;
        return -1;
    L9:
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4951d(C2502sg r3) {
        if (this._heap == AbstractC0628Oj.f2011e) goto L7;
        this._heap = r3;
        return;
    L7:
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8666a + ']';
    }
}
