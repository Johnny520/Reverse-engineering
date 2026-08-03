package android.view;

import Yue.C5499;
import Yue.InterfaceC5542;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import android.view.Lifecycle;
import android.view.LifecycleController;
import android.view.LifecycleOwner;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "LYue/ۥ۠ۦ۟ۡ;", "parentJob", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;LYue/ۥ۠ۦ۟ۡ;)V", "LYue/ۥۣۢ۠ۤ;", "handleDestroy", "(LYue/ۥ۠ۦ۟ۡ;)V", "finish", "()V", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/DispatchQueue;", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@InterfaceC5922
public final class LifecycleController {

    @InterfaceC6399
    private final DispatchQueue dispatchQueue;

    @InterfaceC6399
    private final Lifecycle lifecycle;

    @InterfaceC6399
    private final Lifecycle.State minState;

    @InterfaceC6399
    private final LifecycleEventObserver observer;

    public LifecycleController(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 Lifecycle.State state, @InterfaceC6399 DispatchQueue dispatchQueue, @InterfaceC6399 final InterfaceC5542 interfaceC5542) {
        C5499.m17103(lifecycle, "lifecycle");
        C5499.m17103(state, "minState");
        C5499.m17103(dispatchQueue, "dispatchQueue");
        C5499.m17103(interfaceC5542, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: Yue.ۥ۠ۧ۟ۧ
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f14024, interfaceC5542, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            InterfaceC5542.C0790.m2276(interfaceC5542, null, 1, null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC5542 parentJob) {
        InterfaceC5542.C0790.m2276(parentJob, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, InterfaceC5542 interfaceC5542, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C5499.m17103(lifecycleController, "this$0");
        C5499.m17103(interfaceC5542, "$parentJob");
        C5499.m17103(lifecycleOwner, "source");
        C5499.m17103(event, "<anonymous parameter 1>");
        if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            InterfaceC5542.C0790.m2276(interfaceC5542, null, 1, null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    @InterfaceC5922
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
