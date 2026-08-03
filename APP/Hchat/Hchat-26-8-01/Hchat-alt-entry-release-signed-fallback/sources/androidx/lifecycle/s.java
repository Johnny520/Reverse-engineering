package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.a f299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.l f300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tg.b0 f306i;

    public s(androidx.lifecycle.q r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r0)
            r2.f298a = r4
            e.a r4 = new e.a
            r4.<init>()
            r2.f299b = r4
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f290h
            r2.f300c = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f305h = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f301d = r0
            tg.b0 r3 = tg.s.b(r4)
            r2.f306i = r3
            return
    }

    public final void a(androidx.lifecycle.p r10) {
            r9 = this;
            r10.getClass()
            java.lang.String r0 = "addObserver"
            r9.c(r0)
            androidx.lifecycle.l r0 = r9.f300c
            androidx.lifecycle.l r1 = androidx.lifecycle.l.f289g
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            androidx.lifecycle.l r1 = androidx.lifecycle.l.f290h
        L11:
            androidx.lifecycle.r r0 = new androidx.lifecycle.r
            r0.<init>()
            java.util.HashMap r2 = androidx.lifecycle.t.f307a
            boolean r2 = r10 instanceof androidx.lifecycle.o
            boolean r3 = r10 instanceof androidx.lifecycle.d
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L30
            if (r3 == 0) goto L30
            androidx.lifecycle.f r2 = new androidx.lifecycle.f
            r3 = r10
            androidx.lifecycle.d r3 = (androidx.lifecycle.d) r3
            r8 = r10
            androidx.lifecycle.o r8 = (androidx.lifecycle.o) r8
            r2.<init>(r3, r8)
            goto L83
        L30:
            if (r3 == 0) goto L3b
            androidx.lifecycle.f r2 = new androidx.lifecycle.f
            r3 = r10
            androidx.lifecycle.d r3 = (androidx.lifecycle.d) r3
            r2.<init>(r3, r5)
            goto L83
        L3b:
            if (r2 == 0) goto L41
            r2 = r10
            androidx.lifecycle.o r2 = (androidx.lifecycle.o) r2
            goto L83
        L41:
            java.lang.Class r2 = r10.getClass()
            int r3 = androidx.lifecycle.t.b(r2)
            if (r3 != r4) goto L7e
            java.util.HashMap r3 = androidx.lifecycle.t.f308b
            java.lang.Object r2 = r3.get(r2)
            r2.getClass()
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == r7) goto L74
            int r3 = r2.size()
            androidx.lifecycle.h[] r8 = new androidx.lifecycle.h[r3]
            if (r3 > 0) goto L6a
            u3.a r2 = new u3.a
            r2.<init>(r8)
            goto L83
        L6a:
            java.lang.Object r0 = r2.get(r6)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.t.a(r0, r10)
            throw r5
        L74:
            java.lang.Object r0 = r2.get(r6)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.t.a(r0, r10)
            throw r5
        L7e:
            androidx.lifecycle.f r2 = new androidx.lifecycle.f
            r2.<init>(r10)
        L83:
            r0.f297b = r2
            r0.f296a = r1
            e.a r1 = r9.f299b
            java.util.HashMap r2 = r1.f2267k
            java.lang.Object r2 = r2.get(r10)
            e.c r2 = (e.c) r2
            if (r2 == 0) goto L96
            androidx.lifecycle.r r1 = r2.f2272h
            goto Lb5
        L96:
            java.util.HashMap r2 = r1.f2267k
            e.c r3 = new e.c
            r3.<init>(r10, r0)
            int r8 = r1.f2266j
            int r8 = r8 + r7
            r1.f2266j = r8
            e.c r8 = r1.f2264h
            if (r8 != 0) goto Lab
            r1.f2263g = r3
            r1.f2264h = r3
            goto Lb1
        Lab:
            r8.f2273i = r3
            r3.f2274j = r8
            r1.f2264h = r3
        Lb1:
            r2.put(r10, r3)
            r1 = r5
        Lb5:
            if (r1 == 0) goto Lb8
            goto Lc2
        Lb8:
            java.lang.ref.WeakReference r1 = r9.f301d
            java.lang.Object r1 = r1.get()
            androidx.lifecycle.q r1 = (androidx.lifecycle.q) r1
            if (r1 != 0) goto Lc3
        Lc2:
            return
        Lc3:
            int r2 = r9.f302e
            if (r2 != 0) goto Lcb
            boolean r2 = r9.f303f
            if (r2 == 0) goto Lcc
        Lcb:
            r6 = r7
        Lcc:
            androidx.lifecycle.l r2 = r9.b(r10)
            int r3 = r9.f302e
            int r3 = r3 + r7
            r9.f302e = r3
        Ld5:
            androidx.lifecycle.l r3 = r0.f296a
            int r2 = r3.compareTo(r2)
            if (r2 >= 0) goto L127
            e.a r2 = r9.f299b
            java.util.HashMap r2 = r2.f2267k
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L127
            androidx.lifecycle.l r2 = r0.f296a
            java.util.ArrayList r3 = r9.f305h
            r3.add(r2)
            androidx.lifecycle.i r2 = androidx.lifecycle.k.Companion
            androidx.lifecycle.l r8 = r0.f296a
            r2.getClass()
            r8.getClass()
            int r2 = r8.ordinal()
            if (r2 == r7) goto L10b
            if (r2 == r4) goto L108
            r8 = 3
            if (r2 == r8) goto L105
            r2 = r5
            goto L10d
        L105:
            androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_RESUME
            goto L10d
        L108:
            androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_START
            goto L10d
        L10b:
            androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_CREATE
        L10d:
            if (r2 == 0) goto L11f
            r0.a(r1, r2)
            int r2 = r3.size()
            int r2 = r2 - r7
            r3.remove(r2)
            androidx.lifecycle.l r2 = r9.b(r10)
            goto Ld5
        L11f:
            java.lang.String r10 = "no event up from "
            androidx.lifecycle.l r0 = r0.f296a
            okio.a.l(r0, r10)
            return
        L127:
            if (r6 != 0) goto L12c
            r9.h()
        L12c:
            int r10 = r9.f302e
            int r10 = r10 + (-1)
            r9.f302e = r10
            return
    }

    public final androidx.lifecycle.l b(androidx.lifecycle.p r4) {
            r3 = this;
            e.a r0 = r3.f299b
            java.util.HashMap r0 = r0.f2267k
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            e.c r4 = (e.c) r4
            e.c r4 = r4.f2274j
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L1c
            androidx.lifecycle.r r4 = r4.f2272h
            androidx.lifecycle.l r4 = r4.f296a
            goto L1d
        L1c:
            r4 = r2
        L1d:
            java.util.ArrayList r0 = r3.f305h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L32
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.l r2 = (androidx.lifecycle.l) r2
        L32:
            androidx.lifecycle.l r0 = r3.f300c
            r0.getClass()
            if (r4 == 0) goto L40
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L40
            goto L41
        L40:
            r4 = r0
        L41:
            if (r2 == 0) goto L4a
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L4a
            return r2
        L4a:
            return r4
    }

    public final void c(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f298a
            if (r0 == 0) goto L44
            d.a r0 = d.a.f1882d
            if (r0 == 0) goto Lb
            d.a r0 = d.a.f1882d
            goto L20
        Lb:
            java.lang.Class<d.a> r0 = d.a.class
            monitor-enter(r0)
            d.a r1 = d.a.f1882d     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            d.a r1 = new d.a     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            d.a.f1882d = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L42
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            d.a r0 = d.a.f1882d
        L20:
            java.lang.Object r0 = r0.f1883c
            d.a r0 = (d.a) r0
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L36
            return
        L36:
            java.lang.String r0 = "Method "
            java.lang.String r1 = " must be called on the main thread"
            java.lang.String r4 = eh.a.n(r0, r4, r1)
            ah.a.h(r4)
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L44:
            return
    }

    public final void d(androidx.lifecycle.k r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "handleLifecycleEvent"
            r1.c(r0)
            androidx.lifecycle.l r2 = r2.a()
            r1.e(r2)
            return
    }

    public final void e(androidx.lifecycle.l r6) {
            r5 = this;
            androidx.lifecycle.l r0 = r5.f300c
            if (r0 != r6) goto L6
            goto L92
        L6:
            java.lang.ref.WeakReference r0 = r5.f301d
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.q r0 = (androidx.lifecycle.q) r0
            androidx.lifecycle.l r1 = r5.f300c
            r1.getClass()
            androidx.lifecycle.l r2 = androidx.lifecycle.l.f290h
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f289g
            if (r1 != r2) goto L46
            if (r6 == r3) goto L1c
            goto L46
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "State must be at least '"
            r2.<init>(r3)
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f291i
            r2.append(r3)
            java.lang.String r3 = "' to be moved to '"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "' in component "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r6 = r6.toString()
            r1.<init>(r6)
            throw r1
        L46:
            if (r1 != r3) goto L73
            if (r1 != r6) goto L4b
            goto L73
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "State is '"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = "' and cannot be moved to `"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "` in component "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r6 = r6.toString()
            r1.<init>(r6)
            throw r1
        L73:
            r5.f300c = r6
            boolean r6 = r5.f303f
            r0 = 1
            if (r6 != 0) goto L93
            int r6 = r5.f302e
            if (r6 == 0) goto L7f
            goto L93
        L7f:
            r5.f303f = r0
            r5.h()
            r6 = 0
            r5.f303f = r6
            androidx.lifecycle.l r6 = r5.f300c
            if (r6 != r3) goto L92
            e.a r6 = new e.a
            r6.<init>()
            r5.f299b = r6
        L92:
            return
        L93:
            r5.f304g = r0
            return
    }

    public final void f(androidx.lifecycle.p r6) {
            r5 = this;
            r6.getClass()
            java.lang.String r0 = "removeObserver"
            r5.c(r0)
            e.a r0 = r5.f299b
            java.util.WeakHashMap r1 = r0.f2265i
            java.util.HashMap r2 = r0.f2267k
            java.lang.Object r3 = r2.get(r6)
            e.c r3 = (e.c) r3
            if (r3 != 0) goto L17
            goto L54
        L17:
            int r4 = r0.f2266j
            int r4 = r4 + (-1)
            r0.f2266j = r4
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L3b
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r1.next()
            e.e r4 = (e.e) r4
            r4.a(r3)
            goto L2b
        L3b:
            e.c r1 = r3.f2274j
            e.c r4 = r3.f2273i
            if (r1 == 0) goto L44
            r1.f2273i = r4
            goto L46
        L44:
            r0.f2263g = r4
        L46:
            e.c r4 = r3.f2273i
            if (r4 == 0) goto L4d
            r4.f2274j = r1
            goto L4f
        L4d:
            r0.f2264h = r1
        L4f:
            r0 = 0
            r3.f2273i = r0
            r3.f2274j = r0
        L54:
            r2.remove(r6)
            return
    }

    public final void g(androidx.lifecycle.l r2) {
            r1 = this;
            java.lang.String r0 = "setCurrentState"
            r1.c(r0)
            r1.e(r2)
            return
    }

    public final void h() {
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f301d
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.q r0 = (androidx.lifecycle.q) r0
            if (r0 == 0) goto L172
        La:
            e.a r1 = r11.f299b
            int r2 = r1.f2266j
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L13
            goto L2d
        L13:
            e.c r1 = r1.f2263g
            r1.getClass()
            androidx.lifecycle.r r1 = r1.f2272h
            androidx.lifecycle.l r1 = r1.f296a
            e.a r2 = r11.f299b
            e.c r2 = r2.f2264h
            r2.getClass()
            androidx.lifecycle.r r2 = r2.f2272h
            androidx.lifecycle.l r2 = r2.f296a
            if (r1 != r2) goto L3e
            androidx.lifecycle.l r1 = r11.f300c
            if (r1 != r2) goto L3e
        L2d:
            r11.f304g = r4
            androidx.lifecycle.l r0 = r11.f300c
            tg.b0 r1 = r11.f306i
            r1.getClass()
            if (r0 != 0) goto L3a
            l3.q r0 = ug.c.f13807b
        L3a:
            r1.h(r3, r0)
            return
        L3e:
            r11.f304g = r4
            androidx.lifecycle.l r1 = r11.f300c
            e.a r2 = r11.f299b
            e.c r2 = r2.f2263g
            r2.getClass()
            androidx.lifecycle.r r2 = r2.f2272h
            androidx.lifecycle.l r2 = r2.f296a
            int r1 = r1.compareTo(r2)
            r2 = 3
            r4 = 2
            r5 = 1
            java.util.ArrayList r6 = r11.f305h
            if (r1 >= 0) goto Lde
            e.a r1 = r11.f299b
            e.b r7 = new e.b
            e.c r8 = r1.f2264h
            e.c r9 = r1.f2263g
            r10 = 1
            r7.<init>(r8, r9, r10)
            java.util.WeakHashMap r1 = r1.f2265i
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L6b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lde
            boolean r1 = r11.f304g
            if (r1 != 0) goto Lde
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.Object r8 = r1.getKey()
            androidx.lifecycle.p r8 = (androidx.lifecycle.p) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.r r1 = (androidx.lifecycle.r) r1
        L8a:
            androidx.lifecycle.l r9 = r1.f296a
            androidx.lifecycle.l r10 = r11.f300c
            int r9 = r9.compareTo(r10)
            if (r9 <= 0) goto L6b
            boolean r9 = r11.f304g
            if (r9 != 0) goto L6b
            e.a r9 = r11.f299b
            java.util.HashMap r9 = r9.f2267k
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L6b
            androidx.lifecycle.i r9 = androidx.lifecycle.k.Companion
            androidx.lifecycle.l r10 = r1.f296a
            r9.getClass()
            r10.getClass()
            int r9 = r10.ordinal()
            if (r9 == r4) goto Lbf
            if (r9 == r2) goto Lbc
            r10 = 4
            if (r9 == r10) goto Lb9
            r9 = r3
            goto Lc1
        Lb9:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_PAUSE
            goto Lc1
        Lbc:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_STOP
            goto Lc1
        Lbf:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_DESTROY
        Lc1:
            if (r9 == 0) goto Ld6
            androidx.lifecycle.l r10 = r9.a()
            r6.add(r10)
            r1.a(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto L8a
        Ld6:
            java.lang.String r0 = "no event down from "
            androidx.lifecycle.l r1 = r1.f296a
            okio.a.l(r1, r0)
            return
        Lde:
            e.a r1 = r11.f299b
            e.c r1 = r1.f2264h
            boolean r7 = r11.f304g
            if (r7 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.l r7 = r11.f300c
            androidx.lifecycle.r r1 = r1.f2272h
            androidx.lifecycle.l r1 = r1.f296a
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto La
            e.a r1 = r11.f299b
            r1.getClass()
            e.d r7 = new e.d
            r7.<init>(r1)
            java.util.WeakHashMap r1 = r1.f2265i
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L105:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r11.f304g
            if (r1 != 0) goto La
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            androidx.lifecycle.p r8 = (androidx.lifecycle.p) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.r r1 = (androidx.lifecycle.r) r1
        L121:
            androidx.lifecycle.l r9 = r1.f296a
            androidx.lifecycle.l r10 = r11.f300c
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L105
            boolean r9 = r11.f304g
            if (r9 != 0) goto L105
            e.a r9 = r11.f299b
            java.util.HashMap r9 = r9.f2267k
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L105
            androidx.lifecycle.l r9 = r1.f296a
            r6.add(r9)
            androidx.lifecycle.i r9 = androidx.lifecycle.k.Companion
            androidx.lifecycle.l r10 = r1.f296a
            r9.getClass()
            r10.getClass()
            int r9 = r10.ordinal()
            if (r9 == r5) goto L15a
            if (r9 == r4) goto L157
            if (r9 == r2) goto L154
            r9 = r3
            goto L15c
        L154:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_RESUME
            goto L15c
        L157:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_START
            goto L15c
        L15a:
            androidx.lifecycle.k r9 = androidx.lifecycle.k.ON_CREATE
        L15c:
            if (r9 == 0) goto L16a
            r1.a(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto L121
        L16a:
            java.lang.String r0 = "no event up from "
            androidx.lifecycle.l r1 = r1.f296a
            okio.a.l(r1, r0)
            return
        L172:
            java.lang.String r0 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            j8.o.A(r0)
            return
    }
}
