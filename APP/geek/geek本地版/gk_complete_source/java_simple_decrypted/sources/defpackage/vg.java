package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class vg extends u50 {
    public int c;

    public vg(int r4) {
        super(0, x50.g);
        this.c = r4;
    }

    public abstract void a(Object r1, CancellationException r2);

    public abstract ld b();

    public Throwable e(Object r3) {
        if ((r3 instanceof nb) == false) goto L5;
        nb r32 = (nb) r3;
    L6:
        if (r32 != null) goto L8;
        return null;
    L8:
        return r32.a;
    L5:
        r32 = null;
        goto L6
    }

    public final void h(Throwable r3, Throwable r4) {
        if (r3 != null) goto L5;
        if (r4 != null) goto L5;
        return;
    L5:
        if (r3 == null) goto L8;
        if (r4 == null) goto L8;
        ip.f(r3, r4);
    L8:
        if (r3 != null) goto L10;
        r3 = r4;
    L10:
        ip.l(r3);
        ff.u(b().d(), new re("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", r3));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object r0 = vh.n;
        v50 r1 = this.b;
        ld r2 = b();     // Catch: Throwable -> L7
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", r2);     // Catch: Throwable -> L7
        tg r22 = (tg) r2;     // Catch: Throwable -> L7
        m50 r3 = r22.e;     // Catch: Throwable -> L7
        Object r23 = r22.g;     // Catch: Throwable -> L7
        ge r4 = r3.b;     // Catch: Throwable -> L7
        ip.l(r4);     // Catch: Throwable -> L7
        Object r24 = ff.V(r4, r23);     // Catch: Throwable -> L7
        if (r24 == ff.x) goto L9;
        o80 r5 = ip.b0(r3, r4, r24);     // Catch: Throwable -> L7
    L55:
        ge r7 = r3.b;     // Catch: Throwable -> L20
        ip.l(r7);     // Catch: Throwable -> L20
        Object r8 = i();     // Catch: Throwable -> L20
        Throwable r9 = e(r8);     // Catch: Throwable -> L20
        if (r9 != null) goto L22;
        int r10 = this.c;     // Catch: Throwable -> L20
        boolean r11 = true;
        if (r10 != 1) goto L15;
    L18:
        if (r11 == false) goto L22;
        mp r72 = (mp) r7.b(vh.h);     // Catch: Throwable -> L20
    L23:
        if (r72 != null) goto L25;
    L27:
        if (r9 == null) goto L29;
        r3.f(ct.f(r9));     // Catch: Throwable -> L20
    L30:
        if (r5 != null) goto L32;
    L33:
        ff.L(r4, r24);     // Catch: Throwable -> L7
    L53:
        r1.getClass();     // Catch: Throwable -> L36
    L38:
        h(null, f10.a(r0));
        return;
    L36:
        th = move-exception;
        r0 = ct.f(th);
        goto L38
    L32:
        if (r5.K() == false) goto L53;
    L29:
        r3.f(g(r8));     // Catch: Throwable -> L20
        goto L30
    L25:
        if (r72.a() == true) goto L27;
        CancellationException r73 = ((wp) r72).t();     // Catch: Throwable -> L20
        a(r8, r73);     // Catch: Throwable -> L20
        r3.f(ct.f(r73));     // Catch: Throwable -> L20
        goto L30
    L15:
        if (r10 == 2) goto L18;
        r11 = false;
    L22:
        r72 = null;
    L20:
        th = move-exception;
        if (r5 != null) goto L41;
    L42:
        ff.L(r4, r24);     // Catch: Throwable -> L7
    L43:
        throw th;     // Catch: Throwable -> L7
    L41:
        if (r5.K() == false) goto L43;
    L9:
        r5 = null;
    L7:
        th = move-exception;
        r1.getClass();     // Catch: Throwable -> L46
    L48:
        h(th, f10.a(r0));
        return;
    L46:
        th = move-exception;
        r0 = ct.f(th);
        goto L48
    }

    public Object g(Object r1) {
        return r1;
    }
}
