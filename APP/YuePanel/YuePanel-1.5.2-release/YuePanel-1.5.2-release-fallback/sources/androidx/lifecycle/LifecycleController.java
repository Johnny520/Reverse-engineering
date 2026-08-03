package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "LYue/ۥ۠ۦ۟ۡ;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;LYue/ۥ۠ۦ۟ۡ;)V", "LYue/ۥۣۢ۠ۤ;", "handleDestroy", "(LYue/ۥ۠ۦ۟ۡ;)V", "finish", "()V", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/DispatchQueue;", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@Yue.InterfaceC3875
public final class LifecycleController {

    @Yue.InterfaceC4418
    private final androidx.lifecycle.DispatchQueue dispatchQueue;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.Lifecycle lifecycle;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.Lifecycle.State minState;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.LifecycleEventObserver observer;

    public LifecycleController(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r3, @Yue.InterfaceC4418 androidx.lifecycle.DispatchQueue r4, @Yue.InterfaceC4418 Yue.InterfaceC3383 r5) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "minState"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "dispatchQueue"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "parentJob"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.minState = r3
            r1.dispatchQueue = r4
            Yue.ۥ۠ۧ۟ۧ r3 = new Yue.ۥ۠ۧ۟ۧ
            r3.<init>(r1, r5)
            r1.observer = r3
            androidx.lifecycle.Lifecycle$State r4 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L35
            r2 = 1
            r3 = 0
            Yue.InterfaceC3383.C3384.m13988(r5, r3, r2, r3)
            r1.finish()
            goto L38
        L35:
            r2.addObserver(r3)
        L38:
            return
    }

    private final void handleDestroy(Yue.InterfaceC3383 r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            Yue.InterfaceC3383.C3384.m13988(r3, r0, r1, r0)
            r2.finish()
            return
    }

    private static final void observer$lambda$0(androidx.lifecycle.LifecycleController r1, Yue.InterfaceC3383 r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$parentJob"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "<anonymous parameter 1>"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.Lifecycle r4 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r4 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L29
            r3 = 1
            r4 = 0
            Yue.InterfaceC3383.C3384.m13988(r2, r4, r3, r4)
            r1.finish()
            goto L44
        L29:
            androidx.lifecycle.Lifecycle r2 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = r1.minState
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L3f
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.pause()
            goto L44
        L3f:
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.resume()
        L44:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29515(androidx.lifecycle.LifecycleController r0, Yue.InterfaceC3383 r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            observer$lambda$0(r0, r1, r2, r3)
            return
    }

    @Yue.InterfaceC3875
    public final void finish() {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            androidx.lifecycle.LifecycleEventObserver r1 = r2.observer
            r0.removeObserver(r1)
            androidx.lifecycle.DispatchQueue r0 = r2.dispatchQueue
            r0.finish()
            return
    }
}
