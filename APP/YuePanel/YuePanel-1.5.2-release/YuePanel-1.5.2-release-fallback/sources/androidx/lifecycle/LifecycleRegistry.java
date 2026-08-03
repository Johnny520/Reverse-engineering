package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R&\u00105\u001a\u0012\u0012\u0004\u0012\u00020\t03j\b\u0012\u0004\u0012\u00020\t`48\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010<\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\rR\u0014\u0010?\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleOwner;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "next", "LYue/ۥۣۢ۠ۤ;", "moveToState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "calculateTargetState", "(Landroidx/lifecycle/LifecycleObserver;)Landroidx/lifecycle/Lifecycle$State;", "popParentState", "()V", "state", "pushParentState", "lifecycleOwner", "forwardPass", "backwardPass", "sync", "", "methodName", "enforceMainThreadIfNeeded", "(Ljava/lang/String;)V", "markState", "Landroidx/lifecycle/Lifecycle$Event;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "Z", "LYue/ۥ۠ۡۦۦ;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "observerMap", "LYue/ۥ۠ۡۦۦ;", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "addingObserverCounter", "I", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentStates", "Ljava/util/ArrayList;", "isSynced", "()Z", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "currentState", "getObserverCount", "()I", "observerCount", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.LifecycleRegistry.Companion Companion = null;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;

    @Yue.InterfaceC4418
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;

    @Yue.InterfaceC4418
    private Yue.C2335<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> observerMap;

    @Yue.InterfaceC4418
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> parentStates;

    @Yue.InterfaceC4418
    private androidx.lifecycle.Lifecycle.State state;

    @Yue.InterfaceC4201(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC6959
        @Yue.InterfaceC3427
        public final androidx.lifecycle.LifecycleRegistry createUnsafe(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r4) {
                r3 = this;
                java.lang.String r0 = "owner"
                Yue.C3329.m13906(r4, r0)
                androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
                r1 = 0
                r2 = 0
                r0.<init>(r4, r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r2, @Yue.InterfaceC4543 androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "state1"
                Yue.C3329.m13906(r2, r0)
                if (r3 == 0) goto Le
                int r0 = r3.compareTo(r2)
                if (r0 >= 0) goto Le
                r2 = r3
            Le:
                return r2
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", "event", "LYue/ۥۣۢ۠ۤ;", "dispatchEvent", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "state", "Landroidx/lifecycle/Lifecycle$State;", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class ObserverWithState {

        @Yue.InterfaceC4418
        private androidx.lifecycle.LifecycleEventObserver lifecycleObserver;

        @Yue.InterfaceC4418
        private androidx.lifecycle.Lifecycle.State state;

        public ObserverWithState(@Yue.InterfaceC4543 androidx.lifecycle.LifecycleObserver r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "initialState"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                Yue.C3329.m13903(r2)
                androidx.lifecycle.LifecycleEventObserver r2 = androidx.lifecycle.Lifecycling.lifecycleEventObserver(r2)
                r1.lifecycleObserver = r2
                r1.state = r3
                return
        }

        public final void dispatchEvent(@Yue.InterfaceC4543 androidx.lifecycle.LifecycleOwner r4, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r5) {
                r3 = this;
                java.lang.String r0 = "event"
                Yue.C3329.m13906(r5, r0)
                androidx.lifecycle.Lifecycle$State r0 = r5.getTargetState()
                androidx.lifecycle.LifecycleRegistry$Companion r1 = androidx.lifecycle.LifecycleRegistry.Companion
                androidx.lifecycle.Lifecycle$State r2 = r3.state
                androidx.lifecycle.Lifecycle$State r1 = r1.min$lifecycle_runtime_release(r2, r0)
                r3.state = r1
                androidx.lifecycle.LifecycleEventObserver r1 = r3.lifecycleObserver
                Yue.C3329.m13903(r4)
                r1.onStateChanged(r4, r5)
                r3.state = r0
                return
        }

        @Yue.InterfaceC4418
        public final androidx.lifecycle.LifecycleEventObserver getLifecycleObserver() {
                r1 = this;
                androidx.lifecycle.LifecycleEventObserver r0 = r1.lifecycleObserver
                return r0
        }

        @Yue.InterfaceC4418
        public final androidx.lifecycle.Lifecycle.State getState() {
                r1 = this;
                androidx.lifecycle.Lifecycle$State r0 = r1.state
                return r0
        }

        public final void setLifecycleObserver(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                Yue.C3329.m13906(r2, r0)
                r1.lifecycleObserver = r2
                return
        }

        public final void setState(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                Yue.C3329.m13906(r2, r0)
                r1.state = r2
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = new androidx.lifecycle.LifecycleRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleRegistry.Companion = r0
            return
    }

    public LifecycleRegistry(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.enforceMainThread = r2
            Yue.ۥ۠ۡۦۦ r2 = new Yue.ۥ۠ۡۦۦ
            r2.<init>()
            r0.observerMap = r2
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r0.state = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.parentStates = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.lifecycleOwner = r2
            return
    }

    public /* synthetic */ LifecycleRegistry(androidx.lifecycle.LifecycleOwner r1, boolean r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final void backwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.observerMap
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.String r1 = "observerMap.descendingIterator()"
            Yue.C3329.m13905(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            boolean r1 = r5.newEventOccurred
            if (r1 != 0) goto L79
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "next()"
            Yue.C3329.m13905(r1, r2)
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L2c:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r5.state
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto Lb
            boolean r3 = r5.newEventOccurred
            if (r3 != 0) goto Lb
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Lb
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.downFrom(r4)
            if (r3 == 0) goto L5e
            androidx.lifecycle.Lifecycle$State r4 = r3.getTargetState()
            r5.pushParentState(r4)
            r1.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L2c
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "no event down from "
            r0.append(r2)
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L79:
            return
    }

    private final androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver r4) {
            r3 = this;
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            java.util.Map$Entry r4 = r0.m10713(r4)
            r0 = 0
            if (r4 == 0) goto L16
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r4 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r4
            if (r4 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r4 = r4.getState()
            goto L17
        L16:
            r4 = r0
        L17:
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r3.parentStates
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L2f
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r3.parentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
        L2f:
            androidx.lifecycle.LifecycleRegistry$Companion r1 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r2 = r3.state
            androidx.lifecycle.Lifecycle$State r4 = r1.min$lifecycle_runtime_release(r2, r4)
            androidx.lifecycle.Lifecycle$State r4 = r1.min$lifecycle_runtime_release(r4, r0)
            return r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6959
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.LifecycleRegistry createUnsafe(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r1) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.LifecycleRegistry r1 = r0.createUnsafe(r1)
            return r1
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    private final void enforceMainThreadIfNeeded(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.enforceMainThread
            if (r0 == 0) goto L2f
            Yue.ۥ۟ۡۦۤ r0 = Yue.C0551.m1942()
            boolean r0 = r0.mo1947()
            if (r0 == 0) goto Lf
            goto L2f
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be called on the main thread"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            return
    }

    private final void forwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.observerMap
            Yue.ۥۡۧۢۥ$ۥ۟۟۟ r0 = r0.m20627()
            java.lang.String r1 = "observerMap.iteratorWithAdditions()"
            Yue.C3329.m13905(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            boolean r1 = r5.newEventOccurred
            if (r1 != 0) goto L74
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L27:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r5.state
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto Lb
            boolean r3 = r5.newEventOccurred
            if (r3 != 0) goto Lb
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Lb
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            r5.pushParentState(r3)
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.upFrom(r4)
            if (r3 == 0) goto L59
            r1.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L27
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "no event up from "
            r0.append(r2)
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L74:
            return
    }

    private final boolean isSynced() {
            r3 = this;
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            java.util.Map$Entry r0 = r0.m20626()
            Yue.C3329.m13903(r0)
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            androidx.lifecycle.Lifecycle$State r0 = r0.getState()
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.observerMap
            java.util.Map$Entry r2 = r2.m20628()
            Yue.C3329.m13903(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            if (r0 != r2) goto L37
            androidx.lifecycle.Lifecycle$State r0 = r3.state
            if (r0 != r2) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r1, @Yue.InterfaceC4543 androidx.lifecycle.Lifecycle.State r2) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r1 = r0.min$lifecycle_runtime_release(r1, r2)
            return r1
    }

    private final void moveToState(androidx.lifecycle.Lifecycle.State r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.state
            if (r0 != r3) goto L5
            return
        L5:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 != r1) goto L39
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r3 == r0) goto Le
            goto L39
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "no event down from "
            r3.append(r0)
            androidx.lifecycle.Lifecycle$State r0 = r2.state
            r3.append(r0)
            java.lang.String r0 = " in component "
            r3.append(r0)
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r2.lifecycleOwner
            java.lang.Object r0 = r0.get()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L39:
            r2.state = r3
            boolean r3 = r2.handlingEvent
            r0 = 1
            if (r3 != 0) goto L5b
            int r3 = r2.addingObserverCounter
            if (r3 == 0) goto L45
            goto L5b
        L45:
            r2.handlingEvent = r0
            r2.sync()
            r3 = 0
            r2.handlingEvent = r3
            androidx.lifecycle.Lifecycle$State r3 = r2.state
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r3 != r0) goto L5a
            Yue.ۥ۠ۡۦۦ r3 = new Yue.ۥ۠ۡۦۦ
            r3.<init>()
            r2.observerMap = r3
        L5a:
            return
        L5b:
            r2.newEventOccurred = r0
            return
    }

    private final void popParentState() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.parentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    private final void pushParentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r1.parentStates
            r0.add(r2)
            return
    }

    private final void sync() {
            r3 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r3.lifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L56
        La:
            boolean r1 = r3.isSynced()
            r2 = 0
            if (r1 != 0) goto L53
            r3.newEventOccurred = r2
            androidx.lifecycle.Lifecycle$State r1 = r3.state
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.observerMap
            java.util.Map$Entry r2 = r2.m20626()
            Yue.C3329.m13903(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L31
            r3.backwardPass(r0)
        L31:
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r3.observerMap
            java.util.Map$Entry r1 = r1.m20628()
            boolean r2 = r3.newEventOccurred
            if (r2 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.Lifecycle$State r2 = r3.state
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto La
            r3.forwardPass(r0)
            goto La
        L53:
            r3.newEventOccurred = r2
            return
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleObserver r7) {
            r6 = this;
            java.lang.String r0 = "observer"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "addObserver"
            r6.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r6.state
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L11
            goto L13
        L11:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
        L13:
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = new androidx.lifecycle.LifecycleRegistry$ObserverWithState
            r0.<init>(r7, r1)
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r6.observerMap
            java.lang.Object r1 = r1.mo10711(r7, r0)
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
            if (r1 == 0) goto L23
            return
        L23:
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r1 = r6.lifecycleOwner
            java.lang.Object r1 = r1.get()
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 != 0) goto L2e
            return
        L2e:
            int r2 = r6.addingObserverCounter
            r3 = 1
            if (r2 != 0) goto L3a
            boolean r2 = r6.handlingEvent
            if (r2 == 0) goto L38
            goto L3a
        L38:
            r2 = 0
            goto L3b
        L3a:
            r2 = r3
        L3b:
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            int r5 = r6.addingObserverCounter
            int r5 = r5 + r3
            r6.addingObserverCounter = r5
        L44:
            androidx.lifecycle.Lifecycle$State r3 = r0.getState()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L8f
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r6.observerMap
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L8f
            androidx.lifecycle.Lifecycle$State r3 = r0.getState()
            r6.pushParentState(r3)
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r0.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.upFrom(r4)
            if (r3 == 0) goto L74
            r0.dispatchEvent(r1, r3)
            r6.popParentState()
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            goto L44
        L74:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event up from "
            r1.append(r2)
            androidx.lifecycle.Lifecycle$State r0 = r0.getState()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L8f:
            if (r2 != 0) goto L94
            r6.sync()
        L94:
            int r7 = r6.addingObserverCounter
            int r7 = r7 + (-1)
            r6.addingObserverCounter = r7
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    @Yue.InterfaceC4418
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.state
            return r0
    }

    public int getObserverCount() {
            r1 = this;
            java.lang.String r0 = "getObserverCount"
            r1.enforceMainThreadIfNeeded(r0)
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            int r0 = r0.size()
            return r0
    }

    public void handleLifecycleEvent(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "handleLifecycleEvent"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r2 = r2.getTargetState()
            r1.moveToState(r2)
            return
    }

    @Yue.InterfaceC1816(message = "Override [currentState].")
    @Yue.InterfaceC3875
    public void markState(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "markState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.setCurrentState(r2)
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleObserver r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "removeObserver"
            r1.enforceMainThreadIfNeeded(r0)
            Yue.ۥ۠ۡۦۦ<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            r0.mo10712(r2)
            return
    }

    public void setCurrentState(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "setCurrentState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.moveToState(r2)
            return
    }
}
