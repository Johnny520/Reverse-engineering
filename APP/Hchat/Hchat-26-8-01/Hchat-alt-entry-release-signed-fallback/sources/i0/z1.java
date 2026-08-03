package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements i0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.v f6126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.f0 f6127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f6128i;

    public z1(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            f.v r0 = new f.v
            r0.<init>()
            r1.f6126g = r0
            f.f0 r0 = new f.f0
            r0.<init>()
            r1.f6127h = r0
            r1.f6128i = r2
            return
    }

    public final void a(x1.f2 r11, b5.i r12) {
            r10 = this;
            f.v r3 = r10.f6126g
            int r0 = r3.f2916b
            f.f0 r2 = new f.f0
            r2.<init>()
            r1 = 0
            r4 = r1
            r5 = r4
            r6 = r5
        Ld:
            f.f0 r1 = r10.f6127h
            if (r4 >= r0) goto Lc8
            int r7 = r4 + 1
            int r8 = r3.c(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            switch(r8) {
                case 0: goto Lc4;
                case 1: goto Lb9;
                case 2: goto La8;
                case 3: goto L87;
                case 4: goto L83;
                case 5: goto L72;
                case 6: goto L5e;
                case 7: goto L44;
                case 8: goto L1b;
                default: goto L1a;
            }     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
        L1a:
            goto L5c
        L1b:
            java.lang.Object r4 = r11.f20913i     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            boolean r8 = r4 instanceof i0.h     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            if (r8 == 0) goto L3d
            r8 = r4
            i0.h r8 = (i0.h) r8     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            java.lang.Object r9 = r12.f481g     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            j0.b r9 = (j0.b) r9     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            boolean r9 = r9.j(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            if (r9 == 0) goto L3d
            r8.b()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L3d
        L32:
            r5 = r12
            r4 = r7
            goto Ldb
        L36:
            r0 = move-exception
            r12 = r0
            goto Le3
        L3a:
            r0 = move-exception
            r12 = r0
            goto L32
        L3d:
            r2.a(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.f()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        L44:
            int r4 = r5 + 1
            java.lang.Object r8 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r8.getClass()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r9 = 2
            gg.x.c(r9, r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            fg.p r8 = (fg.p) r8     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            int r5 = r5 + 2
            java.lang.Object r4 = r1.f(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.t(r8, r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
        L5c:
            r4 = r7
            goto Ld
        L5e:
            int r4 = r4 + 2
            r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            int r7 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            x1.f0 r5 = (x1.f0) r5     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r5 = r7
            goto Ld
        L6d:
            r0 = move-exception
            r12 = r0
            r5 = r12
            goto Ldb
        L72:
            int r4 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            int r8 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.c(r7, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r5 = r8
            goto Ld
        L83:
            r11.a()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        L87:
            int r8 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> La3
            int r9 = r4 + 3
            int r8 = r3.c(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L9e
            int r4 = r4 + 4
            int r9 = r3.c(r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.h(r7, r8, r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            goto Ld
        L9e:
            r0 = move-exception
            r12 = r0
            r5 = r12
            r4 = r9
            goto Ldb
        La3:
            r0 = move-exception
            r12 = r0
            r5 = r12
            r4 = r8
            goto Ldb
        La8:
            int r8 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> La3
            int r4 = r4 + 3
            int r8 = r3.c(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.i(r7, r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            goto Ld
        Lb9:
            int r4 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.d(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r5 = r4
            goto L5c
        Lc4:
            r11.k()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        Lc8:
            int r12 = r1.f2804b     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            if (r5 != r12) goto Lcd
            goto Ld2
        Lcd:
            java.lang.String r12 = "Applier operation size mismatch"
            i0.m.a(r12)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
        Ld2:
            r1.d()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r3.f2916b = r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.q()
            return
        Ldb:
            i0.j r0 = new i0.j     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + (-1)
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        Le3:
            r11.q()
            throw r12
    }

    @Override // i0.a
    public final void c(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 5
            f.v r1 = r2.f6126g
            r1.a(r0)
            r1.a(r3)
            f.f0 r3 = r2.f6127h
            r3.a(r4)
            return
    }

    @Override // i0.a
    public final void d(java.lang.Object r3) {
            r2 = this;
            f.v r0 = r2.f6126g
            r1 = 1
            r0.a(r1)
            f.f0 r0 = r2.f6127h
            r0.a(r3)
            return
    }

    @Override // i0.a
    public final void f() {
            r2 = this;
            f.v r0 = r2.f6126g
            r1 = 8
            r0.a(r1)
            return
    }

    @Override // i0.a
    public final void h(int r3, int r4, int r5) {
            r2 = this;
            r0 = 3
            f.v r1 = r2.f6126g
            r1.a(r0)
            r1.a(r3)
            r1.a(r4)
            r1.a(r5)
            return
    }

    @Override // i0.a
    public final void i(int r3, int r4) {
            r2 = this;
            r0 = 2
            f.v r1 = r2.f6126g
            r1.a(r0)
            r1.a(r3)
            r1.a(r4)
            return
    }

    @Override // i0.a
    public final void k() {
            r2 = this;
            f.v r0 = r2.f6126g
            r1 = 0
            r0.a(r1)
            return
    }

    @Override // i0.a
    public final void p(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 6
            f.v r1 = r2.f6126g
            r1.a(r0)
            r1.a(r3)
            f.f0 r3 = r2.f6127h
            r3.a(r4)
            return
    }

    @Override // i0.a
    public final java.lang.Object r() {
            r1 = this;
            java.lang.Object r0 = r1.f6128i
            return r0
    }

    @Override // i0.a
    public final void t(fg.p r3, java.lang.Object r4) {
            r2 = this;
            f.v r0 = r2.f6126g
            r1 = 7
            r0.a(r1)
            f.f0 r0 = r2.f6127h
            r0.a(r3)
            r0.a(r4)
            return
    }
}
