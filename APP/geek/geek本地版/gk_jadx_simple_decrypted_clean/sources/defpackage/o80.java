package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o80 extends w10 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public o80(ge r3, m50 r4) {
        p80 r0 = p80.a;
        if (r3.b(r0) != null) goto L5;
        ge r02 = r3.i(r0);
    L6:
        super(r02, r4);
        this.e = new ThreadLocal();
        ge r42 = r4.b;
        ip.l(r42);
        if ((r42.b(vh.b) instanceof ke) == true) goto L10;
        Object r43 = ff.V(r3, null);
        ff.L(r3, r43);
        L(r3, r43);
        return;
    L10:
        return;
    L5:
        r02 = r3;
        goto L6
    }

    public final boolean K() {
        if (this.threadLocalIsSet == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.e.remove();
        return !r0;
    L5:
        if (this.e.get() != null) goto L7;
        r0 = true;
        goto L8
    }

    public final void L(ge r3, Object r4) {
        this.threadLocalIsSet = true;
        this.e.set(new kx(r3, r4));
    }

    @Override // defpackage.w10, defpackage.wp
    public final void l(Object r6) {
        if (this.threadLocalIsSet == false) goto L8;
        kx r0 = (kx) this.e.get();
        if (r0 == null) goto L7;
        ff.L((ge) r0.a, r0.b);
    L7:
        this.e.remove();
    L8:
        Object r62 = a80.A(r6);
        m50 r02 = this.d;
        ge r1 = r02.b;
        ip.l(r1);
        o80 r2 = null;
        Object r3 = ff.V(r1, null);
        if (r3 == ff.x) goto L25;
        r2 = ip.b0(r02, r1, r3);
    L25:
        this.d.f(r62);     // Catch: Throwable -> L19
        if (r2 != null) goto L14;
    L17:
        ff.L(r1, r3);
        return;
    L14:
        if (r2.K() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r2 != null) goto L22;
    L23:
        ff.L(r1, r3);
    L24:
        throw th;
    L22:
        if (r2.K() == false) goto L24;
        goto L23
    }
}
