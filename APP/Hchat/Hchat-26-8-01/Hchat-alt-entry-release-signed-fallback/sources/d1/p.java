package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements d1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.t f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.t f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1.b0 f1936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1.i f1937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.m f1938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.a0 f1939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.f0 f1940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1.b0 f1941h;

    public p(y1.t r4, y1.t r5) {
            r3 = this;
            r3.<init>()
            r3.f1934a = r4
            r3.f1935b = r5
            d1.b0 r4 = new d1.b0
            r0 = 0
            r1 = 14
            r2 = 2
            r4.<init>(r2, r0, r1)
            r3.f1936c = r4
            d1.i r4 = new d1.i
            r4.<init>(r3, r5)
            r3.f1937d = r4
            d1.m r4 = new d1.m
            r4.<init>(r3)
            r3.f1938e = r4
            f.f0 r4 = new f.f0
            r5 = 1
            r4.<init>(r5)
            r3.f1940g = r4
            return
    }

    public final boolean a(boolean r10) {
            r9 = this;
            d1.b0 r10 = r9.f()
            r0 = 1
            if (r10 != 0) goto L9
            goto La0
        L9:
            d1.b0 r10 = r9.f()
            r1 = 0
            r9.i(r1)
            if (r10 == 0) goto La0
            d1.z r2 = d1.z.f1964g
            d1.z r3 = d1.z.f1966i
            r10.l1(r2, r3)
            y0.n r2 = r10.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L25
            java.lang.String r2 = "visitAncestors called on an unattached node"
            u1.a.b(r2)
        L25:
            y0.n r2 = r10.f21819g
            y0.n r2 = r2.f21823k
            x1.f0 r10 = x1.k.w(r10)
        L2d:
            if (r10 == 0) goto La0
            x1.b1 r4 = r10.L
            y0.n r4 = r4.f20844f
            int r4 = r4.f21822j
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L91
        L39:
            if (r2 == 0) goto L91
            int r4 = r2.f21821i
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L8e
            r5 = r1
            r4 = r2
        L43:
            if (r4 == 0) goto L8e
            boolean r6 = r4 instanceof d1.b0
            if (r6 == 0) goto L51
            d1.b0 r4 = (d1.b0) r4
            d1.z r6 = d1.z.f1965h
            r4.l1(r6, r3)
            goto L89
        L51:
            int r6 = r4.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L89
            boolean r6 = r4 instanceof x1.j
            if (r6 == 0) goto L89
            r6 = r4
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L61:
            if (r6 == 0) goto L86
            int r8 = r6.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L83
            int r7 = r7 + 1
            if (r7 != r0) goto L6f
            r4 = r6
            goto L83
        L6f:
            if (r5 != 0) goto L7a
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L7a:
            if (r4 == 0) goto L80
            r5.b(r4)
            r4 = r1
        L80:
            r5.b(r6)
        L83:
            y0.n r6 = r6.f21824l
            goto L61
        L86:
            if (r7 != r0) goto L89
            goto L43
        L89:
            y0.n r4 = x1.k.e(r5)
            goto L43
        L8e:
            y0.n r2 = r2.f21823k
            goto L39
        L91:
            x1.f0 r10 = r10.u()
            if (r10 == 0) goto L9e
            x1.b1 r2 = r10.L
            if (r2 == 0) goto L9e
            x1.b2 r2 = r2.f20843e
            goto L2d
        L9e:
            r2 = r1
            goto L2d
        La0:
            return r0
    }

    public final boolean b(int r3, boolean r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 != 0) goto L23
            d1.b0 r1 = r2.f1936c
            d1.b r3 = d1.d.t(r1, r3)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L1f
            if (r3 == r0) goto L1d
            r4 = 2
            if (r3 == r4) goto L1d
            r4 = 3
            if (r3 != r4) goto L18
            goto L1d
        L18:
            okio.a.k()
            r3 = 0
            return r3
        L1d:
            r0 = 0
            goto L26
        L1f:
            r2.a(r4)
            goto L26
        L23:
            r2.a(r4)
        L26:
            if (r0 == 0) goto L2d
            if (r5 == 0) goto L2d
            r2.c()
        L2d:
            return r0
    }

    public final void c() {
            r2 = this;
            y1.t r0 = r2.f1934a
            boolean r1 = r0.isFocused()
            if (r1 != 0) goto L22
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto Lf
            goto L22
        Lf:
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L21
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L1e
            r1.clearFocus()
        L1e:
            r0.clearFocus()
        L21:
            return
        L22:
            r0.clearFocus()
            return
    }

    public final boolean d(android.view.KeyEvent r14, fg.a r15) {
            r13 = this;
            d1.b0 r0 = r13.f1936c
            java.lang.String r1 = "FocusOwnerImpl:dispatchKeyEvent"
            android.os.Trace.beginSection(r1)
            d1.i r1 = r13.f1937d     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.f1927e     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.String r14 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r15 = java.lang.System.out     // Catch: java.lang.Throwable -> L19
            r15.println(r14)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r2
        L19:
            r14 = move-exception
            goto L2e5
        L1c:
            boolean r1 = r13.j(r14)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L26
            android.os.Trace.endSection()
            return r2
        L26:
            d1.b0 r1 = d1.d.f(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "visitAncestors called on an unattached node"
            r4 = 16
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L5c
            y0.n r7 = r1.f21819g     // Catch: java.lang.Throwable -> L19
            boolean r7 = r7.f21832t     // Catch: java.lang.Throwable -> L19
            if (r7 != 0) goto L3d
            java.lang.String r7 = "visitLocalDescendants called on an unattached node"
            u1.a.b(r7)     // Catch: java.lang.Throwable -> L19
        L3d:
            y0.n r7 = r1.f21819g     // Catch: java.lang.Throwable -> L19
            int r8 = r7.f21822j     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 9216(0x2400, float:1.2914E-41)
            if (r8 == 0) goto L59
            y0.n r7 = r7.f21824l     // Catch: java.lang.Throwable -> L19
            r8 = r5
        L48:
            if (r7 == 0) goto L5a
            int r9 = r7.f21821i     // Catch: java.lang.Throwable -> L19
            r10 = r9 & 9216(0x2400, float:1.2914E-41)
            if (r10 == 0) goto L56
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L55
            goto L5a
        L55:
            r8 = r7
        L56:
            y0.n r7 = r7.f21824l     // Catch: java.lang.Throwable -> L19
            goto L48
        L59:
            r8 = r5
        L5a:
            if (r8 != 0) goto L168
        L5c:
            if (r1 == 0) goto Le2
            y0.n r7 = r1.f21819g     // Catch: java.lang.Throwable -> L19
            boolean r7 = r7.f21832t     // Catch: java.lang.Throwable -> L19
            if (r7 != 0) goto L67
            u1.a.b(r3)     // Catch: java.lang.Throwable -> L19
        L67:
            y0.n r7 = r1.f21819g     // Catch: java.lang.Throwable -> L19
            x1.f0 r1 = x1.k.w(r1)     // Catch: java.lang.Throwable -> L19
        L6d:
            if (r1 == 0) goto Ld7
            x1.b1 r8 = r1.L     // Catch: java.lang.Throwable -> L19
            y0.n r8 = r8.f20844f     // Catch: java.lang.Throwable -> L19
            int r8 = r8.f21822j     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto Lc8
        L79:
            if (r7 == 0) goto Lc8
            int r8 = r7.f21821i     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto Lc5
            r9 = r5
            r8 = r7
        L83:
            if (r8 == 0) goto Lc5
            boolean r10 = r8 instanceof q1.e     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L8a
            goto Ld8
        L8a:
            int r10 = r8.f21821i     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto Lc0
            boolean r10 = r8 instanceof x1.j     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto Lc0
            r10 = r8
            x1.j r10 = (x1.j) r10     // Catch: java.lang.Throwable -> L19
            y0.n r10 = r10.f20950v     // Catch: java.lang.Throwable -> L19
            r11 = r2
        L9a:
            if (r10 == 0) goto Lbd
            int r12 = r10.f21821i     // Catch: java.lang.Throwable -> L19
            r12 = r12 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto Lba
            int r11 = r11 + 1
            if (r11 != r6) goto La8
            r8 = r10
            goto Lba
        La8:
            if (r9 != 0) goto Lb1
            j0.b r9 = new j0.b     // Catch: java.lang.Throwable -> L19
            y0.n[] r12 = new y0.n[r4]     // Catch: java.lang.Throwable -> L19
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L19
        Lb1:
            if (r8 == 0) goto Lb7
            r9.b(r8)     // Catch: java.lang.Throwable -> L19
            r8 = r5
        Lb7:
            r9.b(r10)     // Catch: java.lang.Throwable -> L19
        Lba:
            y0.n r10 = r10.f21824l     // Catch: java.lang.Throwable -> L19
            goto L9a
        Lbd:
            if (r11 != r6) goto Lc0
            goto L83
        Lc0:
            y0.n r8 = x1.k.e(r9)     // Catch: java.lang.Throwable -> L19
            goto L83
        Lc5:
            y0.n r7 = r7.f21823k     // Catch: java.lang.Throwable -> L19
            goto L79
        Lc8:
            x1.f0 r1 = r1.u()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto Ld5
            x1.b1 r7 = r1.L     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto Ld5
            x1.b2 r7 = r7.f20843e     // Catch: java.lang.Throwable -> L19
            goto L6d
        Ld5:
            r7 = r5
            goto L6d
        Ld7:
            r8 = r5
        Ld8:
            q1.e r8 = (q1.e) r8     // Catch: java.lang.Throwable -> L19
            if (r8 == 0) goto Le2
            y0.n r8 = (y0.n) r8     // Catch: java.lang.Throwable -> L19
            y0.n r8 = r8.f21819g     // Catch: java.lang.Throwable -> L19
            goto L168
        Le2:
            y0.n r1 = r0.f21819g     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.f21832t     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Leb
            u1.a.b(r3)     // Catch: java.lang.Throwable -> L19
        Leb:
            y0.n r1 = r0.f21819g     // Catch: java.lang.Throwable -> L19
            y0.n r1 = r1.f21823k     // Catch: java.lang.Throwable -> L19
            x1.f0 r0 = x1.k.w(r0)     // Catch: java.lang.Throwable -> L19
        Lf3:
            if (r0 == 0) goto L15d
            x1.b1 r7 = r0.L     // Catch: java.lang.Throwable -> L19
            y0.n r7 = r7.f20844f     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f21822j     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L14e
        Lff:
            if (r1 == 0) goto L14e
            int r7 = r1.f21821i     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L14b
            r7 = r1
            r8 = r5
        L109:
            if (r7 == 0) goto L14b
            boolean r9 = r7 instanceof q1.e     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L110
            goto L15e
        L110:
            int r9 = r7.f21821i     // Catch: java.lang.Throwable -> L19
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L146
            boolean r9 = r7 instanceof x1.j     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L146
            r9 = r7
            x1.j r9 = (x1.j) r9     // Catch: java.lang.Throwable -> L19
            y0.n r9 = r9.f20950v     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L120:
            if (r9 == 0) goto L143
            int r11 = r9.f21821i     // Catch: java.lang.Throwable -> L19
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L140
            int r10 = r10 + 1
            if (r10 != r6) goto L12e
            r7 = r9
            goto L140
        L12e:
            if (r8 != 0) goto L137
            j0.b r8 = new j0.b     // Catch: java.lang.Throwable -> L19
            y0.n[] r11 = new y0.n[r4]     // Catch: java.lang.Throwable -> L19
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L19
        L137:
            if (r7 == 0) goto L13d
            r8.b(r7)     // Catch: java.lang.Throwable -> L19
            r7 = r5
        L13d:
            r8.b(r9)     // Catch: java.lang.Throwable -> L19
        L140:
            y0.n r9 = r9.f21824l     // Catch: java.lang.Throwable -> L19
            goto L120
        L143:
            if (r10 != r6) goto L146
            goto L109
        L146:
            y0.n r7 = x1.k.e(r8)     // Catch: java.lang.Throwable -> L19
            goto L109
        L14b:
            y0.n r1 = r1.f21823k     // Catch: java.lang.Throwable -> L19
            goto Lff
        L14e:
            x1.f0 r0 = r0.u()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15b
            x1.b1 r1 = r0.L     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L15b
            x1.b2 r1 = r1.f20843e     // Catch: java.lang.Throwable -> L19
            goto Lf3
        L15b:
            r1 = r5
            goto Lf3
        L15d:
            r7 = r5
        L15e:
            q1.e r7 = (q1.e) r7     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L167
            y0.n r7 = (y0.n) r7     // Catch: java.lang.Throwable -> L19
            y0.n r8 = r7.f21819g     // Catch: java.lang.Throwable -> L19
            goto L168
        L167:
            r8 = r5
        L168:
            if (r8 == 0) goto L2e1
            y0.n r0 = r8.f21819g     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.f21832t     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L173
            u1.a.b(r3)     // Catch: java.lang.Throwable -> L19
        L173:
            y0.n r0 = r8.f21819g     // Catch: java.lang.Throwable -> L19
            y0.n r0 = r0.f21823k     // Catch: java.lang.Throwable -> L19
            x1.f0 r1 = x1.k.w(r8)     // Catch: java.lang.Throwable -> L19
            r3 = r5
        L17c:
            if (r1 == 0) goto L1f4
            x1.b1 r7 = r1.L     // Catch: java.lang.Throwable -> L19
            y0.n r7 = r7.f20844f     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f21822j     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L1e5
        L188:
            if (r0 == 0) goto L1e5
            int r7 = r0.f21821i     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L1e2
            r7 = r0
            r9 = r5
        L192:
            if (r7 == 0) goto L1e2
            boolean r10 = r7 instanceof q1.e     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L1a4
            if (r3 != 0) goto L19f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L19
        L19f:
            r3.add(r7)     // Catch: java.lang.Throwable -> L19
            r10 = r2
            goto L1a5
        L1a4:
            r10 = r6
        L1a5:
            if (r10 == 0) goto L1dd
            int r10 = r7.f21821i     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto L1dd
            boolean r10 = r7 instanceof x1.j     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L1dd
            r10 = r7
            x1.j r10 = (x1.j) r10     // Catch: java.lang.Throwable -> L19
            y0.n r10 = r10.f20950v     // Catch: java.lang.Throwable -> L19
            r11 = r2
        L1b7:
            if (r10 == 0) goto L1da
            int r12 = r10.f21821i     // Catch: java.lang.Throwable -> L19
            r12 = r12 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L1d7
            int r11 = r11 + 1
            if (r11 != r6) goto L1c5
            r7 = r10
            goto L1d7
        L1c5:
            if (r9 != 0) goto L1ce
            j0.b r9 = new j0.b     // Catch: java.lang.Throwable -> L19
            y0.n[] r12 = new y0.n[r4]     // Catch: java.lang.Throwable -> L19
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L19
        L1ce:
            if (r7 == 0) goto L1d4
            r9.b(r7)     // Catch: java.lang.Throwable -> L19
            r7 = r5
        L1d4:
            r9.b(r10)     // Catch: java.lang.Throwable -> L19
        L1d7:
            y0.n r10 = r10.f21824l     // Catch: java.lang.Throwable -> L19
            goto L1b7
        L1da:
            if (r11 != r6) goto L1dd
            goto L192
        L1dd:
            y0.n r7 = x1.k.e(r9)     // Catch: java.lang.Throwable -> L19
            goto L192
        L1e2:
            y0.n r0 = r0.f21823k     // Catch: java.lang.Throwable -> L19
            goto L188
        L1e5:
            x1.f0 r1 = r1.u()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1f2
            x1.b1 r0 = r1.L     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1f2
            x1.b2 r0 = r0.f20843e     // Catch: java.lang.Throwable -> L19
            goto L17c
        L1f2:
            r0 = r5
            goto L17c
        L1f4:
            if (r3 == 0) goto L215
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + (-1)
            if (r0 < 0) goto L215
        L1fe:
            int r1 = r0 + (-1)
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L19
            q1.e r0 = (q1.e) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.C(r14)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L210
            android.os.Trace.endSection()
            return r6
        L210:
            if (r1 >= 0) goto L213
            goto L215
        L213:
            r0 = r1
            goto L1fe
        L215:
            y0.n r0 = r8.f21819g     // Catch: java.lang.Throwable -> L19
            r1 = r5
        L218:
            if (r0 == 0) goto L265
            boolean r7 = r0 instanceof q1.e     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L22a
            q1.e r0 = (q1.e) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.C(r14)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L260
            android.os.Trace.endSection()
            return r6
        L22a:
            int r7 = r0.f21821i     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L260
            boolean r7 = r0 instanceof x1.j     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L260
            r7 = r0
            x1.j r7 = (x1.j) r7     // Catch: java.lang.Throwable -> L19
            y0.n r7 = r7.f20950v     // Catch: java.lang.Throwable -> L19
            r9 = r2
        L23a:
            if (r7 == 0) goto L25d
            int r10 = r7.f21821i     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto L25a
            int r9 = r9 + 1
            if (r9 != r6) goto L248
            r0 = r7
            goto L25a
        L248:
            if (r1 != 0) goto L251
            j0.b r1 = new j0.b     // Catch: java.lang.Throwable -> L19
            y0.n[] r10 = new y0.n[r4]     // Catch: java.lang.Throwable -> L19
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L19
        L251:
            if (r0 == 0) goto L257
            r1.b(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r5
        L257:
            r1.b(r7)     // Catch: java.lang.Throwable -> L19
        L25a:
            y0.n r7 = r7.f21824l     // Catch: java.lang.Throwable -> L19
            goto L23a
        L25d:
            if (r9 != r6) goto L260
            goto L218
        L260:
            y0.n r0 = x1.k.e(r1)     // Catch: java.lang.Throwable -> L19
            goto L218
        L265:
            java.lang.Object r15 = r15.invoke()     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L19
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r15 == 0) goto L275
            android.os.Trace.endSection()
            return r6
        L275:
            y0.n r15 = r8.f21819g     // Catch: java.lang.Throwable -> L19
            r0 = r5
        L278:
            if (r15 == 0) goto L2c5
            boolean r1 = r15 instanceof q1.e     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L28a
            q1.e r15 = (q1.e) r15     // Catch: java.lang.Throwable -> L19
            boolean r15 = r15.W(r14)     // Catch: java.lang.Throwable -> L19
            if (r15 == 0) goto L2c0
            android.os.Trace.endSection()
            return r6
        L28a:
            int r1 = r15.f21821i     // Catch: java.lang.Throwable -> L19
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L2c0
            boolean r1 = r15 instanceof x1.j     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2c0
            r1 = r15
            x1.j r1 = (x1.j) r1     // Catch: java.lang.Throwable -> L19
            y0.n r1 = r1.f20950v     // Catch: java.lang.Throwable -> L19
            r7 = r2
        L29a:
            if (r1 == 0) goto L2bd
            int r8 = r1.f21821i     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto L2ba
            int r7 = r7 + 1
            if (r7 != r6) goto L2a8
            r15 = r1
            goto L2ba
        L2a8:
            if (r0 != 0) goto L2b1
            j0.b r0 = new j0.b     // Catch: java.lang.Throwable -> L19
            y0.n[] r8 = new y0.n[r4]     // Catch: java.lang.Throwable -> L19
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L19
        L2b1:
            if (r15 == 0) goto L2b7
            r0.b(r15)     // Catch: java.lang.Throwable -> L19
            r15 = r5
        L2b7:
            r0.b(r1)     // Catch: java.lang.Throwable -> L19
        L2ba:
            y0.n r1 = r1.f21824l     // Catch: java.lang.Throwable -> L19
            goto L29a
        L2bd:
            if (r7 != r6) goto L2c0
            goto L278
        L2c0:
            y0.n r15 = x1.k.e(r0)     // Catch: java.lang.Throwable -> L19
            goto L278
        L2c5:
            if (r3 == 0) goto L2e1
            int r15 = r3.size()     // Catch: java.lang.Throwable -> L19
            r0 = r2
        L2cc:
            if (r0 >= r15) goto L2e1
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.Throwable -> L19
            q1.e r1 = (q1.e) r1     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.W(r14)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2de
            android.os.Trace.endSection()
            return r6
        L2de:
            int r0 = r0 + 1
            goto L2cc
        L2e1:
            android.os.Trace.endSection()
            return r2
        L2e5:
            android.os.Trace.endSection()
            throw r14
    }

    public final java.lang.Boolean e(int r20, e1.c r21, fg.l r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            d1.b0 r4 = r0.f1936c
            d1.b0 r5 = d1.d.f(r4)
            r7 = 4
            r8 = 3
            r9 = 6
            r10 = 5
            r11 = 2
            y1.t r13 = r0.f1935b
            r16 = 0
            r17 = 0
            r15 = 1
            if (r5 == 0) goto L1b2
            u2.m r18 = r13.getLayoutDirection()
            d1.t r14 = r5.m1()
            d1.v r6 = r14.f1953h
            d1.v r12 = r14.f1954i
            if (r1 != r15) goto L2e
            d1.v r6 = r14.f1947b
            goto Lb4
        L2e:
            if (r1 != r11) goto L34
            d1.v r6 = r14.f1948c
            goto Lb4
        L34:
            if (r1 != r10) goto L3a
            d1.v r6 = r14.f1949d
            goto Lb4
        L3a:
            if (r1 != r9) goto L40
            d1.v r6 = r14.f1950e
            goto Lb4
        L40:
            if (r1 != r8) goto L5c
            int r9 = r18.ordinal()
            if (r9 == 0) goto L51
            if (r9 != r15) goto L4c
            r6 = r12
            goto L51
        L4c:
            okio.a.k()
            r1 = 0
            return r1
        L51:
            d1.v r9 = d1.v.f1958b
            if (r6 != r9) goto L57
            r6 = r17
        L57:
            if (r6 != 0) goto Lb4
            d1.v r6 = r14.f1951f
            goto Lb4
        L5c:
            if (r1 != r7) goto L78
            int r9 = r18.ordinal()
            if (r9 == 0) goto L6c
            if (r9 != r15) goto L67
            goto L6d
        L67:
            okio.a.k()
            r1 = 0
            return r1
        L6c:
            r6 = r12
        L6d:
            d1.v r9 = d1.v.f1958b
            if (r6 != r9) goto L73
            r6 = r17
        L73:
            if (r6 != 0) goto Lb4
            d1.v r6 = r14.f1952g
            goto Lb4
        L78:
            r6 = 7
            if (r1 != r6) goto L7c
            goto L80
        L7c:
            r9 = 8
            if (r1 != r9) goto L1ab
        L80:
            d1.a r9 = new d1.a
            r9.<init>(r1)
            x1.r1 r12 = x1.k.x(r5)
            y1.t r12 = (y1.t) r12
            d1.l r12 = r12.getFocusOwner()
            d1.p r12 = (d1.p) r12
            d1.b0 r10 = r12.f()
            if (r1 != r6) goto L9d
            gg.m r6 = r14.f1955j
            r6.invoke(r9)
            goto La2
        L9d:
            gg.m r6 = r14.f1956k
            r6.invoke(r9)
        La2:
            boolean r6 = r9.f1897b
            if (r6 == 0) goto La9
            d1.v r6 = d1.v.f1959c
            goto Lb4
        La9:
            d1.b0 r6 = r12.f()
            if (r10 == r6) goto Lb2
            d1.v r6 = d1.v.f1960d
            goto Lb4
        Lb2:
            d1.v r6 = d1.v.f1958b
        Lb4:
            d1.v r9 = d1.v.f1959c
            boolean r10 = gg.l.a(r6, r9)
            if (r10 == 0) goto Lbe
            goto L20a
        Lbe:
            d1.v r10 = d1.v.f1960d
            boolean r10 = gg.l.a(r6, r10)
            if (r10 == 0) goto Ld3
            d1.b0 r1 = d1.d.f(r4)
            if (r1 == 0) goto L20a
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            return r1
        Ld3:
            d1.v r10 = d1.v.f1958b
            boolean r12 = gg.l.a(r6, r10)
            if (r12 != 0) goto L1b4
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r6 == r10) goto L1a6
            if (r6 == r9) goto L1a1
            j0.b r1 = r6.f1961a
            int r2 = r1.f6673i
            if (r2 != 0) goto Lf0
            java.lang.String r1 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
            goto L19c
        Lf0:
            java.lang.Object[] r1 = r1.f6671g
            r4 = r16
            r5 = r4
        Lf5:
            if (r4 >= r2) goto L19a
            r6 = r1[r4]
            d1.x r6 = (d1.x) r6
            y0.n r6 = (y0.n) r6
            y0.n r7 = r6.f21819g
            boolean r7 = r7.f21832t
            if (r7 != 0) goto L108
            java.lang.String r7 = "visitChildren called on an unattached node"
            u1.a.b(r7)
        L108:
            j0.b r7 = new j0.b
            r8 = 16
            y0.n[] r9 = new y0.n[r8]
            r7.<init>(r9)
            y0.n r6 = r6.f21819g
            y0.n r8 = r6.f21824l
            if (r8 != 0) goto L11b
            x1.k.b(r7, r6)
            goto L11e
        L11b:
            r7.b(r8)
        L11e:
            int r6 = r7.f6673i
            if (r6 == 0) goto L196
            int r6 = r6 + (-1)
            java.lang.Object r6 = r7.k(r6)
            y0.n r6 = (y0.n) r6
            int r8 = r6.f21822j
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L134
            x1.k.b(r7, r6)
            goto L11e
        L134:
            if (r6 == 0) goto L11e
            int r8 = r6.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L193
            r8 = r17
        L13e:
            if (r6 == 0) goto L11e
            boolean r9 = r6 instanceof d1.b0
            if (r9 == 0) goto L154
            d1.b0 r6 = (d1.b0) r6
            java.lang.Object r6 = r3.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L18e
            r5 = r15
            goto L196
        L154:
            int r9 = r6.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L18e
            boolean r9 = r6 instanceof x1.j
            if (r9 == 0) goto L18e
            r9 = r6
            x1.j r9 = (x1.j) r9
            y0.n r9 = r9.f20950v
            r10 = r16
        L165:
            if (r9 == 0) goto L18b
            int r11 = r9.f21821i
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L188
            int r10 = r10 + 1
            if (r10 != r15) goto L173
            r6 = r9
            goto L188
        L173:
            if (r8 != 0) goto L17e
            j0.b r8 = new j0.b
            r11 = 16
            y0.n[] r12 = new y0.n[r11]
            r8.<init>(r12)
        L17e:
            if (r6 == 0) goto L185
            r8.b(r6)
            r6 = r17
        L185:
            r8.b(r9)
        L188:
            y0.n r9 = r9.f21824l
            goto L165
        L18b:
            if (r10 != r15) goto L18e
            goto L13e
        L18e:
            y0.n r6 = x1.k.e(r8)
            goto L13e
        L193:
            y0.n r6 = r6.f21824l
            goto L134
        L196:
            int r4 = r4 + 1
            goto Lf5
        L19a:
            r16 = r5
        L19c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            return r1
        L1a1:
            j8.o.A(r1)
            r1 = 0
            return r1
        L1a6:
            j8.o.A(r1)
            r1 = 0
            return r1
        L1ab:
            java.lang.String r1 = "invalid FocusDirection"
            j8.o.A(r1)
            r1 = 0
            return r1
        L1b2:
            r5 = r17
        L1b4:
            u2.m r6 = r13.getLayoutDirection()
            b1.g r9 = new b1.g
            r9.<init>(r5, r0, r3)
            if (r1 != r15) goto L1c0
            goto L1c2
        L1c0:
            if (r1 != r11) goto L1db
        L1c2:
            if (r1 != r15) goto L1c9
            boolean r1 = d1.d.k(r4, r9)
            goto L1cf
        L1c9:
            if (r1 != r11) goto L1d4
            boolean r1 = d1.d.a(r4, r9)
        L1cf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1d4:
            java.lang.String r1 = "This function should only be used for 1-D focus search"
            j8.o.A(r1)
            r1 = 0
            return r1
        L1db:
            if (r1 != r8) goto L1de
            goto L1e8
        L1de:
            if (r1 != r7) goto L1e1
            goto L1e8
        L1e1:
            r3 = 5
            if (r1 != r3) goto L1e5
            goto L1e8
        L1e5:
            r3 = 6
            if (r1 != r3) goto L1ed
        L1e8:
            java.lang.Boolean r1 = d1.d.C(r1, r9, r4, r2)
            return r1
        L1ed:
            r3 = 7
            if (r1 != r3) goto L20b
            int r1 = r6.ordinal()
            if (r1 == 0) goto L1ff
            if (r1 != r15) goto L1fa
            r7 = r8
            goto L1ff
        L1fa:
            okio.a.k()
            r1 = 0
            return r1
        L1ff:
            d1.b0 r1 = d1.d.f(r4)
            if (r1 == 0) goto L20a
            java.lang.Boolean r1 = d1.d.C(r7, r9, r1, r2)
            return r1
        L20a:
            return r17
        L20b:
            r2 = 8
            if (r1 != r2) goto L2ce
            d1.b0 r1 = d1.d.f(r4)
            if (r1 == 0) goto L2b4
            y0.n r2 = r1.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L220
            java.lang.String r2 = "visitAncestors called on an unattached node"
            u1.a.b(r2)
        L220:
            y0.n r2 = r1.f21819g
            y0.n r2 = r2.f21823k
            x1.f0 r1 = x1.k.w(r1)
        L228:
            if (r1 == 0) goto L2b4
            x1.b1 r3 = r1.L
            y0.n r3 = r3.f20844f
            int r3 = r3.f21822j
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L2a0
        L234:
            if (r2 == 0) goto L2a0
            int r3 = r2.f21821i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L29b
            r3 = r2
            r5 = r17
        L23f:
            if (r3 == 0) goto L29b
            boolean r6 = r3 instanceof d1.b0
            if (r6 == 0) goto L255
            d1.b0 r3 = (d1.b0) r3
            d1.t r6 = r3.m1()
            boolean r6 = r6.f1946a
            if (r6 == 0) goto L252
            r15 = r3
            goto L2b6
        L252:
            r8 = 16
            goto L296
        L255:
            int r6 = r3.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L252
            boolean r6 = r3 instanceof x1.j
            if (r6 == 0) goto L252
            r6 = r3
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = r16
        L266:
            if (r6 == 0) goto L291
            int r8 = r6.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L273
            int r7 = r7 + 1
            if (r7 != r15) goto L276
            r3 = r6
        L273:
            r8 = 16
            goto L28e
        L276:
            if (r5 != 0) goto L282
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r10 = new y0.n[r8]
            r5.<init>(r10)
            goto L284
        L282:
            r8 = 16
        L284:
            if (r3 == 0) goto L28b
            r5.b(r3)
            r3 = r17
        L28b:
            r5.b(r6)
        L28e:
            y0.n r6 = r6.f21824l
            goto L266
        L291:
            r8 = 16
            if (r7 != r15) goto L296
            goto L23f
        L296:
            y0.n r3 = x1.k.e(r5)
            goto L23f
        L29b:
            r8 = 16
            y0.n r2 = r2.f21823k
            goto L234
        L2a0:
            r8 = 16
            x1.f0 r1 = r1.u()
            if (r1 == 0) goto L2b0
            x1.b1 r2 = r1.L
            if (r2 == 0) goto L2b0
            x1.b2 r2 = r2.f20843e
            goto L228
        L2b0:
            r2 = r17
            goto L228
        L2b4:
            r15 = r17
        L2b6:
            if (r15 == 0) goto L2c9
            boolean r1 = r15.equals(r4)
            if (r1 == 0) goto L2bf
            goto L2c9
        L2bf:
            java.lang.Object r1 = r9.invoke(r15)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r16 = r1.booleanValue()
        L2c9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            return r1
        L2ce:
            java.lang.String r2 = "Focus search invoked with invalid FocusDirection "
            java.lang.String r1 = d1.f.a(r1)
            g1.d.h(r1, r2)
            r1 = 0
            return r1
    }

    public final d1.b0 f() {
            r3 = this;
            d1.b0 r0 = r3.f1941h
            if (r0 == 0) goto La
            boolean r1 = r0.f21832t
            r2 = 1
            if (r1 != r2) goto La
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean g(int r6, boolean r7) {
            r5 = this;
            d1.b0 r0 = r5.f()
            y1.t r1 = r5.f1934a
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.f1903u
            if (r0 != r2) goto L15
            boolean r0 = r1.z(r6)
            if (r0 == 0) goto L15
            goto L7a
        L15:
            gg.u r0 = new gg.u
            r0.<init>()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f4564g = r3
            d1.b0 r3 = r5.f()
            e1.c r1 = r1.getEmbeddedViewFocusRect()
            d1.n r4 = new d1.n
            r4.<init>(r0, r6)
            java.lang.Boolean r1 = r5.e(r6, r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = gg.l.a(r1, r4)
            if (r4 == 0) goto L3e
            d1.b0 r4 = r5.f()
            if (r3 == r4) goto L3e
            goto L7a
        L3e:
            r3 = 0
            if (r1 == 0) goto L7b
            java.lang.Object r4 = r0.f4564g
            if (r4 != 0) goto L46
            goto L7b
        L46:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L57
            java.lang.Object r0 = r0.f4564g
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            goto L7a
        L57:
            if (r6 != r2) goto L5a
            goto L5d
        L5a:
            r0 = 2
            if (r6 != r0) goto L7b
        L5d:
            if (r7 == 0) goto L7b
            boolean r7 = r5.b(r6, r3, r3)
            if (r7 == 0) goto L7b
            d1.o r7 = new d1.o
            r0 = 1
            r7.<init>(r6, r0)
            r0 = 0
            java.lang.Boolean r6 = r5.e(r6, r0, r7)
            if (r6 == 0) goto L77
            boolean r6 = r6.booleanValue()
            goto L78
        L77:
            r6 = r3
        L78:
            if (r6 == 0) goto L7b
        L7a:
            return r2
        L7b:
            return r3
    }

    public final boolean h(int r4) {
            r3 = this;
            r0 = 0
            boolean r1 = r3.b(r4, r0, r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            d1.o r1 = new d1.o
            r2 = 0
            r1.<init>(r4, r2)
            r2 = 0
            java.lang.Boolean r4 = r3.e(r4, r2, r1)
            if (r4 == 0) goto L19
            boolean r0 = r4.booleanValue()
        L19:
            if (r0 != 0) goto L1e
            r3.c()
        L1e:
            return r0
    }

    public final void i(d1.b0 r6) {
            r5 = this;
            d1.b0 r0 = r5.f1941h
            r5.f1941h = r6
            f.f0 r1 = r5.f1940g
            java.lang.Object[] r2 = r1.f2803a
            int r1 = r1.f2804b
            r3 = 0
        Lb:
            if (r3 >= r1) goto L17
            r4 = r2[r3]
            d1.j r4 = (d1.j) r4
            r4.e(r0, r6)
            int r3 = r3 + 1
            goto Lb
        L17:
            return
    }

    public final boolean j(android.view.KeyEvent r41) {
            r40 = this;
            r0 = r40
            long r1 = q1.d.b(r41)
            int r3 = q1.d.c(r41)
            r4 = 2
            r10 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            r15 = 0
            r17 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            r19 = 254(0xfe, double:1.255E-321)
            r41 = 6
            r5 = 8
            r21 = 0
            r22 = 1
            r6 = 3
            r7 = 1
            if (r3 != r4) goto L2cc
            f.a0 r3 = r0.f1939f
            if (r3 != 0) goto L2e
            f.a0 r3 = new f.a0
            r3.<init>(r6)
            r0.f1939f = r3
        L2e:
            r4 = r3
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 * r10
            int r24 = r3 << 16
            r3 = r3 ^ r24
            r24 = r6
            int r6 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r25 = 63
            int r8 = r4.f2770c
            r26 = r6 & r8
            r27 = r21
            r28 = 7
        L48:
            long[] r9 = r4.f2768a
            int r29 = r26 >> 3
            r30 = r26 & 7
            r31 = r10
            int r10 = r30 << 3
            r32 = r9[r29]
            long r32 = r32 >>> r10
            int r29 = r29 + 1
            r29 = r9[r29]
            int r9 = 64 - r10
            long r29 = r29 << r9
            long r9 = (long) r10
            long r9 = -r9
            long r9 = r9 >> r25
            long r9 = r29 & r9
            long r9 = r32 | r9
            r29 = 255(0xff, double:1.26E-321)
            long r11 = (long) r3
            long r32 = r11 * r17
            r34 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r9 ^ r32
            long r32 = r13 - r17
            long r13 = ~r13
            long r13 = r32 & r13
            long r13 = r13 & r34
        L79:
            int r32 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r32 == 0) goto L9b
            int r32 = java.lang.Long.numberOfTrailingZeros(r13)
            int r32 = r32 >> 3
            int r32 = r26 + r32
            r32 = r32 & r8
            r36 = r15
            long[] r15 = r4.f2769b
            r38 = r15[r32]
            int r15 = (r38 > r1 ? 1 : (r38 == r1 ? 0 : -1))
            if (r15 != 0) goto L95
            r33 = r7
            goto L2b4
        L95:
            long r15 = r13 - r22
            long r13 = r13 & r15
            r15 = r36
            goto L79
        L9b:
            r36 = r15
            long r13 = ~r9
            long r13 = r13 << r41
            long r9 = r9 & r13
            long r9 = r9 & r34
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L2b9
            int r3 = r4.b(r6)
            int r8 = r4.f2772e
            if (r8 != 0) goto Lc0
            long[] r8 = r4.f2768a
            int r13 = r3 >> 3
            r13 = r8[r13]
            r8 = r3 & 7
            int r8 = r8 << 3
            long r13 = r13 >> r8
            long r13 = r13 & r29
            int r8 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r8 != 0) goto Lc6
        Lc0:
            r33 = r7
            r17 = 128(0x80, double:6.3E-322)
            goto L27d
        Lc6:
            int r3 = r4.f2770c
            if (r3 <= r5) goto L201
            int r8 = r4.f2771d
            long r13 = (long) r8
            r15 = 32
            long r13 = r13 * r15
            r15 = 128(0x80, double:6.3E-322)
            long r9 = (long) r3
            r17 = 25
            long r9 = r9 * r17
            int r3 = java.lang.Long.compareUnsigned(r13, r9)
            if (r3 > 0) goto L1fa
            long[] r3 = r4.f2768a
            int r8 = r4.f2770c
            long[] r9 = r4.f2769b
            int r10 = r8 + 7
            int r10 = r10 >> 3
            r13 = r21
        Le9:
            if (r13 >= r10) goto L10b
            r17 = r3[r13]
            r14 = r5
            r32 = r6
            long r5 = r17 & r34
            r17 = r15
            r16 = r14
            long r14 = ~r5
            long r5 = r5 >>> r28
            long r14 = r14 + r5
            r5 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r5 = r5 & r14
            r3[r13] = r5
            int r13 = r13 + 1
            r5 = r16
            r15 = r17
            r6 = r32
            goto Le9
        L10b:
            r32 = r6
            r17 = r15
            r16 = r5
            int r5 = tf.l.B0(r3)
            int r6 = r5 + (-1)
            r13 = r3[r6]
            r22 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r13 = r13 & r22
            r25 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r13 = r13 | r25
            r3[r6] = r13
            r13 = r3[r21]
            r3[r5] = r13
            r5 = r21
        L12c:
            if (r5 == r8) goto L1e9
            int r6 = r5 >> 3
            r13 = r3[r6]
            r10 = r5 & 7
            int r10 = r10 << 3
            long r13 = r13 >> r10
            long r13 = r13 & r29
            int r15 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r15 != 0) goto L140
        L13d:
            int r5 = r5 + 1
            goto L12c
        L140:
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 == 0) goto L145
            goto L13d
        L145:
            r13 = r9[r5]
            int r13 = java.lang.Long.hashCode(r13)
            int r13 = r13 * r31
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r15 = r4.b(r14)
            r14 = r14 & r8
            int r25 = r15 - r14
            r25 = r25 & r8
            r33 = r7
            int r7 = r25 / 8
            int r14 = r5 - r14
            r14 = r14 & r8
            int r14 = r14 / 8
            r25 = -9223372036854775808
            if (r7 != r14) goto L189
            r7 = r13 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r7
            r34 = r3[r6]
            r7 = r5
            r41 = r6
            long r5 = r29 << r10
            long r5 = ~r5
            long r5 = r34 & r5
            long r13 = r13 << r10
            long r5 = r5 | r13
            r3[r41] = r5
            int r5 = r3.length
            int r5 = r5 + (-1)
            r13 = r3[r21]
            long r13 = r13 & r22
            long r13 = r13 | r25
            r3[r5] = r13
            int r5 = r7 + 1
        L186:
            r7 = r33
            goto L12c
        L189:
            r7 = r5
            r41 = r6
            int r5 = r15 >> 3
            r34 = r3[r5]
            r6 = r15 & 7
            int r6 = r6 << 3
            long r38 = r34 >> r6
            long r38 = r38 & r29
            int r14 = (r38 > r17 ? 1 : (r38 == r17 ? 0 : -1))
            if (r14 != 0) goto L1c0
            r13 = r13 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r13
            r27 = r5
            r38 = r6
            long r5 = r29 << r38
            long r5 = ~r5
            long r5 = r34 & r5
            long r13 = r13 << r38
            long r5 = r5 | r13
            r3[r27] = r5
            r5 = r3[r41]
            long r13 = r29 << r10
            long r13 = ~r13
            long r5 = r5 & r13
            long r13 = r17 << r10
            long r5 = r5 | r13
            r3[r41] = r5
            r5 = r9[r7]
            r9[r15] = r5
            r9[r7] = r36
            r5 = r7
            goto L1db
        L1c0:
            r27 = r5
            r38 = r6
            r5 = r13 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r13 = r29 << r38
            long r13 = ~r13
            long r13 = r34 & r13
            long r5 = r5 << r38
            long r5 = r5 | r13
            r3[r27] = r5
            r5 = r9[r15]
            r13 = r9[r7]
            r9[r15] = r13
            r9[r7] = r5
            int r5 = r7 + (-1)
        L1db:
            int r6 = r3.length
            int r6 = r6 + (-1)
            r13 = r3[r21]
            long r13 = r13 & r22
            long r13 = r13 | r25
            r3[r6] = r13
            int r5 = r5 + 1
            goto L186
        L1e9:
            r33 = r7
            int r3 = r4.f2770c
            int r3 = f.r0.a(r3)
            int r5 = r4.f2771d
            int r3 = r3 - r5
            r4.f2772e = r3
        L1f6:
            r5 = r32
            goto L279
        L1fa:
            r17 = r15
        L1fc:
            r32 = r6
            r33 = r7
            goto L204
        L201:
            r17 = 128(0x80, double:6.3E-322)
            goto L1fc
        L204:
            int r3 = r4.f2770c
            int r3 = f.r0.b(r3)
            long[] r5 = r4.f2768a
            long[] r6 = r4.f2769b
            int r7 = r4.f2770c
            r4.c(r3)
            long[] r3 = r4.f2768a
            long[] r8 = r4.f2769b
            int r9 = r4.f2770c
            r10 = r21
        L21b:
            if (r10 >= r7) goto L1f6
            int r13 = r10 >> 3
            r13 = r5[r13]
            r15 = r10 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r29
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L26a
            r13 = r6[r10]
            int r15 = java.lang.Long.hashCode(r13)
            int r15 = r15 * r31
            int r16 = r15 << 16
            r15 = r15 ^ r16
            r16 = r3
            int r3 = r15 >>> 7
            int r3 = r4.b(r3)
            r15 = r15 & 127(0x7f, float:1.78E-43)
            r19 = r5
            r20 = r6
            long r5 = (long) r15
            int r15 = r3 >> 3
            r22 = r3 & 7
            int r22 = r22 << 3
            r25 = r16[r15]
            r34 = r5
            long r5 = r29 << r22
            long r5 = ~r5
            long r5 = r25 & r5
            long r22 = r34 << r22
            long r5 = r5 | r22
            r16[r15] = r5
            int r15 = r3 + (-7)
            r15 = r15 & r9
            r22 = r9 & 7
            int r15 = r15 + r22
            int r15 = r15 >> 3
            r16[r15] = r5
            r8[r3] = r13
            goto L270
        L26a:
            r16 = r3
            r19 = r5
            r20 = r6
        L270:
            int r10 = r10 + 1
            r3 = r16
            r5 = r19
            r6 = r20
            goto L21b
        L279:
            int r3 = r4.b(r5)
        L27d:
            r32 = r3
            int r3 = r4.f2771d
            int r3 = r3 + 1
            r4.f2771d = r3
            int r3 = r4.f2772e
            long[] r5 = r4.f2768a
            int r6 = r32 >> 3
            r7 = r5[r6]
            r9 = r32 & 7
            int r9 = r9 << 3
            long r13 = r7 >> r9
            long r13 = r13 & r29
            int r10 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r10 != 0) goto L29b
            r21 = r33
        L29b:
            int r3 = r3 - r21
            r4.f2772e = r3
            int r3 = r4.f2770c
            long r13 = r29 << r9
            long r13 = ~r13
            long r7 = r7 & r13
            long r9 = r11 << r9
            long r7 = r7 | r9
            r5[r6] = r7
            int r6 = r32 + (-7)
            r6 = r6 & r3
            r3 = r3 & 7
            int r6 = r6 + r3
            int r3 = r6 >> 3
            r5[r3] = r7
        L2b4:
            long[] r3 = r4.f2769b
            r3[r32] = r1
            return r33
        L2b9:
            r16 = r5
            r5 = r6
            r33 = r7
            int r27 = r27 + 8
            int r26 = r26 + r27
            r26 = r26 & r8
            r5 = r16
            r10 = r31
            r15 = r36
            goto L48
        L2cc:
            r24 = r6
            r31 = r10
            r36 = r15
            r25 = 63
            r28 = 7
            r29 = 255(0xff, double:1.26E-321)
            r34 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r16 = r5
            if (r3 != r7) goto L382
            f.a0 r3 = r0.f1939f
            if (r3 == 0) goto L381
            boolean r3 = r3.a(r1)
            if (r3 != r7) goto L381
            f.a0 r3 = r0.f1939f
            if (r3 == 0) goto L376
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 * r31
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r3.f2770c
            int r4 = r4 >>> 7
        L2fe:
            r4 = r4 & r6
            long[] r7 = r3.f2768a
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r33 = 1
            int r8 = r8 + 1
            r12 = r7[r8]
            int r7 = 64 - r9
            long r7 = r12 << r7
            long r12 = (long) r9
            long r12 = -r12
            long r12 = r12 >> r25
            long r7 = r7 & r12
            long r7 = r7 | r10
            long r9 = (long) r5
            long r9 = r9 * r17
            long r9 = r9 ^ r7
            long r11 = r9 - r17
            long r9 = ~r9
            long r9 = r9 & r11
            long r9 = r9 & r34
        L324:
            int r11 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r11 == 0) goto L33d
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r4
            r11 = r11 & r6
            long[] r12 = r3.f2769b
            r13 = r12[r11]
            int r12 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r12 != 0) goto L339
            goto L348
        L339:
            long r11 = r9 - r22
            long r9 = r9 & r11
            goto L324
        L33d:
            long r9 = ~r7
            long r9 = r9 << r41
            long r7 = r7 & r9
            long r7 = r7 & r34
            int r7 = (r7 > r36 ? 1 : (r7 == r36 ? 0 : -1))
            if (r7 == 0) goto L379
            r11 = -1
        L348:
            if (r11 < 0) goto L376
            int r1 = r3.f2771d
            r33 = 1
            int r1 = r1 + (-1)
            r3.f2771d = r1
            long[] r1 = r3.f2768a
            int r2 = r3.f2770c
            int r3 = r11 >> 3
            r4 = r11 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            long r7 = r29 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r19 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r11 = r11 + (-7)
            r3 = r11 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            r33 = 1
            return r33
        L376:
            r33 = 1
            goto L384
        L379:
            r33 = 1
            int r21 = r21 + 8
            int r4 = r4 + r21
            goto L2fe
        L381:
            return r21
        L382:
            r33 = r7
        L384:
            return r33
    }
}
