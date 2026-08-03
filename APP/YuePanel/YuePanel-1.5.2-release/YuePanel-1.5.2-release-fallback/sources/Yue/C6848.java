package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
public final class C6848 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    public static final class C6849 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super android.view.View>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23971;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f23972;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f23973;

        public C6849(android.view.View r1, Yue.InterfaceC1598<? super Yue.C6848.C6849> r2) {
                r0 = this;
                r0.f23973 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥۢۤۦ۟$ۥ r0 = new Yue.ۥۢۤۦ۟$ۥ
                android.view.View r1 = r2.f23973
                r0.<init>(r1, r4)
                r0.f23972 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super android.view.View> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m26570(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r4.f23971
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yue.C5391.m20403(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f23972
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.C5391.m20403(r5)
                goto L37
            L22:
                Yue.C5391.m20403(r5)
                java.lang.Object r5 = r4.f23972
                r1 = r5
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                android.view.View r5 = r4.f23973
                r4.f23972 = r1
                r4.f23971 = r3
                java.lang.Object r5 = r1.mo20973(r5, r4)
                if (r5 != r0) goto L37
                return r0
            L37:
                android.view.View r5 = r4.f23973
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                Yue.ۥۡۨۢ r5 = Yue.C6839.m26515(r5)
                r3 = 0
                r4.f23972 = r3
                r4.f23971 = r2
                java.lang.Object r5 = r1.m20979(r5, r4)
                if (r5 != r0) goto L4f
                return r0
            L4f:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m26570(@Yue.InterfaceC4418 Yue.AbstractC5611<? super android.view.View> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۢۤۦ۟$ۥ r1 = (Yue.C6848.C6849) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟, reason: contains not printable characters */
    public /* synthetic */ class C6850 extends Yue.C2854 implements Yue.InterfaceC2825<android.view.ViewParent, android.view.ViewParent> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C6848.C6850 f23974 = null;

        static {
                Yue.ۥۢۤۦ۟$ۥ۟ r0 = new Yue.ۥۢۤۦ۟$ۥ۟
                r0.<init>()
                Yue.C6848.C6850.f23974 = r0
                return
        }

        public C6850() {
                r6 = this;
                java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
                r5 = 0
                r1 = 1
                java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
                java.lang.String r3 = "getParent"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ android.view.ViewParent invoke(android.view.ViewParent r1) {
                r0 = this;
                android.view.ViewParent r1 = (android.view.ViewParent) r1
                android.view.ViewParent r1 = r0.m26571(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final android.view.ViewParent m26571(@Yue.InterfaceC4418 android.view.ViewParent r1) {
                r0 = this;
                android.view.ViewParent r1 = r1.getParent()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC6851 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f23975;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<android.view.View, Yue.C6593> f23976;

        public ViewOnAttachStateChangeListenerC6851(android.view.View r1, Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
                r0 = this;
                r0.f23975 = r1
                r0.f23976 = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@Yue.InterfaceC4418 android.view.View r2) {
                r1 = this;
                android.view.View r0 = r1.f23975
                r0.removeOnAttachStateChangeListener(r1)
                Yue.ۥۣ۠ۡ۟<android.view.View, Yue.ۥۣۢ۠ۤ> r0 = r1.f23976
                r0.invoke(r2)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@Yue.InterfaceC4418 android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC6852 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f23977;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<android.view.View, Yue.C6593> f23978;

        public ViewOnAttachStateChangeListenerC6852(android.view.View r1, Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
                r0 = this;
                r0.f23977 = r1
                r0.f23978 = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@Yue.InterfaceC4418 android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@Yue.InterfaceC4418 android.view.View r2) {
                r1 = this;
                android.view.View r0 = r1.f23977
                r0.removeOnAttachStateChangeListener(r1)
                Yue.ۥۣ۠ۡ۟<android.view.View, Yue.ۥۣۢ۠ۤ> r0 = r1.f23978
                r0.invoke(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n69#2,2:415\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC6853 implements android.view.View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825 f23979;

        public ViewOnLayoutChangeListenerC6853(Yue.InterfaceC2825 r1) {
                r0 = this;
                r0.f23979 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@Yue.InterfaceC4418 android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                r1.removeOnLayoutChangeListener(r0)
                Yue.ۥۣ۠ۡ۟ r2 = r0.f23979
                r2.invoke(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC6854 implements android.view.View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<android.view.View, Yue.C6593> f23980;

        public ViewOnLayoutChangeListenerC6854(Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r1) {
                r0 = this;
                r0.f23980 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@Yue.InterfaceC4418 android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                r1.removeOnLayoutChangeListener(r0)
                Yue.ۥۣ۠ۡ۟<android.view.View, Yue.ۥۣۢ۠ۤ> r2 = r0.f23980
                r2.invoke(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC6855 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<android.view.View, Yue.C6593> f23981;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f23982;

        public RunnableC6855(Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r1, android.view.View r2) {
                r0 = this;
                r0.f23981 = r1
                r0.f23982 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                Yue.ۥۣ۠ۡ۟<android.view.View, Yue.ۥۣۢ۠ۤ> r0 = r2.f23981
                android.view.View r1 = r2.f23982
                r0.invoke(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC6856 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<Yue.C6593> f23983;

        public RunnableC6856(Yue.InterfaceC2823<Yue.C6593> r1) {
                r0 = this;
                r0.f23983 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r1.f23983
                r0.invoke()
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m26538(Yue.InterfaceC2823 r0) {
            m26559(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m26539(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto La
            r2.invoke(r1)
            goto L12
        La:
            Yue.ۥۢۤۦ۟$ۥ۟۟ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m26540(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto La
            r2.invoke(r1)
            goto L12
        La:
            Yue.ۥۢۤۦ۟$ۥ۟۟۟ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟۟
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m26541(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L10
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L10
            r2.invoke(r1)
            goto L18
        L10:
            Yue.ۥۢۤۦ۟$ۥ۟۟۟۟ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟۟۟
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m26542(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
            Yue.ۥۢۤۦ۟$ۥ۟۟۟۠ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟۟۠
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.ViewTreeObserverOnPreDrawListenerC4630 m26543(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r2) {
            Yue.ۥۢۤۦ۟$ۥ۟۟۟ۡ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟۟ۡ
            r0.<init>(r2, r1)
            Yue.ۥۣۣۡ۟ r1 = Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.Bitmap m26544(@Yue.InterfaceC4418 android.view.View r3, @Yue.InterfaceC4418 android.graphics.Bitmap.Config r4) {
            boolean r0 = r3.isLaidOut()
            if (r0 == 0) goto L2a
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r1, r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            int r1 = r3.getScrollX()
            float r1 = (float) r1
            float r1 = -r1
            int r2 = r3.getScrollY()
            float r2 = (float) r2
            float r2 = -r2
            r0.translate(r1, r2)
            r3.draw(r0)
            return r4
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "View needs to be laid out before calling drawToBitmap()"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Bitmap m26545(android.view.View r0, android.graphics.Bitmap.Config r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = m26544(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<android.view.View> m26546(@Yue.InterfaceC4418 android.view.View r2) {
            Yue.ۥۢۤۦ۟$ۥ r0 = new Yue.ۥۢۤۦ۟$ۥ
            r1 = 0
            r0.<init>(r2, r1)
            Yue.ۥۡۨۢ r2 = Yue.C5613.m20982(r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<android.view.ViewParent> m26547(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            Yue.ۥۢۤۦ۟$ۥ۟ r0 = Yue.C6848.C6850.f23974
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20994(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m26548(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.bottomMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m26549(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginEnd()
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m26550(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.leftMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int m26551(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.rightMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m26552(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginStart()
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m26553(@Yue.InterfaceC4418 android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.topMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m26554(@Yue.InterfaceC4418 android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 8
            if (r1 != r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean m26555(@Yue.InterfaceC4418 android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 4
            if (r1 != r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26556(@Yue.InterfaceC4418 android.view.View r0) {
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.Runnable m26557(@Yue.InterfaceC4418 android.view.View r1, long r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4) {
            Yue.ۥۢۤۦ۟$ۥ۟۟۟ۢ r0 = new Yue.ۥۢۤۦ۟$ۥ۟۟۟ۢ
            r0.<init>(r4)
            r1.postDelayed(r0, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.Runnable m26558(@Yue.InterfaceC4418 android.view.View r1, long r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4) {
            Yue.ۥۢۤۦ r0 = new Yue.ۥۢۤۦ
            r0.<init>(r4)
            r1.postOnAnimationDelayed(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final void m26559(Yue.InterfaceC2823 r0) {
            r0.invoke()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final void m26560(@Yue.InterfaceC4418 android.view.View r0, boolean r1) {
            if (r1 == 0) goto L5
            r1 = 8
            goto L6
        L5:
            r1 = 0
        L6:
            r0.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final void m26561(@Yue.InterfaceC4418 android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 4
            goto L5
        L4:
            r1 = 0
        L5:
            r0.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final void m26562(@Yue.InterfaceC4418 android.view.View r0, @Yue.InterfaceC4992 int r1) {
            r0.setPadding(r1, r1, r1, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final void m26563(@Yue.InterfaceC4418 android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 0
            goto L6
        L4:
            r1 = 8
        L6:
            r0.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final void m26564(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.ViewGroup.LayoutParams, Yue.C6593> r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Ld
            r2.invoke(r0)
            r1.setLayoutParams(r0)
            return
        Ld:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC3421(name = "updateLayoutParamsTyped")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void m26565(android.view.View r3, Yue.InterfaceC2825<? super T, Yue.C6593> r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = 1
            java.lang.String r2 = "T"
            Yue.C3329.m13915(r1, r2)
            r4.invoke(r0)
            r3.setLayoutParams(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final void m26566(@Yue.InterfaceC4418 android.view.View r0, @Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4) {
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ void m26567(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingLeft()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingRight()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final void m26568(@Yue.InterfaceC4418 android.view.View r0, @Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ void m26569(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingEnd()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
