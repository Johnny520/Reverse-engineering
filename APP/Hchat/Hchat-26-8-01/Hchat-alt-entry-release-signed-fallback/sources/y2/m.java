package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.u f22242a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0.u f22243b = null;

    static {
            y2.d r0 = y2.d.f22209j
            i0.u r1 = new i0.u
            r1.<init>(r0)
            y2.m.f22242a = r1
            y2.d r0 = y2.d.f22208i
            i0.u r1 = new i0.u
            r1.<init>(r0)
            y2.m.f22243b = r1
            return
    }

    public static final void a(y2.b0 r21, fg.a r22, y2.c0 r23, s0.d r24, i0.h0 r25, int r26, int r27) {
            r1 = r21
            r9 = r25
            r10 = r26
            r0 = -1772091631(0xffffffff96600711, float:-1.8096806E-25)
            r9.b0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L1b
            boolean r0 = r9.f(r1)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r0 | r10
            goto L1c
        L1b:
            r0 = r10
        L1c:
            r2 = r27 & 2
            if (r2 == 0) goto L25
            r0 = r0 | 48
        L22:
            r3 = r22
            goto L37
        L25:
            r3 = r10 & 48
            if (r3 != 0) goto L22
            r3 = r22
            boolean r4 = r9.h(r3)
            if (r4 == 0) goto L34
            r4 = 32
            goto L36
        L34:
            r4 = 16
        L36:
            r0 = r0 | r4
        L37:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L4a
            r4 = r23
            boolean r5 = r9.f(r4)
            if (r5 == 0) goto L46
            r5 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r5 = 128(0x80, float:1.8E-43)
        L48:
            r0 = r0 | r5
            goto L4c
        L4a:
            r4 = r23
        L4c:
            r5 = r10 & 3072(0xc00, float:4.305E-42)
            r14 = r24
            if (r5 != 0) goto L5e
            boolean r5 = r9.h(r14)
            if (r5 == 0) goto L5b
            r5 = 2048(0x800, float:2.87E-42)
            goto L5d
        L5b:
            r5 = 1024(0x400, float:1.435E-42)
        L5d:
            r0 = r0 | r5
        L5e:
            r15 = r0
            r0 = r15 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r7 = 0
            if (r0 == r5) goto L68
            r0 = 1
            goto L69
        L68:
            r0 = r7
        L69:
            r5 = r15 & 1
            boolean r0 = r9.S(r5, r0)
            if (r0 == 0) goto L258
            if (r2 == 0) goto L76
            r16 = 0
            goto L78
        L76:
            r16 = r3
        L78:
            i0.m2 r2 = y1.i0.f21970f
            java.lang.Object r2 = r9.j(r2)
            android.view.View r2 = (android.view.View) r2
            i0.m2 r3 = y1.h1.f21946h
            java.lang.Object r3 = r9.j(r3)
            r5 = r3
            u2.c r5 = (u2.c) r5
            i0.u r3 = y2.m.f22242a
            java.lang.Object r3 = r9.j(r3)
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            i0.m2 r3 = y1.h1.f21952n
            java.lang.Object r3 = r9.j(r3)
            r19 = r3
            u2.m r19 = (u2.m) r19
            i0.f0 r3 = i0.r.x(r9)
            i0.a1 r8 = i0.r.y(r24, r25)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Object r6 = r9.P()
            i0.e r11 = i0.l.f5952a
            if (r6 != r11) goto Lb4
            y2.d r6 = y2.d.f22210k
            r9.k0(r6)
        Lb4:
            fg.a r6 = (fg.a) r6
            r7 = 48
            java.lang.Object r0 = v0.k.c(r0, r6, r9, r7)
            r7 = r0
            java.util.UUID r7 = (java.util.UUID) r7
            i0.u r0 = y2.m.f22243b
            java.lang.Object r0 = r9.j(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r6 = r9.P()
            if (r6 != r11) goto Lff
            r20 = r8
            r8 = r0
            y2.x r0 = new y2.x
            r6 = r4
            r4 = r2
            r2 = r6
            r6 = r1
            r12 = r3
            r1 = r16
            r3 = r18
            r13 = r20
            r10 = 0
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r6
            y2.l r2 = new y2.l
            r4 = 1
            r2.<init>(r0, r13, r4)
            s0.d r4 = new s0.d
            r5 = -297523940(0xffffffffee44251c, float:-1.5175981E28)
            r6 = 1
            r4.<init>(r5, r2, r6)
            r0.n(r12, r4)
            r9.k0(r0)
            r6 = r0
            goto L104
        Lff:
            r3 = r18
            r10 = 0
            r20 = 0
        L104:
            y2.x r6 = (y2.x) r6
            boolean r0 = r9.h(r6)
            r2 = r15 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r2 != r4) goto L112
            r4 = 1
            goto L114
        L112:
            r4 = r20
        L114:
            r0 = r0 | r4
            r4 = r15 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L11d
            r5 = 1
            goto L11f
        L11d:
            r5 = r20
        L11f:
            r0 = r0 | r5
            boolean r5 = r9.f(r3)
            r0 = r0 | r5
            int r5 = r19.ordinal()
            boolean r5 = r9.d(r5)
            r0 = r0 | r5
            java.lang.Object r5 = r9.P()
            if (r0 != 0) goto L13a
            if (r5 != r11) goto L137
            goto L13a
        L137:
            r0 = r15
            r15 = r6
            goto L149
        L13a:
            y2.g r14 = new y2.g
            r17 = r23
            r18 = r3
            r0 = r15
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r9.k0(r14)
            r5 = r14
        L149:
            fg.l r5 = (fg.l) r5
            i0.r.c(r15, r5, r9)
            boolean r5 = r9.h(r15)
            r6 = 32
            if (r2 != r6) goto L158
            r6 = 1
            goto L15a
        L158:
            r6 = r20
        L15a:
            r2 = r5 | r6
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L162
            r6 = 1
            goto L164
        L162:
            r6 = r20
        L164:
            r2 = r2 | r6
            boolean r4 = r9.f(r3)
            r2 = r2 | r4
            int r4 = r19.ordinal()
            boolean r4 = r9.d(r4)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto L17f
            if (r4 != r11) goto L17c
            goto L17f
        L17c:
            r3 = r19
            goto L18e
        L17f:
            y2.h r14 = new y2.h
            r17 = r23
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r3 = r19
            r9.k0(r14)
            r4 = r14
        L18e:
            fg.a r4 = (fg.a) r4
            i0.r.j(r4, r9)
            boolean r2 = r9.h(r15)
            r0 = r0 & 14
            r4 = 4
            if (r0 != r4) goto L19e
            r6 = 1
            goto L1a0
        L19e:
            r6 = r20
        L1a0:
            r0 = r2 | r6
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto L1aa
            if (r2 != r11) goto L1b4
        L1aa:
            f1.p r2 = new f1.p
            r0 = 12
            r2.<init>(r15, r0, r1)
            r9.k0(r2)
        L1b4:
            fg.l r2 = (fg.l) r2
            i0.r.c(r1, r2, r9)
            boolean r0 = r9.h(r15)
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto L1c5
            if (r2 != r11) goto L1cf
        L1c5:
            ci.j r2 = new ci.j
            r0 = 29
            r2.<init>(r15, r10, r0)
            r9.k0(r2)
        L1cf:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r9, r15)
            boolean r0 = r9.h(r15)
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto L1e0
            if (r2 != r11) goto L1e9
        L1e0:
            y2.j r2 = new y2.j
            r0 = 0
            r2.<init>(r15, r0)
            r9.k0(r2)
        L1e9:
            fg.l r2 = (fg.l) r2
            y0.l r0 = y0.l.f21818a
            y0.o r0 = v1.w.m(r0, r2)
            boolean r2 = r9.h(r15)
            int r4 = r3.ordinal()
            boolean r4 = r9.d(r4)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto L206
            if (r4 != r11) goto L20f
        L206:
            w.o1 r4 = new w.o1
            r2 = 1
            r4.<init>(r15, r2, r3)
            r9.k0(r4)
        L20f:
            v1.n0 r4 = (v1.n0) r4
            long r2 = r9.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r9.l()
            y0.o r0 = y0.a.c(r9, r0)
            x1.f r5 = x1.g.f20914f
            r5.getClass()
            x1.y r5 = x1.f.f20883b
            r9.d0()
            boolean r6 = r9.S
            if (r6 == 0) goto L231
            r9.k(r5)
            goto L234
        L231:
            r9.n0()
        L234:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r9, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r9, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r9, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r9)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r9, r0)
            r6 = 1
            r9.p(r6)
            r2 = r16
            goto L25c
        L258:
            r9.V()
            r2 = r3
        L25c:
            i0.r1 r7 = r9.t()
            if (r7 == 0) goto L271
            y2.k r0 = new y2.k
            r3 = r23
            r4 = r24
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L271:
            return
    }

    public static final boolean b(android.view.View r1) {
            android.view.View r1 = r1.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r0 == 0) goto Lf
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.flags
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            return r0
    }
}
