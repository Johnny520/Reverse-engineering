package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1.c f3222a = null;

    static {
            e1.c r0 = new e1.c
            r1 = 0
            r2 = 1092616192(0x41200000, float:10.0)
            r0.<init>(r1, r1, r2, r2)
            f2.t.f3222a = r0
            return
    }

    public static final f2.q a(x1.f0 r8, boolean r9) {
            x1.b1 r0 = r8.L
            y0.n r0 = r0.f20844f
            int r1 = r0.f21822j
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f21821i
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof x1.z1
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f21821i
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof x1.j
            if (r4 == 0) goto L56
            r4 = r1
            x1.j r4 = (x1.j) r4
            y0.n r4 = r4.f20950v
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f21821i
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            j0.b r3 = new j0.b
            r6 = 16
            y0.n[] r6 = new y0.n[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            y0.n r4 = r4.f21824l
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            y0.n r1 = x1.k.e(r3)
            goto L15
        L5b:
            int r1 = r0.f21822j
            r1 = r1 & 8
            if (r1 == 0) goto L64
            y0.n r0 = r0.f21824l
            goto Lb
        L64:
            r2.getClass()
            x1.z1 r2 = (x1.z1) r2
            y0.n r2 = (y0.n) r2
            y0.n r0 = r2.f21819g
            f2.m r1 = r8.w()
            if (r1 != 0) goto L78
            f2.m r1 = new f2.m
            r1.<init>()
        L78:
            f2.q r2 = new f2.q
            r2.<init>(r0, r9, r8, r1)
            return r2
    }

    public static final f.w b(f2.s r7, fg.l r8) {
            java.lang.String r0 = "getAllUncoveredSemanticsNodesToIntObjectMap"
            android.os.Trace.beginSection(r0)
            f2.q r4 = r7.a()     // Catch: java.lang.Throwable -> L4a
            x1.f0 r7 = r4.f3212c     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r7.H()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L41
            boolean r7 = r7.G()     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L18
            goto L41
        L18:
            e1.c r7 = r4.g()     // Catch: java.lang.Throwable -> L4a
            f.w r3 = new f.w     // Catch: java.lang.Throwable -> L4a
            r0 = 48
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            androidx.lifecycle.x r2 = new androidx.lifecycle.x     // Catch: java.lang.Throwable -> L4a
            r0 = 11
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            u2.k r7 = oh.h.Q(r7)     // Catch: java.lang.Throwable -> L4a
            r2.W(r7)     // Catch: java.lang.Throwable -> L4a
            androidx.lifecycle.x r1 = new androidx.lifecycle.x     // Catch: java.lang.Throwable -> L4a
            r7 = 11
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            r5 = r4
            r6 = r8
            e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r3
        L41:
            f.w r7 = f.l.f2854a     // Catch: java.lang.Throwable -> L4a
            r7.getClass()     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r7
        L4a:
            r0 = move-exception
            r7 = r0
            android.os.Trace.endSection()
            throw r7
    }

    public static final void c(androidx.lifecycle.x r16, androidx.lifecycle.x r17, f.w r18, f2.q r19, f2.q r20, fg.l r21) {
            r0 = r16
            r6 = r20
            java.lang.Object r1 = r0.f310h
            android.graphics.Region r1 = (android.graphics.Region) r1
            r2 = r17
            java.lang.Object r3 = r2.f310h
            r7 = r3
            android.graphics.Region r7 = (android.graphics.Region) r7
            x1.f0 r3 = r6.f3212c
            x1.f0 r4 = r6.f3212c
            boolean r3 = r3.H()
            if (r3 == 0) goto Lee
            boolean r3 = r4.G()
            if (r3 == 0) goto Lee
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L27
            goto Lee
        L27:
            e1.c r3 = r6.m()
            boolean r5 = r3.f()
            r8 = 1
            if (r5 == 0) goto L60
            x1.z1 r3 = r6.f()
            r5 = 0
            if (r3 != 0) goto L46
            x1.b1 r3 = r4.L
            x1.r r3 = r3.f20841c
            v1.t r4 = v1.w.h(r3)
            e1.c r3 = r4.k0(r3, r5)
            goto L60
        L46:
            y0.n r3 = (y0.n) r3
            y0.n r3 = r3.f21819g
            f2.m r4 = r6.f3213d
            f2.x r9 = f2.l.f3179b
            f.k0 r4 = r4.f3204g
            java.lang.Object r4 = r4.g(r9)
            if (r4 != 0) goto L57
            r4 = 0
        L57:
            if (r4 == 0) goto L5b
            r4 = r8
            goto L5c
        L5b:
            r4 = r5
        L5c:
            e1.c r3 = x1.k.i(r3, r4, r5)
        L60:
            u2.k r9 = oh.h.Q(r3)
            r0.W(r9)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.INTERSECT
            boolean r3 = r1.op(r7, r3)
            if (r3 == 0) goto Lf7
            int r3 = r6.f3215f
            r4 = r19
            int r5 = r4.f3215f
            r10 = -1
            if (r3 != r5) goto L79
            r3 = r10
        L79:
            f2.r r5 = new f2.r
            android.graphics.Rect r1 = r1.getBounds()
            u2.k r11 = new u2.k
            int r12 = r1.left
            int r13 = r1.top
            int r14 = r1.right
            int r1 = r1.bottom
            r11.<init>(r12, r13, r14, r1)
            r5.<init>(r6, r11)
            r1 = r18
            r1.h(r3, r5)
            r3 = 4
            java.util.List r11 = f2.q.j(r3, r6)
            int r3 = r11.size()
            int r3 = r3 - r8
            r8 = r3
        L9f:
            if (r10 >= r8) goto Lce
            java.lang.Object r3 = r11.get(r8)
            r5 = r21
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb4
            goto Lc3
        Lb4:
            java.lang.Object r3 = r11.get(r8)
            f2.q r3 = (f2.q) r3
            r15 = r2
            r2 = r1
            r1 = r15
            r15 = r4
            r4 = r3
            r3 = r15
            c(r0, r1, r2, r3, r4, r5)
        Lc3:
            int r8 = r8 + (-1)
            r0 = r16
            r2 = r17
            r1 = r18
            r4 = r19
            goto L9f
        Lce:
            boolean r0 = h(r6)
            if (r0 == 0) goto Lf7
            int r0 = r9.f13349a
            int r1 = r9.f13350b
            int r2 = r9.f13351c
            int r3 = r9.f13352d
            android.graphics.Region$Op r4 = android.graphics.Region.Op.DIFFERENCE
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r16 = r7
            r16.op(r17, r18, r19, r20, r21)
            return
        Lee:
            boolean r0 = r6.o()
            if (r0 == 0) goto Lf7
            d(r18, r19, r20)
        Lf7:
            return
    }

    public static final void d(f.w r3, f2.q r4, f2.q r5) {
            f2.q r0 = r5.l()
            if (r0 == 0) goto L16
            x1.f0 r1 = r0.f3212c
            if (r1 == 0) goto L16
            boolean r1 = r1.H()
            r2 = 1
            if (r1 != r2) goto L16
            e1.c r0 = r0.g()
            goto L18
        L16:
            e1.c r0 = f2.t.f3222a
        L18:
            int r1 = r5.f3215f
            int r4 = r4.f3215f
            if (r1 != r4) goto L1f
            r1 = -1
        L1f:
            f2.r r4 = new f2.r
            u2.k r0 = oh.h.Q(r0)
            r4.<init>(r5, r0)
            r3.h(r1, r4)
            return
    }

    public static final void e(androidx.lifecycle.x r17, androidx.lifecycle.x r18, f.w r19, f2.q r20, f2.q r21, fg.l r22) {
            r0 = r17
            r2 = r19
            r6 = r21
            r3 = r20
            r5 = r22
            int r1 = r3.f3215f
            java.lang.Object r4 = r0.f310h
            android.graphics.Region r4 = (android.graphics.Region) r4
            r7 = r18
            java.lang.Object r8 = r7.f310h
            android.graphics.Region r8 = (android.graphics.Region) r8
            x1.f0 r9 = r6.f3212c
            f2.m r10 = r6.f3213d
            x1.f0 r11 = r6.f3212c
            int r12 = r6.f3215f
            boolean r9 = r9.H()
            if (r9 == 0) goto L2d
            boolean r9 = r11.G()
            if (r9 != 0) goto L2b
            goto L2d
        L2b:
            r9 = 0
            goto L2e
        L2d:
            r9 = 1
        L2e:
            boolean r15 = r8.isEmpty()
            if (r15 == 0) goto L36
            if (r12 != r1) goto L1dc
        L36:
            if (r9 == 0) goto L40
            boolean r9 = r6.o()
            if (r9 != 0) goto L40
            goto L1dc
        L40:
            e1.c r9 = r6.m()
            u2.k r9 = oh.h.Q(r9)
            r0.W(r9)
            if (r12 != r1) goto L4e
            r12 = -1
        L4e:
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            boolean r1 = r4.op(r8, r1)
            if (r1 == 0) goto L1b6
            f2.r r1 = new f2.r
            android.graphics.Rect r4 = r4.getBounds()
            r16 = 1
            u2.k r14 = new u2.k
            int r15 = r4.left
            int r13 = r4.top
            int r0 = r4.right
            int r4 = r4.bottom
            r14.<init>(r15, r13, r0, r4)
            r1.<init>(r6, r14)
            r2.h(r12, r1)
            r0 = 4
            java.util.List r12 = f2.q.j(r0, r6)
            boolean r0 = r10.f3206i
            if (r0 == 0) goto Lec
            f2.q r0 = r6.l()
        L7e:
            if (r0 == 0) goto L9a
            f2.m r4 = r0.f3213d
            f.k0 r4 = r4.f3204g
            f2.x r13 = f2.u.f3244v
            boolean r13 = r4.c(r13)
            if (r13 != 0) goto L9b
            f2.x r13 = f2.u.f3243u
            boolean r4 = r4.c(r13)
            if (r4 == 0) goto L95
            goto L9b
        L95:
            f2.q r0 = r0.l()
            goto L7e
        L9a:
            r0 = 0
        L9b:
            if (r0 == 0) goto Le6
            x1.i1 r4 = r6.d()
            if (r4 == 0) goto Lb0
            y0.n r13 = r4.r1()
            boolean r13 = r13.f21832t
            if (r13 == 0) goto Lac
            goto Lad
        Lac:
            r4 = 0
        Lad:
            if (r4 == 0) goto Lb0
            goto Lb1
        Lb0:
            r4 = 0
        Lb1:
            x1.i1 r0 = r0.d()
            if (r0 == 0) goto Lc4
            y0.n r13 = r0.r1()
            boolean r13 = r13.f21832t
            if (r13 == 0) goto Lc0
            goto Lc1
        Lc0:
            r0 = 0
        Lc1:
            if (r0 == 0) goto Lc4
            goto Lc5
        Lc4:
            r0 = 0
        Lc5:
            if (r4 == 0) goto Le6
            if (r0 != 0) goto Lca
            goto Le6
        Lca:
            r13 = 0
            e1.c r4 = r0.k0(r4, r13)
            long r13 = r0.f13902i
            long r13 = r9.e0.q0(r13)
            r1 = 0
            e1.c r1 = ac.p.a(r1, r13)
            e1.c r1 = r4.e(r1)
            boolean r1 = r4.equals(r1)
            r1 = r1 ^ 1
            goto Le7
        Le6:
            r1 = 0
        Le7:
            if (r1 == 0) goto Lec
            r1 = r16
            goto Led
        Lec:
            r1 = 0
        Led:
            if (r1 == 0) goto L161
            androidx.lifecycle.x r1 = new androidx.lifecycle.x
            r2 = 11
            r1.<init>(r2)
            x1.z1 r2 = r6.f()
            if (r2 != 0) goto L10a
            x1.b1 r0 = r11.L
            x1.r r0 = r0.f20841c
            v1.t r2 = v1.w.h(r0)
            r13 = 0
            e1.c r0 = r2.k0(r0, r13)
            goto L127
        L10a:
            y0.n r2 = (y0.n) r2
            y0.n r2 = r2.f21819g
            f2.x r4 = f2.l.f3179b
            f.k0 r7 = r10.f3204g
            java.lang.Object r4 = r7.g(r4)
            if (r4 != 0) goto L11a
            r0 = 0
            goto L11b
        L11a:
            r0 = r4
        L11b:
            if (r0 == 0) goto L121
            r13 = r16
        L11f:
            r0 = 0
            goto L123
        L121:
            r13 = 0
            goto L11f
        L123:
            e1.c r0 = x1.k.i(r2, r13, r0)
        L127:
            u2.k r0 = oh.h.Q(r0)
            r1.W(r0)
            int r0 = r12.size()
            int r0 = r0 + (-1)
            r7 = r0
        L135:
            r0 = -1
            if (r0 >= r7) goto L196
            java.lang.Object r0 = r12.get(r7)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L149
            goto L15c
        L149:
            java.lang.Object r0 = r12.get(r7)
            r4 = r0
            f2.q r4 = (f2.q) r4
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r2 = 11
            r0.<init>(r2)
            r2 = r19
            c(r0, r1, r2, r3, r4, r5)
        L15c:
            int r7 = r7 + (-1)
            r3 = r20
            goto L135
        L161:
            int r0 = r12.size()
            int r0 = r0 + (-1)
            r10 = r0
        L168:
            r0 = -1
            if (r0 >= r10) goto L196
            java.lang.Object r0 = r12.get(r10)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17e
            r2 = r19
            goto L18f
        L17e:
            java.lang.Object r0 = r12.get(r10)
            r4 = r0
            f2.q r4 = (f2.q) r4
            r0 = r17
            r2 = r19
            r3 = r20
            r1 = r7
            e(r0, r1, r2, r3, r4, r5)
        L18f:
            int r10 = r10 + (-1)
            r7 = r18
            r5 = r22
            goto L168
        L196:
            boolean r0 = h(r6)
            if (r0 == 0) goto L1dc
            int r0 = r9.f13349a
            int r1 = r9.f13350b
            int r2 = r9.f13351c
            int r3 = r9.f13352d
            android.graphics.Region$Op r4 = android.graphics.Region.Op.DIFFERENCE
            r18 = r0
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r17 = r8
            r17.op(r18, r19, r20, r21, r22)
            return
        L1b6:
            boolean r0 = r6.o()
            if (r0 == 0) goto L1c0
            d(r19, r20, r21)
            return
        L1c0:
            r0 = -1
            if (r12 != r0) goto L1dc
            f2.r r0 = new f2.r
            android.graphics.Rect r1 = r4.getBounds()
            u2.k r3 = new u2.k
            int r4 = r1.left
            int r5 = r1.top
            int r7 = r1.right
            int r1 = r1.bottom
            r3.<init>(r4, r5, r7, r1)
            r0.<init>(r6, r3)
            r2.h(r12, r0)
        L1dc:
            return
    }

    public static final java.lang.Object f(f2.m r0, f2.x r1) {
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L9
            r0 = 0
        L9:
            return r0
    }

    public static final boolean g(f2.q r2) {
            x1.i1 r0 = r2.d()
            f2.m r2 = r2.f3213d
            f.k0 r2 = r2.f3204g
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.z1()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L25
            f2.x r0 = f2.u.f3238p
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L25
            f2.x r0 = f2.u.f3237o
            boolean r2 = r2.c(r0)
            if (r2 == 0) goto L24
            goto L25
        L24:
            return r1
        L25:
            r2 = 1
            return r2
    }

    public static final boolean h(f2.q r14) {
            boolean r0 = g(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            f2.m r14 = r14.f3213d
            boolean r0 = r14.f3206i
            if (r0 != 0) goto L59
            f.k0 r14 = r14.f3204g
            java.lang.Object[] r0 = r14.f2849b
            java.lang.Object[] r2 = r14.f2850c
            long[] r14 = r14.f2848a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            f2.x r11 = (f2.x) r11
            boolean r10 = r11.f3254c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
    }
}
