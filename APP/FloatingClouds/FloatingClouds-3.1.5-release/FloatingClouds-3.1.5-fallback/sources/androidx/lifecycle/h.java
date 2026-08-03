package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.lifecycle.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f934a;
    public a.C0261m6<a.InterfaceC0461x9, androidx.lifecycle.h.a> b;
    public androidx.lifecycle.e.b c;
    public final java.lang.ref.WeakReference<a.InterfaceC0479y9> d;
    public int e;
    public boolean f;
    public boolean g;
    public final java.util.ArrayList<androidx.lifecycle.e.b> h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.lifecycle.e.b f935a;
        public androidx.lifecycle.g b;

        public final void a(a.InterfaceC0479y9 r4, androidx.lifecycle.e.a r5) {
                r3 = this;
                androidx.lifecycle.e$b r0 = r5.a()
                androidx.lifecycle.e$b r1 = r3.f935a
                java.lang.String r2 = "state1"
                a.C0193i9.e(r1, r2)
                int r2 = r0.compareTo(r1)
                if (r2 >= 0) goto L12
                r1 = r0
            L12:
                r3.f935a = r1
                androidx.lifecycle.g r1 = r3.b
                r1.a(r4, r5)
                r3.f935a = r0
                return
        }
    }

    public h(a.InterfaceC0479y9 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r0 = 1
            r1.f934a = r0
            a.m6 r0 = new a.m6
            r0.<init>()
            r1.b = r0
            androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.b
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.d = r0
            return
    }

    @Override // androidx.lifecycle.e
    public final void a(a.InterfaceC0461x9 r13) {
            r12 = this;
            java.util.ArrayList<androidx.lifecycle.e$b> r0 = r12.h
            r1 = 0
            r2 = 1
            java.lang.String r3 = "addObserver"
            r12.e(r3)
            androidx.lifecycle.e$b r3 = r12.c
            androidx.lifecycle.e$b r4 = androidx.lifecycle.e.b.f932a
            if (r3 != r4) goto L10
            goto L12
        L10:
            androidx.lifecycle.e$b r4 = androidx.lifecycle.e.b.b
        L12:
            androidx.lifecycle.h$a r3 = new androidx.lifecycle.h$a
            r3.<init>()
            java.util.HashMap r5 = a.A9.f14a
            boolean r5 = r13 instanceof androidx.lifecycle.g
            boolean r6 = r13 instanceof a.Q4
            r7 = 2
            r8 = 0
            if (r5 == 0) goto L2f
            if (r6 == 0) goto L2f
            androidx.lifecycle.DefaultLifecycleObserverAdapter r5 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r6 = r13
            a.Q4 r6 = (a.Q4) r6
            r9 = r13
            androidx.lifecycle.g r9 = (androidx.lifecycle.g) r9
            r5.<init>(r6, r9)
            goto L8e
        L2f:
            if (r6 == 0) goto L3a
            androidx.lifecycle.DefaultLifecycleObserverAdapter r5 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r6 = r13
            a.Q4 r6 = (a.Q4) r6
            r5.<init>(r6, r1)
            goto L8e
        L3a:
            if (r5 == 0) goto L40
            r5 = r13
            androidx.lifecycle.g r5 = (androidx.lifecycle.g) r5
            goto L8e
        L40:
            java.lang.Class r5 = r13.getClass()
            int r6 = a.A9.b(r5)
            if (r6 != r7) goto L89
            java.util.HashMap r6 = a.A9.b
            java.lang.Object r5 = r6.get(r5)
            a.C0193i9.b(r5)
            java.util.List r5 = (java.util.List) r5
            int r6 = r5.size()
            if (r6 != r2) goto L6c
            java.lang.Object r5 = r5.get(r8)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            androidx.lifecycle.b r5 = a.A9.a(r5, r13)
            androidx.lifecycle.SingleGeneratedAdapterObserver r6 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r6.<init>(r5)
            r5 = r6
            goto L8e
        L6c:
            int r6 = r5.size()
            androidx.lifecycle.b[] r9 = new androidx.lifecycle.b[r6]
            r10 = r8
        L73:
            if (r10 >= r6) goto L83
            java.lang.Object r11 = r5.get(r10)
            java.lang.reflect.Constructor r11 = (java.lang.reflect.Constructor) r11
            androidx.lifecycle.b r11 = a.A9.a(r11, r13)
            r9[r10] = r11
            int r10 = r10 + r2
            goto L73
        L83:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r5 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r5.<init>(r9)
            goto L8e
        L89:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r5 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r5.<init>(r13)
        L8e:
            r3.b = r5
            r3.f935a = r4
            a.m6<a.x9, androidx.lifecycle.h$a> r4 = r12.b
            a.Gd$c r5 = r4.a(r13)
            if (r5 == 0) goto L9d
            V r4 = r5.b
            goto Lbc
        L9d:
            java.util.HashMap<K, a.Gd$c<K, V>> r5 = r4.e
            a.Gd$c r6 = new a.Gd$c
            r6.<init>(r13, r3)
            int r9 = r4.d
            int r9 = r9 + r2
            r4.d = r9
            a.Gd$c<K, V> r9 = r4.b
            if (r9 != 0) goto Lb2
            r4.f101a = r6
            r4.b = r6
            goto Lb8
        Lb2:
            r9.c = r6
            r6.d = r9
            r4.b = r6
        Lb8:
            r5.put(r13, r6)
            r4 = r1
        Lbc:
            androidx.lifecycle.h$a r4 = (androidx.lifecycle.h.a) r4
            if (r4 == 0) goto Lc1
            goto Lcb
        Lc1:
            java.lang.ref.WeakReference<a.y9> r4 = r12.d
            java.lang.Object r4 = r4.get()
            a.y9 r4 = (a.InterfaceC0479y9) r4
            if (r4 != 0) goto Lcc
        Lcb:
            return
        Lcc:
            int r5 = r12.e
            if (r5 != 0) goto Ld4
            boolean r5 = r12.f
            if (r5 == 0) goto Ld5
        Ld4:
            r8 = r2
        Ld5:
            androidx.lifecycle.e$b r5 = r12.d(r13)
            int r6 = r12.e
            int r6 = r6 + r2
            r12.e = r6
        Lde:
            androidx.lifecycle.e$b r6 = r3.f935a
            int r5 = r6.compareTo(r5)
            if (r5 >= 0) goto L13e
            a.m6<a.x9, androidx.lifecycle.h$a> r5 = r12.b
            java.util.HashMap<K, a.Gd$c<K, V>> r5 = r5.e
            boolean r5 = r5.containsKey(r13)
            if (r5 == 0) goto L13e
            androidx.lifecycle.e$b r5 = r3.f935a
            r0.add(r5)
            androidx.lifecycle.e$a$a r5 = androidx.lifecycle.e.a.Companion
            androidx.lifecycle.e$b r6 = r3.f935a
            r5.getClass()
            java.lang.String r5 = "state"
            a.C0193i9.e(r6, r5)
            int r5 = r6.ordinal()
            if (r5 == r2) goto L114
            if (r5 == r7) goto L111
            r6 = 3
            if (r5 == r6) goto L10e
            r5 = r1
            goto L116
        L10e:
            androidx.lifecycle.e$a r5 = androidx.lifecycle.e.a.ON_RESUME
            goto L116
        L111:
            androidx.lifecycle.e$a r5 = androidx.lifecycle.e.a.ON_START
            goto L116
        L114:
            androidx.lifecycle.e$a r5 = androidx.lifecycle.e.a.ON_CREATE
        L116:
            if (r5 == 0) goto L128
            r3.a(r4, r5)
            int r5 = r0.size()
            int r5 = r5 - r2
            r0.remove(r5)
            androidx.lifecycle.e$b r5 = r12.d(r13)
            goto Lde
        L128:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no event up from "
            r0.<init>(r1)
            androidx.lifecycle.e$b r1 = r3.f935a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L13e:
            if (r8 != 0) goto L143
            r12.i()
        L143:
            int r13 = r12.e
            int r13 = r13 + (-1)
            r12.e = r13
            return
    }

    @Override // androidx.lifecycle.e
    public final androidx.lifecycle.e.b b() {
            r1 = this;
            androidx.lifecycle.e$b r0 = r1.c
            return r0
    }

    @Override // androidx.lifecycle.e
    public final void c(a.InterfaceC0461x9 r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "removeObserver"
            r1.e(r0)
            a.m6<a.x9, androidx.lifecycle.h$a> r0 = r1.b
            r0.b(r2)
            return
    }

    public final androidx.lifecycle.e.b d(a.InterfaceC0461x9 r4) {
            r3 = this;
            a.m6<a.x9, androidx.lifecycle.h$a> r0 = r3.b
            java.util.HashMap<K, a.Gd$c<K, V>> r0 = r0.e
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            a.Gd$c r4 = (a.Gd.c) r4
            a.Gd$c<K, V> r4 = r4.d
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L20
            V r4 = r4.b
            androidx.lifecycle.h$a r4 = (androidx.lifecycle.h.a) r4
            if (r4 == 0) goto L20
            androidx.lifecycle.e$b r4 = r4.f935a
            goto L21
        L20:
            r4 = r2
        L21:
            java.util.ArrayList<androidx.lifecycle.e$b> r0 = r3.h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L36
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.e$b r2 = (androidx.lifecycle.e.b) r2
        L36:
            androidx.lifecycle.e$b r0 = r3.c
            java.lang.String r1 = "state1"
            a.C0193i9.e(r0, r1)
            if (r4 == 0) goto L46
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L46
            goto L47
        L46:
            r4 = r0
        L47:
            if (r2 == 0) goto L50
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L50
            return r2
        L50:
            return r4
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public final void e(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f934a
            if (r0 == 0) goto L2e
            a.C1 r0 = a.C1.g()
            a.R4 r0 = r0.f39a
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1c
            return
        L1c:
            java.lang.String r0 = "Method "
            java.lang.String r1 = " must be called on the main thread"
            java.lang.String r3 = a.C0487z.g(r0, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2e:
            return
    }

    public final void f(androidx.lifecycle.e.a r2) {
            r1 = this;
            java.lang.String r0 = "event"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "handleLifecycleEvent"
            r1.e(r0)
            androidx.lifecycle.e$b r2 = r2.a()
            r1.g(r2)
            return
    }

    public final void g(androidx.lifecycle.e.b r4) {
            r3 = this;
            androidx.lifecycle.e$b r0 = r3.c
            if (r0 != r4) goto L5
            goto L55
        L5:
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.b
            androidx.lifecycle.e$b r2 = androidx.lifecycle.e.b.f932a
            if (r0 != r1) goto L36
            if (r4 == r2) goto Le
            goto L36
        Le:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "no event down from "
            r4.<init>(r0)
            androidx.lifecycle.e$b r0 = r3.c
            r4.append(r0)
            java.lang.String r0 = " in component "
            r4.append(r0)
            java.lang.ref.WeakReference<a.y9> r0 = r3.d
            java.lang.Object r0 = r0.get()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            r3.c = r4
            boolean r4 = r3.f
            r0 = 1
            if (r4 != 0) goto L56
            int r4 = r3.e
            if (r4 == 0) goto L42
            goto L56
        L42:
            r3.f = r0
            r3.i()
            r4 = 0
            r3.f = r4
            androidx.lifecycle.e$b r4 = r3.c
            if (r4 != r2) goto L55
            a.m6 r4 = new a.m6
            r4.<init>()
            r3.b = r4
        L55:
            return
        L56:
            r3.g = r0
            return
    }

    public final void h(androidx.lifecycle.e.b r2) {
            r1 = this;
            java.lang.String r0 = "state"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "setCurrentState"
            r1.e(r0)
            r1.g(r2)
            return
    }

    public final void i() {
            r12 = this;
            java.lang.ref.WeakReference<a.y9> r0 = r12.d
            java.lang.Object r0 = r0.get()
            a.y9 r0 = (a.InterfaceC0479y9) r0
            if (r0 == 0) goto L191
        La:
            a.m6<a.x9, androidx.lifecycle.h$a> r1 = r12.b
            int r2 = r1.d
            r3 = 0
            if (r2 != 0) goto L12
            goto L30
        L12:
            a.Gd$c<K, V> r1 = r1.f101a
            a.C0193i9.b(r1)
            V r1 = r1.b
            androidx.lifecycle.h$a r1 = (androidx.lifecycle.h.a) r1
            androidx.lifecycle.e$b r1 = r1.f935a
            a.m6<a.x9, androidx.lifecycle.h$a> r2 = r12.b
            a.Gd$c<K, V> r2 = r2.b
            a.C0193i9.b(r2)
            V r2 = r2.b
            androidx.lifecycle.h$a r2 = (androidx.lifecycle.h.a) r2
            androidx.lifecycle.e$b r2 = r2.f935a
            if (r1 != r2) goto L33
            androidx.lifecycle.e$b r1 = r12.c
            if (r1 != r2) goto L33
        L30:
            r12.g = r3
            return
        L33:
            r12.g = r3
            androidx.lifecycle.e$b r1 = r12.c
            a.m6<a.x9, androidx.lifecycle.h$a> r2 = r12.b
            a.Gd$c<K, V> r2 = r2.f101a
            a.C0193i9.b(r2)
            V r2 = r2.b
            androidx.lifecycle.h$a r2 = (androidx.lifecycle.h.a) r2
            androidx.lifecycle.e$b r2 = r2.f935a
            int r1 = r1.compareTo(r2)
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.String r5 = "state"
            r6 = 1
            if (r1 >= 0) goto Le9
            a.m6<a.x9, androidx.lifecycle.h$a> r1 = r12.b
            a.Gd$b r7 = new a.Gd$b
            a.Gd$c<K, V> r8 = r1.b
            a.Gd$c<K, V> r9 = r1.f101a
            r7.<init>(r8, r9)
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r1 = r1.c
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L62:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Le9
            boolean r1 = r12.g
            if (r1 != 0) goto Le9
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r8 = "next()"
            a.C0193i9.d(r1, r8)
            java.lang.Object r8 = r1.getKey()
            a.x9 r8 = (a.InterfaceC0461x9) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.h$a r1 = (androidx.lifecycle.h.a) r1
        L83:
            androidx.lifecycle.e$b r9 = r1.f935a
            androidx.lifecycle.e$b r10 = r12.c
            int r9 = r9.compareTo(r10)
            if (r9 <= 0) goto L62
            boolean r9 = r12.g
            if (r9 != 0) goto L62
            a.m6<a.x9, androidx.lifecycle.h$a> r9 = r12.b
            java.util.HashMap<K, a.Gd$c<K, V>> r9 = r9.e
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L62
            androidx.lifecycle.e$a$a r9 = androidx.lifecycle.e.a.Companion
            androidx.lifecycle.e$b r10 = r1.f935a
            r9.getClass()
            a.C0193i9.e(r10, r5)
            int r9 = r10.ordinal()
            if (r9 == r4) goto Lb8
            if (r9 == r3) goto Lb5
            r10 = 4
            if (r9 == r10) goto Lb2
            r9 = r2
            goto Lba
        Lb2:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_PAUSE
            goto Lba
        Lb5:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_STOP
            goto Lba
        Lb8:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_DESTROY
        Lba:
            if (r9 == 0) goto Ld3
            androidx.lifecycle.e$b r10 = r9.a()
            java.util.ArrayList<androidx.lifecycle.e$b> r11 = r12.h
            r11.add(r10)
            r1.a(r0, r9)
            java.util.ArrayList<androidx.lifecycle.e$b> r9 = r12.h
            int r10 = r9.size()
            int r10 = r10 - r6
            r9.remove(r10)
            goto L83
        Ld3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event down from "
            r2.<init>(r3)
            androidx.lifecycle.e$b r1 = r1.f935a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Le9:
            a.m6<a.x9, androidx.lifecycle.h$a> r1 = r12.b
            a.Gd$c<K, V> r1 = r1.b
            boolean r7 = r12.g
            if (r7 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.e$b r7 = r12.c
            V r1 = r1.b
            androidx.lifecycle.h$a r1 = (androidx.lifecycle.h.a) r1
            androidx.lifecycle.e$b r1 = r1.f935a
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto La
            a.m6<a.x9, androidx.lifecycle.h$a> r1 = r12.b
            r1.getClass()
            a.Gd$d r7 = new a.Gd$d
            r7.<init>(r1)
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r1 = r1.c
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L112:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r12.g
            if (r1 != 0) goto La
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            a.x9 r8 = (a.InterfaceC0461x9) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.h$a r1 = (androidx.lifecycle.h.a) r1
        L12e:
            androidx.lifecycle.e$b r9 = r1.f935a
            androidx.lifecycle.e$b r10 = r12.c
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L112
            boolean r9 = r12.g
            if (r9 != 0) goto L112
            a.m6<a.x9, androidx.lifecycle.h$a> r9 = r12.b
            java.util.HashMap<K, a.Gd$c<K, V>> r9 = r9.e
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L112
            androidx.lifecycle.e$b r9 = r1.f935a
            java.util.ArrayList<androidx.lifecycle.e$b> r10 = r12.h
            r10.add(r9)
            androidx.lifecycle.e$a$a r9 = androidx.lifecycle.e.a.Companion
            androidx.lifecycle.e$b r10 = r1.f935a
            r9.getClass()
            a.C0193i9.e(r10, r5)
            int r9 = r10.ordinal()
            if (r9 == r6) goto L169
            if (r9 == r4) goto L166
            if (r9 == r3) goto L163
            r9 = r2
            goto L16b
        L163:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_RESUME
            goto L16b
        L166:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_START
            goto L16b
        L169:
            androidx.lifecycle.e$a r9 = androidx.lifecycle.e.a.ON_CREATE
        L16b:
            if (r9 == 0) goto L17b
            r1.a(r0, r9)
            java.util.ArrayList<androidx.lifecycle.e$b> r9 = r12.h
            int r10 = r9.size()
            int r10 = r10 - r6
            r9.remove(r10)
            goto L12e
        L17b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event up from "
            r2.<init>(r3)
            androidx.lifecycle.e$b r1 = r1.f935a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L191:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }
}
