package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj implements Runnable, Comparable, zg {
    private volatile Object _heap;
    public long a;
    public int b;

    public final int a(long r9, ij r11, jj r12) {
        monitor-enter(this);
    L22:
        th = move-exception;
        throw th;
    L4:
        if (this._heap != ip.d) goto L8;
        monitor-exit(this);
        return 2;
    L8:
        monitor-enter(r11);     // Catch: Throwable -> L22
        hj[] r0 = r11.a;     // Catch: Throwable -> L27
        if (r0 == null) goto L12;
        hj r02 = r0[0];     // Catch: Throwable -> L27
    L15:
        if (jj.h.get(r12) == 0) goto L17;
        boolean r122 = true;
    L18:
        if (r122 == false) goto L25;
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 1;
    L25:
        if (r02 != null) goto L29;
        r11.c = r9;     // Catch: Throwable -> L27
    L36:
        long r92 = this.a;     // Catch: Throwable -> L27
        long r4 = r11.c;     // Catch: Throwable -> L27
        if ((r92 - r4) >= 0) goto L39;
        this.a = r4;     // Catch: Throwable -> L27
    L39:
        r11.a(this);     // Catch: Throwable -> L27
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 0;
    L29:
        long r42 = r02.a;     // Catch: Throwable -> L27
        if ((r42 - r9) >= 0) goto L34;
        r9 = r42;
    L34:
        if ((r9 - r11.c) <= 0) goto L36;
        r11.c = r9;     // Catch: Throwable -> L27
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

    @Override // defpackage.zg
    public final void b() {
        monitor-enter(this);
        Object r0 = this._heap;     // Catch: Throwable -> L10
        l0 r1 = ip.d;     // Catch: Throwable -> L10
        if (r0 != r1) goto L7;
        monitor-exit(this);
        return;
    L7:
        u60 r3 = null;
        if ((r0 instanceof ij) == false) goto L12;
        ij r02 = (ij) r0;     // Catch: Throwable -> L10
    L13:
        if (r02 == null) goto L26;
        monitor-enter(r02);     // Catch: Throwable -> L10
        Object r2 = this._heap;     // Catch: Throwable -> L23
        if ((r2 instanceof u60) == false) goto L18;
        r3 = (u60) r2;     // Catch: Throwable -> L23
    L18:
        if (r3 == null) goto L21;
        r02.b(this.b);     // Catch: Throwable -> L23
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

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        long r0 = this.a - ((hj) r5).a;
        if (r0 <= 0) goto L6;
        return 1;
    L6:
        if (r0 >= 0) goto L9;
        return -1;
    L9:
        return 0;
    }

    public final void d(ij r3) {
        if (this._heap == ip.d) goto L7;
        this._heap = r3;
        return;
    L7:
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
