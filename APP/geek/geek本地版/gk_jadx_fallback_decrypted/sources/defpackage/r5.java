package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements defpackage.j8 {
    public static volatile defpackage.r5 e;
    public static final java.lang.Object f = null;
    public static defpackage.r5 g;
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.r5.f = r0
            return
    }

    public r5() {
            r1 = this;
            r0 = 5
            r1.a = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public r5(defpackage.ag r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            r0 = 4
            r1.a = r0
            r1.<init>()
            r1.b = r3
            r1.c = r4
            r1.d = r2
            return
    }

    public r5(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.d = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.c = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.b = r2
            return
    }

    public r5(android.content.Context r2, android.content.res.TypedArray r3) {
            r1 = this;
            r0 = 6
            r1.a = r0
            r1.<init>()
            r1.d = r2
            r1.b = r3
            return
    }

    public r5(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r0 = 7
            r1.a = r0
            r1.<init>()
            z70 r0 = new z70
            r0.<init>()
            r1.c = r0
            r1.d = r2
            r1.b = r3
            return
    }

    public r5(defpackage.ez r2) {
            r1 = this;
            r0 = 3
            r1.a = r0
            r1.<init>()
            r1.b = r2
            fa r2 = new fa
            r2.<init>()
            r1.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            return
    }

    public r5(defpackage.l0 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            r1.c = r2
            o2 r2 = new o2
            r2.<init>(r1)
            r1.d = r2
            return
    }

    public r5(defpackage.qc r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            k7 r0 = new k7
            r0.<init>()
            r1.c = r0
            r1.d = r2
            return
    }

    public static defpackage.r5 q(android.content.Context r2) {
            r5 r0 = defpackage.r5.e
            if (r0 != 0) goto L19
            java.lang.Object r0 = defpackage.r5.f
            monitor-enter(r0)
            r5 r1 = defpackage.r5.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r5 r1 = new r5     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            defpackage.r5.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            r5 r2 = defpackage.r5.e
            return r2
    }

    public static defpackage.r5 y(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5) {
            r5 r0 = new r5
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4, r5, r1)
            r0.<init>(r2, r3)
            return r0
    }

    public void A(defpackage.qc r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.Q
            int r1 = r4.R
            r2 = 0
            r4.Q = r2
            r4.R = r2
            r4.y(r5)
            r4.v(r6)
            if (r0 >= 0) goto L14
            r4.Q = r2
            goto L16
        L14:
            r4.Q = r0
        L16:
            if (r1 >= 0) goto L1b
            r4.R = r2
            goto L1d
        L1b:
            r4.R = r1
        L1d:
            java.lang.Object r4 = r3.d
            qc r4 = (defpackage.qc) r4
            r4.E()
            return
    }

    public void B(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r3.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.b
            ez r0 = (defpackage.ez) r0
            b00 r4 = androidx.recyclerview.widget.RecyclerView.I(r4)
            if (r4 == 0) goto L30
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            int r1 = r4.p
            boolean r2 = r0.L()
            if (r2 == 0) goto L26
            r4.q = r1
            java.util.ArrayList r0 = r0.p0
            r0.add(r4)
            goto L2d
        L26:
            android.view.View r0 = r4.a
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.s90.s(r0, r1)
        L2d:
            r0 = 0
            r4.p = r0
        L30:
            return
    }

    public void a(defpackage.ml r4) {
            r3 = this;
            java.lang.Object r0 = r3.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r3.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.c     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L1b
            r1.add(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            r4.k = r0
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment already added: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void b(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.r(r4)
        L11:
            java.lang.Object r1 = r2.c
            fa r1 = (defpackage.fa) r1
            r1.e(r4, r5)
            if (r5 == 0) goto L1d
            r2.u(r3)
        L1d:
            r0.addView(r3, r4)
            androidx.recyclerview.widget.RecyclerView.I(r3)
            return
    }

    public void c(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            java.lang.Object r0 = r2.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.r(r4)
        L11:
            java.lang.Object r1 = r2.c
            fa r1 = (defpackage.fa) r1
            r1.e(r4, r6)
            if (r6 == 0) goto L1d
            r2.u(r3)
        L1d:
            b00 r6 = androidx.recyclerview.widget.RecyclerView.I(r3)
            if (r6 == 0) goto L51
            boolean r1 = r6.j()
            if (r1 != 0) goto L4b
            boolean r1 = r6.o()
            if (r1 == 0) goto L30
            goto L4b
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Called attach on a child which is not detached: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = r0.y()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4b:
            int r1 = r6.j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r6.j = r1
        L51:
            androidx.recyclerview.widget.RecyclerView.a(r0, r3, r4, r5)
            return
    }

    public void d(int r5) {
            r4 = this;
            int r5 = r4.r(r5)
            java.lang.Object r0 = r4.c
            fa r0 = (defpackage.fa) r0
            r0.f(r5)
            java.lang.Object r0 = r4.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 == 0) goto L4a
            b00 r1 = androidx.recyclerview.widget.RecyclerView.I(r1)
            if (r1 == 0) goto L4a
            boolean r2 = r1.j()
            if (r2 == 0) goto L45
            boolean r2 = r1.o()
            if (r2 == 0) goto L2a
            goto L45
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "called detach on an already detached child "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r0 = r0.y()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
        L45:
            r2 = 256(0x100, float:3.59E-43)
            r1.a(r2)
        L4a:
            androidx.recyclerview.widget.RecyclerView.c(r0, r5)
            return
    }

    public void e(android.os.Bundle r7) {
            r6 = this;
            java.lang.Object r0 = r6.c
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r6.d
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131755035(0x7f10001b, float:1.9140938E38)
            java.lang.String r1 = r1.getString(r2)
            if (r7 == 0) goto L61
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L45
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L45
            java.util.Set r3 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L45
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassNotFoundException -> L45
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L45
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L45
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L45
            r5 = 0
            java.lang.String r5 = r7.getString(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L45
            boolean r5 = r1.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L45
            if (r5 == 0) goto L1e
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L45
            java.lang.Class<ap> r5 = defpackage.ap.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.ClassNotFoundException -> L45
            if (r5 == 0) goto L1e
            r0.add(r4)     // Catch: java.lang.ClassNotFoundException -> L45
            goto L1e
        L45:
            r7 = move-exception
            goto L5b
        L47:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.ClassNotFoundException -> L45
        L4b:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L45
            if (r0 == 0) goto L61
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L45
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L45
            r6.f(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L45
            goto L4b
        L5b:
            pb r0 = new pb
            r0.<init>(r7)
            throw r0
        L61:
            return
    }

    public java.lang.Object f(java.lang.Class r6, java.util.HashSet r7) {
            r5 = this;
            java.lang.Object r0 = r5.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "Cannot initialize "
            boolean r2 = defpackage.ct.r()
            if (r2 == 0) goto L17
            java.lang.String r2 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L14
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r6 = move-exception
            goto L8f
        L17:
            boolean r2 = r7.contains(r6)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L74
            boolean r1 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L6c
            r7.add(r6)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L55
            ap r1 = (defpackage.ap) r1     // Catch: java.lang.Throwable -> L55
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> L55
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L57
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L55
        L3f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L55
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L3f
            r5.f(r3, r7)     // Catch: java.lang.Throwable -> L55
            goto L3f
        L55:
            r6 = move-exception
            goto L66
        L57:
            java.lang.Object r2 = r5.d     // Catch: java.lang.Throwable -> L55
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L55
            r7.remove(r6)     // Catch: java.lang.Throwable -> L55
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L55
            goto L70
        L66:
            pb r7 = new pb     // Catch: java.lang.Throwable -> L14
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r7     // Catch: java.lang.Throwable -> L14
        L6c:
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L14
        L70:
            android.os.Trace.endSection()
            return r1
        L74:
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L14
            r7.append(r6)     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = ". Cycle detected."
            r7.append(r6)     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r7     // Catch: java.lang.Throwable -> L14
        L8f:
            android.os.Trace.endSection()
            throw r6
    }

    public defpackage.ml g(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            if (r2 == 0) goto Lf
            ml r2 = r2.c
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public defpackage.ml h(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            if (r1 == 0) goto Lc
            ml r1 = r1.c
            java.lang.String r2 = r1.e
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L25
            goto L2d
        L25:
            yl r1 = r1.t
            r5 r1 = r1.c
            ml r1 = r1.h(r4)
        L2d:
            if (r1 == 0) goto Lc
            return r1
        L30:
            r4 = 0
            return r4
    }

    public java.util.ArrayList i() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r3.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            if (r2 == 0) goto L11
            r0.add(r2)
            goto L11
        L23:
            return r0
    }

    public android.view.View j(int r2) {
            r1 = this;
            int r2 = r1.r(r2)
            java.lang.Object r0 = r1.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    public int k() {
            r2 = this;
            java.lang.Object r0 = r2.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            int r0 = r0.getChildCount()
            java.lang.Object r1 = r2.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    public android.content.res.ColorStateList l(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L1c
            r1 = 0
            int r1 = r0.getResourceId(r4, r1)
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r3.d
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r1 = defpackage.ip.v(r2, r1)
            if (r1 == 0) goto L1c
            return r1
        L1c:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            return r4
    }

    public android.graphics.drawable.Drawable m(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r2.d
            android.content.Context r3 = (android.content.Context) r3
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r3, r1)
            return r3
        L1a:
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    public android.graphics.drawable.Drawable n(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r0 = r0.hasValue(r5)
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r5 = r0.getResourceId(r5, r1)
            if (r5 == 0) goto L2a
            u3 r0 = defpackage.u3.a()
            java.lang.Object r1 = r4.d
            android.content.Context r1 = (android.content.Context) r1
            monitor-enter(r0)
            w00 r2 = r0.a     // Catch: java.lang.Throwable -> L27
            r3 = 1
            android.graphics.drawable.Drawable r5 = r2.d(r1, r5, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r5
        L27:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r5
        L2a:
            r5 = 0
            return r5
    }

    public android.graphics.Typeface o(int r10, int r11, defpackage.x4 r12) {
            r9 = this;
            java.lang.Object r0 = r9.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r3 = r0.getResourceId(r10, r1)
            if (r3 != 0) goto Lc
            goto L2b
        Lc:
            java.lang.Object r10 = r9.c
            android.util.TypedValue r10 = (android.util.TypedValue) r10
            if (r10 != 0) goto L19
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            r9.c = r10
        L19:
            java.lang.Object r10 = r9.d
            r2 = r10
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r10 = r9.c
            r4 = r10
            android.util.TypedValue r4 = (android.util.TypedValue) r4
            java.lang.ThreadLocal r10 = defpackage.c10.a
            boolean r10 = r2.isRestricted()
            if (r10 == 0) goto L2d
        L2b:
            r10 = 0
            return r10
        L2d:
            r7 = 1
            r8 = 0
            r5 = r11
            r6 = r12
            android.graphics.Typeface r10 = defpackage.c10.b(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // defpackage.j8
    public void onCancel() {
            r2 = this;
            java.lang.Object r0 = r2.b
            android.view.View r0 = (android.view.View) r0
            r0.clearAnimation()
            java.lang.Object r1 = r2.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.endViewTransition(r0)
            java.lang.Object r0 = r2.d
            ag r0 = (defpackage.ag) r0
            r0.d()
            return
    }

    public java.util.List p() {
            r3 = this;
            java.lang.Object r0 = r3.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Ld:
            java.lang.Object r0 = r3.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r3.c     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public int r(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            fa r0 = (defpackage.fa) r0
            r1 = -1
            if (r6 >= 0) goto L8
            return r1
        L8:
            java.lang.Object r2 = r5.b
            ez r2 = (defpackage.ez) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.a
            int r2 = r2.getChildCount()
            r3 = r6
        L13:
            if (r3 >= r2) goto L2b
            int r4 = r0.b(r3)
            int r4 = r3 - r4
            int r4 = r6 - r4
            if (r4 != 0) goto L29
        L1f:
            boolean r6 = r0.d(r3)
            if (r6 == 0) goto L28
            int r3 = r3 + 1
            goto L1f
        L28:
            return r3
        L29:
            int r3 = r3 + r4
            goto L13
        L2b:
            return r1
    }

    public android.view.View s(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    public int t() {
            r1 = this;
            java.lang.Object r0 = r1.b
            ez r0 = (defpackage.ez) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            int r0 = r0.getChildCount()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.c
            fa r1 = (defpackage.fa) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.lang.Object r1 = r2.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void u(android.view.View r5) {
            r4 = this;
            java.lang.Object r0 = r4.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
            java.lang.Object r0 = r4.b
            ez r0 = (defpackage.ez) r0
            b00 r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r5 == 0) goto L39
            android.view.View r1 = r5.a
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            int r2 = r5.q
            r3 = -1
            if (r2 == r3) goto L1d
            r5.p = r2
            goto L25
        L1d:
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r2 = defpackage.s90.c(r1)
            r5.p = r2
        L25:
            boolean r2 = r0.L()
            r3 = 4
            if (r2 == 0) goto L34
            r5.q = r3
            java.util.ArrayList r0 = r0.p0
            r0.add(r5)
            return
        L34:
            java.util.WeakHashMap r5 = defpackage.ja0.a
            defpackage.s90.s(r1, r3)
        L39:
            return
    }

    public void v(androidx.fragment.app.a r4) {
            r3 = this;
            ml r0 = r4.c
            java.lang.String r1 = r0.e
            java.lang.Object r2 = r3.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r0.e
            r2.put(r1, r4)
            r4 = 2
            boolean r4 = defpackage.yl.A(r4)
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Added fragment to active set "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L2e:
            return
    }

    public void w(androidx.fragment.app.a r4) {
            r3 = this;
            ml r4 = r4.c
            boolean r0 = r4.A
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r3.d
            am r0 = (defpackage.am) r0
            r0.b(r4)
        Ld:
            java.lang.Object r0 = r3.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = r4.e
            r2 = 0
            java.lang.Object r0 = r0.put(r1, r2)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            if (r0 != 0) goto L1d
            goto L37
        L1d:
            r0 = 2
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Removed fragment from active set "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L37:
            return
    }

    public boolean x(defpackage.hc r7, defpackage.pc r8, boolean r9) {
            r6 = this;
            java.lang.Object r0 = r6.c
            k7 r0 = (defpackage.k7) r0
            int[] r1 = r8.c0
            int[] r2 = r8.l
            r3 = 0
            r4 = r1[r3]
            r0.a = r4
            r4 = 1
            r1 = r1[r4]
            r0.b = r1
            int r1 = r8.l()
            r0.c = r1
            int r1 = r8.i()
            r0.d = r1
            r0.i = r3
            r0.j = r9
            int r9 = r0.a
            r1 = 3
            if (r9 != r1) goto L29
            r9 = r4
            goto L2a
        L29:
            r9 = r3
        L2a:
            int r5 = r0.b
            if (r5 != r1) goto L30
            r1 = r4
            goto L31
        L30:
            r1 = r3
        L31:
            r5 = 0
            if (r9 == 0) goto L3c
            float r9 = r8.L
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L3c
            r9 = r4
            goto L3d
        L3c:
            r9 = r3
        L3d:
            if (r1 == 0) goto L47
            float r1 = r8.L
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L47
            r1 = r4
            goto L48
        L47:
            r1 = r3
        L48:
            r5 = 4
            if (r9 == 0) goto L51
            r9 = r2[r3]
            if (r9 != r5) goto L51
            r0.a = r4
        L51:
            if (r1 == 0) goto L59
            r9 = r2[r4]
            if (r9 != r5) goto L59
            r0.b = r4
        L59:
            r7.a(r8, r0)
            int r7 = r0.e
            r8.y(r7)
            int r7 = r0.f
            r8.v(r7)
            boolean r7 = r0.h
            r8.w = r7
            int r7 = r0.g
            r8.P = r7
            if (r7 <= 0) goto L71
            goto L72
        L71:
            r4 = r3
        L72:
            r8.w = r4
            r0.j = r3
            boolean r7 = r0.i
            return r7
    }

    public void z() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            return
    }
}
