package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥ۟ۧۦۥ;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;LYue/ۥ۟ۧۦۥ;)V", "LYue/ۥۣۢ۠ۤ;", "register", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "LYue/ۥ۟ۧۦۥ;", "getCoroutineContext", "()LYue/ۥ۟ۧۦۥ;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class LifecycleCoroutineScopeImpl extends androidx.lifecycle.LifecycleCoroutineScope implements androidx.lifecycle.LifecycleEventObserver {

    @Yue.InterfaceC4418
    private final Yue.InterfaceC1632 coroutineContext;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    @Yue.InterfaceC1744(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl this$0;

        public AnonymousClass1(androidx.lifecycle.LifecycleCoroutineScopeImpl r1, Yue.InterfaceC1598<? super androidx.lifecycle.LifecycleCoroutineScopeImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
                androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r1 = (androidx.lifecycle.LifecycleCoroutineScopeImpl.AnonymousClass1) r1
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
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r3) {
                r2 = this;
                Yue.C3341.m13947()
                int r0 = r2.label
                if (r0 != 0) goto L38
                Yue.C5391.m20403(r3)
                java.lang.Object r3 = r2.L$0
                Yue.ۥ۟ۧۧۥ r3 = (Yue.InterfaceC1662) r3
                androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle$lifecycle_common()
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L2c
                androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = r2.this$0
                androidx.lifecycle.Lifecycle r3 = r3.getLifecycle$lifecycle_common()
                androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
                r3.addObserver(r0)
                goto L35
            L2c:
                Yue.ۥ۟ۧۦۥ r3 = r3.getCoroutineContext()
                r0 = 1
                r1 = 0
                Yue.C3399.m14028(r3, r1, r0, r1)
            L35:
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                return r3
            L38:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    public LifecycleCoroutineScopeImpl(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "coroutineContext"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.coroutineContext = r3
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r2 != r3) goto L26
            Yue.ۥ۟ۧۦۥ r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            Yue.C3399.m14028(r2, r0, r3, r0)
        L26:
            return
    }

    @Override // Yue.InterfaceC1662
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getCoroutineContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.coroutineContext
            return r0
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    @Yue.InterfaceC4418
    public androidx.lifecycle.Lifecycle getLifecycle$lifecycle_common() {
            r1 = this;
            androidx.lifecycle.Lifecycle r0 = r1.lifecycle
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "event"
            Yue.C3329.m13906(r3, r2)
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L2a
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            r2.removeObserver(r1)
            Yue.ۥ۟ۧۦۥ r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            Yue.C3399.m14028(r2, r0, r3, r0)
        L2a:
            return
    }

    public final void register() {
            r7 = this;
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            Yue.ۥ۠ۨۥۥ r2 = r0.mo12588()
            androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r4 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
            return
    }
}
