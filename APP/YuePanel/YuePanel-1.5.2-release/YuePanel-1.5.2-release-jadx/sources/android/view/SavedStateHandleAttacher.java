package android.view;

import Yue.C5499;
import Yue.C6411;
import Yue.InterfaceC6399;
import android.view.Lifecycle;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/SavedStateHandlesProvider;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    @InterfaceC6399
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@InterfaceC6399 SavedStateHandlesProvider savedStateHandlesProvider) {
        C5499.m17103(savedStateHandlesProvider, "provider");
        this.provider = savedStateHandlesProvider;
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
        C5499.m17103(source, "source");
        C5499.m17103(event, C6411.f16276);
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
