package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {
    private int mAddingObserverCounter;
    private final boolean mEnforceMainThread;
    private boolean mHandlingEvent;
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> mLifecycleOwner;
    private boolean mNewEventOccurred;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> mObserverMap;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> mParentStates;
    private androidx.lifecycle.Lifecycle.State mState;

    static class ObserverWithState {
        androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        androidx.lifecycle.Lifecycle.State mState;

        ObserverWithState(androidx.lifecycle.LifecycleObserver r2, androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                r1.<init>()
                androidx.lifecycle.LifecycleEventObserver r0 = androidx.lifecycle.Lifecycling.lifecycleEventObserver(r2)
                r1.mLifecycleObserver = r0
                r1.mState = r3
                return
        }

        void dispatchEvent(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
                r2 = this;
                androidx.lifecycle.Lifecycle$State r0 = r4.getTargetState()
                androidx.lifecycle.Lifecycle$State r1 = r2.mState
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.LifecycleRegistry.min(r1, r0)
                r2.mState = r1
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mLifecycleObserver
                r1.onStateChanged(r3, r4)
                r2.mState = r0
                return
        }
    }

    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2, boolean r3) {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.FastSafeIterableMap r0 = new androidx.arch.core.internal.FastSafeIterableMap
            r0.<init>()
            r1.mObserverMap = r0
            r0 = 0
            r1.mAddingObserverCounter = r0
            r1.mHandlingEvent = r0
            r1.mNewEventOccurred = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mParentStates = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mLifecycleOwner = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r1.mState = r0
            r1.mEnforceMainThread = r3
            return
    }

    private void backwardPass(androidx.lifecycle.LifecycleOwner r8) {
            r7 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r7.mObserverMap
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            boolean r1 = r7.mNewEventOccurred
            if (r1 != 0) goto L6a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
        L1c:
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$State r4 = r7.mState
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L69
            boolean r3 = r7.mNewEventOccurred
            if (r3 != 0) goto L69
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r7.mObserverMap
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r4 = (androidx.lifecycle.LifecycleObserver) r4
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L69
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.downFrom(r3)
            if (r3 == 0) goto L4e
            androidx.lifecycle.Lifecycle$State r4 = r3.getTargetState()
            r7.pushParentState(r4)
            r2.dispatchEvent(r8, r3)
            r7.popParentState()
            goto L1c
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "no event down from "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.lifecycle.Lifecycle$State r6 = r2.mState
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L69:
            goto L6
        L6a:
            return
    }

    private androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver r5) {
            r4 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r4.mObserverMap
            java.util.Map$Entry r0 = r0.ceil(r5)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r2 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.mState
            goto L13
        L12:
            r2 = r1
        L13:
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r3 = r4.mParentStates
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2c
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r4.mParentStates
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r3 = r4.mParentStates
            int r3 = r3.size()
            int r3 = r3 + (-1)
            java.lang.Object r1 = r1.get(r3)
            androidx.lifecycle.Lifecycle$State r1 = (androidx.lifecycle.Lifecycle.State) r1
            goto L2d
        L2c:
        L2d:
            androidx.lifecycle.Lifecycle$State r3 = r4.mState
            androidx.lifecycle.Lifecycle$State r3 = min(r3, r2)
            androidx.lifecycle.Lifecycle$State r3 = min(r3, r1)
            return r3
    }

    public static androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner r2) {
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private void enforceMainThreadIfNeeded(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.mEnforceMainThread
            if (r0 == 0) goto L2e
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto Lf
            goto L2e
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " must be called on the main thread"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            return
    }

    private void forwardPass(androidx.lifecycle.LifecycleOwner r8) {
            r7 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r7.mObserverMap
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r0 = r0.iteratorWithAdditions()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            boolean r1 = r7.mNewEventOccurred
            if (r1 != 0) goto L68
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
        L1c:
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$State r4 = r7.mState
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L67
            boolean r3 = r7.mNewEventOccurred
            if (r3 != 0) goto L67
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r7.mObserverMap
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r4 = (androidx.lifecycle.LifecycleObserver) r4
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L67
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            r7.pushParentState(r3)
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.upFrom(r3)
            if (r3 == 0) goto L4c
            r2.dispatchEvent(r8, r3)
            r7.popParentState()
            goto L1c
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "no event up from "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.lifecycle.Lifecycle$State r6 = r2.mState
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L67:
            goto L6
        L68:
            return
    }

    private boolean isSynced() {
            r4 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r4.mObserverMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r4.mObserverMap
            java.util.Map$Entry r0 = r0.eldest()
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            androidx.lifecycle.Lifecycle$State r0 = r0.mState
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r4.mObserverMap
            java.util.Map$Entry r2 = r2.newest()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.mState
            if (r0 != r2) goto L2d
            androidx.lifecycle.Lifecycle$State r3 = r4.mState
            if (r3 != r2) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
    }

    static androidx.lifecycle.Lifecycle.State min(androidx.lifecycle.Lifecycle.State r1, androidx.lifecycle.Lifecycle.State r2) {
            if (r2 == 0) goto La
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            return r0
    }

    private void moveToState(androidx.lifecycle.Lifecycle.State r4) {
            r3 = this;
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            if (r0 != r4) goto L5
            return
        L5:
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 != r1) goto L2b
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 == r0) goto L10
            goto L2b
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event down from "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.lifecycle.Lifecycle$State r2 = r3.mState
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2b:
            r3.mState = r4
            boolean r0 = r3.mHandlingEvent
            r1 = 1
            if (r0 != 0) goto L4d
            int r0 = r3.mAddingObserverCounter
            if (r0 == 0) goto L37
            goto L4d
        L37:
            r3.mHandlingEvent = r1
            r3.sync()
            r0 = 0
            r3.mHandlingEvent = r0
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L4c
            androidx.arch.core.internal.FastSafeIterableMap r0 = new androidx.arch.core.internal.FastSafeIterableMap
            r0.<init>()
            r3.mObserverMap = r0
        L4c:
            return
        L4d:
            r3.mNewEventOccurred = r1
            return
    }

    private void popParentState() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.mParentStates
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r2.mParentStates
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    private void pushParentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r1.mParentStates
            r0.add(r2)
            return
    }

    private void sync() {
            r4 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r4.mLifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L4f
        La:
            boolean r1 = r4.isSynced()
            r2 = 0
            if (r1 != 0) goto L4c
            r4.mNewEventOccurred = r2
            androidx.lifecycle.Lifecycle$State r1 = r4.mState
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r4.mObserverMap
            java.util.Map$Entry r2 = r2.eldest()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.mState
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L2c
            r4.backwardPass(r0)
        L2c:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r4.mObserverMap
            java.util.Map$Entry r1 = r1.newest()
            boolean r2 = r4.mNewEventOccurred
            if (r2 != 0) goto L4b
            if (r1 == 0) goto L4b
            androidx.lifecycle.Lifecycle$State r2 = r4.mState
            java.lang.Object r3 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r3 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r3
            androidx.lifecycle.Lifecycle$State r3 = r3.mState
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L4b
            r4.forwardPass(r0)
        L4b:
            goto La
        L4c:
            r4.mNewEventOccurred = r2
            return
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver r11) {
            r10 = this;
            java.lang.String r0 = "addObserver"
            r10.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r10.mState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Le
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            goto L10
        Le:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
        L10:
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = new androidx.lifecycle.LifecycleRegistry$ObserverWithState
            r1.<init>(r11, r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r10.mObserverMap
            java.lang.Object r2 = r2.putIfAbsent(r11, r1)
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            if (r2 == 0) goto L20
            return
        L20:
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r3 = r10.mLifecycleOwner
            java.lang.Object r3 = r3.get()
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            if (r3 != 0) goto L2b
            return
        L2b:
            int r4 = r10.mAddingObserverCounter
            r5 = 1
            if (r4 != 0) goto L37
            boolean r4 = r10.mHandlingEvent
            if (r4 == 0) goto L35
            goto L37
        L35:
            r4 = 0
            goto L38
        L37:
            r4 = r5
        L38:
            androidx.lifecycle.Lifecycle$State r6 = r10.calculateTargetState(r11)
            int r7 = r10.mAddingObserverCounter
            int r7 = r7 + r5
            r10.mAddingObserverCounter = r7
        L41:
            androidx.lifecycle.Lifecycle$State r7 = r1.mState
            int r7 = r7.compareTo(r6)
            if (r7 >= 0) goto L84
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r7 = r10.mObserverMap
            boolean r7 = r7.contains(r11)
            if (r7 == 0) goto L84
            androidx.lifecycle.Lifecycle$State r7 = r1.mState
            r10.pushParentState(r7)
            androidx.lifecycle.Lifecycle$State r7 = r1.mState
            androidx.lifecycle.Lifecycle$Event r7 = androidx.lifecycle.Lifecycle.Event.upFrom(r7)
            if (r7 == 0) goto L69
            r1.dispatchEvent(r3, r7)
            r10.popParentState()
            androidx.lifecycle.Lifecycle$State r6 = r10.calculateTargetState(r11)
            goto L41
        L69:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "no event up from "
            java.lang.StringBuilder r8 = r8.append(r9)
            androidx.lifecycle.Lifecycle$State r9 = r1.mState
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5.<init>(r8)
            throw r5
        L84:
            if (r4 != 0) goto L89
            r10.sync()
        L89:
            int r7 = r10.mAddingObserverCounter
            int r7 = r7 - r5
            r10.mAddingObserverCounter = r7
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.mState
            return r0
    }

    public int getObserverCount() {
            r1 = this;
            java.lang.String r0 = "getObserverCount"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.mObserverMap
            int r0 = r0.size()
            return r0
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            java.lang.String r0 = "handleLifecycleEvent"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r2.getTargetState()
            r1.moveToState(r0)
            return
    }

    @java.lang.Deprecated
    public void markState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "markState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.setCurrentState(r2)
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.mObserverMap
            r0.remove(r2)
            return
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "setCurrentState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.moveToState(r2)
            return
    }
}
