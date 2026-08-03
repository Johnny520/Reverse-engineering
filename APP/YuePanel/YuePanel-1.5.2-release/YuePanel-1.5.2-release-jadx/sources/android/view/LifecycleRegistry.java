package android.view;

import Yue.C3375;
import Yue.C4335;
import Yue.C4791;
import Yue.C5499;
import Yue.C6411;
import Yue.C7209;
import Yue.InterfaceC4372;
import Yue.InterfaceC5578;
import Yue.InterfaceC5922;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC8392;
import android.annotation.SuppressLint;
import android.view.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R&\u00105\u001a\u0012\u0012\u0004\u0012\u00020\t03j\b\u0012\u0004\u0012\u00020\t`48\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010<\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\rR\u0014\u0010?\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleOwner;", "provider", "", "enforceMainThread", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "next", "LYue/ۥۣۢ۠ۤ;", "moveToState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "calculateTargetState", "(Landroidx/lifecycle/LifecycleObserver;)Landroidx/lifecycle/Lifecycle$State;", "popParentState", "()V", "state", "pushParentState", "lifecycleOwner", "forwardPass", "backwardPass", "sync", "", "methodName", "enforceMainThreadIfNeeded", "(Ljava/lang/String;)V", "markState", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "Z", "LYue/ۥ۠ۡۦۦ;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "observerMap", "LYue/ۥ۠ۡۦۦ;", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "addingObserverCounter", "I", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentStates", "Ljava/util/ArrayList;", "isSynced", "()Z", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "currentState", "getObserverCount", "()I", "observerCount", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
public class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;

    @InterfaceC6399
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;

    @InterfaceC6399
    private C4791<LifecycleObserver, ObserverWithState> observerMap;

    @InterfaceC6399
    private ArrayList<Lifecycle.State> parentStates;

    @InterfaceC6399
    private Lifecycle.State state;

    @InterfaceC6211(m2698d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, m2699d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.LifecycleRegistry.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC8392
        @InterfaceC5578
        public final LifecycleRegistry createUnsafe(@InterfaceC6399 LifecycleOwner lifecycleOwner) {
            C5499.m17103(lifecycleOwner, "owner");
            return new LifecycleRegistry(lifecycleOwner, false, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final Lifecycle.State min$lifecycle_runtime_release(@InterfaceC6399 Lifecycle.State state, @InterfaceC6489 Lifecycle.State state2) {
            C5499.m17103(state, "state1");
            return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "LYue/ۥۣۢ۠ۤ;", "dispatchEvent", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "state", "Landroidx/lifecycle/Lifecycle$State;", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class ObserverWithState {

        @InterfaceC6399
        private LifecycleEventObserver lifecycleObserver;

        @InterfaceC6399
        private Lifecycle.State state;

        public ObserverWithState(@InterfaceC6489 LifecycleObserver lifecycleObserver, @InterfaceC6399 Lifecycle.State state) {
            C5499.m17103(state, "initialState");
            C5499.m17100(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = state;
        }

        public final void dispatchEvent(@InterfaceC6489 LifecycleOwner owner, @InterfaceC6399 Lifecycle.Event event) {
            C5499.m17103(event, C6411.f16276);
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.INSTANCE.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            C5499.m17100(owner);
            lifecycleEventObserver.onStateChanged(owner, event);
            this.state = targetState;
        }

        @InterfaceC6399
        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        @InterfaceC6399
        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(@InterfaceC6399 LifecycleEventObserver lifecycleEventObserver) {
            C5499.m17103(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(@InterfaceC6399 Lifecycle.State state) {
            C5499.m17103(state, "<set-?>");
            this.state = state;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.lifecycle.LifecycleOwner), (r2v0 boolean) A[MD:(androidx.lifecycle.LifecycleOwner, boolean):void (m)] (LINE:1) call: androidx.lifecycle.LifecycleRegistry.<init>(androidx.lifecycle.LifecycleOwner, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z, C4335 c4335) {
        this(lifecycleOwner, z);
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> itDescendingIterator = this.observerMap.descendingIterator();
        C5499.m17102(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<LifecycleObserver, ObserverWithState> next = itDescendingIterator.next();
            C5499.m17102(next, "next()");
            LifecycleObserver key = next.getKey();
            ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event eventDownFrom = Lifecycle.Event.Companion.downFrom(value.getState());
                if (eventDownFrom == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                pushParentState(eventDownFrom.getTargetState());
                value.dispatchEvent(lifecycleOwner, eventDownFrom);
                popParentState();
            }
        }
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver observer) {
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> entryM14469 = this.observerMap.m14469(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryM14469 == null || (value = entryM14469.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            state = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state2), state);
    }

    @InterfaceC6399
    @InterfaceC8392
    @InterfaceC5578
    public static final LifecycleRegistry createUnsafe(@InterfaceC6399 LifecycleOwner lifecycleOwner) {
        return INSTANCE.createUnsafe(lifecycleOwner);
    }

    @SuppressLint({"RestrictedApi"})
    private final void enforceMainThreadIfNeeded(String methodName) {
        if (!this.enforceMainThread || C3375.m6925().mo6929()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        C7209<LifecycleObserver, ObserverWithState>.C7211 c7211M22586 = this.observerMap.m22586();
        C5499.m17102(c7211M22586, "observerMap.iteratorWithAdditions()");
        while (c7211M22586.hasNext() && !this.newEventOccurred) {
            Map.Entry next = c7211M22586.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) next.getKey();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
            }
        }
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<LifecycleObserver, ObserverWithState> entryM3502 = this.observerMap.m3502();
        C5499.m17100(entryM3502);
        Lifecycle.State state = entryM3502.getValue().getState();
        Map.Entry<LifecycleObserver, ObserverWithState> entryM22587 = this.observerMap.m22587();
        C5499.m17100(entryM22587);
        Lifecycle.State state2 = entryM22587.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void moveToState(Lifecycle.State next) {
        Lifecycle.State state = this.state;
        if (state == next) {
            return;
        }
        if (state == Lifecycle.State.INITIALIZED && next == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new C4791<>();
        }
    }

    private final void popParentState() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<LifecycleObserver, ObserverWithState> entryM3502 = this.observerMap.m3502();
            C5499.m17100(entryM3502);
            if (state.compareTo(entryM3502.getValue().getState()) < 0) {
                backwardPass(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, ObserverWithState> entryM22587 = this.observerMap.m22587();
            if (!this.newEventOccurred && entryM22587 != null && this.state.compareTo(entryM22587.getValue().getState()) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
    }

    @Override // android.view.Lifecycle
    public void addObserver(@InterfaceC6399 LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        C5499.m17103(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (this.observerMap.mo14467(observer, observerWithState) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateCalculateTargetState = calculateTargetState(observer);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.contains(observer)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
                stateCalculateTargetState = calculateTargetState(observer);
            }
            if (!z) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // android.view.Lifecycle
    @InterfaceC6399
    /* JADX INFO: renamed from: getCurrentState, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    public void handleLifecycleEvent(@InterfaceC6399 Lifecycle.Event event) {
        C5499.m17103(event, C6411.f16276);
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @InterfaceC4372(message = "Override [currentState].")
    @InterfaceC5922
    public void markState(@InterfaceC6399 Lifecycle.State state) {
        C5499.m17103(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // android.view.Lifecycle
    public void removeObserver(@InterfaceC6399 LifecycleObserver observer) {
        C5499.m17103(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.mo14468(observer);
    }

    public void setCurrentState(@InterfaceC6399 Lifecycle.State state) {
        C5499.m17103(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new C4791<>();
        this.state = Lifecycle.State.INITIALIZED;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(@InterfaceC6399 LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
        C5499.m17103(lifecycleOwner, "provider");
    }
}
