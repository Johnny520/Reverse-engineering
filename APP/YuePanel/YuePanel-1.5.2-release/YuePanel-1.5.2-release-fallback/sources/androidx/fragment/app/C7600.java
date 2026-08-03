package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
public final class C7600 extends androidx.fragment.app.AbstractC7635 {

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    public static final class C7601 extends androidx.fragment.app.C7600.C7602 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f29271;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29272;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public androidx.fragment.app.C7613.C7614 f29273;

        public C7601(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638 r2, @Yue.InterfaceC4418 Yue.C0943 r3, boolean r4) {
                r1 = this;
                java.lang.String r0 = "operation"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "signal"
                Yue.C3329.m13906(r3, r0)
                r1.<init>(r2, r3)
                r1.f29271 = r4
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final androidx.fragment.app.C7613.C7614 m29320(@Yue.InterfaceC4418 android.content.Context r5) {
                r4 = this;
                java.lang.String r0 = "context"
                Yue.C3329.m13906(r5, r0)
                boolean r0 = r4.f29272
                if (r0 == 0) goto Lc
                androidx.fragment.app.ۥ۟۟۟۠$ۥ r5 = r4.f29273
                goto L2e
            Lc:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r4.m29322()
                androidx.fragment.app.Fragment r0 = r0.m29498()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = r4.m29322()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = r1.m29497()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r2 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                r3 = 1
                if (r1 != r2) goto L23
                r1 = r3
                goto L24
            L23:
                r1 = 0
            L24:
                boolean r2 = r4.f29271
                androidx.fragment.app.ۥ۟۟۟۠$ۥ r5 = androidx.fragment.app.C7613.m29338(r5, r0, r1, r2)
                r4.f29273 = r5
                r4.f29272 = r3
            L2e:
                return r5
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    public static class C7602 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final androidx.fragment.app.AbstractC7635.C7638 f29274;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C0943 f29275;

        public C7602(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638 r2, @Yue.InterfaceC4418 Yue.C0943 r3) {
                r1 = this;
                java.lang.String r0 = "operation"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "signal"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                r1.f29274 = r2
                r1.f29275 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m29321() {
                r2 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r2.f29274
                Yue.ۥۣ۟ۨۧ r1 = r2.f29275
                r0.m29496(r1)
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final androidx.fragment.app.AbstractC7635.C7638 m29322() {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r1.f29274
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C0943 m29323() {
                r1 = this;
                Yue.ۥۣ۟ۨۧ r0 = r1.f29275
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m29324() {
                r3 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = r3.f29274
                androidx.fragment.app.Fragment r1 = r1.m29498()
                android.view.View r1 = r1.mView
                java.lang.String r2 = "operation.fragment.mView"
                Yue.C3329.m13905(r1, r2)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = r0.m29510(r1)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = r3.f29274
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = r1.m29497()
                if (r0 == r1) goto L24
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r2 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                if (r0 == r2) goto L22
                if (r1 == r2) goto L22
                goto L24
            L22:
                r0 = 0
                goto L25
            L24:
                r0 = 1
            L25:
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C7603 extends androidx.fragment.app.C7600.C7602 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public final java.lang.Object f29276;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f29277;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public final java.lang.Object f29278;

        public C7603(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638 r2, @Yue.InterfaceC4418 Yue.C0943 r3, boolean r4, boolean r5) {
                r1 = this;
                java.lang.String r0 = "operation"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "signal"
                Yue.C3329.m13906(r3, r0)
                r1.<init>(r2, r3)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = r2.m29497()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                if (r3 != r0) goto L25
                androidx.fragment.app.Fragment r3 = r2.m29498()
                if (r4 == 0) goto L20
                java.lang.Object r3 = r3.getReenterTransition()
                goto L34
            L20:
                java.lang.Object r3 = r3.getEnterTransition()
                goto L34
            L25:
                androidx.fragment.app.Fragment r3 = r2.m29498()
                if (r4 == 0) goto L30
                java.lang.Object r3 = r3.getReturnTransition()
                goto L34
            L30:
                java.lang.Object r3 = r3.getExitTransition()
            L34:
                r1.f29276 = r3
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = r2.m29497()
                if (r3 != r0) goto L50
                if (r4 == 0) goto L47
                androidx.fragment.app.Fragment r3 = r2.m29498()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L51
            L47:
                androidx.fragment.app.Fragment r3 = r2.m29498()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
                goto L51
            L50:
                r3 = 1
            L51:
                r1.f29277 = r3
                if (r5 == 0) goto L69
                if (r4 == 0) goto L60
                androidx.fragment.app.Fragment r2 = r2.m29498()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                goto L6a
            L60:
                androidx.fragment.app.Fragment r2 = r2.m29498()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                goto L6a
            L69:
                r2 = 0
            L6a:
                r1.f29278 = r2
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.AbstractC2798 m29325() {
                r2 = this;
                java.lang.Object r0 = r2.f29276
                Yue.ۥۣ۠۟ۦ r0 = r2.m29326(r0)
                java.lang.Object r1 = r2.f29278
                Yue.ۥۣ۠۟ۦ r1 = r2.m29326(r1)
                if (r0 == 0) goto L4a
                if (r1 == 0) goto L4a
                if (r0 != r1) goto L13
                goto L4a
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r0.append(r1)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = r2.m29322()
                androidx.fragment.app.Fragment r1 = r1.m29498()
                r0.append(r1)
                java.lang.String r1 = " returned Transition "
                r0.append(r1)
                java.lang.Object r1 = r2.f29276
                r0.append(r1)
                java.lang.String r1 = " which uses a different Transition  type than its shared element transition "
                r0.append(r1)
                java.lang.Object r1 = r2.f29278
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L4a:
                if (r0 != 0) goto L4d
                r0 = r1
            L4d:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.AbstractC2798 m29326(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                Yue.ۥۣ۠۟ۦ r0 = Yue.C2791.f9114
                if (r0 == 0) goto Lf
                boolean r1 = r0.mo12211(r4)
                if (r1 == 0) goto Lf
                return r0
            Lf:
                Yue.ۥۣ۠۟ۦ r0 = Yue.C2791.f9115
                if (r0 == 0) goto L1a
                boolean r1 = r0.mo12211(r4)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = r3.m29322()
                androidx.fragment.app.Fragment r4 = r4.m29498()
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final java.lang.Object m29327() {
                r1 = this;
                java.lang.Object r0 = r1.f29278
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final java.lang.Object m29328() {
                r1 = this;
                java.lang.Object r0 = r1.f29276
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m29329() {
                r1 = this;
                java.lang.Object r0 = r1.f29278
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final boolean m29330() {
                r1 = this;
                boolean r0 = r1.f29277
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7604 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.util.Map.Entry<java.lang.String, android.view.View>, java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.Collection<java.lang.String> f29279;

        public C7604(java.util.Collection<java.lang.String> r1) {
                r0 = this;
                r0.f29279 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.util.Map.Entry<java.lang.String, android.view.View> r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Boolean r1 = r0.m29331(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Boolean m29331(@Yue.InterfaceC4418 java.util.Map.Entry<java.lang.String, android.view.View> r2) {
                r1 = this;
                java.lang.String r0 = "entry"
                Yue.C3329.m13906(r2, r0)
                java.util.Collection<java.lang.String> r0 = r1.f29279
                java.lang.Object r2 = r2.getValue()
                android.view.View r2 = (android.view.View) r2
                java.lang.String r2 = Yue.C6794.m26164(r2)
                boolean r2 = Yue.C1219.m6330(r0, r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7605 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7600 f29280;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29281;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f29282;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638 f29283;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7600.C7601 f29284;

        public C7605(androidx.fragment.app.C7600 r1, android.view.View r2, boolean r3, androidx.fragment.app.AbstractC7635.C7638 r4, androidx.fragment.app.C7600.C7601 r5) {
                r0 = this;
                r0.f29280 = r1
                r0.f29281 = r2
                r0.f29282 = r3
                r0.f29283 = r4
                r0.f29284 = r5
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4418 android.animation.Animator r3) {
                r2 = this;
                java.lang.String r0 = "anim"
                Yue.C3329.m13906(r3, r0)
                androidx.fragment.app.ۥ۟۟۟ r3 = r2.f29280
                android.view.ViewGroup r3 = r3.m29484()
                android.view.View r0 = r2.f29281
                r3.endViewTransition(r0)
                boolean r3 = r2.f29282
                if (r3 == 0) goto L24
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r3 = r2.f29283
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = r3.m29497()
                android.view.View r0 = r2.f29281
                java.lang.String r1 = "viewToAnimate"
                Yue.C3329.m13905(r0, r1)
                r3.m29509(r0)
            L24:
                androidx.fragment.app.ۥ۟۟۟$ۥ r3 = r2.f29284
                r3.m29321()
                r3 = 2
                boolean r3 = androidx.fragment.app.FragmentManager.m29090(r3)
                if (r3 == 0) goto L4d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Animator from operation "
                r3.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r2.f29283
                r3.append(r0)
                java.lang.String r0 = " has ended."
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r3)
            L4d:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class AnimationAnimationListenerC7606 implements android.view.animation.Animation.AnimationListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638 f29285;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7600 f29286;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29287;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7600.C7601 f29288;

        public AnimationAnimationListenerC7606(androidx.fragment.app.AbstractC7635.C7638 r1, androidx.fragment.app.C7600 r2, android.view.View r3, androidx.fragment.app.C7600.C7601 r4) {
                r0 = this;
                r0.f29285 = r1
                r0.f29286 = r2
                r0.f29287 = r3
                r0.f29288 = r4
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m29332(androidx.fragment.app.C7600 r0, android.view.View r1, androidx.fragment.app.C7600.C7601 r2) {
                m29333(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final void m29333(androidx.fragment.app.C7600 r1, android.view.View r2, androidx.fragment.app.C7600.C7601 r3) {
                java.lang.String r0 = "this$0"
                Yue.C3329.m13906(r1, r0)
                java.lang.String r0 = "$animationInfo"
                Yue.C3329.m13906(r3, r0)
                android.view.ViewGroup r1 = r1.m29484()
                r1.endViewTransition(r2)
                r3.m29321()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@Yue.InterfaceC4418 android.view.animation.Animation r5) {
                r4 = this;
                java.lang.String r0 = "animation"
                Yue.C3329.m13906(r5, r0)
                androidx.fragment.app.ۥ۟۟۟ r5 = r4.f29286
                android.view.ViewGroup r5 = r5.m29484()
                androidx.fragment.app.ۥ۟۟۟ r0 = r4.f29286
                android.view.View r1 = r4.f29287
                androidx.fragment.app.ۥ۟۟۟$ۥ r2 = r4.f29288
                Yue.ۥ۟ۨۧۢ r3 = new Yue.ۥ۟ۨۧۢ
                r3.<init>(r0, r1, r2)
                r5.post(r3)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.m29090(r5)
                if (r5 == 0) goto L3d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Animation from operation "
                r5.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r4.f29285
                r5.append(r0)
                java.lang.String r0 = " has ended."
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r5)
            L3d:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@Yue.InterfaceC4418 android.view.animation.Animation r2) {
                r1 = this;
                java.lang.String r0 = "animation"
                Yue.C3329.m13906(r2, r0)
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@Yue.InterfaceC4418 android.view.animation.Animation r2) {
                r1 = this;
                java.lang.String r0 = "animation"
                Yue.C3329.m13906(r2, r0)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.m29090(r2)
                if (r2 == 0) goto L29
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "Animation from operation "
                r2.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r1.f29285
                r2.append(r0)
                java.lang.String r0 = " has reached onAnimationStart."
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r2)
            L29:
                return
        }
    }

    public C7600(@Yue.InterfaceC4418 android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m29298(java.util.List r0, androidx.fragment.app.AbstractC7635.C7638 r1, androidx.fragment.app.C7600 r2) {
            m29305(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m29299(androidx.fragment.app.AbstractC7635.C7638 r0, androidx.fragment.app.AbstractC7635.C7638 r1, boolean r2, Yue.C0573 r3) {
            m29311(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m29300(android.animation.Animator r0, androidx.fragment.app.AbstractC7635.C7638 r1) {
            m29306(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m29301(android.view.View r0, androidx.fragment.app.C7600 r1, androidx.fragment.app.C7600.C7601 r2, androidx.fragment.app.AbstractC7635.C7638 r3) {
            m29307(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ void m29302(java.util.ArrayList r0) {
            m29309(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ void m29303(androidx.fragment.app.C7600.C7603 r0, androidx.fragment.app.AbstractC7635.C7638 r1) {
            m29310(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m29304(Yue.AbstractC2798 r0, android.view.View r1, android.graphics.Rect r2) {
            m29308(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m29305(java.util.List r1, androidx.fragment.app.AbstractC7635.C7638 r2, androidx.fragment.app.C7600 r3) {
            java.lang.String r0 = "$awaitingContainerChanges"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L1b
            r1.remove(r2)
            r3.m29313(r2)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final void m29306(android.animation.Animator r1, androidx.fragment.app.AbstractC7635.C7638 r2) {
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r2, r0)
            r1.end()
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Animator from operation "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " has been canceled."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final void m29307(android.view.View r1, androidx.fragment.app.C7600 r2, androidx.fragment.app.C7600.C7601 r3, androidx.fragment.app.AbstractC7635.C7638 r4) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "$animationInfo"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r4, r0)
            r1.clearAnimation()
            android.view.ViewGroup r2 = r2.m29484()
            r2.endViewTransition(r1)
            r3.m29321()
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Animation from operation "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " has been cancelled."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final void m29308(Yue.AbstractC2798 r1, android.view.View r2, android.graphics.Rect r3) {
            java.lang.String r0 = "$impl"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$lastInEpicenterRect"
            Yue.C3329.m13906(r3, r0)
            r1.m12228(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final void m29309(java.util.ArrayList r1) {
            java.lang.String r0 = "$transitioningViews"
            Yue.C3329.m13906(r1, r0)
            r0 = 4
            Yue.C2791.m12204(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final void m29310(androidx.fragment.app.C7600.C7603 r1, androidx.fragment.app.AbstractC7635.C7638 r2) {
            java.lang.String r0 = "$transitionInfo"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r2, r0)
            r1.m29321()
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Transition for operation "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " has completed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final void m29311(androidx.fragment.app.AbstractC7635.C7638 r1, androidx.fragment.app.AbstractC7635.C7638 r2, boolean r3, Yue.C0573 r4) {
            java.lang.String r0 = "$lastInViews"
            Yue.C3329.m13906(r4, r0)
            androidx.fragment.app.Fragment r1 = r1.m29498()
            androidx.fragment.app.Fragment r2 = r2.m29498()
            r0 = 0
            Yue.C2791.m12201(r1, r2, r3, r4, r0)
            return
    }

    @Override // androidx.fragment.app.AbstractC7635
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo29312(@Yue.InterfaceC4418 java.util.List<? extends androidx.fragment.app.AbstractC7635.C7638> r14, boolean r15) {
            r13 = this;
            java.lang.String r0 = "operations"
            Yue.C3329.m13906(r14, r0)
            java.util.Iterator r0 = r14.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r5 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446
            androidx.fragment.app.Fragment r6 = r4.m29498()
            android.view.View r6 = r6.mView
            Yue.C3329.m13905(r6, r3)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r5 = r5.m29510(r6)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
            if (r5 != r6) goto L9
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = r4.m29497()
            if (r4 == r6) goto L9
            goto L34
        L33:
            r1 = r2
        L34:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = (androidx.fragment.app.AbstractC7635.C7638) r1
            int r0 = r14.size()
            java.util.ListIterator r0 = r14.listIterator(r0)
        L3e:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r5 = (androidx.fragment.app.AbstractC7635.C7638) r5
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446
            androidx.fragment.app.Fragment r7 = r5.m29498()
            android.view.View r7 = r7.mView
            Yue.C3329.m13905(r7, r3)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = r6.m29510(r7)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r7 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
            if (r6 == r7) goto L3e
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r5 = r5.m29497()
            if (r5 != r7) goto L3e
            r2 = r4
        L65:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = (androidx.fragment.app.AbstractC7635.C7638) r2
            r0 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.m29090(r0)
            java.lang.String r10 = " to "
            java.lang.String r11 = "FragmentManager"
            if (r3 == 0) goto L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Executing operations from "
            r3.append(r4)
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r11, r3)
        L8c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r12 = Yue.C1219.m6540(r14)
            r13.m29319(r14)
            java.util.Iterator r14 = r14.iterator()
        La1:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto Le1
            java.lang.Object r4 = r14.next()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4
            Yue.ۥۣ۟ۨۧ r6 = new Yue.ۥۣ۟ۨۧ
            r6.<init>()
            r4.m29502(r6)
            androidx.fragment.app.ۥ۟۟۟$ۥ r7 = new androidx.fragment.app.ۥ۟۟۟$ۥ
            r7.<init>(r4, r6, r15)
            r3.add(r7)
            Yue.ۥۣ۟ۨۧ r6 = new Yue.ۥۣ۟ۨۧ
            r6.<init>()
            r4.m29502(r6)
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r7 = new androidx.fragment.app.ۥ۟۟۟$ۥ۟۟
            r8 = 0
            r9 = 1
            if (r15 == 0) goto Lcf
            if (r4 != r1) goto Ld2
        Lcd:
            r8 = r9
            goto Ld2
        Lcf:
            if (r4 != r2) goto Ld2
            goto Lcd
        Ld2:
            r7.<init>(r4, r6, r15, r8)
            r5.add(r7)
            Yue.ۥ۟ۨۦۨ r6 = new Yue.ۥ۟ۨۦۨ
            r6.<init>(r12, r4, r13)
            r4.m29494(r6)
            goto La1
        Le1:
            r4 = r13
            r6 = r12
            r7 = r15
            r8 = r1
            r9 = r2
            java.util.Map r14 = r4.m29318(r5, r6, r7, r8, r9)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r15 = r14.containsValue(r15)
            r13.m29317(r3, r12, r15, r14)
            java.util.Iterator r14 = r12.iterator()
        Lf7:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L107
            java.lang.Object r15 = r14.next()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r15 = (androidx.fragment.app.AbstractC7635.C7638) r15
            r13.m29313(r15)
            goto Lf7
        L107:
            r12.clear()
            boolean r14 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r14 == 0) goto L12a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Completed executing operations from "
            r14.append(r15)
            r14.append(r1)
            r14.append(r10)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r11, r14)
        L12a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m29313(androidx.fragment.app.AbstractC7635.C7638 r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.m29498()
            android.view.View r0 = r0.mView
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = r3.m29497()
            java.lang.String r1 = "view"
            Yue.C3329.m13905(r0, r1)
            r3.m29509(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m29314(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L33
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = Yue.C6837.m26502(r0)
            if (r1 == 0) goto L17
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L3c
            r5.add(r6)
            goto L3c
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L3c
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L30
            java.lang.String r3 = "child"
            Yue.C3329.m13905(r2, r3)
            r4.m29314(r5, r2)
        L30:
            int r1 = r1 + 1
            goto L1c
        L33:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L3c
            r5.add(r6)
        L3c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m29315(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.lang.String r0 = Yue.C6794.m26164(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L28
            java.lang.String r3 = "child"
            Yue.C3329.m13905(r2, r3)
            r4.m29315(r5, r2)
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m29316(Yue.C0573<java.lang.String, android.view.View> r2, java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.lang.String r0 = "entries"
            Yue.C3329.m13905(r2, r0)
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟ r0 = new androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟
            r0.<init>(r3)
            Yue.C1216.m6272(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m29317(java.util.List<androidx.fragment.app.C7600.C7601> r19, java.util.List<androidx.fragment.app.AbstractC7635.C7638> r20, boolean r21, java.util.Map<androidx.fragment.app.AbstractC7635.C7638, java.lang.Boolean> r22) {
            r18 = this;
            r6 = r18
            android.view.ViewGroup r0 = r18.m29484()
            android.content.Context r7 = r0.getContext()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r19.iterator()
            r0 = 0
        L14:
            boolean r1 = r9.hasNext()
            java.lang.String r11 = " has started."
            java.lang.String r2 = "context"
            java.lang.String r12 = "FragmentManager"
            r13 = 2
            if (r1 == 0) goto Le8
            java.lang.Object r1 = r9.next()
            r14 = r1
            androidx.fragment.app.ۥ۟۟۟$ۥ r14 = (androidx.fragment.app.C7600.C7601) r14
            boolean r1 = r14.m29324()
            if (r1 == 0) goto L34
            r14.m29321()
        L31:
            r4 = r22
            goto L14
        L34:
            Yue.C3329.m13905(r7, r2)
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r1 = r14.m29320(r7)
            if (r1 != 0) goto L41
            r14.m29321()
            goto L31
        L41:
            android.animation.Animator r15 = r1.f29296
            if (r15 != 0) goto L49
            r8.add(r14)
            goto L31
        L49:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r5 = r14.m29322()
            androidx.fragment.app.Fragment r1 = r5.m29498()
            r4 = r22
            java.lang.Object r2 = r4.get(r5)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L82
            boolean r2 = androidx.fragment.app.FragmentManager.m29090(r13)
            if (r2 == 0) goto L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring Animator set on "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r12, r1)
        L7e:
            r14.m29321()
            goto L14
        L82:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = r5.m29497()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r2 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449
            r16 = 1
            if (r0 != r2) goto L8f
            r3 = r16
            goto L90
        L8f:
            r3 = 0
        L90:
            r2 = r20
            if (r3 == 0) goto L97
            r2.remove(r5)
        L97:
            android.view.View r1 = r1.mView
            android.view.ViewGroup r0 = r18.m29484()
            r0.startViewTransition(r1)
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۟ r0 = new androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۟
            r19 = r0
            r17 = r1
            r1 = r18
            r2 = r17
            r4 = r5
            r10 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r15.addListener(r0)
            r0 = r17
            r15.setTarget(r0)
            r15.start()
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r13)
            if (r0 == 0) goto Ld8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animator from operation "
            r0.append(r1)
            r0.append(r10)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        Ld8:
            Yue.ۥۣ۟ۨۧ r0 = r14.m29323()
            Yue.ۥ۟ۨۦۦ r1 = new Yue.ۥ۟ۨۦۦ
            r1.<init>(r15, r10)
            r0.m5365(r1)
            r0 = r16
            goto L14
        Le8:
            java.util.Iterator r1 = r8.iterator()
        Lec:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1c2
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.ۥ۟۟۟$ۥ r3 = (androidx.fragment.app.C7600.C7601) r3
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = r3.m29322()
            androidx.fragment.app.Fragment r5 = r4.m29498()
            java.lang.String r8 = "Ignoring Animation set on "
            if (r21 == 0) goto L125
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r13)
            if (r4 == 0) goto L121
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = " as Animations cannot run alongside Transitions."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r12, r4)
        L121:
            r3.m29321()
            goto Lec
        L125:
            if (r0 == 0) goto L148
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r13)
            if (r4 == 0) goto L144
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = " as Animations cannot run alongside Animators."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r12, r4)
        L144:
            r3.m29321()
            goto Lec
        L148:
            android.view.View r5 = r5.mView
            Yue.C3329.m13905(r7, r2)
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r8 = r3.m29320(r7)
            java.lang.String r9 = "Required value was null."
            if (r8 == 0) goto L1b8
            android.view.animation.Animation r8 = r8.f29295
            if (r8 == 0) goto L1ae
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r9 = r4.m29497()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r10 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
            if (r9 == r10) goto L168
            r5.startAnimation(r8)
            r3.m29321()
            goto L1a0
        L168:
            android.view.ViewGroup r9 = r18.m29484()
            r9.startViewTransition(r5)
            androidx.fragment.app.ۥ۟۟۟۠$ۥ۟ r9 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ۟
            android.view.ViewGroup r10 = r18.m29484()
            r9.<init>(r8, r10, r5)
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۠ r8 = new androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۠
            r8.<init>(r4, r6, r5, r3)
            r9.setAnimationListener(r8)
            r5.startAnimation(r9)
            boolean r8 = androidx.fragment.app.FragmentManager.m29090(r13)
            if (r8 == 0) goto L1a0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Animation from operation "
            r8.append(r9)
            r8.append(r4)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r12, r8)
        L1a0:
            Yue.ۥۣ۟ۨۧ r8 = r3.m29323()
            Yue.ۥ۟ۨۦۧ r9 = new Yue.ۥ۟ۨۦۧ
            r9.<init>(r5, r6, r3, r4)
            r8.m5365(r9)
            goto Lec
        L1ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.toString()
            r0.<init>(r1)
            throw r0
        L1b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.toString()
            r0.<init>(r1)
            throw r0
        L1c2:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final java.util.Map<androidx.fragment.app.AbstractC7635.C7638, java.lang.Boolean> m29318(java.util.List<androidx.fragment.app.C7600.C7603> r39, java.util.List<androidx.fragment.app.AbstractC7635.C7638> r40, boolean r41, androidx.fragment.app.AbstractC7635.C7638 r42, androidx.fragment.app.AbstractC7635.C7638 r43) {
            r38 = this;
            r0 = r38
            r1 = r41
            r2 = r42
            r3 = r43
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r39.iterator()
        L16:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2d
            java.lang.Object r7 = r6.next()
            r8 = r7
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r8 = (androidx.fragment.app.C7600.C7603) r8
            boolean r8 = r8.m29324()
            if (r8 != 0) goto L16
            r5.add(r7)
            goto L16
        L2d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4d
            java.lang.Object r7 = r5.next()
            r8 = r7
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r8 = (androidx.fragment.app.C7600.C7603) r8
            Yue.ۥۣ۠۟ۦ r8 = r8.m29325()
            if (r8 == 0) goto L36
            r6.add(r7)
            goto L36
        L4d:
            java.util.Iterator r5 = r6.iterator()
            r15 = 0
        L52:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9d
            java.lang.Object r7 = r5.next()
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r7 = (androidx.fragment.app.C7600.C7603) r7
            Yue.ۥۣ۠۟ۦ r8 = r7.m29325()
            if (r15 == 0) goto L9b
            if (r8 != r15) goto L67
            goto L9b
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r2)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = r7.m29322()
            androidx.fragment.app.Fragment r2 = r2.m29498()
            r1.append(r2)
            java.lang.String r2 = " returned Transition "
            r1.append(r2)
            java.lang.Object r2 = r7.m29328()
            r1.append(r2)
            java.lang.String r2 = " which uses a different Transition type than other Fragments."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L9b:
            r15 = r8
            goto L52
        L9d:
            if (r15 != 0) goto Lbd
            java.util.Iterator r1 = r39.iterator()
        La3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r2 = (androidx.fragment.app.C7600.C7603) r2
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r3 = r2.m29322()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.put(r3, r5)
            r2.m29321()
            goto La3
        Lbc:
            return r4
        Lbd:
            android.view.View r5 = new android.view.View
            android.view.ViewGroup r7 = r38.m29484()
            android.content.Context r7 = r7.getContext()
            r5.<init>(r7)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            Yue.ۥ۟ۡۨۡ r11 = new Yue.ۥ۟ۡۨۡ
            r11.<init>()
            java.util.Iterator r16 = r39.iterator()
            r8 = 0
            r9 = 0
            r17 = 0
        Le6:
            boolean r7 = r16.hasNext()
            r18 = 2
            java.lang.String r10 = "FragmentManager"
            if (r7 == 0) goto L424
            java.lang.Object r7 = r16.next()
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r7 = (androidx.fragment.app.C7600.C7603) r7
            boolean r20 = r7.m29329()
            if (r20 == 0) goto L410
            if (r2 == 0) goto L410
            if (r3 == 0) goto L410
            java.lang.Object r7 = r7.m29327()
            java.lang.Object r7 = r15.mo12212(r7)
            java.lang.Object r9 = r15.mo12224(r7)
            androidx.fragment.app.Fragment r7 = r43.m29498()
            java.util.ArrayList r7 = r7.getSharedElementSourceNames()
            java.lang.String r6 = "lastIn.fragment.sharedElementSourceNames"
            Yue.C3329.m13905(r7, r6)
            androidx.fragment.app.Fragment r6 = r42.m29498()
            java.util.ArrayList r6 = r6.getSharedElementSourceNames()
            r21 = r8
            java.lang.String r8 = "firstOut.fragment.sharedElementSourceNames"
            Yue.C3329.m13905(r6, r8)
            androidx.fragment.app.Fragment r8 = r42.m29498()
            java.util.ArrayList r8 = r8.getSharedElementTargetNames()
            r22 = r4
            java.lang.String r4 = "firstOut.fragment.sharedElementTargetNames"
            Yue.C3329.m13905(r8, r4)
            int r4 = r8.size()
            r23 = r5
            r24 = r14
            r5 = 0
        L140:
            r14 = -1
            if (r5 >= r4) goto L15b
            r25 = r4
            java.lang.Object r4 = r8.get(r5)
            int r4 = r7.indexOf(r4)
            if (r4 == r14) goto L156
            java.lang.Object r14 = r6.get(r5)
            r7.set(r4, r14)
        L156:
            int r5 = r5 + 1
            r4 = r25
            goto L140
        L15b:
            androidx.fragment.app.Fragment r4 = r43.m29498()
            java.util.ArrayList r4 = r4.getSharedElementTargetNames()
            java.lang.String r5 = "lastIn.fragment.sharedElementTargetNames"
            Yue.C3329.m13905(r4, r5)
            if (r1 != 0) goto L17f
            androidx.fragment.app.Fragment r5 = r42.m29498()
            Yue.ۥۡۨۨ۟ r5 = r5.getExitTransitionCallback()
            androidx.fragment.app.Fragment r6 = r43.m29498()
            Yue.ۥۡۨۨ۟ r6 = r6.getEnterTransitionCallback()
            Yue.ۥۣۡۦ۠ r5 = Yue.C6456.m23777(r5, r6)
            goto L193
        L17f:
            androidx.fragment.app.Fragment r5 = r42.m29498()
            Yue.ۥۡۨۨ۟ r5 = r5.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r6 = r43.m29498()
            Yue.ۥۡۨۨ۟ r6 = r6.getExitTransitionCallback()
            Yue.ۥۣۡۦ۠ r5 = Yue.C6456.m23777(r5, r6)
        L193:
            java.lang.Object r6 = r5.m18537()
            Yue.ۥۡۨۨ۟ r6 = (Yue.AbstractC5739) r6
            java.lang.Object r5 = r5.m18538()
            Yue.ۥۡۨۨ۟ r5 = (Yue.AbstractC5739) r5
            int r8 = r7.size()
            r14 = 0
        L1a4:
            if (r14 >= r8) goto L1c4
            java.lang.Object r26 = r7.get(r14)
            r27 = r8
            r8 = r26
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r26 = r4.get(r14)
            r28 = r9
            r9 = r26
            java.lang.String r9 = (java.lang.String) r9
            r11.put(r8, r9)
            int r14 = r14 + 1
            r8 = r27
            r9 = r28
            goto L1a4
        L1c4:
            r28 = r9
            boolean r8 = androidx.fragment.app.FragmentManager.m29090(r18)
            if (r8 == 0) goto L226
            java.lang.String r8 = ">>> entering view names <<<"
            android.util.Log.v(r10, r8)
            java.util.Iterator r8 = r4.iterator()
        L1d5:
            boolean r9 = r8.hasNext()
            java.lang.String r14 = "Name: "
            if (r9 == 0) goto L1fa
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            r26 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r10, r8)
            r8 = r26
            goto L1d5
        L1fa:
            java.lang.String r8 = ">>> exiting view names <<<"
            android.util.Log.v(r10, r8)
            java.util.Iterator r8 = r7.iterator()
        L203:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L226
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            r26 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r10, r8)
            r8 = r26
            goto L203
        L226:
            Yue.ۥ۟ۡۨۡ r8 = new Yue.ۥ۟ۡۨۡ
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r42.m29498()
            android.view.View r9 = r9.mView
            java.lang.String r14 = "firstOut.fragment.mView"
            Yue.C3329.m13905(r9, r14)
            r0.m29315(r8, r9)
            r8.retainAll(r7)
            if (r6 == 0) goto L29c
            boolean r9 = androidx.fragment.app.FragmentManager.m29090(r18)
            if (r9 == 0) goto L258
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "Executing exit callback for operation "
            r9.append(r14)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r10, r9)
        L258:
            r6.m21426(r7, r8)
            int r6 = r7.size()
            r9 = -1
            int r6 = r6 + r9
            if (r6 < 0) goto L299
        L263:
            int r9 = r6 + (-1)
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r14 = r8.get(r6)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L279
            r11.remove(r6)
            r26 = r15
            goto L292
        L279:
            r26 = r15
            java.lang.String r15 = Yue.C6794.m26164(r14)
            boolean r15 = Yue.C3329.m13897(r6, r15)
            if (r15 != 0) goto L292
            java.lang.Object r6 = r11.remove(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r14 = Yue.C6794.m26164(r14)
            r11.put(r14, r6)
        L292:
            if (r9 >= 0) goto L295
            goto L2a5
        L295:
            r6 = r9
            r15 = r26
            goto L263
        L299:
            r26 = r15
            goto L2a5
        L29c:
            r26 = r15
            java.util.Set r6 = r8.keySet()
            r11.retainAll(r6)
        L2a5:
            Yue.ۥ۟ۡۨۡ r6 = new Yue.ۥ۟ۡۨۡ
            r6.<init>()
            androidx.fragment.app.Fragment r9 = r43.m29498()
            android.view.View r9 = r9.mView
            java.lang.String r14 = "lastIn.fragment.mView"
            Yue.C3329.m13905(r9, r14)
            r0.m29315(r6, r9)
            r6.retainAll(r4)
            java.util.Collection r9 = r11.values()
            r6.retainAll(r9)
            if (r5 == 0) goto L327
            boolean r9 = androidx.fragment.app.FragmentManager.m29090(r18)
            if (r9 == 0) goto L2de
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "Executing enter callback for operation "
            r9.append(r14)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r10, r9)
        L2de:
            r5.m21426(r4, r6)
            int r5 = r4.size()
            r9 = -1
            int r5 = r5 + r9
            if (r5 < 0) goto L32a
        L2e9:
            int r9 = r5 + (-1)
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r6.get(r5)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r14 = "name"
            if (r10 != 0) goto L308
            Yue.C3329.m13905(r5, r14)
            java.lang.String r5 = Yue.C2791.m12202(r11, r5)
            if (r5 == 0) goto L322
            r11.remove(r5)
            goto L322
        L308:
            java.lang.String r15 = Yue.C6794.m26164(r10)
            boolean r15 = Yue.C3329.m13897(r5, r15)
            if (r15 != 0) goto L322
            Yue.C3329.m13905(r5, r14)
            java.lang.String r5 = Yue.C2791.m12202(r11, r5)
            if (r5 == 0) goto L322
            java.lang.String r10 = Yue.C6794.m26164(r10)
            r11.put(r5, r10)
        L322:
            if (r9 >= 0) goto L325
            goto L32a
        L325:
            r5 = r9
            goto L2e9
        L327:
            Yue.C2791.m12203(r11, r6)
        L32a:
            java.util.Set r5 = r11.keySet()
            java.lang.String r9 = "sharedElementNameMapping.keys"
            Yue.C3329.m13905(r5, r9)
            r0.m29316(r8, r5)
            java.util.Collection r5 = r11.values()
            java.lang.String r9 = "sharedElementNameMapping.values"
            Yue.C3329.m13905(r5, r9)
            r0.m29316(r6, r5)
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L35b
            r13.clear()
            r12.clear()
            r8 = r21
            r4 = r22
            r5 = r23
            r14 = r24
            r15 = r26
            r9 = 0
            goto Le6
        L35b:
            androidx.fragment.app.Fragment r5 = r43.m29498()
            androidx.fragment.app.Fragment r9 = r42.m29498()
            r10 = 1
            Yue.C2791.m12201(r5, r9, r1, r8, r10)
            android.view.ViewGroup r5 = r38.m29484()
            Yue.ۥ۟ۨۧ r9 = new Yue.ۥ۟ۨۧ
            r9.<init>(r3, r2, r1, r6)
            Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r5, r9)
            java.util.Collection r5 = r8.values()
            r13.addAll(r5)
            boolean r5 = r7.isEmpty()
            r5 = r5 ^ r10
            if (r5 == 0) goto L396
            r5 = 0
            java.lang.Object r7 = r7.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r8.get(r7)
            android.view.View r5 = (android.view.View) r5
            r15 = r26
            r9 = r28
            r15.mo12220(r9, r5)
            goto L39c
        L396:
            r15 = r26
            r9 = r28
            r5 = r21
        L39c:
            java.util.Collection r7 = r6.values()
            r12.addAll(r7)
            boolean r7 = r4.isEmpty()
            r20 = 1
            r7 = r7 ^ 1
            if (r7 == 0) goto L3d2
            r10 = 0
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r6.get(r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L3cf
            android.view.ViewGroup r6 = r38.m29484()
            Yue.ۥ۟ۨۧ۟ r7 = new Yue.ۥ۟ۨۧ۟
            r14 = r24
            r7.<init>(r15, r4, r14)
            Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r6, r7)
            r17 = r20
        L3cc:
            r4 = r23
            goto L3d6
        L3cf:
            r14 = r24
            goto L3cc
        L3d2:
            r14 = r24
            r10 = 0
            goto L3cc
        L3d6:
            r15.mo12222(r9, r4, r13)
            r6 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = r15
            r8 = r9
            r21 = r9
            r9 = r19
            r10 = r20
            r19 = r11
            r11 = r6
            r6 = r12
            r12 = r18
            r23 = r13
            r13 = r21
            r1 = r14
            r14 = r6
            r7.mo12218(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r14 = r22
            r14.put(r2, r7)
            r14.put(r3, r7)
            r8 = r5
            r12 = r6
            r11 = r19
            r9 = r21
            r13 = r23
            r5 = r4
            r4 = r14
        L40b:
            r14 = r1
            r1 = r41
            goto Le6
        L410:
            r21 = r8
            r19 = r11
            r6 = r12
            r23 = r13
            r1 = r14
            r14 = r4
            r4 = r5
            r5 = r4
            r12 = r6
            r4 = r14
            r11 = r19
            r8 = r21
            r13 = r23
            goto L40b
        L424:
            r21 = r8
            r19 = r11
            r6 = r12
            r23 = r13
            r1 = r14
            r20 = 1
            r14 = r4
            r4 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r16 = r39.iterator()
            r12 = 0
            r13 = 0
        L43b:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L57c
            java.lang.Object r7 = r16.next()
            r22 = r7
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r22 = (androidx.fragment.app.C7600.C7603) r22
            boolean r7 = r22.m29324()
            if (r7 == 0) goto L45c
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r7 = r22.m29322()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r14.put(r7, r8)
            r22.m29321()
            goto L43b
        L45c:
            java.lang.Object r7 = r22.m29328()
            java.lang.Object r11 = r15.mo12212(r7)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r8 = r22.m29322()
            if (r9 == 0) goto L471
            if (r8 == r2) goto L46e
            if (r8 != r3) goto L471
        L46e:
            r7 = r20
            goto L472
        L471:
            r7 = 0
        L472:
            if (r11 != 0) goto L47f
            if (r7 != 0) goto L43b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r14.put(r8, r7)
            r22.m29321()
            goto L43b
        L47f:
            r24 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r25 = r9
            androidx.fragment.app.Fragment r9 = r8.m29498()
            android.view.View r9 = r9.mView
            r26 = r10
            java.lang.String r10 = "operation.fragment.mView"
            Yue.C3329.m13905(r9, r10)
            r0.m29314(r14, r9)
            if (r7 == 0) goto L4ab
            if (r8 != r2) goto L4a4
            java.util.Set r7 = Yue.C1219.m6542(r23)
            r14.removeAll(r7)
            goto L4ab
        L4a4:
            java.util.Set r7 = Yue.C1219.m6542(r6)
            r14.removeAll(r7)
        L4ab:
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L4c7
            r15.mo12208(r11, r4)
            r7 = r40
            r35 = r12
            r36 = r13
            r32 = r21
            r0 = r24
            r31 = r25
            r33 = r26
            r21 = r4
            r4 = r14
            goto L532
        L4c7:
            r15.mo12209(r11, r14)
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r7 = r15
            r9 = r8
            r10 = r21
            r8 = r11
            r41 = r9
            r31 = r25
            r9 = r11
            r32 = r10
            r33 = r26
            r10 = r14
            r34 = r11
            r11 = r29
            r35 = r12
            r12 = r30
            r36 = r13
            r13 = r27
            r21 = r4
            r4 = r14
            r0 = r24
            r14 = r28
            r7.mo12218(r8, r9, r10, r11, r12, r13, r14)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r7 = r41.m29497()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r8 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449
            if (r7 != r8) goto L52c
            r7 = r40
            r8 = r41
            r7.remove(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            androidx.fragment.app.Fragment r10 = r8.m29498()
            android.view.View r10 = r10.mView
            r9.remove(r10)
            androidx.fragment.app.Fragment r10 = r8.m29498()
            android.view.View r10 = r10.mView
            r11 = r34
            r15.mo12217(r11, r10, r9)
            android.view.ViewGroup r9 = r38.m29484()
            Yue.ۥ۟ۨۧ۠ r10 = new Yue.ۥ۟ۨۧ۠
            r10.<init>(r4)
            Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r9, r10)
            goto L532
        L52c:
            r7 = r40
            r8 = r41
            r11 = r34
        L532:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r9 = r8.m29497()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r10 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
            if (r9 != r10) goto L545
            r5.addAll(r4)
            if (r17 == 0) goto L542
            r15.mo12219(r11, r1)
        L542:
            r4 = r32
            goto L54a
        L545:
            r4 = r32
            r15.mo12220(r11, r4)
        L54a:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r0.put(r8, r9)
            boolean r8 = r22.m29330()
            if (r8 == 0) goto L56d
            r13 = r36
            r8 = 0
            java.lang.Object r13 = r15.mo12214(r13, r11, r8)
            r14 = r0
            r9 = r31
            r10 = r33
            r12 = r35
        L563:
            r0 = r38
            r37 = r21
            r21 = r4
            r4 = r37
            goto L43b
        L56d:
            r12 = r35
            r13 = r36
            r8 = 0
            java.lang.Object r12 = r15.mo12214(r12, r11, r8)
            r14 = r0
            r9 = r31
            r10 = r33
            goto L563
        L57c:
            r33 = r10
            r0 = r14
            r14 = r9
            java.lang.Object r1 = r15.mo12213(r13, r12, r14)
            if (r1 != 0) goto L587
            return r0
        L587:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r39.iterator()
        L590:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5a7
            java.lang.Object r8 = r7.next()
            r9 = r8
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r9 = (androidx.fragment.app.C7600.C7603) r9
            boolean r9 = r9.m29324()
            if (r9 != 0) goto L590
            r4.add(r8)
            goto L590
        L5a7:
            java.util.Iterator r4 = r4.iterator()
        L5ab:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L623
            java.lang.Object r7 = r4.next()
            androidx.fragment.app.ۥ۟۟۟$ۥ۟۟ r7 = (androidx.fragment.app.C7600.C7603) r7
            java.lang.Object r8 = r7.m29328()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r9 = r7.m29322()
            if (r14 == 0) goto L5c8
            if (r9 == r2) goto L5c5
            if (r9 != r3) goto L5c8
        L5c5:
            r10 = r20
            goto L5c9
        L5c8:
            r10 = 0
        L5c9:
            if (r8 != 0) goto L5d1
            if (r10 == 0) goto L5ce
            goto L5d1
        L5ce:
            r10 = r33
            goto L620
        L5d1:
            android.view.ViewGroup r8 = r38.m29484()
            boolean r8 = Yue.C6794.m26188(r8)
            if (r8 != 0) goto L60a
            boolean r8 = androidx.fragment.app.FragmentManager.m29090(r18)
            if (r8 == 0) goto L604
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "SpecialEffectsController: Container "
            r8.append(r10)
            android.view.ViewGroup r10 = r38.m29484()
            r8.append(r10)
            java.lang.String r10 = " has not been laid out. Completing operation "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r10 = r33
            android.util.Log.v(r10, r8)
            goto L606
        L604:
            r10 = r33
        L606:
            r7.m29321()
            goto L620
        L60a:
            r10 = r33
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r8 = r7.m29322()
            androidx.fragment.app.Fragment r8 = r8.m29498()
            Yue.ۥۣ۟ۨۧ r11 = r7.m29323()
            Yue.ۥ۟ۨۧۡ r12 = new Yue.ۥ۟ۨۧۡ
            r12.<init>(r7, r9)
            r15.mo12221(r8, r1, r11, r12)
        L620:
            r33 = r10
            goto L5ab
        L623:
            r10 = r33
            android.view.ViewGroup r2 = r38.m29484()
            boolean r2 = Yue.C6794.m26188(r2)
            if (r2 != 0) goto L630
            return r0
        L630:
            r2 = 4
            Yue.C2791.m12204(r5, r2)
            java.util.ArrayList r11 = r15.m12229(r6)
            boolean r2 = androidx.fragment.app.FragmentManager.m29090(r18)
            if (r2 == 0) goto L6b5
            java.lang.String r2 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r10, r2)
            java.lang.String r2 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r10, r2)
            java.util.Iterator r2 = r23.iterator()
        L64c:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = " Name: "
            java.lang.String r7 = "View: "
            if (r3 == 0) goto L67e
            java.lang.Object r3 = r2.next()
            java.lang.String r8 = "sharedElementFirstOutViews"
            Yue.C3329.m13905(r3, r8)
            android.view.View r3 = (android.view.View) r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = Yue.C6794.m26164(r3)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.v(r10, r3)
            goto L64c
        L67e:
            java.lang.String r2 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r10, r2)
            java.util.Iterator r2 = r6.iterator()
        L687:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b5
            java.lang.Object r3 = r2.next()
            java.lang.String r8 = "sharedElementLastInViews"
            Yue.C3329.m13905(r3, r8)
            android.view.View r3 = (android.view.View) r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = Yue.C6794.m26164(r3)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.v(r10, r3)
            goto L687
        L6b5:
            android.view.ViewGroup r2 = r38.m29484()
            r15.mo12210(r2, r1)
            android.view.ViewGroup r8 = r38.m29484()
            r7 = r15
            r9 = r23
            r10 = r6
            r12 = r19
            r7.m12230(r8, r9, r10, r11, r12)
            r1 = 0
            Yue.C2791.m12204(r5, r1)
            r1 = r23
            r15.mo12223(r14, r1, r6)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m29319(java.util.List<? extends androidx.fragment.app.AbstractC7635.C7638> r5) {
            r4 = this;
            java.lang.Object r0 = Yue.C1219.m6401(r5)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = (androidx.fragment.app.AbstractC7635.C7638) r0
            androidx.fragment.app.Fragment r0 = r0.m29498()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = (androidx.fragment.app.AbstractC7635.C7638) r1
            androidx.fragment.app.Fragment r2 = r1.m29498()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r3 = r0.mAnimationInfo
            int r3 = r3.f29141
            r2.f29141 = r3
            androidx.fragment.app.Fragment r2 = r1.m29498()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r3 = r0.mAnimationInfo
            int r3 = r3.f29142
            r2.f29142 = r3
            androidx.fragment.app.Fragment r2 = r1.m29498()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r3 = r0.mAnimationInfo
            int r3 = r3.f29143
            r2.f29143 = r3
            androidx.fragment.app.Fragment r1 = r1.m29498()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r1 = r1.mAnimationInfo
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r0.mAnimationInfo
            int r2 = r2.f29144
            r1.f29144 = r2
            goto Le
        L4b:
            return
    }
}
