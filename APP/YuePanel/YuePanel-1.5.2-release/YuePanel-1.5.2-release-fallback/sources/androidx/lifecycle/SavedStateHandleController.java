package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "key", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "Landroidx/savedstate/ۥ;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥۣۢ۠ۤ;", "attachToLifecycle", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "<set-?>", "isAttached", "Z", "()Z", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {

    @Yue.InterfaceC4418
    private final androidx.lifecycle.SavedStateHandle handle;
    private boolean isAttached;

    @Yue.InterfaceC4418
    private final java.lang.String key;

    public SavedStateHandleController(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "handle"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.key = r2
            r1.handle = r3
            return
    }

    public final void attachToLifecycle(@Yue.InterfaceC4418 androidx.savedstate.C7816 r3, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            java.lang.String r0 = "registry"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r2.isAttached
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L21
            r2.isAttached = r1
            r4.addObserver(r2)
            java.lang.String r4 = r2.key
            androidx.lifecycle.SavedStateHandle r0 = r2.handle
            androidx.savedstate.ۥ$ۥ۟۟ r0 = r0.savedStateProvider()
            r3.m30366(r4, r0)
            return
        L21:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached to lifecycleOwner"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    public final androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.handle
            return r0
    }

    public final boolean isAttached() {
            r1 = this;
            boolean r0 = r1.isAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r0) goto L18
            r3 = 0
            r1.isAttached = r3
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
        L18:
            return
    }
}
