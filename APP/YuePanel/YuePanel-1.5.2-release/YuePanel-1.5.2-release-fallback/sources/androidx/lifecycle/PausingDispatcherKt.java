package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u001aN\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "LYue/ۥ۟ۧۧۥ;", "LYue/ۥ۟ۧۤۢ;", "", "LYue/ۥ۠ۡۥۧ;", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @Yue.InterfaceC1744(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LYue/ۥ۟ۧۧۥ;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super T>, java.lang.Object> {
        final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super T>, java.lang.Object> $block;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State $minState;
        final /* synthetic */ androidx.lifecycle.Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public AnonymousClass2(androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r3, Yue.InterfaceC1598<? super androidx.lifecycle.PausingDispatcherKt.AnonymousClass2> r4) {
                r0 = this;
                r0.$this_whenStateAtLeast = r1
                r0.$minState = r2
                r0.$block = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r6) {
                r4 = this;
                androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r0 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
                androidx.lifecycle.Lifecycle r1 = r4.$this_whenStateAtLeast
                androidx.lifecycle.Lifecycle$State r2 = r4.$minState
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super T>, java.lang.Object> r3 = r4.$block
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Yue.InterfaceC4543
        public final java.lang.Object invoke(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super T> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r1 = (androidx.lifecycle.PausingDispatcherKt.AnonymousClass2) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, java.lang.Object r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.L$0
                androidx.lifecycle.LifecycleController r0 = (androidx.lifecycle.LifecycleController) r0
                Yue.C5391.m20403(r8)     // Catch: java.lang.Throwable -> L13
                goto L50
            L13:
                r8 = move-exception
                goto L56
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                Yue.C5391.m20403(r8)
                java.lang.Object r8 = r7.L$0
                Yue.ۥ۟ۧۧۥ r8 = (Yue.InterfaceC1662) r8
                Yue.ۥ۟ۧۦۥ r8 = r8.getCoroutineContext()
                Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
                Yue.ۥ۟ۧۦۥ$ۥ۟ r8 = r8.get(r1)
                Yue.ۥ۠ۦ۟ۡ r8 = (Yue.InterfaceC3383) r8
                if (r8 == 0) goto L5a
                androidx.lifecycle.PausingDispatcher r1 = new androidx.lifecycle.PausingDispatcher
                r1.<init>()
                androidx.lifecycle.LifecycleController r3 = new androidx.lifecycle.LifecycleController
                androidx.lifecycle.Lifecycle r4 = r7.$this_whenStateAtLeast
                androidx.lifecycle.Lifecycle$State r5 = r7.$minState
                androidx.lifecycle.DispatchQueue r6 = r1.dispatchQueue
                r3.<init>(r4, r5, r6, r8)
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۤۢ<? super T>, java.lang.Object> r8 = r7.$block     // Catch: java.lang.Throwable -> L54
                r7.L$0 = r3     // Catch: java.lang.Throwable -> L54
                r7.label = r2     // Catch: java.lang.Throwable -> L54
                java.lang.Object r8 = Yue.C0862.m4974(r1, r8, r7)     // Catch: java.lang.Throwable -> L54
                if (r8 != r0) goto L4f
                return r0
            L4f:
                r0 = r3
            L50:
                r0.finish()
                return r8
            L54:
                r8 = move-exception
                r0 = r3
            L56:
                r0.finish()
                throw r8
            L5a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "when[State] methods should have a parent job"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }
    }

    @Yue.InterfaceC1816(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenCreated(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @Yue.InterfaceC1816(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenCreated(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenCreated(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC1816(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenResumed(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @Yue.InterfaceC1816(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenResumed(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenResumed(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC1816(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenStarted(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @Yue.InterfaceC1816(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenStarted(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenStarted(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC1816(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Yue.InterfaceC4543
    public static final <T> java.lang.Object whenStateAtLeast(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r3, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r6) {
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            Yue.ۥ۠ۨۥۥ r0 = r0.mo12588()
            androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r1 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
            r2 = 0
            r1.<init>(r3, r4, r5, r2)
            java.lang.Object r3 = Yue.C0862.m4974(r0, r1, r6)
            return r3
    }
}
