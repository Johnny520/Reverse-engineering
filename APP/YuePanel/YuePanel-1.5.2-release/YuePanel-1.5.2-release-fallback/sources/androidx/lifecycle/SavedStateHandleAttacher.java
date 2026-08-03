package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/SavedStateHandlesProvider;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandleAttacher implements androidx.lifecycle.LifecycleEventObserver {

    @Yue.InterfaceC4418
    private final androidx.lifecycle.SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@Yue.InterfaceC4418 androidx.lifecycle.SavedStateHandlesProvider r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.provider = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L1b
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            androidx.lifecycle.SavedStateHandlesProvider r2 = r1.provider
            r2.performRestore()
            return
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Next event must be ON_CREATE, it was "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
