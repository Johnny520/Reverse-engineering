package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vg extends defpackage.u50 {
    public int c;

    public vg(int r4) {
            r3 = this;
            r0 = 0
            v50 r2 = defpackage.x50.g
            r3.<init>(r0, r2)
            r3.c = r4
            return
    }

    public abstract void a(java.lang.Object r1, java.util.concurrent.CancellationException r2);

    public abstract defpackage.ld b();

    public java.lang.Throwable e(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.nb
            r1 = 0
            if (r0 == 0) goto L8
            nb r3 = (defpackage.nb) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Le
            java.lang.Throwable r3 = r3.a
            return r3
        Le:
            return r1
    }

    public java.lang.Object g(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void h(java.lang.Throwable r3, java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            defpackage.ip.f(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            re r4 = new re
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.ip.l(r3)
            r4.<init>(r0, r3)
            ld r3 = r2.b()
            ge r3 = r3.d()
            defpackage.ff.u(r3, r4)
            return
    }

    public abstract java.lang.Object i();

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            vh r0 = defpackage.vh.n
            v50 r1 = r13.b
            ld r2 = r13.b()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            defpackage.ip.m(r3, r2)     // Catch: java.lang.Throwable -> L26
            tg r2 = (defpackage.tg) r2     // Catch: java.lang.Throwable -> L26
            m50 r3 = r2.e     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r2.g     // Catch: java.lang.Throwable -> L26
            ge r4 = r3.b     // Catch: java.lang.Throwable -> L26
            defpackage.ip.l(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = defpackage.ff.V(r4, r2)     // Catch: java.lang.Throwable -> L26
            l0 r5 = defpackage.ff.x     // Catch: java.lang.Throwable -> L26
            r6 = 0
            if (r2 == r5) goto L29
            o80 r5 = defpackage.ip.b0(r3, r4, r2)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            goto La3
        L29:
            r5 = r6
        L2a:
            ge r7 = r3.b     // Catch: java.lang.Throwable -> L4e
            defpackage.ip.l(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r8 = r13.i()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r9 = r13.e(r8)     // Catch: java.lang.Throwable -> L4e
            if (r9 != 0) goto L50
            int r10 = r13.c     // Catch: java.lang.Throwable -> L4e
            r11 = 1
            if (r10 == r11) goto L43
            r12 = 2
            if (r10 != r12) goto L42
            goto L43
        L42:
            r11 = 0
        L43:
            if (r11 == 0) goto L50
            vh r10 = defpackage.vh.h     // Catch: java.lang.Throwable -> L4e
            ee r7 = r7.b(r10)     // Catch: java.lang.Throwable -> L4e
            mp r7 = (defpackage.mp) r7     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r3 = move-exception
            goto L97
        L50:
            r7 = r6
        L51:
            if (r7 == 0) goto L6a
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L4e
            if (r10 != 0) goto L6a
            wp r7 = (defpackage.wp) r7     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.CancellationException r7 = r7.t()     // Catch: java.lang.Throwable -> L4e
            r13.a(r8, r7)     // Catch: java.lang.Throwable -> L4e
            e10 r7 = defpackage.ct.f(r7)     // Catch: java.lang.Throwable -> L4e
            r3.f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L6a:
            if (r9 == 0) goto L74
            e10 r7 = defpackage.ct.f(r9)     // Catch: java.lang.Throwable -> L4e
            r3.f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L74:
            java.lang.Object r7 = r13.g(r8)     // Catch: java.lang.Throwable -> L4e
            r3.f(r7)     // Catch: java.lang.Throwable -> L4e
        L7b:
            if (r5 == 0) goto L83
            boolean r3 = r5.K()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L86
        L83:
            defpackage.ff.L(r4, r2)     // Catch: java.lang.Throwable -> L26
        L86:
            r1.getClass()     // Catch: java.lang.Throwable -> L8a
            goto L8f
        L8a:
            r0 = move-exception
            e10 r0 = defpackage.ct.f(r0)
        L8f:
            java.lang.Throwable r0 = defpackage.f10.a(r0)
            r13.h(r6, r0)
            goto Lb3
        L97:
            if (r5 == 0) goto L9f
            boolean r5 = r5.K()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto La2
        L9f:
            defpackage.ff.L(r4, r2)     // Catch: java.lang.Throwable -> L26
        La2:
            throw r3     // Catch: java.lang.Throwable -> L26
        La3:
            r1.getClass()     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            e10 r0 = defpackage.ct.f(r0)
        Lac:
            java.lang.Throwable r0 = defpackage.f10.a(r0)
            r13.h(r2, r0)
        Lb3:
            return
    }
}
