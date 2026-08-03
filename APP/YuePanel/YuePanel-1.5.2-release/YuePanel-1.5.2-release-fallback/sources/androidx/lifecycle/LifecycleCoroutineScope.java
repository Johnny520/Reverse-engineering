package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\r\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ;\u0010\u000e\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "LYue/ۥ۟ۧۧۥ;", "<init>", "()V", "Lkotlin/Function2;", "LYue/ۥ۟ۧۤۢ;", "LYue/ۥۣۢ۠ۤ;", "", "LYue/ۥ۠ۡۥۧ;", "block", "LYue/ۥ۠ۦ۟ۡ;", "launchWhenCreated", "(LYue/ۥۣ۠ۢۢ;)LYue/ۥ۠ۦ۟ۡ;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public abstract class LifecycleCoroutineScope implements Yue.InterfaceC1662 {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    @Yue.InterfaceC1744(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {
        final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> $block;
        int label;
        final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScope this$0;

        public AnonymousClass1(androidx.lifecycle.LifecycleCoroutineScope r1, Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super androidx.lifecycle.LifecycleCoroutineScope.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$block = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 r3 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1
                androidx.lifecycle.LifecycleCoroutineScope r0 = r2.this$0
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.$block
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 r1 = (androidx.lifecycle.LifecycleCoroutineScope.AnonymousClass1) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L2b
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                androidx.lifecycle.LifecycleCoroutineScope r4 = r3.this$0
                androidx.lifecycle.Lifecycle r4 = r4.getLifecycle$lifecycle_common()
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r3.$block
                r3.label = r2
                java.lang.Object r4 = androidx.lifecycle.PausingDispatcherKt.whenCreated(r4, r1, r3)
                if (r4 != r0) goto L2b
                return r0
            L2b:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC1744(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C78971 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {
        final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> $block;
        int label;
        final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScope this$0;

        public C78971(androidx.lifecycle.LifecycleCoroutineScope r1, Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super androidx.lifecycle.LifecycleCoroutineScope.C78971> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$block = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r3 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1
                androidx.lifecycle.LifecycleCoroutineScope r0 = r2.this$0
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.$block
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r1 = (androidx.lifecycle.LifecycleCoroutineScope.C78971) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L2b
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                androidx.lifecycle.LifecycleCoroutineScope r4 = r3.this$0
                androidx.lifecycle.Lifecycle r4 = r4.getLifecycle$lifecycle_common()
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r3.$block
                r3.label = r2
                java.lang.Object r4 = androidx.lifecycle.PausingDispatcherKt.whenResumed(r4, r1, r3)
                if (r4 != r0) goto L2b
                return r0
            L2b:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC1744(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C78981 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {
        final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> $block;
        int label;
        final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScope this$0;

        public C78981(androidx.lifecycle.LifecycleCoroutineScope r1, Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super androidx.lifecycle.LifecycleCoroutineScope.C78981> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$block = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 r3 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1
                androidx.lifecycle.LifecycleCoroutineScope r0 = r2.this$0
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.$block
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 r1 = (androidx.lifecycle.LifecycleCoroutineScope.C78981) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L2b
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                androidx.lifecycle.LifecycleCoroutineScope r4 = r3.this$0
                androidx.lifecycle.Lifecycle r4 = r4.getLifecycle$lifecycle_common()
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r3.$block
                r3.label = r2
                java.lang.Object r4 = androidx.lifecycle.PausingDispatcherKt.whenStarted(r4, r1, r3)
                if (r4 != r0) goto L2b
                return r0
            L2b:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }
    }

    public LifecycleCoroutineScope() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public abstract androidx.lifecycle.Lifecycle getLifecycle$lifecycle_common();

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final Yue.InterfaceC3383 launchWhenCreated(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            Yue.ۥ۠ۦ۟ۡ r8 = Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final Yue.InterfaceC3383 launchWhenResumed(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            Yue.ۥ۠ۦ۟ۡ r8 = Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final Yue.InterfaceC3383 launchWhenStarted(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            Yue.ۥ۠ۦ۟ۡ r8 = Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
