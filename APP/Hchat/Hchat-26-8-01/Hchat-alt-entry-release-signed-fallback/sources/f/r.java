package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f2893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f2894g;

    public r(int r2) {
            r1 = this;
            r0 = 0
            r1.f2888a = r0
            r1.<init>()
            r1.f2889b = r2
            if (r2 <= 0) goto L1c
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r0 = 1
            r2.<init>(r0)
            r1.f2893f = r2
            a2.a r2 = new a2.a
            r0 = 12
            r2.<init>(r0)
            r1.f2894g = r2
            return
        L1c:
            java.lang.String r2 = "maxSize <= 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public r(ac.k r2, ac.k r3) {
            r1 = this;
            r0 = 1
            r1.f2888a = r0
            r1.<init>()
            r1.f2893f = r2
            r1.f2894g = r3
            return
    }

    public static nc.b c(ac.k r6, ac.k r7, boolean r8) {
            r0 = 0
            if (r8 == 0) goto L1f
            int r8 = r6.K()
            r1 = 1
            if (r8 == 0) goto L20
            r2 = 2
            if (r8 == r1) goto L1d
            if (r8 != r2) goto L11
            r1 = 3
            goto L20
        L11:
            af.d r6 = new af.d
            java.lang.String r7 = "Unknown annotation visibility value: "
            java.lang.String r7 = eh.a.l(r8, r7)
            r6.<init>(r7)
            throw r6
        L1d:
            r1 = r2
            goto L20
        L1f:
            r1 = r0
        L20:
            int r8 = a.a.H0(r6)
            int r2 = a.a.H0(r6)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
        L2d:
            if (r0 >= r2) goto L41
            int r4 = a.a.H0(r6)
            java.lang.String r4 = r7.v(r4)
            nc.a r5 = a7.a.N(r6, r7)
            r3.put(r4, r5)
            int r0 = r0 + 1
            goto L2d
        L41:
            java.lang.String r6 = r7.y(r8)
            nc.b r7 = new nc.b
            r7.<init>(r1, r6, r3)
            return r7
    }

    public java.lang.Object a(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.f2894g
            a2.a r0 = (a2.a) r0
            monitor-enter(r0)
            java.lang.Object r1 = r2.f2893f     // Catch: java.lang.Throwable -> L1c
            androidx.lifecycle.e0 r1 = (androidx.lifecycle.e0) r1     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = r1.f284a     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            int r1 = r2.f2891d     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r2.f2891d = r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r3
        L1c:
            r3 = move-exception
            goto L27
        L1e:
            int r3 = r2.f2892e     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + 1
            r2.f2892e = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            r3 = 0
            return r3
        L27:
            monitor-exit(r0)
            throw r3
    }

    public java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.f2894g
            a2.a r0 = (a2.a) r0
            monitor-enter(r0)
            int r1 = r4.f2890c     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + 1
            r4.f2890c = r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r4.f2893f     // Catch: java.lang.Throwable -> L24
            androidx.lifecycle.e0 r1 = (androidx.lifecycle.e0) r1     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L24
            java.util.LinkedHashMap r1 = r1.f284a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L27
            int r6 = r4.f2890c     // Catch: java.lang.Throwable -> L24
            int r6 = r6 + (-1)
            r4.f2890c = r6     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r5 = move-exception
            goto L9e
        L27:
            monitor-exit(r0)
            int r6 = r4.f2889b
        L2a:
            java.lang.Object r0 = r4.f2894g
            a2.a r0 = (a2.a) r0
            monitor-enter(r0)
            int r1 = r4.f2890c     // Catch: java.lang.Throwable -> L44
            if (r1 < 0) goto L94
            java.lang.Object r1 = r4.f2893f     // Catch: java.lang.Throwable -> L44
            androidx.lifecycle.e0 r1 = (androidx.lifecycle.e0) r1     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r1 = r1.f284a     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            int r1 = r4.f2890c     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L94
            goto L46
        L44:
            r5 = move-exception
            goto L9c
        L46:
            int r1 = r4.f2890c     // Catch: java.lang.Throwable -> L44
            if (r1 <= r6) goto L92
            java.lang.Object r1 = r4.f2893f     // Catch: java.lang.Throwable -> L44
            androidx.lifecycle.e0 r1 = (androidx.lifecycle.e0) r1     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r1 = r1.f284a     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L57
            goto L92
        L57:
            java.lang.Object r1 = r4.f2893f     // Catch: java.lang.Throwable -> L44
            androidx.lifecycle.e0 r1 = (androidx.lifecycle.e0) r1     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r1 = r1.f284a     // Catch: java.lang.Throwable -> L44
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = tf.m.u1(r1)     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L70
            monitor-exit(r0)
            return r5
        L70:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.f2893f     // Catch: java.lang.Throwable -> L44
            androidx.lifecycle.e0 r3 = (androidx.lifecycle.e0) r3     // Catch: java.lang.Throwable -> L44
            r3.getClass()     // Catch: java.lang.Throwable -> L44
            r2.getClass()     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r3 = r3.f284a     // Catch: java.lang.Throwable -> L44
            r3.remove(r2)     // Catch: java.lang.Throwable -> L44
            int r2 = r4.f2890c     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            int r2 = r2 + (-1)
            r4.f2890c = r2     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            goto L2a
        L92:
            monitor-exit(r0)
            return r5
        L94:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L44
            throw r6     // Catch: java.lang.Throwable -> L44
        L9c:
            monitor-exit(r0)
            throw r5
        L9e:
            monitor-exit(r0)
            throw r5
    }

    public java.util.List d(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.f2893f
            ac.k r0 = (ac.k) r0
            java.lang.Object r1 = r0.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            if (r8 != 0) goto Ld
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        Ld:
            r0.a(r8)
            int r8 = r1.getInt()
            if (r8 != 0) goto L19
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L19:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            int r3 = r1.position()
            r4 = 0
        L23:
            if (r4 >= r8) goto L41
            int r5 = r4 * 4
            int r5 = r5 + r3
            r0.a(r5)
            int r5 = r1.getInt()
            r0.a(r5)
            java.lang.Object r5 = r7.f2894g
            ac.k r5 = (ac.k) r5
            r6 = 1
            nc.b r5 = c(r0, r5, r6)
            r2.add(r5)
            int r4 = r4 + 1
            goto L23
        L41:
            return r2
    }

    public void e(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f2893f
            ac.k r0 = (ac.k) r0
            java.lang.Object r1 = r0.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r2.f2889b = r3
            if (r3 != 0) goto L14
            r3 = 0
            r2.f2890c = r3
            r2.f2891d = r3
            r2.f2892e = r3
            return
        L14:
            r0.f177h = r3
            r3 = 4
            r0.B(r3)
            int r3 = r1.getInt()
            r2.f2890c = r3
            int r3 = r1.getInt()
            r2.f2891d = r3
            int r3 = r1.getInt()
            r2.f2892e = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f2888a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "LruCache[maxSize="
            java.lang.Object r1 = r4.f2894g
            a2.a r1 = (a2.a) r1
            monitor-enter(r1)
            int r2 = r4.f2891d     // Catch: java.lang.Throwable -> L1c
            int r3 = r4.f2892e     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + r2
            if (r3 == 0) goto L1e
            int r2 = r2 * 100
            int r2 = r2 / r3
            goto L1f
        L1c:
            r0 = move-exception
            goto L50
        L1e:
            r2 = 0
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.f2889b     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",hits="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.f2891d     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",misses="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.f2892e     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",hitRate="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            r3.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "%]"
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            return r0
        L50:
            monitor-exit(r1)
            throw r0
    }
}
