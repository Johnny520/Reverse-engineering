package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.fragment.app.f {

    /* JADX INFO: renamed from: androidx.fragment.app.a$a, reason: collision with other inner class name */
    public static final class C0015a extends androidx.fragment.app.f.a {
        public final androidx.fragment.app.a.b c;

        /* JADX INFO: renamed from: androidx.fragment.app.a$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0016a implements android.view.animation.Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.fragment.app.f.c f900a;
            public final /* synthetic */ android.view.ViewGroup b;
            public final /* synthetic */ android.view.View c;
            public final /* synthetic */ androidx.fragment.app.a.C0015a d;

            public AnimationAnimationListenerC0016a(androidx.fragment.app.f.c r1, android.view.ViewGroup r2, android.view.View r3, androidx.fragment.app.a.C0015a r4) {
                    r0 = this;
                    r0.<init>()
                    r0.f900a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(android.view.animation.Animation r5) {
                    r4 = this;
                    java.lang.String r0 = "animation"
                    a.C0193i9.e(r5, r0)
                    a.h0 r5 = new a.h0
                    android.view.View r0 = r4.c
                    androidx.fragment.app.a$a r1 = r4.d
                    android.view.ViewGroup r2 = r4.b
                    r3 = 1
                    r5.<init>(r2, r0, r1, r3)
                    r2.post(r5)
                    r5 = 2
                    boolean r5 = a.AbstractC0119e7.J(r5)
                    if (r5 == 0) goto L35
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r0 = "Animation from operation "
                    r5.<init>(r0)
                    androidx.fragment.app.f$c r0 = r4.f900a
                    r5.append(r0)
                    java.lang.String r0 = " has ended."
                    r5.append(r0)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r0 = "FragmentManager"
                    android.util.Log.v(r0, r5)
                L35:
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(android.view.animation.Animation r2) {
                    r1 = this;
                    java.lang.String r0 = "animation"
                    a.C0193i9.e(r2, r0)
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(android.view.animation.Animation r2) {
                    r1 = this;
                    java.lang.String r0 = "animation"
                    a.C0193i9.e(r2, r0)
                    r2 = 2
                    boolean r2 = a.AbstractC0119e7.J(r2)
                    if (r2 == 0) goto L26
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r0 = "Animation from operation "
                    r2.<init>(r0)
                    androidx.fragment.app.f$c r0 = r1.f900a
                    r2.append(r0)
                    java.lang.String r0 = " has reached onAnimationStart."
                    r2.append(r0)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r0 = "FragmentManager"
                    android.util.Log.v(r0, r2)
                L26:
                    return
            }
        }

        public C0015a(androidx.fragment.app.a.b r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void a(android.view.ViewGroup r4) {
                r3 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r4, r0)
                androidx.fragment.app.a$b r0 = r3.c
                androidx.fragment.app.f$c r1 = r0.f904a
                androidx.fragment.app.b r2 = r1.c
                android.view.View r2 = r2.G
                r2.clearAnimation()
                r4.endViewTransition(r2)
                androidx.fragment.app.f$c r4 = r0.f904a
                r4.c(r3)
                r4 = 2
                boolean r4 = a.AbstractC0119e7.J(r4)
                if (r4 == 0) goto L37
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "Animation from operation "
                r4.<init>(r0)
                r4.append(r1)
                java.lang.String r0 = " has been cancelled."
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r4)
            L37:
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void b(android.view.ViewGroup r6) {
                r5 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r6, r0)
                androidx.fragment.app.a$b r0 = r5.c
                boolean r1 = r0.a()
                androidx.fragment.app.f$c r2 = r0.f904a
                if (r1 == 0) goto L13
                r2.c(r5)
                return
            L13:
                android.content.Context r1 = r6.getContext()
                androidx.fragment.app.b r3 = r2.c
                android.view.View r3 = r3.G
                java.lang.String r4 = "context"
                a.C0193i9.d(r1, r4)
                androidx.fragment.app.c$a r0 = r0.b(r1)
                java.lang.String r1 = "Required value was null."
                if (r0 == 0) goto L72
                android.view.animation.Animation r0 = r0.f910a
                if (r0 == 0) goto L6c
                androidx.fragment.app.f$c$b r1 = r2.f917a
                androidx.fragment.app.f$c$b r4 = androidx.fragment.app.f.c.b.f919a
                if (r1 == r4) goto L39
                r3.startAnimation(r0)
                r2.c(r5)
                return
            L39:
                r6.startViewTransition(r3)
                androidx.fragment.app.c$b r1 = new androidx.fragment.app.c$b
                r1.<init>(r0, r6, r3)
                androidx.fragment.app.a$a$a r0 = new androidx.fragment.app.a$a$a
                r0.<init>(r2, r6, r3, r5)
                r1.setAnimationListener(r0)
                r3.startAnimation(r1)
                r6 = 2
                boolean r6 = a.AbstractC0119e7.J(r6)
                if (r6 == 0) goto L6b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Animation from operation "
                r6.<init>(r0)
                r6.append(r2)
                java.lang.String r0 = " has started."
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r6)
            L6b:
                return
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>(r1)
                throw r6
            L72:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>(r1)
                throw r6
        }
    }

    public static final class b extends androidx.fragment.app.a.f {
        public final boolean b;
        public boolean c;
        public androidx.fragment.app.c.a d;

        public b(androidx.fragment.app.f.c r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "operation"
                a.C0193i9.e(r2, r0)
                r1.<init>(r2)
                r1.b = r3
                return
        }

        public final androidx.fragment.app.c.a b(android.content.Context r9) {
                r8 = this;
                boolean r0 = r8.c
                if (r0 == 0) goto L7
                androidx.fragment.app.c$a r9 = r8.d
                return r9
            L7:
                androidx.fragment.app.f$c r0 = r8.f904a
                androidx.fragment.app.b r1 = r0.c
                androidx.fragment.app.f$c$b r0 = r0.f917a
                androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.b
                r3 = 0
                r4 = 1
                if (r0 != r2) goto L15
                r0 = r4
                goto L16
            L15:
                r0 = r3
            L16:
                androidx.fragment.app.b$d r2 = r1.J
                if (r2 != 0) goto L1c
                r5 = r3
                goto L1e
            L1c:
                int r5 = r2.f
            L1e:
                boolean r6 = r8.b
                if (r6 == 0) goto L31
                if (r0 == 0) goto L2b
                if (r2 != 0) goto L28
            L26:
                r2 = r3
                goto L3e
            L28:
                int r2 = r2.d
                goto L3e
            L2b:
                if (r2 != 0) goto L2e
                goto L26
            L2e:
                int r2 = r2.e
                goto L3e
            L31:
                if (r0 == 0) goto L39
                if (r2 != 0) goto L36
                goto L26
            L36:
                int r2 = r2.b
                goto L3e
            L39:
                if (r2 != 0) goto L3c
                goto L26
            L3c:
                int r2 = r2.c
            L3e:
                r1.D(r3, r3, r3, r3)
                android.view.ViewGroup r3 = r1.F
                r6 = 0
                if (r3 == 0) goto L55
                int r7 = androidx.fragment.R.id.visible_removing_fragment_view_tag
                java.lang.Object r3 = r3.getTag(r7)
                if (r3 == 0) goto L55
                android.view.ViewGroup r3 = r1.F
                int r7 = androidx.fragment.R.id.visible_removing_fragment_view_tag
                r3.setTag(r7, r6)
            L55:
                android.view.ViewGroup r1 = r1.F
                if (r1 == 0) goto L61
                android.animation.LayoutTransition r1 = r1.getLayoutTransition()
                if (r1 == 0) goto L61
                goto Lf5
            L61:
                if (r2 != 0) goto Lb8
                if (r5 == 0) goto Lb8
                r1 = 4097(0x1001, float:5.741E-42)
                if (r5 == r1) goto Lb0
                r1 = 8194(0x2002, float:1.1482E-41)
                if (r5 == r1) goto La8
                r1 = 8197(0x2005, float:1.1486E-41)
                if (r5 == r1) goto L96
                r1 = 4099(0x1003, float:5.744E-42)
                if (r5 == r1) goto L8e
                r1 = 4100(0x1004, float:5.745E-42)
                if (r5 == r1) goto L7c
                r0 = -1
            L7a:
                r2 = r0
                goto Lb8
            L7c:
                if (r0 == 0) goto L86
                r0 = 16842936(0x10100b8, float:2.3694074E-38)
                int r0 = androidx.fragment.app.c.a(r9, r0)
                goto L7a
            L86:
                r0 = 16842937(0x10100b9, float:2.3694076E-38)
                int r0 = androidx.fragment.app.c.a(r9, r0)
                goto L7a
            L8e:
                if (r0 == 0) goto L93
                int r0 = androidx.fragment.R.animator.fragment_fade_enter
                goto L7a
            L93:
                int r0 = androidx.fragment.R.animator.fragment_fade_exit
                goto L7a
            L96:
                if (r0 == 0) goto La0
                r0 = 16842938(0x10100ba, float:2.369408E-38)
                int r0 = androidx.fragment.app.c.a(r9, r0)
                goto L7a
            La0:
                r0 = 16842939(0x10100bb, float:2.3694082E-38)
                int r0 = androidx.fragment.app.c.a(r9, r0)
                goto L7a
            La8:
                if (r0 == 0) goto Lad
                int r0 = androidx.fragment.R.animator.fragment_close_enter
                goto L7a
            Lad:
                int r0 = androidx.fragment.R.animator.fragment_close_exit
                goto L7a
            Lb0:
                if (r0 == 0) goto Lb5
                int r0 = androidx.fragment.R.animator.fragment_open_enter
                goto L7a
            Lb5:
                int r0 = androidx.fragment.R.animator.fragment_open_exit
                goto L7a
            Lb8:
                if (r2 == 0) goto Lf5
                android.content.res.Resources r0 = r9.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r2)
                java.lang.String r1 = "anim"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Ld9
                android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)     // Catch: android.content.res.Resources.NotFoundException -> Ld7 java.lang.RuntimeException -> Ld9
                if (r1 == 0) goto Lf5
                androidx.fragment.app.c$a r3 = new androidx.fragment.app.c$a     // Catch: android.content.res.Resources.NotFoundException -> Ld7 java.lang.RuntimeException -> Ld9
                r3.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> Ld7 java.lang.RuntimeException -> Ld9
            Ld5:
                r6 = r3
                goto Lf5
            Ld7:
                r9 = move-exception
                throw r9
            Ld9:
                android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r2)     // Catch: java.lang.RuntimeException -> Le5
                if (r1 == 0) goto Lf5
                androidx.fragment.app.c$a r3 = new androidx.fragment.app.c$a     // Catch: java.lang.RuntimeException -> Le5
                r3.<init>(r1)     // Catch: java.lang.RuntimeException -> Le5
                goto Ld5
            Le5:
                r1 = move-exception
                if (r0 != 0) goto Lf4
                android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)
                if (r9 == 0) goto Lf5
                androidx.fragment.app.c$a r6 = new androidx.fragment.app.c$a
                r6.<init>(r9)
                goto Lf5
            Lf4:
                throw r1
            Lf5:
                r8.d = r6
                r8.c = r4
                return r6
        }
    }

    public static final class c extends androidx.fragment.app.f.a {
        public final androidx.fragment.app.a.b c;
        public android.animation.AnimatorSet d;

        /* JADX INFO: renamed from: androidx.fragment.app.a$c$a, reason: collision with other inner class name */
        public static final class C0017a extends android.animation.AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ android.view.ViewGroup f901a;
            public final /* synthetic */ android.view.View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ androidx.fragment.app.f.c d;
            public final /* synthetic */ androidx.fragment.app.a.c e;

            public C0017a(android.view.ViewGroup r1, android.view.View r2, boolean r3, androidx.fragment.app.f.c r4, androidx.fragment.app.a.c r5) {
                    r0 = this;
                    r0.f901a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    r0.e = r5
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator r5) {
                    r4 = this;
                    java.lang.String r0 = "anim"
                    a.C0193i9.e(r5, r0)
                    android.view.ViewGroup r5 = r4.f901a
                    android.view.View r0 = r4.b
                    r5.endViewTransition(r0)
                    boolean r1 = r4.c
                    androidx.fragment.app.f$c r2 = r4.d
                    if (r1 == 0) goto L1c
                    androidx.fragment.app.f$c$b r1 = r2.f917a
                    java.lang.String r3 = "viewToAnimate"
                    a.C0193i9.d(r0, r3)
                    r1.a(r0, r5)
                L1c:
                    androidx.fragment.app.a$c r5 = r4.e
                    androidx.fragment.app.a$b r0 = r5.c
                    androidx.fragment.app.f$c r0 = r0.f904a
                    r0.c(r5)
                    r5 = 2
                    boolean r5 = a.AbstractC0119e7.J(r5)
                    if (r5 == 0) goto L44
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r0 = "Animator from operation "
                    r5.<init>(r0)
                    r5.append(r2)
                    java.lang.String r0 = " has ended."
                    r5.append(r0)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r0 = "FragmentManager"
                    android.util.Log.v(r0, r5)
                L44:
                    return
            }
        }

        public c(androidx.fragment.app.a.b r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void a(android.view.ViewGroup r3) {
                r2 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r3, r0)
                android.animation.AnimatorSet r3 = r2.d
                androidx.fragment.app.a$b r0 = r2.c
                if (r3 != 0) goto L11
                androidx.fragment.app.f$c r3 = r0.f904a
                r3.c(r2)
                return
            L11:
                androidx.fragment.app.f$c r0 = r0.f904a
                boolean r1 = r0.g
                if (r1 == 0) goto L1d
                androidx.fragment.app.a$e r1 = androidx.fragment.app.a.e.f903a
                r1.a(r3)
                goto L20
            L1d:
                r3.end()
            L20:
                r3 = 2
                boolean r3 = a.AbstractC0119e7.J(r3)
                if (r3 == 0) goto L50
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "Animator from operation "
                r3.<init>(r1)
                r3.append(r0)
                java.lang.String r1 = " has been canceled"
                r3.append(r1)
                boolean r0 = r0.g
                if (r0 == 0) goto L3d
                java.lang.String r0 = " with seeking."
                goto L3f
            L3d:
                java.lang.String r0 = "."
            L3f:
                r3.append(r0)
                r0 = 32
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r3)
            L50:
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void b(android.view.ViewGroup r3) {
                r2 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r3, r0)
                androidx.fragment.app.a$b r3 = r2.c
                androidx.fragment.app.f$c r3 = r3.f904a
                android.animation.AnimatorSet r0 = r2.d
                if (r0 != 0) goto L11
                r3.c(r2)
                return
            L11:
                r0.start()
                r0 = 2
                boolean r0 = a.AbstractC0119e7.J(r0)
                if (r0 == 0) goto L33
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Animator from operation "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " has started."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r3)
            L33:
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void c(a.R1 r11, android.view.ViewGroup r12) {
                r10 = this;
                java.lang.String r0 = "backEvent"
                a.C0193i9.e(r11, r0)
                java.lang.String r0 = "container"
                a.C0193i9.e(r12, r0)
                androidx.fragment.app.a$b r12 = r10.c
                androidx.fragment.app.f$c r12 = r12.f904a
                android.animation.AnimatorSet r0 = r10.d
                if (r0 != 0) goto L16
                r12.c(r10)
                return
            L16:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 34
                if (r1 < r2) goto L82
                androidx.fragment.app.b r1 = r12.c
                boolean r1 = r1.m
                if (r1 == 0) goto L82
                r1 = 2
                boolean r2 = a.AbstractC0119e7.J(r1)
                java.lang.String r3 = "FragmentManager"
                if (r2 == 0) goto L3c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Adding BackProgressCallbacks for Animators to operation "
                r2.<init>(r4)
                r2.append(r12)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r3, r2)
            L3c:
                androidx.fragment.app.a$d r2 = androidx.fragment.app.a.d.f902a
                long r4 = r2.a(r0)
                float r2 = (float) r4
                float r11 = r11.c
                float r11 = r11 * r2
                long r6 = (long) r11
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r8 = 1
                if (r11 != 0) goto L50
                r6 = r8
            L50:
                int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r11 != 0) goto L56
                long r6 = r4 - r8
            L56:
                boolean r11 = a.AbstractC0119e7.J(r1)
                if (r11 == 0) goto L7d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r1 = "Setting currentPlayTime to "
                r11.<init>(r1)
                r11.append(r6)
                java.lang.String r1 = " for Animator "
                r11.append(r1)
                r11.append(r0)
                java.lang.String r1 = " on operation "
                r11.append(r1)
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                android.util.Log.v(r3, r11)
            L7d:
                androidx.fragment.app.a$e r11 = androidx.fragment.app.a.e.f903a
                r11.b(r0, r6)
            L82:
                return
        }

        @Override // androidx.fragment.app.f.a
        public final void d(android.view.ViewGroup r9) {
                r8 = this;
                java.lang.String r0 = "container"
                a.C0193i9.e(r9, r0)
                androidx.fragment.app.a$b r0 = r8.c
                boolean r1 = r0.a()
                if (r1 == 0) goto Lf
                r7 = r8
                goto L4f
            Lf:
                android.content.Context r1 = r9.getContext()
                java.lang.String r2 = "context"
                a.C0193i9.d(r1, r2)
                androidx.fragment.app.c$a r1 = r0.b(r1)
                if (r1 == 0) goto L21
                android.animation.AnimatorSet r1 = r1.b
                goto L22
            L21:
                r1 = 0
            L22:
                r8.d = r1
                androidx.fragment.app.f$c r6 = r0.f904a
                androidx.fragment.app.b r0 = r6.c
                androidx.fragment.app.f$c$b r1 = r6.f917a
                androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.c
                if (r1 != r2) goto L31
                r1 = 1
            L2f:
                r5 = r1
                goto L33
            L31:
                r1 = 0
                goto L2f
            L33:
                android.view.View r4 = r0.G
                r9.startViewTransition(r4)
                android.animation.AnimatorSet r0 = r8.d
                if (r0 == 0) goto L47
                androidx.fragment.app.a$c$a r2 = new androidx.fragment.app.a$c$a
                r7 = r8
                r3 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                r0.addListener(r2)
                goto L48
            L47:
                r7 = r8
            L48:
                android.animation.AnimatorSet r9 = r7.d
                if (r9 == 0) goto L4f
                r9.setTarget(r4)
            L4f:
                return
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.fragment.app.a.d f902a = null;

        static {
                androidx.fragment.app.a$d r0 = new androidx.fragment.app.a$d
                r0.<init>()
                androidx.fragment.app.a.d.f902a = r0
                return
        }

        public final long a(android.animation.AnimatorSet r3) {
                r2 = this;
                java.lang.String r0 = "animatorSet"
                a.C0193i9.e(r3, r0)
                long r0 = r3.getTotalDuration()
                return r0
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.fragment.app.a.e f903a = null;

        static {
                androidx.fragment.app.a$e r0 = new androidx.fragment.app.a$e
                r0.<init>()
                androidx.fragment.app.a.e.f903a = r0
                return
        }

        public final void a(android.animation.AnimatorSet r2) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                a.C0193i9.e(r2, r0)
                r2.reverse()
                return
        }

        public final void b(android.animation.AnimatorSet r2, long r3) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                a.C0193i9.e(r2, r0)
                r2.setCurrentPlayTime(r3)
                return
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.fragment.app.f.c f904a;

        public f(androidx.fragment.app.f.c r2) {
                r1 = this;
                java.lang.String r0 = "operation"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                r1.f904a = r2
                return
        }

        public final boolean a() {
                r5 = this;
                androidx.fragment.app.f$c r0 = r5.f904a
                androidx.fragment.app.b r1 = r0.c
                android.view.View r1 = r1.G
                androidx.fragment.app.f$c$b r2 = androidx.fragment.app.f.c.b.b
                if (r1 == 0) goto L3a
                float r3 = r1.getAlpha()
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                androidx.fragment.app.f$c$b r4 = androidx.fragment.app.f.c.b.d
                if (r3 != 0) goto L1c
                int r3 = r1.getVisibility()
                if (r3 != 0) goto L1c
                goto L3b
            L1c:
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L38
                r3 = 4
                if (r1 == r3) goto L3b
                r3 = 8
                if (r1 != r3) goto L2c
                androidx.fragment.app.f$c$b r4 = androidx.fragment.app.f.c.b.c
                goto L3b
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Unknown visibility "
                java.lang.String r1 = a.C0487z.e(r2, r1)
                r0.<init>(r1)
                throw r0
            L38:
                r4 = r2
                goto L3b
            L3a:
                r4 = 0
            L3b:
                androidx.fragment.app.f$c$b r0 = r0.f917a
                if (r4 == r0) goto L46
                if (r4 == r2) goto L44
                if (r0 == r2) goto L44
                goto L46
            L44:
                r0 = 0
                return r0
            L46:
                r0 = 1
                return r0
        }
    }

    public static final class g extends androidx.fragment.app.a.f {
    }

    @Override // androidx.fragment.app.f
    public final void b(java.util.ArrayList r19, boolean r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.Iterator r3 = r1.iterator()
        La:
            boolean r4 = r3.hasNext()
            androidx.fragment.app.f$c$b r5 = androidx.fragment.app.f.c.b.c
            androidx.fragment.app.f$c$b r6 = androidx.fragment.app.f.c.b.b
            androidx.fragment.app.f$c$b r7 = androidx.fragment.app.f.c.b.d
            java.lang.String r9 = "Unknown visibility "
            r10 = 8
            r11 = 4
            r12 = 0
            java.lang.String r13 = "operation.fragment.mView"
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            r14 = r4
            androidx.fragment.app.f$c r14 = (androidx.fragment.app.f.c) r14
            androidx.fragment.app.b r15 = r14.c
            android.view.View r15 = r15.G
            a.C0193i9.d(r15, r13)
            float r16 = r15.getAlpha()
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 != 0) goto L3c
            int r16 = r15.getVisibility()
            if (r16 != 0) goto L3c
        L3a:
            r15 = r7
            goto L53
        L3c:
            int r15 = r15.getVisibility()
            if (r15 == 0) goto L52
            if (r15 == r11) goto L3a
            if (r15 != r10) goto L48
            r15 = r5
            goto L53
        L48:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = a.C0487z.e(r9, r15)
            r1.<init>(r2)
            throw r1
        L52:
            r15 = r6
        L53:
            if (r15 != r6) goto La
            androidx.fragment.app.f$c$b r14 = r14.f917a
            if (r14 == r6) goto La
            goto L5b
        L5a:
            r4 = 0
        L5b:
            androidx.fragment.app.f$c r4 = (androidx.fragment.app.f.c) r4
            int r3 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r3)
        L65:
            boolean r14 = r3.hasPrevious()
            if (r14 == 0) goto La8
            java.lang.Object r14 = r3.previous()
            r15 = r14
            androidx.fragment.app.f$c r15 = (androidx.fragment.app.f.c) r15
            androidx.fragment.app.b r8 = r15.c
            android.view.View r8 = r8.G
            a.C0193i9.d(r8, r13)
            float r17 = r8.getAlpha()
            int r17 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r17 != 0) goto L89
            int r17 = r8.getVisibility()
            if (r17 != 0) goto L89
        L87:
            r8 = r7
            goto La0
        L89:
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L9f
            if (r8 == r11) goto L87
            if (r8 != r10) goto L95
            r8 = r5
            goto La0
        L95:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = a.C0487z.e(r9, r8)
            r1.<init>(r2)
            throw r1
        L9f:
            r8 = r6
        La0:
            if (r8 == r6) goto L65
            androidx.fragment.app.f$c$b r8 = r15.f917a
            if (r8 != r6) goto L65
            r8 = r14
            goto La9
        La8:
            r8 = 0
        La9:
            androidx.fragment.app.f$c r8 = (androidx.fragment.app.f.c) r8
            r3 = 2
            boolean r7 = a.AbstractC0119e7.J(r3)
            java.lang.String r9 = "FragmentManager"
            if (r7 == 0) goto Lcd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Executing operations from "
            r7.<init>(r10)
            r7.append(r4)
            java.lang.String r10 = " to "
            r7.append(r10)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r9, r7)
        Lcd:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L2a8
            int r11 = a.C0294o3.c0(r1)
            java.lang.Object r11 = r1.get(r11)
            androidx.fragment.app.f$c r11 = (androidx.fragment.app.f.c) r11
            androidx.fragment.app.b r11 = r11.c
            java.util.Iterator r12 = r1.iterator()
        Led:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L110
            java.lang.Object r13 = r12.next()
            androidx.fragment.app.f$c r13 = (androidx.fragment.app.f.c) r13
            androidx.fragment.app.b r13 = r13.c
            androidx.fragment.app.b$d r13 = r13.J
            androidx.fragment.app.b$d r14 = r11.J
            int r15 = r14.b
            r13.b = r15
            int r15 = r14.c
            r13.c = r15
            int r15 = r14.d
            r13.d = r15
            int r14 = r14.e
            r13.e = r14
            goto Led
        L110:
            java.util.Iterator r1 = r1.iterator()
        L114:
            boolean r11 = r1.hasNext()
            r12 = 0
            r13 = 1
            if (r11 == 0) goto L173
            java.lang.Object r11 = r1.next()
            androidx.fragment.app.f$c r11 = (androidx.fragment.app.f.c) r11
            androidx.fragment.app.a$b r14 = new androidx.fragment.app.a$b
            r14.<init>(r11, r2)
            r7.add(r14)
            androidx.fragment.app.a$g r14 = new androidx.fragment.app.a$g
            if (r2 == 0) goto L132
            if (r11 != r4) goto L135
        L130:
            r12 = r13
            goto L135
        L132:
            if (r11 != r8) goto L135
            goto L130
        L135:
            r14.<init>(r11)
            androidx.fragment.app.f$c$b r13 = r11.f917a
            androidx.fragment.app.b r15 = r11.c
            if (r13 != r6) goto L147
            if (r2 == 0) goto L143
            androidx.fragment.app.b$d r13 = r15.J
            goto L14f
        L143:
            r15.getClass()
            goto L14f
        L147:
            if (r2 == 0) goto L14c
            androidx.fragment.app.b$d r13 = r15.J
            goto L14f
        L14c:
            r15.getClass()
        L14f:
            androidx.fragment.app.f$c$b r13 = r11.f917a
            if (r13 != r6) goto L15a
            if (r2 == 0) goto L158
            androidx.fragment.app.b$d r13 = r15.J
            goto L15a
        L158:
            androidx.fragment.app.b$d r13 = r15.J
        L15a:
            if (r12 == 0) goto L164
            if (r2 == 0) goto L161
            androidx.fragment.app.b$d r12 = r15.J
            goto L164
        L161:
            r15.getClass()
        L164:
            r10.add(r14)
            a.P0 r12 = new a.P0
            r13 = 4
            r12.<init>(r0, r13, r11)
            java.util.ArrayList r11 = r11.d
            r11.add(r12)
            goto L114
        L173:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r10.iterator()
        L17c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L193
            java.lang.Object r4 = r2.next()
            r6 = r4
            androidx.fragment.app.a$g r6 = (androidx.fragment.app.a.g) r6
            boolean r6 = r6.a()
            if (r6 != 0) goto L17c
            r1.add(r4)
            goto L17c
        L193:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L19c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1ac
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.a$g r4 = (androidx.fragment.app.a.g) r4
            r4.getClass()
            goto L19c
        L1ac:
            java.util.Iterator r1 = r2.iterator()
        L1b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c0
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.a$g r2 = (androidx.fragment.app.a.g) r2
            r2.getClass()
            goto L1b0
        L1c0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r7.iterator()
        L1ce:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1e2
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.a$b r6 = (androidx.fragment.app.a.b) r6
            androidx.fragment.app.f$c r6 = r6.f904a
            java.util.ArrayList r6 = r6.k
            a.C0365s3.h0(r2, r6)
            goto L1ce
        L1e2:
            boolean r2 = r2.isEmpty()
            java.util.Iterator r4 = r7.iterator()
            r6 = r12
        L1eb:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L24c
            java.lang.Object r7 = r4.next()
            androidx.fragment.app.a$b r7 = (androidx.fragment.app.a.b) r7
            android.view.ViewGroup r8 = r0.f915a
            android.content.Context r8 = r8.getContext()
            androidx.fragment.app.f$c r10 = r7.f904a
            java.lang.String r11 = "context"
            a.C0193i9.d(r8, r11)
            androidx.fragment.app.c$a r8 = r7.b(r8)
            if (r8 != 0) goto L20b
            goto L1eb
        L20b:
            android.animation.AnimatorSet r8 = r8.b
            if (r8 != 0) goto L213
            r1.add(r7)
            goto L1eb
        L213:
            androidx.fragment.app.b r8 = r10.c
            java.util.ArrayList r11 = r10.k
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L23a
            boolean r7 = a.AbstractC0119e7.J(r3)
            if (r7 == 0) goto L1eb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Ignoring Animator set on "
            r7.<init>(r10)
            r7.append(r8)
            java.lang.String r8 = " as this Fragment was involved in a Transition."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r9, r7)
            goto L1eb
        L23a:
            androidx.fragment.app.f$c$b r6 = r10.f917a
            if (r6 != r5) goto L240
            r10.i = r12
        L240:
            androidx.fragment.app.a$c r6 = new androidx.fragment.app.a$c
            r6.<init>(r7)
            java.util.ArrayList r7 = r10.j
            r7.add(r6)
            r6 = r13
            goto L1eb
        L24c:
            java.util.Iterator r1 = r1.iterator()
        L250:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2a7
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.a$b r4 = (androidx.fragment.app.a.b) r4
            androidx.fragment.app.f$c r5 = r4.f904a
            androidx.fragment.app.b r7 = r5.c
            java.lang.String r8 = "Ignoring Animation set on "
            if (r2 != 0) goto L27f
            boolean r4 = a.AbstractC0119e7.J(r3)
            if (r4 == 0) goto L250
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            r4.append(r7)
            java.lang.String r5 = " as Animations cannot run alongside Transitions."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r9, r4)
            goto L250
        L27f:
            if (r6 == 0) goto L29c
            boolean r4 = a.AbstractC0119e7.J(r3)
            if (r4 == 0) goto L250
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            r4.append(r7)
            java.lang.String r5 = " as Animations cannot run alongside Animators."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r9, r4)
            goto L250
        L29c:
            androidx.fragment.app.a$a r7 = new androidx.fragment.app.a$a
            r7.<init>(r4)
            java.util.ArrayList r4 = r5.j
            r4.add(r7)
            goto L250
        L2a7:
            return
        L2a8:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "List is empty."
            r1.<init>(r2)
            throw r1
    }
}
