package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class AbstractC7635 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final androidx.fragment.app.AbstractC7635.C7636 f29428 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final android.view.ViewGroup f29429;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<androidx.fragment.app.AbstractC7635.C7638> f29430;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<androidx.fragment.app.AbstractC7635.C7638> f29431;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f29432;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f29433;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ, reason: contains not printable characters */
    public static final class C7636 {
        public C7636() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7636(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.fragment.app.AbstractC7635 m29488(@Yue.InterfaceC4418 android.view.ViewGroup r3, @Yue.InterfaceC4418 Yue.InterfaceC5884 r4) {
                r2 = this;
                java.lang.String r0 = "container"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "factory"
                Yue.C3329.m13906(r4, r0)
                int r0 = Yue.C5040.C5043.f16385
                java.lang.Object r0 = r3.getTag(r0)
                boolean r1 = r0 instanceof androidx.fragment.app.AbstractC7635
                if (r1 == 0) goto L17
                androidx.fragment.app.ۥ۟۟۠ۡ r0 = (androidx.fragment.app.AbstractC7635) r0
                return r0
            L17:
                androidx.fragment.app.ۥ۟۟۠ۡ r4 = r4.mo21908(r3)
                java.lang.String r0 = "factory.createController(container)"
                Yue.C3329.m13905(r4, r0)
                int r0 = Yue.C5040.C5043.f16385
                r3.setTag(r0, r4)
                return r4
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final androidx.fragment.app.AbstractC7635 m29489(@Yue.InterfaceC4418 android.view.ViewGroup r2, @Yue.InterfaceC4418 androidx.fragment.app.FragmentManager r3) {
                r1 = this;
                java.lang.String r0 = "container"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "fragmentManager"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۢ۟ۦۨ r3 = r3.m29168()
                java.lang.String r0 = "fragmentManager.specialEffectsControllerFactory"
                Yue.C3329.m13905(r3, r0)
                androidx.fragment.app.ۥ۟۟۠ۡ r2 = r1.m29488(r2, r3)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟, reason: contains not printable characters */
    public static final class C7637 extends androidx.fragment.app.AbstractC7635.C7638 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final androidx.fragment.app.C7627 f29434;

        public C7637(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r3, @Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7639 r4, @Yue.InterfaceC4418 androidx.fragment.app.C7627 r5, @Yue.InterfaceC4418 Yue.C0943 r6) {
                r2 = this;
                java.lang.String r0 = "finalState"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                Yue.C3329.m13906(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                Yue.C3329.m13906(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.m29390()
                java.lang.String r1 = "fragmentStateManager.fragment"
                Yue.C3329.m13905(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f29434 = r5
                return
        }

        @Override // androidx.fragment.app.AbstractC7635.C7638
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo29490() {
                r1 = this;
                super.mo29490()
                androidx.fragment.app.ۥ۟۟۟ۧ r0 = r1.f29434
                r0.m29392()
                return
        }

        @Override // androidx.fragment.app.AbstractC7635.C7638
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void mo29491() {
                r6 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r6.m29499()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
                java.lang.String r2 = " for Fragment "
                java.lang.String r3 = "FragmentManager"
                r4 = 2
                java.lang.String r5 = "fragmentStateManager.fragment"
                if (r0 != r1) goto L79
                androidx.fragment.app.ۥ۟۟۟ۧ r0 = r6.f29434
                androidx.fragment.app.Fragment r0 = r0.m29390()
                Yue.C3329.m13905(r0, r5)
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L43
                r0.setFocusedView(r1)
                boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)
                if (r4 == 0) goto L43
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "requestFocus: Saved focused view "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                android.util.Log.v(r3, r1)
            L43:
                androidx.fragment.app.Fragment r1 = r6.m29498()
                android.view.View r1 = r1.requireView()
                java.lang.String r2 = "this.fragment.requireView()"
                Yue.C3329.m13905(r1, r2)
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L5f
                androidx.fragment.app.ۥ۟۟۟ۧ r2 = r6.f29434
                r2.m29381()
                r1.setAlpha(r3)
            L5f:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L71
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L71
                r2 = 4
                r1.setVisibility(r2)
            L71:
                float r0 = r0.getPostOnViewCreatedAlpha()
                r1.setAlpha(r0)
                goto Lc2
            L79:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r6.m29499()
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444
                if (r0 != r1) goto Lc2
                androidx.fragment.app.ۥ۟۟۟ۧ r0 = r6.f29434
                androidx.fragment.app.Fragment r0 = r0.m29390()
                Yue.C3329.m13905(r0, r5)
                android.view.View r1 = r0.requireView()
                java.lang.String r5 = "fragment.requireView()"
                Yue.C3329.m13905(r1, r5)
                boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)
                if (r4 == 0) goto Lbf
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Clearing focus "
                r4.append(r5)
                android.view.View r5 = r1.findFocus()
                r4.append(r5)
                java.lang.String r5 = " on view "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                android.util.Log.v(r3, r0)
            Lbf:
                r1.clearFocus()
            Lc2:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class C7638 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public androidx.fragment.app.AbstractC7635.C7638.EnumC7640 f29435;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public androidx.fragment.app.AbstractC7635.C7638.EnumC7639 f29436;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final androidx.fragment.app.Fragment f29437;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.List<java.lang.Runnable> f29438;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Set<Yue.C0943> f29439;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f29440;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29441;

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ, reason: contains not printable characters */
        public enum EnumC7639 extends java.lang.Enum<androidx.fragment.app.AbstractC7635.C7638.EnumC7639> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7639 f29442 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7639 f29443 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7639 f29444 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638.EnumC7639[] f29445 = null;

            static {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ
                    java.lang.String r1 = "ADDING"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ
                    java.lang.String r1 = "REMOVING"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = m29506()
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29445 = r0
                    return
            }

            EnumC7639(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.AbstractC7635.C7638.EnumC7639 valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ> r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = (androidx.fragment.app.AbstractC7635.C7638.EnumC7639) r1
                    return r1
            }

            public static androidx.fragment.app.AbstractC7635.C7638.EnumC7639[] values() {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29445
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = (androidx.fragment.app.AbstractC7635.C7638.EnumC7639[]) r0
                    return r0
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638.EnumC7639[] m29506() {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r2 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = new androidx.fragment.app.AbstractC7635.C7638.EnumC7639[]{r0, r1, r2}
                    return r0
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟, reason: contains not printable characters */
        public enum EnumC7640 extends java.lang.Enum<androidx.fragment.app.AbstractC7635.C7638.EnumC7640> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            @Yue.InterfaceC4418
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640.C7641 f29446 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 f29447 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 f29448 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 f29449 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 f29450 = null;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public static final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638.EnumC7640[] f29451 = null;

            /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ, reason: contains not printable characters */
            public static final class C7641 {
                public C7641() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public /* synthetic */ C7641(Yue.C1769 r1) {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Yue.InterfaceC4418
                /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
                public final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 m29510(@Yue.InterfaceC4418 android.view.View r3) {
                        r2 = this;
                        java.lang.String r0 = "<this>"
                        Yue.C3329.m13906(r3, r0)
                        float r0 = r3.getAlpha()
                        r1 = 0
                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                        if (r0 != 0) goto L17
                        int r0 = r3.getVisibility()
                        if (r0 != 0) goto L17
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29450
                        goto L1f
                    L17:
                        int r3 = r3.getVisibility()
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = r2.m29511(r3)
                    L1f:
                        return r3
                }

                @Yue.InterfaceC4418
                @Yue.InterfaceC3427
                /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
                public final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 m29511(int r4) {
                        r3 = this;
                        if (r4 == 0) goto L26
                        r0 = 4
                        if (r4 == r0) goto L23
                        r0 = 8
                        if (r4 != r0) goto Lc
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449
                        goto L28
                    Lc:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Unknown visibility "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                    L23:
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29450
                        goto L28
                    L26:
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                    L28:
                        return r4
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ۟, reason: contains not printable characters */
            public /* synthetic */ class C7642 {

                /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
                public static final /* synthetic */ int[] f29452 = null;

                static {
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447     // Catch: java.lang.NoSuchFieldError -> L10
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                        r2 = 1
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                    L10:
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448     // Catch: java.lang.NoSuchFieldError -> L19
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                        r2 = 2
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                    L19:
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449     // Catch: java.lang.NoSuchFieldError -> L22
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                        r2 = 3
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                    L22:
                        androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29450     // Catch: java.lang.NoSuchFieldError -> L2b
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                        r2 = 4
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                    L2b:
                        androidx.fragment.app.AbstractC7635.C7638.EnumC7640.C7642.f29452 = r0
                        return
                }
            }

            static {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟
                    java.lang.String r1 = "VISIBLE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟
                    java.lang.String r1 = "GONE"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟
                    java.lang.String r1 = "INVISIBLE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29450 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟[] r0 = m29507()
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29451 = r0
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ
                    r1 = 0
                    r0.<init>(r1)
                    androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446 = r0
                    return
            }

            EnumC7640(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.AbstractC7635.C7638.EnumC7640 valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟> r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = (androidx.fragment.app.AbstractC7635.C7638.EnumC7640) r1
                    return r1
            }

            public static androidx.fragment.app.AbstractC7635.C7638.EnumC7640[] values() {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29451
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟[] r0 = (androidx.fragment.app.AbstractC7635.C7638.EnumC7640[]) r0
                    return r0
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final /* synthetic */ androidx.fragment.app.AbstractC7635.C7638.EnumC7640[] m29507() {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r2 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r3 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29450
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟[] r0 = new androidx.fragment.app.AbstractC7635.C7638.EnumC7640[]{r0, r1, r2, r3}
                    return r0
            }

            @Yue.InterfaceC4418
            @Yue.InterfaceC3427
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 m29508(int r1) {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = r0.m29511(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final void m29509(@Yue.InterfaceC4418 android.view.View r6) {
                    r5 = this;
                    java.lang.String r0 = "view"
                    Yue.C3329.m13906(r6, r0)
                    int[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.C7642.f29452
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    java.lang.String r2 = "FragmentManager"
                    r3 = 2
                    if (r0 == r1) goto L86
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r3) goto L64
                    r4 = 3
                    if (r0 == r4) goto L41
                    r4 = 4
                    if (r0 == r4) goto L1f
                    goto Lb9
                L1f:
                    boolean r0 = androidx.fragment.app.FragmentManager.m29090(r3)
                    if (r0 == 0) goto L3c
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L3c:
                    r6.setVisibility(r4)
                    goto Lb9
                L41:
                    boolean r0 = androidx.fragment.app.FragmentManager.m29090(r3)
                    if (r0 == 0) goto L5e
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to GONE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L5e:
                    r0 = 8
                    r6.setVisibility(r0)
                    goto Lb9
                L64:
                    boolean r0 = androidx.fragment.app.FragmentManager.m29090(r3)
                    if (r0 == 0) goto L81
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L81:
                    r0 = 0
                    r6.setVisibility(r0)
                    goto Lb9
                L86:
                    android.view.ViewParent r0 = r6.getParent()
                    boolean r1 = r0 instanceof android.view.ViewGroup
                    if (r1 == 0) goto L91
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    goto L92
                L91:
                    r0 = 0
                L92:
                    if (r0 == 0) goto Lb9
                    boolean r1 = androidx.fragment.app.FragmentManager.m29090(r3)
                    if (r1 == 0) goto Lb6
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "SpecialEffectsController: Removing view "
                    r1.append(r3)
                    r1.append(r6)
                    java.lang.String r3 = " from container "
                    r1.append(r3)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r2, r1)
                Lb6:
                    r0.removeView(r6)
                Lb9:
                    return
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
        public /* synthetic */ class C7643 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final /* synthetic */ int[] f29453 = null;

            static {
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    androidx.fragment.app.AbstractC7635.C7638.C7643.f29453 = r0
                    return
            }
        }

        public C7638(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r2, @Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7639 r3, @Yue.InterfaceC4418 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4418 Yue.C0943 r5) {
                r1 = this;
                java.lang.String r0 = "finalState"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "lifecycleImpact"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "fragment"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "cancellationSignal"
                Yue.C3329.m13906(r5, r0)
                r1.<init>()
                r1.f29435 = r2
                r1.f29436 = r3
                r1.f29437 = r4
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f29438 = r2
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                r1.f29439 = r2
                Yue.ۥۢ۟ۦۧ r2 = new Yue.ۥۢ۟ۦۧ
                r2.<init>(r1)
                r5.m5365(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m29492(androidx.fragment.app.AbstractC7635.C7638 r0) {
                m29493(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final void m29493(androidx.fragment.app.AbstractC7635.C7638 r1) {
                java.lang.String r0 = "this$0"
                Yue.C3329.m13906(r1, r0)
                r1.m29495()
                return
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r3 = this;
                int r0 = java.lang.System.identityHashCode(r3)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Operation {"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "} {finalState = "
                r1.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = r3.f29435
                r1.append(r0)
                java.lang.String r0 = " lifecycleImpact = "
                r1.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r3.f29436
                r1.append(r0)
                java.lang.String r0 = " fragment = "
                r1.append(r0)
                androidx.fragment.app.Fragment r0 = r3.f29437
                r1.append(r0)
                r0 = 125(0x7d, float:1.75E-43)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m29494(@Yue.InterfaceC4418 java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "listener"
                Yue.C3329.m13906(r2, r0)
                java.util.List<java.lang.Runnable> r0 = r1.f29438
                r0.add(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m29495() {
                r2 = this;
                boolean r0 = r2.f29440
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.f29440 = r0
                java.util.Set<Yue.ۥۣ۟ۨۧ> r0 = r2.f29439
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L14
                r2.mo29490()
                goto L2e
            L14:
                java.util.Set<Yue.ۥۣ۟ۨۧ> r0 = r2.f29439
                java.util.Set r0 = Yue.C1219.m6541(r0)
                java.util.Iterator r0 = r0.iterator()
            L1e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                Yue.ۥۣ۟ۨۧ r1 = (Yue.C0943) r1
                r1.m5362()
                goto L1e
            L2e:
                return
        }

        @Yue.InterfaceC0907
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo29490() {
                r2 = this;
                boolean r0 = r2.f29441
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
                if (r0 == 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SpecialEffectsController: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " has called complete."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L27:
                r0 = 1
                r2.f29441 = r0
                java.util.List<java.lang.Runnable> r0 = r2.f29438
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

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m29496(@Yue.InterfaceC4418 Yue.C0943 r2) {
                r1 = this;
                java.lang.String r0 = "signal"
                Yue.C3329.m13906(r2, r0)
                java.util.Set<Yue.ۥۣ۟ۨۧ> r0 = r1.f29439
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L18
                java.util.Set<Yue.ۥۣ۟ۨۧ> r2 = r1.f29439
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L18
                r1.mo29490()
            L18:
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final androidx.fragment.app.AbstractC7635.C7638.EnumC7640 m29497() {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = r1.f29435
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final androidx.fragment.app.Fragment m29498() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f29437
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final androidx.fragment.app.AbstractC7635.C7638.EnumC7639 m29499() {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r1.f29436
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final boolean m29500() {
                r1 = this;
                boolean r0 = r1.f29440
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m29501() {
                r1 = this;
                boolean r0 = r1.f29441
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m29502(@Yue.InterfaceC4418 Yue.C0943 r2) {
                r1 = this;
                java.lang.String r0 = "signal"
                Yue.C3329.m13906(r2, r0)
                r1.mo29491()
                java.util.Set<Yue.ۥۣ۟ۨۧ> r0 = r1.f29439
                r0.add(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m29503(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r6, @Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7639 r7) {
                r5 = this;
                java.lang.String r0 = "finalState"
                Yue.C3329.m13906(r6, r0)
                java.lang.String r0 = "lifecycleImpact"
                Yue.C3329.m13906(r7, r0)
                int[] r0 = androidx.fragment.app.AbstractC7635.C7638.C7643.f29453
                int r7 = r7.ordinal()
                r7 = r0[r7]
                r0 = 1
                java.lang.String r1 = "SpecialEffectsController: For fragment "
                java.lang.String r2 = "FragmentManager"
                r3 = 2
                if (r7 == r0) goto L95
                java.lang.String r0 = " mFinalState = "
                if (r7 == r3) goto L5b
                r4 = 3
                if (r7 == r4) goto L23
                goto Lcc
            L23:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r7 = r5.f29435
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
                if (r7 == r4) goto Lcc
                boolean r7 = androidx.fragment.app.FragmentManager.m29090(r3)
                if (r7 == 0) goto L58
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r1)
                androidx.fragment.app.Fragment r1 = r5.f29437
                r7.append(r1)
                r7.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = r5.f29435
                r7.append(r0)
                java.lang.String r0 = " -> "
                r7.append(r0)
                r7.append(r6)
                r0 = 46
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                android.util.Log.v(r2, r7)
            L58:
                r5.f29435 = r6
                goto Lcc
            L5b:
                boolean r6 = androidx.fragment.app.FragmentManager.m29090(r3)
                if (r6 == 0) goto L8c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r1)
                androidx.fragment.app.Fragment r7 = r5.f29437
                r6.append(r7)
                r6.append(r0)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r7 = r5.f29435
                r6.append(r7)
                java.lang.String r7 = " -> REMOVED. mLifecycleImpact  = "
                r6.append(r7)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r7 = r5.f29436
                r6.append(r7)
                java.lang.String r7 = " to REMOVING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            L8c:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
                r5.f29435 = r6
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444
                r5.f29436 = r6
                goto Lcc
            L95:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = r5.f29435
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r7 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
                if (r6 != r7) goto Lcc
                boolean r6 = androidx.fragment.app.FragmentManager.m29090(r3)
                if (r6 == 0) goto Lc4
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r1)
                androidx.fragment.app.Fragment r7 = r5.f29437
                r6.append(r7)
                java.lang.String r7 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                r6.append(r7)
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r7 = r5.f29436
                r6.append(r7)
                java.lang.String r7 = " to ADDING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            Lc4:
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
                r5.f29435 = r6
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
                r5.f29436 = r6
            Lcc:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo29491() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m29504(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                Yue.C3329.m13906(r2, r0)
                r1.f29435 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m29505(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7639 r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                Yue.C3329.m13906(r2, r0)
                r1.f29436 = r2
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C7644 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f29454 = null;

        static {
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ[] r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                androidx.fragment.app.AbstractC7635.C7644.f29454 = r0
                return
        }
    }

    static {
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ r0 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            androidx.fragment.app.AbstractC7635.f29428 = r0
            return
    }

    public AbstractC7635(@Yue.InterfaceC4418 android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f29429 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f29430 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f29431 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29467(androidx.fragment.app.AbstractC7635 r0, androidx.fragment.app.AbstractC7635.C7637 r1) {
            m29469(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m29468(androidx.fragment.app.AbstractC7635 r0, androidx.fragment.app.AbstractC7635.C7637 r1) {
            m29470(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m29469(androidx.fragment.app.AbstractC7635 r1, androidx.fragment.app.AbstractC7635.C7637 r2) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r2, r0)
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r1 = r1.f29430
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L24
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r1 = r2.m29497()
            androidx.fragment.app.Fragment r2 = r2.m29498()
            android.view.View r2 = r2.mView
            java.lang.String r0 = "operation.fragment.mView"
            Yue.C3329.m13905(r2, r0)
            r1.m29509(r2)
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m29470(androidx.fragment.app.AbstractC7635 r1, androidx.fragment.app.AbstractC7635.C7637 r2) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$operation"
            Yue.C3329.m13906(r2, r0)
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r1.f29430
            r0.remove(r2)
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r1 = r1.f29431
            r1.remove(r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final androidx.fragment.app.AbstractC7635 m29471(@Yue.InterfaceC4418 android.view.ViewGroup r1, @Yue.InterfaceC4418 Yue.InterfaceC5884 r2) {
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ r0 = androidx.fragment.app.AbstractC7635.f29428
            androidx.fragment.app.ۥ۟۟۠ۡ r1 = r0.m29488(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final androidx.fragment.app.AbstractC7635 m29472(@Yue.InterfaceC4418 android.view.ViewGroup r1, @Yue.InterfaceC4418 androidx.fragment.app.FragmentManager r2) {
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ r0 = androidx.fragment.app.AbstractC7635.f29428
            androidx.fragment.app.ۥ۟۟۠ۡ r1 = r0.m29489(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29473(androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r5, androidx.fragment.app.AbstractC7635.C7638.EnumC7639 r6, androidx.fragment.app.C7627 r7) {
            r4 = this;
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r4.f29430
            monitor-enter(r0)
            Yue.ۥۣ۟ۨۧ r1 = new Yue.ۥۣ۟ۨۧ     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            androidx.fragment.app.Fragment r2 = r7.m29390()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "fragmentStateManager.fragment"
            Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L1c
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = r4.m29479(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            r2.m29503(r5, r6)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r5 = move-exception
            goto L3c
        L1e:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟ r2 = new androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> L1c
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r5 = r4.f29430     // Catch: java.lang.Throwable -> L1c
            r5.add(r2)     // Catch: java.lang.Throwable -> L1c
            Yue.ۥۢ۟ۦۥ r5 = new Yue.ۥۢ۟ۦۥ     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1c
            r2.m29494(r5)     // Catch: java.lang.Throwable -> L1c
            Yue.ۥۢ۟ۦۦ r5 = new Yue.ۥۢ۟ۦۦ     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1c
            r2.m29494(r5)     // Catch: java.lang.Throwable -> L1c
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L3c:
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m29474(@Yue.InterfaceC4418 androidx.fragment.app.AbstractC7635.C7638.EnumC7640 r3, @Yue.InterfaceC4418 androidx.fragment.app.C7627 r4) {
            r2 = this;
            java.lang.String r0 = "finalState"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "fragmentStateManager"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.m29390()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2b:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
            r2.m29473(r3, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29475(@Yue.InterfaceC4418 androidx.fragment.app.C7627 r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            Yue.C3329.m13906(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.m29390()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L26:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29449
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442
            r2.m29473(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m29476(@Yue.InterfaceC4418 androidx.fragment.app.C7627 r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            Yue.C3329.m13906(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.m29390()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L26:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29447
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444
            r2.m29473(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29477(@Yue.InterfaceC4418 androidx.fragment.app.C7627 r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            Yue.C3329.m13906(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.m29390()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L26:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r0 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442
            r2.m29473(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract void mo29312(@Yue.InterfaceC4418 java.util.List<androidx.fragment.app.AbstractC7635.C7638> r1, boolean r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29478() {
            r7 = this;
            boolean r0 = r7.f29433
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.f29429
            boolean r0 = Yue.C6794.m26181(r0)
            r1 = 0
            if (r0 != 0) goto L14
            r7.m29481()
            r7.f29432 = r1
            return
        L14:
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r7.f29430
            monitor-enter(r0)
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r2 = r7.f29430     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a
            r2 = r2 ^ 1
            if (r2 == 0) goto Lb3
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r2 = r7.f29431     // Catch: java.lang.Throwable -> L5a
            java.util.List r2 = Yue.C1219.m6540(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r7.f29431     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5a
            r4 = 2
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r3 = (androidx.fragment.app.AbstractC7635.C7638) r3     // Catch: java.lang.Throwable -> L5a
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5c
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5a
            r5.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5a
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r1 = move-exception
            goto Lb7
        L5c:
            r3.m29495()     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r3.m29501()     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L30
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r4 = r7.f29431     // Catch: java.lang.Throwable -> L5a
            r4.add(r3)     // Catch: java.lang.Throwable -> L5a
            goto L30
        L6b:
            r7.m29486()     // Catch: java.lang.Throwable -> L5a
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r2 = r7.f29430     // Catch: java.lang.Throwable -> L5a
            java.util.List r2 = Yue.C1219.m6540(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r7.f29430     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r7.f29431     // Catch: java.lang.Throwable -> L5a
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L5a
            boolean r3 = androidx.fragment.app.FragmentManager.m29090(r4)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L8b
            java.lang.String r3 = "FragmentManager"
            java.lang.String r5 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r3, r5)     // Catch: java.lang.Throwable -> L5a
        L8b:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L8f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L5a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r5 = (androidx.fragment.app.AbstractC7635.C7638) r5     // Catch: java.lang.Throwable -> L5a
            r5.mo29491()     // Catch: java.lang.Throwable -> L5a
            goto L8f
        L9f:
            boolean r3 = r7.f29432     // Catch: java.lang.Throwable -> L5a
            r7.mo29312(r2, r3)     // Catch: java.lang.Throwable -> L5a
            r7.f29432 = r1     // Catch: java.lang.Throwable -> L5a
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r4)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto Lb3
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r1, r2)     // Catch: java.lang.Throwable -> L5a
        Lb3:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            return
        Lb7:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final androidx.fragment.app.AbstractC7635.C7638 m29479(androidx.fragment.app.Fragment r5) {
            r4 = this;
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r4.f29430
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = (androidx.fragment.app.AbstractC7635.C7638) r2
            androidx.fragment.app.Fragment r3 = r2.m29498()
            boolean r3 = Yue.C3329.m13897(r3, r5)
            if (r3 == 0) goto L6
            boolean r2 = r2.m29500()
            if (r2 != 0) goto L6
            goto L25
        L24:
            r1 = 0
        L25:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = (androidx.fragment.app.AbstractC7635.C7638) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final androidx.fragment.app.AbstractC7635.C7638 m29480(androidx.fragment.app.Fragment r5) {
            r4 = this;
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r4.f29431
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = (androidx.fragment.app.AbstractC7635.C7638) r2
            androidx.fragment.app.Fragment r3 = r2.m29498()
            boolean r3 = Yue.C3329.m13897(r3, r5)
            if (r3 == 0) goto L6
            boolean r2 = r2.m29500()
            if (r2 != 0) goto L6
            goto L25
        L24:
            r1 = 0
        L25:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = (androidx.fragment.app.AbstractC7635.C7638) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29481() {
            r9 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing all operations to complete"
            android.util.Log.v(r1, r2)
        Le:
            android.view.ViewGroup r1 = r9.f29429
            boolean r1 = Yue.C6794.m26181(r1)
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r2 = r9.f29430
            monitor-enter(r2)
            r9.m29486()     // Catch: java.lang.Throwable -> L30
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r9.f29430     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L30
        L20:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L30
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4     // Catch: java.lang.Throwable -> L30
            r4.mo29491()     // Catch: java.lang.Throwable -> L30
            goto L20
        L30:
            r0 = move-exception
            goto Led
        L33:
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r9.f29431     // Catch: java.lang.Throwable -> L30
            java.util.List r3 = Yue.C1219.m6540(r3)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L30
        L3d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L30
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4     // Catch: java.lang.Throwable -> L30
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r0)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L8a
            if (r1 == 0) goto L54
            java.lang.String r5 = ""
            goto L6c
        L54:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r5.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            android.view.ViewGroup r6 = r9.f29429     // Catch: java.lang.Throwable -> L30
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L30
        L6c:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r7.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L30
            r7.append(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "Cancelling running operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L30
            r7.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L30
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L30
        L8a:
            r4.m29495()     // Catch: java.lang.Throwable -> L30
            goto L3d
        L8e:
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r3 = r9.f29430     // Catch: java.lang.Throwable -> L30
            java.util.List r3 = Yue.C1219.m6540(r3)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L30
        L98:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L30
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4     // Catch: java.lang.Throwable -> L30
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r0)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto Le5
            if (r1 == 0) goto Laf
            java.lang.String r5 = ""
            goto Lc7
        Laf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r5.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            android.view.ViewGroup r6 = r9.f29429     // Catch: java.lang.Throwable -> L30
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L30
        Lc7:
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r7.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "SpecialEffectsController: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L30
            r7.append(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "Cancelling pending operation "
            r7.append(r5)     // Catch: java.lang.Throwable -> L30
            r7.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L30
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L30
        Le5:
            r4.m29495()     // Catch: java.lang.Throwable -> L30
            goto L98
        Le9:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)
            return
        Led:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m29482() {
            r2 = this;
            boolean r0 = r2.f29433
            if (r0 == 0) goto L18
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Forcing postponed operations"
            android.util.Log.v(r0, r1)
        L12:
            r0 = 0
            r2.f29433 = r0
            r2.m29478()
        L18:
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final androidx.fragment.app.AbstractC7635.C7638.EnumC7639 m29483(@Yue.InterfaceC4418 androidx.fragment.app.C7627 r5) {
            r4 = this;
            java.lang.String r0 = "fragmentStateManager"
            Yue.C3329.m13906(r5, r0)
            androidx.fragment.app.Fragment r5 = r5.m29390()
            java.lang.String r0 = "fragmentStateManager.fragment"
            Yue.C3329.m13905(r5, r0)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r0 = r4.m29479(r5)
            r1 = 0
            if (r0 == 0) goto L1a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r0.m29499()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r5 = r4.m29480(r5)
            if (r5 == 0) goto L25
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r1 = r5.m29499()
        L25:
            r5 = -1
            if (r0 != 0) goto L2a
            r2 = r5
            goto L32
        L2a:
            int[] r2 = androidx.fragment.app.AbstractC7635.C7644.f29454
            int r3 = r0.ordinal()
            r2 = r2[r3]
        L32:
            if (r2 == r5) goto L38
            r5 = 1
            if (r2 == r5) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final android.view.ViewGroup m29484() {
            r1 = this;
            android.view.ViewGroup r0 = r1.f29429
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29485() {
            r8 = this;
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r8.f29430
            monitor-enter(r0)
            r8.m29486()     // Catch: java.lang.Throwable -> L3a
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r1 = r8.f29430     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3a
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch: java.lang.Throwable -> L3a
        L10:
            boolean r2 = r1.hasPrevious()     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.previous()     // Catch: java.lang.Throwable -> L3a
            r4 = r2
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r4 = (androidx.fragment.app.AbstractC7635.C7638) r4     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r5 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.Fragment r6 = r4.m29498()     // Catch: java.lang.Throwable -> L3a
            android.view.View r6 = r6.mView     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "operation.fragment.mView"
            Yue.C3329.m13905(r6, r7)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r5 = r5.m29510(r6)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r4 = r4.m29497()     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r6 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29448     // Catch: java.lang.Throwable -> L3a
            if (r4 != r6) goto L10
            if (r5 == r6) goto L10
            goto L3d
        L3a:
            r1 = move-exception
            goto L53
        L3c:
            r2 = r3
        L3d:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r2 = (androidx.fragment.app.AbstractC7635.C7638) r2     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L45
            androidx.fragment.app.Fragment r3 = r2.m29498()     // Catch: java.lang.Throwable -> L3a
        L45:
            if (r3 == 0) goto L4c
            boolean r1 = r3.isPostponed()     // Catch: java.lang.Throwable -> L3a
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r8.f29433 = r1     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            return
        L53:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m29486() {
            r4 = this;
            java.util.List<androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟> r0 = r4.f29430
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟ r1 = (androidx.fragment.app.AbstractC7635.C7638) r1
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r2 = r1.m29499()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r3 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
            if (r2 != r3) goto L6
            androidx.fragment.app.Fragment r2 = r1.m29498()
            android.view.View r2 = r2.requireView()
            java.lang.String r3 = "fragment.requireView()"
            Yue.C3329.m13905(r2, r3)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ r3 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.f29446
            int r2 = r2.getVisibility()
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r2 = r3.m29511(r2)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r3 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29442
            r1.m29503(r2, r3)
            goto L6
        L37:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m29487(boolean r1) {
            r0 = this;
            r0.f29432 = r1
            return
    }
}
