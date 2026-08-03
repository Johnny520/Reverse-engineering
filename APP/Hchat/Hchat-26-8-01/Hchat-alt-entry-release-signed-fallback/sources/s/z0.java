package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements s.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.c f12158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.l f12159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u2.a f12160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v1.h1 f12161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v1.i0 f12162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f12166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s.y0 f12168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j8.f f12174r;

    public z0(j8.f r1, int r2, b5.c r3, o9.e r4) {
            r0 = this;
            r0.<init>()
            r0.f12174r = r1
            r0.f12157a = r2
            r0.f12158b = r3
            r0.f12159c = r4
            int r1 = pg.d.f10564b
            long r1 = java.lang.System.nanoTime()
            long r3 = pg.d.f10563a
            long r1 = r1 - r3
            r0.f12172p = r1
            return
    }

    @Override // s.l0
    public final void a() {
            r1 = this;
            r0 = 1
            r1.f12169m = r0
            return
    }

    public final void b() {
            r2 = this;
            v1.i0 r0 = r2.f12162f
            if (r0 == 0) goto L1c
            int r1 = r0.f13949a
            switch(r1) {
                case 0: goto L1c;
                default: goto L9;
            }
        L9:
            v1.b0 r1 = r0.b()
            if (r1 == 0) goto L12
            i0.l1 r1 = r1.f13897f
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1c
            v1.j0 r1 = r0.f13950b
            java.lang.Object r0 = r0.f13951c
            v1.j0.c(r1, r0)
        L1c:
            r0 = 0
            r2.f12162f = r0
            v1.h1 r1 = r2.f12161e
            if (r1 == 0) goto L26
            r1.a()
        L26:
            r2.f12161e = r0
            r2.f12168l = r0
            return
    }

    public final boolean c(s.a r4) {
            r3 = this;
            j8.f r0 = r3.f12174r
            boolean r0 = r0.f6780a
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            boolean r0 = r3.f12169m
            if (r0 == 0) goto L1e
            java.lang.String r0 = "compose:lazy:prefetch:execute:urgent"
            android.os.Trace.beginSection(r0)
            boolean r4 = r3.d(r4)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            goto L22
        L19:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L1e:
            boolean r4 = r3.d(r4)
        L22:
            java.lang.String r0 = "compose:lazy:prefetch:execute:item"
            r1 = -1
            f8.i.K0(r1, r0)
            return r4
    }

    @Override // s.l0
    public final void cancel() {
            r1 = this;
            boolean r0 = r1.f12164h
            if (r0 != 0) goto La
            r0 = 1
            r1.f12164h = r0
            r1.b()
        La:
            return
    }

    public final boolean d(s.a r26) {
            r25 = this;
            r1 = r25
            int r0 = r1.f12157a
            long r2 = (long) r0
            java.lang.String r4 = "compose:lazy:prefetch:execute:item"
            f8.i.K0(r2, r4)
            j8.f r5 = r1.f12174r
            java.lang.Object r5 = r5.f6781b
            s.b0 r5 = (s.b0) r5
            b0.j r5 = r5.f11981b
            java.lang.Object r5 = r5.invoke()
            r.k r5 = (r.k) r5
            boolean r6 = r1.f12164h
            r7 = 0
            if (r6 != 0) goto L35e
            int r6 = r5.c()
            if (r0 < 0) goto L35e
            if (r0 >= r6) goto L35e
            java.lang.Object r6 = r5.d(r0)
            java.lang.Object r8 = r1.f12166j
            if (r8 == 0) goto L37
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L37
            r1.b()
            return r7
        L37:
            java.lang.Object r0 = r5.b(r0)
            b5.c r5 = r1.f12158b
            java.lang.Object r8 = r5.f471c
            s.c r8 = (s.c) r8
            java.lang.Object r9 = r5.f470b
            r10 = -1
            if (r9 != r0) goto L49
            if (r8 == 0) goto L49
            goto L64
        L49:
            java.lang.Object r8 = r5.f469a
            f.k0 r8 = (f.k0) r8
            java.lang.Object r9 = r8.g(r0)
            if (r9 != 0) goto L5d
            s.c r9 = new s.c
            r9.<init>()
            r9.f11987e = r10
            r8.m(r0, r9)
        L5d:
            r8 = r9
            s.c r8 = (s.c) r8
            r5.f470b = r0
            r5.f471c = r8
        L64:
            r1.e()
            long r11 = r26.a()
            r1.f12170n = r11
            int r5 = pg.d.f10564b
            long r13 = java.lang.System.nanoTime()
            long r15 = pg.d.f10563a
            long r13 = r13 - r15
            r1.f12172p = r13
            r13 = 0
            r1.f12171o = r13
            java.lang.String r5 = "compose:lazy:prefetch:available_time_nanos"
            f8.i.K0(r11, r5)
            boolean r5 = r1.e()
            if (r5 != 0) goto Lb0
            long r11 = r1.f12170n
            r15 = r13
            long r13 = r8.f11983a
            long r9 = r8.f11984b
            long r13 = r13 + r9
            boolean r9 = r1.g(r11, r13)
            if (r9 == 0) goto La6
            java.lang.String r9 = "compose:lazy:prefetch:compose"
            android.os.Trace.beginSection(r9)
            r1.f(r6, r0, r8)     // Catch: java.lang.Throwable -> La1
            android.os.Trace.endSection()
            goto La6
        La1:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La6:
            boolean r0 = r1.e()
            if (r0 != 0) goto Lb1
        Lac:
            r17 = 1
            goto L2fc
        Lb0:
            r15 = r13
        Lb1:
            v1.i0 r0 = r1.f12162f
            r6 = 0
            if (r0 == 0) goto L10d
            long r9 = r1.f12170n
            long r11 = r8.f11985c
            boolean r0 = r1.g(r9, r11)
            if (r0 == 0) goto Lac
            java.lang.String r0 = "compose:lazy:prefetch:apply"
            android.os.Trace.beginSection(r0)
            v1.i0 r0 = r1.f12162f     // Catch: java.lang.Throwable -> L108
            if (r0 == 0) goto L100
            int r9 = r0.f13949a     // Catch: java.lang.Throwable -> L108
            switch(r9) {
                case 0: goto Le0;
                default: goto Lce;
            }     // Catch: java.lang.Throwable -> L108
        Lce:
            v1.j0 r9 = r0.f13950b     // Catch: java.lang.Throwable -> L108
            v1.b0 r10 = r0.b()     // Catch: java.lang.Throwable -> L108
            if (r10 == 0) goto Ld9
            r9.d(r10, r7)     // Catch: java.lang.Throwable -> L108
        Ld9:
            java.lang.Object r0 = r0.f13951c     // Catch: java.lang.Throwable -> L108
            v1.h1 r0 = r9.f(r0)     // Catch: java.lang.Throwable -> L108
            goto Le8
        Le0:
            v1.j0 r9 = r0.f13950b     // Catch: java.lang.Throwable -> L108
            java.lang.Object r0 = r0.f13951c     // Catch: java.lang.Throwable -> L108
            v1.h1 r0 = r9.f(r0)     // Catch: java.lang.Throwable -> L108
        Le8:
            r1.f12161e = r0     // Catch: java.lang.Throwable -> L108
            r1.f12162f = r6     // Catch: java.lang.Throwable -> L108
            r0 = 1
            r1.f12165i = r0     // Catch: java.lang.Throwable -> L108
            android.os.Trace.endSection()
            r1.h()
            long r9 = r1.f12171o
            long r11 = r8.f11985c
            long r9 = s.c.a(r9, r11)
            r8.f11985c = r9
            goto L10d
        L100:
            java.lang.String r0 = "Nothing to apply!"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L108
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L108
            throw r2     // Catch: java.lang.Throwable -> L108
        L108:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L10d:
            boolean r0 = r1.f12167k
            if (r0 != 0) goto L153
            long r9 = r1.f12170n
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lac
            java.lang.String r0 = "compose:lazy:prefetch:resolve-nested"
            android.os.Trace.beginSection(r0)
            v1.h1 r0 = r1.f12161e     // Catch: java.lang.Throwable -> L14e
            if (r0 == 0) goto L13c
            gg.u r9 = new gg.u     // Catch: java.lang.Throwable -> L14e
            r9.<init>()     // Catch: java.lang.Throwable -> L14e
            d9.g r10 = new d9.g     // Catch: java.lang.Throwable -> L14e
            r11 = 1
            r10.<init>(r9, r11)     // Catch: java.lang.Throwable -> L14e
            r0.d(r10)     // Catch: java.lang.Throwable -> L14e
            java.lang.Object r0 = r9.f4564g     // Catch: java.lang.Throwable -> L14e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L14e
            if (r0 == 0) goto L13a
            s.y0 r9 = new s.y0     // Catch: java.lang.Throwable -> L14e
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> L14e
            goto L145
        L13a:
            r9 = r6
            goto L145
        L13c:
            java.lang.String r0 = "Should precompose before resolving nested prefetch states"
            o.b.b(r0)     // Catch: java.lang.Throwable -> L14e
            okio.a.c()     // Catch: java.lang.Throwable -> L14e
            goto L13a
        L145:
            r1.f12168l = r9     // Catch: java.lang.Throwable -> L14e
            r0 = 1
            r1.f12167k = r0     // Catch: java.lang.Throwable -> L14e
            android.os.Trace.endSection()
            goto L153
        L14e:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L153:
            s.y0 r0 = r1.f12168l
            if (r0 == 0) goto L282
            int r9 = r8.f11987e
            boolean r10 = r1.f12169m
            java.util.List[] r11 = r0.f12141b
            int r12 = r0.f12142c
            java.util.List r13 = r0.f12140a
            int r14 = r13.size()
            if (r12 < r14) goto L169
            goto L282
        L169:
            s.z0 r12 = r0.f12145f
            boolean r12 = r12.f12164h
            if (r12 == 0) goto L174
            java.lang.String r12 = "Should not execute nested prefetch on canceled request"
            o.b.c(r12)
        L174:
            java.lang.String r12 = "compose:lazy:prefetch:update_nested_prefetch_count"
            android.os.Trace.beginSection(r12)
            int r12 = r13.size()     // Catch: java.lang.Throwable -> L18d
            r14 = r7
        L17e:
            if (r14 >= r12) goto L190
            java.lang.Object r18 = r13.get(r14)     // Catch: java.lang.Throwable -> L18d
            r5 = r18
            s.m0 r5 = (s.m0) r5     // Catch: java.lang.Throwable -> L18d
            r5.f12044d = r9     // Catch: java.lang.Throwable -> L18d
            int r14 = r14 + 1
            goto L17e
        L18d:
            r0 = move-exception
            goto L27e
        L190:
            android.os.Trace.endSection()
            java.lang.String r5 = "compose:lazy:prefetch:nested"
            android.os.Trace.beginSection(r5)
        L198:
            int r5 = r0.f12142c     // Catch: java.lang.Throwable -> L223
            int r9 = r13.size()     // Catch: java.lang.Throwable -> L223
            if (r5 >= r9) goto L276
            int r5 = r0.f12142c     // Catch: java.lang.Throwable -> L223
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L223
            if (r5 != 0) goto L225
            long r19 = r26.a()     // Catch: java.lang.Throwable -> L223
            int r5 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r5 > 0) goto L1b4
            android.os.Trace.endSection()
            r17 = 1
            return r17
        L1b4:
            int r9 = r0.f12142c     // Catch: java.lang.Throwable -> L223
            java.lang.Object r5 = r13.get(r9)     // Catch: java.lang.Throwable -> L223
            r12 = r5
            s.m0 r12 = (s.m0) r12     // Catch: java.lang.Throwable -> L223
            r.s r5 = r12.f12041a     // Catch: java.lang.Throwable -> L223
            if (r5 != 0) goto L1c9
            tf.t r5 = tf.t.f13167g     // Catch: java.lang.Throwable -> L223
            r23 = r9
            r24 = r10
            r10 = r6
            goto L220
        L1c9:
            int r14 = r12.f12044d     // Catch: java.lang.Throwable -> L223
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L223
            r15.<init>()     // Catch: java.lang.Throwable -> L223
            int r5 = r5.f11261h     // Catch: java.lang.Throwable -> L223
            w0.f r7 = w0.q.e()     // Catch: java.lang.Throwable -> L223
            if (r7 == 0) goto L1de
            fg.l r18 = r7.e()     // Catch: java.lang.Throwable -> L223
            r6 = r18
        L1de:
            r21 = r5
            w0.f r5 = w0.q.h(r7)     // Catch: java.lang.Throwable -> L223
            w0.q.k(r7, r5, r6)     // Catch: java.lang.Throwable -> L223
            r5 = -1
            if (r14 != r5) goto L1eb
            r14 = 2
        L1eb:
            r6 = 0
        L1ec:
            if (r6 >= r14) goto L214
            int r7 = r21 + r6
            j8.f r5 = r12.f12043c     // Catch: java.lang.Throwable -> L223
            if (r5 != 0) goto L1fc
            r22 = r6
            r23 = r9
            r24 = r10
            r10 = 0
            goto L20d
        L1fc:
            r22 = r6
            b5.c r6 = r12.f12042b     // Catch: java.lang.Throwable -> L223
            r23 = r9
            s.z0 r9 = new s.z0     // Catch: java.lang.Throwable -> L223
            r24 = r10
            r10 = 0
            r9.<init>(r5, r7, r6, r10)     // Catch: java.lang.Throwable -> L223
            r15.add(r9)     // Catch: java.lang.Throwable -> L223
        L20d:
            int r6 = r22 + 1
            r9 = r23
            r10 = r24
            goto L1ec
        L214:
            r23 = r9
            r24 = r10
            r10 = 0
            int r5 = r15.size()     // Catch: java.lang.Throwable -> L223
            r12.f12046f = r5     // Catch: java.lang.Throwable -> L223
            r5 = r15
        L220:
            r11[r23] = r5     // Catch: java.lang.Throwable -> L223
            goto L228
        L223:
            r0 = move-exception
            goto L27a
        L225:
            r24 = r10
            r10 = r6
        L228:
            int r5 = r0.f12142c     // Catch: java.lang.Throwable -> L223
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L223
            r5.getClass()     // Catch: java.lang.Throwable -> L223
        L22f:
            int r6 = r0.f12143d     // Catch: java.lang.Throwable -> L223
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L223
            if (r6 >= r7) goto L261
            int r6 = r0.f12143d     // Catch: java.lang.Throwable -> L223
            java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.Throwable -> L223
            s.z0 r6 = (s.z0) r6     // Catch: java.lang.Throwable -> L223
            if (r24 == 0) goto L24c
            if (r6 == 0) goto L245
            r7 = r6
            goto L246
        L245:
            r7 = r10
        L246:
            if (r7 == 0) goto L24c
            r9 = 1
            r7.f12169m = r9     // Catch: java.lang.Throwable -> L223
            goto L24d
        L24c:
            r9 = 1
        L24d:
            r0.f12144e = r9     // Catch: java.lang.Throwable -> L223
            r7 = r26
            boolean r6 = r6.c(r7)     // Catch: java.lang.Throwable -> L223
            if (r6 == 0) goto L25b
            android.os.Trace.endSection()
            return r9
        L25b:
            int r6 = r0.f12143d     // Catch: java.lang.Throwable -> L223
            int r6 = r6 + r9
            r0.f12143d = r6     // Catch: java.lang.Throwable -> L223
            goto L22f
        L261:
            r7 = r26
            r5 = 0
            r0.f12143d = r5     // Catch: java.lang.Throwable -> L223
            int r5 = r0.f12142c     // Catch: java.lang.Throwable -> L223
            r17 = 1
            int r5 = r5 + 1
            r0.f12142c = r5     // Catch: java.lang.Throwable -> L223
            r6 = r10
            r10 = r24
            r7 = 0
            r15 = 0
            goto L198
        L276:
            android.os.Trace.endSection()
            goto L282
        L27a:
            android.os.Trace.endSection()
            throw r0
        L27e:
            android.os.Trace.endSection()
            throw r0
        L282:
            s.y0 r0 = r1.f12168l
            if (r0 == 0) goto L298
            boolean r0 = r0.f12144e
            r9 = 1
            if (r0 != r9) goto L298
            r1.h()
            f8.i.K0(r2, r4)
            s.y0 r0 = r1.f12168l
            if (r0 == 0) goto L298
            r5 = 0
            r0.f12144e = r5
        L298:
            u2.a r0 = r1.f12160d
            boolean r2 = r1.f12163g
            if (r2 != 0) goto L2fd
            if (r0 == 0) goto L2fd
            long r2 = r1.f12170n
            long r4 = r8.f11986d
            boolean r2 = r1.g(r2, r4)
            if (r2 == 0) goto Lac
            java.lang.String r2 = "compose:lazy:prefetch:measure"
            android.os.Trace.beginSection(r2)
            long r2 = r0.f13338a     // Catch: java.lang.Throwable -> L2f7
            boolean r0 = r1.f12164h     // Catch: java.lang.Throwable -> L2f7
            if (r0 == 0) goto L2ba
            java.lang.String r0 = "Callers should check whether the request is still valid before calling performMeasure()"
            o.b.a(r0)     // Catch: java.lang.Throwable -> L2f7
        L2ba:
            boolean r0 = r1.f12163g     // Catch: java.lang.Throwable -> L2f7
            if (r0 == 0) goto L2c3
            java.lang.String r0 = "Request was already measured!"
            o.b.a(r0)     // Catch: java.lang.Throwable -> L2f7
        L2c3:
            r0 = 1
            r1.f12163g = r0     // Catch: java.lang.Throwable -> L2f7
            v1.h1 r0 = r1.f12161e     // Catch: java.lang.Throwable -> L2f7
            if (r0 == 0) goto L2d7
            int r4 = r0.b()     // Catch: java.lang.Throwable -> L2f7
            r5 = 0
        L2cf:
            if (r5 >= r4) goto L2df
            r0.c(r5, r2)     // Catch: java.lang.Throwable -> L2f7
            int r5 = r5 + 1
            goto L2cf
        L2d7:
            java.lang.String r0 = "performComposition() must be called before performMeasure()"
            o.b.b(r0)     // Catch: java.lang.Throwable -> L2f7
            okio.a.c()     // Catch: java.lang.Throwable -> L2f7
        L2df:
            android.os.Trace.endSection()
            r1.h()
            long r2 = r1.f12171o
            long r4 = r8.f11986d
            long r2 = s.c.a(r2, r4)
            r8.f11986d = r2
            fg.l r0 = r1.f12159c
            if (r0 == 0) goto L2fd
            r0.invoke(r1)
            goto L2fd
        L2f7:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L2fc:
            return r17
        L2fd:
            s.y0 r0 = r1.f12168l
            boolean r2 = r1.f12163g
            if (r2 == 0) goto L35b
            boolean r2 = r1.f12167k
            if (r2 == 0) goto L35b
            if (r0 == 0) goto L35b
            java.util.List r0 = r0.f12140a
            int r2 = r0.size()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r3
            r5 = 0
        L314:
            if (r5 >= r2) goto L325
            java.lang.Object r6 = r0.get(r5)
            s.m0 r6 = (s.m0) r6
            int r6 = r6.f12045e
            int r4 = java.lang.Math.min(r4, r6)
            int r5 = r5 + 1
            goto L314
        L325:
            if (r4 != r3) goto L329
            r5 = 0
            goto L32a
        L329:
            r5 = r4
        L32a:
            int r2 = r8.f11987e
            r4 = -1
            if (r2 != r4) goto L331
            r2 = r5
            goto L336
        L331:
            int r2 = r2 * 3
            int r2 = r2 + r5
            int r2 = r2 / 4
        L336:
            r8.f11987e = r2
            int r2 = r0.size()
            r6 = r3
            r4 = 0
        L33e:
            if (r4 >= r2) goto L34f
            java.lang.Object r7 = r0.get(r4)
            s.m0 r7 = (s.m0) r7
            int r7 = r7.f12046f
            int r6 = java.lang.Math.min(r6, r7)
            int r4 = r4 + 1
            goto L33e
        L34f:
            if (r6 != r3) goto L352
            r6 = 0
        L352:
            if (r6 >= r5) goto L35b
            r2 = 0
            r8.f11986d = r2
            r16 = 0
            return r16
        L35b:
            r16 = 0
            return r16
        L35e:
            r16 = r7
            r1.b()
            return r16
    }

    public final boolean e() {
            r2 = this;
            boolean r0 = r2.f12165i
            r1 = 1
            if (r0 != 0) goto L12
            v1.i0 r0 = r2.f12162f
            if (r0 == 0) goto L10
            boolean r0 = r0.c()
            if (r0 != r1) goto L10
            goto L12
        L10:
            r0 = 0
            return r0
        L12:
            return r1
    }

    public final void f(java.lang.Object r6, java.lang.Object r7, s.c r8) {
            r5 = this;
            v1.i0 r0 = r5.f12162f
            if (r0 != 0) goto L36
            j8.f r0 = r5.f12174r
            java.lang.Object r1 = r0.f6781b
            s.b0 r1 = (s.b0) r1
            int r2 = r5.f12157a
            fg.p r7 = r1.a(r6, r2, r7)
            java.lang.Object r0 = r0.f6782c
            v1.j1 r0 = (v1.j1) r0
            v1.j0 r0 = r0.a()
            x1.f0 r1 = r0.f13955g
            boolean r1 = r1.G()
            if (r1 != 0) goto L28
            v1.i0 r7 = new v1.i0
            r1 = 0
            r7.<init>(r0, r6, r1)
        L26:
            r0 = r7
            goto L32
        L28:
            r1 = 1
            r0.k(r6, r7, r1)
            v1.i0 r7 = new v1.i0
            r7.<init>(r0, r6, r1)
            goto L26
        L32:
            r5.f12162f = r0
            r5.f12166j = r6
        L36:
            r6 = 0
            r5.f12173q = r6
        L39:
            boolean r6 = r0.c()
            if (r6 != 0) goto L80
            boolean r6 = r5.f12173q
            if (r6 != 0) goto L80
            e9.a r6 = new e9.a
            r7 = 5
            r6.<init>(r5, r7, r8)
            int r7 = r0.f13949a
            switch(r7) {
                case 0: goto L39;
                default: goto L4e;
            }
        L4e:
            v1.b0 r7 = r0.b()
            r1 = 0
            if (r7 == 0) goto L58
            i0.l1 r2 = r7.f13897f
            goto L59
        L58:
            r2 = r1
        L59:
            if (r2 == 0) goto L39
            boolean r3 = r2.c()
            if (r3 != 0) goto L39
            w0.f r3 = w0.q.e()
            if (r3 == 0) goto L6b
            fg.l r1 = r3.e()
        L6b:
            w0.f r4 = w0.q.h(r3)
            r2.e(r6)     // Catch: java.lang.Throwable -> L76
            w0.q.k(r3, r4, r1)
            goto L39
        L76:
            r6 = move-exception
            r7.getClass()     // Catch: java.lang.Throwable -> L7b
            throw r6     // Catch: java.lang.Throwable -> L7b
        L7b:
            r6 = move-exception
            w0.q.k(r3, r4, r1)
            throw r6
        L80:
            r5.h()
            boolean r6 = r5.f12173q
            long r0 = r5.f12171o
            if (r6 == 0) goto L92
            long r6 = r8.f11984b
            long r6 = s.c.a(r0, r6)
            r8.f11984b = r6
            return
        L92:
            long r6 = r8.f11983a
            long r6 = s.c.a(r0, r6)
            r8.f11983a = r6
            return
    }

    public final boolean g(long r2, long r4) {
            r1 = this;
            boolean r0 = r1.f12169m
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final void h() {
            r22 = this;
            r0 = r22
            int r1 = pg.d.f10564b
            long r1 = java.lang.System.nanoTime()
            long r3 = pg.d.f10563a
            long r1 = r1 - r3
            long r3 = r0.f12172p
            r5 = 1
            long r7 = r3 - r5
            long r7 = r7 | r5
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r8 = 1
            r11 = 1000000(0xf4240, float:1.401298E-39)
            r12 = 0
            if (r7 != 0) goto L40
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L29
            l3.w r3 = pg.a.f10555g
            goto L12e
        L29:
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L30
            long r3 = pg.a.f10557i
            goto L32
        L30:
            long r3 = pg.a.f10556h
        L32:
            long r5 = r3 >> r8
            long r5 = -r5
            int r3 = (int) r3
            r3 = r3 & r8
            long r4 = r5 << r8
            long r6 = (long) r3
            long r12 = r4 + r6
            int r3 = pg.b.f10558a
            goto L12e
        L40:
            long r14 = r1 - r5
            long r5 = r5 | r14
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L53
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L50
            long r3 = pg.a.f10557i
        L4d:
            r12 = r3
            goto L12e
        L50:
            long r3 = pg.a.f10556h
            goto L4d
        L53:
            long r5 = r1 - r3
            long r14 = r5 ^ r1
            long r9 = r5 ^ r3
            long r9 = ~r9
            long r9 = r9 & r14
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            pg.c r9 = pg.c.f10559h
            if (r7 >= 0) goto L12a
            pg.c r7 = pg.c.f10560i
            int r10 = r9.compareTo(r7)
            if (r10 >= 0) goto L114
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r1 / r5
            long r14 = r3 / r5
            long r12 = r12 - r14
            long r14 = r1 % r5
            long r3 = r3 % r5
            long r14 = r14 - r3
            l3.w r3 = pg.a.f10555g
            long r3 = oh.h.X(r12, r7)
            long r5 = oh.h.X(r14, r9)
            int r7 = (int) r3
            r7 = r7 & r8
            int r9 = (int) r5
            r9 = r9 & r8
            if (r7 != r9) goto L104
            if (r7 != 0) goto Laa
            long r3 = r3 >> r8
            long r5 = r5 >> r8
            long r3 = r3 + r5
            r5 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto La2
            r5 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto La2
            long r12 = r3 << r8
            int r3 = pg.b.f10558a
            goto L12e
        La2:
            long r5 = (long) r11
            long r3 = r3 / r5
            long r12 = oh.h.v(r3)
            goto L12e
        Laa:
            long r3 = r3 >> r8
            long r5 = r5 >> r8
            long r16 = oh.h.e(r3, r5)
            r3 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 == 0) goto Lfe
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 == 0) goto Lf9
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 != 0) goto Lcc
            goto Lf9
        Lcc:
            r3 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 > 0) goto Le6
            r3 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le6
            long r3 = (long) r11
            long r16 = r16 * r3
            long r12 = r16 << r8
            int r3 = pg.b.f10558a
            goto L12e
        Le6:
            r18 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r20 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r3 = r9.e0.s(r16, r18, r20)
            long r12 = oh.h.v(r3)
            goto L12e
        Lf9:
            long r12 = oh.h.v(r16)
            goto L12e
        Lfe:
            java.lang.String r1 = "Summing infinite durations of different signs yields an undefined result."
            j8.o.t(r1)
            return
        L104:
            if (r7 != r8) goto L10d
            long r3 = r3 >> r8
            long r5 = r5 >> r8
            long r12 = pg.a.a(r3, r5)
            goto L12e
        L10d:
            long r5 = r5 >> r8
            long r3 = r3 >> r8
            long r12 = pg.a.a(r5, r3)
            goto L12e
        L114:
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 >= 0) goto L11b
            long r3 = pg.a.f10557i
            goto L11d
        L11b:
            long r3 = pg.a.f10556h
        L11d:
            long r5 = r3 >> r8
            long r5 = -r5
            int r3 = (int) r3
            r3 = r3 & r8
            long r4 = r5 << r8
            long r6 = (long) r3
            long r12 = r4 + r6
            int r3 = pg.b.f10558a
            goto L12e
        L12a:
            long r12 = oh.h.X(r5, r9)
        L12e:
            long r3 = r12 >> r8
            l3.w r5 = pg.a.f10555g
            int r5 = (int) r12
            r5 = r5 & r8
            if (r5 != 0) goto L138
            r9 = r3
            goto L156
        L138:
            r5 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L147
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L156
        L147:
            r5 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L153
            r9 = -9223372036854775808
            goto L156
        L153:
            long r5 = (long) r11
            long r9 = r3 * r5
        L156:
            r0.f12171o = r9
            long r3 = r0.f12170n
            long r3 = r3 - r9
            r0.f12170n = r3
            r0.f12172p = r1
            java.lang.String r1 = "compose:lazy:prefetch:available_time_nanos"
            f8.i.K0(r3, r1)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HandleAndRequestImpl { index = "
            r0.<init>(r1)
            int r1 = r3.f12157a
            r0.append(r1)
            java.lang.String r1 = ", constraints = "
            r0.append(r1)
            u2.a r1 = r3.f12160d
            r0.append(r1)
            java.lang.String r1 = ", isComposed = "
            r0.append(r1)
            boolean r1 = r3.e()
            r0.append(r1)
            java.lang.String r1 = ", isMeasured = "
            r0.append(r1)
            boolean r1 = r3.f12163g
            r0.append(r1)
            java.lang.String r1 = ", isCanceled = "
            r0.append(r1)
            boolean r1 = r3.f12164h
            java.lang.String r2 = " }"
            java.lang.String r0 = p.a.m(r2, r0, r1)
            return r0
    }
}
