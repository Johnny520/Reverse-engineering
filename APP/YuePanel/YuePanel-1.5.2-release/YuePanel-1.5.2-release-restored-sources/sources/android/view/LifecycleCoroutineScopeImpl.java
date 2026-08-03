package android.view;

import Yue.AbstractC7690;
import Yue.C3617;
import Yue.C4423;
import Yue.C5499;
import Yue.C5508;
import Yue.C5555;
import Yue.C6411;
import Yue.C7149;
import Yue.C8107;
import Yue.InterfaceC4199;
import Yue.InterfaceC4225;
import Yue.InterfaceC4243;
import Yue.InterfaceC4313;
import Yue.InterfaceC5138;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.Lifecycle;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥ۟ۧۦۥ;", "coroutineContext", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/Lifecycle;LYue/ۥ۟ۧۦۥ;)V", "LYue/ۥۣۢ۠ۤ;", "register", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "LYue/ۥ۟ۧۦۥ;", "getCoroutineContext", "()LYue/ۥ۟ۧۦۥ;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {

    @InterfaceC6399
    private final InterfaceC4225 coroutineContext;

    @InterfaceC6399
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 */
    @InterfaceC4313(m1272c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m1273f = "Lifecycle.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LYue/ۥ۟ۧۧۥ;", "LYue/ۥۣۢ۠ۤ;", "<anonymous>", "(LYue/ۥ۟ۧۧۥ;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C17131 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17131(InterfaceC4199<? super C17131> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C17131 c17131 = LifecycleCoroutineScopeImpl.this.new C17131(interfaceC4199);
            c17131.L$0 = obj;
            return c17131;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C17131) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            InterfaceC4243 interfaceC4243 = (InterfaceC4243) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle().getState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                C5555.m17221(interfaceC4243.getCoroutineContext(), null, 1, null);
            }
            return C8107.f3222;
        }
    }

    public LifecycleCoroutineScopeImpl(@InterfaceC6399 Lifecycle lifecycle, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C5499.m17103(lifecycle, "lifecycle");
        C5499.m17103(interfaceC4225, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = interfaceC4225;
        if (getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            C5555.m17221(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // Yue.InterfaceC4243
    @InterfaceC6399
    public InterfaceC4225 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // android.view.LifecycleCoroutineScope
    @InterfaceC6399
    /* JADX INFO: renamed from: getLifecycle$lifecycle_common, reason: from getter */
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
        C5499.m17103(source, "source");
        C5499.m17103(event, C6411.f16276);
        if (getLifecycle().getState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle().removeObserver(this);
            C5555.m17221(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        C3617.m9760(this, C4423.m12872().mo16040(), null, new C17131(null), 2, null);
    }
}
