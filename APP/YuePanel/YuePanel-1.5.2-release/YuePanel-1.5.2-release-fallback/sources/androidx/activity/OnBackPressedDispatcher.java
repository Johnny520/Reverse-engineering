package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Runnable f24930;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC1535<java.lang.Boolean> f24931;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0561<Yue.AbstractC4607> f24932;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.AbstractC4607 f24933;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public android.window.OnBackInvokedCallback f24934;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public android.window.OnBackInvokedDispatcher f24935;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f24936;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f24937;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "LYue/ۥۣ۟ۨ;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥۣۡۡۢ;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;LYue/ۥۣۡۡۢ;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "ۥۣ۟۟۠", "Landroidx/lifecycle/Lifecycle;", "ۥ۟۟۠ۤ", "LYue/ۥۣۡۡۢ;", "ۥ۟۟۠ۥ", "LYue/ۥۣ۟ۨ;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0})
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, Yue.InterfaceC0931 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final androidx.lifecycle.Lifecycle f24938;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC4607 f24939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public Yue.InterfaceC0931 f24940;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24941;

        public LifecycleOnBackPressedCancellable(@Yue.InterfaceC4418 androidx.activity.OnBackPressedDispatcher r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r3, Yue.AbstractC4607 r4) {
                r1 = this;
                java.lang.String r0 = "lifecycle"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "onBackPressedCallback"
                Yue.C3329.m13906(r4, r0)
                r1.f24941 = r2
                r1.<init>()
                r1.f24938 = r3
                r1.f24939 = r4
                r3.addObserver(r1)
                return
        }

        @Override // Yue.InterfaceC0931
        public void cancel() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.f24938
                r0.removeObserver(r1)
                Yue.ۥۣۡۡۢ r0 = r1.f24939
                r0.removeCancellable(r1)
                Yue.ۥۣ۟ۨ r0 = r1.f24940
                if (r0 == 0) goto L11
                r0.cancel()
            L11:
                r0 = 0
                r1.f24940 = r0
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r2 = "event"
                Yue.C3329.m13906(r3, r2)
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r3 != r2) goto L19
                androidx.activity.OnBackPressedDispatcher r2 = r1.f24941
                Yue.ۥۣۡۡۢ r3 = r1.f24939
                Yue.ۥۣ۟ۨ r2 = r2.m27754(r3)
                r1.f24940 = r2
                goto L2c
            L19:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r3 != r2) goto L25
                Yue.ۥۣ۟ۨ r2 = r1.f24940
                if (r2 == 0) goto L2c
                r2.cancel()
                goto L2c
            L25:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r3 != r2) goto L2c
                r1.cancel()
            L2c:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ, reason: contains not printable characters */
    public static final class C7237 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C0717, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24942;

        public C7237(androidx.activity.OnBackPressedDispatcher r1) {
                r0 = this;
                r0.f24942 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(Yue.C0717 r1) {
                r0 = this;
                Yue.ۥ۟ۢۤۥ r1 = (Yue.C0717) r1
                r0.m27766(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m27766(@Yue.InterfaceC4418 Yue.C0717 r2) {
                r1 = this;
                java.lang.String r0 = "backEvent"
                Yue.C3329.m13906(r2, r0)
                androidx.activity.OnBackPressedDispatcher r0 = r1.f24942
                androidx.activity.OnBackPressedDispatcher.m27749(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟, reason: contains not printable characters */
    public static final class C7238 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C0717, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24943;

        public C7238(androidx.activity.OnBackPressedDispatcher r1) {
                r0 = this;
                r0.f24943 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(Yue.C0717 r1) {
                r0 = this;
                Yue.ۥ۟ۢۤۥ r1 = (Yue.C0717) r1
                r0.m27767(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m27767(@Yue.InterfaceC4418 Yue.C0717 r2) {
                r1 = this;
                java.lang.String r0 = "backEvent"
                Yue.C3329.m13906(r2, r0)
                androidx.activity.OnBackPressedDispatcher r0 = r1.f24943
                androidx.activity.OnBackPressedDispatcher.m27748(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟, reason: contains not printable characters */
    public static final class C7239 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24944;

        public C7239(androidx.activity.OnBackPressedDispatcher r1) {
                r0 = this;
                r0.f24944 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r1.f24944
                r0.m27760()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7240 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24945;

        public C7240(androidx.activity.OnBackPressedDispatcher r1) {
                r0 = this;
                r0.f24945 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r1.f24945
                androidx.activity.OnBackPressedDispatcher.m27747(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7241 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24946;

        public C7241(androidx.activity.OnBackPressedDispatcher r1) {
                r0 = this;
                r0.f24946 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r1.f24946
                r0.m27760()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static final class C7242 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final androidx.activity.OnBackPressedDispatcher.C7242 f24947 = null;

        static {
                androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠ r0 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.C7242.f24947 = r0
                return
        }

        public C7242() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m27768(Yue.InterfaceC2823 r0) {
                m27769(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final void m27769(Yue.InterfaceC2823 r1) {
                java.lang.String r0 = "$onBackInvoked"
                Yue.C3329.m13906(r1, r0)
                r1.invoke()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.window.OnBackInvokedCallback m27770(@Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r2) {
                r1 = this;
                java.lang.String r0 = "onBackInvoked"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۣۣۡۡ r0 = new Yue.ۥۣۣۡۡ
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m27771(@Yue.InterfaceC4418 java.lang.Object r2, int r3, @Yue.InterfaceC4418 java.lang.Object r4) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "callback"
                Yue.C3329.m13906(r4, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
                r2.registerOnBackInvokedCallback(r3, r4)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m27772(@Yue.InterfaceC4418 java.lang.Object r2, @Yue.InterfaceC4418 java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "callback"
                Yue.C3329.m13906(r3, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
                r2.unregisterOnBackInvokedCallback(r3)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static final class C7243 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final androidx.activity.OnBackPressedDispatcher.C7243 f24948 = null;

        /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
        public static final class C7244 implements android.window.OnBackAnimationCallback {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2825<Yue.C0717, Yue.C6593> f24949;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2825<Yue.C0717, Yue.C6593> f24950;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2823<Yue.C6593> f24951;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2823<Yue.C6593> f24952;

            public C7244(Yue.InterfaceC2825<? super Yue.C0717, Yue.C6593> r1, Yue.InterfaceC2825<? super Yue.C0717, Yue.C6593> r2, Yue.InterfaceC2823<Yue.C6593> r3, Yue.InterfaceC2823<Yue.C6593> r4) {
                    r0 = this;
                    r0.f24949 = r1
                    r0.f24950 = r2
                    r0.f24951 = r3
                    r0.f24952 = r4
                    r0.<init>()
                    return
            }

            public void onBackCancelled() {
                    r1 = this;
                    Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r1.f24952
                    r0.invoke()
                    return
            }

            public void onBackInvoked() {
                    r1 = this;
                    Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r1.f24951
                    r0.invoke()
                    return
            }

            public void onBackProgressed(@Yue.InterfaceC4418 android.window.BackEvent r3) {
                    r2 = this;
                    java.lang.String r0 = "backEvent"
                    Yue.C3329.m13906(r3, r0)
                    Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۢۤۥ, Yue.ۥۣۢ۠ۤ> r0 = r2.f24950
                    Yue.ۥ۟ۢۤۥ r1 = new Yue.ۥ۟ۢۤۥ
                    r1.<init>(r3)
                    r0.invoke(r1)
                    return
            }

            public void onBackStarted(@Yue.InterfaceC4418 android.window.BackEvent r3) {
                    r2 = this;
                    java.lang.String r0 = "backEvent"
                    Yue.C3329.m13906(r3, r0)
                    Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۢۤۥ, Yue.ۥۣۢ۠ۤ> r0 = r2.f24949
                    Yue.ۥ۟ۢۤۥ r1 = new Yue.ۥ۟ۢۤۥ
                    r1.<init>(r3)
                    r0.invoke(r1)
                    return
            }
        }

        static {
                androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ r0 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.C7243.f24948 = r0
                return
        }

        public C7243() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.window.OnBackInvokedCallback m27773(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.C0717, Yue.C6593> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.C0717, Yue.C6593> r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r5) {
                r1 = this;
                java.lang.String r0 = "onBackStarted"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "onBackProgressed"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "onBackInvoked"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "onBackCancelled"
                Yue.C3329.m13906(r5, r0)
                androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ r0 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final class C7245 implements Yue.InterfaceC0931 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC4607 f24953;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f24954;

        public C7245(@Yue.InterfaceC4418 androidx.activity.OnBackPressedDispatcher r2, Yue.AbstractC4607 r3) {
                r1 = this;
                java.lang.String r0 = "onBackPressedCallback"
                Yue.C3329.m13906(r3, r0)
                r1.f24954 = r2
                r1.<init>()
                r1.f24953 = r3
                return
        }

        @Override // Yue.InterfaceC0931
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.f24954
                Yue.ۥ۟ۡۧۡ r0 = androidx.activity.OnBackPressedDispatcher.m27746(r0)
                Yue.ۥۣۡۡۢ r1 = r2.f24953
                r0.remove(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r2.f24954
                Yue.ۥۣۡۡۢ r0 = androidx.activity.OnBackPressedDispatcher.m27745(r0)
                Yue.ۥۣۡۡۢ r1 = r2.f24953
                boolean r0 = Yue.C3329.m13897(r0, r1)
                r1 = 0
                if (r0 == 0) goto L24
                Yue.ۥۣۡۡۢ r0 = r2.f24953
                r0.handleOnBackCancelled()
                androidx.activity.OnBackPressedDispatcher r0 = r2.f24954
                androidx.activity.OnBackPressedDispatcher.m27750(r0, r1)
            L24:
                Yue.ۥۣۡۡۢ r0 = r2.f24953
                r0.removeCancellable(r2)
                Yue.ۥۣۡۡۢ r0 = r2.f24953
                Yue.ۥۣ۠۠ۨ r0 = r0.getEnabledChangedCallback$activity_release()
                if (r0 == 0) goto L34
                r0.invoke()
            L34:
                Yue.ۥۣۡۡۢ r0 = r2.f24953
                r0.setEnabledChangedCallback$activity_release(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥۣ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C7246 extends Yue.C2854 implements Yue.InterfaceC2823<Yue.C6593> {
        public C7246(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "updateEnabledCallbacks()V"
                r6 = 0
                r1 = 0
                java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
                java.lang.String r4 = "updateEnabledCallbacks"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
                androidx.activity.OnBackPressedDispatcher.m27751(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public /* synthetic */ class C7247 extends Yue.C2854 implements Yue.InterfaceC2823<Yue.C6593> {
        public C7247(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "updateEnabledCallbacks()V"
                r6 = 0
                r1 = 0
                java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
                java.lang.String r4 = "updateEnabledCallbacks"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
                androidx.activity.OnBackPressedDispatcher.m27751(r0)
                return
        }
    }

    @Yue.InterfaceC3422
    public OnBackPressedDispatcher() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    public OnBackPressedDispatcher(@Yue.InterfaceC4543 java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public OnBackPressedDispatcher(@Yue.InterfaceC4543 java.lang.Runnable r4, @Yue.InterfaceC4543 Yue.InterfaceC1535<java.lang.Boolean> r5) {
            r3 = this;
            r3.<init>()
            r3.f24930 = r4
            r3.f24931 = r5
            Yue.ۥ۟ۡۧۡ r4 = new Yue.ۥ۟ۡۧۡ
            r4.<init>()
            r3.f24932 = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L40
            r5 = 34
            if (r4 < r5) goto L33
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ r4 = androidx.activity.OnBackPressedDispatcher.C7243.f24948
            androidx.activity.OnBackPressedDispatcher$ۥ r5 = new androidx.activity.OnBackPressedDispatcher$ۥ
            r5.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$ۥ۟ r0 = new androidx.activity.OnBackPressedDispatcher$ۥ۟
            r0.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟ r1 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟
            r1.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ r2 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟
            r2.<init>(r3)
            android.window.OnBackInvokedCallback r4 = r4.m27773(r5, r0, r1, r2)
            goto L3e
        L33:
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠ r4 = androidx.activity.OnBackPressedDispatcher.C7242.f24947
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۟ r5 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۟
            r5.<init>(r3)
            android.window.OnBackInvokedCallback r4 = r4.m27770(r5)
        L3e:
            r3.f24934 = r4
        L40:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.AbstractC4607 m27745(androidx.activity.OnBackPressedDispatcher r0) {
            Yue.ۥۣۡۡۢ r0 = r0.f24933
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C0561 m27746(androidx.activity.OnBackPressedDispatcher r0) {
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r0.f24932
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m27747(androidx.activity.OnBackPressedDispatcher r0) {
            r0.m27759()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m27748(androidx.activity.OnBackPressedDispatcher r0, Yue.C0717 r1) {
            r0.m27761(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m27749(androidx.activity.OnBackPressedDispatcher r0, Yue.C0717 r1) {
            r0.m27762(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ void m27750(androidx.activity.OnBackPressedDispatcher r0, Yue.AbstractC4607 r1) {
            r0.f24933 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ void m27751(androidx.activity.OnBackPressedDispatcher r0) {
            r0.m27765()
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m27752(@Yue.InterfaceC4418 Yue.AbstractC4607 r2) {
            r1 = this;
            java.lang.String r0 = "onBackPressedCallback"
            Yue.C3329.m13906(r2, r0)
            r1.m27754(r2)
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m27753(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4418 Yue.AbstractC4607 r4) {
            r2 = this;
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "onBackPressedCallback"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L17
            return
        L17:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            r4.addCancellable(r0)
            r2.m27765()
            androidx.activity.OnBackPressedDispatcher$ۥۣ۟۟۟ r3 = new androidx.activity.OnBackPressedDispatcher$ۥۣ۟۟۟
            r3.<init>(r2)
            r4.setEnabledChangedCallback$activity_release(r3)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC0931 m27754(@Yue.InterfaceC4418 Yue.AbstractC4607 r3) {
            r2 = this;
            java.lang.String r0 = "onBackPressedCallback"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r2.f24932
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۢ r0 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۢ
            r0.<init>(r2, r3)
            r3.addCancellable(r0)
            r2.m27765()
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۤ r1 = new androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۤ
            r1.<init>(r2)
            r3.setEnabledChangedCallback$activity_release(r1)
            return r0
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m27755() {
            r0 = this;
            r0.m27759()
            return
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m27756(@Yue.InterfaceC4418 Yue.C0717 r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            Yue.C3329.m13906(r2, r0)
            r1.m27761(r2)
            return
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m27757(@Yue.InterfaceC4418 Yue.C0717 r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            Yue.C3329.m13906(r2, r0)
            r1.m27762(r2)
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m27758() {
            r1 = this;
            boolean r0 = r1.f24937
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m27759() {
            r4 = this;
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r4.f24932
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.previous()
            r3 = r1
            Yue.ۥۣۡۡۢ r3 = (Yue.AbstractC4607) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto La
            goto L20
        L1f:
            r1 = r2
        L20:
            Yue.ۥۣۡۡۢ r1 = (Yue.AbstractC4607) r1
            r4.f24933 = r2
            if (r1 == 0) goto L29
            r1.handleOnBackCancelled()
        L29:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m27760() {
            r4 = this;
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r4.f24932
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.previous()
            r3 = r1
            Yue.ۥۣۡۡۢ r3 = (Yue.AbstractC4607) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto La
            goto L20
        L1f:
            r1 = r2
        L20:
            Yue.ۥۣۡۡۢ r1 = (Yue.AbstractC4607) r1
            r4.f24933 = r2
            if (r1 == 0) goto L2a
            r1.handleOnBackPressed()
            return
        L2a:
            java.lang.Runnable r0 = r4.f24930
            if (r0 == 0) goto L31
            r0.run()
        L31:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m27761(Yue.C0717 r4) {
            r3 = this;
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r3.f24932
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            Yue.ۥۣۡۡۢ r2 = (Yue.AbstractC4607) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto La
            goto L1f
        L1e:
            r1 = 0
        L1f:
            Yue.ۥۣۡۡۢ r1 = (Yue.AbstractC4607) r1
            if (r1 == 0) goto L26
            r1.handleOnBackProgressed(r4)
        L26:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m27762(Yue.C0717 r4) {
            r3 = this;
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r0 = r3.f24932
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            Yue.ۥۣۡۡۢ r2 = (Yue.AbstractC4607) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto La
            goto L1f
        L1e:
            r1 = 0
        L1f:
            Yue.ۥۣۡۡۢ r1 = (Yue.AbstractC4607) r1
            r3.f24933 = r1
            if (r1 == 0) goto L28
            r1.handleOnBackStarted(r4)
        L28:
            return
    }

    @Yue.InterfaceC5336(33)
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m27763(@Yue.InterfaceC4418 android.window.OnBackInvokedDispatcher r2) {
            r1 = this;
            java.lang.String r0 = "invoker"
            Yue.C3329.m13906(r2, r0)
            r1.f24935 = r2
            boolean r2 = r1.f24937
            r1.m27764(r2)
            return
    }

    @Yue.InterfaceC5336(33)
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m27764(boolean r5) {
            r4 = this;
            android.window.OnBackInvokedDispatcher r0 = r4.f24935
            android.window.OnBackInvokedCallback r1 = r4.f24934
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            r2 = 0
            if (r5 == 0) goto L18
            boolean r3 = r4.f24936
            if (r3 != 0) goto L18
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠ r5 = androidx.activity.OnBackPressedDispatcher.C7242.f24947
            r5.m27771(r0, r2, r1)
            r5 = 1
            r4.f24936 = r5
            goto L25
        L18:
            if (r5 != 0) goto L25
            boolean r5 = r4.f24936
            if (r5 == 0) goto L25
            androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠ r5 = androidx.activity.OnBackPressedDispatcher.C7242.f24947
            r5.m27772(r0, r1)
            r4.f24936 = r2
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m27765() {
            r4 = this;
            boolean r0 = r4.f24937
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۡۢ> r1 = r4.f24932
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L10
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L10
            goto L27
        L10:
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥۣۡۡۢ r2 = (Yue.AbstractC4607) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L14
            r3 = 1
        L27:
            r4.f24937 = r3
            if (r3 == r0) goto L3f
            Yue.ۥ۟ۧ۠ۧ<java.lang.Boolean> r0 = r4.f24931
            if (r0 == 0) goto L36
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.accept(r1)
        L36:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L3f
            r4.m27764(r3)
        L3f:
            return
    }
}
