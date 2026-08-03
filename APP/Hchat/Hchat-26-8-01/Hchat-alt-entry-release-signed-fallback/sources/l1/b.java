package l1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.r0 f7731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.d f7732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.e f7733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f1.n f7735i;

    public b(f1.r0 r1, l1.d r2, b.e r3) {
            r0 = this;
            r0.<init>()
            r0.f7731e = r1
            r0.f7732f = r2
            r0.f7733g = r3
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f7734h = r1
            return
    }

    @Override // k1.b
    public final void a(float r1) {
            r0 = this;
            r0.f7734h = r1
            return
    }

    @Override // k1.b
    public final void b(f1.n r1) {
            r0 = this;
            r0.f7735i = r1
            return
    }

    @Override // k1.b
    public final long d() {
            r2 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r0
    }

    @Override // k1.b
    public final void e(x1.h0 r18) {
            r17 = this;
            r1 = r17
            r3 = r18
            b.e r2 = r1.f7733g
            f1.r0 r0 = r1.f7731e
            h1.b r4 = r3.f20932g
            long r4 = r4.a()
            u2.m r6 = r3.getLayoutDirection()
            l1.d r7 = r1.f7732f
            monitor-enter(r2)
            java.lang.Object r8 = r2.f333i     // Catch: java.lang.Throwable -> L8d
            l1.a r8 = (l1.a) r8     // Catch: java.lang.Throwable -> L8d
            if (r8 != 0) goto L2c
            l1.a r9 = new l1.a     // Catch: java.lang.Throwable -> L8d
            f1.m0 r10 = f1.c0.f3038b     // Catch: java.lang.Throwable -> L8d
            u2.m r13 = u2.m.f13354g     // Catch: java.lang.Throwable -> L8d
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r11 = 0
            r9.<init>(r10, r11, r13, r14, r15)     // Catch: java.lang.Throwable -> L8d
            r2.f333i = r9     // Catch: java.lang.Throwable -> L8d
            r8 = r9
        L2c:
            r8.f7726a = r0     // Catch: java.lang.Throwable -> L8d
            r8.f7727b = r4     // Catch: java.lang.Throwable -> L8d
            r8.f7728c = r6     // Catch: java.lang.Throwable -> L8d
            h1.b r9 = r3.f20932g     // Catch: java.lang.Throwable -> L8d
            float r9 = r9.d()     // Catch: java.lang.Throwable -> L8d
            r8.f7729d = r9     // Catch: java.lang.Throwable -> L8d
            l1.d r10 = new l1.d     // Catch: java.lang.Throwable -> L8d
            float r11 = r7.f7747a     // Catch: java.lang.Throwable -> L8d
            float r12 = r7.f7748b     // Catch: java.lang.Throwable -> L8d
            long r13 = r7.f7750d     // Catch: java.lang.Throwable -> L8d
            float r15 = r7.f7751e     // Catch: java.lang.Throwable -> L8d
            int r9 = r7.f7749c     // Catch: java.lang.Throwable -> L8d
            r16 = r9
            r10.<init>(r11, r12, r13, r15, r16)     // Catch: java.lang.Throwable -> L8d
            r8.f7730e = r10     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r9 = r2.f332h     // Catch: java.lang.Throwable -> L8d
            f.k0 r9 = (f.k0) r9     // Catch: java.lang.Throwable -> L8d
            if (r9 != 0) goto L5a
            f.k0 r9 = new f.k0     // Catch: java.lang.Throwable -> L8d
            r9.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.f332h = r9     // Catch: java.lang.Throwable -> L8d
        L5a:
            java.lang.Object r9 = r9.g(r8)     // Catch: java.lang.Throwable -> L8d
            l1.c r9 = (l1.c) r9     // Catch: java.lang.Throwable -> L8d
            if (r9 != 0) goto L8f
            f1.c0 r0 = r0.a(r4, r6, r3)     // Catch: java.lang.Throwable -> L8d
            l1.c r9 = new l1.c     // Catch: java.lang.Throwable -> L8d
            r9.<init>(r7, r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r2.f332h     // Catch: java.lang.Throwable -> L8d
            f.k0 r0 = (f.k0) r0     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L78
            f.k0 r0 = new f.k0     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.f332h = r0     // Catch: java.lang.Throwable -> L8d
        L78:
            f1.r0 r11 = r8.f7726a     // Catch: java.lang.Throwable -> L8d
            long r12 = r8.f7727b     // Catch: java.lang.Throwable -> L8d
            u2.m r14 = r8.f7728c     // Catch: java.lang.Throwable -> L8d
            float r15 = r8.f7729d     // Catch: java.lang.Throwable -> L8d
            l1.d r4 = r8.f7730e     // Catch: java.lang.Throwable -> L8d
            l1.a r10 = new l1.a     // Catch: java.lang.Throwable -> L8d
            r16 = r4
            r10.<init>(r11, r12, r14, r15, r16)     // Catch: java.lang.Throwable -> L8d
            r0.m(r10, r9)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r0 = move-exception
            goto Lf7
        L8f:
            monitor-exit(r2)
            l1.d r0 = r1.f7732f
            r0.getClass()
            r4 = 0
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r11 = r3.x0(r0)
            l1.d r0 = r1.f7732f
            r0.getClass()
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r12 = r3.x0(r0)
            h1.b r0 = r3.f20932g
            b5.c r0 = r0.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.c0(r11, r12)
            f1.n r4 = r1.f7735i     // Catch: java.lang.Throwable -> Le8
            h1.b r0 = r3.f20932g     // Catch: java.lang.Throwable -> Le8
            long r5 = r0.a()     // Catch: java.lang.Throwable -> Le8
            l1.d r0 = r9.f7744i     // Catch: java.lang.Throwable -> Le8
            long r7 = r0.f7750d     // Catch: java.lang.Throwable -> Le8
            float r2 = r1.f7734h     // Catch: java.lang.Throwable -> Le8
            float r0 = r0.f7751e     // Catch: java.lang.Throwable -> Le8
            float r2 = r2 * r0
            r0 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.e0.q(r2, r0, r10)     // Catch: java.lang.Throwable -> Le8
            l1.d r2 = r9.f7744i     // Catch: java.lang.Throwable -> Le8
            int r10 = r2.f7749c     // Catch: java.lang.Throwable -> Le8
            r2 = r9
            r9 = r0
            r2.a(r3, r4, r5, r7, r9, r10)     // Catch: java.lang.Throwable -> Le8
            h1.b r0 = r3.f20932g
            b5.c r0 = r0.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            float r2 = -r11
            float r3 = -r12
            r0.c0(r2, r3)
            return
        Le8:
            r0 = move-exception
            h1.b r2 = r3.f20932g
            b5.c r2 = r2.f5038h
            java.lang.Object r2 = r2.f469a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            float r3 = -r11
            float r4 = -r12
            r2.c0(r3, r4)
            throw r0
        Lf7:
            monitor-exit(r2)
            throw r0
    }
}
