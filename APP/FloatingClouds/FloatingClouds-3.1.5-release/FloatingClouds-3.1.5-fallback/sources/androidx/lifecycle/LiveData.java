package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final java.lang.Object j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f923a;
    public final a.Gd<java.lang.Object, androidx.lifecycle.LiveData<T>.b> b;
    public int c;
    public boolean d;
    public volatile java.lang.Object e;
    public volatile java.lang.Object f;
    public int g;
    public boolean h;
    public boolean i;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData<T>.b implements androidx.lifecycle.g {
        public LifecycleBoundObserver() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // androidx.lifecycle.g
        public final void a(a.InterfaceC0479y9 r1, androidx.lifecycle.e.a r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // androidx.lifecycle.LiveData.b
        public final void d() {
                r1 = this;
                r0 = 0
                throw r0
        }

        @Override // androidx.lifecycle.LiveData.b
        public final boolean e() {
                r1 = this;
                r0 = 0
                throw r0
        }
    }

    public class a extends androidx.lifecycle.LiveData<T>.b {
        @Override // androidx.lifecycle.LiveData.b
        public final boolean e() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.DialogInterfaceOnCancelListenerC0206j5.d f924a;
        public boolean b;
        public int c;
        public final /* synthetic */ androidx.lifecycle.LiveData d;

        public b(androidx.lifecycle.LiveData r1, a.DialogInterfaceOnCancelListenerC0206j5.d r2) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r1 = -1
                r0.c = r1
                r0.f924a = r2
                return
        }

        public final void c(boolean r6) {
                r5 = this;
                boolean r0 = r5.b
                if (r6 != r0) goto L5
                goto L46
            L5:
                r5.b = r6
                r0 = 1
                if (r6 == 0) goto Lc
                r6 = r0
                goto Ld
            Lc:
                r6 = -1
            Ld:
                androidx.lifecycle.LiveData r1 = r5.d
                int r2 = r1.c
                int r6 = r6 + r2
                r1.c = r6
                boolean r6 = r1.d
                if (r6 == 0) goto L19
                goto L3f
            L19:
                r1.d = r0
            L1b:
                r6 = 0
                int r3 = r1.c     // Catch: java.lang.Throwable -> L34
                if (r2 == r3) goto L3d
                if (r2 != 0) goto L26
                if (r3 <= 0) goto L26
                r4 = r0
                goto L27
            L26:
                r4 = r6
            L27:
                if (r2 <= 0) goto L2d
                if (r3 != 0) goto L2d
                r2 = r0
                goto L2e
            L2d:
                r2 = r6
            L2e:
                if (r4 == 0) goto L36
                r1.e()     // Catch: java.lang.Throwable -> L34
                goto L3b
            L34:
                r0 = move-exception
                goto L47
            L36:
                if (r2 == 0) goto L3b
                r1.f()     // Catch: java.lang.Throwable -> L34
            L3b:
                r2 = r3
                goto L1b
            L3d:
                r1.d = r6
            L3f:
                boolean r6 = r5.b
                if (r6 == 0) goto L46
                r1.c(r5)
            L46:
                return
            L47:
                r1.d = r6
                throw r0
        }

        public void d() {
                r0 = this;
                return
        }

        public abstract boolean e();
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.LiveData.j = r0
            return
    }

    public LiveData() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f923a = r0
            a.Gd r0 = new a.Gd
            r0.<init>()
            r1.b = r0
            r0 = 0
            r1.c = r0
            java.lang.Object r0 = androidx.lifecycle.LiveData.j
            r1.f = r0
            r1.e = r0
            r0 = -1
            r1.g = r0
            return
    }

    public static void a(java.lang.String r3) {
            a.C1 r0 = a.C1.g()
            a.R4 r0 = r0.f39a
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L18
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot invoke "
            java.lang.String r2 = " on a background thread"
            java.lang.String r3 = a.C0487z.g(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public final void b(androidx.lifecycle.LiveData<T>.b r5) {
            r4 = this;
            boolean r0 = r5.b
            if (r0 != 0) goto L5
            goto L6a
        L5:
            boolean r0 = r5.e()
            if (r0 != 0) goto L10
            r0 = 0
            r5.c(r0)
            return
        L10:
            int r0 = r5.c
            int r1 = r4.g
            if (r0 < r1) goto L17
            goto L6a
        L17:
            r5.c = r1
            a.j5$d r5 = r5.f924a
            java.lang.Object r0 = r4.e
            r5.getClass()
            a.y9 r0 = (a.InterfaceC0479y9) r0
            if (r0 == 0) goto L6a
            a.j5 r0 = r5.f526a
            boolean r1 = r0.c0
            if (r1 == 0) goto L6a
            android.view.View r1 = r0.B()
            android.view.ViewParent r2 = r1.getParent()
            if (r2 != 0) goto L62
            android.app.Dialog r2 = r0.g0
            if (r2 == 0) goto L6a
            r2 = 3
            boolean r2 = a.AbstractC0119e7.J(r2)
            if (r2 == 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DialogFragment "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " setting the content view on "
            r2.append(r5)
            android.app.Dialog r5 = r0.g0
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r5)
        L5c:
            android.app.Dialog r5 = r0.g0
            r5.setContentView(r1)
            return
        L62:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "DialogFragment can not be attached to a container view"
            r5.<init>(r0)
            throw r5
        L6a:
            return
    }

    public final void c(androidx.lifecycle.LiveData<T>.b r5) {
            r4 = this;
            boolean r0 = r4.h
            r1 = 1
            if (r0 == 0) goto L8
            r4.i = r1
            return
        L8:
            r4.h = r1
        La:
            r0 = 0
            r4.i = r0
            if (r5 == 0) goto L14
            r4.b(r5)
            r5 = 0
            goto L3e
        L14:
            a.Gd<java.lang.Object, androidx.lifecycle.LiveData<T>$b> r1 = r4.b
            r1.getClass()
            a.Gd$d r2 = new a.Gd$d
            r2.<init>(r1)
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r1 = r1.c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L25:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LiveData$b r1 = (androidx.lifecycle.LiveData.b) r1
            r4.b(r1)
            boolean r1 = r4.i
            if (r1 == 0) goto L25
        L3e:
            boolean r1 = r4.i
            if (r1 != 0) goto La
            r4.h = r0
            return
    }

    public final void d(a.DialogInterfaceOnCancelListenerC0206j5.d r5) {
            r4 = this;
            java.lang.String r0 = "observeForever"
            a(r0)
            androidx.lifecycle.LiveData$a r0 = new androidx.lifecycle.LiveData$a
            r0.<init>(r4, r5)
            a.Gd<java.lang.Object, androidx.lifecycle.LiveData<T>$b> r1 = r4.b
            a.Gd$c r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L16
            V r5 = r2.b
            goto L30
        L16:
            a.Gd$c r2 = new a.Gd$c
            r2.<init>(r5, r0)
            int r5 = r1.d
            int r5 = r5 + r3
            r1.d = r5
            a.Gd$c<K, V> r5 = r1.b
            if (r5 != 0) goto L29
            r1.f101a = r2
            r1.b = r2
            goto L2f
        L29:
            r5.c = r2
            r2.d = r5
            r1.b = r2
        L2f:
            r5 = 0
        L30:
            androidx.lifecycle.LiveData$b r5 = (androidx.lifecycle.LiveData.b) r5
            boolean r1 = r5 instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver
            if (r1 != 0) goto L3d
            if (r5 == 0) goto L39
            return
        L39:
            r0.c(r3)
            return
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot add the same observer with different lifecycles"
            r5.<init>(r0)
            throw r5
    }

    public void e() {
            r0 = this;
            return
    }

    public void f() {
            r0 = this;
            return
    }
}
