package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dn implements java.lang.Runnable {
    public static final java.lang.ThreadLocal e = null;
    public static final defpackage.ce f = null;
    public java.util.ArrayList a;
    public long b;
    public long c;
    public java.util.ArrayList d;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.dn.e = r0
            ce r0 = new ce
            r1 = 1
            r0.<init>(r1)
            defpackage.dn.f = r0
            return
    }

    public static defpackage.b00 c(androidx.recyclerview.widget.RecyclerView r5, int r6, long r7) {
            r5 r0 = r5.e
            int r0 = r0.t()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            r5 r3 = r5.e
            android.view.View r3 = r3.s(r2)
            b00 r3 = androidx.recyclerview.widget.RecyclerView.I(r3)
            int r4 = r3.c
            if (r4 != r6) goto L20
            boolean r3 = r3.f()
            if (r3 != 0) goto L20
            r5 = 0
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            tz r0 = r5.b
            r5.P()     // Catch: java.lang.Throwable -> L40
            b00 r6 = r0.i(r6, r7)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L45
            boolean r7 = r6.e()     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L42
            boolean r7 = r6.f()     // Catch: java.lang.Throwable -> L40
            if (r7 != 0) goto L42
            android.view.View r7 = r6.a     // Catch: java.lang.Throwable -> L40
            r0.f(r7)     // Catch: java.lang.Throwable -> L40
            goto L45
        L40:
            r6 = move-exception
            goto L49
        L42:
            r0.a(r6, r1)     // Catch: java.lang.Throwable -> L40
        L45:
            r5.Q(r1)
            return r6
        L49:
            r5.Q(r1)
            throw r6
    }

    public final void a(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.p
            if (r0 == 0) goto L15
            long r0 = r4.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            long r0 = r5.getNanoTime()
            r4.b = r0
            r5.post(r4)
        L15:
            bn r5 = r5.b0
            r5.a = r6
            r5.b = r7
            return
    }

    public final void b(long r17) {
            r16 = this;
            r1 = r16
            java.util.ArrayList r0 = r1.d
            java.util.ArrayList r2 = r1.a
            int r3 = r2.size()
            r4 = 0
            r5 = r4
            r6 = r5
        Ld:
            if (r5 >= r3) goto L26
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            bn r9 = r7.b0
            if (r8 != 0) goto L23
            r9.b(r7, r4)
            int r7 = r9.d
            int r6 = r6 + r7
        L23:
            int r5 = r5 + 1
            goto Ld
        L26:
            r0.ensureCapacity(r6)
            r5 = r4
            r6 = r5
        L2b:
            r7 = 1
            if (r5 >= r3) goto L85
            java.lang.Object r8 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L3b
            goto L82
        L3b:
            bn r9 = r8.b0
            int r10 = r9.a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = r4
        L4b:
            int r12 = r9.d
            int r12 = r12 * 2
            if (r10 >= r12) goto L82
            int r12 = r0.size()
            if (r6 < r12) goto L60
            cn r12 = new cn
            r12.<init>()
            r0.add(r12)
            goto L66
        L60:
            java.lang.Object r12 = r0.get(r6)
            cn r12 = (defpackage.cn) r12
        L66:
            int[] r13 = r9.c
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L70
            r15 = r7
            goto L71
        L70:
            r15 = r4
        L71:
            r12.a = r15
            r12.b = r11
            r12.c = r14
            r12.d = r8
            r13 = r13[r10]
            r12.e = r13
            int r6 = r6 + 1
            int r10 = r10 + 2
            goto L4b
        L82:
            int r5 = r5 + 1
            goto L2b
        L85:
            ce r2 = defpackage.dn.f
            java.util.Collections.sort(r0, r2)
            r2 = r4
        L8b:
            int r3 = r0.size()
            if (r2 >= r3) goto L149
            java.lang.Object r3 = r0.get(r2)
            cn r3 = (defpackage.cn) r3
            androidx.recyclerview.widget.RecyclerView r5 = r3.d
            if (r5 != 0) goto L9d
            goto L149
        L9d:
            boolean r6 = r3.a
            if (r6 == 0) goto La7
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto La9
        La7:
            r8 = r17
        La9:
            int r6 = r3.e
            b00 r5 = c(r5, r6, r8)
            if (r5 == 0) goto Lcb
            java.lang.ref.WeakReference r6 = r5.b
            if (r6 == 0) goto Lcb
            boolean r6 = r5.e()
            if (r6 == 0) goto Lcb
            boolean r6 = r5.f()
            if (r6 != 0) goto Lcb
            java.lang.ref.WeakReference r5 = r5.b
            java.lang.Object r5 = r5.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 != 0) goto Lce
        Lcb:
            r10 = r17
            goto L13a
        Lce:
            boolean r6 = r5.y
            if (r6 == 0) goto Lf7
            r5 r6 = r5.e
            int r6 = r6.t()
            if (r6 == 0) goto Lf7
            tz r6 = r5.b
            jz r8 = r5.H
            if (r8 == 0) goto Le3
            r8.e()
        Le3:
            nz r8 = r5.l
            if (r8 == 0) goto Lef
            r8.e0(r6)
            nz r8 = r5.l
            r8.f0(r6)
        Lef:
            java.util.ArrayList r8 = r6.a
            r8.clear()
            r6.d()
        Lf7:
            bn r6 = r5.b0
            r6.b(r5, r7)
            int r8 = r6.d
            if (r8 == 0) goto Lcb
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = defpackage.n70.a     // Catch: java.lang.Throwable -> L12c
            defpackage.m70.a(r8)     // Catch: java.lang.Throwable -> L12c
            yz r8 = r5.c0     // Catch: java.lang.Throwable -> L12c
            fz r9 = r5.k     // Catch: java.lang.Throwable -> L12c
            r8.d = r7     // Catch: java.lang.Throwable -> L12c
            int r9 = r9.a()     // Catch: java.lang.Throwable -> L12c
            r8.e = r9     // Catch: java.lang.Throwable -> L12c
            r8.g = r4     // Catch: java.lang.Throwable -> L12c
            r8.h = r4     // Catch: java.lang.Throwable -> L12c
            r8.i = r4     // Catch: java.lang.Throwable -> L12c
            r8 = r4
        L11a:
            int r9 = r6.d     // Catch: java.lang.Throwable -> L12c
            int r9 = r9 * 2
            if (r8 >= r9) goto L12e
            int[] r9 = r6.c     // Catch: java.lang.Throwable -> L12c
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L12c
            r10 = r17
            c(r5, r9, r10)     // Catch: java.lang.Throwable -> L12c
            int r8 = r8 + 2
            goto L11a
        L12c:
            r0 = move-exception
            goto L134
        L12e:
            r10 = r17
            defpackage.m70.b()
            goto L13a
        L134:
            int r2 = defpackage.n70.a
            defpackage.m70.b()
            throw r0
        L13a:
            r3.a = r4
            r3.b = r4
            r3.c = r4
            r5 = 0
            r3.d = r5
            r3.e = r4
            int r2 = r2 + 1
            goto L8b
        L149:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 0
            java.lang.String r3 = "RV Prefetch"
            int r4 = defpackage.n70.a     // Catch: java.lang.Throwable -> L34
            defpackage.m70.a(r3)     // Catch: java.lang.Throwable -> L34
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L17
        L11:
            r9.b = r1
            defpackage.m70.b()
            return
        L17:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r5 = r1
        L1d:
            if (r4 >= r3) goto L39
            java.lang.Object r7 = r0.get(r4)     // Catch: java.lang.Throwable -> L34
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L34
            int r8 = r7.getWindowVisibility()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L36
            long r7 = r7.getDrawingTime()     // Catch: java.lang.Throwable -> L34
            long r5 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L4b
        L36:
            int r4 = r4 + 1
            goto L1d
        L39:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L11
        L3e:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L34
            long r3 = r0.toNanos(r5)     // Catch: java.lang.Throwable -> L34
            long r5 = r9.c     // Catch: java.lang.Throwable -> L34
            long r3 = r3 + r5
            r9.b(r3)     // Catch: java.lang.Throwable -> L34
            goto L11
        L4b:
            r9.b = r1
            int r1 = defpackage.n70.a
            defpackage.m70.b()
            throw r0
    }
}
