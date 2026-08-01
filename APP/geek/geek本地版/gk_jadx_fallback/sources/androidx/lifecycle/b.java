package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final java.lang.Object j = null;
    public final java.lang.Object a;
    public final defpackage.o10 b;
    public int c;
    public boolean d;
    public volatile java.lang.Object e;
    public volatile java.lang.Object f;
    public int g;
    public boolean h;
    public boolean i;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.b.j = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            o10 r0 = new o10
            r0.<init>()
            r1.b = r0
            r0 = 0
            r1.c = r0
            java.lang.Object r0 = androidx.lifecycle.b.j
            r1.f = r0
            r1.e = r0
            r0 = -1
            r1.g = r0
            return
    }

    public static void a(java.lang.String r3) {
            j6 r0 = defpackage.j6.z()
            java.lang.Object r0 = r0.d
            j6 r0 = (defpackage.j6) r0
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1a
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot invoke "
            java.lang.String r2 = " on a background thread"
            java.lang.String r3 = defpackage.z30.j(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public final void b(defpackage.or r5) {
            r4 = this;
            boolean r0 = r5.b
            if (r0 != 0) goto L5
            goto L6c
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
            goto L6c
        L17:
            r5.c = r1
            l0 r5 = r5.a
            java.lang.Object r0 = r4.e
            r5.getClass()
            oq r0 = (defpackage.oq) r0
            java.lang.Object r1 = r5.b
            rg r1 = (defpackage.rg) r1
            if (r0 == 0) goto L6c
            boolean r0 = r1.W
            if (r0 == 0) goto L6c
            android.view.View r0 = r1.A()
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != 0) goto L64
            android.app.Dialog r2 = r1.a0
            if (r2 == 0) goto L6c
            r2 = 3
            boolean r2 = defpackage.yl.A(r2)
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DialogFragment "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " setting the content view on "
            r2.append(r5)
            android.app.Dialog r5 = r1.a0
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r5)
        L5e:
            android.app.Dialog r5 = r1.a0
            r5.setContentView(r0)
            return
        L64:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "DialogFragment can not be attached to a container view"
            r5.<init>(r0)
            throw r5
        L6c:
            return
    }

    public final void c(defpackage.or r5) {
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
            o10 r1 = r4.b
            r1.getClass()
            m10 r2 = new m10
            r2.<init>(r1)
            java.util.WeakHashMap r1 = r1.c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L25:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            or r1 = (defpackage.or) r1
            r4.b(r1)
            boolean r1 = r4.i
            if (r1 == 0) goto L25
        L3e:
            boolean r1 = r4.i
            if (r1 != 0) goto La
            r4.h = r0
            return
    }

    public final void d(defpackage.l0 r5) {
            r4 = this;
            java.lang.String r0 = "observeForever"
            a(r0)
            nr r0 = new nr
            r0.<init>(r4, r5)
            o10 r1 = r4.b
            l10 r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L16
            java.lang.Object r5 = r2.b
            goto L30
        L16:
            l10 r2 = new l10
            r2.<init>(r5, r0)
            int r5 = r1.d
            int r5 = r5 + r3
            r1.d = r5
            l10 r5 = r1.b
            if (r5 != 0) goto L29
            r1.a = r2
            r1.b = r2
            goto L2f
        L29:
            r5.c = r2
            r2.d = r5
            r1.b = r2
        L2f:
            r5 = 0
        L30:
            or r5 = (defpackage.or) r5
            boolean r1 = r5 instanceof androidx.lifecycle.LiveData$LifecycleBoundObserver
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

    public final void e(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            a(r0)
            int r0 = r1.g
            int r0 = r0 + 1
            r1.g = r0
            r1.e = r2
            r2 = 0
            r1.c(r2)
            return
    }
}
