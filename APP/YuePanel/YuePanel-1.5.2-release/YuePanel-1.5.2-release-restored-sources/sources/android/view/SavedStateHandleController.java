package android.view;

import Yue.C5499;
import Yue.C6411;
import Yue.C6659;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import android.view.Lifecycle;
import androidx.savedstate.C1794;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "", C6659.f17103, "Landroidx/lifecycle/SavedStateHandle;", "handle", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "Landroidx/savedstate/ۥ;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥۣۢ۠ۤ;", "attachToLifecycle", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "<set-?>", "isAttached", "Z", "()Z", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandleController implements LifecycleEventObserver {

    @InterfaceC6399
    private final SavedStateHandle handle;
    private boolean isAttached;

    @InterfaceC6399
    private final String key;

    public SavedStateHandleController(@InterfaceC6399 String str, @InterfaceC6399 SavedStateHandle savedStateHandle) {
        C5499.m17103(str, C6659.f17103);
        C5499.m17103(savedStateHandle, "handle");
        this.key = str;
        this.handle = savedStateHandle;
    }

    public final void attachToLifecycle(@InterfaceC6399 C1794 registry, @InterfaceC6399 Lifecycle lifecycle) {
        C5499.m17103(registry, "registry");
        C5499.m17103(lifecycle, "lifecycle");
        if (!(!this.isAttached)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.isAttached = true;
        lifecycle.addObserver(this);
        registry.m30806(this.key, this.handle.getSavedStateProvider());
    }

    @InterfaceC6399
    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
        C5499.m17103(source, "source");
        C5499.m17103(event, C6411.f16276);
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().removeObserver(this);
        }
    }
}
