package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f915a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public boolean d;
    public boolean e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f916a;
        public boolean b;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r2, r0)
                return
        }

        public void b(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r2, r0)
                return
        }

        public void c(a.R1 r2, android.view.ViewGroup r3) {
                r1 = this;
                java.lang.String r0 = "backEvent"
                a.C0193i9.e(r2, r0)
                java.lang.String r2 = "container"
                a.C0193i9.e(r3, r2)
                return
        }

        public void d(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r2, r0)
                return
        }
    }

    public static final class b extends androidx.fragment.app.f.c {
        public final androidx.fragment.app.e l;

        public b(androidx.fragment.app.f.c.b r3, androidx.fragment.app.f.c.a r4, androidx.fragment.app.e r5) {
                r2 = this;
                androidx.fragment.app.b r0 = r5.c
                java.lang.String r1 = "fragmentStateManager.fragment"
                a.C0193i9.d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.l = r5
                return
        }

        @Override // androidx.fragment.app.f.c
        public final void b() {
                r2 = this;
                super.b()
                r0 = 0
                androidx.fragment.app.b r1 = r2.c
                r1.m = r0
                androidx.fragment.app.e r0 = r2.l
                r0.k()
                return
        }

        @Override // androidx.fragment.app.f.c
        public final void e() {
                r7 = this;
                boolean r0 = r7.h
                if (r0 == 0) goto L6
                goto Lb3
            L6:
                r0 = 1
                r7.h = r0
                androidx.fragment.app.f$c$a r0 = r7.b
                androidx.fragment.app.f$c$a r1 = androidx.fragment.app.f.c.a.b
                java.lang.String r2 = " for Fragment "
                java.lang.String r3 = "FragmentManager"
                r4 = 2
                java.lang.String r5 = "fragmentStateManager.fragment"
                androidx.fragment.app.e r6 = r7.l
                if (r0 != r1) goto L7a
                androidx.fragment.app.b r0 = r6.c
                a.C0193i9.d(r0, r5)
                android.view.View r1 = r0.G
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L48
                androidx.fragment.app.b$d r5 = r0.b()
                r5.k = r1
                boolean r4 = a.AbstractC0119e7.J(r4)
                if (r4 == 0) goto L48
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "requestFocus: Saved focused view "
                r4.<init>(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                android.util.Log.v(r3, r1)
            L48:
                androidx.fragment.app.b r1 = r7.c
                android.view.View r1 = r1.B()
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L5b
                r6.b()
                r1.setAlpha(r3)
            L5b:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L6d
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L6d
                r2 = 4
                r1.setVisibility(r2)
            L6d:
                androidx.fragment.app.b$d r0 = r0.J
                if (r0 != 0) goto L74
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L76
            L74:
                float r0 = r0.j
            L76:
                r1.setAlpha(r0)
                return
            L7a:
                androidx.fragment.app.f$c$a r1 = androidx.fragment.app.f.c.a.c
                if (r0 != r1) goto Lb3
                androidx.fragment.app.b r0 = r6.c
                a.C0193i9.d(r0, r5)
                android.view.View r1 = r0.B()
                boolean r4 = a.AbstractC0119e7.J(r4)
                if (r4 == 0) goto Lb0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Clearing focus "
                r4.<init>(r5)
                android.view.View r5 = r1.findFocus()
                r4.append(r5)
                java.lang.String r5 = " on view "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                android.util.Log.v(r3, r0)
            Lb0:
                r1.clearFocus()
            Lb3:
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.fragment.app.f.c.b f917a;
        public androidx.fragment.app.f.c.a b;
        public final androidx.fragment.app.b c;
        public final java.util.ArrayList d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final java.util.ArrayList j;
        public final java.util.ArrayList k;

        public enum a extends java.lang.Enum<androidx.fragment.app.f.c.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final androidx.fragment.app.f.c.a f918a = null;
            public static final androidx.fragment.app.f.c.a b = null;
            public static final androidx.fragment.app.f.c.a c = null;
            public static final /* synthetic */ androidx.fragment.app.f.c.a[] d = null;

            static {
                    androidx.fragment.app.f$c$a r0 = new androidx.fragment.app.f$c$a
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.f.c.a.f918a = r0
                    androidx.fragment.app.f$c$a r1 = new androidx.fragment.app.f$c$a
                    java.lang.String r2 = "ADDING"
                    r3 = 1
                    r1.<init>(r2, r3)
                    androidx.fragment.app.f.c.a.b = r1
                    androidx.fragment.app.f$c$a r2 = new androidx.fragment.app.f$c$a
                    java.lang.String r3 = "REMOVING"
                    r4 = 2
                    r2.<init>(r3, r4)
                    androidx.fragment.app.f.c.a.c = r2
                    androidx.fragment.app.f$c$a[] r0 = new androidx.fragment.app.f.c.a[]{r0, r1, r2}
                    androidx.fragment.app.f.c.a.d = r0
                    return
            }

            a() {
                    r0 = this;
                    r0 = 0
                    throw r0
            }

            public static androidx.fragment.app.f.c.a valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.f$c$a> r0 = androidx.fragment.app.f.c.a.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.f$c$a r1 = (androidx.fragment.app.f.c.a) r1
                    return r1
            }

            public static androidx.fragment.app.f.c.a[] values() {
                    androidx.fragment.app.f$c$a[] r0 = androidx.fragment.app.f.c.a.d
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.f$c$a[] r0 = (androidx.fragment.app.f.c.a[]) r0
                    return r0
            }
        }

        public enum b extends java.lang.Enum<androidx.fragment.app.f.c.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final androidx.fragment.app.f.c.b f919a = null;
            public static final androidx.fragment.app.f.c.b b = null;
            public static final androidx.fragment.app.f.c.b c = null;
            public static final androidx.fragment.app.f.c.b d = null;
            public static final /* synthetic */ androidx.fragment.app.f.c.b[] e = null;

            static {
                    androidx.fragment.app.f$c$b r0 = new androidx.fragment.app.f$c$b
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.f.c.b.f919a = r0
                    androidx.fragment.app.f$c$b r1 = new androidx.fragment.app.f$c$b
                    java.lang.String r2 = "VISIBLE"
                    r3 = 1
                    r1.<init>(r2, r3)
                    androidx.fragment.app.f.c.b.b = r1
                    androidx.fragment.app.f$c$b r2 = new androidx.fragment.app.f$c$b
                    java.lang.String r3 = "GONE"
                    r4 = 2
                    r2.<init>(r3, r4)
                    androidx.fragment.app.f.c.b.c = r2
                    androidx.fragment.app.f$c$b r3 = new androidx.fragment.app.f$c$b
                    java.lang.String r4 = "INVISIBLE"
                    r5 = 3
                    r3.<init>(r4, r5)
                    androidx.fragment.app.f.c.b.d = r3
                    androidx.fragment.app.f$c$b[] r0 = new androidx.fragment.app.f.c.b[]{r0, r1, r2, r3}
                    androidx.fragment.app.f.c.b.e = r0
                    return
            }

            b() {
                    r0 = this;
                    r0 = 0
                    throw r0
            }

            public static androidx.fragment.app.f.c.b valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.f$c$b> r0 = androidx.fragment.app.f.c.b.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.f$c$b r1 = (androidx.fragment.app.f.c.b) r1
                    return r1
            }

            public static androidx.fragment.app.f.c.b[] values() {
                    androidx.fragment.app.f$c$b[] r0 = androidx.fragment.app.f.c.b.e
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.f$c$b[] r0 = (androidx.fragment.app.f.c.b[]) r0
                    return r0
            }

            public final void a(android.view.View r7, android.view.ViewGroup r8) {
                    r6 = this;
                    java.lang.String r0 = "view"
                    a.C0193i9.e(r7, r0)
                    java.lang.String r0 = "container"
                    a.C0193i9.e(r8, r0)
                    int r0 = r6.ordinal()
                    r1 = 0
                    java.lang.String r2 = "FragmentManager"
                    r3 = 2
                    if (r0 == 0) goto Lad
                    r4 = 1
                    java.lang.String r5 = "SpecialEffectsController: Setting view "
                    if (r0 == r4) goto L5f
                    if (r0 == r3) goto L3f
                    r8 = 3
                    if (r0 == r8) goto L20
                    goto Ldc
                L20:
                    boolean r8 = a.AbstractC0119e7.J(r3)
                    if (r8 == 0) goto L3a
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>(r5)
                    r8.append(r7)
                    java.lang.String r0 = " to INVISIBLE"
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    android.util.Log.v(r2, r8)
                L3a:
                    r8 = 4
                    r7.setVisibility(r8)
                    return
                L3f:
                    boolean r8 = a.AbstractC0119e7.J(r3)
                    if (r8 == 0) goto L59
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>(r5)
                    r8.append(r7)
                    java.lang.String r0 = " to GONE"
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    android.util.Log.v(r2, r8)
                L59:
                    r8 = 8
                    r7.setVisibility(r8)
                    return
                L5f:
                    boolean r0 = a.AbstractC0119e7.J(r3)
                    if (r0 == 0) goto L79
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r5)
                    r0.append(r7)
                    java.lang.String r4 = " to VISIBLE"
                    r0.append(r4)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L79:
                    android.view.ViewParent r0 = r7.getParent()
                    boolean r4 = r0 instanceof android.view.ViewGroup
                    if (r4 == 0) goto L84
                    r1 = r0
                    android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                L84:
                    if (r1 != 0) goto La8
                    boolean r0 = a.AbstractC0119e7.J(r3)
                    if (r0 == 0) goto La5
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "SpecialEffectsController: Adding view "
                    r0.<init>(r1)
                    r0.append(r7)
                    java.lang.String r1 = " to Container "
                    r0.append(r1)
                    r0.append(r8)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                La5:
                    r8.addView(r7)
                La8:
                    r8 = 0
                    r7.setVisibility(r8)
                    return
                Lad:
                    android.view.ViewParent r8 = r7.getParent()
                    boolean r0 = r8 instanceof android.view.ViewGroup
                    if (r0 == 0) goto Lb8
                    r1 = r8
                    android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                Lb8:
                    if (r1 == 0) goto Ldc
                    boolean r8 = a.AbstractC0119e7.J(r3)
                    if (r8 == 0) goto Ld9
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r0 = "SpecialEffectsController: Removing view "
                    r8.<init>(r0)
                    r8.append(r7)
                    java.lang.String r0 = " from container "
                    r8.append(r0)
                    r8.append(r1)
                    java.lang.String r8 = r8.toString()
                    android.util.Log.v(r2, r8)
                Ld9:
                    r1.removeView(r7)
                Ldc:
                    return
            }
        }

        public c(androidx.fragment.app.f.c.b r2, androidx.fragment.app.f.c.a r3, androidx.fragment.app.b r4) {
                r1 = this;
                java.lang.String r0 = "fragment"
                a.C0193i9.e(r4, r0)
                r1.<init>()
                r1.f917a = r2
                r1.b = r3
                r1.c = r4
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.d = r2
                r2 = 1
                r1.i = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.j = r2
                r1.k = r2
                return
        }

        public final void a(android.view.ViewGroup r5) {
                r4 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r5, r0)
                r0 = 0
                r4.h = r0
                boolean r0 = r4.e
                if (r0 == 0) goto Ld
                goto L3f
            Ld:
                r0 = 1
                r4.e = r0
                java.util.ArrayList r1 = r4.j
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L1c
                r4.b()
                return
            L1c:
                java.util.ArrayList r1 = r4.k
                java.util.List r1 = a.C0383t3.w0(r1)
                java.util.Iterator r1 = r1.iterator()
            L26:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3f
                java.lang.Object r2 = r1.next()
                androidx.fragment.app.f$a r2 = (androidx.fragment.app.f.a) r2
                r2.getClass()
                boolean r3 = r2.b
                if (r3 != 0) goto L3c
                r2.a(r5)
            L3c:
                r2.b = r0
                goto L26
            L3f:
                return
        }

        public void b() {
                r2 = this;
                r0 = 0
                r2.h = r0
                boolean r0 = r2.f
                if (r0 == 0) goto L8
                goto L40
            L8:
                r0 = 2
                boolean r0 = a.AbstractC0119e7.J(r0)
                if (r0 == 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SpecialEffectsController: "
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r1 = " has called complete."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L27:
                r0 = 1
                r2.f = r0
                java.util.ArrayList r0 = r2.d
                java.util.Iterator r0 = r0.iterator()
            L30:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L40
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L30
            L40:
                return
        }

        public final void c(androidx.fragment.app.f.a r2) {
                r1 = this;
                java.lang.String r0 = "effect"
                a.C0193i9.e(r2, r0)
                java.util.ArrayList r0 = r1.j
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L16
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L16
                r1.b()
            L16:
                return
        }

        public final void d(androidx.fragment.app.f.c.b r7, androidx.fragment.app.f.c.a r8) {
                r6 = this;
                int r8 = r8.ordinal()
                androidx.fragment.app.f$c$b r0 = androidx.fragment.app.f.c.b.f919a
                java.lang.String r1 = " mFinalState = "
                androidx.fragment.app.b r2 = r6.c
                java.lang.String r3 = "SpecialEffectsController: For fragment "
                java.lang.String r4 = "FragmentManager"
                r5 = 2
                if (r8 == 0) goto L80
                r7 = 1
                if (r8 == r7) goto L4d
                if (r8 == r5) goto L18
                goto Lb0
            L18:
                boolean r8 = a.AbstractC0119e7.J(r5)
                if (r8 == 0) goto L44
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r3)
                r8.append(r2)
                r8.append(r1)
                androidx.fragment.app.f$c$b r1 = r6.f917a
                r8.append(r1)
                java.lang.String r1 = " -> REMOVED. mLifecycleImpact  = "
                r8.append(r1)
                androidx.fragment.app.f$c$a r1 = r6.b
                r8.append(r1)
                java.lang.String r1 = " to REMOVING."
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                android.util.Log.v(r4, r8)
            L44:
                r6.f917a = r0
                androidx.fragment.app.f$c$a r8 = androidx.fragment.app.f.c.a.c
                r6.b = r8
                r6.i = r7
                return
            L4d:
                androidx.fragment.app.f$c$b r8 = r6.f917a
                if (r8 != r0) goto Lb0
                boolean r8 = a.AbstractC0119e7.J(r5)
                if (r8 == 0) goto L75
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r3)
                r8.append(r2)
                java.lang.String r0 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                r8.append(r0)
                androidx.fragment.app.f$c$a r0 = r6.b
                r8.append(r0)
                java.lang.String r0 = " to ADDING."
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                android.util.Log.v(r4, r8)
            L75:
                androidx.fragment.app.f$c$b r8 = androidx.fragment.app.f.c.b.b
                r6.f917a = r8
                androidx.fragment.app.f$c$a r8 = androidx.fragment.app.f.c.a.b
                r6.b = r8
                r6.i = r7
                return
            L80:
                androidx.fragment.app.f$c$b r8 = r6.f917a
                if (r8 == r0) goto Lb0
                boolean r8 = a.AbstractC0119e7.J(r5)
                if (r8 == 0) goto Lae
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r3)
                r8.append(r2)
                r8.append(r1)
                androidx.fragment.app.f$c$b r0 = r6.f917a
                r8.append(r0)
                java.lang.String r0 = " -> "
                r8.append(r0)
                r8.append(r7)
                r0 = 46
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                android.util.Log.v(r4, r8)
            Lae:
                r6.f917a = r7
            Lb0:
                return
        }

        public void e() {
                r1 = this;
                r0 = 1
                r1.h = r0
                return
        }

        public final java.lang.String toString() {
                r3 = this;
                int r0 = java.lang.System.identityHashCode(r3)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Operation {"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "} {finalState = "
                r1.append(r0)
                androidx.fragment.app.f$c$b r0 = r3.f917a
                r1.append(r0)
                java.lang.String r0 = " lifecycleImpact = "
                r1.append(r0)
                androidx.fragment.app.f$c$a r0 = r3.b
                r1.append(r0)
                java.lang.String r0 = " fragment = "
                r1.append(r0)
                androidx.fragment.app.b r0 = r3.c
                r1.append(r0)
                r0 = 125(0x7d, float:1.75E-43)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.fragment.app.f$c$a[] r0 = androidx.fragment.app.f.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                r2 = 0
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> Lb
            Lb:
                androidx.fragment.app.f.d.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public f(android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f915a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            return
    }

    public static final androidx.fragment.app.f i(android.view.ViewGroup r1, a.AbstractC0119e7 r2) {
            java.lang.String r0 = "container"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "fragmentManager"
            a.C0193i9.e(r2, r0)
            a.qe r2 = r2.H()
            java.lang.String r0 = "fragmentManager.specialEffectsControllerFactory"
            a.C0193i9.d(r2, r0)
            int r2 = androidx.fragment.R.id.special_effects_controller_view_tag
            java.lang.Object r2 = r1.getTag(r2)
            boolean r0 = r2 instanceof androidx.fragment.app.f
            if (r0 == 0) goto L20
            androidx.fragment.app.f r2 = (androidx.fragment.app.f) r2
            return r2
        L20:
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r1)
            int r0 = androidx.fragment.R.id.special_effects_controller_view_tag
            r1.setTag(r0, r2)
            return r2
    }

    public final void a(androidx.fragment.app.f.c r4) {
            r3 = this;
            java.lang.String r0 = "operation"
            a.C0193i9.e(r4, r0)
            boolean r0 = r4.i
            if (r0 == 0) goto L19
            androidx.fragment.app.f$c$b r0 = r4.f917a
            androidx.fragment.app.b r1 = r4.c
            android.view.View r1 = r1.B()
            android.view.ViewGroup r2 = r3.f915a
            r0.a(r1, r2)
            r0 = 0
            r4.i = r0
        L19:
            return
    }

    public abstract void b(java.util.ArrayList r1, boolean r2);

    public final void c(java.util.ArrayList r7) {
            r6 = this;
            java.lang.String r0 = "operations"
            a.C0193i9.e(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.f$c r2 = (androidx.fragment.app.f.c) r2
            java.util.ArrayList r2 = r2.k
            a.C0365s3.h0(r0, r2)
            goto Le
        L20:
            java.util.Set r0 = a.C0383t3.A0(r0)
            java.util.List r0 = a.C0383t3.w0(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L2e:
            if (r3 >= r1) goto L3e
            java.lang.Object r4 = r0.get(r3)
            androidx.fragment.app.f$a r4 = (androidx.fragment.app.f.a) r4
            android.view.ViewGroup r5 = r6.f915a
            r4.b(r5)
            int r3 = r3 + 1
            goto L2e
        L3e:
            int r0 = r7.size()
            r1 = r2
        L43:
            if (r1 >= r0) goto L51
            java.lang.Object r3 = r7.get(r1)
            androidx.fragment.app.f$c r3 = (androidx.fragment.app.f.c) r3
            r6.a(r3)
            int r1 = r1 + 1
            goto L43
        L51:
            java.util.List r7 = a.C0383t3.w0(r7)
            int r0 = r7.size()
        L59:
            if (r2 >= r0) goto L6f
            java.lang.Object r1 = r7.get(r2)
            androidx.fragment.app.f$c r1 = (androidx.fragment.app.f.c) r1
            java.util.ArrayList r3 = r1.k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6c
            r1.b()
        L6c:
            int r2 = r2 + 1
            goto L59
        L6f:
            return
    }

    public final void d(androidx.fragment.app.f.c.b r4, androidx.fragment.app.f.c.a r5, androidx.fragment.app.e r6) {
            r3 = this;
            java.util.ArrayList r0 = r3.b
            monitor-enter(r0)
            androidx.fragment.app.b r1 = r6.c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "fragmentStateManager.fragment"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L1b
            androidx.fragment.app.f$c r1 = r3.f(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1e
            androidx.fragment.app.b r1 = r6.c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1.m     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            androidx.fragment.app.f$c r1 = r3.g(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r4 = move-exception
            goto L49
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L25
            r1.d(r4, r5)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L25:
            androidx.fragment.app.f$b r1 = new androidx.fragment.app.f$b     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r4 = r3.b     // Catch: java.lang.Throwable -> L1b
            r4.add(r1)     // Catch: java.lang.Throwable -> L1b
            a.pe r4 = new a.pe     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            r4.<init>(r3, r1, r5)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r5 = r1.d     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            a.pe r4 = new a.pe     // Catch: java.lang.Throwable -> L1b
            r5 = 1
            r4.<init>(r3, r1, r5)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r5 = r1.d     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L49:
            monitor-exit(r0)
            throw r4
    }

    public final void e() {
            r10 = this;
            r0 = 1
            boolean r1 = r10.e
            if (r1 == 0) goto L6
            return
        L6:
            android.view.ViewGroup r1 = r10.f915a
            boolean r1 = r1.isAttachedToWindow()
            r2 = 0
            if (r1 != 0) goto L15
            r10.h()
            r10.d = r2
            return
        L15:
            java.util.ArrayList r1 = r10.b
            monitor-enter(r1)
            java.util.ArrayList r3 = r10.b     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5e
            r4 = 2
            if (r3 == 0) goto L7d
            java.util.ArrayList r0 = r10.c     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r0 = a.C0383t3.y0(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r2 = r10.c     // Catch: java.lang.Throwable -> L5e
            r2.clear()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5e
        L30:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L1a0
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$c r2 = (androidx.fragment.app.f.c) r2     // Catch: java.lang.Throwable -> L5e
            boolean r3 = a.AbstractC0119e7.J(r4)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L61
            java.lang.String r3 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            r5.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = " with no incoming pendingOperations"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.v(r3, r5)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r0 = move-exception
            goto L1a4
        L61:
            android.view.ViewGroup r3 = r10.f915a     // Catch: java.lang.Throwable -> L5e
            r2.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "container"
            a.C0193i9.e(r3, r5)     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r2.e     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L70
            goto L73
        L70:
            r2.a(r3)     // Catch: java.lang.Throwable -> L5e
        L73:
            boolean r3 = r2.f     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L30
            java.util.ArrayList r3 = r10.c     // Catch: java.lang.Throwable -> L5e
            r3.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto L30
        L7d:
            java.util.ArrayList r3 = r10.c     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r3 = a.C0383t3.y0(r3)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r5 = r10.c     // Catch: java.lang.Throwable -> L5e
            r5.clear()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L5e
        L8c:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto Ld5
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$c r5 = (androidx.fragment.app.f.c) r5     // Catch: java.lang.Throwable -> L5e
            boolean r6 = a.AbstractC0119e7.J(r4)     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto Lb4
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r7.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "SpecialEffectsController: Cancelling operation "
            r7.append(r8)     // Catch: java.lang.Throwable -> L5e
            r7.append(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.v(r6, r7)     // Catch: java.lang.Throwable -> L5e
        Lb4:
            android.view.ViewGroup r6 = r10.f915a     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.b r7 = r5.c     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r7.m     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "container"
            a.C0193i9.e(r6, r8)     // Catch: java.lang.Throwable -> L5e
            boolean r8 = r5.e     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto Lc4
            goto Lcb
        Lc4:
            if (r7 == 0) goto Lc8
            r5.g = r0     // Catch: java.lang.Throwable -> L5e
        Lc8:
            r5.a(r6)     // Catch: java.lang.Throwable -> L5e
        Lcb:
            boolean r6 = r5.f     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L8c
            java.util.ArrayList r6 = r10.c     // Catch: java.lang.Throwable -> L5e
            r6.add(r5)     // Catch: java.lang.Throwable -> L5e
            goto L8c
        Ld5:
            r10.k()     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r3 = r10.b     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r3 = a.C0383t3.y0(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto Le6
            monitor-exit(r1)
            return
        Le6:
            java.util.ArrayList r5 = r10.b     // Catch: java.lang.Throwable -> L5e
            r5.clear()     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r5 = r10.c     // Catch: java.lang.Throwable -> L5e
            r5.addAll(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r5 = a.AbstractC0119e7.J(r4)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto Lfd
            java.lang.String r5 = "FragmentManager"
            java.lang.String r6 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Lfd:
            boolean r5 = r10.d     // Catch: java.lang.Throwable -> L5e
            r10.b(r3, r5)     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L5e
            r6 = r0
            r7 = r6
        L108:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto L14b
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$c r7 = (androidx.fragment.app.f.c) r7     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r8 = r7.k     // Catch: java.lang.Throwable -> L5e
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r8 != 0) goto L141
            java.util.ArrayList r8 = r7.k     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto L127
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L127
            goto L13f
        L127:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L5e
        L12b:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L13f
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$a r9 = (androidx.fragment.app.f.a) r9     // Catch: java.lang.Throwable -> L5e
            r9.getClass()     // Catch: java.lang.Throwable -> L5e
            boolean r9 = r9 instanceof androidx.fragment.app.a.c     // Catch: java.lang.Throwable -> L5e
            if (r9 != 0) goto L12b
            goto L141
        L13f:
            r8 = r0
            goto L142
        L141:
            r8 = r2
        L142:
            androidx.fragment.app.b r7 = r7.c     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r7.m     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L149
            r6 = r2
        L149:
            r7 = r8
            goto L108
        L14b:
            if (r7 == 0) goto L170
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L5e
        L156:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto L168
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$c r8 = (androidx.fragment.app.f.c) r8     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r8 = r8.k     // Catch: java.lang.Throwable -> L5e
            a.C0365s3.h0(r5, r8)     // Catch: java.lang.Throwable -> L5e
            goto L156
        L168:
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L170
            r5 = r0
            goto L171
        L170:
            r5 = r2
        L171:
            if (r6 != 0) goto L17a
            r10.j(r3)     // Catch: java.lang.Throwable -> L5e
            r10.c(r3)     // Catch: java.lang.Throwable -> L5e
            goto L191
        L17a:
            if (r5 == 0) goto L191
            r10.j(r3)     // Catch: java.lang.Throwable -> L5e
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L5e
            r6 = r2
        L184:
            if (r6 >= r5) goto L191
            java.lang.Object r7 = r3.get(r6)     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.f$c r7 = (androidx.fragment.app.f.c) r7     // Catch: java.lang.Throwable -> L5e
            r10.a(r7)     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + r0
            goto L184
        L191:
            r10.d = r2     // Catch: java.lang.Throwable -> L5e
            boolean r0 = a.AbstractC0119e7.J(r4)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L1a0
            java.lang.String r0 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r0, r2)     // Catch: java.lang.Throwable -> L5e
        L1a0:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r1)
            return
        L1a4:
            monitor-exit(r1)
            throw r0
    }

    public final androidx.fragment.app.f.c f(androidx.fragment.app.b r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.fragment.app.f$c r2 = (androidx.fragment.app.f.c) r2
            androidx.fragment.app.b r3 = r2.c
            boolean r3 = a.C0193i9.a(r3, r5)
            if (r3 == 0) goto L6
            boolean r2 = r2.e
            if (r2 != 0) goto L6
            goto L21
        L20:
            r1 = 0
        L21:
            androidx.fragment.app.f$c r1 = (androidx.fragment.app.f.c) r1
            return r1
    }

    public final androidx.fragment.app.f.c g(androidx.fragment.app.b r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.fragment.app.f$c r2 = (androidx.fragment.app.f.c) r2
            androidx.fragment.app.b r3 = r2.c
            boolean r3 = a.C0193i9.a(r3, r5)
            if (r3 == 0) goto L6
            boolean r2 = r2.e
            if (r2 != 0) goto L6
            goto L21
        L20:
            r1 = 0
        L21:
            androidx.fragment.app.f$c r1 = (androidx.fragment.app.f.c) r1
            return r1
    }

    public final void h() {
            r9 = this;
            r0 = 2
            boolean r1 = a.AbstractC0119e7.J(r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing all operations to complete"
            android.util.Log.v(r1, r2)
        Le:
            android.view.ViewGroup r1 = r9.f915a
            boolean r1 = r1.isAttachedToWindow()
            java.util.ArrayList r2 = r9.b
            monitor-enter(r2)
            r9.k()     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r3 = r9.b     // Catch: java.lang.Throwable -> L40
            r9.j(r3)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r3 = r9.c     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r3 = a.C0383t3.y0(r3)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L40
        L29:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L40
            androidx.fragment.app.f$c r4 = (androidx.fragment.app.f.c) r4     // Catch: java.lang.Throwable -> L40
            boolean r5 = a.AbstractC0119e7.J(r0)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L79
            if (r1 == 0) goto L43
            java.lang.String r5 = ""
            goto L5b
        L40:
            r0 = move-exception
            goto Le0
        L43:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            android.view.ViewGroup r6 = r9.f915a     // Catch: java.lang.Throwable -> L40
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
        L5b:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r7.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L40
            r7.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "Cancelling running operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L40
            r7.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L40
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L40
        L79:
            android.view.ViewGroup r5 = r9.f915a     // Catch: java.lang.Throwable -> L40
            r4.a(r5)     // Catch: java.lang.Throwable -> L40
            goto L29
        L7f:
            java.util.ArrayList r3 = r9.b     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r3 = a.C0383t3.y0(r3)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L40
        L89:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L40
            androidx.fragment.app.f$c r4 = (androidx.fragment.app.f.c) r4     // Catch: java.lang.Throwable -> L40
            boolean r5 = a.AbstractC0119e7.J(r0)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto Ld6
            if (r1 == 0) goto La0
            java.lang.String r5 = ""
            goto Lb8
        La0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            android.view.ViewGroup r6 = r9.f915a     // Catch: java.lang.Throwable -> L40
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
        Lb8:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r7.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L40
            r7.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "Cancelling pending operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L40
            r7.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L40
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L40
        Ld6:
            android.view.ViewGroup r5 = r9.f915a     // Catch: java.lang.Throwable -> L40
            r4.a(r5)     // Catch: java.lang.Throwable -> L40
            goto L89
        Ldc:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L40
            monitor-exit(r2)
            return
        Le0:
            monitor-exit(r2)
            throw r0
    }

    public final void j(java.util.ArrayList r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L14
            java.lang.Object r3 = r6.get(r2)
            androidx.fragment.app.f$c r3 = (androidx.fragment.app.f.c) r3
            r3.e()
            int r2 = r2 + 1
            goto L6
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r6.next()
            androidx.fragment.app.f$c r2 = (androidx.fragment.app.f.c) r2
            java.util.ArrayList r2 = r2.k
            a.C0365s3.h0(r0, r2)
            goto L1d
        L2f:
            java.util.Set r6 = a.C0383t3.A0(r0)
            java.util.List r6 = a.C0383t3.w0(r6)
            int r0 = r6.size()
        L3b:
            if (r1 >= r0) goto L5a
            java.lang.Object r2 = r6.get(r1)
            androidx.fragment.app.f$a r2 = (androidx.fragment.app.f.a) r2
            r2.getClass()
            android.view.ViewGroup r3 = r5.f915a
            java.lang.String r4 = "container"
            a.C0193i9.e(r3, r4)
            boolean r4 = r2.f916a
            if (r4 != 0) goto L54
            r2.d(r3)
        L54:
            r3 = 1
            r2.f916a = r3
            int r1 = r1 + 1
            goto L3b
        L5a:
            return
    }

    public final void k() {
            r4 = this;
            java.util.ArrayList r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.f$c r1 = (androidx.fragment.app.f.c) r1
            androidx.fragment.app.f$c$a r2 = r1.b
            androidx.fragment.app.f$c$a r3 = androidx.fragment.app.f.c.a.b
            if (r2 != r3) goto L6
            androidx.fragment.app.b r2 = r1.c
            android.view.View r2 = r2.B()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L3d
            r3 = 4
            if (r2 == r3) goto L3a
            r3 = 8
            if (r2 != r3) goto L2e
            androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.c
            goto L3f
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown visibility "
            java.lang.String r1 = a.C0487z.e(r1, r2)
            r0.<init>(r1)
            throw r0
        L3a:
            androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.d
            goto L3f
        L3d:
            androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.b
        L3f:
            androidx.fragment.app.f$c$a r3 = androidx.fragment.app.f.c.a.f918a
            r1.d(r2, r3)
            goto L6
        L45:
            return
    }
}
